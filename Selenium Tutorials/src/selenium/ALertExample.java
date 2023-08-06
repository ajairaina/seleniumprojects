package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium Tutorials\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Alert.html");
		
	    //alertbox
	    WebElement alertbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//confirm box
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbox.click();
		
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.dismiss();
		
		//promtbox
		WebElement promtbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promtbox.click();
		
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Arun");
		promptAlert.accept();
		
		
	    
	}

}
