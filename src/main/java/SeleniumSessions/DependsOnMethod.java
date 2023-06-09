package SeleniumSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	//In parallel execution we never use dependency.


	@Test
	public void HomePageTest() {
		
		System.out.println("home page - test");
	}
	
	@Test(dependsOnMethods = "HomePageTest")
	public void searchTest() {
		
		System.out.println("search - test");
	}
	
	@Test(dependsOnMethods = "searchTest")
    public void addToCartTest() {
		
		System.out.println("cart- test");
	}


}





//Arrange , Act , Assertion

//test cases should be independent

//CURD

//createUserTest  - create a new user - assert

//getUserTest  - create a new user + get the same user + assert


//updateUserTest -create a new user + get the same user + update + assert


//deleteUserTest -create a new user + get the same user + delete + assert



