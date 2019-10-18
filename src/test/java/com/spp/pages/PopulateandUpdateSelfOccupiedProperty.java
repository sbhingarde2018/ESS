package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class PopulateandUpdateSelfOccupiedProperty extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement HouseRentProperty;
	@FindBy(xpath="//a[contains(text(),'Self Occupied Property')]")
	WebElement SelfOccupiedProperty;
	@FindBy(id="house_property_self_occupied_property_gross_anual_value")
	WebElement GrossAnnualValue;
	@FindBy(id="house_property_self_occupied_property_share_in_percentage")
	WebElement ShareinPercentage;
	@FindBy(xpath="//input[@class='btn2 btn-bglightblue']")
	WebElement PopulateandUpdate;
	@FindBy(xpath="//*[@id=\"self-occupied-form\"]/section/div[2]/strong") 
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public PopulateandUpdateSelfOccupiedProperty(WebDriver driver) {
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
	public void ClickSelfOccupiedProperty() {
		SelfOccupiedProperty.click();
	}
	public void EnterGrossAnnualValue(String value) {
		GrossAnnualValue.clear();
		GrossAnnualValue.sendKeys(value);
	}
	public void EnterShareinPercentage(String value) {
		ShareinPercentage.clear();
		ShareinPercentage.sendKeys(value);
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void ClickPopulateandUpdate() {
		PopulateandUpdate.click();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
