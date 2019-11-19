package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckMaximumAllowedInAM extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement AdvanceMaster;
	@FindBy(xpath="//td[contains(text(),'ABCDAdvance12')]/parent::tr/td[3]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[1]")
	WebElement SelectedAdvanceMaster;
	@FindBy(id="standing_instruction_master_max_allowed")
	WebElement MaxAllowed;
	@FindBy(xpath="//*[@id='standing_instruction_master_form']/div[8]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulMessage;
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id='menu']/li[6]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceDetailsLink;
	@FindBy(id="add_employees")
	WebElement AddEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr[1]/td[6]/a")
	WebElement ViewLink;
	@FindBy(xpath="//*[@id='standing_detail_list']/div[1]/span/a")
	WebElement AddNewAdvanceLink;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="sal_date")
	WebElement AdvanceDate;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement Installments;
	@FindBy(id="lump")
	WebElement lumpsum;
	@FindBy(id="dpMonthYear")
	WebElement RecoveryDate;
	@FindBy(id="update_save")
	WebElement CreateAdvance;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//a[contains(text(),'Donald(1234)')]")
	WebElement Previouslistpage;
	@FindBy(xpath="//*[@id='standing_detail_list']/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement deleteadvancedetails;
	@FindBy(xpath="//*[@class=\"action-delete\"]")
	WebElement deleteAdvancecreated;
		
	
	
	public CheckMaximumAllowedInAM(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void clickMastserLink(){

		masterLink.click();
	}

	public void clickAdvanceMaster(){
		AdvanceMaster.click();
	}
	public void clickEdit(){
		Edit.click();	
	}
	public String getAdvanceMaster() {
		return SelectedAdvanceMaster.getText();
	}
	
	public void clickMaxAllowed(String value){
		MaxAllowed.clear();
		MaxAllowed.sendKeys(value);
	}

	public void clickUpdateButton(){
		UpdateButton.click();
	}	
    
    public String getMessage1() {
    	return successfulMessage.getText();
	}	
    public void clickSalary(){
		Salary.click();
	}
    public void clickAdvanceDetailsLink(){
    	AdvanceDetailsLink.click();
	}
    public void clickAddEmployee(){
    	AddEmployee.click();
	}
    public void clickLoad(){
		Load.click();
	}
    public void clickViewLink(){
    	ViewLink.click();
	}
    public void clickAddNewAdvanceLink(){
    	AddNewAdvanceLink.click();
	}
    public void clickAdvanceName(String value){
		dropDownSelect(AdvanceName,value);
	}
    public void clickAmount(String value){
		Amount.clear();
		Amount.sendKeys(value);
	}
    public void clickAdvanceDate(String value) throws InterruptedException{
		AdvanceDate.sendKeys(value);
		Thread.sleep(1000);
		AdvanceDate.sendKeys(Keys.TAB);
}
    public void clickInstallments(String value){
    	Installments.clear();
		Installments.sendKeys(value);
	}
    public void clicklumpsum() {
    	lumpsum.click();
    }
    
    
    public void clickRecoveryDate(String value){
		
		RecoveryDate.sendKeys(value);
	}
    public void clickCreateAdvance(){

		CreateAdvance.click();
	}
    public String getMessage() {
    	return SuccessfulMessage.getText();
   }
   
    public void selectPreviouslistpage() {
    	Previouslistpage.click();
    }

	public void deleteadvancedetails() {
		// TODO Auto-generated method stub
		deleteadvancedetails.click();
	}
	public String getAlertMessage() {
    	return switchToPopUpAndgetText(driver);

}
	public void clickdelete() {
		deleteAdvancecreated.click();
	}

}
