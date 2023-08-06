package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotations {
	
  @Test
  public void Test() {
	  System.out.println("This is my test Area");
  }
  
  @BeforeClass
  public void beforeclass(){
	  System.out.println("This is my first class");
  }
  
  @AfterClass
  public void Afterclass() {
	  System.out.println("This is my second class");
  }
}
