package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/"); //open the url
		driver.manage().window().maximize();
		
		String title = driver.getTitle(); // returns the title of the page
		System.out.println("Title of the page = "  + title); 
		
		String Url = driver.getCurrentUrl();   //returns the url
		System.out.println("URL of the page = " + Url);
		
		String text = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println("Text of the element = "  + text);
		
		driver.close();
		
		
		
		
	}

}
