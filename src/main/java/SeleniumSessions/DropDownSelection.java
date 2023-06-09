package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 driver = new ChromeDriver();
	 
	 driver.get("https://demo.1crmcloud.com/login.php");
	 
	 By lang = By.id("login_lang");
	 
	 By theme = By.id("login_theme");
	 
	 //doSelectDropDownByIndex(lang , 2);
	 
	 //doSelectDropDownByVisibleText(lang ,"DE Deutsch");
	 
	doSelectDropDownByValue(lang, "de_DE");
	 
	 
	}
	
	public static void doSelectDropDownByIndex(By locator , int index){
		
	    Select select = new Select(getElement(locator));
	    
	    select.selectByIndex(index);
	}
	
   public static void doSelectDropDownByVisibleText(By locator , String text){
		
	    Select select = new Select(getElement(locator));
	    
	    select.selectByVisibleText(text);
	}
   
   public static void doSelectDropDownByValue(By locator , String val) {
		
	    Select select = new Select(getElement(locator));
	    
	    select.selectByValue(val);
	}
   
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	
	
	

}
