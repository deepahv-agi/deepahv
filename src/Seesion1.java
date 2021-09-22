	import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
	public class Seesion1 {
	
		
		//public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com");
			String value=driver.getTitle();
			System.out.println(value);
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='Help']")).click();
			Set<String> ids= driver.getWindowHandles();
			
			Iterator<String> its=ids.iterator();
			
			String pc=its.next();
			String cc=its.next();
			
			
			
			driver.switchTo().window(cc);
			//Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.quit();
			
		
	 
		}
	
	}
