package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		JavaScriptExecutor js = (JavaScriptExecutor) driver;  // Type cast driver in JavaScriptExecutor
		
		// To get domain name 
		String d = js.executeScript ("return document.domain;").toString();
		
		System.out.println("Domain Name : " + d);
 
	}

}
