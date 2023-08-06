package TestNGMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnGroups {
	WebDriver driver;
	String actualtitle = "About Selenium | Selenium";
	
	
  @Test (groups = "Smoke")
  public void Testcases() {
	  
	  driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).click();
	  
	  String title = driver.getTitle();
	  System.out.println("Current title = " + title);
	  
	  Assert.assertEquals(title, actualtitle);  
	   }
  
  @Test (dependsOnGroups = "Smoke", groups = "sanity")  //this testcase is depend on above test case.
  public void Testcases1() {
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p/a[1]")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div/main/div[1]/div[3]/div/div[1]/h2/a[1]")).click();
	  
	  String title1 = driver.getTitle();
	  System.out.println("Current title = " + title1);
}
  
  @Test (dependsOnGroups = "sanity",groups = "Functional")
  public void Testcases3() {
	  
	  driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/main/div[1]/div[2]/table/tbody/tr[1]/td[2]/a")).click();
	  driver.navigate().back();
  }
  
   @BeforeClass (alwaysRun = true)
  public void Driverproperty() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.selenium.dev/");
  }
  
  @AfterClass (alwaysRun = true)
  public void Driverclose() {
	  driver.close();
  }
  
  
}

