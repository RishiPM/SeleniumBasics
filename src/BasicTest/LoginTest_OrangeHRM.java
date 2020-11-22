package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_OrangeHRM {

	public static void main(String args[]) {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//type username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//type password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//click login button
		driver.findElement(By.name("Submit")).click();
		
		//capture title of the page
		String actual_title = driver.getTitle();
		String required_title = "OrangeHRM";
		
		//compare the title using equals method
		
		if(actual_title.equals(required_title)) {
			System.out.println("Test Case Success");
		}
		else {
			System.out.println("Test Case failed");
		}
		
		//close the browser
		driver.close(); //-> to close one tab
		//driver.quit() ->to close all tabs
		
		
		}
}
