package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory =Object Repository
	
	@FindBy(name="email")	 
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/div[3]/a")
	WebElement signup;
	
	// Initialize the page object
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public HomePage Login(String Un,String Pwd) {
		username.sendKeys(Un);
		password.sendKeys(Pwd);
		login.click();
		return new HomePage();
		
	}
	
	
}
