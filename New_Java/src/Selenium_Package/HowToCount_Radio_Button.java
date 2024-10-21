package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToCount_Radio_Button {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx"); 
		driver.manage().window().maximize();
		
		// How to count total no of radio buttons
		List <WebElement> element = driver.findElements(By.cssSelector("input[type=radio]")); 
		System.out.println("No of radio button : " +element.size());
		driver.quit();

		// driver.findElement(By.xpath("//input[@value='2']")).click(); // How to click on radio button
	}

}
