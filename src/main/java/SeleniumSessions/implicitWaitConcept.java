package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		   
		driver.get("https://www.amazon.com/");	
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //DEPRECATED
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//imp wait : global wait
		//applicable for all elements by default
		//not applied to specific element
		//cannot not used to non web elements : title , url, alerts.
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
		
		String label =  driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
		
		System.out.println(label);
		
		// we need to override if we need to give other time.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//we dont use the implicit timeout in framework
		
		
		
		
		
		
		
	    

	}

}
