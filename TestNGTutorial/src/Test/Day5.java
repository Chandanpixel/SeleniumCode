package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;



public class Day5 {
	
	
	@AfterTest
	public void CarLoan() {
		
		System.out.println("WebLogin");       // Execute Last
	}
	
	public void AfterSuite() {
		System.out.println("I am the last ");
	}
	
	@BeforeTest
	public void CarLoanMObile() {
		
		System.out.println("Login with Mobile");   // Execute first
	}

	@Test

	public void CarloanAPI() {
		System.out.println("Login with API");      // Midddle 
	}
	
	
	
	
}
