package Testng;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;


public class Parametarizationexample {
	
	
	// PARAMETARIZATION IS USED FOR - GETING INPUT FROM RUNTIME
	// SO WE USE @parameters ANNOTATIONS
	// WE PASS THE PARAMETER NAME AND VALUE AND GET HERE
	// AND STORE THE VALUE IN STRING PARAMETER
	
	@Test
	@Parameters("Enter Name")
	public void printname(String name)
	{
		System.out.println("The Name is:" + name);
	}

}
