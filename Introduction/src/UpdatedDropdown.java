import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");

		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		 //Select checkBox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		  
	  	  
		
		  driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   int i=1;

		while(i<6)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//5 times

		i++;

		}

//		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		for(int i=1;i<5;i++)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//
//		driver.findElement(By.id("btnclosepaxoption")).click();
//
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText();


  	  
  	 driver.close();

	  
		
		
	}

}
