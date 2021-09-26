package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		// HERE WE CHOOSE findElements(XPATH) BECAUSE WE NEED TO CHOOSE MULTIPLE ELEMENTS INSIDE THE ELEMENTS
		// and choose findElements
		// HERE WE ADD /li FOR GET TOTAL ELEMENT SIZE
		
		int listsize = selectable.size();
		System.out.println(listsize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		// HERE KEYDOWN  - USE FOR SELECT PARTICULAR KEY
		// selectable.get(0) - USE FOR GET OTH ELEMENT
		
		// APPROACH-II
	/*	Actions actions2 = new Actions(driver);
		actions2.clickAndHold(selectable.get(0));
		actions2.clickAndHold(selectable.get(1));
		actions2.clickAndHold(selectable.get(2));
		actions2.build().perform();   */
		
		
		
	}

}
