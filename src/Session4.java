import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Session4 {

	public static void main(String[] args) throws InterruptedException {

		Scanner obj = new Scanner(System.in);
		System.out.println("Select any value from below For Google Chrome-1 Firefox-2 others-3");
		int value;
		value = obj.nextInt();

		if (value == 1) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			String value1 = driver.getTitle();
			System.out.println(value1);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("Mercedezbenz");
			// driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
			// Thread.sleep(5000);
			// System.out.println(driver.findElement(By.id("error-for-username")).getText());
			driver.findElement(By.linkText("Forgot password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Sig")).click();
			driver.close();
			System.out.println("Executed in Chrome browser");
		}

		else if (value == 2) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\00003944\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.linkedin.com/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			String value1 = driver.getTitle();
			System.out.println(value1);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("Mercedezbenz");
			driver.findElement(By.linkText("Forgot password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Sig")).click();
			driver.close();
			System.out.println("Executed in Firefox Browser");

		}

		else if (value >= 3) {
			System.out.println("Select any browser for execution as it is a invalid browser");
			System.out.println("Not Executed");
		}

	}

}
