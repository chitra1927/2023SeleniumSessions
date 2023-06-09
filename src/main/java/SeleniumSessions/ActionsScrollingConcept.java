package SeleniumSessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//Thread.sleep(2000);
		
		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		//refresh the page
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL);
		
		
		
		

	}

}
