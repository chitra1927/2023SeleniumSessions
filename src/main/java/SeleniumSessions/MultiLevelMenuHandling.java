package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		multiLevelMenuChildMenuHandle("SHOP BY CATEGORY" , "Baby Care" , "Feeding & Nursing" , "Nursing Tools");
		
      
	}
	
	public static void multiLevelMenuChildMenuHandle(String level1LinkText, String level2LinkText , String level3LinkText , String level4LinkText) throws InterruptedException {
    	
    	WebElement parentMenu =  driver.findElement(By.linkText(level1LinkText));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(parentMenu).build().perform();
		
		Thread.sleep(1500);
		
        WebElement level2 =  driver.findElement(By.linkText(level2LinkText));
		
		act.moveToElement(level2).build().perform();
		
		Thread.sleep(1500);
		
        WebElement level3=  driver.findElement(By.linkText(level3LinkText));
		
		act.moveToElement(level3).build().perform();
		
		Thread.sleep(1500);
		
        driver.findElement(By.linkText(level4LinkText)).click();	
    	
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
