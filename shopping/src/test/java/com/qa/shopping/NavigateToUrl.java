package com.qa.shopping;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pageObjects.LoginPage;

public class NavigateToUrl extends BaseTest {
	static String appTitle;
	static Properties prop;
	static WebDriver driver;
	
	@BeforeTest
	public void getTillApp() {
		driver = initializeDriver();
		driver.get("https://www.myntra.com");
	}

	@Test
	public void getAppTitle() {
		
		//driver.get("https://www.myntra.com");
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), getProperty("appTitle"), "title mismatch --> invalid");
	}
	
	@Test
	public void loginUser() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.getProfileIcon().click();
		login.getLoginIcon().click();
		login.getemailText().sendKeys("sumanth.a005@gmail.com");
		login.gePasswordText().sendKeys("Myntra@1993");
		login.getLoginBtn().click();
				
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
