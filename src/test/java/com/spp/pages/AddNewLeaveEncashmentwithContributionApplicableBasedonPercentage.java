package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
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
	@FindBy(id="leave_encashment_contribution")
	WebElement CheckLeaveContribution;
	@FindBy(id="leave_encashment_based_on_2")
	WebElement CheckBasedOnPercent;
	@FindBy(id="salary_head")
	WebElement SelectSalaryHead;
	@FindBy(id="amount")
	WebElement EnterAmount;
	@FindBy(xpath="//button[text()='Insert']")
	WebElement ClickOnInsert;
	@FindBy(xpath="//*[@id=\"new_leave_encashment\"]/table/tbody/tr[13]/td/input")
	WebElement ClickOnSave;
	@FindBy(xpath="//strong[text()='Leave encashment successfully created.']")
	WebElement SuccessfulMessage;
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id='menu']/li[6]/div/div[3]/ul/li[2]/a")
	WebElement SalaryProcessList;
	@FindBy(xpath="//*[@id='main']/div[2]/nav/ul/li[2]/a/span")
	WebElement SalaryReviewDetailView;
	@FindBy(xpath = "//*[@id='salary_review']/tbody/tr/td[contains(text(),'Jan/2020')]/parent::tr/td/a")
	WebElement SalaryProcessListEdit;
	@FindBy(xpath="//*[@id='employee_leaves_encashed']/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td/a/img")
	WebElement EncashmentDeleteBtn;
	
	public AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage(WebDriver driver) {
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
	public void checkcontribution() {
		CheckLeaveContribution.click();
	}
	public void checkbasedonpercent() {
		CheckBasedOnPercent.click();
	}
	public void selectsalaryhead(String value) {
		dropDownSelect(SelectSalaryHead, value);
	}
	public void enteramount(String value) {
		EnterAmount.sendKeys(value);
	}
	public void clickoninsert() {
		ClickOnInsert.click();
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
	public void clickonSalaryProcessList() {
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
}
