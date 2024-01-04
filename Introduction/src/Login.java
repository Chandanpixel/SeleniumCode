import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		
		driver.findElement(By.id("chkboxOne")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(2000);
        
//    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in." );
//    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	

}
