package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class SelectLimitBorderAreaRemoteAreaAllowance extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/nav/ul/li[4]/a/span")
	WebElement Allowances;
	@FindBy(xpath="//*[@id=\"references\"]/table/tbody/tr[52]/td[contains(text(),'Allowance Given')]/parent::tr/td/a")
	WebElement BorderAreaAllowanceGiven;
	@FindBy(id="tds_month_details__salary_details_sal_detail_1_tds_amount")
	WebElement EditedValues;
	@FindBy(id="tds_month_details__attributes_attr0_attribute_value")
	WebElement SelectLimit;
	@FindBy(xpath="//*[@id=\"editing_particular_details\"]/input")
	WebElement UpdateBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	
	public SelectLimitBorderAreaRemoteAreaAllowance(WebDriver driver) {
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
	public void ClickAllowances() {
		Allowances.click();
	}
	public void ClickBorderAreaAllowanceGiven() {
		BorderAreaAllowanceGiven.click();
	}
	public void EnterEditedValues(String value) {
		EditedValues.clear();
		EditedValues.sendKeys(value);
	}
	public void SelectLimit(String value) {
		dropDownSelect(SelectLimit, value);
		
	}
	public void ClickUpdateBtn() {
		UpdateBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
}
