package test_cases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import org.openqa.selenium.WebElement;

public class db_connection{
    int sr_no;
	String url="file:///D:/apache-tomcat-9.0.76-windows-x64/apache-tomcat-9.0.76/jacoco/report/com.luv2code.servletdemo.mvctwo/index.html";
	By body_table_elements=By.xpath("//*[@id=\"coveragetable\"]/tbody/tr/td/a");
	By missed_column_for_elements = By.xpath("//*[@id=\"coveragetable\"]/tbody/tr/td[contains(@id,'l')]");
	List<String> data = new ArrayList<>();
	@Test
	public void record_data(String testCaseName) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> item = driver.findElements(body_table_elements);
		System.out.println(item.size());
		List<WebElement> missed=driver.findElements(missed_column_for_elements);
		int length=item.size();
		System.out.println("The file names:");
		for(int i=0;i<length;i++)
		{
			if(missed.get(i).getText().equals("0"))
			{
				data.add(item.get(i).getText());
			}
		}
		connection_accomplish(data,testCaseName);
		
		driver.quit();
	}
	public  static void connection_accomplish(List<String> data,String testCaseName) throws Exception
	{
		Connection con=null;
		String url1 = "jdbc:mysql://localhost:3306/jacoco";
		String driver1="com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "pass123";

        Class.forName(driver1).isInstance(null);
        con=DriverManager.getConnection(url1,username,password);
        
        System.out.println("Connection Established Successfully"+data.size());
        
        
       if(testCaseName.equals("test_case_all_except_Auto_Bank_Tour_guide"))
       {
        for(int i=0;i<data.size();i++)
        {
        	
        	PreparedStatement ps = con.prepareStatement("INSERT INTO `jacoco`.`test_case1`(`SR_NO`,`class_name`,`test_case_name`) VALUES ("
        	        + (i+1) + ", '" + data.get(i) + "','" + testCaseName + "')");
        	ps.executeUpdate();
        }
       }
       else
       {
    	   ResultSet rs = null;
    	   String maxSrNoQuery = "SELECT MAX(SR_NO) FROM jacoco.test_case1";
           PreparedStatement stmt = con.prepareStatement(maxSrNoQuery);
           rs = stmt.executeQuery();

           int maxSrNo = 0;
           if (rs.next()) {
               maxSrNo = rs.getInt(1);
           }
           int newSrNo = maxSrNo;
           for(int i=0;i<data.size();i++)
           {
           	
           	PreparedStatement ps = con.prepareStatement("INSERT INTO `jacoco`.`test_case1`(`SR_NO`,`class_name`,`test_case_name`) VALUES ("
           	        + (newSrNo+1) + ", '" + data.get(i) + "','" + testCaseName + "')");
           	ps.executeUpdate();
           	newSrNo++;
           }
           
           
       }
	}
}
	
	
	