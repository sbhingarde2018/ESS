package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditVIADeductionsMedicalinsurancepremiumpaid80D extends BasePage{
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//*/table/tbody/tr[8]/td[3]/a")
	WebElement Medicalinsurancepremiumpaid80D;
	@FindBy(id="six_a_deduction_sub_attr_1_health_insurance_premium")
	WebElement HealthInsurancePremium;
	@FindBy(id="six_a_deduction_sub_attr_1_preventive_checkup_amount")
	WebElement PreventiveHealthCheckup;
	@FindBy (id="compute")
	WebElement ComputeBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement ComputeSuccess;
	@FindBy(id="save") 
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditVIADeductionsMedicalinsurancepremiumpaid80D(WebDriver driver) {
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
		Medicalinsurancepremiumpaid80D.click();
	}
	public void EnterHealthInsurancePremium(String value) {
		HealthInsurancePremium.clear();
		HealthInsurancePremium.sendKeys(value);
	}
	public void EnterPreventiveHealthCheckup(String value) {
		PreventiveHealthCheckup.clear();
		PreventiveHealthCheckup.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public String getMessage1() {
		return ComputeSuccess.getText();
	}
	public void Clickcompute() {
		ComputeBtn.click();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
