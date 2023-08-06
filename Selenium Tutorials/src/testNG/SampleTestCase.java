package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {

	@Test(priority = 1)
	public void firstTestCase() {
		System.out.println("This is first case");
	}
	
	@Test(priority = 2)
	public void secondTestCase() {
		System.out.println("This is second case");
	}
	
	@Test(priority = 3,enabled = false)
	public void thirdTestCase() {
		System.out.println("This is third case");
	}
	
	@Test(priority = 4)
	public void fourthTestCase() {
		System.out.println("This is fourth case");
	}
	
	
}
