package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PublishedSalariesToSalaryEditor extends BasePage{
	public PublishedSalariesToSalaryEditor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		}
		@FindBy(id="salary")
		WebElement Salary;
		@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
		WebElement PublishedSalary;
		@FindBy(xpath="//h3[contains(text(),'Links')]")
		WebElement Links;
		@FindBy(xpath="//ul[@id='ui-id-2']//a[contains(text(),'Salary Editor')]")
		WebElement SalariEditorLink;
		@FindBy(xpath="//select[@id='month_year']")
		WebElement PayMonth;
		@FindBy(xpath="//select[@id='salary_structure']")
		WebElement SalaryStructure;
		@FindBy(id="get_salary")
		WebElement GetValues;
		@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
		WebElement Load;
		@FindBy(xpath="//div[@class='text-center mt10']//div//input[@name='commit']")
		WebElement Process;
		@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
		WebElement PublishedSalaryNotifications;
		
		
		public void selectSalary() {
			Salary.click();
		}
		public void selectPublishedSalary() {
			PublishedSalary.click();
		}
		public void ClickPublishedSalaryNotifications() {
			PublishedSalaryNotifications.click();
		}
		public void selectLinks() {
			Links.click();
		}
		public void selectSalariEditorLink() {
			SalariEditorLink.click();
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
		public void selectProcess() {
			Process.click();
		}
		
	}