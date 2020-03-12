package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;



public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public  LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
	inizialization();
	loginpage =  new LoginPage();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test(priority=2)
	public void LoginTest() {
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	

}
