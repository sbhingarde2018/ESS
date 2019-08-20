package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckInstitutionNameInGroupInsurance extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//a[contains(text(),'Group Insurance Detail')]")
	WebElement GroupInsuranceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotmentButton;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement SuccessfulMessage;

	public CheckInstitutionNameInGroupInsurance(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickGroupInsuranceDetails() throws Exception{
		GroupInsuranceDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	
	public void clickMultiAllotmentButton() throws Exception{
		MultiAllotmentButton.click();
	}
	
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
}
