package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// never use autoit --- it is only for windows - it wont work for remote machine , mac , linux 
		
		//robot class - only for windows
		
		//sikuli lib --- image based
		
		//sendkeys --- file path
		//type = file
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Ashok Pereddy\\OneDrive\\Desktop\\java\\links.txt");
		
		
		
		
		

	}

}
