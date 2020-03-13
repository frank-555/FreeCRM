package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class Contacts extends TestBase {

	
	@FindBy(xpath="//span[contains(@class,'ui loader') and contains(text(),'Contacts')]")
	WebElement contacts;
	
	public Contacts() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean VerifyContactsLabel() {
		return contacts.isDisplayed();
	}
	
	public void SelectContacts() {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/div/label")).click();
	}
	
}
