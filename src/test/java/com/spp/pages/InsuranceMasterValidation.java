package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class InsuranceMasterValidation extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Insurance Master']")
	WebElement ClickOnInsuranceMaster;
	
	@FindBy(xpath="//a[.='Add New Insurance Master']")
	WebElement ClickOnADDInsuranceMaster;
	
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterName;
	
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement SelectCheckBox;
	
	
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Clickoncreate;
	
	@FindBy(id="standing_instruction_master_si_name-error")
	WebElement InsuranceNameError;
	
	@FindBy(xpath="//li[contains(text(),'Insurance name already have taken')]")
	WebElement InsuranceMasterErorMessage ;
	
	@FindBy(xpath="//strong[contains(text(),'Insurance successfully created')]")
	WebElement SuccMessage;

	public InsuranceMasterValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickOnInsuranceMaster() throws Exception{
		ClickOnInsuranceMaster.click();
	}
	public void ClickOnADDNewInsuranceMaster() throws Exception{
		ClickOnADDInsuranceMaster.click();
	}
	public void enterInsuranceMasterName(String value) throws Exception{
		EnterName.sendKeys(value);
	}
	public void selectCheckBox() throws Exception{
		SelectCheckBox.click();
	}
	
	public void clickOnCreateLoan() throws Exception{
		Clickoncreate.click();
	}
	
	public String getInsuranceNameError(){
		return InsuranceNameError.getText();
	}

	
	public String getInsuranceMasterErorMessage(){
		return InsuranceMasterErorMessage.getText();
	}
	public String getSuccessMessageMessage(){
		return SuccMessage.getText();
	}

}



