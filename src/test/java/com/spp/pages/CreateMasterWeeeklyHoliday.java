package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spp.common.BasePage;

public class CreateMasterWeeeklyHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Master Weekly Holiday']")
	WebElement masterWeekly;
	@FindBy(xpath="//tbody/tr/td[3]/a")
	WebElement viewLink;
	@FindBy(xpath="//span[contains(text(),'New Master Weekly Off')]")
	WebElement newMasterTab;
	@FindBy(id="eff_from")
	WebElement effectiveFrom;
	@FindBy(id="master_weekly_off_first_week_first_off")
	WebElement firstWeeklyOff;
	@FindBy(id="master_weekly_off_first_week_off_1")
	WebElement halforFull;
	@FindBy(id="master_weekly_off_first_week_second_off")
	WebElement secondWeeklyOff;
	@FindBy(id="master_weekly_off_first_week_off_2")
	WebElement shalforFullday;
	@FindBy(xpath="//input[@value='Create Master Weekly Off']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='Master Weekly off Successfully created.']")
	WebElement successfullMessage;

	public CreateMasterWeeeklyHoliday(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectMasterWeekly(){
		masterWeekly.click();
	}
	
	public void clickViewLink(){
		viewLink.click();
	}
	
	public void clickNewMasterTab(){
		jsclick(newMasterTab);
	}
	
	public void enterEffectiveFromDate(String value){
		effectiveFrom.sendKeys(value);
	}
	
	public void selectFirstWeeklyOff(String value){
		dropDownSelect(firstWeeklyOff, value);
	}
	
	public void selectHalfOrFullDay(String value){
		dropDownSelect(halforFull, value);
	}
	
	public void selectsScondWeeklyOff(String value){
		dropDownSelect(secondWeeklyOff, value);
	}
	
	public void selectSHalforFullDay(String value){
		dropDownSelect(shalforFullday, value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}
