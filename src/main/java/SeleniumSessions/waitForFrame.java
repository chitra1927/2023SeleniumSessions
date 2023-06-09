package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForFrame {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		//driver.switchTo().frame("mainpanel");
		
		waitForFrameAndSwitchToItByIdOrName("mainpanel",10);
		
		driver.findElement(By.linkText("CONTACTS")).click();
		

	}
	
	public static void waitForFrameAndSwitchToItByIdOrName(String frameIdOrName ,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		driver.switchTo().frame(frameIdOrName);
	}

}
