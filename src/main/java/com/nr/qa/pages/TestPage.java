package com.nr.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nr.qa.base.TestBase;

public class TestPage extends TestBase{
	
	
	@FindBy(xpath="//button[@title='Toggle Side Panel']")
	@CacheLookup
	WebElement openSidepanel;
	
	@FindBy(xpath="//*[@id=\"OverlayWrapper\"]/div[2]/div[3]")
	WebElement parsys;
	
	@FindBy(xpath="//*[@title='Insert component']")
	WebElement insertComponent;
	
	//hero image component
	@FindBy(xpath="//input[@class='coral3-Textfield coral-DecoratedTextfield-input coral3-Search-input']")
	WebElement enterKeyWord;
	
	@FindBy(xpath="//*[text()='Hero Image' and @value='/apps/weretail/components/content/heroimage']")
	WebElement heroImage;
	
	@FindBy(xpath="//span[text()='Hero Image']")
	WebElement heroImageText;
	
	@FindBy(xpath="//*[@id=\"EditableToolbar\"]/button[1]")
	WebElement configure;
	
	@FindBy(xpath="//img[@class='cq-dd-image' and @src='/content/dam/abbvie/rsz_isaac-smith-ij7h-m4nj18-unsplash.jpg/_jcr_content/renditions/cq5dam.thumbnail.319.319.png?ch_ck=1601471862000']")
	WebElement image;
	
	@FindBy(xpath="//span[@class='cq-FileUpload-label']")
	WebElement dropImage;
	
	@FindBy(xpath="//*[text()='Properties']")
	WebElement properties;
	
	@FindBy(name="./heading")
	WebElement heading;
	
	@FindBy(name="./title")
	WebElement title;
	
	@FindBy(name="./buttonLabel")
	WebElement buttonLabel;
	
	@FindBy(xpath="//*[@id=\"coral-id-514\"]/coral-panel-content/div/div/div/div[4]/foundation-autocomplete/div/div/span/button")
	WebElement linkTo;
	
	@FindBy(xpath="//img[@class='foundation-collection-item-thumbnail' and @src='/content/aemboxplugin.thumb.48.48.png']")
	WebElement aemboxPlugin;
	
	@FindBy(xpath="//button[@class='granite-pickerdialog-submit coral3-Button coral3-Button--primary']")
	WebElement selectButton;
	
	@FindBy(xpath="//input[@name='./useFullWidth']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal' and @title='Done']")
	WebElement done;
	
	@FindBy(id="pageinfo-trigger")
	WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Publish Page']")
	WebElement publishpage;
	
	//image with add to cart links
	@FindBy(xpath="//*[text()='Image with Add to Cart Links' and @value='/libs/commerce/components/addtocartimage']")
	WebElement imagewithLinks;
	
	@FindBy(xpath="//div[@class='cq-Overlay cq-Overlay--component cq-draggable cq-droptarget cq-Overlay--placeholder'][2]")
	WebElement imagewithlinkscompo;
	
	@FindBy(xpath="//button[@title='Configure']")
	WebElement configure2;
	
	@FindBy(xpath="//img[@src='/content/dam/abbvie/rsz_gautam-krishnan-l1beivvznrm-unsplash.jpg/_jcr_content/renditions/cq5dam.thumbnail.319.319.png?ch_ck=1601470508000']")
	WebElement image2;
	
	@FindBy(xpath="//div[@class='cq-FileUpload-thumbnail']")
	WebElement dropImage2;
	
	@FindBy(xpath="//input[@class='coral-Form-field coral-Textfield' and @name='./jcr:title']")
	WebElement imgtitle;
	
	@FindBy(name="./alt")
	WebElement altText;
	
	@FindBy(xpath="//*[@id=\"coral-5\"]/div[4]/foundation-autocomplete/div/div/span/button")
	WebElement imglink;
	
	@FindBy(xpath="//img[@src='/content/NR-retail.thumb.48.48.png']")
	WebElement nrRetail;
	
	@FindBy(name="./jcr:description")
	WebElement description;
	
	@FindBy(xpath="//a[text()='Add To Cart']")
	WebElement addTocartTab;
	

	// Initializing the Page Objects:
	public TestPage() {
		PageFactory.initElements(driver, this);
	}
	public void windowHandles() {
		//window handles
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String>i1=s.iterator();
		while(i1.hasNext())
		{
		String child_window=i1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);	
	}}}
	public void dragAndDropHeroImageComponent() throws Exception {	
		openSidepanel.click();
		parsys.click();
		insertComponent.click();
		enterKeyWord.sendKeys("hero");
		heroImage.click();
		}
	
	public void authorHeroImageComponent() throws Exception {
		heroImageText.click();
		configure.click();
		//drag and drop image
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(image, dropImage).build().perform();
		properties.click();
		heading.sendKeys("Hero Image Test");
		title.sendKeys("Test Title");
		buttonLabel.sendKeys("Test button");
		linkTo.click();
		aemboxPlugin.click();
		selectButton.click();
		checkbox.click();
		done.click();
		}
	
	public void publishTestPage() throws Exception
	{
		Thread.sleep(2000);
		pageInfo.click();
		Thread.sleep(2000);
		publishpage.click();
		Thread.sleep(2000);
	}
	
	public void imageWithAddToCart() throws Exception {
		openSidepanel.click();
		parsys.click();
		insertComponent.click();
		enterKeyWord.sendKeys("image");
		imagewithLinks.click();
		imagewithlinkscompo.click();
		configure2.click();
		//drag and drop image
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(image2, dropImage2).build().perform();
		imgtitle.sendKeys("For those who never stop");
		altText.sendKeys("ALT TEXT");
		imglink.click();
		nrRetail.click();
		selectButton.click();
		description.sendKeys("Explore to Finanacial");
		addTocartTab.click();
		done.click();
	}
}
