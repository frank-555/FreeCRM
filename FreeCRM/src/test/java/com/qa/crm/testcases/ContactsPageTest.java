package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.Contacts;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.util.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	Contacts contacts;
	TestUtil testutil;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
	inizialization();
	testutil = new TestUtil();
	loginpage =  new LoginPage();
	contacts = new Contacts();
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	contacts = homepage.clickOnContactsLink();
	
	
	}
	
	@Test(priority = 1)
	public void verifycontactspagelabel() {
		Assert.assertTrue(contacts.VerifyContactsLabel(), "Contacts Label is Missing in the page");
	}
	
	@Test(priority = 2)
	public void selectContactsTest() {
		contacts.SelectContacts();
		
	}
	
	
	@AfterMethod
	public void teatDown() {
		driver.quit();
	}
	
}
