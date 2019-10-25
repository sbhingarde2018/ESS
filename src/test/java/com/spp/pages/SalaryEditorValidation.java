package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryEditorValidation extends BasePage {

	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="salary_structure")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')][1]")
	WebElement Load;
	@FindBy(xpath="//div[@class='text-center mt10']//div//input[@name='commit']")
	WebElement Process;
	
	@FindBy(xpath="//input[@id='select_sal_emp']")
	WebElement DeSelectbox;
	@FindBy(xpath="//strong[contains(text(),'Please select employees to process salary')]")
	WebElement PleaseSelectEmp;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[3]/a")
	WebElement Review;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[8]/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/a[1]")
	WebElement publish;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement successfulMessage;
	
	@FindBy(xpath="//strong[contains(text(),'Paymonth was not selected')]")
	WebElement paymonthValidationMessage;
	@FindBy(xpath="//strong[contains(text(),'Salary Structure was not selected')]")
	WebElement salaryStructureValidationMessage;
	@FindBy(xpath="//strong[contains(text(),'No Employees Found.')]")
	WebElement noEmployeeMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement selectEmployeeMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement salaryProcessSucessfulMessage;
	
	public SalaryEditorValidation(WebDriver driver) {
		super(driver); 
		PageFactory.initElements(driver, this);
	}
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectSalaryEditor() {
		SalaryEditor.click();
	}
	
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectGetValues() {
		GetValues.click();
	}
	public void selectLoad() {
		Load.click();
	}
	
	public void clickOnProcess() {
		Process.click();
	}
	public void deSelectCheckBox() {
		DeSelectbox.click();
	}
	public String getPleaseSelectEmpMassage() {
		return PleaseSelectEmp.getText();
	}
	public String getSucessfulMessage() {
		return successfulMessage.getText();
	}
	
	public String getPaymonthValidationMessage() {
		return paymonthValidationMessage.getText();
	}
	public String getSalaryStructureValidationMessage() {
		return salaryStructureValidationMessage.getText();
	}
	public String getNoEmployeeMessage() {
		return noEmployeeMessage.getText();
	}
	public String getSelectEmployeeMessage() {
		return selectEmployeeMessage.getText();
	}
	
	public String getSalaryProcessSucessfulMessage() {
		return salaryProcessSucessfulMessage.getText();
	}

}
