package Selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sortelements = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		// HERE WE NEED TO COLLECT ALL ELEMENTS SO USE = findElements
		
		WebElement fromelement = sortelements.get(5);  //HERE GET USE FOR GET THE POSITION OF THE ELEMENT
		WebElement Toelements = sortelements.get(0);
		
		Actions action = new Actions(driver);
	/*	action.clickAndHold(fromelement);
		action.moveToElement(Toelements);
		action.release(Toelements);
		action.build().perform(); */
		
		action.dragAndDrop(fromelement, Toelements).build().perform();
		
		

	}

}
