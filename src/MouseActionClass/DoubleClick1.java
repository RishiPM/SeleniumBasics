package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
