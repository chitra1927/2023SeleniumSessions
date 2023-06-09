package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertJsPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(alert.getText());
		//alert.accept();
		AlertJsGetText(10);
		AlertJsEnterValue("chitra",10);
		AlertJsAccept(10);
		
	}
		
		public static Alert waitForAlertJsPopUp(int timeout) {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
			return wait.until(ExpectedConditions.alertIsPresent());
		}
		
       public static String AlertJsGetText(int timeout) {
			
			return waitForAlertJsPopUp(timeout).getText();
		}
       
       public static void AlertJsAccept(int timeout) {
			
			waitForAlertJsPopUp(timeout).accept();
		}
       
       public static void AlertJsDismiss(int timeout) {
			
			waitForAlertJsPopUp(timeout).dismiss();
		}
       
       public static void AlertJsEnterValue(String value ,int timeout) {
			
			waitForAlertJsPopUp(timeout).sendKeys(value);
		}
       
       
       
       
		
		
		
		
		
	

}
