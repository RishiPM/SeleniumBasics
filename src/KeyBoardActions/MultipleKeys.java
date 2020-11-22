package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleKeys {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Approach1
	    //js.executeScript("window.scrollBy(0,2000)","");
		
		//Approach2
		//WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		
		//Appraoch3 - till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}
