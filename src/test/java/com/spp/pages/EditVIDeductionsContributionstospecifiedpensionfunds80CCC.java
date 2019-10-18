package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditVIDeductionsContributionstospecifiedpensionfunds80CCC extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*[@id=\"six_a_ded_details\"]/table/tbody/tr[2]/td[3]/a")
	WebElement Contributionstospecifiedpensionfunds80CCC;
	@FindBy(id="six_a_deduction_tds_manual_entry")
	WebElement EditedGrossAmount;
	@FindBy(id="six_a_deduction_narration")
	WebElement Narrations;
	@FindBy(xpath="//*/div[3]/form/div[9]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditVIDeductionsContributionstospecifiedpensionfunds80CCC(WebDriver driver) {
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
		Contributionstospecifiedpensionfunds80CCC.click();
	}
	public void EnterGrossAmt(String value) {
		EditedGrossAmount.clear();
		EditedGrossAmount.sendKeys(value);
	}
	public void EnterNarrations(String value) {
		Narrations.clear();
		Narrations.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
