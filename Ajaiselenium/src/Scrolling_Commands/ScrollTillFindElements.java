package Scrolling_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//scrolling page till we find the element india
		WebElement flag =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		js.executeScript("arguments[0].scrollIntoView();",flag);
		
		driver.close();
		
	}

}
