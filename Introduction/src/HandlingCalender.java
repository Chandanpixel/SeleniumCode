import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			Thread.sleep(2000);
			
			 driver.findElement(By.id("divpaxinfo")).click();

			   Thread.sleep(2000);

			   int i=1;

			while(i<3)

			{

			driver.findElement(By.id("hrefIncAdt")).click(); //2 times
			

			i++;

			}
			
			Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@value='Search']")).click();


			driver.quit();
			
	}

}
