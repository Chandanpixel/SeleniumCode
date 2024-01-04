import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://amazon.com");
		
		Actions a = new Actions(driver);
		
	WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	//	a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
	// pass string in the searchbpox 
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).doubleClick().sendKeys("hello");
		
		Thread.sleep(2000);
		//move to specific element
		a.moveToElement(move).build().perform();

		driver.quit();
	}
		
	}
	
	


