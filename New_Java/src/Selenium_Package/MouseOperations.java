package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/buttons");
//		driver.manage().window().maximize();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 500);");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement button1 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));  // For Right Click
//		a.contextClick(button1).perform(); Thread.sleep(3000);
//		
//		WebElement button2 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']")); // For Double Click
//		a.doubleClick(button2).perform(); Thread.sleep(3000);
//		driver.close(); Thread.sleep(2000);
//		
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); // For DragAndDrop
//		driver1.manage().window().maximize();
//		Actions a1 = new Actions(driver1);
//		WebElement Source = driver1.findElement(By.xpath("//div[@id='box7']"));
//		WebElement Target = driver1.findElement(By.xpath("//div[@id='box103']"));
//		a1.dragAndDrop(Source, Target).perform(); Thread.sleep(2000);
//		driver1.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.amazon.in/");   // For Mouse Over
		driver2.manage().window().maximize(); Thread.sleep(2000);
	    WebElement element=driver2.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions a =new Actions(driver2);
		a.moveToElement(element).perform();
		
//		WebDriver driver3 = new ChromeDriver();
//		driver3.get("https://export.ebay.com/in/");   // For Mouse Over
//		driver3.manage().window().maximize(); Thread.sleep(2000);
//	    driver3.findElement(By.partialLinkText("Payment & Fees"));
//		Actions a =new Actions(driver3);
//	    a.moveToElement(element).perform();
	}

}
