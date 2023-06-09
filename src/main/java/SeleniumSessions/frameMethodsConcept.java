package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameMethodsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		By framelocator = By.xpath("//frame[@src='top.html']");
		
		
	
		List<WebElement> ele = driver.findElements(By.xpath("//frame"));
		
		System.out.println(ele.size());
		
		
		//ways to switch to frame
		//driver.switchTo().frame("main");  // name/id
		//driver.switchTo().frame(2);         // index not recommended
		
		
		driver.switchTo().frame(driver.findElement(framelocator));
		
		
		String title = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(title);
		
		
		
		
		
		

	}

}
