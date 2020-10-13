
package com.nr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.HomePage;
//import com.nr.qa.pages.LoginPage;
import com.nr.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	HomePage homePage;
	TestUtil testUtil;
	AEMLoginPage contactsPage;
	
	String sheetName = "contacts";
	
	   
	public ContactsPageTest(){
			super();
			
	}
		
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		System.out.println("initialisation complete");
	}
	
	@Test
	public void loginTest()
	{
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
		
}
