package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(2000);
		
		WebElement frame_v = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame_v);
		
		WebElement age = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		
		String value = age.getAttribute("title");
		
		System.out.println("Tootltip text = " +value);
	}
}
