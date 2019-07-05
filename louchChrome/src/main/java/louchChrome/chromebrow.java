package louchChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrow {
static WebDriver driver  ;
	public static void main(String[] args) {
		
		chromeinstance();
	}
	public static void chromeinstance() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\louchChrome\\lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		
	}

}
