package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage_Scroll {

	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
          driver.manage().window().maximize();
          driver.get("https://www.calculator.net/");
          
         JavascriptExecutor js = (JavascriptExecutor)driver; Thread.sleep(3000);
       // Scroll vertically down by 500 pixels
//         js.executeScript ("window.scrollBy(0, 500)");
          
          // Scroll till visibility of web element
//          WebElement element = driver.findElement(By.linkText("Sales Tax Calculator"));
//          js.executeScript("arguments[0].scrollIntoView();",element);
          
          // Scroll down the web page at the bottom of the page 
//         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
          
          // Scroll on the webpage horizontally
          WebElement element = driver.findElement(By.id("ID Ki Value"));
          js.executeScript("arguments[0].scrollIntoView();", element);
          
          
	}

}
