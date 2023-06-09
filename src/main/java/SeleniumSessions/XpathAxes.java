package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		   
		driver.get("https://www.amazon.com/");	
		
		
		// direct : /
		
		// indirect : //(gives both direct and indirect childs)
		
		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		
		//form[@id='hs-login']/child::div
		
		//form[@id='hs-login']/div
		
		//form[@id='hs-login']//div
		
		//form[@id='hs-login']//child::div
		
		// child to parent : back traversing in x path
		
		//input[@id='username']/parent::div
		
		//input[@id='username']/parent::div/parent::div
		
		//input[@id='username']/../../../../../..
		
		//input[@id='username']/ancestor::div
		
		//preceding sibling  and following sibling
		
		//input[@id='input-email']/preceding-sibling::label
		
		
		//label[@class='control-label']/following-sibling::input[@id='input-email']
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		
		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");
		
	}
		public static void getColumnValues(String columnName) {
			
			
		List<WebElement> ele =driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		System.out.println("VALUES OF COLUMN: " +columnName);
		for(WebElement e : ele) {
			
			String text = e.getText();
			System.out.println(text);
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}


