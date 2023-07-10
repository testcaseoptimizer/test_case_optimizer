package test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test_case_Auto_Bank_Cricket_Jee_QK_seller
{
  String url="http://localhost:8081/Jacoco1/";
  
  By go_home=By.xpath("/html/body/a");
  By all_link=By.xpath("/html/body/div/a");
  
  @Test
  public void check_test()
  {
    System.out.println("Starting checked Test");
		// create driver
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// sleep for 1 sec
		sleep();
		driver.manage().window().maximize();
		//open test page
		open_browser(driver);
		sleep();
		
      show_automation(driver);	
		
  }
  public void open_browser(WebDriver driver)
	{
		driver.get(url);
	}
	public static void sleep()
	{
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void show_automation(WebDriver driver) {
	    List<WebElement> all = driver.findElements(all_link);
	   
	    all.remove(0);
	    for(int i=0;i<=1;i++)
	    {
	    	all.remove(2);
	    }
	    for(int j=1;j<=7;j++)
	    {
	    	all.remove(6);
	    }
	    int size = all.size();
	    for (int i = 0; i < size; i++) {
	        List<WebElement> refreshedAll = driver.findElements(all_link);
	        refreshedAll.remove(0);
		    for(int j=0;j<=1;j++)
		    {
		    	refreshedAll.remove(2);
		    }
		    for(int j=1;j<=7;j++)
		    {
		    	refreshedAll.remove(6);
		    }
	        WebElement element = refreshedAll.get(i);
	        
	        element.click();
	        sleep();
	        
	        driver.findElement(go_home).click();
	        sleep();
	    }
	    
	    driver.quit();
	}
} 



