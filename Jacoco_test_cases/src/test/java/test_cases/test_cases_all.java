package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
import org.openqa.selenium.WebElement;

public class test_cases_all
{
  String url="http://localhost:8081/Jacoco1/";
  
  By all_link=By.xpath("/html/body/div/a");
  By go_home=By.xpath("/html/body/a");
  
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
	    int size = all.size();
	    
	    for (int i = 0; i < size; i++) {
	        List<WebElement> refreshedAll = driver.findElements(all_link);
	        WebElement element = refreshedAll.get(i);
	        
	        element.click();
	        sleep();
	        
	        driver.findElement(go_home).click();
	        sleep();
	    }
	    
	    driver.quit();
	}


} 



