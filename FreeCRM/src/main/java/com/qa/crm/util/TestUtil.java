package com.qa.crm.util;

import com.qa.crm.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long Page_Load_Timeout=20;
	public static long Implicit_Wait=10;
	
	
	public void SwitchtoFrame() {
		driver.switchTo().frame("downloadFrame");
	}
	

}
