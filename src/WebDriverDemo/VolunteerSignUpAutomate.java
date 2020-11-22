package WebDriverDemo;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUpAutomate {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E://Coding//Driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize screen
		driver.manage().window().maximize();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		String title_name = driver.getTitle();
		System.out.println("Title of the Webpage :: "+title_name);
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Rishi");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Bhaskar PM");
		
		driver.findElement(By.cssSelector("input#RESULT_TextField-3")).sendKeys("8647893658");
		//driver.findElement(By.cssSelector("input.RESULT_TextField-4")).sendKeys("India");
		//driver.findElement(By.cssSelector("input[name=RESULT_TextField-5]")).sendKeys("Nilambur");
		driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.cssSelector("input#RESULT_TextField-5")).sendKeys("Nilambur");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("New@gmail.com");
		 
		//radio button
		
		WebElement radio_option = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		System.out.println("Element Status : " +radio_option.isSelected());
		
		//select option
		radio_option.click();
		
		//check box
		
		driver.findElement(By.xpath("//label[contains(text(),'Saturday')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Sunday')]")).click();
		
		//dropdown
		WebElement drop = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		
		Select dropdown = new Select(drop);
		
		//count number of drop downs
		int number_of_options = dropdown.getOptions().size();
		System.out.println("Number of Dropdown elements = " +number_of_options);
		
		//print all the options
		List<WebElement> options = dropdown.getOptions();
		
		//read them
		for(WebElement e : options) {
			System.out.println(e.getText());
		}
		
		//select opions from the dropdown
		//dropdown.selectByVisibleText("Morning");
		//dropdown.selectByIndex(2);
		dropdown.selectByValue("Radio-2");
		
		
	}
}
