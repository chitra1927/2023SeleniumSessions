package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_getForm_Country");
		
		getAllDropDownOptions(country);
		
		if(getAllDropDownValueCount(country) == 233)
		{
			System.out.println("PASS");
		}
		
		List<String> optionValues =  getAllDropDownOptions(country);
		System.out.println(optionValues.contains("India"));
		System.out.println(optionValues.contains("Zambia"));
		
		doSelectDropDownValue(country,"Zimbabwe");

	}
	
    public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}  
    
    public static int getAllDropDownValueCount(By locator) {
    	
    	return getAllDropDownOptions(locator).size();
    }
	
	public static List<String> getAllDropDownOptions(By locator) {
		
	     Select select = new Select(getElement(locator));
	     
	     List<WebElement> OptionsList = select.getOptions();
	     
	     List<String> optionsValueList = new ArrayList<String>();
	     
	     System.out.println("SIZE OF OPTIONLIST IS" + OptionsList.size());
	     
	     for(WebElement e : OptionsList) {
	    	 
	    	 String text = e.getText();
	    	 System.out.println(text);
	    	 optionsValueList.add(text);
	     }	
	     
	     return optionsValueList;
	}
	
	public static void doSelectDropDownValue(By locator , String dropDownvalue) {
		
	     Select select = new Select(getElement(locator));
	     
	     List<WebElement> OptionsList = select.getOptions();
	     
	     System.out.println("SIZE OF OPTIONLIST IS" + OptionsList.size());
	     
	     for(WebElement e : OptionsList) {
	    	 String text = e.getText();
	    	 System.out.println(text);
	    	 if(text.equals(dropDownvalue)) {
	    		 e.click();
	    		 break;
	    	 } 
	     }	   

	}
	
	
	
	
	
	
	
	
	

}
