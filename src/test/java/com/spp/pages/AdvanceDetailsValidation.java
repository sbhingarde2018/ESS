package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AdvanceDetailsValidation  extends BasePage  {
	
	@FindBy(id="salary")
	WebElement Salarylink;
	
	@FindBy(xpath="//a[.='Advance Detail']")
	WebElement clickonAdnanceDeails;
	
	@FindBy(xpath="//button[.='Add Employees']")
	WebElement clickOnAddNewEmployees;
	
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement clickOnLoad;
	
	@FindBy(xpath="//tr[4]//td[6]//a[1]")
	WebElement clickOnView;
	
	@FindBy(xpath="(//a[.='Add New Advance Detail'])")
	WebElement clickOnAddNewAdvanceDetails;
	
	@FindBy(id="update_save")
	WebElement CreateAdvance;
	
	@FindBy(xpath="//div[@id='standing_instruction_detail_standing_instruction_master_id-error']")
	WebElement AdvanceNameValidationMessage ;
	
	@FindBy(xpath="//div[@id='sal_date-error']")
	WebElement AdvanceDateValidationMessage ;
	
	@FindBy(xpath="//div[@id='standing_instruction_detail_actual_amount-error']")
	WebElement AmountValidationMessage ;
	
	@FindBy(xpath="//div[@id='standing_instruction_detail_lumpsum_amount-error']")
	WebElement InstallmentAmountValidationMessage ;
	
	@FindBy(xpath="//div[@id='dpMonthYear-error']")
	WebElement RecoverFromValidationMessage ;
	
	public AdvanceDetailsValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	public void navigateSalary() throws Exception{
		Salarylink.click();
	}
	
	public void clickonAdnanceDeails() throws Exception{
		clickonAdnanceDeails.click();
	}
	public void clickOnAddNewEmployees() throws Exception{
		clickOnAddNewEmployees.click();
	}
	public void clickOnLoad() throws Exception{
		clickOnLoad.click();
	}
	public void clickOnView() throws Exception{
		clickOnView.click();
	}
	public void clickOnAddNewAdvanceDetails() throws Exception{
		clickOnAddNewAdvanceDetails.click();
	}
	public void CreateAdvance() throws Exception{
		CreateAdvance.click();
	}
	public String getAdvanceNameValidationMessage(){
		return AdvanceNameValidationMessage.getText();
	}
	public String getAdvanceDateValidationMessage(){
		return AdvanceDateValidationMessage.getText();
	}
	public String getAmountValidationMessage(){
		return AmountValidationMessage.getText();
	}
	public String getInstallmentAmountValidationMessage(){
		return InstallmentAmountValidationMessage.getText();
	}
	public String getRecoverFromValidationMessage(){
		return RecoverFromValidationMessage.getText();
	}
	
	
	

}
