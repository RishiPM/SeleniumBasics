package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest_OrangeHRM_Firefox {

	public static void main(String args[]) {
		
		//open firefox
		//System.setProperty("webdriver.gecko.driver", "E://Coding//Driver//geckodriver-v0.27.0-win64//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//open microsoft edge
		System.setProperty("webdriver.edge.driver", "E://Coding//Driver//edgedriver_win64//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//enter login username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//enter login password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.name("Submit")).click();
		
		//find the title 
		String actual_title = driver.getTitle();
		String required_title = "OrangeHRM";
		
		//compare both titles 
		if(actual_title.equals(required_title)) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		
		//close the browser
		driver.close();
	}
}
