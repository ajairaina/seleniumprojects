package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertswithokAndCancel {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Ajaiselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		String exp_value = "User Clicked : OK";
		
		WebElement clickok =driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
		clickok.click();
		
		driver.switchTo().alert().accept();
		
	String act_value = driver.findElement(By.xpath("(//span[text()='User Clicked : Cancel'])")).getText();
		
		
		if (exp_value.contains(act_value)==true) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		driver.close();
	}

}
