package automation;

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
		
		
		
		
		
		
		
	}

}
