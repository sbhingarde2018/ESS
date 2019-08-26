package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckTaxcalculationbasedonProofAmount extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationalDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td[contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*[@id=\"six_a_ded_details\"]/table/tbody/tr[1]/td[3]")
	WebElement Deductions80C;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_tds_head_id")
	WebElement Particulars;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_salary_gross_amount")
	WebElement GrossAmount;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_proof_amount")
	WebElement ProofAmount;
	@FindBy(id="save_deductions")
	WebElement SaveBtn;
	WebElement OPtionsSettings;
	@FindBy(id="option_setting_serializer_tds_calculation_based_on_proof_amount")
	WebElement ProofAmount1;
	@FindBy(id="option_setting_serializer_fin_month_year")
	WebElement MonthYear;
	@FindBy(xpath="//*[@id=\"new_option_setting_serializer\"]/fieldset/div/div[4]/input")
	WebElement SaveBtn1;
	
	public TocheckTaxcalculationbasedonProofAmount(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputationalDetails() {
		ComputationalDetails.click();
	}
	public void ClickDetails() {
		Details.click();
	}
	public void ClickVIDeductions() {
		VIDeductions.click();
	}
	public void ClickDeductions80C() {
		Deductions80C.click();
	}
	public void SelectParticulars(String value) {
    	dropDownSelect(Particulars, value);
	}
	public void EnterGrossAmount(String value) {
    	GrossAmount.clear();
    	GrossAmount.sendKeys(value);
	}
	public void EnterProofAmount(String value) {
		ProofAmount.clear();
		ProofAmount.sendKeys(value);
	}
	public void ClickSaveBtn1() {
		SaveBtn.click();
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
}
