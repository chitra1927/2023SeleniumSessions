package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		//By locators
		//1 . id - unique attribute
	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// 2 . name - non unique attribute
		//driver.findElement(By.name("firstname")).sendKeys("chitra");
		
		//driver.findElement(By.name("lastname")).sendKeys("duttala");
		
		//driver.findElement(By.name("agree")).click();
		
		//By fname = By.name("firstname");
		//By lname = By.name("lastname");
		//By box  = By.name("agree");
		
		//ElementUtil e1 = new ElementUtil(driver);
		
		//e1.doSendKeys(fname,"chitra");
		
		//e1.doSendKeys(lname,"duttala");
		
		//e1.doClick(box);
		
		
		//3 .classname - non unique attribute
		//driver.findElement(By.className("form-control")).sendKeys("chitra");
		
		
		//4.Xpath : it is not an attribute .it is the adddress of the element in the html dom.
		//can be unique nd can be duplicate.
		
		
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("chitra");
		
		//driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("duttala");
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
		
		//5 . css selector  : it is not a attribute.
		//driver.findElement(By.cssSelector("#input-firstname")).sendKeys("chitra");
		
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("chitra");
		
		//driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
		
		//driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		
		
		//6.linkText : only for links
		
		//driver.findElement(By.linkText("Login")).click();
		
		//7. partial link text
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		// tagname : html tag
		
		
		String header = driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(header);
		
		if(header.equals("Register Account"))
		{
			System.out.println("PASS");
		}
		
		
		
		// we cn use getText whenever we need to get the text data.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
