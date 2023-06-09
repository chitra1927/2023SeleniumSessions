package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	   WebDriver driver;
	    
	   public WebDriver initDriver(String browserName) {
		   
		   System.out.println("Browser name is :" + browserName);
		   
		  if(browserName == null) {
			  System.out.println(" browser name is null");
			  throw new MyException("NULLPOINTEREXCEPTION");
			  
		  }
		   
		  switch(browserName) {
		  case "chrome" :
			  driver = new ChromeDriver();
			  break;
		  case "firefox":
			  driver = new FirefoxDriver();
			  break;
		  case "safari":
			  driver = new SafariDriver();
			  break;
		  case "edge":
			  driver = new EdgeDriver();
			  break;
		  default :
			  System.out.println("please enter valid browser");	 
			  throw new MyException("INVALIDBROWSERNAME");
		  }
		  return driver;
		  
	   }
		  
		  
		  public void lauchUrl(String url) {
			  
			  if (url == null) {
				  System.out.println("ENTERED URL IS NULL");
				  throw new MyException("NULLPOINTEREXCEPTION");
			  }
			  
			  if( url.contains("http")) {
				  
				  driver.get(url);
			  }
			  
			  else
			  {
				  System.out.println("http is missing");
			  }
			    
			  
		  }
		  
		  
		  public String getPageTitle() {
			  return driver.getTitle();
		  }
		  
		  public String getPageUrl() {
			  return driver.getCurrentUrl();
		  }
		  
		  public void quitBrowser() {
			  driver.quit();
		  }
		  

	}

