package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingLastFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**** checking whether the last element in the table is Amazon Renewed****/
	
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("(//table[@class='navFooterMoreOnAmazon']//td//a)[last()]"));
		
		String text = ele.getText();
		
		System.out.println(text);
		
		if(text.contains("Amazon Renewed")) {
			
			System.out.println("PASS");
		}
		else {
			
			System.out.println("fail");
		}
		
			
	}

	}

