package Test;

import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void Bike() {
		System.out.println("This is my Bike");
	}

	@Test(groups={"smoke"})

	public void Car() {
		System.out.println("This is my Car ");
	}

}
