import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Downloads\\chromedriver_win32 (3)");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users\\CHANDASA\\Documents//screenshot.com"));
		
		
	}
	

}
