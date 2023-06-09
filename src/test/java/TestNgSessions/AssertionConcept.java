package TestNgSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	
	@Test
	public void searchTest() {
		
		String name = "macbook";
		Assert.assertEquals(name, "macbook");	
	}
	
	@Test
	public void sumTest() {
		
		int a= 10;
		int b=20;
		int c = a+b;
		Assert.assertEquals(c, 30);
	}
	
	@Test
	public void nameTest() {
		
		String name = "lakshmi";
		Assert.assertNotNull(name);	
	}
	
	@Test
	public void isElementDisplayed() {
		
		String loginbtn = "loginAmazonButton";
		Assert.assertTrue(loginbtn.contains("AmazonButton"));	
	}
	
	@Test
	public void isUserInActive() {
		
		Boolean userinactive = true;
		Assert.assertTrue(userinactive);	
	}
	
	
	
	
	
	
	

}
