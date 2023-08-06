package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver = null;
	
  @Test
  public void Test1() {
	  System.out.println("Test1 Execution " + Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("WWW.google.com");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test2 Execution " + Thread.currentThread().getId());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("WWW.gmail.com");
  }
  
}
