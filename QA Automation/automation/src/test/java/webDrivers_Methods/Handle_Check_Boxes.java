package webDrivers_Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Check_Boxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 1. Select specific check boxes
	//	driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		// 2. Select all the Check boxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
		
//		for(int i=0; i<checkboxes.size(); i++ ) 
//		{
//			checkboxes.get(i).click();
//			}
//		
//		for(WebElement check: checkboxes)
//		{
//			check.click();
//			}	
		
		// 3. Select the last three check boxes
		// total number of check boxes - how many check box want to select = Staring Index
		// 7-3 = 4 (4 is the starting index)
		
//		for(int i = 4; i<checkboxes.size(); i++)
//		{
//			checkboxes.get(i).click();
//		}		
//		
		// 4. Select the first 3 check boxes
		
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		
		// 5. Unselect checkboxes if there are selected
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}
		
		
		
	}

}
