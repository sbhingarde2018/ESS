package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckLoanDetailsRedirectsToMaster extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement GeneralLink;
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/li[1]/a")
	WebElement LoanMaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[1]/span/a")
	WebElement AddNewLoanMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement LoanName;
	@FindBy(id="standing_instruction_master_max_amount")
	WebElement MaxAmount;
	@FindBy(xpath="//*[@id=\"standing_instruction_master_form\"]/div[8]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement successfulMessage;
	@FindBy(xpath="//td[contains(text(),'master_12')]/parent::tr/td[4]/a")
	WebElement DeleteButton;

	public CheckLoanDetailsRedirectsToMaster(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickGeneralLink() throws Exception{
		GeneralLink.click();	
	}
	public void clickLoanMasterl() throws Exception{
		LoanMaster.click();
	}
	public void clickAddNewLoanMaster(){
		AddNewLoanMaster.click();	
	}
	public void clickLoanName(String value){
		LoanName.sendKeys(value);
	}

	public void ClickMaxAmount(String value){
		MaxAmount.sendKeys(value);
	}	

    public void clickCreateButton(){
	    CreateButton.click();
    }	
    
    public String getMessage() {
    	return successfulMessage.getText();
}
    public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
