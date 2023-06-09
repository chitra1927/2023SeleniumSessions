package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	//	pop up :
		
	//	1.alert
	//  2.prompt
	//  3.confirm
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
	//Alert alert = driver.switchTo().alert();
	//String alertText = alert.getText();
	//System.out.println(alertText);
	//alert.accept();
	
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Thread.sleep(4000);
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	System.out.println(alertText);
	alert.accept();
	
	
    //driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	//Thread.sleep(4000);
	//Alert alert = driver.switchTo().alert();
	//alert.sendKeys("chitra");
	//String alertText = alert.getText();
	//System.out.println(alertText);
	//alert.accept();
	
	//NoAlertPresentException: no such alert
	//  (Session info: chrome=112.0.5615.138)
	
	
	
	
	
	
	
	
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
