package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewLeaveEncashmentModeofPaymentDD extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[2]/a")   
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]") 
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"dt_leave_encashment\"]/tbody/tr/td[contains(text(),'Alex')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")     
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
	@FindBy(id="leave_encashment_mode_of_payment")
	WebElement SelectModeofPayment;
	@FindBy(id="leave_encashment_financial_inst_id")
	WebElement SelectBank;
	@FindBy(xpath="//strong[text()='Leave encashment successfully created.']")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"employee_leaves_encashed\"]/table/tbody/tr/td[contains(text(),'Jan/2020')]/parent::tr/td[8]/a/img")
	WebElement Delete;
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[2]/a")
	WebElement SalaryProcessList;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr/td[contains(text(),'Jan/2020')]/parent::tr/td[7]/a")
	WebElement EditSalaryList;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[2]/a/span")
	WebElement DetailView;
	@FindBy(xpath="//input[@id='leave_encashment_cheque_dd_ac_no']")
	WebElement DD;
	
	public AddNewLeaveEncashmentModeofPaymentDD(WebDriver driver) {
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
	public void ClickDelete() {
		Delete.click();
	}
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryProcessList() {
		SalaryProcessList.click();
	}
	public void ClickEditSalaryList() {
		EditSalaryList.click();
	}
	public void ClickDetailView() {
		DetailView.click();
	}
	public void EnterDD(String value) {
		DD.sendKeys(value);
	}
}
