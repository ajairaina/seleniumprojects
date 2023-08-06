package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		driver.switchTo().frame(0);  //that element is situated in frame
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\'slider\']/span"));
		
		act.moveToElement(slider).dragAndDropBy(slider, 200, 0).build().perform(); //drag the slider based on the values
		
		
		driver.quit();
	}

}
