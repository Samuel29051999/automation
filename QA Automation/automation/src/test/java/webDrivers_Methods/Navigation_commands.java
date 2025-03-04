package webDrivers_Methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver ();
		
	//	String myUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
	//	driver.get(myUrl);
		
		URL MyUrl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		
		// navigate to
		driver.navigate().to(MyUrl);
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		// navigate back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		// navigate forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		// navigate refresh
		driver.navigate().refresh();
		
		
		
		
	}

}
