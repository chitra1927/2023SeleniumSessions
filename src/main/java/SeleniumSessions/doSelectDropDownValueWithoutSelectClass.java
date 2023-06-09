package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class doSelectDropDownValueWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		boolean flag = doSelectDropDownValueWithoutSelect(countryOptions , "Naveen");
		
		System.out.println(flag);
		
	}
		
		public static boolean doSelectDropDownValueWithoutSelect(By locator , String dropDownvalue) {
			
			 boolean flag = false;
			 
		     List<WebElement> OptionsList = driver.findElements(locator);
		     
		     System.out.println("SIZE OF OPTIONLIST IS" + OptionsList.size());
		     
		     for(WebElement e : OptionsList) {
		    	 String text = e.getText();
		    	 System.out.println(text);
		    	 if(text.equals(dropDownvalue)) {
		    		 flag=true;
		    		 e.click();
		    		 break;
		    	 } 
		     }	
		     
		     if(flag= false) {
		    	 System.out.println("DROP DOWN VALUE IS NOT PRESENT");
		     }
		     
		     return flag;

		}
		
		

	}


