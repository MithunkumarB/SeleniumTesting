package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfileexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]"));
		link1.click();
		
		File filelocation = new File("C:\\Users\\Acer\\Downloads");
		
		File[] totalfiles = filelocation.listFiles(); // USE FOR - GET LIST OF FILES
		
		for (File file : totalfiles) 
		{
			if(file.getName().equals("testleaf.xlsx"));
			System.out.println("File downloaded");
			break;
		}
	}

}
