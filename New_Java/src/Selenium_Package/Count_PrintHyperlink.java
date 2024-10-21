package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_PrintHyperlink {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		List <WebElement> linkElement = driver.findElements(By.tagName("a"));
		
		System.out.println ("No of HyperLinks : " + linkElement.size());
		
		for (WebElement el: linkElement)
		{
			System.out.println(el.getText());
		}
	driver.close();	
	}

}
