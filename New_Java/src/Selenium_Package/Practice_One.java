package Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Practice_One {

	Practice_One() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		JavascriptExecutor Executor = (JavascriptExecutor) driver;
		Executor.executeScript("window.scrollBy(0,400)");
	WebElement button1=	driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	Actions a=new Actions(driver);
	a.contextClick(button1).perform();Thread.sleep(2000);
	WebElement button2=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	a.doubleClick(button2).perform();Thread.sleep(2000);
	driver.close();
	}
	
	Practice_One(int i) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		JavascriptExecutor Executor = (JavascriptExecutor) driver;
		Executor.executeScript("window.scrollBy(0,400)");
		Actions a =new Actions(driver);
	    WebElement source1=	driver.findElement(By.xpath("//div[@id='box5']"));
	    WebElement target1=	driver.findElement(By.xpath("//div[@id='box105']"));
	    a.dragAndDrop(source1,target1).perform();
	    
	    WebElement source2=	driver.findElement(By.xpath("//div[@id='box3']"));
	    WebElement target2=	driver.findElement(By.xpath("//div[@id='box103']"));
	    a.dragAndDrop(source2,target2).perform();Thread.sleep(2000);
	    driver.close();
	}
	
	void method1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://export.ebay.com/in/");
		driver.manage().window().maximize();
	    WebElement Link=driver.findElement(By.linkText("Performance"));
	    Actions a =new Actions(driver);
	    a.moveToElement(Link).perform();
	}
	public static void main(String [] args) throws InterruptedException {
		Practice_One one = new Practice_One();
		Practice_One one1 = new Practice_One(10);
		one.method1();
	}
}
