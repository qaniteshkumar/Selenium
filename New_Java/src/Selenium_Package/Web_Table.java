package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
	System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\Web_Table.html");
	
	// Find second cell in the web table and Print 2nd cell data 
	WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
	String text = element.getText();
	System.out.println(text);
		
	// Find total rows in web table 
	List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
	System.out.println(" No of Row: " + rowList.size());
	
	// Find total column in web table
	List <WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
	System.out.println("No of Column: " +columnList.size());
	
	// Find all the data in the web table and print
	for (int r=2; r<=3; r++)   // for (int r=2; r<=rowList.size(); r++)
	{
		for (int c=1; c<=2; c++) // for (int c=1; c<=columnList.size(); c++)
		{
			String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
			System.out.println(data);
		}
	}
	

	}

}
//
//System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\ALSAKB\\eclipse-workspace\\New_Java\\WebDriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("https://testautomationpractice.blogspot.com/"); 
//driver.manage().window().maximize ();
//Thread.sleep(2000);
//
//List<WebElement> row=	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
//System.out.println("No of row " + row.size());
//
//List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
//System.out.println("No of column " +column.size());
//
//for (int r=2; r<=row.size(); r++)
//{
//   for (int c=1; c<=column.size(); c++)
//   {
//	   String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
//	   //WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]"));
//			   //String s = element.getText();
//			   System.out.println(data);
//   }
//}
//}
//
//}

