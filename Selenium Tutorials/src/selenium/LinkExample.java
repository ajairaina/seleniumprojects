package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Link.html");
	    driver.findElement(By.partialLinkText("Go to")).click();
	    driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]")).click();
	    
	    WebElement emailbox= driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    emailbox.sendKeys("arun@gmail.com");
	    
	    WebElement appendbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	    appendbox.sendKeys("and run");
	    
	    WebElement gettextbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	    String value = gettextbox.getAttribute("value");
	    System.out.println(value);
	    
	    WebElement clearbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	    clearbox.clear();
	    
	    WebElement disabledbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	    Boolean enabled= disabledbox.isEnabled();
	    System.out.println(enabled);
	    
	   //driver.get("https://www.google.com/search?q=amazon&rlz=1C1CHBD_enIN976IN976&oq=amazon&aqs=chrome..69i57.2161j0j4&sourceid=chrome&ie=UTF-8");
	   //driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div[1]/a/div[1]/span")).click();
	   
	   //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes"+Keys.ENTER);
	    
	    
	}


}
