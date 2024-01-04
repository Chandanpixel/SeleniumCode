import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome","C:\\Users\\CHANDASA\\Documents\\chromedriver.exe" );
		
	 driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Chandan");
		driver.findElement(By.name("email")).sendKeys("chandan.sahu@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("chandan123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown2 = new Select(dropdown);
		
		dropdown2.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("bday")).sendKeys("05/01/1999");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(2000);
     
		driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());


		Thread.sleep(2000);

		
		
		driver.close();
		
		
	}

}
