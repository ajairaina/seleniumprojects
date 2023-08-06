package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotations {
  @Test
  public void Test() {
	  
	  System.out.println("For Method Testing");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("This is my before method area");
  }
  
  @AfterMethod
  public void Aftermethod() {
	  System.out.println("This is my after method area");
  }
}
