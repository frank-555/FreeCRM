package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.crm.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try{
			prop= new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\jayakrishnan.k01\\eclipse-workspace\\Consumer\\FreeCRM\\src\\main\\java\\com\\qa\\crm"+
			"\\config\\config.properties");
			prop.load(ip);
			}

			catch(FileNotFoundException e){
			e.printStackTrace();}
			catch(IOException e){
			e.printStackTrace();
			}
			}

	

public static void inizialization() {
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));

	
}



}
