package Scrolling_Commands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltoBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//scroll till bottom
		js.executeScript("window.ScrollTo(0,document.body.scrollHeight)");
		
		driver.close();
	}

}
