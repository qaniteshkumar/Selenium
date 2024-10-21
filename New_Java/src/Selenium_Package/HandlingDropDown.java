package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://www.udyog-aadhar.com/");
		driver.manage().window().maximize(); Thread.sleep(2000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, 1500);"); Thread.sleep(5000);
		
		a.sendKeys(Keys.PAGE_DOWN).perform();Thread.sleep(1000);a.sendKeys(Keys.PAGE_DOWN).perform();Thread.sleep(4000);
		
		WebElement element= driver.findElement(By.cssSelector("select[id=txtOrg]"));
		Select s = new Select (element);
		// s.selectByVisibleText("Proprietorship");
		//s.selectByValue("Public Ltd.");
		s.selectByIndex(7);
		
		if(s.isMultiple()==true) 
		{
			System.out.println("Drodown is multiple");
		}
		else 
		{
		System.out.println("Dropdown is not multiple");

	}
		List <WebElement> alldropdownoptions = s.getOptions();
		System.out.println("Total Options:" +alldropdownoptions.size());
		for (WebElement el :alldropdownoptions) 
		{
			System.out.println(el.getText());
		}

	}

}
