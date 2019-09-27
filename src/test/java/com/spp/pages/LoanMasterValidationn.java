package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LoanMasterValidationn extends BasePage {

	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Loan Master']")
	WebElement ClickOnLoanMaster;
	
	@FindBy(xpath="//a[.='Add New Loan Master']")
	WebElement ClickOnADDLoanMaster;
	
	@FindBy(id="standing_instruction_master_si_name")
	WebElement EnterName;
	
	@FindBy(id="standing_instruction_master_clubbed_in_salary_head")
	WebElement SelectCheckBox;
	
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement  EnterInterestRate ;
	
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement EnterMaxAmount;
	
	
	@FindBy(id="standing_instruction_master_emi_recovery")
	WebElement EnterEmiReco;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Clickoncreate;
	
	@FindBy(id="standing_instruction_master_si_name-error")
	WebElement LoanNameError;
	
	@FindBy(xpath="//li[contains(text(),'Loan name already have taken')]")
	WebElement LoanMasterErorMessage ;
	
	@FindBy(xpath="//strong[.='Loan successfully created ']")
	WebElement SuccMessage;

	public LoanMasterValidationn(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickOnLoanMaster() throws Exception{
		ClickOnLoanMaster.click();
	}
	public void clickOnAddNewLoanMaster() throws Exception{
		ClickOnADDLoanMaster.click();
	}
	public void enterLoanMasterName(String value) throws Exception{
		EnterName.sendKeys(value);
	}
	public void selectCheckBox() throws Exception{
		SelectCheckBox.click();
	}
	public void enterIntrestRate(String value) throws Exception{
		EnterInterestRate.sendKeys(value);
	}
	public void enterMaxAmount(String value) throws Exception{
		EnterMaxAmount.sendKeys(value);
	}
	public void enterEmiRecove(String value) throws Exception{
		EnterEmiReco.sendKeys(value);
	}
	public void clickOnCreateLoan() throws Exception{
		Clickoncreate.click();
	}
	
	public String getLoanNameErorMessage(){
		return LoanNameError.getText();
	}

	
	public String getLoanMasterErorMessage(){
		return LoanMasterErorMessage.getText();
	}
	public String getSuccessMessageMessage(){
		return SuccMessage.getText();
	}

}
