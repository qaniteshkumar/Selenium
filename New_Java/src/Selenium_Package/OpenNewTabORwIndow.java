package Selenium_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabORwIndow {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		// Instantiate the webdriver
		WebDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		driver.get("https://www.google.com/"); Thread.sleep(2000);
	
		// Capture title
		System.out.println("First Page: " + driver.getTitle());
		
		// Open new Tab
		driver.switchTo().newWindow(WindowType.TAB); Thread.sleep(2000);
		
		// Open facebook path
		driver.get("https://www.facebook.com/"); Thread.sleep(2000);
		
		//Capture Title
		System.out.println("Second Page: " + driver.getTitle());
		
		// Get window handles of open windows
		Set <String > windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close(); Thread.sleep(2000);
		
		// Switch to google.com
		driver.switchTo().window(handles.get(0));
		System.out.println("First Page: " + driver.getTitle());
	}

}
