package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocators {
	
    static WebDriver driver;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//          above
		// left  <---ele ---> right
		//          below
		
		
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("St Albert, Canada"));
		
		String rightsideele = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightsideele);
		String leftsideele = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftsideele);
		String aboveele = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveele);
		String belowele = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowele);
		String nearele = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearele);
		
		
		
		
		
		
		

	}

}
