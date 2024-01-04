package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day6 {
	
	
	@Test

	public void HomeLoan() {
		
		System.out.println("WebLogin");
	}
	
	@BeforeMethod

	public void Beforemethod() {
		
		System.out.println("I will execute before method");
	}

	@AfterMethod

	public void Aftermethod() {
		System.out.println("I will execute after method");
	}
}
