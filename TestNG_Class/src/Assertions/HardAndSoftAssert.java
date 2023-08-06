package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	
	WebDriver driver =null;
	
  @Test(priority = 2, enabled = false)
  public void Test1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  //hard assert - if condition fails,script won't execute
	   driver.get("https://www.google.com");
	   String Actual_Value = driver.getTitle();
	  Assert.assertEquals(Actual_Value, "google");
	  
	  driver.navigate().refresh();
	  driver.close();
  }
  
  
  @Test(priority = 1)
  public void Test2() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.Google.com");
	  
	  //Hard assert - if condition pass,script Will execute
	   driver.get("https://www.google.com");
	   String Actual_Value = driver.getTitle();
	  SoftAssert softAssertions = new SoftAssert();
	  softAssertions.assertEquals(Actual_Value, "google");
	  
	  driver.navigate().refresh();
	  driver.close();
  }
  
}
