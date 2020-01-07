package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue extends BasePage{
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
	@FindBy(xpath="//*[@id='employee_leaves_encashed']/table/tbody/tr/td[contains(text(),'Jan/2020')]/parent::tr/td[7]/a")
	WebElement ClickOnEdit;
	@FindBy(xpath="//button[text()='Remove']")
	WebElement ClickOnRemove;
	@FindBy(id="leave_encashment_based_on_1")
	WebElement CheckBasedOnAmount;
	@FindBy(id="salary_head")
	WebElement SelectSalaryHead;
	@FindBy(id="amount")
	WebElement EnterAmount;
	@FindBy(xpath="//button[text()='Insert']")
	WebElement ClickOnInsert;
	@FindBy(xpath="//strong[text()='Leave encashment successfully updated.']")
	WebElement SuccessfulMessage;
	@FindBy(css="input[name=commit][type=submit]")
	WebElement ClickOnUpdate;
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
	
	public UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue(WebDriver driver) {
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
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void clickonremove() {
		ClickOnRemove.click();
	}
	public void checkbasedonamount() {
		CheckBasedOnAmount.click();
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
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickonupdate() {
		ClickOnUpdate.click();
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
