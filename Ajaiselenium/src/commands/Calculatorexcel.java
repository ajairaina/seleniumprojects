package commands;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculatorexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-"
				+ "calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\driver\\Calculatordata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int Rowcount = sheet.getLastRowNum();
		
		for(int i=1;i<Rowcount;i++) {
			XSSFRow currentrow = sheet.getRow(i);
			
			XSSFCell princi = currentrow.getCell(0);
			int principle = (int)princi.getNumericCellValue();//typecasting
			
			XSSFCell rateofint = currentrow.getCell(1);
			int Roi = (int)rateofint.getNumericCellValue();
			
			XSSFCell per = currentrow.getCell(1);
			int period = (int)per.getNumericCellValue();
			
			XSSFCell mv = currentrow.getCell(1);
			int Maturityvalue = (int)mv.getNumericCellValue();
			
			//sendkeys wont available numerical value
			//string.valueof == used for passing text to numerical
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle)); //used for sending numerical values
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(Roi));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			WebElement periodcount = driver.findElement(By.id("tenurePeriod"));
			Select select  = new Select(periodcount);
			select.selectByVisibleText("year(s)");
			
			Select freq = new Select(driver.findElement(By.id("frequency"))) ;
			freq.selectByValue("0");
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			//to verify the maturity value
			String act_mvalue =driver.findElement(By.xpath("//*[@id=\"resp_matval\"]")).getText();
			
			//string to integer --> integer.parseint()
			//string to double --> double.parsedouble()
			
			if ((Double.parseDouble(act_mvalue))==Maturityvalue){
				System.out.println("Test Passed");
			}else {
				System.out.println("Test failed");
			}
			System.out.println("Data Driven Test completed");
		}
		
		  driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		driver.close();
		
		
		
		
	}
}
