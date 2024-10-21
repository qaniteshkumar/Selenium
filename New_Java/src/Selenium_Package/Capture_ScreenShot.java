package Selenium_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		// Capture full page screenshot
//		// Step1 - Convert web driver object to TakeScreenshot interface
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//		
//		// Step2- Call getScreenshotAs method to create image file 
//		File src = screenshot.getScreenshotAs(OutputType.FILE);
//		File dest = new File ("C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\ScreenShots\\FullPage.png");
//		
//		// Step3- Copy image file to destination
//		FileUtils.copyFile(src, dest);

		
		// Capture section of a webpage screenshot
//		WebElement section = driver.findElement(By.xpath("//form[@class='_9vtf']"));
//		
//		File src = section.getScreenshotAs(OutputType.FILE);
//		File dest = new File ("C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\ScreenShots\\Section.png");
//		
//		FileUtils.copyFile(src, dest);
		
		// Capture Web element screenshot
		
       WebElement Webelmnt = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy	']"));
		
		File src = Webelmnt.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\ScreenShots\\WebElement.png");
		
		FileUtils.copyFile(src, dest);
	}

}
