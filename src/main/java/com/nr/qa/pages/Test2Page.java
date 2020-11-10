package com.nr.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nr.qa.base.TestBase;

public class Test2Page extends TestBase{
	
	@FindBy(xpath="//input[@class='coral3-Textfield coral-DecoratedTextfield-input coral3-Search-input']")
	@CacheLookup
	WebElement enterKeyWord;
	
	@FindBy(xpath="//*[text()='Content Text' and @value='/apps/nr-finance/components/content/content-text']") //*[@id=\"coral-id-501\"]/coral-selectlist-group[1]/coral-selectlist-item[2]
	WebElement contentText;
	
	@FindBy(xpath="//*[@id=\"OverlayWrapper\"]/div[2]/div[3]") //div[@title='Content Text']
	WebElement clickOnComponent;
	
	@FindBy(xpath="//button[@title='Configure']")
	WebElement configurebutton;
	
	@FindBy(name="./uniqueId")
	WebElement componentUniqueId;
	
	@FindBy(name="./title")
	WebElement componentTitle;
	
	@FindBy(name="./sectionTitle")
	WebElement sectionTitle;
	
	@FindBy(xpath="//div[@name='./text']")
	WebElement textField;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal' and @title='Done']")
	WebElement done;
	
	// Initializing the Page Objects:
		public Test2Page() {
			PageFactory.initElements(driver, this);
		}
	
//	public void dragAndDropComponent() throws Exception {	
//		parsys.click();
//		insertComponent.click();
//		}
	
	public void dragAndDropContentTextComponent() throws Exception {	
		enterKeyWord.sendKeys("content text");
		contentText.click();
		}
	
	public void authorContentTextComponent() throws Exception {
		clickOnComponent.click();
		configurebutton.click();
		Thread.sleep(2000);
		componentUniqueId.sendKeys("Discover");
		componentTitle.sendKeys("All new winter collectio");
		sectionTitle.sendKeys("Shop now");
		textField.click();
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("B");
		
		textField.sendKeys("Built for the coldest winter on the earth");
		done.click();
		}
	
}
