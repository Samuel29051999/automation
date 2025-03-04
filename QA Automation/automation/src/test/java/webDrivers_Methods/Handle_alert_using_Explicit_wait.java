package webDrivers_Methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_alert_using_Explicit_wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10)); // Explicit wait declaration
		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());  
		System.out.println(alert1.getText());
        alert1.accept();		
		
	}

}
