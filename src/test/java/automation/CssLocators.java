package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		
		// tag id                           tag#id  (tag name optional)
		driver.findElement(By.cssSelector("li#login-dropdown")).click();
		
		// tag Classname                    tag.classname (tag name optional)
		driver.findElement(By.cssSelector("a.brand-logo")).click();
		
		// tag attribute                    tag[attribute='value'] (tag name optional)
		driver.findElement(By.cssSelector("span[class='menu-txt']")).click();
		
		
		// tag classname attribute                                tag.classname[attribute='value']
		driver.findElement(By.cssSelector("input.sf-searchbox[type=\"text\"]")).sendKeys("Home loan");
		
		
	}

}
