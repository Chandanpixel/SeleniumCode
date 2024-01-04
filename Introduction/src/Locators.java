import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Locators By id,name,ClassName,TagName,LinkText,PartialLinkText

		driver.findElement(By.id("inputUsername")).sendKeys("Chandan");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");

		driver.findElement(By.className("signInBtn")).click();
		// css selector
		// By id- TagName#id eg.Input#inputname
		// By class -TagName.classname eg.Button.SignInbutton
		//
		// TagName[attribute='value'] eg.Input[placeholder='username']

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ChandanSahu");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("chandan@gmail.com");

		// driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7787906787");

		// driver.findElement(By.className("reset-pwd-btn")).click();

		driver.close();
	}

}
