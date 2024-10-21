package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();    
        driver.manage().window().maximize();
        // driver.get("https://www.rediff.com/");
        
       // Switch to iframe By id or name or index
        
       //driver.switchTo().frame(0);  
       // driver.switchTo().frame("moneyiframe");
        
        // find web element and print value
       // String nseindex = driver.findElement(By.id("nseindex")).getText();
        //System.out.println(nseindex);
        
        // Switch to iframe by Weblement
//        WebElement iframeElement = driver.findElement(By.name("moneyiframe"));
//        driver.switchTo().frame(iframeElement);
//        
//        // find web element and perform click action 
//        String Text = driver.findElement(By.xpath("//span[@id='nseindex']")).getText(); Thread.sleep(2000);
//        System.out.println(Text);
//        
//        // To find out the no of iframe on main page, need to come back on main page first from frame 
//        
//        driver.switchTo().defaultContent();
//        
//        // Find & print no if iframes on main webpage
//        int Noofiframes = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(Noofiframes);
        
        // Nested iframe
        
        driver.get("https://www.dezlearn.com/nested-iframes-example/");
        
        // Switch to parent frame
        driver.switchTo().frame("parent_iframe");
        // Switch to child frame
        driver.switchTo().frame("iframe1");
        
        driver.findElement(By.id("u_5_6")).click(); Thread.sleep(2000);
        
        // Switch to parent frame
        driver.switchTo().parentFrame();
        driver.findElement(By.id("u_5_5")).click(); Thread.sleep(2000);

        driver.switchTo().defaultContent();
        //driver.findElement(By.xpath("//a[@class='menu-link']")).click();
        driver.findElement(By.linkText("LinkedIn")).click();
	}

}
