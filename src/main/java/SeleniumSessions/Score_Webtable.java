package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Score_Webtable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/mumbai-indians-vs-punjab-kings-31st-match-1359505/full-scorecard");
		Thread.sleep(4000);

		String wicketTakerName = getWicketTakerName("Matthew Short");
		System.out.println(wicketTakerName);
		System.out.println(getPlayerDetails("Matthew Short"));
	}
		
	public static String getWicketTakerName(String playerName) {
			
			
			return driver.
		       findElement
		                  (By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td//span")).getText();
		                            
		}
	

   public static List<String> getPlayerDetails(String playerName) {
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td//following-sibling::td[contains(@class, 'ds-text-right')]"));
		
		List<String> playersList = new ArrayList();
		
		for(WebElement e : ele) {
			
			String text= e.getText();
			playersList.add(text);
		}
		
		return playersList;
		
		
	}
   
}


