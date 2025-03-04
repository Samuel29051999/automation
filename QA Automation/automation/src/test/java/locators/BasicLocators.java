package locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasicLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		// id
	    driver.findElement(By.id("search-chatInput")).sendKeys("Home loan");
		
		// Class
		boolean logo_is_clickable = driver.findElement(By.className("brand-logo")).isDisplayed();
		System.out.println("Is logo Clickable= " + logo_is_clickable );
		
		//Link Text
		driver.findElement(By.linkText("NRI")).click();
		
		//PartialLink Text
		driver.findElement(By.partialLinkText("Acc")).click();

		//findElements using Class
		List <WebElement> headerLink = driver.findElements(By.className("menu-nav-tablink"));
		System.out.println("Total Header link: "+headerLink.size());
		
		//findElements using tagName
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links in the Page: "+ links.size());
		
		
		
	}

}
