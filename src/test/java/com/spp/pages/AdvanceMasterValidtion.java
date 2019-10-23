package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AdvanceMasterValidtion extends BasePage {
	
	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Advance Master']")
	WebElement ClickOnAdvanceMaster;
	
	@FindBy(xpath="//a[.='Add New Advance Master']")
	WebElement ClickOnADDAdvanceMaster;
	
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterAdvanceName;
	
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement SelectCheckBox;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Clickoncreate;
	
	@FindBy(id="standing_instruction_master_si_name-error")
	WebElement AdvanceNameError;
	
	@FindBy(xpath="//li[contains(text(),'Advance name already have taken')]")
	WebElement AdvanceMasterValidationMessage ;
	
	@FindBy(xpath="//strong[contains(text(),'Advance successfully created')]")
	WebElement SuccMessage;
	

	public AdvanceMasterValidtion(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	

	public void clickOnAdvanceMaster() throws Exception{
		ClickOnAdvanceMaster.click();
	}
	public void clickOnADDAdvanceMaster() throws Exception{
		ClickOnADDAdvanceMaster.click();
	}
	public void enterAdvanceName(String value) throws Exception{
		EnterAdvanceName.sendKeys(value);
	}
	public void selectCheckBox() throws Exception{
		SelectCheckBox.click();
	}
	
	public void clickOnCreateAddvance() throws Exception{
		Clickoncreate.click();
	}
	
	public String getAdvanceNameErrorMessage(){
		return AdvanceNameError.getText();
	}

	public String getAdvanceMasterValidationMessage(){
		return AdvanceMasterValidationMessage.getText();
	}
	public String getSuccessMessage(){
		return SuccMessage.getText();
	}

	

}
