package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		
		//Xpath with Single attribute
		driver.findElement(By.xpath("//li[@data-toggle='#WhatsApp-banking']")).click();
		
		//Xapth with Multiple attribute
		driver.findElement(By.xpath("//a[@target='_self'][@data-linktype='logo link']")).click();
		
		//Xapth with 'and' operator
		driver.findElement(By.xpath("//a[@target='_self' and @data-linktype='logo link']")).click();
	
		//Xapth with 'or' operator
		driver.findElement(By.xpath("//a[@target='_self' or @data-linktype='logo link']")).click();
		
		//Xapth with text() - inner text
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		
		boolean title = driver.findElement(By.xpath("//h3[text()='Digital Banking Solutions']")).isDisplayed();
		System.out.println(title);
		
		String print_title = driver.findElement(By.xpath("//h3[text()='Digital Banking Solutions']")).getText();
		System.out.println(print_title);
		
		//Xapth with contains()
		driver.findElement(By.xpath("//a[contains(@data-linktype,'logo')]")).click();
		
		//Xapth with starts-with ()
		driver.findElement(By.xpath("//a[starts-with(@data-linktype,'logo')]")).click();

		//Xapth with Chained 
		driver.findElement(By.xpath("//div[@class='site-logo']/a/span")).click();
		
		
		
	}

}
