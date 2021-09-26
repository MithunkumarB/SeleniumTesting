package Selenium;



import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

import okhttp3.internal.connection.RouteSelector.Selection;

public class Uploadexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement clickbutton = driver.findElement(By.name("filename"));
		clickbutton.click();
		
		//WINDOWS 
		
	//	String filelocation = "C:\\Users\\Acer\\Downloads\\testleaf.xlsx";
		
		//Selection selection = new Selection(filelocation);
		 
		 Tool
		 

	}

}
