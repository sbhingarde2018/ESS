package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditVIADeductionsContributionstoPensionfundsfromcentralgovernmentemployer80CCD2 extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*/table/tbody/tr[5]/td[3]/a")
	WebElement ContributionstoPensionfundsfromcentralgovernmentemployees80CCD2;
	@FindBy(id="six_a_deduction_tds_manual_entry")
	WebElement EditedGrossAmount;
	@FindBy(id="six_a_deduction_narration")
	WebElement Narrations;
	@FindBy(xpath="//*/div[3]/form/div[9]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	
	public EditVIADeductionsContributionstoPensionfundsfromcentralgovernmentemployer80CCD2(WebDriver driver) {
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
		ContributionstoPensionfundsfromcentralgovernmentemployees80CCD2.click();
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
}
