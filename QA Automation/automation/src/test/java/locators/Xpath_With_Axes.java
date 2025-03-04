package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_With_Axes {

	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
    driver.get("https://money.rediff.com/gainers/bse/daily/groupa"); 
    driver.manage().window().maximize();
    
    //Self - Select the current node 
    String selftext = driver.findElement(By.xpath("//a[contains(text(),'Tata Steel')]/self::a")).getText();
    System.out.println("Self Text= "+selftext);
    
    //Parent - Select the parent of the current node (always one)
    String parText = driver.findElement(By.xpath("//a[contains(text(),'Tata Steel')]/parent::td")).getText();
    System.out.println("Parent Text= "+ parText);
    
    //Child - Select all Children of the current node (one or many)
    List<WebElement> childText = driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/child::*"));
    System.out.println("Number of Child ="+childText.size());
    
    //Ancestor - Select all ancestor of the current node (parent, grandparent,etc..) of the current node
    String ancText = driver.findElement(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr")).getText();
    System.out.println("Ancestor Text = "+ ancText);
    
    //Descendant - Select all Descendant of the current node (children, grandchildren ,etc..)
    List<WebElement> descTest =driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/descendant::*"));
    System.out.println("Number of Descendant = "+ descTest.size());

    //Following - Select everything in the document after the closing tag of the current node 
    List<WebElement> followText = driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/following::tr"));
    System.out.println("Number of following = "+ followText.size() );
    
    //Following-sibling - Selects all the siblings after the current node
    List<WebElement> followSib = driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/following-sibling::tr"));
    System.out.println("Number of following-sibling = "+ followSib.size());

    //Preceding - Select all the node that appear before the current node in the document
    List <WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/preceding::tr"));
    System.out.println("Number of preceding = "+preceding.size());
    	
	//Preceding-sibling - Select all the siblings before the current node
    List <WebElement>preSibling = driver.findElements(By.xpath("//a[contains(text(),'Tata Steel')]/ancestor::tr/preceding-sibling::tr"));    
    System.out.println("Number of Preceding-sibling = "+ preSibling.size());
    
  
    
    driver.close();
    
    
}
}