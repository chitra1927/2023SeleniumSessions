package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame-one748593425']")));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("vehicle registration");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("cary");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("2023-04-30");
		
		driver.findElement(By.xpath("//textarea[@id='RESULT_TextArea-5']")).sendKeys("Regarding vehicle registrtion");
		
		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\\\Users\\\\Ashok Pereddy\\\\OneDrive\\\\Desktop\\\\java\\\\links.txt");
		
		driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-13']/option[@value='Radio-2']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
