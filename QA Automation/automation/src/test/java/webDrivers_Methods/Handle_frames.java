package webDrivers_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_frames {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver ();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    
    driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();
    
    //Frame 1
    
    WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
    driver.switchTo().frame(frame1);   // switch to frame 1 
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Tester");    
    driver.switchTo().defaultContent();  // goes back to main page
    
    
    //Frame 2
    
    WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    driver.switchTo().frame(frame2);     // switch to frame 2
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
    driver.switchTo().defaultContent();    // goes back to main page
    
    
    //Frame 3
    
    WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    driver.switchTo().frame(frame3);
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
    
	// inner iframe 
    
    driver.switchTo().frame(0);
    
    driver.findElement(By.xpath("//div[@id='i9']/div/div[@class='AB7Lab Id5V1']")).click();
    
    driver.switchTo().defaultContent();
		
    
    // frame 5
    
    WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
    driver.switchTo().frame(frame5);
    
    driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame5");
    
    driver.findElement(By.linkText("https://a9t9.com")).click();
    
//    WebElement iframe = driver.findElement(By.xpath("//div[@id='header']"));
//    
//    driver.switchTo().frame(iframe);
//    
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    
//    boolean logodisplayed = driver.findElement(By.xpath("//img[@class='responsive-img']")).isDisplayed();
//    System.out.println("Logo Status = "+logodisplayed);
//    
//    
    
    driver.switchTo().defaultContent();
    
    
    
		
	}

}
