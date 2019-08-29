package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeletePFGroup extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//tbody/tr[2]/td[contains(text(),'PF_ATest')]/parent::tr/td[4]/span[1]/a/img")
	WebElement editpficon;
	@FindBy(xpath="(//span[normalize-space(text()='PF Rate')])[6]")
	WebElement pfratelink;
	@FindBy(xpath="//img[@title='PF group rate']")
	WebElement deletepfrateicon;
	@FindBy(xpath="//a[text()='PF Group']")
	WebElement PfGrouplink;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[6]/a/img")
	WebElement deletepfgroupbutton;
	@FindBy(xpath="//strong[text()='PF group successfully deleted']")
	WebElement successfullMessage;
	
	public DeletePFGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickEditPFGroup() throws Exception{
		editpficon.click();
	}

	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void clickDeletePFRateButton() throws Exception{
		deletepfrateicon.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickPFGroupLink() throws Exception{
		PfGrouplink.click();
	}
	
	public void clickDeletePFGroupButton() throws Exception{
		deletepfgroupbutton.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
