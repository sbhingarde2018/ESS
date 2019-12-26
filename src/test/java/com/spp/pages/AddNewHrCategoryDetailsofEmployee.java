package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewHrCategoryDetailsofEmployee extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement ClickOnEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[1]")
	WebElement ClickOnView;
	@FindBy(xpath="//h3[contains(text(),'HrCategory')]")
	WebElement ClickonHRCategory;
	@FindBy(xpath="//a[contains(text(),'Personal')]")
	WebElement ClickonPersonal;
	@FindBy(xpath="//a[contains(text(),'Add New Personal Hr Category')]")
	WebElement AddNewPersonalHRCat;
	@FindBy(id="hr_master_category_values_1")
	WebElement EnterBloodGrp;
	@FindBy(id="hr_master_category_values_3")
	WebElement EnterQualification;
	@FindBy(id="hr_master_category_values_4")
	WebElement EnterNationality;
	@FindBy(xpath="//*[@value='Save Details']")
	WebElement ClickOnSave;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	
	public AddNewHrCategoryDetailsofEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
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
		ClickOnView.click();
	}
	public void clickonhrcategory() {
		ClickonHRCategory.click();
	}
	public void clickonpersonal() {
		ClickonPersonal.click();
	}
	public void addnewpersonalhrcat() {
		AddNewPersonalHRCat.click();
	}
	public void enterbloodgrp(String value) {
		EnterBloodGrp.sendKeys(value);
	}
	public void enterqualification(String value) {
		EnterQualification.sendKeys(value);
	}
	public void enternationality(String value) {
		EnterNationality.sendKeys(value);
	}
	public void clickonsave() {
		ClickOnSave.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
}
