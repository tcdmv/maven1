package parametersTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityPakage.utilityClass;


public class datadriventest {
	static WebDriver driver ;
	
	
@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdel\\Documents\\Cloned Servers\\maven1\\Annotations\\lib\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("MortgageCalculator.com");

}
@DataProvider

public  Object[][] getdata()  {
	System.out.println("I got here");
	Object data [][] = utilityClass.getDataforExcelSheel("Sheet1");
	System.out.println("I got here1");
	return data;
}
@Test(dataProvider="getdata")
public void register(String name,String email, String phone) {
	
	driver.findElement(By.xpath("//*[@id='forfullname']")).sendKeys(name);
	driver.findElement(By.xpath("//*//*[@id='formemail']")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id='forphonenumber']")).sendKeys(phone);
	
}


@AfterMethod
public void tearDown() {
	
	driver.quit();
}
}
