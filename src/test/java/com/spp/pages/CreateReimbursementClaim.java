package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateReimbursementClaim extends BasePage{
	public CreateReimbursementClaim(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(xpath="//*[@id=\"claims_list\"]/div[1]/span/a")
	WebElement NewReimbursement;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Donald')]/parent::tr/td[5]/input")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/form/div[3]/input")
	WebElement ClaimButton;

	//@FindBy(xpath="//*[@id=\"new_reimbursement_allotment\"]/div[2]/fieldset/div[1]/div[1]/div")
	@FindBy(id="reimbursement_claim_reimbursement_master_id")
	WebElement Name;
	@FindBy(id="reimbursement_claim_financial_year")
	WebElement FinancialYear;
	@FindBy(id="reimbursement_claim_mode_of_payment")
	WebElement PaymentMode;
	@FindBy(id="reimbursement_claim_paymonth_id")
	WebElement PaidMonth;
	@FindBy(id="sal_date")
	WebElement ClaimDate;
	@FindBy(id="paid_date")
	WebElement PaidDate;
	@FindBy(id="reimbursement_claim_amount")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"new_claim\"]/div[2]/div/input")
	WebElement CreateReimbursementButton;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='reimbursement_claims']/tbody/tr[1]/td[7]/a[2]")
	//@FindBy(xpath="//*[@id=\"reimbursement_allotments\"]/tbody/tr/td[2][contains(text(),'Reim. LTA')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectNewReimbursement() {
		NewReimbursement.click();
	}
	public void selectAddEmployee() {
		AddEmployee.click();
	}
	public void selectClaimButton() {
		ClaimButton.click();
	}
	public void selectName(String value){
		dropDownSelect(Name, value);
	}
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectPaymentMode(String value){
		dropDownSelect(PaymentMode, value);
	}
	public void selectPaidMonth(String value){
		dropDownSelect(PaidMonth, value);
	}
	public void selectClaimDate(String Value) {
		ClaimDate.sendKeys(Value);
	}
	public void selectPaidDate(String Value) {
		PaidDate.sendKeys(Value);
	}
	public void selectAmount(String Value) throws InterruptedException {
		Amount.clear();
		Thread.sleep(5000);
		Amount.sendKeys(Value);
	}
	public void selectCreateReimbursementButton() {
		CreateReimbursementButton.click();
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
