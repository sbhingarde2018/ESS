package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GroupInsuranceMasterValidation extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Group Insurance Master']")
	WebElement ClickOnGroupInsuranceMaster;
	
	@FindBy(xpath="//a[.='Add New Group Insurance Master']")
	WebElement ClickOnADDGroupInsuranceMaster;
	
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterName;
	
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement SelectCheckBox;
	
	
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Clickoncreate;
	
	@FindBy(id="standing_instruction_master_si_name-error")
	WebElement GroupInsuranceNameError;
	
	@FindBy(xpath="//li[contains(text(),'Insurance name already have taken')]")
	WebElement GroupInsuranceMasterErorMessage ;
	
	@FindBy(xpath="//strong[contains(text(),'Insurance successfully created')]")
	WebElement SuccMessage;

	public GroupInsuranceMasterValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickOnGroupInsuranceMaster() throws Exception{
		ClickOnGroupInsuranceMaster.click();
	}
	public void ClickOnADDNewGroupInsuranceMaster() throws Exception{
		ClickOnADDGroupInsuranceMaster.click();
	}
	public void enterGroupInsuranceMasterName(String value) throws Exception{
		EnterName.sendKeys(value);
	}
	public void selectCheckBox() throws Exception{
		SelectCheckBox.click();
	}
	
	public void clickOnCreateGroupInsurance() throws Exception{
		Clickoncreate.click();
	}
	
	public String getGroupInsuranceNameError(){
		return GroupInsuranceNameError.getText();
	}

	
	public String getGroupInsuranceMasterErorMessage(){
		return GroupInsuranceMasterErorMessage.getText();
	}
	public String getSuccessMessage(){
		return SuccMessage.getText();
	}


}
