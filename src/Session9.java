import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session9 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int fValue = 4000;
		String str1 = String.valueOf(fValue);

		int cValue = 2000;
		String str2 = String.valueOf(cValue);

		int sValue = 3000;
		String str3 = String.valueOf(sValue);

		int mValue = 3000;
		String str4 = String.valueOf(mValue);

		int mOvalue = 4000;
		String str5 = String.valueOf(mOvalue);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("food")).sendKeys(str1);
		Thread.sleep(2000);
		driver.findElement(By.id("clothing")).sendKeys(str2);
		Thread.sleep(2000);
		driver.findElement(By.id("shelter")).sendKeys(str3);
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyPay")).sendKeys(str4);
		Thread.sleep(2000);
		driver.findElement(By.id("monthlyOther")).sendKeys(str5);
		Thread.sleep(2000);

		String mExpense = driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String mIncome = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		int A = (int) Float.parseFloat(mExpense);

		int B = (int) Float.parseFloat(mIncome);

		System.out.println("Monthly expense is" + A);
		System.out.println("Monthly Income is" + B);

		if (A > B)

		{
			System.out.println("Expense is Greater!!!!!");

		} else {
			System.out.println("Income is Greater.....");
		}

		driver.close();
	}
}
