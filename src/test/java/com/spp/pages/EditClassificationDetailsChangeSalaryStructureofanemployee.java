package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditClassificationDetailsChangeSalaryStructureofanemployee extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//a[contains(text(),'Classification Details')]")
	WebElement ClickonClassificationDetails;
	@FindBy(xpath="//table/tbody/tr/td[6]/a")
	WebElement ClickOnEdit;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SelectSalaryStructure;
	@FindBy(xpath="//input[@value='Update Classification Details']")
	WebElement UpdateClassificationDetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	@FindBy(xpath="//div[@id='employees_dtable_filter']//input")
	WebElement Search;
	
	public EditClassificationDetailsChangeSalaryStructureofanemployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void clickonclassificationdetails() {
		ClickonClassificationDetails.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void selectsalarystructure(String value) {
		dropDownSelect(SelectSalaryStructure, value);
	}
	public void updateclassificationdetails() {
		UpdateClassificationDetail.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
	public String SearchEmp(String value) {
		Search.sendKeys(value);
		return value;
	}
}
