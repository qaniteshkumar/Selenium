package Selenium_Package;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Sync_Implicit_Explicit_Fluent_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
//		// Apply Implicit wait for 10 sec
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Stopwatch watch = null;
//		
//		// Find web element 
//	//	driver.findElement(By.linkText("Become a Seller")).click();
//		
//		// Enter wrong web element to check exception throws or not using stop watch 
//		
//		try {
//			watch = Stopwatch.createStarted();
//			driver.findElement(By.linkText("Wrong Eelement ")).click();
//		}
//		catch (Exception e)
//		{
//			watch.stop();
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
//		}
		
//		// Explicit wait of 10 seconds
//		WebDriverWait Wait = new WebDriverWait (driver, Duration.ofSeconds(10));
//		
//		Stopwatch watch = null;
//		
//		try
//		{
//	        watch = Stopwatch.createStarted();
//		//	WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Become a Seller")));
//			WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Become a Sellerrrrr")));
//			element.click();
//		}
//		catch(Exception e)
//		{
//			watch.stop();
//			System.out.println(e);
//		System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
//			
//		}
		
		// Fluent wait of 10 sec
		
		Wait <WebDriver> FluentWait = new FluentWait <WebDriver> (driver)
		.withTimeout (Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring (NoSuchElementException.class);
		
		WebElement element = FluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("XYZ")));
		element.click();

	}
	

}
