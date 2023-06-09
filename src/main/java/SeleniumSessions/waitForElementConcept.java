package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForElementConcept {
	   
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		   
		driver.get("https://classic.crmpro.com/");	
		
		By username = By.name("username");
		By forgetpwd = By.linkText("Forgot Password?");
		
		// presenceOfElement : An expectation for checking that an element is present on the DOM of a page. 
		//This does not necessarily mean that the element is visible.
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement User_Name = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		//User_Name.sendKeys("newautomation");
		 
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		 
		//WebElement Forget_Pwd = wait.until(ExpectedConditions.presenceOfElementLocated(forgetpwd));
		
		//Forget_Pwd.click();
		
		//waitForElementPresence(username, 10).sendKeys("newautomation");
		//waitForElementPresence(forgetpwd, 5).click();
		//waitForElementVisibility(username, 10).sendKeys("newautomation");
		//waitForElementVisibility(forgetpwd, 5).click();
		
		ElementUtil ele = new ElementUtil(driver);
		ele.getElement(username, 10).sendKeys("newautomation");
		//ele.getElement(forgetpwd).click();
		ele.clickElementWhenReady(forgetpwd,10);
		
		

	}
	/**An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible on page.
	 * @param loctor
	 * @param timeout
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By loctor, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loctor));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	
	
    public static WebElement waitForElementVisibility(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
