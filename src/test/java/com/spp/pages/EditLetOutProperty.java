package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditLetOutProperty extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement HouseRentProperty;
	@FindBy(xpath="//a[contains(text(),'Let Out Property')]")
	WebElement LetOutProperty;
	@FindBy(xpath="//tbody/tr/td[5]/a[1]")
	WebElement Edit;
	@FindBy(id="house_property_let_out_property_gross_anual_value")
	WebElement GrossAnnualValue;
	@FindBy(xpath="//*[@id=\"let_out_property\"]/div[2]/input")
	WebElement UpdateAndPopulate;
	@FindBy(xpath="//*[@id=\"reimbursement_claim_result_response\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditLetOutProperty(WebDriver driver) {
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
	public void ClickEdit() {
		Edit.click();
	}
	public void EnterGrossAnnualValue(String value) {
		GrossAnnualValue.clear();
		GrossAnnualValue.sendKeys(value);
	}
	public void ClickUpdateAndPopulate() {
		UpdateAndPopulate.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
}
