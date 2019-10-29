package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead extends BasePage{
	
	public CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'General Link')]")
	WebElement GeneralLink;
	@FindBy(xpath="//ul[@id='ui-id-8']//a[contains(text(),'Salary Heads')]")
	WebElement SalaryHeads;
	@FindBy(xpath="//a[contains(text(),'Add New Salary Head')]")
	WebElement AddNewSalaryHead;
	@FindBy(xpath="//input[@id='salary_head_head_name']")
	WebElement HeadName;
	@FindBy(xpath="//input[@id='salary_head_short_name']")
	WebElement ShortName;
	@FindBy(xpath="//input[@name='commit']")
	WebElement CreateSalHead;
	@FindBy(xpath="//strong[contains(text(),'Salary head successfully created')]")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"earning_heads\"]/tbody/tr/td[contains(text(),'Sal Head 1')]/parent::tr/td[5]/a[2]")
	WebElement DeleteSalaryHead;
	
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickGeneralLink() {
		GeneralLink.click();
	}
	public void ClickSalaryHeads() {
		SalaryHeads.click();
	}
	public void ClickAddNewSalaryHead() {
		AddNewSalaryHead.click();
	}
	public void enterSalaryHeadName(String value) throws Exception{
		HeadName.clear();
		HeadName.sendKeys(value);
	}

	public void enterSalaryHeadShortName(String value) throws Exception{
		ShortName.clear();
		ShortName.sendKeys(value);
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public void ClickCreateSalHead() {
		CreateSalHead.click();
	}
	public void ClickDeleteSalaryHead() {
		DeleteSalaryHead.click();
	}
}