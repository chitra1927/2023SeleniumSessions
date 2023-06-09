package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		By forgot_pwd = By.xpath("//a[text()='Forgot Password?']");
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.clickElementWhenReady(forgot_pwd, 5);
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.titleContains("Log In"));
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		//String titlename = waitForTitleAndCapture("Log In",10);
		//System.out.println(titlename);
		//String titlename = waitForFullTitleAndCapture("CRMPRO Log In Screen",10);
		//System.out.println(titlename);
		String furl = waitForFullUrlAndCapture("https://classic.freecrm.com/login.cfm?pr=1",10);
		System.out.println(furl);
	}
	
	public static String waitForTitleAndCapture(String titleFragment , int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		
		if(wait.until(ExpectedConditions.titleContains(titleFragment)))
			{
			String title = driver.getTitle();
			return title;
			
			}
		else {
			return null;
		}
		
		
	}
	
    
    public static String waitForFullTitleAndCapture(String titleValue , int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		
		if(wait.until(ExpectedConditions.titleIs(titleValue)))
			{
			String title = driver.getTitle();
			return title;
			
			}
		else {
			return null;
		}
		
		
	}
    
    public static String waitForUrlAndCapture(String urlFragment , int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		
		if(wait.until(ExpectedConditions.urlContains(urlFragment)))
			{
			String URL = driver.getCurrentUrl();
			return URL;
			
			}
		else {
			return null;
		}
		
		
	}
    
   public static String waitForFullUrlAndCapture(String FullUrl , int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		
		if(wait.until(ExpectedConditions.urlToBe(FullUrl)))
			{
			String URL = driver.getCurrentUrl();
			return URL;
			
			}
		else {
			return null;
		}
		
		
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
