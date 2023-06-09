package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		//page to frame1 : 
		//driver.switchTo().frame("pact1");
		//driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("veda");
		
		
		
		//any frame to page:
		//driver.switchTo().defaultContent();
		
		
		//page to frame2
		// we need to go frame1 and then to frame2
		
		//driver.switchTo()
		//               .frame("pact1")
		//                       .switchTo().frame("pact2")
		//                            .findElement(By.xpath("//input[@id='jex']")).sendKeys("prabhas");
		
		//page to frame3:
		//we need to go to frame1 then frame2 then to frame3
		driver.switchTo()
                       .frame("pact1")
                                .switchTo().frame("pact2")
                                           .switchTo().frame("pact3")
                                                            .findElement(By.xpath("//input[@id='glaf']")).sendKeys("husband");
		
		
		//frame3 to frame1.
		
		driver.switchTo()
                   .parentFrame()
                          .switchTo().parentFrame()
                                             .findElement(By.xpath("//input[@id='inp_val']")).sendKeys("husband");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
