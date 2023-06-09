package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class getAttributeValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//getAttribute() method returns the value of the attribute.
		
		driver = new ChromeDriver();
		   
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
		
		//String ph =driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
		
		//String nm = driver.findElement(By.id("input-firstname")).getAttribute("name");
		
		//String ty = driver.findElement(By.id("input-firstname")).getAttribute("type");
		
		//String bb = driver.findElement(By.linkText("Login")).getAttribute("href");
		
		//System.out.println(ph);
		
		//System.out.println(nm);
		
		//System.out.println(ty);
		
		//System.out.println(bb);
		
		By fn = By.id("input-firstname");
		
		By loginlink = By.linkText("Login");
		
		String placeholder = dogetAttributeValue(fn,"placeholder");
		
		
		String hrefval = dogetAttributeValue(loginlink,"href");
		
		System.out.println(placeholder);
		
		System.out.println(hrefval);
	}
		
	   public static String dogetAttributeValue(By locator, String attrname) {
		   
		   return getElement(locator).getAttribute(attrname);
	   }
		
		public static WebElement getElement(By locator) {
			
			return driver.findElement(locator);
		}
		

}
