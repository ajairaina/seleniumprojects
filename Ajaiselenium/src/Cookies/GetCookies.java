package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//capture all the cookies from the browser
		Set<Cookie> Cks = driver.manage().getCookies(); //cookie type	
		System.out.println("Size of cookies=" + Cks.size()); //print size of the cookies
		
		//read and print all the cookies
		for(Cookie cookie:Cks) {
			System.out.println((cookie.getName()+ ":"+ cookie.getValue())); //print name and value of the cookies
			
			Thread.sleep(2000);
			 
			 driver.quit();
		}
	}

}
