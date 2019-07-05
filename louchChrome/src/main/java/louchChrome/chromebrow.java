package louchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrow {
static WebDriver driver  ;
static String x;
	public static void main(String[] args) {
		
		chromeinstance(x);
	}
	public static void chromeinstance(String x) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\louchChrome\\lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys(x);
		driver.findElement(By.name("btnI")).click();
	}

}
