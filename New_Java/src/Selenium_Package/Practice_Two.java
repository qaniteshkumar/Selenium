package Selenium_Package;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Two {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().window().maximize ();
		Thread.sleep(2000);
		
	    List<WebElement> row=	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	    System.out.println("No of row " + row.size());
	    
	    List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
	    System.out.println("No of column " +column.size());
		
       for (int r=2; r<=row.size(); r++)
       {
    	   for (int c=1; c<=column.size(); c++)
    	   {
    		   String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
    		   //WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]"));
    				   //String s = element.getText();
    				   System.out.println(data);
    	   }
       }
	}

}
