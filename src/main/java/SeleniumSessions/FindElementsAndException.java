package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// if the search element list-group-item11" is not found in findElements it creates the emptylist.
		//so size will be zero
		
		List<WebElement> links= driver.findElements(By.className("list-group-item11"));
		
		System.out.println(links.size());
		
		
		
		
		
		
		
		
		
		
	}

}
