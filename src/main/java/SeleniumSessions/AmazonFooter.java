package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//td/a"));
		
		System.out.println(ele.size());
		
		for(WebElement e : ele) {
			
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
