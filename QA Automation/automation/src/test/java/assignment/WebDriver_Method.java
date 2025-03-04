package assignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		// task 1 provide some link and search for it 
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
			
		
		// task 2 count number of links
		List<WebElement> count = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println("Total Links = "+count.size());
		
		
		//task 3 
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.linkText("Selenium in biology")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
		driver.findElement(By.linkText("Selenium disulfide")).click();
		driver.findElement(By.linkText("Selenium dioxide")).click();
		
		
		Set<String> window = driver.getWindowHandles(); 
		
        
		for(String win:window) {
			String url = driver.switchTo().window(win).getCurrentUrl();
			
			if(url.equals("https://en.wikipedia.org/wiki/Selenium_disulfide"))
			{
			driver.close();
		}
		}
		
	}

}
