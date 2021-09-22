import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select searchIn = new Select(driver.findElement(By.xpath("//*[@name='url']")));
		searchIn.selectByVisibleText("Deals");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung zfold3");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
        //By relative xpath
		driver.findElement(By.xpath("//*[@class='a-icon a-icon-checkbox']")).click();
		
		//By Text Xpath
		//driver.findElement(By.xpath("//*[text()='Include Out of Stock']")).click();
		
		//By absolute path 
		//driver.findElement(By.xpath("//li[@id='p_n_availability/1318485031']/span/a/div/label/i")).click();
		
		//By partial text xpath
		//driver.findElement(By.xpath("//*[contains(text(),'Out of')]")).click();
		Thread.sleep(2000);
		String fold3 = driver
				.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
		Thread.sleep(5000);
		System.out.println(fold3);
		if (fold3.contains("fold")) {
			System.out.println("It contains fold3");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(5000);
		String value = driver.getTitle();
		System.out.println(value);
		if (value.contains("fold")) {
			System.out.println("It contains fold3");
		} else {
			System.out.println("Fail");
		}

		Thread.sleep(5000);
		driver.close();
		System.out.println("End of test");

	}

}
