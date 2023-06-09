package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        driver = new ChromeDriver();
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(driver.findElement(firstName), "chitra")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys("Duttala")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys("dsaichitravathi@gmail.com")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys("984-944-3104")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys("chitra123")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys("chitra123")
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys(Keys.TAB)
		//                                            .sendKeys(Keys.TAB)
		//                                            .click()
		//                                            .sendKeys(Keys.TAB)
		//                                            .click()
		//                                            .build()
		//                                            .perform();
		
		
		driver.get("https://www.amazon.com/");
		
		act.sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys("mackbook")
		   .sendKeys(Keys.ENTER)
		   .build().perform();
		
	}

}
