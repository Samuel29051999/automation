package webDrivers_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		
		List<WebElement> count = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		
		System.out.println(count.size());
		
		for(int i=0; i<count.size(); i++) {
			

		if (count.get(i).getText().equals("selenium")) {
			
			count.get(i).click();
			
			break;
			
		}
		
		
		}
		
		
		
	}

}
