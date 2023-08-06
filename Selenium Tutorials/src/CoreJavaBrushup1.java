import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe")		;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");	*/
		
	//1.java variables
		int myNum = 5;
		String website = "arun";
		char letter = 'r';
		double dec = 5.9;
		boolean mycard = true;
		
		//2.arrays
		
		/* int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//int[] arr2= {1,2,3,4,5,6};
		
		//System.out.println(arr2[5]);
		
		for (int i=0 ; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		} */
		
		//3.if else
		
		/*int[] arr2= {1,2,3,4,5,6};
		for (int i=0 ; i<arr2.length; i++) 
		{
			if (arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
		
		else {
			System.out.println(arr2[i]+"is not multiple of 2");
		}
	}*/
		
		//4.split string - reverse print
	String s="Arun Kumar Keertha";
	String[] splittedstring=s.split(" ");
	System.out.println(splittedstring[2]);
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}
}
