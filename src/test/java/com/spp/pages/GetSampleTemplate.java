package com.spp.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GetSampleTemplate extends BasePage{
	
	public GetSampleTemplate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Import/Export')]")
	WebElement ImportExport;
	@FindBy(xpath="//a[contains(text(),'Get Sample Template')]")
	WebElement GetSampleTemplate;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//select[@id='salary_group_excel_id']")
	WebElement SalaryStructure;
	@FindBy(xpath="//button[@id='af_filter_sd']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"select_sal_emp\"]")
	WebElement SelectAllEmp;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'HoldSal')]/parent::tr/td[1]/input")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='excel_generate']")
	WebElement GenerateFile;
	
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickImportExport() {
		ImportExport.click();
	}
	public void ClickGetSampleTemplate() {
		GetSampleTemplate.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickSelectAllEmp() {
		SelectAllEmp.click();
	}
	public void ClickSelectEmp() {
		SelectEmp.click();
	}
	public void ClickGenerateFile() {
		GenerateFile.click();
	}
}