package Testng;

import org.testng.annotations.Test;

public class GroupingExample {
	
	
	// HERE WE NEED ONLY EXECUTE VIVO AND MOTO BRANDS ONLY.
	// SO WE GIVE GROUP NAME TO ALL METHODS.
	// THEN RUN IN TESTNG.XML FILE
	// <group>--> <run>--> <include> or <exclude>  WE CAN USE.
	
	
	@Test(groups = {"APPLE"})
	public void Apple1()
	{
		System.out.println("Apple Testing");
	}
	@Test(groups = {"APPLE"})
	public void Apple2()
	{
		System.out.println("Apple Testing");
	}
	@Test(groups = {"VIVO"})
	public void Vivo1()
	{
		System.out.println("Vivo Testing");
	}
	@Test(groups = {"VIVO"})
	public void Vivo2()
	{
		System.out.println("Vivo Testing");
	}
	@Test(groups = {"MOTO"})
	public void Moto1()
	{
		System.out.println("Moto Testing");
	}
	@Test(groups = {"MOTO"})
	public void Moto2()
	{
		System.out.println("Moto Testing");
	}
	@Test(groups = {"REDMI"})
	public void Redmi1()
	{
		System.out.println("Redmi Testing");
	}
	@Test(groups = {"REDMI"})
	public void Redmi2()
	{
		System.out.println("Redmi Testing");
	}
}
