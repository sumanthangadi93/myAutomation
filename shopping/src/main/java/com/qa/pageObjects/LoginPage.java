package com.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	By profileIcon = By.xpath("//span[contains(text(),'Profile')]");
	
	By loginIcon = By.xpath("//a[contains(text(),'log in')]");
	
	By emailText = By.xpath("//input[@placeholder='Your Email Address']");
	
	By passwordText=By.xpath("//input[@placeholder='Enter Password']");

	By loginBtn = By.xpath("//button[@class='login-login-button']");
	
	By infoEmail = By.xpath("//div[@class='desktop-infoEmail']");
	

	public WebElement getProfileIcon() {
		return driver.findElement(profileIcon);
	}
	
	public WebElement getLoginIcon() {
		return driver.findElement(loginIcon);
	}
	
	public WebElement getemailText() {
		return driver.findElement(emailText);
	}
	
	public WebElement gePasswordText() {
		return driver.findElement(passwordText);
	}
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement getInfoEmail() {
		return driver.findElement(infoEmail);
	}
	
	
	
	
	





	
}
