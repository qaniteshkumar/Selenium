package Selenium_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/"); Thread.sleep(2000);	// Signin youtube page 
		
//		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click(); Thread.sleep(2000);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Email or phone']"))).sendKeys("kumar.nitesh110293@gmail.com");
//
//Actions act = new Actions(driver);
//
//     for (int i=1; i<=3; i++)
//     {
//    	 act.sendKeys(Keys.TAB).perform(); Thread.sleep(1000);
//     }
//
//act.sendKeys(Keys.ENTER).perform(); Thread.sleep(2000);
//
//driver.navigate().back();   // Back to home page
//driver.navigate().back(); Thread.sleep(2000);

driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("kaun disha mein leke chala re batohiya"); Thread.sleep(2000);
//act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform(); Thread.sleep(2000);
driver.findElement(By.xpath("//button[@aria-label='Search']")).click(); Thread.sleep(2000);

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript ("window.scrollBy(0, 5000)");




		
		

	}

}
