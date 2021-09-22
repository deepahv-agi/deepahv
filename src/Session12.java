import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		String value=driver.getTitle();
		System.out.println(value);
		WebDriverWait tWait=new WebDriverWait(driver,20);
	    tWait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
	}

}
