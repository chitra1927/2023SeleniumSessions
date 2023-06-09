package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SessionIdConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com/");
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
		//driver.quit();
		driver.close();
		
		driver.get("https://google.com/");
		//once we close the session the current ession id becomes invalid.
		//so if we try to launch the browser it throws invalid session id exception.
		//in case we need to lauch the browser, we need to intialize the driver first and then lauch.
		// org.openqa.selenium.NoSuchSessionException: invalid session id
		//once we quit session id becomes null.
		//so if we try to lauch the browser it throws session id = null exception.
		//in case we need to lauch the browser, we need to intialize the driver first and then lauch.		
		// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
	
	}
	

}
