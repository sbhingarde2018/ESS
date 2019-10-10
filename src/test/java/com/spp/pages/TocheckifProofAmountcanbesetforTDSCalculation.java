package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckifProofAmountcanbesetforTDSCalculation extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[3]/a")
	WebElement OPtionsSettings;
	@FindBy(id="option_setting_serializer_tds_calculation_based_on_proof_amount")
	WebElement ProofAmount;
	@FindBy(id="option_setting_serializer_fin_month_year")
	WebElement MonthYear;
	@FindBy(xpath="//*[@id=\"new_option_setting_serializer\"]/fieldset/div/div[4]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	@FindBy(id="option_setting_serializer_tds_calculation_based_on_declared_amount")
	WebElement DeclaredAmount;
	@FindBy(xpath="//*[@id='option_setting_serializer_fin_year']")
	WebElement Year;
	
	public TocheckifProofAmountcanbesetforTDSCalculation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickOPtionsSettings() {
		OPtionsSettings.click();
	}
	public void ClickProofAmount() {
		ProofAmount.click();
	}
	public void SelectMonthYear(String value) {
    	dropDownSelect(MonthYear, value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
	public void ClickDeclaredAmount() {
		DeclaredAmount.click();
	}
	public void SelectYear(String value) {
    	dropDownSelect(Year, value);
	}
}
