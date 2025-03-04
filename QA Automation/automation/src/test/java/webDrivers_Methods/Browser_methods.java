package webDrivers_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_methods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.close();  // close single browser window where ever the driver is focus
		
	//    driver.quit();  / close all the browser in the window
		
	}

}
