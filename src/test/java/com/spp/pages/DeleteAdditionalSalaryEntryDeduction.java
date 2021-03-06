package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAdditionalSalaryEntryDeduction extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[2]/a")
	WebElement AdditionalSalary;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(xpath="//*[@id=\"addn_salary\"]/div[2]/div/input")
	WebElement GetValues;
	@FindBy(xpath="//span[contains(text(),'Additional Salary - Deduction')]")
	WebElement DeductionTab;
	@FindBy(xpath="//*[@id=\"tabs-4\"]/div[2]/table/tbody/tr/td[5]/a")
	WebElement Allot;
	@FindBy(xpath="//tbody/tr[1]/td[5]/a")
	WebElement Delete;
	@FindBy(xpath="//strong[contains(text(),'Additional Salary Entry is successfully deleted')]")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/span/a")
	WebElement AddEmployees;
	@FindBy(id="filter_head")
	WebElement AdvanceFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="select_all_employee")
	WebElement SelectAllBox;
	@FindBy(xpath="//*[@id=\"add_employees\"]/tbody/tr[1]/td[1]/input")
	WebElement EmployeeBox;
	@FindBy(id="amount")
	WebElement Amount;
	@FindBy(xpath="//input[@name='commit']")
	WebElement AllotButton;

	public DeleteAdditionalSalaryEntryDeduction(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectAdditionalSalary(){
		AdditionalSalary.click();
	}
	public void selectPaymonth(String value){
		dropDownSelect(PayMonth, value);
	}

	public void selectGetValues(){
		GetValues.click();
	}
	public void selectDeductionTab(){
		DeductionTab.click();
	}

	public void ClickAllot(){
		Allot.click();
	}

	public void ClickDelete(){
		Delete.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void ClickAddEmployee(){
		AddEmployees.click();
	}
	public void ClickAdvanceFilter(){
		AdvanceFilter.click();
	}
	public void ClickLoad(){
		Load.click();
	}
	public void ClickSelectAllBoxs(){
		SelectAllBox.click();
	}
	public void ClickEmployeeBox(){
		EmployeeBox.click();
	}
	public void ClickAmount(String value){
		Amount.sendKeys(value);
	}
	public void ClickAllotButton(){
		AllotButton.click();
	}
}
