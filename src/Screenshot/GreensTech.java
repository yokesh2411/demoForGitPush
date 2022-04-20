package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
      	driver.manage().window().maximize();
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		TakesScreenshot tk= (TakesScreenshot)driver;
//		File greens =tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(greens);
//		
//		File des= new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\Screenshots\\greens.png");
//		FileUtils.copyFile(greens, des);
		
	//	driver.get("http://toolsqa.com/");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
	//	WebElement scrollatest = driver.findElement(By.xpath("//a[@classs='btn btn-border active']"));
	//	js.executeScript("arguments[0].scrollIntoView('true')", scrollatest);
		
	    JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scrolljob = driver.findElement(By.className("margin10"));
		js.executeScript("arguments[0].scrollIntoView('true')",scrolljob);
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File des= new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\Screenshots\\top.png");
		FileUtils.copyFile(src, des);
		System.out.println("done");
		
		
		
		
	}
}
