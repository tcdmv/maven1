package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testbrowser {
	
	static WebDriver driver ;
	
	
	@BeforeMethod
	
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\Annotations\\lib\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	
	
	}
	@Test(priority=1)
	
	
	public void serch() {
		
	 driver.findElement(By.name("q")).sendKeys("Abdel");
	 
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.findElement(By.name("btnI")).click();
	System.out.println("praparing enveronment");
	}
	
	@Test(priority=3,dependsOnMethods="logo")
	
	
	public void serch1() {
		
	 driver.findElement(By.name("q")).sendKeys("mchaar");
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		
		e1.printStackTrace();
	}
	driver.findElement(By.name("btnI")).click();
	
	}
	@Test(priority=2)
	public void logo() {
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				
				e2.printStackTrace();
			}
		boolean logo=driver.findElement( By.id("hplogo")).isDisplayed();
		System.out.println(logo);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "title is incorrect");
	}
	@AfterMethod
	public void closetest() {
		
		driver.quit();
	}
}
