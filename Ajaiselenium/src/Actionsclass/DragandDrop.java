package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement sourceEle = driver.findElement(By.id("box7"));
		WebElement targetele = driver.findElement(By.id("box107"));
		
		act.clickAndHold(sourceEle).moveToElement(targetele).release().build().perform();
		
		WebElement sourceEle1 = driver.findElement(By.id("box3"));
		WebElement targetele1 = driver.findElement(By.id("box103"));
		
		act.dragAndDrop(sourceEle1, targetele1).build().perform();  //another method for drag and drop
		
		driver.quit();
		
	}

}
