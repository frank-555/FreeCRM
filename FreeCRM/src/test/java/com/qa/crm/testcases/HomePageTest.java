package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.Contacts;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	Contacts contacts;
	
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be independent
	//before each test case -- launch the browser and login
	//@test -- execute the testcase
	//after each test -- close the browser
	
	
	@BeforeMethod
	public void setup() {
	inizialization();
	loginpage =  new LoginPage();
	contacts = new Contacts();
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
	 String HomePageTitle=homepage.verifyHomepageTitle();
	 Assert.assertEquals(HomePageTitle, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void verifyHomePageUserName() {
		Assert.assertTrue(homepage.displayCorrectUserName());
	}
	
	@Test(priority=3)
	public void VerifyContactsLinkTest() {
		contacts = homepage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void teatDown() {
		driver.quit();
	}
	
}
