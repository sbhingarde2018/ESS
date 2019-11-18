package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteESIGroupRate extends BasePage {
	
	
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='ESI Group']")
	WebElement ESIGroup;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'ESI_ATest_2')]/parent::tr/td[4]/span[1]/a")
	WebElement EditLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/nav/ul/li[2]/a/span")
	WebElement ESIRate;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[7]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//*[@id=\"esi_grp_res_rsp\"]/div/strong")
	WebElement SuccessfulMessage;
	
	public DeleteESIGroupRate(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickESIGroup() throws Exception{
		ESIGroup.click();
	}
	public void clickEditLink() throws Exception{
		EditLink.click();
	}
	public void clickESIRate() throws Exception{
		ESIRate.click();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}

	

}
