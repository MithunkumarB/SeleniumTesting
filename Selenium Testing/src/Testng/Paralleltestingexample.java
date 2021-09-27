package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltestingexample {
	
	// HERE PARALLEL TESTING USE FOR OPEN AND TEST SITES PARALLELY
	// SO WE USE INSIDE <suite> parallel = "methods" thread-count = "2"
	// parallel = "methods" means METHODS ARE PERFORM  PARALLELY
	// thread-count = "2" COUNT OF BROWSERS TAB
	
	
	@Test
	public void openGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}


	@Test
	public void openBing()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
	}
}
