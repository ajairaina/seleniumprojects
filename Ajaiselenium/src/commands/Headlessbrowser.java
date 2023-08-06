package commands;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);          // for making browser headless
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/"); 
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of the page = " + title);
		
		driver.close();
		
		
		
	}

}
