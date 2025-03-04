package webDrivers_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_tables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// find the total number of rows in the table
		
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows = "+row);
		
		// find the number of colunm in the table
		
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of Coloumn = "+ column);
		
		// printing specific text from the table (5 row and 3 column)
		
		String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println(text);
		
		// printing all the table data 
		
		/*
		 * System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subjects"+"\t"+"Price");
		 * 
		 * for(int r=2; r<=row; r++) {
		 * 
		 * for (int c=1; c<=column; c++) {
		 * 
		 * String value =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+
		 * "]")).getText();
		 * 
		 * System.out.print(value+"\t"); }
		 * 
		 * System.out.println(); }
		 */		
		// print all the books Author name of Mukesh
		
		System.out.println("Author");
		
		for(int e=2; e<=row; e++) {
			
			String aut = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+e+"]//td[2]")).getText();
			
		//	System.out.println(aut);
			
			if(aut.equals("Mukesh")) {
				
					
				String muk=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+e+"]/td[1]")).getText();

					System.out.println(muk+"\t"+aut);
			}
				
				
			
		}
		
		
		
	}

}
