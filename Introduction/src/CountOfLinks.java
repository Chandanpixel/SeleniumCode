import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome", "C:\\Users\\CHANDASA\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//find the link in footer
		WebElement footerdriver = driver.findElement(By.id("gf-Big"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// find the link in footer on 1st column
		
	    WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		//click on each link is presented in the column and check the links are opening or not
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys("clickonTab");
			
			Thread.sleep(2000);
		}
		// opens all the tabs and get title of the page
				Set<String> abc=driver.getWindowHandles();//4
				Iterator<String> it=abc.iterator();
				
				while(it.hasNext())
				{
					
				   driver.switchTo().window(it.next());
				   System.out.println(driver.getTitle());
				
				}

		driver.close();
		
	}

}
