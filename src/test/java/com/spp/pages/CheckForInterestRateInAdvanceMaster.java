package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForInterestRateInAdvanceMaster extends BasePage {
	
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[2]/ul/li[3]/a")
	WebElement Advancemaster;
	@FindBy(xpath="//*[@id='standing_instr_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[4]/a")
	WebElement Edit;
	@FindBy(xpath="//a[text()='Add New Advance Master']")
	WebElement addAdvanceMaster;
	@FindBy(id="standing_instruction_master_si_name")
	WebElement advanceName;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody[2]/tr[1]/td[1]")
	WebElement SelectedAdvanceMaster;
	
	@FindBy(id="standing_instruction_master_interest_rate")
	WebElement InterestRate;
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
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id='si_detail_employees']/tbody/tr[2]/td[contains(text(),'Tina')]/parent::tr/td[6]/a")
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
	@FindBy(id="dpMonthYear")
	WebElement RecoveryDate;
	@FindBy(id="update_save")
	WebElement CreateAdvance;
	@FindBy(xpath="//input[@value='Create Advance']")
	WebElement createAdvance;
	@FindBy(xpath="//*[@id='main']/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id='standing_detail_list']/div[2]/table/tbody/tr/td[contains(text(),'Advance_Master')]/parent::tr/td[8]/a")
	WebElement deleteadvancedetails;
	@FindBy(id="lump")
	WebElement lumpsum;
	
	
	public CheckForInterestRateInAdvanceMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){

		masterLink.click();
	}
	public void clickAdvancemaster(){

		Advancemaster.click();
	}
	public void clickAddAdvancMaster() throws Exception{
		addAdvanceMaster.click();
	}
	public void clickCreateAdvanceButton() throws Exception{
		createAdvance.click();
	}

	public void enterAdvanceName(String value) throws Exception{
		advanceName.sendKeys(value);
	}
	public void clicklumpsum(){

		lumpsum.click();
	}


	public String getAdvanceMaster() {
		return SelectedAdvanceMaster.getText();
	}
	public void clickEdit(){
		Edit.click();	
	}
	public void clickInterestRate(String value){
		InterestRate.clear();
		InterestRate.sendKeys(value);
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
    public void enterinstallmentamount(String value){
		Installments.clear();
		Installments.sendKeys(value);
	}
    public void clickRecoveryDate(String value){
		RecoveryDate.clear();
		RecoveryDate.sendKeys(value);
	}
    public void clickCreateAdvance(){

		CreateAdvance.click();
	}
    public String getMessage2() {
    	return SuccessfulMessage.getText();

}
    public void deleteadvancedetails(String advanceMaster) {
		deleteadvancedetails.click();
	}
	
}
