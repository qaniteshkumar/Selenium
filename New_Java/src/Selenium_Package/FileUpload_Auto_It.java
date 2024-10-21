package Selenium_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Auto_It {

	public static void main(String[] args) throws IOException, InterruptedException {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://the-internet.herokuapp.com/upload");
	      
	      WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
	      
	      Actions act = new Actions(driver);
	      act.moveToElement(button).click().perform(); Thread.sleep(2000);
	      
	      
	      Runtime.getRuntime().exec("C://Users//ALSAKB//Desktop//FileUpload.exe" + " " + "C:\\Users\\ALSAKB\\Desktop\\Capture.jpg");

	}

}
