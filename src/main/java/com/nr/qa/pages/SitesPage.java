package com.nr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nr.qa.base.TestBase;

public class SitesPage extends TestBase{
	
	@FindBy(xpath = "//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[2]/div")
	@CacheLookup
	WebElement sites;
	
	@FindBy(xpath= "//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column/coral-columnview-column-content/coral-columnview-item[13]")
	WebElement NRfinance;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[1]")
	WebElement languageMaster;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[3]/coral-columnview-column-content/coral-columnview-item[1]")
	WebElement english;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[4]/coral-columnview-column-content/coral-columnview-item[7]/coral-columnview-item-thumbnail/img")
	WebElement testPage;
	
	@FindBy(xpath="//button[@type='button' and @icon='edit']")
	WebElement editButton;
	
	// Initializing the Page Objects:
	public SitesPage() {
		PageFactory.initElements(driver, this);
	}
	public void openTestPage()
	{
		sites.click();
		NRfinance.click();
		languageMaster.click();
		english.click();
		testPage.click();
		editButton.click();
	}
}

