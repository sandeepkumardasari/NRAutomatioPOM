package com.nr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.SitesPage;
import com.nr.qa.pages.TestPage;


public class ImageWithAddToCartLinkAuthor extends TestBase{
	
	AEMLoginPage loginPage;
	TestPage testPage;
	SitesPage sitesPage;
	
	public ImageWithAddToCartLinkAuthor(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		driver.get(prop.getProperty("loginurl"));
	}	
	
	@Test(priority = 1)
	public void imageWithAddToCartAuthor() throws Exception {
		loginPage = new AEMLoginPage();	
		sitesPage=new SitesPage();
		testPage=new TestPage();
		
		loginPage.Login();
		sitesPage.openTestPage();
		testPage.windowHandles();
		Thread.sleep(8000);	
		testPage.imageWithAddToCart();
		testPage.publishTestPage();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	

}
