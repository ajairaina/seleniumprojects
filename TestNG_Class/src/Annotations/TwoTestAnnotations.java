package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwoTestAnnotations {
	@Test
	  public void Test() {
		  System.out.println("I am first test");
	  }
	  
	@Test
	public void Test2() {
		System.out.println("I am second test");
	}
	  @BeforeSuite
	  public void beforesuite() {
		  System.out.println("I am before suite");
	  }
	  
	  @AfterSuite
	  public void Aftersuite() {
		  System.out.println("I am After suite");
	  }
	  
	  @BeforeMethod
	  public void Beforemethod() {
		  System.out.println("I am before Method");
	  }
	  
	  @AfterMethod
	  public void AfterMethod() {
		  System.out.println("I am After Method");
	  }
	  
	  @BeforeClass
	  public void BeforeClass() {
		  System.out.println("I am before class");
	  }
	  
	  @AfterClass
	  public void Afterclass() {
		  System.out.println("I am After class");
	  }
	  
	  @BeforeTest
	  public void BeforeTest() {
		  System.out.println("I am before Test");
	  }
	  
	  @org.testng.annotations.AfterTest
	  public void AfterTest() {
		  System.out.println("I am After Test");
	  
	  }
	}
