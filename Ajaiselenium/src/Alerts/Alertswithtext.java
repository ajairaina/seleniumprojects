package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertswithtext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Ajaiselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		driver.manage().window().maximize();
		
		String exp_value ="Hello ajai How are you today";
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		Text.click();
		//Thread.sleep(3000);
		 driver.switchTo().alert().sendKeys("ajai");
		// Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		String act_value = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(exp_value.equals(act_value)==true) {
			System.out.println("Test Passed");
		}
		
		driver.close();
	}

}
