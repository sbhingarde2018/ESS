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
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*[@id=\"six_a_ded_details\"]/table/tbody/tr[1]/td[3]/a")
	WebElement Deductionsinrespectofspecifiedinvestmentssavings80C;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_date")
	WebElement Date;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_tds_head_id")
	WebElement Particulars;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_salary_gross_amount")
	WebElement GrossAmount;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_proof_amount")
	WebElement ProofAmount;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_remarks")
	WebElement Remarks;
	@FindBy(id="save_deductions")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//*/tbody/tr[1]/td[8]/a")
	WebElement Delete;
	
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
}
