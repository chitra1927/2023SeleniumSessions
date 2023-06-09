package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		WebDriver driver = null;
		switch(browser){
			case "firefox":
				driver = new FirefoxDriver();
				driver.get("https://www.amazon.com/");
				String title = driver.getTitle();
				System.out.println(title);
				break;
			case "safari":
				driver = new SafariDriver();
				driver.get("https://www.amazon.com/");
				String title1 = driver.getTitle();
				System.out.println(title1);
				break;
			case "chrome":
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(co);
				driver.get("https://www.amazon.com/");
				String title2 = driver.getTitle();
				System.out.println(title2);
				break;
			default:
			    System.out.println("entered browser is not found");
				break;
				
		}
		

	}

}
