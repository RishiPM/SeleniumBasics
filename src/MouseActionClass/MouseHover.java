package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement admin_b = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement usern_b = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement user_b = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(admin_b).moveToElement(usern_b).moveToElement(user_b).click().build().perform();
	}
}
