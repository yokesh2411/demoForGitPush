package Dropdown;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement btnCreate= driver.findElement(By.xpath("//a[@role='button'])[2]"));
	    btnCreate.click();
	
	    WebElement year= driver.findElement(By.id("year"));
		 year.clear();
		  
		 Select s= new Select(year);
		List<WebElement> options = s.getOptions();
	      int size=options.size();
	      System.out.println(size);
	      
	      for(int i=0;i<options.size();i++) {
	    	  WebElement yearoption=options.get(i);
	    	  String yrprint=yearoption.getAttribute("value");
	    	  System.out.println(yrprint);
	    	  
	}
	}      
}
