package Selenium_Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	// For Simple Alert
		//driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click(); Thread.sleep(2000);
	// Switch to alert window and accept it	
		//driver.switchTo().alert().accept();
		
		
		
		// For Confirmation Alert
		// driver.findElement(By.linkText("Alert with OK & Cancel")).click(); Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click(); Thread.sleep(2000);
		//driver.switchTo().alert().accept();   // for ok
		// driver.switchTo().alert().dismiss(); //  for cancel
		
		// For Prompt Alert 
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click(); Thread.sleep(2000);
		driver.findElement(By.linkText("Alert with Textbox")).click(); Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();Thread.sleep(2000);
		//driver.switchTo().alert().sendKeys("Nitesh Kumar");
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		// Another way 
		WebElement element = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));Thread.sleep(2000);
		Actions a =new Actions(driver);
		a.moveToElement(element).click().perform();Thread.sleep(2000);

		Robot rb = new Robot ();
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE); Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Nitesh Kumar"); Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}

}
