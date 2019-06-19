package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class PopulateLetOutProperty extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement HouseRentProperty;
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/li[1]/a")
	WebElement LetOutProperty;
	@FindBy(xpath="//div[4]/span/a")
	WebElement Add;
	@FindBy(id="house_property_let_out_property_gross_anual_value")
	WebElement GrossAnnualValue;
	@FindBy(id="house_property_let_out_property_municipal_taxes_paid")
	WebElement MunicipalTaxesPaid;
	@FindBy(id="house_property_let_out_property_share_in_property_percentage")
	WebElement PercentageOfShareinProperty;
	@FindBy(id="house_property_let_out_property_interest")
	WebElement Interest;
	@FindBy(id="house_property_let_out_property_preconstruction_interest")
	WebElement PreConstructionInterest;
	@FindBy(id="house_property_let_out_property_arrears_of_rent_received_allowed_earlier")
	WebElement ArrearsOfRentRec;
	@FindBy(id="house_property_let_out_property_arrears_of_rent_received_not_charged_earlier")
	WebElement NotChargedEarlier;
	@FindBy(id="populate")
	WebElement Populate;
	
	
	public PopulateLetOutProperty(WebDriver driver) {
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
	public void ClickHouseRentProperty() {
		HouseRentProperty.click();
	}
	public void ClickLetOutProperty() {
		LetOutProperty.click();
	}
	public void ClickAdd() {
		Add.click();
	}
	public void EnterGrossAnnualValue(String value) {
		GrossAnnualValue.clear();
		GrossAnnualValue.sendKeys(value);
	}
	public void EnterMunicipalTaxesPaid(String value) {
		MunicipalTaxesPaid.clear();
		MunicipalTaxesPaid.sendKeys(value);
	}
	public void EnterPercentageOfShareinProperty(String value) {
		PercentageOfShareinProperty.clear();
		PercentageOfShareinProperty.sendKeys(value);
	}
	public void EnterInterest(String value) {
		Interest.clear();
		Interest.sendKeys(value);
	}
	public void EnterPreConstructionInterest(String value) {
		PreConstructionInterest.clear();
		PreConstructionInterest.sendKeys(value);
	}
	public void EnterArrearsOfRentRec(String value) {
		ArrearsOfRentRec.clear();
		ArrearsOfRentRec.sendKeys(value);
	}
	public void EnterNotChargedEarlier(String value) {
		NotChargedEarlier.clear();
		NotChargedEarlier.sendKeys(value);
	}
	public void ClickPopulate() {
		Populate.click();
	}
}
