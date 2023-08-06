package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("flipkart"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Flipkart")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone13"+Keys.ENTER);
		
		String oldWindow= driver.getWindowHandle();
		driver.findElement(By.className("_4rR01T")).click();
		
		Set<String> handles= driver.getWindowHandles();
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement price= driver.findElement(By.cssSelector("div[class='_30jeq3 _16Jk6d']"));
		String phoneprice= price.getText();
		System.out.println("Iphone price:"+phoneprice);
	
	
	}
	
	

}
