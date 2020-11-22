package WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationPractice {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open webpage
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame(0);
		
		//fill details
		driver.findElement(By.xpath("//body[contains(@class,'variant-wide')]")).sendKeys("Rishi");
	}
}
