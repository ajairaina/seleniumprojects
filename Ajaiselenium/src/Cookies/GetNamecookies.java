package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNamecookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookie = driver.manage().getCookies();
		System.out.println("size of the Cookies=" + cookie.size());
		
		//get the cookies by thier name 
		 System.out.println(driver.manage().getCookieNamed("session-id"));
		 Thread.sleep(2000);
		 
		 driver.quit();
	}

}
