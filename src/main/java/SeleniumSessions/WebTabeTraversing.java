package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabeTraversing {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	System.out.println(columnCount());
	System.out.println(getColumnvalues());
	System.out.println(getTableData());
	
	List<String> scv = getSpecificColumnvalues("Company");
	System.out.println(scv);
	
	
	//table[@id="customers"]/tbody/tr[2]/td[1]
	
	//table[@id="customers"]/tbody/tr[7]/td[1]
	
	
	//String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
	
	//String afterXpath = "]/td[1]";
	
	//for(int row=2;row<=rowCount();row++) {
		
	//	String fullxpath = beforeXpath+row+afterXpath ;
	//	String text = driver.findElement(By.xpath(fullxpath)).getText();
	//	System.out.println(text);
	//}
	
	}
	
	
	public static int columnCount() {
		
	  return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
	}
	
    public static List<String> getColumnvalues() {
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		
		List<String> coumnValues = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			coumnValues.add(text);
		}
		
		return coumnValues;	
	}
    
    public static int rowCount() {
		
  	  return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
  	}
    
    public static List<String> getTableData() {
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id='customers']/tbody//td"));
		
		List<String> TableValues = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			TableValues.add(text);
		}
		
		return TableValues;	
	}
    
     public static List<String> getSpecificColumnvalues(String columnnme) {
		
		List<WebElement> ele = driver.findElements(By.xpath("//th[text()='"+columnnme+"']/parent::tr/following-sibling::tr/td[1]"));
		
		List<String> specificCoumnValues = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			specificCoumnValues.add(text);
		}
		
		return specificCoumnValues;	
	}
    
    
    
    
  //th[text()='Company']/parent::tr/following-sibling::tr/td[1]
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    

}
