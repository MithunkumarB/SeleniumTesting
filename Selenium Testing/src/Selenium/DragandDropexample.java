package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDropexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		// HERE ACTIONS - USE FOR DO MOUSE ACTIONS
		// CLICKANDHOLD - USE FOR CLICK ONE ELEMENT AND HOLD
		// MOVETOELEMENT - USE FOR MOVE TO DROP ELEMENT
		// RELESE - USE FOR RELEASE THE ELEMENT IN DROP LOCATION.
		// BUILD.PERFORM - USE FOR PERFORM ALL THESE THINGS
		
		// APPROACH-2
		//action.dragAndDrop(drag, drop).build().perform();
	}

}
