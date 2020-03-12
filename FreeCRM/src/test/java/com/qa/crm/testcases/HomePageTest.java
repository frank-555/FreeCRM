package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
	inizialization();
	loginpage =  new LoginPage();
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitleTest() {
	 String HomePageTitle=homepage.verifyHomepageTitle();
	 Assert.assertEquals(HomePageTitle, "Cogmento CRM", "Home Page Title Not Matched");
	}
	
	
	
	@AfterMethod
	public void teatDown() {
		driver.quit();
	}
	
}
