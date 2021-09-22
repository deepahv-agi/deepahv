import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Session5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		//String value=driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("homeval")).sendKeys("3000");
		driver.findElement(By.id("downpayment")).sendKeys("2000");
		//driver.findElement(By.name("cal")).click();
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		String trepay=driver.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
		System.out.println("The Total Monthly Repayment is" +trepay);
		driver.close();
		
	//xpath ://tagname[@attribute='value']  $x("//input[@value='Calculate']")
		
	//	$x("//div[@class='repayment-block']/div[1]/div[1]/h3")
		//
 
	}
}