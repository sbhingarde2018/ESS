package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BulkReimbursementClaim extends BasePage{
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"bulk_reimbursement_claim\"]/a")
	WebElement BulkReimbursementClaim;
	@FindBy(id="reimbursement_master_id")
	WebElement Name;
	@FindBy(id="financial_year")
	WebElement FinancialYear;
	@FindBy(id="paymonth_id")
	WebElement IssuedOn;
	@FindBy(id="paid_date")
	WebElement ClaimDate;
	@FindBy(id="reimbursement_claim_paymonth_id")
	WebElement PaidMonth;
	@FindBy(xpath="//button[@id='get_employee']")
	WebElement GetEmployee;
	@FindBy(xpath="//tbody/tr[1]/td[contains(text(),'Donald')]/parent::tr/td[1]/input")
	WebElement CheckBox;
	@FindBy(xpath="//table/tbody/tr/td[6]/input")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"bulk_claim\"]/tbody/tr[1]/td[8]/select")
	WebElement Paymonth;
	@FindBy(xpath="//input[@id='submit_bulk_claims']")
	WebElement ClaimReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"reimbursement_claims\"]/tbody/tr[1]/td[8]/a")
	//@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr/td[2][contains(text(),'Reim. LTA')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	
	public BulkReimbursementClaim(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectBulkReimbursementClaim() {
		BulkReimbursementClaim.click();
	}
	public void selectGetEmployee() {
		GetEmployee.click();
	}
	public void ClickLoad(){
		Load.click();
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectIssuedOn(String value){
		dropDownSelect(IssuedOn, value);
	}
	
	public void selectCheckBox() {
		CheckBox.click();
	}
	public void selectClaimDate(String Value) {
		ClaimDate.sendKeys(Value);
	}
	public void selectAmount(String Value) {
		Amount.clear();
		Amount.sendKeys(Value);
	}
	public void selectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void selectClaimReimbursementButton() {
		ClaimReimbursementButton.click();
	}
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
//	}public void clickPagechange() throws Exception{
//		Pagechange.click();
//	}
//	
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
