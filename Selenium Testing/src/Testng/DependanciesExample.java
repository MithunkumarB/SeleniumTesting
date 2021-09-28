package Testng;

import org.testng.annotations.Test;

public class DependanciesExample {
	
	
	// EXAMPLE: YOU NOT ABLE TO ENTER INTO THE PARTICULAR(AMAZON) WEBSITE MEANS = YOU ARE NOT ABLE TO PURCHACE
	// HERE SAME YOU ARE NOT COMPLETE HIGHSCHOOL MEANS NOT ABLE TO COMPLETE ENGINEERING.
	// IN CASE HIGHSCHOOL = FAIL (enabled = false)
	// OTHER METHODS DEPONDS ON HIGHSCHOOL METHOD - SO NOT ABLE TO COMPLETE - GETTING ERROR
	
	@Test(enabled = false)
	public void HighSchool()
	{
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSconderySchool()
	{
		System.out.println("Higher Scondery School");
	}
	
	@Test(dependsOnMethods = "HigherSconderySchool")
	public void Engineering()
	{
		System.out.println("Engineering");
	}
	
}
