package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextFieldValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		   
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId= driver.findElement(By.id("input-email"));
		
		emailId.sendKeys("dsaichitravathi@gmail.com");
		
		String text = emailId.getAttribute("value");
		
		System.out.println(text);
		
		
		
		

		
		
		
		
		

	}

}
