package parametersTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class yahooParameters {

	static WebDriver driver ;
	
	@Parameters({"Browser","URL","emailID"})
	
	public void yahooP(String Browser,String URL,String emailID) {
	
		if(Browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\Annotations\\lib\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		
		e1.printStackTrace();
	}}
		if(Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\Annotations\\lib\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}}
		
	driver.get(URL);
	 
	driver.findElement(By.xpath("//*[@id='uh-signin']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailID);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e3) {
		
		e3.printStackTrace();
	}
	
	driver.findElement(By.id("login-signin")).click();
	
	
	}
	
}
