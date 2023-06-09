package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a web element + perform action like click(),sendKeys(),isDisplayed().
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1st method
		//driver.findElement(By.id("input-email")).sendKeys("dsaichitravathi@gmail.com");
		
		//driver.findElement(By.id("input-password")).sendKeys("chitra19");
		
		//2nd method
		
		//WebElement emailId = driver.findElement(By.id("input-email"));
		
		//WebElement passWd = driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("dsaichitravathi@gmail.com");
		
		//passWd.sendKeys("chitra19");
		
		//3rd method using by locator
		
		//By email = By.id("input-email");
		//By pwd = By.id("input-password");
		
		//WebElement emailId = driver.findElement(email);
		//WebElement passWd = driver.findElement(pwd);
		
		//emailId.sendKeys("dsaichitravathi@gmail.com");
		
		//passWd.sendKeys("chitra19");
		
		//4th method create generic functions to create web element and perform action.
		
		//By email = By.id("input-email");
		
		//By pwd = By.id("input-password");
		
		//5th approach using element util
		By email = By.id("input-email");
		
		By pwd = By.id("input-password");
		
		ElementUtil e = new ElementUtil(driver);
		
		e.doSendKeys(email,"dsaichitravathi@gmail.com");
		
		e.doSendKeys(pwd,"chitra19");
				
	}
	
    //public  void doSendKeys(By locator, String value) {
	
	//	getElement(locator).sendKeys(value);
		
	//}
	
	
	//public WebElement getElement(By locator) {
	//	
	//	return  driver.findElement(locator);
		
	//}
	
	
	

}
