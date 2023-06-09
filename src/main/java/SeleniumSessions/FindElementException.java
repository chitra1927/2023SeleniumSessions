package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        
        //org.openqa.selenium.NoSuchElementException: no such element:  [name='search11']
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
        driver.findElement(By.name("search11")).sendKeys("macbook");
		
		
	}

}
