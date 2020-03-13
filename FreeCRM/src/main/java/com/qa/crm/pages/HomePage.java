package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//*[contains(text(),'Jay Kay')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	
	@FindBy(xpath="//*[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//*[contains(text(),'Tasks')]")
	WebElement tasks;
	
	@FindBy(xpath="//span[contains(@class,'user-display') and contains(text(),'Jay Kay')]")
	WebElement username;
	
	
	// Initialize the page object
	
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomepageTitle() {
			driver.getTitle();
			return driver.getTitle();
		}
		
		public boolean displayCorrectUserName() {
			
			 return username.isDisplayed();
			}
			
		
		
	
		public Contacts clickOnContactsLink() {
			contactsLink.click();
			return new Contacts();
		}
		
		public Deals clickOnDealsLink() {
			dealsLink.click();
			return new Deals();
		}
		
		public Tasks clickOnTasks() {
			tasks.click();
			return new Tasks();
		}

}
