package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //*The isDisplayed method in Selenium verifies if a certain element is present and displayed. 
	   //*If the element is displayed, then the value returned is true. If not, then the value returned is false.
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.amazon.com/");
	   
	   //Boolean flag = driver.findElement(By.id("twotabsearchtextbox")). isDisplayed();
	   
	   //System.out.println(flag);
	   
	   By search = By.id("twotabsearchtextbox");
	   
	   ElementUtil ele = new ElementUtil(driver);
	   
	   if(ele.doIsElementDisplayed(search)){
		   
		   ele.doSendKeys(search, "laptop");
	   }
	   else
	   {
		   System.out.println("search is not present");
	   }
	   
	   //two methods to find if element is displayed or not
	   
	   //1.findElement
	   
	   //2.findElements
	   
	   if(driver.findElement(search).isDisplayed()) {
		   System.out.println("YES");
	   }
	   else
	   {
		   System.out.println("NO");
	   }
	   
	   if(driver.findElements(search).size()>0) {
		   
		   System.out.println("element is displayed");
		   
	   }
	   else
	   {
		   System.out.println("element is not displayed");
	   }

}
	
}
