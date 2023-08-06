package FiledownloadAndUpload;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//*[@id='pdfbox'])")).sendKeys("PDF Testing");
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
