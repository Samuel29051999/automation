package webDrivers_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
			
		
	     // isDisplayed ()
				
		WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']"));
		System.out.println("Logo displayed status= "+logo.isDisplayed());
		
	//	boolean logostatus = driver.findElement(By.xpath("//div[@class='header-logo']")).isDisplayed();
	//	System.out.println("Logo displayed status = "+logostatus);

		
		// isEnabled
		
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Placeholder Status= "+status);
		
		
		// isSelected
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

		
		System.out.println("Before selecting the radio button.......");
		System.out.println("Male radio button status= "+male_rd.isSelected());
		System.out.println("Female radio button status= "+female_rd.isSelected());
		
		System.out.println("After selcting the radio button...........");
		male_rd.click();
		System.out.println("Male radio button status= "+male_rd.isSelected());
		System.out.println("Female radio button status= "+female_rd.isSelected());

		
	}

}
