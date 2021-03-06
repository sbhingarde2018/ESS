package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class FinancialInstitutionsPage extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//a[text()='Add New Financial Institution']")
	WebElement addFinancialInst;
	@FindBy(id="financial_institution_account_type")
	WebElement accoutType;
	@FindBy(id="financial_institution_account_type-error")
	WebElement accounttypeMsg;
	@FindBy(id="financial_institution_name")
	WebElement instName;
	@FindBy(id="financial_institution_name-error")
	WebElement instNameMsg;
	@FindBy(id="financial_institution_branch_code")
	WebElement branchCode;
	@FindBy(id="financial_institution_branch_code-error")
	WebElement branchCodeMsg;
	@FindBy(id="financial_institution_email")
	WebElement email;
	@FindBy(id="financial_institution_address")
	WebElement address;
	@FindBy(id="financial_institution_address-error")
	WebElement addressMsg;
	@FindBy(id="financial_institution_pincode")
	WebElement pinCode;
	@FindBy(id="financial_institution_ifsc_code")
	WebElement IFSCcode;
	@FindBy(id="financial_institution_micr_code")
	WebElement MICRCode;
	@FindBy(xpath="//input[@value='Create Financial institution']")
	WebElement createButton;
	@FindBy(xpath="//li[text()=\"Name can't be same\"]")
	WebElement DublicateInsName;

	public FinancialInstitutionsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectFinancialInstitution(){
		financialInstitution.click();
	}
	
	public void clickAddFinancialInst(){
		addFinancialInst.click();
	}
	
	public void selectAccoutType(String value){
		dropDownSelect(accoutType, value);
	}
	
	public void enterInstName(String value){
		instName.sendKeys(value);
	}
	
	public void enterBranchCode(String value){
		branchCode.sendKeys(value);
	}
	
	public void enterEmail(String value){
		email.sendKeys(value);
	}
	
	public void enterAddress(String value){
		address.sendKeys(value);
	}
	
	public void enterPinCode(String value){
		pinCode.sendKeys(value);
	}
	
	public void enterIFSCCode(String value){
		IFSCcode.sendKeys(value);
	}
	
	public void enterMICRCode(String value){
		MICRCode.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	
	public String getDublicateInstNameMessage(){
		return DublicateInsName.getText();
	}
	public String getAccountTypeMessage(){
		return accounttypeMsg.getText();
	}
	public String getInstNameMessage(){
		return instNameMsg.getText();
	}
	public String getBranchCodeMessage(){
		return branchCodeMsg.getText();
	}
	public String getAddressMessage(){
		return addressMsg.getText();
	}

}
