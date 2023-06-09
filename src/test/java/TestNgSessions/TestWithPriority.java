package TestNgSessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	
	//if no priority is given then executes based on the alphabetical order.
	//priority value can be -1,-100 likewise also
	//

		@Test(priority = 1)
		public void searchTest() {
			
			System.out.println("Test - search");
		}
		
		@Test
		public void addToCart() {
			
			System.out.println("Test - add to cart");
		}
		
		@Test(priority = 2)
		public void paymentTest() {
			
			System.out.println("Test - payment sucessful");
		}
		
		
		

	

}
