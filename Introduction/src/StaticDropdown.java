import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3); // USD
		dropdown.selectByVisibleText("AED"); //AED
		dropdown.selectByValue("INR"); //INR
		
		
		
		driver.close();
	}

}
