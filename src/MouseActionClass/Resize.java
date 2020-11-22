package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/resizable");
		Thread.sleep(2000);
		
		WebElement frame_addr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame_addr);
		
		WebElement size_button = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.moveToElement(size_button).dragAndDropBy(size_button, 80, 30).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
