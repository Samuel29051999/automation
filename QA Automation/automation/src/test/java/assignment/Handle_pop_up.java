package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_pop_up {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://mypage.rediff.com/login/dologin");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		
//		driver.switchTo().alert().accept();
//		
//		driver.close();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		List <WebElement> check = driver.findElements(By.xpath("//table[@id='productTable']/descendant::tbody/tr/td[4]/input"));
		
		for(int i=3; i< check.size(); i++) {
			
			check.get(i).click();
		}
		
		
		
	}

}
