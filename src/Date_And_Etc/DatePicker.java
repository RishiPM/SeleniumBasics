package Date_And_Etc;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static ChromeDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		//maximize screen
		driver.manage().window().maximize();
		
		//open web page
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//click on date 
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		
		String month="June";
		String date="25";
		
		selectCurrentDate();
	}
	
	static void selectCurrentDate() throws InterruptedException{
		
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		
		String s_date = String.valueOf(date);
		
		Thread.sleep(2000);
		driver.findElement(By.linkText(s_date)).click();
	}
}
