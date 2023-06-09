package SeleniumSessions;

import org.testng.annotations.Test;

public class ExpectedConditions {
	
	@Test(expectedExceptions = Throwable.class)
	public void homePageTest() {
		
		System.out.println("HOME PAGE TEST");
		int a = 9/0;
	}
	
	
	

}
