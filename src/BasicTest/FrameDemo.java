package BasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		//inside frame 1
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html")).click();
		driver.switchTo().defaultContent();
		
		//inside frame 2
		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'JavascriptLibrary')]")).click();
		driver.switchTo().defaultContent();
		
		//inside frame3
		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'JavascriptLibrary')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
