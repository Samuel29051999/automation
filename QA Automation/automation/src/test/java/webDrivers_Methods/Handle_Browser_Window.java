package webDrivers_Methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Browser_Window {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		//Approach 1
		List<String> windowList = new ArrayList(windowIDs);
		
		String parentID = windowList.get(0);
		String childID = windowList.get(1);
		
		//Switch to child page
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//Switch to child page
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		
		//Approach
		
		for(String winID:windowIDs) {
		String title =	driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM")) {
				
				System.out.println(driver.getCurrentUrl());
			}
			
			
			
			
		}
		
		
		
	}

}
