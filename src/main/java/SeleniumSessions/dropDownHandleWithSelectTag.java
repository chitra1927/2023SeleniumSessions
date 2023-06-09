package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownHandleWithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.orangehrm.com/hris-hr-software-demo/
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_getForm_Country");
				
		WebElement ele = driver.findElement(country);
		
		//create object
		
		Select select = new Select(ele);
		
		//select.selectByIndex(5);
		
		//select.selectByVisibleText("Bhutan");
		
		//select.selectByValue("Dominica");
		
		//select.selectByVisibleText("chitra"); chitra is not present in drop down.
		
		//NoSuchElementException : Cannot locate option with text: chitra
		
		//select.selectByIndex(500);
		
		//NoSuchElementException : Cannot locate option with index: 500
		
		select.selectByIndex(1);

	}

}
