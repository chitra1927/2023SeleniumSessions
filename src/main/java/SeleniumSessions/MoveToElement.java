package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
    static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		
		By ContentParentMenu = By.className("menulink");
		
		By CoursesChildMenu = By.linkText("COURSES");
		
		//handleTwoLevelMenu(ContentParentMenu,CoursesChildMenu);
		
		handleTwoLevelMenu(ContentParentMenu,"COURSES");
		

	}
	
	public static void handleTwoLevelMenu(By ParentMenu,By ChildMenu) throws InterruptedException {
		
		WebElement Menu = driver.findElement(ParentMenu);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Menu).build().perform();	
		
		Thread.sleep(2000);
		
		driver.findElement(ChildMenu).click();
		
	}
	
	
    public static void handleTwoLevelMenu(By ParentMenu, String ChildMenuLinkText) throws InterruptedException {
		
		WebElement Menu = driver.findElement(ParentMenu);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Menu).build().perform();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText(ChildMenuLinkText)).click();
		
	}

}
