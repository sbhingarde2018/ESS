package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateLeaveDefinitionwithoutAffectSalaryandAllot extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[1]/a")
	WebElement ClickLeaveDefinitions;
	@FindBy(id="leave_definition_leave_name")
	WebElement EnterLeaveName;
	@FindBy(id="leave_definition_short_name")
	WebElement EnterShortName;
	@FindBy(id="leave_definition_consider_for_setting")
	WebElement ConsiderforLeave;
	@FindBy(xpath="//input[@value='Create Leave Definition']")
	WebElement CreateLeave;
	@FindBy(xpath="//strong[text()='Leave definition successfully created.']")
	WebElement message;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave25')]/parent::tr/td[7]/a")
	WebElement ClickDelete;
	@FindBy(id="leave_definition_allot")
	WebElement UncheckAllot;
	
	public CreateLeaveDefinitionwithoutAffectSalaryandAllot(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickleavedefinitions() {
		ClickLeaveDefinitions.click();
	}
	public void enterleavename(String value) {
		EnterLeaveName.sendKeys(value);
	}
	public void entershortname(String value) {
		EnterShortName.sendKeys(value);
	}
	public void considerforleave() {
		ConsiderforLeave.click();
	}
	public void createleave() {
		CreateLeave.click();
	}
	public String getTextMessage(){
		return message.getText();
	}
	public void clickdelete() {
		ClickDelete.click();
		switchToPopUpAndAccept(driver);
	}
	public void uncheckallot() {
		UncheckAllot.click();
	}
}
