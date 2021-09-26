 package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calander = driver.findElement(By.id("datepicker"));
		//calander.sendKeys("10/10/2021" + Keys.ENTER);
		calander.click();
		
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
		nextbutton.click();
		
		WebElement selectdate = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[1]/a"));
		selectdate.click();
	
	}
}
