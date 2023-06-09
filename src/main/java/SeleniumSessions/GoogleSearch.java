package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	static WebDriver driver;
	
	public static void doSearch(String searchKey, By searchLocator, By suggestions ,String suggName) throws InterruptedException {
		
		
	   driver.findElement(searchLocator).sendKeys(searchKey);
	   Thread.sleep(3000);
	   
	   List<WebElement> sugg = driver.findElements(suggestions);
	   System.out.println("TOTAL SUGGESTIONS" +sugg.size());
	   
	  if (sugg.size()>0) {
		  
	         for(WebElement e : sugg) {
		   
		         String text = e.getText();
		         if(text.length()>0) {
			          System.out.println(text);
			          if(text.contains(suggName)) 
			          {
				           e.click();
				           break;
			          }   
		        }
		        else
		        {
			        System.out.println("BLANK VALUES");
			        break;
		        }  
		   
	        }
	  }
	  else
	  {
		  System.out.println("No search suggestions found");
	  } 
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		By search = By.name("q");
		
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		
		doSearch("google", search,suggestions,"maps");
		
		
		
		
		
		
		
		

	}

}
