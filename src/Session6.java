import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Session6
{
	
	public static String SearchData="Selenium";

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchData);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
	String vSearch=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
	System.out.println(vSearch);
	
	if (SearchData.equals(vSearch))
	{
		System.out.println("Value matches");
		
	}
	else
	{
		System.out.println("Value doesnt matches");
	}
	
	Thread.sleep(5000);
	driver.close();
	
	}
	
	
	
	
	}




