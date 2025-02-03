package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links:"+  links.size() );
		
		List <WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total Number of Images:"+  images.size() );
		
	//	driver.findElement(By.partialLinkText("Iphone 6 32gb")).click();
		
	}

}
