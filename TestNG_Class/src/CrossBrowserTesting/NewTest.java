package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
	
	String actualtitle = "About Selenium | Selenium";
	
	
  @Test (enabled = true)
  public void Testcases() {
	  
	  driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).click();
	  
	  String title = driver.getTitle();
	  System.out.println("Current title = " + title);
	  
	  Assert.assertEquals(title, actualtitle);  
	   }
  
  @Test (enabled = true)  //this testcase is depend on above test case.
  public void Testcases1() {
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p/a[1]")).click();
	 /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div/main/div[1]/div[3]/div/div[1]/h2/a[1]")).click(); */
	  
	  String title1 = driver.getTitle();
	  System.out.println("Current title = " + title1);
}
  
  @Test (enabled = true)
  public void Testcases3() {
	  
	  driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/main/div[1]/div[2]/table/tbody/tr[1]/td[2]/a")).click();
	  driver.navigate().back();
  }
  
   @BeforeClass (alwaysRun = true)
   @Parameters("browser")
  public void Driverproperty(String browser) {
	 /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestNG_Class\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();*/
	   
	   //used webdriver manager api insteaad of system.setproprty
	 /*  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();*/
	   
	   if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else if (browser.equalsIgnoreCase("IE")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	   
	   
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


