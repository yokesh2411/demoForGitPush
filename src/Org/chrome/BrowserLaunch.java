package Org.chrome	;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.naukri.com/nlogin/login");
	
	//WebElement txtusername = driver.findElement(By.id("email"));
	   
	 //txtusername.sendKeys("9944176741");
			  
	// WebElement txtpassword = driver.findElement(By.id("pass"));
			 
		//txtpassword.sendKeys("1234567");
		//WebElement btnlogin = driver.findElement(By.name("login"));
		//btnlogin.click();
	 
	//WebElement txtusername = driver.findElement(By.xpath("//input[@type='text']"));
	//txtusername.sendKeys("9944176741");
	//WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
	//txtpassword.sendKeys("122345");
	//WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
			//btnlogin.click();
	
	//naukri login using id
	//WebElement txtusername = driver.findElement(By.id("usernameField"));
	//txtusername.sendKeys("9944176741");
    //WebElement txtpassword = driver.findElement(By.id("passwordField"));
	
	
    //txtpassword.sendKeys("12345");
	//naukri login using xpath
	
	  //WebElement txtusername = driver.findElement(By.xpath("//input[@type='text']"));
	//txtusername.sendKeys("9944176741");
	//WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
	///txtpassword.sendKeys("122345");
	
	//by using Xpath text
	
	//WebElement linkCreate = driver.findElement(By.xpath("//div[text()='login']"));
		//	String text = linkCreate.getText();
			//System.out.println(text);
	//by using xpath contains
	
	}
	
}
