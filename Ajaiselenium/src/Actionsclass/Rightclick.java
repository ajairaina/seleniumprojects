package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(rc).build().perform(); //right click of the element
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();  //element copy 
		System.out.println(driver.switchTo().alert().getText()); 
		
		driver.quit();

	}

}
