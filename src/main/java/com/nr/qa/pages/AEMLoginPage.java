package com.nr.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nr.qa.base.TestBase;

public class AEMLoginPage extends TestBase {

	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit-button")
	WebElement submit;
	
	@FindBy(id="learnmore")
	WebElement learnmore;
	
	@FindBy(xpath = "//a[contains(text(),'Help')]")
	WebElement helpLink;
	
	@FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
	WebElement termsOfUseLink;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy and Cookies')]")
	WebElement privacyPilicyLink;
	
	@FindBy(xpath = "//coral-alert-content[text()[contains(.,'User name and password do not match')]]")
	WebElement loginError;
	
	
	
	// Initializing the Page Objects:
	public AEMLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Login()
	{
		
		username.sendKeys("admin");
		password.sendKeys("jaP#uv+QAp9l");
		submit.click();
		
	}
	
	public void negetiveLogin() throws InterruptedException
	{
		username.sendKeys("admin");
		submit.click();
		Thread.sleep(3000L);
	}
	
	public void error()
	{
		loginError.isDisplayed();
	}
	
	
	

}
