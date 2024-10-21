package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\Downloads\\chromedriver-win64\\chromedriver.exe");
        
        // Create ChromeOptions object
        //ChromeOptions options = new ChromeOptions();
       

        // Create an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Now we can use the driver to interact with the web browser
        // driver.get("https://www.google.com"); // Opens a website, we can use another syntax driver.navigate.to ("URL");
        
        driver.get("https://www.google.com"); Thread.sleep(2000);
        //driver.navigate().to("https://www.facebook.com/");Thread.sleep(2000);
        //driver.navigate().refresh();Thread.sleep(2000);
        //driver.navigate().back();Thread.sleep(2000);
        //driver.navigate().forward();Thread.sleep(2000);
        
        // maximize the page 
       driver.manage().window().maximize();
       
        // capture the title and print
        String title = driver.getTitle();
        System.out.println ("Page Title : " + title);
        
        // capture url of webpage and print 
        System.out.println("URL : " + driver.getCurrentUrl());
        
        // capture page source
        System.out.println("Page Source : " + driver.getPageSource());
       
        
        // Remember to close the browser after test execution
        //driver.quit();
    }
}

