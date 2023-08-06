package Alerts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsok {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Ajaiselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		String exp_value = "You have successfully clicked an alert";
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		String Act_value = driver.findElement(By.xpath("//*[@id=\"simple_result\"]")).getText();
		 Thread.sleep(2000);
		if (exp_value.equals(Act_value)==true){
			System.out.println("Test is passed");
		}
		  driver.close(); 
		  
	}

}
