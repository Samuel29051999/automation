package webDrivers_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		// select single options
		
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		// Capture all the options and print the size
		
		List <WebElement> count = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Total Number = "+count.size());
		
		// print all the label
		
		for(int i=0; i<count.size(); i++) {
			System.out.println(count.get(i).getText());
			
		}
		
		// Select Multiple Options 
		
		for(WebElement op:count) {
			
			String option = op.getText();
			
			if(option.equals("Java") || option.equals("MySQL") || option.equals("Angular"))
			{
				op.click();
				
			}
			
		}
		
		
		
		
		
		
		
	}

}
