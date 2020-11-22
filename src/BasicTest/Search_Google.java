package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Google {

	public static void main(String args[]) throws InterruptedException{
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open google
		driver.get("https://www.google.com/");
		
		//type a search key
		driver.findElement(By.name("q")).sendKeys("Dogs Image");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//click on google Search
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
