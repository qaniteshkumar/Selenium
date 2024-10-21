package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_1 {        // Second way to date pick
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		 String expectedDay = "2";
		 String expectedMonth = "November";
		 String expectedYear = "2024";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/"); Thread.sleep(2000);
		
		
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='datepicker']"));
		element.click();
	
		
		while (true)
		{
		String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
		String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); 
			
			if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
			{
				driver.findElement(By.xpath("//a[@class='ui-state-default'][normalize-space()='" + expectedDay + "']")).click();
				
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); Thread.sleep(2000);
			}
	}

}
   }
