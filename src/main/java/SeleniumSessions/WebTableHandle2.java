package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	driver = new ChromeDriver();
	driver.get("https://classic.crmpro.com/");
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("Selenium@12345");
	driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	
	Thread.sleep(4000);
	
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.linkText("CONTACTS")).click();
	
	Thread.sleep(4000);
	
	/*//a[text()='Abel Kainan']/parent::td/preceding-sibling::td/child::input[@type='checkbox']*/
	
	selectUser("Abel Kainan");
	selectMultipleUser("Ali khan");
	String companyName = getCompanyName("Abel Kainan");
	System.out.println(companyName);
	
	List<String> userDetails = getUserdetails("Ali khan");
	System.out.println(userDetails);
	
	
	}
	
	public static void selectUser(String username){
		
		driver.
		       findElement
		                  (By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']"))
		                            .click();
		       
	}
	
	// (//a[text()='Ali khan'])/parent::td/preceding-sibling::td/input[@type='checkbox']
	
	public static void selectMultipleUser(String username) {
		
		
	List<WebElement> contactChecks = 	driver.
	          findElements
	                  (By.xpath("(//a[text()='"+username+"'])/parent::td/preceding-sibling::td/input[@type='checkbox']"));
	
	for(WebElement e : contactChecks) {
		
		e.click();
	}
	
	}
	
	
	public static String getCompanyName(String username) {
		
	 return driver.
	       findElement
	                  (By.xpath("//a[text()= '"+username+"']/parent::td/following-sibling::td/a[@context='company']"))
		               .getText();
		               
		
	            
	}
	
   public static List<String> getUserdetails(String username) {
		
		List<WebElement> ele = driver.findElements(By.xpath("(//a[text()='"+username+"'])/parent::td/following-sibling::td"));
		
		List<String> detailsList = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			detailsList.add(text);
		}
		
		return detailsList;
		
		
	}
	
	

	
	
	
	
	
	
	
	
	

	}


