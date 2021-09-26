package Selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		// Get the count of number of columns
		// Get the count of number of rows
		// TABLES ARE CONTAIN = TABLEHEAD<th> / TABLEROW<tr> / TABLE INSIDE CONTENET--> TABLEDEFINITION<td>
		
		// Get the count of number of columns
		List<WebElement> colomns = driver.findElements(By.tagName("th"));
		int colomncount = colomns.size();
		System.out.println("Total number of columns:" + colomncount);
		
		// Get the count of number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("Total number of rows:" + rowcount);
		
		
		// Get the progress value of 'Learn to interact with Elements'
		// HERE WE NEED TO GET PROGRESS VALUE FOR 'Learn to interact with Elements'
		
		// SO WE NEED TO GET 'Learn to interact with Elements' NEXT <td> ELEMENT 
		
		// //td[normalize-space()="Learn to interact with Elements"]//following::td[1];
		// STARTS WITH td TAG 
		// normalize-space() = USE FOR REMOVE 'Learn to interact with Elements' FRONT AND BACK SPACES.
		// td TAG INSIDE "Learn to interact with Elements" ELEMENT
		// following::td[1] = "Learn to interact with Elements" FOLLOWING FIRST <td>td[1] COMMENT. 
		
		WebElement progressvalue = driver.findElement(By.xpath("//td[normalize-space()=\"Learn to interact with Elements\"]//following::td[1]"));
		String percent = progressvalue.getText();
		System.out.println("progress value of 'Learn to interact with Elements': " + percent);
		
		 
		//Check the vital task for the least completed progress.
		
		List<WebElement> listofprogress = driver.findElements(By.xpath("//td[2]")); // HERE WE COLLECT THE LIST OF PROGRESS IN TABLE
		
		List<Integer> storelistofprogress = new ArrayList<Integer>(); // WE STORE THE LIST OF PROGRESS IN ARRAYLIST
				
		for (WebElement webElement : listofprogress) 
		{
			String individualvalue = webElement.getText().replace("%",""); // NOW WE HAVE STRING PROGRESS ELEMENT. 
			storelistofprogress.add(Integer.parseInt(individualvalue)); //WE NEED TO CONVERT STRING TO INT SO USE THIS.
			
		}
				
		int smallvalue = Collections.min(storelistofprogress); // HERE WE STORE THE MIN VALUE OF PROGRESS INTEGER
		System.out.println(smallvalue);
		
		String smallvalueString = Integer.toString(smallvalue) + "%"; // HERE CONVERT THAT SMALL VALUE(INTEGER) TO STRING.AND ADD %
		
		String xpathvalue = "//td[normalize-space()="+"\""+smallvalueString+"\""+"]"+"//following::td[1]";
				
		WebElement checkbox = driver.findElement(By.xpath(xpathvalue)); 
			
		checkbox.click();	
				
				
			
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
	}

}
