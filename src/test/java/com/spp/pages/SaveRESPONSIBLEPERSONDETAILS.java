package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class SaveRESPONSIBLEPERSONDETAILS extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[7]/a")
	WebElement DedcutorDetails;
	@FindBy(xpath="//div/div[1]/nav/ul/li[2]/a/span")
	WebElement ResponsiblePersonDetails;
	@FindBy(id="responsible_person_details_name")
	WebElement Name;
	@FindBy(id="responsible_person_details_flat_door_block_no")
	WebElement FlatdoorNo;
	@FindBy(id="responsible_person_details_pincode")
	WebElement Pincode;
	@FindBy(id="responsible_person_details_pan")
	WebElement PanNumber;
	@FindBy(id="responsible_person_details_sex")
	WebElement Sex;
	@FindBy(id="responsible_person_details_designation")
	WebElement Designation;
	@FindBy(id="responsible_person_details_state")
	WebElement state;
	@FindBy(id="responsible_person_details_address_change")
	WebElement AddressChange;
	@FindBy(xpath="//*[@id=\"responsible_person_details_form\"]/div[5]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement UpdateSuccess;
	
	public SaveRESPONSIBLEPERSONDETAILS(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickDedcutorDetails() {
		DedcutorDetails.click();
	}
	public void ClickResponsiblePersonDetails() {
		ResponsiblePersonDetails.click();
	}
	public void EnterName(String value) {
		Name.clear();
		Name.sendKeys(value);
	}
	public void EnterFlatdoorNo(String value) {
		FlatdoorNo.clear();
		FlatdoorNo.sendKeys(value);
	}
	public void EnterPincode(String value) {
		Pincode.clear();
		Pincode.sendKeys(value);
	}
	public void EnterPanNumber(String value) {
		PanNumber.clear();
		PanNumber.sendKeys(value);
	}
	public void SelectSex(String value) {
    	dropDownSelect(Sex, value);
	}
	public void EnterDesignation(String value) {
		Designation.clear();
		Designation.sendKeys(value);
	}
	public void Selectstate(String value) {
    	dropDownSelect(state, value);
    }
	public void SelectAddressChange(String value) {
    	dropDownSelect(AddressChange, value);
    }
	public void clickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
    	return UpdateSuccess.getText();
	}
}
