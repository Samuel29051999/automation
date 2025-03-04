package webDrivers_Methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_alert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Normal alert with ok button
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		// Confirmation alert - OK & Cancel
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();  // close the alert by using ok 
		driver.switchTo().alert().dismiss();   // close the alert by using the cancel button
		
		// Prompt alert - Input box
		
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Testing");
		alert1.accept();
		
		
		
		
	}

}
