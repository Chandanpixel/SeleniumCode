import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintro {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome- ChromeDriver > Method > close >get
		// Firefox -FirefoxDriver > Method > close > get
		// Safari - SafariDriver > Method > close > get

		// ChromeDriver driver = new ChromeDriver();

		// chrome driver.exe - chrome driver
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");

		// webdriver.chrome.driver > value of path
		WebDriver driver = new ChromeDriver();
		// load the webpage in new window
		driver.get("https://www.amazon.com/");

		System.out.println(driver.getTitle()); // get the title of the current page
		System.out.println(driver.getCurrentUrl()); // get the current url of the currentpage

		// Close the current window, quitting the browser if it's the last window
		// currently open.
		driver.close();
		// Quits this driver, closing every associated window
		// Don't use both close and quit
		// driver.quit();

		// Firefox

//          System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//
//          WebDriver driver1 = new FirefoxDriver();
//
//          //Microsoft Edge
//
//          System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//
//          WebDriver driver2 = new EdgeDriver();
//
//          driver.get("https://rahulshettyacademy.com");
//		
//		

	}

}
