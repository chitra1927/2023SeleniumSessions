package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationHandlle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
		
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='Ukraine']")).size() > 0)
			{
				
				selectCountry("Ukraine");
				break;
			}
			
			else
			{
				//pagination logic
				WebElement next = driver.findElement(By.linkText("Next"));
				
			    if(next.getAttribute("class").contains("disable")) {
			    	
			    	System.out.println("Pagination is over or country not found");
			    	break;
			    }
				next.click();
				Thread.sleep(1500);
				
			}
		}
		
		
	}

	public static void selectCountry(String countryName) {
		
		
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
		
	}
	
	
	
	
	
	
	
	
}
