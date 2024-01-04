package Test;


import org.testng.annotations.Test;

public class Day7 {
	
	
	@Test

	public void HomeLoan() {
		
		System.out.println("WebLogin");
	}
	
	@Test(groups={"smoke"})

	public void HomeLoanMObile() {
		
		System.out.println("Login with Mobile");
	}

	@Test

	public void HomeloanAPI() {
		System.out.println("Login with API");
	}
}
