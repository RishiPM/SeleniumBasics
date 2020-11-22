package BasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofTags {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
	}
}
