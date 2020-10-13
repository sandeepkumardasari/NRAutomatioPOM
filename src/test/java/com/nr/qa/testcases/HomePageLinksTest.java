package com.nr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.HomePage;
import com.nr.qa.util.TestUtil;

public class HomePageLinksTest extends TestBase{
	
	HomePage homePage;
	TestUtil testUtil;
	AEMLoginPage loginPage;
	
	public HomePageLinksTest() {
		super();
		
	}	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new AEMLoginPage();
		loginPage.Login();
		System.out.println("Login Successful");
	}
	
	@Test
	public void linksTest() throws InterruptedException
	{
		homePage=new HomePage();
		homePage.clickOnTools();
		System.out.println("Clicked on Tools link");
		homePage.clickonNavigation();		
//		testUtil=new TestUtil();
//		Thread.sleep(5000L);
//	    testUtil.back();
		homePage.experienceFragmentsLink();		
		homePage.aemLogo();
		System.out.println("Clicked on Experience Fragments");
//		homePage.projects();
//		homePage.aemLogo();
//		Thread.sleep(3000L);
//		System.out.println("Clicked on Projects link");
//		homePage.sitesLink();
//		homePage.aemLogo();
//		Thread.sleep(3000L);
//		System.out.println("Clicked on Sites link");
				
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
