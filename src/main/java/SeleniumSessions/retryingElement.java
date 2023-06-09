package SeleniumSessions;

import java.sql.Driver;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retryingElement {
	
	static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		
		
	}
	
	
	public WebElement getElement(By locator,int timeout) {
    	
		int attempts = 0;
		WebElement element = null;
		
		while(attempts < timeout) {
			
			try {
				element = driver.findElement(locator);
				System.out.println("element  found" +locator);
				break;
			}
			catch(NoSuchElementException e){
				System.out.println("element not found" +locator);
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e1){
					e1.printStackTrace();
				}
				
			}
			attempts++;
				
		}
		if(element == null) {
			
			System.out.println("element is not found"+timeout);
		}
		
		return element;
		
    }
	

	
	
	

}
