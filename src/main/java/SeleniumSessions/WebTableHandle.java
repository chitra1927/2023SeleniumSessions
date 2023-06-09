package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		
		selectUser("Joe.Root");
		
		selectUser("John.Smith");
		
		List<String> userInfo = getUserdetails("Joe.Root");
		
		System.out.println(userInfo);
		
	}
	
	public static void selectUser(String username) {
		
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	public static List<String> getUserdetails(String username) {
		
		List<WebElement> ele = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		
		List<String> detailsList = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			detailsList.add(text);
		}
		
		return detailsList;
		
		
	}

}
