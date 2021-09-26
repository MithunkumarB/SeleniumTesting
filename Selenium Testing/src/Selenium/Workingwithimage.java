package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithimage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
	//	WebElement firstimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
	//	firstimage.click();
		
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if(brokenimage.getAttribute("naturalWidth").equals("0"))  // NATURALWIDTH USE FOR CHEECK IMAGE IS BROKEN OR NOT
		{
			System.out.println("This is Broken image");
		}
		else
		{
			System.out.println("This is Non Broken image");
		}
		
	}

}
