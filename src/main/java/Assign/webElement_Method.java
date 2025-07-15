package Assign;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webElement_Method {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		WebElement UserName=driver.findElement(By.id("username"));
//		UserName.sendKeys("SoftwareEngineer");
//		WebElement pass=driver.findElement(By.id("password"));
//		pass.sendKeys("122202019");
//		WebElement email=driver.findElement(By.id("gidr-email-log-in-button"));
//		email.click();
//		WebElement emailLinkText=driver.findElement(By.linkText("Forgot Your Password?"));
//		emailLinkText.click();
//		WebElement partialLinkText=driver.findElement(By.partialLinkText("Password?"));
//		partialLinkText.click();
//		WebElement indexing=driver.findElement(By.xpath("(//*[@class=\"fr small\"])[2]"));
//		indexing.click();
//		WebElement contains=driver.findElement(By.xpath("(//*[@class=\"fr small\"])[2]"));
//		contains.click();
//		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"rememberUn\"]"));
//		if(checkbox.isSelected()) {
//			System.out.println("Checkbox is already selected");
//		}
//		else {
//			checkbox.click();
//			System.out.println("checkbox is selected");
//			}
//		WebElement login=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
//		boolean result=login.isEnabled();
//		System.out.println(result);
//		if(result) {
//			System.out.println("button is enabled");
//			login.click();
//		}
//		else {
//			System.out.println("button is disabled");
//		}
		//to check attribute
//		WebElement login=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
//		String attribute=login.getAttribute("class");
//		System.out.println(attribute);
//		String attribute1=login.getAttribute("type");
//		System.out.println(attribute1);
//		if(attribute1.equals("button r4 wide primary\r\n")) {
//			System.out.println("Attribute is present");
//		}
//		else {
//			System.out.println("Attribute is not present");
//		}
//		                    Screen shot
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//C:\Users\Jaswanth\OneDrive\Pictures\Screenshots 1
//		String destination = "C:\\Users\\Jaswanth\\OneDrive\\Pictures\\Screenshots 1\\selenium_screenshot.jpg";
//		File filedestination = new File(destination);
//		FileHandler.copy(source,filedestination);
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0, 2000)");//Scroll down by 2000 pixels
//		js.executeScript("window.scrollBy(0, -1000)");//scroll down by
//		js.executeScript("window.scrollBy(1000, 0)");// scroll right by 1000 pixels
//		js.executeScript("window.scrollBy(-500, 0)");//scroll left by 1000 pixel
//		js.executeScript("window.scrollBy(500, 1200)");//scroll right by 500 and down by 1200 pixel		
		//                            To  Click
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.nykaa.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		//by using actions of methods class we can perform mouse action 
//		WebElement category=driver.findElement(By.xpath("//a[text()='categories']"));
//		Actions action =new Actions(driver);
//		//action.click(category).perform();        // .perform() is mandatory to click|| this is for left click
//		//action.contextClick(category).perform();   // for right click, usually we wont use right click
//		action.doubleClick(category).perform();    //  double click
		
		//                                 Drag and Drop
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Static.html");
//		driver.manage().window().maximize();
////		WebElement source=driver.findElement(By.xpath("//img[@id='angular']"));
////		WebElement target= driver.findElement(By.xpath("//div[@id='droparea']"));
////		Actions action=new Actions(driver);
////		action.dragAndDrop(source,target).perform();
//		WebElement source=driver.findElement(By.xpath("//img[@id='mongo']"));
//		WebElement target= driver.findElement(By.xpath("//div[@id='droparea']"));
//		Actions action=new Actions(driver);
//		action.dragAndDrop(source,target).perform();
		
		
		                           
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement makeupHover=driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[1]/a"));
		WebElement facePrimer=driver.findElement(By.xpath("//a[text()='Face Primer']"));
		Actions act=new Actions(driver);
		act.moveToElement(makeupHover).click(facePrimer).build().perform();// build is mandatory
		
		
//		WebElement moveToElement=driver.findElement(By.xpath("//h2[text()='See personalized recommendations']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0]", args)
		
	}
}