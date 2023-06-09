package SeleniumSessions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    			.withTimeout(Duration.ofSeconds(10))
				.pollingEvery((Duration.ofMillis(1000)))
				.ignoring(NoSuchElementException.class)
				.withMessage("time out and no element found");
		
		//wait.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//wait.ignoring(NoSuchElementException.class)
		//   .pollingEvery(Duration.ofSeconds(1))
		//   .withMessage("time out is done element is not found")
		 //  .until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
	}
		
		public static List<WebElement> waitForAllElementVisibilityWithFluentWait(By locator, int timeout , int timeinterval) {
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery((Duration.ofMillis(1000)))
					.ignoring(NoSuchElementException.class)
					.withMessage("time out and no element found");
			
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
	    
		
       
		
		
		
		
		
		
		
				
	   
		
		

	}


