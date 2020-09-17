package com.nr.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.AEMLoginPage;
import com.nr.qa.pages.HomePage;

public class LoginPageTest extends TestBase{
	AEMLoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new AEMLoginPage();	
	}

	@Test(priority=1)
	public void positiveLoginTest()
	{
		loginPage.Login();
	}
	@Test(priority=2)
	public void negitiveLoginTest() throws InterruptedException
	{
		loginPage.negetiveLogin();
		loginPage.error();
		System.out.println("Can able to see error for Invalid Creds");
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	

}
