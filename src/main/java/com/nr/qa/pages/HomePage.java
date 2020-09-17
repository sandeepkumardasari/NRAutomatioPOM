package com.nr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nr.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class= \"coral3-Shell-homeAnchor\"]")
	@CacheLookup
	WebElement AEMLogo;

	@FindBy(xpath = "//coral-tab[@title=\"Navigation\"]")
	WebElement navigationLink;
	
	@FindBy(xpath = "//coral-tab[@title=\"Tools\"]")
	WebElement toolsLink;
	

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//coral-icon[@class=\"coral3-Icon coral3-Icon--sizeS coral3-Icon--search\"]")
	WebElement searchButton;
	
	@FindBy(xpath= "//coral-icon[@class=\"coral3-Icon coral3-Icon--sizeS coral3-Icon--apps\"]")
	WebElement appsLink;
	
	@FindBy(xpath= "coral3-Icon coral3-Icon--sizeS coral3-Icon--helpCircle")
	WebElement helpLink;
	
	@FindBy(xpath= "coral3-Icon coral3-Icon--sizeS coral3-Icon--bell")
	WebElement notificationLink;
	
	@FindBy(xpath= "//coral-icon[@class=\"coral3-Icon coral3-Icon--userCircleColor coral3-Icon--sizeM\"]")
	WebElement userLink;
	
	@FindBy(xpath= "//div[@data-foundation-collection-navigator-href=\"/component-report.html\"]")
	WebElement componentReport;
	
	@FindBy(xpath= "//div[@data-foundation-collection-navigator-href=\"/projects.html/content/projects\"]")
	WebElement projects;
	
	@FindBy(xpath= "//div[@data-foundation-collection-navigator-href=\"/sites.html/content\"]")
	WebElement sitesLink;
	
	@FindBy(xpath= "//div[@data-foundation-collection-navigator-href=\"/aem/experience-fragments.html/content/experience-fragments\"]")
	WebElement experienceFragmentsLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public void clickonNavigation()
	{
		navigationLink.click();
	}
	
	public void clickOnTools()
	{
		toolsLink.click();
	}
	
	public void clickOnComponentReport()
	{
		componentReport.click();
	}
	
	public void projects()
	{
		projects.click();
	}
	
	public void sitesLink()
	{
		sitesLink.click();
	}
	
	public void experienceFragmentsLink()
	{
		experienceFragmentsLink.click();
	}
	
	public void aemLogo()
	{
		AEMLogo.click();
	}
	
}
