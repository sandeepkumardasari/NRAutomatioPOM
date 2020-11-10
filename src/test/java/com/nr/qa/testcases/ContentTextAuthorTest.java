package com.nr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.SitesPage;
import com.nr.qa.pages.Test2Page;
import com.nr.qa.pages.TestPage;

public class ContentTextAuthorTest extends TestBase{
	
	AEMLoginPage loginPage;
	SitesPage sitesPage;
	TestPage testPage;
	Test2Page test2Page;
	
	public ContentTextAuthorTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		driver.get(prop.getProperty("loginurl"));
	}	
	
	@Test (priority=1)
	public void authorHeroImageTest() throws Exception {
		loginPage = new AEMLoginPage();	
		sitesPage=new SitesPage();
		testPage=new TestPage();
		test2Page=new Test2Page();
		
		loginPage.Login();
		sitesPage.openTest2Page();
		Thread.sleep(2000);
		testPage.windowHandles();
		Thread.sleep(8000);
		testPage.dragAndDropComponent();
		test2Page.dragAndDropContentTextComponent();
		test2Page.authorContentTextComponent();
		testPage.publishTestPage();
		}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	

}
