package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PeriodicIncentiveMasterValidation extends BasePage {
	

	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Periodic Incentive Master']")
	WebElement ClickOnPeriodicIncentiveMaster;
	
	@FindBy(xpath="//a[.='Add New Periodic Incentive Master']")
	WebElement ClickOnADDPeriodicIncentiveMaster;
	

	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterPeriodicIncentiveMasterName;
	
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement SelectCheckBox;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Clickoncreate;
	
	@FindBy(xpath="//label[@id='standing_instruction_master_si_name-error']")
	WebElement PeriodicIncentiveMasterNameError;
	
	@FindBy(xpath="//li[contains(text(),'Periodic Incentive name already have taken')]")
	WebElement PeriodicIncentiveMasterValidationMessage ;
	
	@FindBy(xpath="//strong[contains(text(),'Periodic Incentive successfully created')]")
	WebElement SuccMessage;
	
	public PeriodicIncentiveMasterValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	

	public void clickOnPeriodicIncentiveMaster() throws Exception{
		ClickOnPeriodicIncentiveMaster.click();
	}
	public void clickOnADDPeriodicIncentiveMaster() throws Exception{
		ClickOnADDPeriodicIncentiveMaster.click();
	}
	public void enterPeriodicIncentiveMasterName(String value) throws Exception{
		EnterPeriodicIncentiveMasterName.sendKeys(value);
	}
	public void selectCheckBox() throws Exception{
		SelectCheckBox.click();
	}
	
	public void clickOnCreatePeriodicIncentiveMaster() throws Exception{
		Clickoncreate.click();
	}
	
	public String getPeriodicIncentiveMasterNameError(){
		return PeriodicIncentiveMasterNameError.getText();
	}

	public String getPeriodicIncentiveMasterValidationMessage(){
		return PeriodicIncentiveMasterValidationMessage.getText();
	}
	public String getSuccessMessage(){
		return SuccMessage.getText();
	}
	

}
