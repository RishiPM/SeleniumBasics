package TablesDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		Thread.sleep(3000);
		
		//start with the pages
		
		WebElement pages = driver.findElement(By.xpath("//ul[@id='myPager']"));
		
		List <WebElement> links = pages.findElements(By.tagName("a"));
		
		for(WebElement e : links) {
			System.out.println(e.getText());
		}
		
		//click on each page and extract data from each table
		
		int size_page = links.size();
		
		System.out.println("Number of links = " +size_page);
		
		if(size_page>0) {
			
			System.out.println("Links present");
			for(int i=1;i<size_page-1;i++) {
				
				driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]")).click();
				
				int no_of_rows = driver.findElements(By.xpath("//tbody[@id='myTable']//tr")).size();
				int no_of_column = driver.findElements(By.xpath("//tr[1]//td")).size();
				
				for(int r=1;r<=no_of_rows;r++)
				{
					for(int c=1;c<no_of_column;c++) {
						String col1=driver.findElement(By.xpath("//tr["+r+"]//td["+c+"]")).getText();
						System.out.print(col1+"  ");
					}
					System.out.println();
				}				
			}
		}
		
		//close the browser
		driver.close();
	}
}
