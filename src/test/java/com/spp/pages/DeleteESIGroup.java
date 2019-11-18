package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteESIGroup extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='ESI Group']")
	WebElement esilink;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'ESI-ATest')]/parent::tr/td[4]/span[1]/a/img")
	WebElement editESIicon;
	@FindBy(xpath="(////*[@id=\"esi_grp_rate_list\"]/div[2]/table/tbody/tr/td[7]/a")
	WebElement esiratelink;
	@FindBy(xpath="//a[text()='Delete']")
	WebElement deleteESIrate;
    @FindBy(xpath="//tbody/tr/td[contains(text(),'ESI_ATest_2')]/parent::tr/td[4]/span[2]/a")
    WebElement deleteESIGroup;
    @FindBy(xpath="//*[@id=\"esi-grp-result\"]/div/strong")
    WebElement successfullMessage;
    
	public DeleteESIGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickESILink() throws Exception{
		esilink.click();
	}
	
	public void clickEditESILink() throws Exception{
		editESIicon.click();
	}
	
	public void clickESIRateLink() throws Exception{
		esiratelink.click();
	}
	
	public void clickDeleteESIRateButton() throws Exception{
		deleteESIrate.click();
		
	}
	public void clickDeleteEditESIGroupButton() throws Exception{
		deleteESIGroup.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
