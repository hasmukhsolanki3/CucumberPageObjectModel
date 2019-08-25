package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	//init WebDriver
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public static final int TIMEOUT = 1000;
	public static final int PAGE_LOAD_TIMEOUT = 1000;
	
	//Singleton Pattern
	private SeleniumDriver(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver= new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openPage(String url){
		
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		
		return driver;
	}
	
	public static void setUpDriver(){
		
		if(seleniumDriver == null){
			
			seleniumDriver = new SeleniumDriver();
			
		}
		
	}
	
	public static void tearDown(){
		
		if (driver != null){
			
			driver.quit();
		}
		
		seleniumDriver = null;
	}
	
	
}
