package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure extends BasePage{
	
	public CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'General Link')]")
	WebElement GeneralLink;
	@FindBy(xpath="//ul[@id='ui-id-8']//a[contains(text(),'Salary Structure')]")
	WebElement SalaryStructure;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Salary Structure')]")
	WebElement PublishSalaryStructure;
	@FindBy(xpath="//a[contains(text(),'Add New Salary Structure')]")
	WebElement AddNewSalaryStructure;
	@FindBy(xpath="//input[@id='sal_group_name']")
	WebElement NameSalaryStructure;
	@FindBy(xpath="//input[@id='salary_group_based_on_gross']")
	WebElement BaseOnGross;
	@FindBy(xpath="//input[@name='commit']")
	WebElement CreateSalarystructure;
	@FindBy(xpath="//strong[contains(text(),'Salary group successfully created')]")
	WebElement Message;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
	WebElement PublishedSalaryNotifications;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickGeneralLink() {
		GeneralLink.click();
	}
	public void ClickSalaryStructure() {
		SalaryStructure.click();
	}
	public void ClickPublishSalaryStructure() {
		PublishSalaryStructure.click();
	}
	public void ClickAddNewSalaryStructure() {
		AddNewSalaryStructure.click();
	}
	public void enterNameSalaryStructure(String value) throws Exception{
		NameSalaryStructure.clear();
		NameSalaryStructure.sendKeys(value);
	}
	public void ClickBaseOnGross() {
		BaseOnGross.click();
	}
	public void ClickCreateSalarystructure() {
		CreateSalarystructure.click();
	}
	public String getMessage(){
		return Message.getText();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
	public void ClickPublishedSalaryNotifications() {
		PublishedSalaryNotifications.click();
	}
}