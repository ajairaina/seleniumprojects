package FiledownloadAndUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div/div[3]/div[2]")).click();
		
		//autoit step
		Runtime.getRuntime().exec("Desktop\\driver\\Autoit\\fileuploadscript.exe"+ "" +
				"C:\\Users\\DELL\\Pictures\\Saved Pictures\\sports-car-wallpaper-pictures");
	}

}
