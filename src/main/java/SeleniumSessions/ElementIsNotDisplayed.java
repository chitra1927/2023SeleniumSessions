package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.BiDiException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsNotDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver = new ChromeDriver();
		   
		driver.get("https://www.amazon.com/");	
		
		By search = By.id("twotabsearchtextbox11");
		
		getElement(search);
		
	}
		
		public static WebElement getElement(By locator) {
			
			WebElement element = null;
			try {
				element = driver.findElement(locator);
			}
			catch(NoSuchElementException e){
				
				System.out.println("ENTERED ELEMENT IS NOT FOUND USING LOCATOR" +locator);
				
				try {
					System.out.println("ENTERED ELEMENT IS NOT FOUND USING LOCATOR" +locator);
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				element = driver.findElement(locator);
			}
			
			return element;
			
		}
		
		
		
}

