package com.qa.shopping;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToUrl extends BaseTest {
	static String appTitle;
	static Properties prop;

	@Test
	public void launchUrl() {
		driver = initializeDriver();
		driver.get("https://www.myntra.com");
		appTitle=driver.getTitle();
		//Assert.assertEquals(appTitle, getProperty("appTitle"));
	}

}
