package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomInsideIframe {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("pact");
		String tea_JSpath =" return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pizza = (WebElement)js.executeScript(tea_JSpath);
		
		pizza.sendKeys("masala chai");
		
	}

}
