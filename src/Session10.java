import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions mhover=new Actions(driver);
		
		mhover.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Your Account")).click();
		
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		//driver.close();
		
	//	//*[text()='text value']
		//(//*[contains(text(),'textvalue')])[2]
		
	}

}
