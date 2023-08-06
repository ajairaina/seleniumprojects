package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AddcookieToBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//capture all the cookies from the browser
		Set<Cookie> Cks = driver.manage().getCookies(); //cookie type	
		System.out.println("Total Size of cookies=" + Cks.size());
		//create an object for new cookie
		Cookie Cookieobject = new Cookie("my-cookie-added", "cx5escsysus%vdxvg");
		driver.manage().addCookie(Cookieobject); //add the cookie in webdriver
		Cks = driver.manage().getCookies();
		
		for(Cookie cookie:Cks) {
			System.out.println(cookie.getName()+ ":" +cookie.getValue());
		}
		
		System.out.println("size of newly added cookie=" + Cks.size());  //check the size of new cookie
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
