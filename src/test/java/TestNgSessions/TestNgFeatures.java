package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFeatures {
	
	
	//global pre conditions
	
	//pre conditions
	
	//test steps- actaul vs expected result - pass/fail
	
	// post steps
	
	// global post steps
	
	//before suite
	
	//before test
	
	//before class
	
	//before method
	
	//tests
	
	//after method
	
	//after class
	
	//after test
	
	//after suite
	
	//1
	@BeforeSuite
	public void DBConnection(){
		
		System.out.println("BS - DB CONNECTION ESTABLISHED");
	}
	//2
	@BeforeTest
    public void createUser(){
		
		System.out.println("BT - create user");
	}
	
	//3
	@BeforeClass
    public void OpenBrower(){
		
		System.out.println("BC - open browser");
	}
	//4,7,10
	@BeforeMethod
	public void LoginToApp() {
		
		System.out.println("BM - login to app");
	}
	//11
	@Test
    public void searchTest() {
		
		System.out.println("Test - search");
	}
	//5
	@Test
    public void addToCart() {
		
		System.out.println("Test - add to cart");
	}
	//8
	@Test


	//6,9,12
	@AfterMethod
    public void logout() {
		
		System.out.println("AM - login");
	}
	//13
	@AfterClass
    public void closeBrowser() {
		
		System.out.println("AC - close the browser");
	}
	//14
	@AfterTest
    public void DeleteUser(){
		
		System.out.println("AT - create user");
	}
	//15
	@AfterSuite
    public void CloseDBConnection(){
		
		System.out.println("AS - DB CONNECTION closed");
	}
	
}
