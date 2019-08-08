package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Loan Detail']")
	WebElement ClickOnLoanDetail;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-1\"]/li[2]/a")
	WebElement ClickOnEmployeeMaster;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[2]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoan;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement LoanName;
	@FindBy(id="sal_date")
	WebElement LoanDate;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement LoanAccountNo;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement InstallmentAmount;
	@FindBy(id="standing_instruction_detail_no_of_instalment")
	WebElement EnterNoofInstalments;
	@FindBy(id="dpMonthYear")
	WebElement RecoverDate;
	@FindBy(id="standing_instruction_detail_no_recovery")
	WebElement NoRecovery;
	@FindBy(id="standing_instruction_detail_round_off_50")
	WebElement RoundoffHighestRupee50;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(id="standing_instruction_detail_no_of_instalment")
	WebElement EnterNoofInstallments;
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[4]/a")
	WebElement SelectLoanMaster;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteLoanMaster;
	@FindBy(id="inst")
	WebElement CheckNoofInstallments;
	@FindBy(id="standing_instruction_detail_interest_amount")
	WebElement EnterInterestAmount;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//*[@id=\"financial_institutions\"]/tbody/tr/td[contains(text(),'HDFC Bank')]/parent::tr/td[9]/a")
	WebElement DeleteFinancialInstitution;

public CreateLoanAmountInterestAmountNoOfInstallmentsHigher50rupeeNoRecovery(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
public void clickonsalary() {
	ClickOnSalary.click();
}
public void clickonloandetail() {
	ClickOnLoanDetail.click();
}
public void clickAddEmployee() throws Exception{
	AddEmployee.click();
}
public void clickLoad() throws Exception{
	Load.click();
}
public void clickView() throws Exception{
	View.click();
}
public void clickAddNewLoan() throws Exception{
	AddNewLoan.click();
}
public void clickLoanName(String value) throws Exception{
	dropDownSelect(LoanName,value);
	
}
public void selectLoanDate(String value) throws Exception{
		LoanDate.sendKeys(value);
}

public void clickLoanAccountNo(String value) throws Exception{
	LoanAccountNo.sendKeys(value);
}
public void clickInstallmentAmount(String value) throws Exception{
	InstallmentAmount.sendKeys(value);
}
public void noofinstallments(String value) {
	EnterNoofInstalments.sendKeys(value);
}

public void clickAmount(String value) throws Exception{
	Amount.sendKeys(value);
}
public void selectInstitutionName(String value){
	dropDownSelect(InstitutionName, value);
}
public void norecovery() {
	NoRecovery.click();
}
public void clickRecoverDate(String value) throws Exception{
	RecoverDate.sendKeys(value);
}
public void roundoffhighestrupee() {
	RoundoffHighestRupee50.click();
}

public void clickCreateButton() throws Exception{
	CreateButton.click();
}
public String getMessage() {
	return SuccessfulMessage.getText();
}
public void clickDeleteButton() throws Exception{
	DeleteButton.click();
	switchToPopUpAndAccept(driver);
}
public void navigateMaster() throws Exception{
	ClickOnMaster.click();
}
public void selectloanmaster() throws Exception{
	SelectLoanMaster.click();
}
public void deleteloanmaster() {
	DeleteLoanMaster.click();
	switchToPopUpAndAccept(driver);
}
public void checknoofinstallments() {
	CheckNoofInstallments.click();
}
public void enterinterestamount(String value) {
	EnterInterestAmount.sendKeys(value);
}
public void deletefinancialinsti() {
	DeleteFinancialInstitution.click();
	switchToPopUpAndAccept(driver);
}
public void selectFinancialInst() throws Exception{
	financialInstitution.click();
}
}
