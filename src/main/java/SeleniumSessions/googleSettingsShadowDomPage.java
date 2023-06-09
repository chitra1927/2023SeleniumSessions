package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSettingsShadowDomPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(4000);
		
		String search_jspath = " return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement search = (WebElement)js.executeScript(search_jspath);
		
		search.sendKeys("notification");
		

	}

}
