package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Dropdown.html");
		
	    WebElement dropdow1=driver.findElement(By.id("dropdown1"));
	    Select select=new Select(dropdow1);
	    select.selectByIndex(4);
	    
	    List<WebElement>listofoptions= select.getOptions();
	  int size= listofoptions.size();
	  System.out.println("no.of elements:"+size);
	  
	  dropdow1.sendKeys("U");
	  
	  WebElement multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	  Select multiselectbox=new Select(multiselect);
	  
	  multiselectbox.selectByIndex(1);
	  multiselectbox.selectByIndex(2);
	  multiselectbox.selectByIndex(3);
	}

	
}
