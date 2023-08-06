package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\driver\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Window.html");
		
	   String oldwindow= driver.getWindowHandle();
	   
	   WebElement firstButton= driver.findElement(By.id("home"));
	   firstButton.click();
	   
	   Set<String> handles=driver.getWindowHandles();
	   
	   for (String newWindow : handles) {
		driver.switchTo().window(newWindow);
	}
	    
	   WebElement editbox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	   editbox.click();
	   driver.close();
	   
	   driver.switchTo().window(oldwindow);
	   
	   WebElement openmultiple=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	   openmultiple.click();
	   
	  int noofwindows= driver.getWindowHandles().size();
	  System.out.println("count:"+noofwindows);
	   
	  
	  WebElement dontclose=driver.findElement(By.id("color"));
	  dontclose.click();
	  
	 Set<String> newwindowhandles= driver.getWindowHandles();
	 
	 for (String allwindows : newwindowhandles) {
		if (!allwindows.equals(oldwindow)) {
			driver.switchTo().window(allwindows);
			driver.close();
		}
	}
		
		 
		
	
	   
	}

}
