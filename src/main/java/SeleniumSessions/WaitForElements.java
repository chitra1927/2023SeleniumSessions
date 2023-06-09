package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
	    By footer = By.xpath("//footer//ul/li/a");
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	//	List<WebElement> FOOTER_ELE= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		
	//	System.out.println(FOOTER_ELE.size());
		
	    List<WebElement> FOOTER_ELE = waitForElementVisibility(footer,10);
	    
	    System.out.println(FOOTER_ELE.size());
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	
    public static List<WebElement> waitForElementVisibility(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	

}
