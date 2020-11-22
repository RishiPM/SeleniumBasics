package KeyBoardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterKey {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		//Thread.sleep(30000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
