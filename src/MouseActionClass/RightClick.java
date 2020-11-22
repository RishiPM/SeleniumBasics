package MouseActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println("Text present in the alert window :: "+alt.getText());
		
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
