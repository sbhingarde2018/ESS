package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LeaveencashmentUnitratebasedonFormula extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Alex')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//a[text()='Add New Leave Encashment']")
	WebElement AddNewLeaveEncashment;
	@FindBy(id="leave_encashment_month_year")
	WebElement SelectMonth;
	@FindBy(id="leave_encashment_leave_definition_id")
	WebElement SelectLeave;
	@FindBy(id="leave_encashment_no_of_encashed_leave")
	WebElement EnterNoofLeaves;
	@FindBy(id="leave_encashment_unit_rate")
	WebElement EnterUnitRate;
	@FindBy(id="leave_encashment_in_salary")
	WebElement CheckShowInSalary;
	@FindBy(xpath="//*[@id='new_leave_encashment']/table/tbody/tr[13]/td/input")
	WebElement ClickOnSave;
	@FindBy(xpath="//*[@id=\"leave_encashment_unit_rate_calculation_based_on_formula_or_rate\"]")
	WebElement CheckUnitRate;
	@FindBy(xpath="//*[@id=\"leave_encashment_formula_formula\"]")
	WebElement CheckFormula;
	@FindBy(xpath="//*[@id=\"leave_encashment_formula_id\"]")
	WebElement SelectFormula;
	@FindBy(xpath="//strong[text()='Leave encashment successfully created.']")
	WebElement SuccessfulMessage;
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id='menu']/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(id="month_year")
	WebElement SalEditorPaymonth;
	@FindBy(id="salary_structure")
	WebElement SalEditorSalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(id="select_sal_emp")
	WebElement SelectAllSalaryEmp;
	@FindBy(xpath = "//*[@id='salaries']/tbody/tr/td[contains(text(),'Raj')]/parent::tr/td/input")
	WebElement SelectSingleEmp;
	@FindBy(xpath = "//*[@id='salary_editor_form']/table/tbody/tr[2]/td/div/div/div[1]/input")
	WebElement ProcessSalaryBtn;
	@FindBy(xpath = "//*[@id='menu']/li[6]/div/div[3]/ul/li[2]/a")
	WebElement SalaryProcessList;
	@FindBy(xpath = "//*[@id='salary_review']/tbody/tr/td[contains(text(),'Feb/2019')]/parent::tr/td/a")
	WebElement SalaryProcessListEdit;
	@FindBy(xpath="//a[text()='View']")
	WebElement SalaryReviewViewBtn;
	@FindBy(xpath="//*[@id='main']/div[2]/nav/ul/li[2]/a/span")
	WebElement SalaryReviewDetailView;
	@FindBy(xpath="//*[@id='employee_leaves_encashed']/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td/a/img")
	WebElement EncashmentDeleteBtn;
	@FindBy(xpath="//select[@name='dt_leave_encashment_length']")
	WebElement Records; 
	
	public LeaveencashmentUnitratebasedonFormula(WebDriver driver) {
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
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickonSalary() {
		Salary.click();
	}
	public void clickonsalaryeditor() {
		SalaryEditor.click();
	}
	public void selectSalEditorPaymonth(String value) {
		dropDownSelect(SalEditorPaymonth, value);
	}
	public void selectSalEditorSalaryStructure(String value) {
		dropDownSelect(SalEditorSalaryStructure, value);
	}
	public void clickGetValues() {
		GetValues.click();
	}
	public void clickSelectAll() throws Exception {
		SelectAllSalaryEmp.click();
		Thread.sleep(2000);
		SelectSingleEmp.click();		
	}
	public void clickProcessSalary() {
		ProcessSalaryBtn.click();
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
	public void selectRecords(String value) {
		dropDownSelect(Records, value);
	}
}
