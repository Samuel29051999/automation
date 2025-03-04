package webDrivers_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		// get Methods
		
		//get(Url) - Opens the Url in the Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
				
		//getTitle() - returns the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page = "+title);
		
		//getCurrentUrl() - returns the current url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = "+currentUrl);
		
		//getPageSource() - returns source code of the page 
	//	String pageSource = driver.getPageSource();
	//	System.out.println("Source code = "+pageSource);
		
		//getWindowHandle() - returns ID of the single Browser
		String windowid =driver.getWindowHandle();
		System.out.println("Single window ID ="+ windowid);
		
		//getWindowHandle() - returns ID of the multiple Browser
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();		
		System.out.println("Multiple window Ids ="+windowids);
		
		driver.quit();
		
		
		
		
		
		
	}

}
