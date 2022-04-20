package Alerttypes;

import java.awt.List;
import java.time.Duration;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement first = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		first.click();
		
		Alert simple =driver.switchTo().alert();
		simple.accept();
		
		
		
		 //confirm alert
	   WebElement cnfm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		cnfm.click();
		WebElement f=driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
	     f.click();
        Alert con= driver.switchTo().alert();
	     con.accept();
	     
	    // prompt alert
		WebElement third = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		third.click();
		WebElement f1 =driver.findElement(By.xpath("//button[text(='click the button to demonstrate the prompt box ']"));
		f1.click();
		
		Alert prm= driver.switchTo().alert();
		prm.sendKeys("yokesh");
		prm.accept();
		
	}
}
