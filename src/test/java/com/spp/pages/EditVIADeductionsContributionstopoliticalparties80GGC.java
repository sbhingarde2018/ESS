package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditVIADeductionsContributionstopoliticalparties80GGC extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//table/tbody/tr[16]/td[3]/a")
	WebElement Contributionstopoliticalparties80GGC;
	@FindBy(id="six_a_deduction_manual_entry_particulars_1_particular")
	WebElement Particulars;
	@FindBy(id="six_a_deduction_manual_entry_particulars_1_salary_gross_amount")
	WebElement GrossAmount;
	@FindBy(id="save_deductions")
	WebElement SaveBtn;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditVIADeductionsContributionstopoliticalparties80GGC(WebDriver driver) {
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
		Contributionstopoliticalparties80GGC.click();
	}
	public void EnterParticulars(String value) {
		Particulars.clear();
		Particulars.sendKeys(value);
	}
	public void EnterGrossAmount(String value) {
		GrossAmount.clear();
		GrossAmount.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
