package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
	      
		 // Expected date
		   String expectedDay = "2";
		   String expectedMonth = "November";
		   String expectedYear = "2024";
		   
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize(); Thread.sleep(2000);
	      
	      driver.get("https://jqueryui.com/datepicker/");     
	      // Switch to iframe
	      driver.switchTo().frame(0);
	      
	      // Find webelement of date picker and perform click action
	   WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
	   datepicker.click(); Thread.sleep(2000);
	   
	   // Loop to navigate to the correct month and year
	   while(true)
	   {
	      String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); Thread.sleep(2000);
	      String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); Thread.sleep(2000);
	      
	   // If the expected month and year are found
	     
	      if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
	      {
	    	  // If found, select the day 
	    	List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
	    	
    	for(WebElement e:dayList)
    	{
	    		String calenderDay = e.getText();
	    		if(calenderDay.equals(expectedDay)) 
	    		{
	    			e.click(); Thread.sleep(2000);
	    			break;  
	    		}
	    	}
	    	break; // Break the while loop after the date is selected
	      }
	      else
	      {	    	  
	    	  driver.findElement (By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); Thread.sleep(2000);
	      }
	   }

}

   }

