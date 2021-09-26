package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkexample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		// NAVIGATE = USE FOR WE CAN BACKWORD,FORWARD,REFRESH THE PAGE
		// GET = WE ARE NOT ABLE TO DO THIS
		
		//Go to Home Page
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		WebElement whereTogo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereTogo.getAttribute("href");
		// HREF ATRIIBUTE HAVE THE REDIRECT LINK - SO WE USE THIS ATRIBUTE
		System.out.println("The link is going to: "+ where);
		
		//Verify am I broken?
		WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		
		String title = driver.getTitle(); //OPENED PAGE TITLE WE NEED TO GET SO USE - GET TITLE
		if(title.contains("404"))
		{
			System.out.println("The link is broken");
		}
		driver.navigate().back();
		

		//Go to Home Page (Interact with same link name)
		WebElement homepage2 = driver.findElement(By.linkText("Go to Home Page"));
		homepage2.click();
		
		//How many links are available in this page?
		List <WebElement> totallinks = driver.findElements(By.tagName("a")); // HERE WE USE a FOR ANCOR TAG - IT CONTAINS COUNTS OF LINKS
		int links = totallinks.size();										// TO FIND IMG - USE img
		System.out.println("Total Links Count: "+ links);
		
		
		
	}

}
