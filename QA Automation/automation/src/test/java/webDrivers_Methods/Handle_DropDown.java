package webDrivers_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//Select option DropDown

		WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
		Select CountryDrop = new Select(drop);
		
		CountryDrop.selectByVisibleText("United Kingdom");
		CountryDrop.selectByValue("japan");
		CountryDrop.selectByIndex(3);
		
		// capture the options from the dropDown 
		
		List<WebElement> count = CountryDrop.getOptions();
		System.out.println("Number of DropDown = "+count.size());
		
		// Print all the DropDown
		
		for(int i= 0;i<count.size(); i++) 
		{
			System.out.println(count.get(i).getText() );
		}
		
		// enhanced for loop
		
//		for(WebElement opt:count) {
//			System.out.println(opt.getText());
//		}
//		
		
		
	}

}
