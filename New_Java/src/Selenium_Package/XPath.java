package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// Locate user name by using xPath and single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"); Thread.sleep(2000);
		
		// Locate password by using xpath and multiple attribute
		driver.findElement(By.xpath("//input[@id='password'] [@name='password']")).sendKeys("secret_sauce"); Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input.submit-button")).click();
		
		driver.findElement(By.xpath("//input[@name='login-button']")).click(); // Click login button
		
		// Locate add to cart using xpath and "AND' expression
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-test='shopping-cart-badge']")).click();Thread.sleep(2000);
		driver.navigate().back();
		
		// Locate add to cart using xpath and "OR' expression
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @class='btn']")).click();
	
		
	
		
		
	
	}

}
