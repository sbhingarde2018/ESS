package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class VIADeductionsDonationstospecifiedfundsInstitutions80G extends BasePage{
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//td[contains(text(),\"Donations to specified funds/Institutions 80G\")]/following::a[1]")  
	WebElement DonationstospecifiedfundsInstitutions80G;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_tds_head_id")
	WebElement Particulars;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_salary_gross_amount")
	WebElement SalaryGrossAmount;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_name_of_donee")
	WebElement NameOfTheDonee;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_address_of_donee")
	WebElement AddressOfTheDonee;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_city")
	WebElement City;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_state")
	WebElement State;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_pincode")
	WebElement Pincode;
	@FindBy(id="six_a_deduction_manual_entry_sub_heads_1_pan_of_donee")
	WebElement PanOfDonee;
	@FindBy(id="save_deductions")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	
	public VIADeductionsDonationstospecifiedfundsInstitutions80G(WebDriver driver) {
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
		DonationstospecifiedfundsInstitutions80G.click();
	}
	public void SelectParticulars(String value) {
		dropDownSelect(Particulars, value);
	}
	public void EnterSalary(String value) {
		SalaryGrossAmount.clear();
		SalaryGrossAmount.sendKeys(value);
	}
	public void EnterNameoftheDonee(String value) {
		NameOfTheDonee.clear();
		NameOfTheDonee.sendKeys(value);
	}
	public void EnterAddressoftheDonee(String value) {
		AddressOfTheDonee.clear();
		AddressOfTheDonee.sendKeys(value);
	}
	public void EnterCity(String value) {
		City.clear();
		City.sendKeys(value);
	}
	public void SelectState(String value) {
		dropDownSelect(State, value);
	}
	public void EnterPanOfDonee(String value) {
		PanOfDonee.clear();
		PanOfDonee.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void EnterPincode(String value) {
		Pincode.clear();
		Pincode.sendKeys(value);
	}
}
