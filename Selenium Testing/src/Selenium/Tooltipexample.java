package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltipexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement tooltip = driver.findElement(By.id("age"));
		
		String text = tooltip.getAttribute("title");
		
		System.out.println(text);
		
		// WE CAN GET TEXT -  USING TITLE ATTRIBUTE ZL
		

	}

}
