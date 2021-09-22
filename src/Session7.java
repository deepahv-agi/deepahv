import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session7 
{
	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.mortgagecalculator.org/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("homeval")).sendKeys("2000");
	driver.findElement(By.id("downpayment")).sendKeys("200");
	driver.findElement(By.xpath("//input[@value='percent']")).click();
	if(driver.findElement(By.xpath("//input[@value='percent']")).isSelected())
	{
		System.out.println("PASS : Radio Button Selected");
	}
	else
	{
		System.out.println("FAIL : Radio Button Not Selected");
	}

	
	Select monthSelect=new Select(driver.findElement(By.name("param[start_month]")));
	monthSelect.selectByValue("12");
	Thread.sleep(5000);
	monthSelect.selectByIndex(4);
	Thread.sleep(5000);
	monthSelect.selectByVisibleText("Jul");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	
	
	String vMPay=driver.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
	System.out.println("Total Montly Payment is "+vMPay);
	
	Thread.sleep(5000);
	driver.close();
	
	
	
		
	}
	

}

