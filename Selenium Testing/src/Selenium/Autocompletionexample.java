package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletionexample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(options.size());
		
		
		
		for(WebElement list : options) // WE STORE THE ALL OPTIONS DATA INTO LIST/
		{
			if(list.getText().equals("Selenium")) // CHECK LIST TEXT IS EQUAL TO SELENIUM
			{
				list.click();
				break;
			}
					
		}
		

	}

}
