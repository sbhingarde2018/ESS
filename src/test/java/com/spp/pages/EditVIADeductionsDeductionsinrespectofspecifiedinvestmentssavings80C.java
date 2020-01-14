package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditVIADeductionsDeductionsinrespectofspecifiedinvestmentssavings80C extends BasePage{
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*[@id=\"six_a_ded_details\"]/table/tbody/tr[1]/td[3]/a")
	WebElement Deductionsinrespectofspecifiedinvestmentssavings80C;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_date']")
	WebElement Date;
	@FindBy(xpath="//select[@id='six_a_deduction_manual_entry_sub_heads_2_tds_head_id']")
	WebElement Particulars;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_salary_gross_amount']")
	WebElement GrossAmount;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_proof_amount']")
	WebElement ProofAmount;
	@FindBy(xpath="//input[@id='six_a_deduction_manual_entry_sub_heads_2_remarks']")
	WebElement Remarks;
	@FindBy(xpath="//input[@id='save_deductions']")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//tr[@class='row_2']//td//a//img")
	WebElement Delete;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditVIADeductionsDeductionsinrespectofspecifiedinvestmentssavings80C(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputationDetails() {
		ComputationDetails.click();
	}
	public void ClickDetails() {
		Details.click();
	}
	public void ClickVIDeduction() {
		VIDeductions.click();
	}
	public void ClickDeductions() {
		Deductionsinrespectofspecifiedinvestmentssavings80C.click();
	}
	public void EnterDate(String value) {
		Date.sendKeys(value);
	}
	public void SelectParticulars(String value) {
		dropDownSelect(Particulars, value);
	}
	public void EnterGrossAmount(String value) {
		GrossAmount.sendKeys(value);
	}
	public void EnterProofAmount(String value) {
		ProofAmount.sendKeys(value);
	}
	public void EnterRemarks(String value) {
		Remarks.sendKeys(value);
	}
	public void clickSave() {
		SaveBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void ClickDelete() {
		Delete.click();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
