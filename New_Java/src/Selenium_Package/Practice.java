package Selenium_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Practice {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-testid='open-registration-form-button']")));
	element.click();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kumar"); 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumaran"); Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(element1);
		s.selectByVisibleText("11"); Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select (element2);
		s1.selectByValue("2"); Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select (element3);
		s2.selectByIndex(31); Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@value='2'][@class='_8esa']")).click();
		
		WebElement element4 = driver.findElement(By.xpath("//input[@value='2']"));
		Actions act = new Actions(driver);
		//act.click(element4).perform();
		// act.moveToElement(element4).click().perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ARROW_RIGHT).perform(); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("facebookkumar@gmail.com"); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("facebookkumar@276969"); Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform(); Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform(); Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform(); Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform(); Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='websubmit']")).click(); Thread.sleep(20000);
		
		
		act.sendKeys(Keys.TAB).perform(); 
		act.sendKeys(Keys.TAB).perform(); 
		act.sendKeys(Keys.TAB).perform(); 
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform(); 
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform(); Thread.sleep(5000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(5000);
		act.sendKeys(Keys.TAB).perform(); Thread.sleep(5000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform(); Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	
		
	}
}

