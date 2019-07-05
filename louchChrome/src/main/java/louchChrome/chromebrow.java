package louchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chromebrow {
static WebDriver driver  ;
static String x;
static String y;
	public static void main(String[] args) {
		
		chromeinstance(x);
		
	}
	public static void chromeinstance(String x) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\louchChrome\\lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys(x);
		//driver.findElement(By.name("btnI")).click();
	}
	
	public static void ffxinstance(String y) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\louchChrome\\lib\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys(y);
		
		
	}

}
