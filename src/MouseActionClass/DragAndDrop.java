package MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement rome_source = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy_target = driver.findElement(By.xpath("//div[@id='box106']"));
		
		WebElement oslo_source = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway_target = driver.findElement(By.xpath("//div[@id='box101']"));
		
		WebElement washington_source = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us_target = driver.findElement(By.xpath("//div[@id='box103']"));
		
		WebElement madrid_source = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain_target = driver.findElement(By.xpath("//div[@id='box107']"));
		
		WebElement copenhaean_source = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark_target = driver.findElement(By.xpath("//div[@id='box104']"));
		
		WebElement seoul_source = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southkorea_target = driver.findElement(By.xpath("//div[@id='box105']"));
		
		WebElement stockholm_source = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden_target = driver.findElement(By.xpath("//div[@id='box102']"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.dragAndDrop(oslo_source, norway_target).build().perform();
		act.dragAndDrop(stockholm_source, sweden_target).build().perform();
		act.dragAndDrop(copenhaean_source, denmark_target).build().perform();
		act.dragAndDrop(seoul_source, southkorea_target).build().perform();
		act.dragAndDrop(rome_source, italy_target).build().perform();
		act.dragAndDrop(madrid_source, spain_target).build().perform();
		act.dragAndDrop(washington_source, us_target).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
