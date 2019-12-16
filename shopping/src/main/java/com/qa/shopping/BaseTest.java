package com.qa.shopping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	 static FileInputStream fis;
	static WebDriver driver;
	static Properties prop;
	static String browserName;
	
	public static String getProperty(String key) {		
		try {
			fis = new FileInputStream("C:\\Users\\Sumanth Angadi\\git\\repository\\shopping\\src\\main\\java\\resourceUtils\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot load the file");
		}
		
		return prop.getProperty(key);		
	}
	
	
	public static WebDriver initializeDriver()  {
		
		browserName=getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumanth Angadi\\Downloads\\chromedriver_win32\\Chromedriver.exe");
			driver = new ChromeDriver(options);			
		}else if (browserName.equalsIgnoreCase("firefox")) {			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sumanth Angadi\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
	}
	
	
	public static void main(String[] args) throws IOException  {
		initializeDriver();
		
	}
}
