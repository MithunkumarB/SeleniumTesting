package Testng;

import org.testng.annotations.Test;

public class Skiptestcase {
	
	// WE USE ENABLED = FALSE TYPE
	// THIS IS USED FOR SKIP THE PARTICULAR TEST CASE
	// BY DEFAULT ENABLED VALUE IS TRUE.
	
	@Test(priority = 1)
	public void startthecar()
	{
		System.out.println("Start the Car");
	}
	@Test(priority = 2)
	public void putFirstGrear()
	{
		System.out.println("Put First gear");
	}
	@Test(priority = 3)
	public void putSecondGrear()
	{
		System.out.println("Put Second gear");
	}
	@Test(priority = 4)
	public void putThirdGrear()
	{
		System.out.println("Put Third gear");
	}
	@Test(priority = 5,enabled = false)
	public void putFourthGrear()
	{
		System.out.println("Put Fourth gear");
	}

}
