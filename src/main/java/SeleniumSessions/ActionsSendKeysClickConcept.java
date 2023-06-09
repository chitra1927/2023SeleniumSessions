package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.xpath("//input[@id='input-email']");
		
		By pwd  = By.xpath("//input[@id='input-password']");
		
		By login = By.xpath("//input[@value='Login']");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(emailId), "dsaichitravathi@gmail.com").build().perform();
		
		act.sendKeys(driver.findElement(pwd), "chitra123").build().perform();
		
		act.click(driver.findElement(login)).build().perform();
			

	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
    }
	
	public static void doActionsSendKeys(By locator , String value) {
		
		Actions act = new Actions(driver);
		
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doClick(By locator) {
		
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	
	
	
	
	
}
