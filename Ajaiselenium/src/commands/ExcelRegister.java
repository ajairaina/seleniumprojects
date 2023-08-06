package commands;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelRegister {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream(""
				+ "");  //getting data from the excel sheet
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  //get the workbook instance for xls file
		
		XSSFSheet sheet = wb.getSheet("Sheet1"); //get first sheet from the workbook
		
		int NoofRows=sheet.getLastRowNum();   //get first Row from the sheet
		
		System.out.println("No. of records in the sheet = " + NoofRows);
		
		for(int row =1;row<NoofRows;row++) {
			
			XSSFRow Currentrow=sheet.getRow(row);
			String First_Name =Currentrow.getCell(0).toString();
			String Last_Name =Currentrow.getCell(1).toString();
			String phone =Currentrow.getCell(2).toString();
			String Email =Currentrow.getCell(3).toString();
			String Address =Currentrow.getCell(4).toString();
			String City =Currentrow.getCell(5).toString();
			String state =Currentrow.getCell(6).toString();
			String postelcode =Currentrow.getCell(7).toString();
			String country =Currentrow.getCell(8).toString();
			String username =Currentrow.getCell(9).toString();
			String password =Currentrow.getCell(10).toString();
			
			driver.findElement(By.linkText("REGISTER")).click(); //Registration process
			
		//Entering contact information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
		//Entering   Mailing Information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(postelcode);
			
		//Country field
			WebElement county = driver.findElement(By.name("country"));
			Select select = new Select(county);
			select.selectByVisibleText(country);
			
			//Entering User Information
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("confirmPassword")).sendKeys(password);
			
			//submit
			driver.findElement(By.name("submit")).click();
			
			//verification
			if(driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("Registeration completed for "+ row + "record");
			}else {
				System.out.println("Registeration Failed for "+ row + "record");
			}
				
		}
		   
		System.out.println("Data Driven Test Completed");
		
		driver.close();
		driver.quit();
		file.close();
		
	}

}
