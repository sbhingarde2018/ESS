package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckTaxcalculationbasedonDeclaredAmount extends BasePage {
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
	@FindBy(id="save_deductions")
	WebElement SaveBtn;
	@FindBy(xpath="//select[@id='tds_financial_year']")
	WebElement computationSelectFinancialYear;
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
	
	
	public TocheckTaxcalculationbasedonDeclaredAmount(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputation() {
		Computation.click();
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
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public void ComputationselectFinancialYear(String value) {
		dropDownSelect(computationSelectFinancialYear, value);
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
}

