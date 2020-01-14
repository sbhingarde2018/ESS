package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class EditVIADeductionsDeductioninrespectofrentpaid80GG extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//table/tbody/tr[14]/td[3]/a")
	WebElement DonationsforscientificresearchRuraldevelopmentetc80GGA;
	@FindBy(id="six_a_deduction_rent_paid")
	WebElement RentPaid;
	@FindBy(id="six_a_deduction_no_of_months")
	WebElement NoofMonths;
	@FindBy(xpath="//button[@id='compute']")
	WebElement Compute;
	@FindBy(id="save")
	WebElement SaveBtn;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditVIADeductionsDeductioninrespectofrentpaid80GG(WebDriver driver) {
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
		DonationsforscientificresearchRuraldevelopmentetc80GGA.click();
	}
	public void EnterRentPaid(String value) {
		RentPaid.clear();
		RentPaid.sendKeys(value);
	}
	public void EnterNoofMonths(String value) {
		NoofMonths.clear();
		NoofMonths.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public void ClickComputeBtn() {
		Compute.click();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
