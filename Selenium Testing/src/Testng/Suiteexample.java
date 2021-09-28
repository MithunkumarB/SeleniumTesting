package Testng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteexample {
	
	// OPEN BROWER 
	// CHECK (WWW.GOOGLE.COM/ WWW.BING.COM/ WWW.YAHOO.COM)
	// CALCULATE THE TOTAL TIME FOR THIS
	
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;
	
	//BEFORSUITE USE FOR EXECUTE BEFOR TEST ANNOTATION RUN.
	
	@BeforeSuite
	public void launchbrowser()
	{
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void OpenGoogle()
	{
		driver.get("http://www.google.com");
	}
	
	@Test
	public void OpenBing()
	{
		driver.get("http://www.bing.com");
	}
	
	@Test
	public void OpenYahoo()
	{
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		endtime = System.currentTimeMillis();
		totaltime = endtime - starttime;
		System.out.println("Total Time Taken:" + totaltime);
		
	}

}



