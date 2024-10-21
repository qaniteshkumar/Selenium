package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// Locate UserName by CSS Selector - (tag#id)
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user"); Thread.sleep(2000);
		
		// Locate Password by CSS Selector - (tag[attribute=value])
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce"); Thread.sleep(2000);
		
		// Locate Login button by CSS Selector - (tag.value of class)
		driver.findElement(By.cssSelector("input.submit-button")).click(); Thread.sleep(2000);
		
		// Locate add the product by CSS Selector - (tag.value of class[attribute=value])
		driver.findElement(By.cssSelector("button.btn[id=add-to-cart-sauce-labs-backpack]")).click(); Thread.sleep(2000);
		
		// open add to cart and back
		driver.findElement(By.cssSelector("span.shopping_cart_badge")).click(); Thread.sleep(2000);
		driver.navigate().back();
		
		// Locate add the product by CSS selector - (Star with ^, End with $ and Contains *) - tag[attribute^=substring]
		driver.findElement(By.cssSelector("button[id^=add-to-cart-sauce-labs-bike-light]")).click();

	}

}
