package TestNgSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
	//BeforeTest method executes only once and all the test cases will be executed and aftertest executes once.
	//test coverage probably less in beforetest than before method when there are n no of test cases.
	//before method and aftermethod executes for every test case.
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority = 1)
	
	public void searchExist() {
		
		boolean flag = driver.findElement(By.id("twotabsearchtextbox11")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
    @Test(priority = 2)
	
	public void HelpExist() {
		
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
    
   @Test(priority = 3)
	
	public void TitleTest() {
		
		String title = driver.getTitle();
		System.out.println("TITLE IS" +title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
   }
   
   @AfterMethod
   
   public void doQuit() {
	   
	   driver.quit();
   }
   
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
