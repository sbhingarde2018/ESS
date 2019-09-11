package com.spp.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LeaveBehaviourSettings extends BasePage{
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
    @FindBy(xpath="//div[@id='behaviour_policy_setting']//input[@name='commit']")
    WebElement updateButton;
    @FindBy(xpath="//strong[text()='Setting was successfully updated.']")
    WebElement successfullMessage;
    @FindBy(id="non_saved_leaves")
	WebElement leaveType;
    @FindBy(xpath="//input[@value='Add']")
    WebElement addButton;
    @FindBy(id="leave")
    WebElement ClickOnLeave;
    @FindBy(xpath="//a[contains(text(),'Apply Leave')]")
    WebElement ClickOnApplyLeave;
    @FindBy(id="filter_head")
    WebElement ClickOnFilter;
    @FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
    WebElement ClickOnLoad;
    //@FindBy(xpath="//*[@id='dt_leave_details']/tbody/tr/td[3]/a")
    @FindBy(xpath="//tbody/tr/td[contains(text(),'Zain')]/parent::tr/td[3]/a")
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
    @FindBy(xpath="//div[3]/nav/ul/li[3]/a/span")
    WebElement LeaveHistory;
    @FindBy(id="from_date")
    WebElement HistoryFromDate;
    @FindBy(xpath="//div[@class='form-field']//input[@name='commit']")
    WebElement SearchButton;
    @FindBy(xpath="//table[@class='table all-white']//input[@name='commit']")
    WebElement DeleteButton;
    @FindBy(xpath="//table/tbody/tr[1]/td[4]/a")
    WebElement View;
    
	public LeaveBehaviourSettings(WebDriver driver) {
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
	
	public void selectLeaveType(String value){
		dropDownSelect(leaveType, value);
	}

	public void clickAddButton(){
		addButton.click();	
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	
	public void enterCasualLeaveallowedavaiformonth(String value){
		casualLeaveallowedavaiformonth.clear();
		casualLeaveallowedavaiformonth.sendKeys(value);
	}
	
	public void enterCasualLeaveallowedavailforyear(String value){
		casualLeaveallowedavailforyear.clear();
		casualLeaveallowedavailforyear.sendKeys(value);
	}
	
	public void enterCasualLeavemustbeAvailedinYear(String value){
		casualLeavemustbeAvailedinYear.clear();
		casualLeavemustbeAvailedinYear.sendKeys(value);
	}
	
	public void enterDaysshouldbeAppliedtoAvailtheCasualLeave(String value){
		daysshouldbeappliedtoavailtheCasualLeave.clear();
		daysshouldbeappliedtoavailtheCasualLeave.sendKeys(value);
	}
	
	public void enterCasualLeavethatcanbeAvailedforInstance(String value){
		casualLeavethatcanbeavailedforinstance.clear();
		casualLeavethatcanbeavailedforinstance.sendKeys(value);
	}
	
	public void enterPriorDays(String value){
		PriorDays.clear();
		PriorDays.sendKeys(value);
	}
	
	public void clickBackDate(){
		backDate.click();
	}
	
	public void clickAllowHalfDay(){
		allowHalfDay.click();
	}
	
	public void clickAllowExcessLeave(){
		allowExcessLeave.click();
	}
	
	public void clickConsiderasLOP(){
		considerasLOP.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
	
	public void Leavemaster() {
		ClickOnLeave.click();
	}
	public void ApplyLeavemodule() {
		ClickOnApplyLeave.click();
	}
	public void ClickonFilter() {
		ClickOnFilter.click();
	}
	public void ClickOnLOAD() {
		ClickOnLoad.click();
	}
	public void ClickOnApplyLeave() {
		ClickOnAPPLYLEAVE.click();
	}
	public void SelectLeave(String value) {
		dropDownSelect(SelectLeave, value);
	}
	public void EnterFromDate(String value) {
		FromDate.clear();
		FromDate.sendKeys(value);
	}
	public void EnterToDate(String value) throws InterruptedException{
		ToDate.clear();
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	public void clickapply() {
		Apply.click();
	}
	public String getalertMessage() {
		return AlertMessage.getText();
	}
	public void ClickLeaveHistory() {
		jsclick(LeaveHistory);
	}
	public void EnterHistoryFromDate(String value) {
		HistoryFromDate.clear();
		HistoryFromDate.sendKeys(value);
	}
	public void ClickSearchButton() {
		SearchButton.click();
	}
	public void ClickDeleteButton() throws InterruptedException {
		DeleteButton.click();
		Thread.sleep(2000);
		switchToPopUpAndAccept(driver);
	}
	public void ClickView() {
		View.click();
	}
	public void DeleteCasualLeaveallowedavaiformonth(){
		casualLeaveallowedavaiformonth.clear();
	}
	public void DeleteCasualLeaveallowedavailforyear(){
		casualLeaveallowedavailforyear.clear();
	}
}