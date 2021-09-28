package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsexample {
	
	
	// HERE WE ARE EXECUTE ALL ANNOTATIONS IN TESTNG
	// ANNOTATIONS EXECUTION ORDER IS = [ BSUITE-->BTEST-->BCLASS-->BMETHOD ] [AMETHOD-->ACLASS-->ATEST-->ASUITE]
	// WE USE MULTIPLE @TEST USE AT THE TIME - EVERY TEST BEFORE AND AFTER METHOD EXEUTE [ BMETHOD-->TEST-->AMETHOD]
	
	@Test
	public void Test()
	{
		System.out.println("I am Test");
	}
	
	/*
	 * @Test public void Test2() { System.out.println("I am Test2"); }
	 */
	
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("I am Beforesuite");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("I am Aftersuite");
	}
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("I am Beforeclass");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("I am Afterclass");
	}
	
	@BeforeTest
	public void Befortest()
	{
		System.out.println("I am Befortest");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("I am Aftertest");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("I am Beforemethod");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("I am Aftermethod");
	}
	
}
