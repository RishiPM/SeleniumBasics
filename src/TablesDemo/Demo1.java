package TablesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
				
		int size_of_table = driver.findElements(By.xpath("//body//tbody//tr")).size();
		
		System.out.println(size_of_table);
		
		int count = 0;
		
		for(int i=1;i<=size_of_table;i++) {
			String value = driver.findElement(By.xpath("//tr["+i+"]//td[5]")).getText();
			//System.out.println(value);
			if(value.equals("Enabled")) {
				count++;
			}
		}
		
		System.out.println("Number of Enabled = " + count);
		
		driver.close();
	}
}
