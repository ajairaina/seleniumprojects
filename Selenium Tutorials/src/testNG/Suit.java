package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Suit {

WebDriver driver;	
long starttime;
long endtime;


	@BeforeSuite
	public void launchbrowser() {
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
	     driver=new ChromeDriver();
	}
	
	
	@Test
	public void opengoogle() {
		
	    driver.get("https://www.google.co.in/");
	    
	}	

	@Test
public void openbing() {
		
	    driver.get("https://www.bing.com/");
	    
}

	@Test
public void openyahoo() {
		
	    driver.get("https://in.search.yahoo.com/?fr2=inr");
	    
}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println("total time taken:"+totaltime);
	}
}

	
	