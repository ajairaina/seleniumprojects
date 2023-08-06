package commands;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// wait time for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open webpage
		driver.get("https://demo.guru99.com/test/newtours/"); 
		Thread.sleep(3000);
		
		//capture the links
		List<WebElement> Links= driver.findElements(By.linkText("a"));
		System.out.println(Links.size());  // findout number of links
		
		for(int i=0;i<Links.size();i++){	
			
			//by using href property we can attribute for the url
			
			WebElement element = Links.get(i);
			String URl = element.getAttribute("href");
			
			URL link = new URL(URl);
			
			//create a connection using url object 'link'
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			connection.connect();
			
			int responcode = connection.getResponseCode(); //return responsecode : broken linkshould not under200
			if (responcode>=400) {
				System.out.println("Link is working fine");
			}
			driver.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
