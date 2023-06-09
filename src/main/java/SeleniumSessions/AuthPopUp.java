package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	String username = "admin";
	
	String password = "admin";
		
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(1000);
	
	driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		

	}

}
