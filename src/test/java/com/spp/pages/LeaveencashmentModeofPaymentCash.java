package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class LeaveencashmentModeofPaymentCash extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='dt_leave_encashment']/tbody/tr/td[contains(text(),'Alex')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//a[text()='Add New Leave Encashment']")
	WebElement AddNewLeaveEncashment;
	@FindBy(id="leave_encashment_month_year")
	WebElement SelectMonth;
	@FindBy(id="leave_encashment_leave_definition_id")
	WebElement SelectLeave;
	@FindBy(id="leave_encashment_no_of_encashed_leave")
	WebElement EnterNoofLeaves;
	@FindBy(xpath="//input[@id='leave_encashment_unit_rate']")
	WebElement EnterUnitRate;
	@FindBy(id="leave_encashment_in_salary")
	WebElement CheckShowInSalary;
	@FindBy(xpath="//*[@id=\"new_leave_encashment\"]/table/tbody/tr[13]/td/input")
	WebElement ClickOnSave;
	@FindBy(id="unit_rate_calculation_based_on_formula_or_rate")
	WebElement CheckUnitRate;
	@FindBy(id="unit_rate_formula")
	WebElement CheckFormula;
	@FindBy(id="formula_id")
	WebElement SelectFormula;
	@FindBy(xpath="//select[@id='leave_encashment_mode_of_payment']")
	WebElement SelectModeofPayment;
	@FindBy(id="leave_encashment_financial_inst_id")
	WebElement SelectBank;
	@FindBy(xpath="//strong[text()='Leave encashment successfully created.']")
	WebElement SuccessfulMessage;
	@FindBy(id="report")
	WebElement Report;
	@FindBy(xpath="//*[@id='menu']/li[8]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReportType;
	@FindBy(id="leave_policy")
	WebElement LeavePolicy;
	@FindBy(id="leave_report_employees")
	WebElement GetEmployees;
	@FindBy(id="select_all_employees")
	WebElement SelectAllLeaveReport;
	@FindBy(xpath = "//*[@id='leave_report_table']/tbody/tr/td[contains(text(),'Raj')]/parent::tr/td/input")
	WebElement SelectSingleEmp;
	@FindBy(id = "leave_report_submit")
	WebElement GenerateReportBtn;
	@FindBy(xpath = "//*[@id='menu']/li[6]/div/div[3]/ul/li[2]/a")
	WebElement SalaryProcessList;
	@FindBy(xpath = "//*[@id='salary_review']/tbody/tr/td[contains(text(),'Jan/2019')]/parent::tr/td/a")
	WebElement SalaryProcessListEdit;
	@FindBy(xpath="//a[text()='View']")
	WebElement SalaryReviewViewBtn;
	@FindBy(xpath="//*[@id='main']/div[2]/nav/ul/li[2]/a/span")
	WebElement SalaryReviewDetailView;
	@FindBy(xpath="//*[@id='employee_leaves_encashed']/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td/a/img")
	WebElement EncashmentDeleteBtn;
	@FindBy(id="from_date")
	WebElement AdvLeaveRepFromDate;
	@FindBy(id="select_all_leaves")
	WebElement SelectAllCheckbox;
	
	
	
	public LeaveencashmentModeofPaymentCash(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonleaveencashment() {
		ClickOnLeaveEncashment.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void checkunitrate() {
		CheckUnitRate.click();
	}
	public void checkformula() {
		CheckFormula.click();
	}
	public void selectformula(String value) {
		dropDownSelect(SelectFormula, value);
	}
	public void addnewleaveencashment() {
		AddNewLeaveEncashment.click();
	}
	public void selectmonth(String value) {
		dropDownSelect(SelectMonth, value);
	}
	public void selectleave(String value) {
		dropDownSelect(SelectLeave, value);
	}
	public void enternoofleaves(String value) {
		EnterNoofLeaves.clear();
		EnterNoofLeaves.sendKeys(value);
	}
	public void enterunitrate(String value) {
		EnterUnitRate.clear();
		EnterUnitRate.sendKeys(value);
	}
	public void checkshowinsalary() {
		CheckShowInSalary.click();
	}
	public void clickonsave() {
		ClickOnSave.click();
	}
	public void selectmodeofpayment(String value) {
		dropDownSelect(SelectModeofPayment, value);
	}
	
	public void selectbank(String value) {
		dropDownSelect(SelectBank, value);
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickonReport() {
		Report.click();
	}
	public void clickonadvanceleavereport() {
		AdvanceLeaveReport.click();
	}
	public void selectLeaveReportType(String value) {
		dropDownSelect(LeaveReportType, value);
	}
	public void selectLeavePolicy(String value) {
		dropDownSelect(LeavePolicy, value);
	}
	public void GetEmployees() {
		GetEmployees.click();
	}
	public void clickSelectAllLeaveRep() throws Exception {
		SelectAllLeaveReport.click();
		//Thread.sleep(2000);
		//SelectSingleEmp.click();		
	}
	public void clickGenerateReportBtn() {
		GenerateReportBtn.click();
	}
	public void clickSalaryProcessList() {
		SalaryProcessList.click();
	}
	public void editSalaryProcessList() {
		SalaryProcessListEdit.click();
	}
	public void clickSalaryReviewDetailView() {
		SalaryReviewDetailView.click();
	}
	public void deleteEncashment() {
		EncashmentDeleteBtn.click();
	}
	public void enterfromdate(String value) {
		AdvLeaveRepFromDate.clear();
		AdvLeaveRepFromDate.sendKeys(value);
		AdvLeaveRepFromDate.sendKeys(Keys.TAB);
		
	}
	public void SelectAllCheckbox() {
		SelectAllCheckbox.click();
	}
}
