package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class HoldSalary extends BasePage{
	
	public HoldSalary(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//select[@id='salary_structure']")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//div[@id='filter_head']")
	WebElement Filter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//div[@class='text-center mt10']//div//input[@name='commit']")
	WebElement Process;
	@FindBy(xpath="//*[@id=\"salaries_filter\"]/label/input")
	WebElement Search;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'HoldSal')]/parent::tr/td[4]/a")
	WebElement More;
	@FindBy(xpath="//tbody/tr[2]/td[3]/input[1]")
	WebElement Checkbox;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[2]/div/input")
	WebElement SaveValues;
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Salary Sheet')]")
	WebElement SalarySheet;
	@FindBy(xpath=" //select[@id='sal_report_type']")
	WebElement selectSalarySheet;
	@FindBy(xpath="//button[@id='salary_sheet_filter']")
	WebElement GetEmp;
	@FindBy(xpath="//tr[1]//td[7]//a[1]")
	WebElement Edit;
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div[2]/a")
	WebElement SubmitForReview;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[3]/a")
	WebElement Review;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[8]/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div[2]/a[1]")
	WebElement publish;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement successfulMessage;
	@FindBy(xpath="//input[@id='salary_sheet_submit']")
	WebElement GenerateReport;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void ClickGetValues() {
		GetValues.click();
	}
	public void ClickFilter() {
		Filter.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickProcess() {
		Process.click();
	}
	public void ClickEdit() {
		Edit.click();
	}
	public void ClickSubmitForReview() {
		SubmitForReview.click();
	}
	public void selectReview() {
		Review.click();
	}
	public void selectview() {
		view.click();
	}
	public void selectpublish() {
		publish.click();
	}
	public String getMessage() {
		return successfulMessage.getText();
	}
	public void SearchEmp(String value) throws Exception{
		Search.sendKeys(value);
	}
	public void ClickMore() {
		More.click();
	}
	public void ClickCheckbox() {
		Checkbox.click();
	}
	public void ClickSaveValues() {
		SaveValues.click();
	}
	public void ClickReport() {
		Report.click();
	}
	public void ClickSalarySheet() {
		SalarySheet.click();
	}
	public void SelectSalarySheet(String value){
		dropDownSelect(selectSalarySheet, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	
	
}
