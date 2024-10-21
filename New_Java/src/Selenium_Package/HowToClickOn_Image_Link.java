package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClickOn_Image_Link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user"); Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys ("secret_sauce"); Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-button")).click(); Thread.sleep(2000);
		driver.findElement(By.cssSelector("img.inventory_item_img")).click();
		
		// Verify opening page is right or not 
		String s=driver.getCurrentUrl();
		 if(s.equals("https://www.saucedemo.com/inventory-item.html?id=4")){ 
			 System.out.println("We are on right page");
		 }
		 else {
			 System.out.println("We are on wrong page");
		 }
			 

	}

}
