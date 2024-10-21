package Selenium_Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_File {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		// Using SendKeys()method
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\ALSAKB\\Downloads\\sampleFile.jpeg");
		
		// Using Robot class
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).click();  // here click method not working
		
		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions a = new Actions (driver);
		a.moveToElement(button).click().perform();
		
		Robot rb = new Robot (); Thread.sleep(2000);
		// rb.delay(2000);
		
		// Copy file to clipboard
		StringSelection ss = new StringSelection ("C:\\Users\\ALSAKB\\Downloads\\sampleFile.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Perform Control + V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL); 
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); 
		
		
		
		
		
		
	}

}
