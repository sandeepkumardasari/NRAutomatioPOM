  

package com.nr.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nr.qa.base.TestBase;
import com.nr.qa.pages.TestPagePublisher;

public class HeroImagePublisherTest extends TestBase{
	TestPagePublisher testpagepublish;
	
	public HeroImagePublisherTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		driver.get(prop.getProperty("publisherurl"));
	}	

	@Test (priority=1)
	public void verifyHeroImagePublisher() throws Exception {
		testpagepublish=new TestPagePublisher();
		Thread.sleep(4000);
		testpagepublish.heroImagePublisherTest();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
}
