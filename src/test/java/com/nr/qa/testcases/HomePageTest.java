package com.nr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.HomePage;
import com.nr.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	TestUtil testUtil;
	AEMLoginPage loginPage;

	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new AEMLoginPage();
		loginPage.Login();
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		homePage=new HomePage();
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "AEM Start","Home page title not matched");
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
