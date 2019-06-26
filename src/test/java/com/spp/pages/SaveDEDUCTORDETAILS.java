package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class SaveDEDUCTORDETAILS extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[7]/a")
	WebElement DedcutorDetails;
	@FindBy(id="deductor_details_name")
	WebElement Name;
	@FindBy(id="deductor_details_flat_door_block_no")
	WebElement FlatBlockNo;
	@FindBy(id="deductor_details_city")
	WebElement City;
	@FindBy(id="deductor_details_pincode")
	WebElement Pincode;
	@FindBy(id="deductor_details_state")
	WebElement State;
	@FindBy(id="deductor_details_address_change")
	WebElement AddressChange;
	@FindBy(id="deductor_details_email")
	WebElement Email;
	@FindBy(id="save")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement UpdateSuccess;
	
	public SaveDEDUCTORDETAILS(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickDedcutorDetails() {
		DedcutorDetails.click();
	}
	public void EnterName(String value) {
		Name.clear();
		Name.sendKeys(value);
	}
	public void EnterFlatBlockNo(String value) {
		FlatBlockNo.clear();
		FlatBlockNo.sendKeys(value);
	}
	public void EnterCity(String value) {
		City.clear();
		City.sendKeys(value);
	}
	public void EnterPincode(String value) {
		Pincode.clear();
		Pincode.sendKeys(value);
	}
	public void SelectState(String value) {
    	dropDownSelect(State, value);
	}
	public void SelectAddressChange(String value) {
    	dropDownSelect(AddressChange, value);
	}
	public void EnterEmail(String value) {
		Email.clear();
		Email.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
    	return UpdateSuccess.getText();
	}
}

