package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openCartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		BrowserUtil b1 = new BrowserUtil();
		WebDriver driver = b1.initDriver("chrome");
		
		b1.lauchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		b1.getPageTitle();
		b1.getPageUrl();
		
		ElementUtil ele = new ElementUtil(driver);
		
		By email = By.id("input-email");
		
		By pwd = By.id("input-password");
		
		ele.doSendKeys(email,"dsaichitravathi@gmail.com");
		ele.doSendKeys(pwd,"chitra19");
		
		Thread.sleep(5000);
		
		ele.doSendKeys(email,null);
		ele.doSendKeys(pwd,"sainath19");
		
		
		//b1.quitBrowser();
		
		
		
		
		
		
		

	}

}
