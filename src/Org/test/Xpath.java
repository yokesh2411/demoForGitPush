package Org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	//driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.get("http://www.amazon.in");
	
	//WebElement from=driver.findElement(By.className("db"));
	//from.sendKeys("madurai");
	
	//WebElement to=driver.findElement(By.id("dest"));
	//to.sendKeys("chennai");
	
    driver.manage().window().maximize();
    
    //Actions act=new Actions(driver);
    
   // WebElement movecourse= driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
   // act.moveToElement(movecourse).perform();
    //WebElement movetesting =driver.findElement(By.xpath("//div[@class='tonclickopen main-cat menu-item']"));
    //act.moveToElement(movetesting);
    
    Actions amazon=new Actions(driver);
    
    WebElement prime= driver.findElement(By.xpath("(//a[@class='nav-a'])[2]"));
    amazon.moveToElement(prime).perform();
    
    WebElement selectprime= driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/in']"));
    amazon.click(selectprime).perform();
    
    
	}
}
