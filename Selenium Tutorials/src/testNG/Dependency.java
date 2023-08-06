package testNG;

import org.testng.annotations.Test;

public class Dependency {

	@Test(enabled = false)
	public void highschool() {
		System.out.println("High school");
	}
	
@Test	(dependsOnMethods = "highschool")
	public void highersecondary() {
	System.out.println("12th");
}

@Test(dependsOnMethods = "highersecondary")
	public void college() {
		System.out.println("college");
	}

}