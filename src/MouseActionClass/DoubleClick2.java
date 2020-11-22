package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		Thread.sleep(3000);
		
		WebElement frm = driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe"));
		
		driver.switchTo().frame(frm);
		
		WebElement blck = driver.findElement(By.xpath("//html//body//div"));
		
		Actions act = new Actions(driver);
		act.doubleClick(blck).build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
