package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckTaxcalculationbasedonProofAmount extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//a[contains(text(),'Computation Details')]")
	WebElement ComputationalDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*[@id=\"six_a_ded_details\"]/table/tbody/tr[1]/td[3]")
	WebElement Deductions80C;
	@FindBy(xpath="//select[@id='six_a_deduction_manual_entry_sub_heads_2_tds_head_id']")
	WebElement Particulars;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_salary_gross_amount']")
	WebElement GrossAmount;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_proof_amount']")
	WebElement ProofAmount;
	@FindBy(xpath="//input[@name='commit']")
	WebElement SaveBtn;
	@FindBy(xpath="//a[contains(@class,'tab_border')][contains(text(),'Option Settings')]")
	WebElement OPtionsSettings;
	@FindBy(id="option_setting_serializer_tds_calculation_based_on_proof_amount")
	WebElement ProofAmount1;
	@FindBy(xpath="//select[@id='option_setting_serializer_fin_month_year']")
	WebElement MonthYear;
	@FindBy(xpath="//*[@id=\"new_option_setting_serializer\"]/fieldset/div/div[4]/input")
	WebElement SaveBtn1;
	@FindBy(xpath="//select[@id='option_setting_serializer_fin_year']")
	WebElement Year;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	@FindBy(xpath="//*[@id='menu']/li[7]/div/div/ul/li[1]/a")
	WebElement Computation;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//input[@name='commit']")
	WebElement Compute;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement cdSelectFinancialYear;
	@FindBy(xpath="//select[@id='tds_financial_year']")
	WebElement computationSelectFinancialYear;
	@FindBy(id="option_setting_serializer_tds_calculation_based_on_proof_amount")
	WebElement SelectProofAmount;
	
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
		SelectProofAmount.click();
	}
	public void SelectMonthYear(String value) {
    	dropDownSelect(MonthYear, value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public void SelectYear(String value) {
    	dropDownSelect(Year, value);
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
	public void ClickComputation() {
		Computation.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickComputeButton() {
		Compute.click();
	}
	public void CDselectFinancialYear(String value) {
		dropDownSelect(cdSelectFinancialYear, value);
	}
	public void ComputationselectFinancialYear(String value) {
		dropDownSelect(computationSelectFinancialYear, value);
	}
}
