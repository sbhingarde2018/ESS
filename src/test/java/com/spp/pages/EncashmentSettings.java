package com.spp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spp.common.BasePage;

public class EncashmentSettings extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClonePolicy')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
	@FindBy(xpath="//span[contains(text(),'Lapse/Carry Over/Encashment')]")
	WebElement encashmentTab;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_encash")
	WebElement allowEncahment;
	@FindBy(xpath="//*[@id=\"lapse_carryover_encashment_sets\"]/table/tbody/tr[2]/td[2]/input")
	WebElement encashedPerInstance;
	@FindBy(name="leave_policy_head_wise_setting[encashment_settings[max_encash]]")
	WebElement encashedinYear;
	@FindBy(name="leave_policy_head_wise_setting[encashment_settings[encash_year_limit]]")
	WebElement numberofTimesEncachsed;
	@FindBy(id="leave_policy_head_wise_setting_encashment_settings_round_off_year")
	WebElement roundOff;
	@FindBy(xpath="//div[@id='lapse_carryover_encashment_sets']//tr[6]//input[@value='Update']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfullMessage;
	@FindBy(xpath="//*[@id=\"leave_policy_head_wise_setting_encashment_settings_encash\"]")
	WebElement allowearned;
	@FindBy(id="leave")
	WebElement LeaveLink;
	@FindBy(linkText="Apply Leave")
	WebElement AppyLeaveLink;
	@FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
    WebElement Load;
    @FindBy(xpath="//tbody/tr/td[contains(text(),'Zain')]/parent::tr/td[3]/a")
    WebElement ApplyLeave;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement FromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement ToDate;
	@FindBy(id="apply")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement Message2;
	@FindBy(xpath="//div[3]/nav/ul/li[3]/a/span")
	WebElement LeaveHistory;
	@FindBy(xpath="//*[@id=\"leave_detail_for_employee\"]/table/tbody/tr/td[4]/a")
	WebElement CView;
	@FindBy(xpath="//*[@id=\"batch_details\"]/form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement DeleteButton;
	@FindBy(id="leave_policy_head_wise_setting_behaviour_settings_avail_excess_leave")
	WebElement AllowAccessCasual;
	@FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_priority_setting")
	WebElement PrioritySettings;
	@FindBy(xpath="//td[contains(text(),'Compensatory Off')]")
	WebElement CompensatoryOff;	
	@FindBy(xpath="//*[@id=\"leave_encashment_leave_definition_id\"]")
	WebElement SelectLeave;
	@FindBy(xpath="//a[@class='tooltip-left']")
	WebElement AddNewLeaveEnc;
	@FindBy(xpath="//a[contains(text(),'Leave Encashment')]")
	WebElement AppyLeaveEnc;
	@FindBy(xpath="//tbody/tr[1]/td[3]/a")
	 WebElement View;
	
	public EncashmentSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	
	public void clickLapseTab(){
		jsclick(encashmentTab);
	}
 
	//public void clickAllowEncahment(){
	//	/*String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
	//	((JavascriptExecutor) driver).executeScript(js, allowEncahment);*/
		
	//	WebDriverWait wait = new WebDriverWait (driver, 10);
	//	allowEncahment = wait.until(ExpectedConditions.elementToBeClickable(By.id("leave_policy_head_wise_setting_encashment_settings_encash")));
	//	allowEncahment.click();
	 
	public void clickallowEarnedLeave() throws Exception {
		if(allowearned.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			allowearned.click();
		}
	}
	public void enterEncashedPerInstance(String value){
		System.out.println(encashedPerInstance.getAttribute("disabled"));
		System.out.println(driver.getPageSource());
		encashedPerInstance.clear();
		encashedPerInstance.sendKeys(value);
	}
	
	public void enterencashedinYear(String value){
		encashedinYear.clear();
		encashedinYear.sendKeys(value);
	}
	
	public void enterNumberofTimesEncachsed(String value){
		numberofTimesEncachsed.clear();
		numberofTimesEncachsed.sendKeys(value);
		
	}
	
	public void selectRoundOff(String value){
	 dropDownSelect(roundOff,value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	
	public void clickLeaveLink(){
		LeaveLink.click();
	}
	public void clickFilter(){
		Filter.click();
	}
	
	public void clickLoad(){
		Load.click();
	}
	public void clickApplyLeave(){
		ApplyLeave.click();
	}
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	
	public void clickApplyButton(){
		ApplyButton.click();
	}
	public String getMessage2(){
		return Message2.getText();
	}
	public void selectLeaveHistory(){
		 jsclick(LeaveHistory);
	}
	public void selectView(){
		View.click();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickAllowAccessCasual(){
		if(AllowAccessCasual.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			AllowAccessCasual.click();
		}
	}
	public void clickPrioritySettings(){
		if(PrioritySettings.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			PrioritySettings.click();
		}
	}
	public void clickCompensatoryOff(){
		CompensatoryOff.click();
	}
	public void clickSelectLeave(){
		SelectLeave.click();
	}
	public void clickAddNewLeaveEnc(){
		AddNewLeaveEnc.click();
	}
	public void clickLeaveEncashment(){
		AppyLeaveEnc.click();
	}
	public void clickView(){
		View.click();
	}
	public void unselectEncash() {
		AllowAccessCasual.click();
	}
}
