package Scrolling_Commands;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPixels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//1.Scrolling using pixel
		js.executeScript("window.scrollBy(0,1000)","");
		
		driver.close();
	}

}
