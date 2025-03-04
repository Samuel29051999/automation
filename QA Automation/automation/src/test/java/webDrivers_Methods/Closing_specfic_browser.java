package webDrivers_Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_specfic_browser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='app-store']/ul/li/a[@data-linkname=\"app store\"]")).click();
		
		
		Set<String> windIDs = driver.getWindowHandles();
		
		for(String window:windIDs) {
		      String title = driver.switchTo().window(window).getCurrentUrl();
		      System.out.println(title);
		
              if(title.equals("‎https://apps.apple.com/in/app/imobile-loan-cards-banking/id375276006?ITM=nli_cms_download_links_imobile_appstore_footer_nav"))
            		  {
            	  driver.close();
            	  
              }
              


		      
		
		}
		

	}

}
