package Date_And_Etc;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();
		
        Set <String> handle_value = driver.getWindowHandles();
        
        for(String s : handle_value) {
        	
        	System.out.println(s);
        	String title = driver.switchTo().window(s).getTitle();
        	
        	if(title.equals("SeleniumHQ Browser Automation")) {
        		driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
        	}
        }
        
		driver.quit();
	}
}
