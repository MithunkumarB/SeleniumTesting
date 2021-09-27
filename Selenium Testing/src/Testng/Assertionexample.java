package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertionexample {
	
	// ACCERTIOM IS BASICALLY USE FOR UNIT TESTING
	// UNIT TESTING MEANS TEST CODE ONCE DEVELOPER DEVELOP THE CODE - SELF CORRECTION
	
	
	String name = "Testing";
	@Test
	public void checkEqual()
	{
		Assert.assertEquals(name, "Testing");
	}

}
