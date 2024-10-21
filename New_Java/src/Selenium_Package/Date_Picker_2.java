package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Date_Picker_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		 String expectedDay = "2";
		 String expectedMonthYear = "December 2024";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/"); Thread.sleep(3000);
		
		Actions act = new Actions (driver);
		
		WebElement element1 = driver.findElement(By.xpath("//span[@role='presentation']")); // Remove login popup
				act.click(element1).perform(); Thread.sleep(2000);
				
	driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']")).click();// To select city - From
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Delhi"); Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();  Thread.sleep(2000);
					
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lucknow"); Thread.sleep(2000); // To select city - To
	act.sendKeys(Keys.ENTER).build().perform();  Thread.sleep(2000);
		
		
	driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();  // Click on date
		Thread.sleep(2000);
		
		while(true)
		{
			String calenderMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			
			if (calenderMonthYear.equals(expectedMonthYear))
			{
				Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='fsw__date'][normalize-space()='" + expectedDay + "']")).click();
				break;
			}
		else
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click(); Thread.sleep(2000);
		}
	}
	
	}
}


