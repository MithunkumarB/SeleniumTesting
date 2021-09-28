package Testng;

import org.testng.annotations.Test;

public class Setpriority {
		
		// HERE WITHOUT PRIORIY THE CODE IS RUN BASED METHOD-NAME ALPHABET ORDER.
		// SO HERE WE USE PRIORITY.
		// PRIORITY KEYWORD HANDLE THE ORDER OF EXECUTION.
		
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
		@Test(priority = 5)
		public void putFourthGrear()
		{
			System.out.println("Put Fourth gear");
		}


	}


