package webDrivers_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Methods {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver ();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    // implicitWait
	//	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));//(Declaration)  
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	//	Thread.sleep(3000); // will pause for 3 seconds   // Thread sleep
		
		//Explicit Wait   
		
		WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		Username.sendKeys("Admin");
		
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("admin123");		
         		
		WebElement loginCTA = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginCTA.click();
		
		driver.close();
		
		
	}

}
