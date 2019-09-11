package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class HolidayWeeklyoffSettings extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClonePolicy')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement casualLeaveallowedavaiformonth; 
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_year")
    WebElement casualLeaveallowedavailforyear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_leave_year")
    WebElement casualLeavemustbeAvailedinYear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_days_applied")
    WebElement daysshouldbeappliedtoavailtheCasualLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_days_applied")
    WebElement casualLeavethatcanbeavailedforinstance ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_prior_days")
    WebElement PriorDays ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_backdate")
    WebElement backDate;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_allow_half")
    WebElement allowHalfDay;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_avail_excess_leave")
    WebElement allowExcessLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_general_setting")
    WebElement considerasLOP;
    @FindBy(xpath="//div [@id='behaviour_policy_setting']//div[3]//input[@value='Update']")
    WebElement updateButton;
    @FindBy(xpath="//strong[text()='Setting was successfully updated.']")
    WebElement successfullMessage;
    @FindBy(id="non_saved_leaves")
	WebElement leaveType;
    @FindBy(xpath="//input[@value='Add']")
    WebElement addButton;
    @FindBy(id="leave")
    WebElement ClickOnLeave;
    @FindBy(xpath="//*[@id='menu']/li[5]/div/div/ul/li[1]/a")
    WebElement ClickOnApplyLeave;
    @FindBy(id="filter_head")
    WebElement ClickOnFilter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
    WebElement ClickOnLoad;
    @FindBy(xpath="//tbody/tr/td[contains(text(),'Zain')]/parent::tr/td/a")
    WebElement ClickOnAPPLYLEAVE;
    @FindBy(id="leave_detail_leave_definition_id")
    WebElement SelectLeave;
    @FindBy(id="leave_detail_from_date")
    WebElement FromDate;
    @FindBy(id="leave_detail_to_date")
    WebElement ToDate;
    @FindBy(id="apply")
    WebElement Apply;
    @FindBy(xpath="//*[@id='apply_leave_response']/div/li")
    WebElement AlertMessage;
    @FindBy(xpath="//*[@id='main']/div/div[3]/nav/ul/li[3]/a/span")
    WebElement WeeklyOff;
    @FindBy(xpath="(//input[@id='leave_policy_head_wise_setting_holiday_settings_consider_leave'])[2]")
    WebElement LeaveHasHoliday;
    @FindBy(id="leave_policy_head_wise_setting_holiday_settings_days")
    WebElement HolidayNoofLeaveDays;
    @FindBy(id="leave_policy_head_wise_setting_holiday_settings_prefix")
    WebElement HolidayPrefix;
    @FindBy(xpath="//*[@id='holidy_weekly_off_setting']/input")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id='leave_policy_head_wise_settings_response']/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(linkText="Apply Leave")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
    WebElement Load;
    @FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
    @FindBy(xpath="//input[@id='apply']")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id='apply_leave_response']/div/strong")
	WebElement Message2;
	@FindBy(xpath="//span[contains(text(),'LEAVE HISTORY')]")
	WebElement LeaveHistory;
	@FindBy(xpath="//tr[1]//td[4]//a[1]")
	WebElement View;
	@FindBy(xpath="//form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement DeleteButton;
	@FindBy(id="to_date")
	WebElement LeaveHistoryToDate;
	@FindBy(xpath="//*[@id='leave_range_data']/div[3]/div/div/input[2]")
	WebElement SearchButton;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")
	WebElement FromDatePicker;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a")
	WebElement ToDatePicker;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")
	WebElement FromDatePicker1;
	@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[6]/a")
	WebElement ToDatePicker1;
	@FindBy(xpath="(//input[@id='leave_policy_head_wise_setting_weekly_off_settings_consider_leave'])[2]")
    WebElement LeaveHasWeeklyOff;
    @FindBy(id="leave_policy_head_wise_setting_weekly_off_settings_days")
    WebElement WeeklyOffNoofLeaveDays;
    @FindBy(id="leave_policy_head_wise_setting_weekly_off_settings_prefix")
    WebElement WeeklyOffPrefix;
	@FindBy(xpath="//input[@id='from_date']")
	WebElement HistoryFromDate;
	@FindBy(xpath="//td//input[@id='leave_policy_head_wise_setting_holiday_settings_consider_leave']")
	WebElement HolidaySettings;
	@FindBy(xpath="//td/input[@id='leave_policy_head_wise_setting_weekly_off_settings_consider_leave']")
	WebElement WeeklySettings;
    
	public HolidayWeeklyoffSettings(WebDriver driver) {
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
	public void clickWeeklyOff(){
		WeeklyOff.click();
	}
	public void clickLeaveCheckbox() {
		LeaveHasHoliday.click();
	}
	public void PrefixLeaves(String value) {
		HolidayNoofLeaveDays.clear();
		HolidayNoofLeaveDays.sendKeys(value);
		HolidayNoofLeaveDays.sendKeys(Keys.TAB);
	}
	public void clickPrefixCheckbox() {
		HolidayPrefix.click();
	}
	public void clickUpdateButton() {
		UpdateButton.click();
	}
	public String getMessage1(){
		return SuccessfulMessage.getText();
	}
	public void clickLeaveLink(){
		LeaveLink.click();
	}
	public void clickAppyLeaveLink(){
		AppyLeaveLink.click();
	}
	public void clickFilter(){
		Filter.click();
	}
	
	public void clickLoad(){
		Load.click();
	}
	public void ClickOnApplyLeave() {
		ClickOnAPPLYLEAVE.click();
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
		jsclick(ApplyButton);
	}
	public String getMessage2(){
		return Message2.getText();
	}
	public String getMessage(){
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
	public void enterHistoryToDate(String value){
		LeaveHistoryToDate.clear();
		LeaveHistoryToDate.sendKeys(value);
		LeaveHistoryToDate.sendKeys(Keys.TAB);
	}
	public void clickSearchButton(){
		SearchButton.click();
	}
	public void enterFromDate1(String value){
		FromDate.sendKeys(value);
		FromDatePicker1.click();
	}
	public void enterToDate1(String value){
		ToDate.sendKeys(value);
		ToDatePicker1.click();
		//ToDate.sendKeys(Keys.TAB);
	}
	public void EnterHistoryFromDate(String value){
		HistoryFromDate.clear();
		HistoryFromDate.sendKeys(value);
		HistoryFromDate.sendKeys(Keys.TAB);
	}
	public void clickHolidaySettings(){
		if(HolidaySettings.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			HolidaySettings.click();
		}
	}
	public void clickWeeklySettings(){
		WeeklySettings.click();
	}
	public void UnselectSetttings() {
		HolidaySettings.click();
	}
}