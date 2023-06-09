package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocator_score {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/mumbai-indians-vs-punjab-kings-31st-match-1359505/full-scorecard");
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Atharva Taide']"));
		
		String wickettaker =   driver.findElement(with(By.xpath("//span[@class='ds-flex ds-cursor-pointer ds-items-center']")).toRightOf(ele)).getText();
		
		System.out.println(wickettaker);
	}

}
