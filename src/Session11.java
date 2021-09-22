import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00003944\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		
		String dTitle=driver.findElement(By.className("entry-title")).getText();
		System.out.println(dTitle);
		
		int vLinks=driver.findElements(By.tagName("a")).size();
		System.out.println(vLinks);
		
		String href=driver.findElement(By.tagName("a")).getAttribute("href");
		
		if (href.contains("Draggable"))
		{
			driver.findElement(By.tagName("a")).click();
			Thread.sleep(5000);
		}
			
			
			
		
		
		driver.switchTo().frame(0);
		Actions dDrop=new Actions(driver);
		
		
		
		
		WebElement dSource=driver.findElement(By.id("draggable"));
		WebElement dTarget=driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		dDrop.dragAndDrop(dSource, dTarget).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println(dTitle);
		
		
		//driver.close();
		
	//	//*[text()='text value']
		//(//*[contains(text(),'textvalue')])[2]
		
	}

}
