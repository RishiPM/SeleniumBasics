package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/slider");
		Thread.sleep(2000);
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frames);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(slider).dragAndDropBy(slider, 89, 0).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
