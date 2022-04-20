package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPending {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
   WebElement searchprod= driver.findElement(By.xpath("//input[@type='text']) [6]"));
	searchprod.sendKeys("mobiles");
	
   WebElement clicksearch= driver.findElement(By.xpath("//input[@type='submit']")); 
    clicksearch.click();

	
	
	}
}
