package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-hover.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement MH = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement cl= driver.findElement(By.xpath("/html/body/ul/li[2]"));
		act.moveToElement(MH).click(cl).build().perform();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.quit();
		

	}

}
