package Selenium_Package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("gLFyf")).sendKeys("https://www.saucedemo.com/" + Keys.ENTER);
		
		
		//Locate username by ID
		driver.findElement(By.id ("user-name")).sendKeys ("standard_user");
		Thread.sleep(2000);
		
		// Locate password by Name 
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		// Locate Login button by class
		driver.findElement(By.className("submit-button")).click(); Thread.sleep(2000);
		
		// Switch to product page 
		//String currWindowHandle= driver.getWindowHandle();
		//driver.switchTo().window (currWindowHandle);
		
		// Locate by linkText using click 
		// driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
		// Locate by partialLinkText using click 
		
		driver.findElement(By.partialLinkText("Sauce")).click();Thread.sleep(2000);
		
		// How to find out element size
		//List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		//System.out.println("No of Elements with Sauce :" + elementList.size());

	}

}
