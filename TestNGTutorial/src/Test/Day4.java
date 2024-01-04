package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@AfterTest
	public void CarLoan() {
		
		System.out.println("WebLogin");       // Execute Last
	}
	
	@BeforeTest

	public void CarLoanMObile() {
		
		System.out.println("Login with Mobile");   // Execute first
	}

	@Test

	public void CarloanAPI() {
		System.out.println("Login with API");      // Midddle 
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("I am the First ");
	}
	
}
