package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditAllowancesUserDefined extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/nav/ul/li[4]/a/span")
	WebElement Allowances;
	@FindBy(xpath="//*[@id=\"references\"]/table/tbody/tr[115]/td[contains(text(),'Allowance Given')]/parent::tr/td/a")
	WebElement UDAllowanceGiven;
	@FindBy(id="tds_month_details__salary_details_sal_detail_1_tds_amount")
	WebElement EditedValues;
	@FindBy(xpath="//*[@id=\"editing_particular_details\"]/input")
	WebElement UpdateBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	@FindBy(xpath="//tr[114]/td[1]/table/tbody/tr/th[2]/a")
	WebElement EditName;
	@FindBy(xpath="//div[@id='UserDefined']//input[@id='custom_heading']")
	WebElement EditHeading;
	@FindBy(xpath="//div[@id='UserDefined']//input[@name='commit']")
	WebElement SaveBtn;
	
	public EditAllowancesUserDefined(WebDriver driver) {
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
	public void ClickUDAllowanceGiven() {
		UDAllowanceGiven.click();
	}
	public void EnterEditedValues(String value) {
		EditedValues.clear();
		EditedValues.sendKeys(value);
	}
	public void ClickUpdateBtn() {
		UpdateBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}
	public void selectFinancialYear(String value) {
		dropDownSelect(SelectFinancialYear, value);
	}
	public void ClickEditName() {
		EditName.click();
	}
	public void EnterHeadingName(String value) {
		EditHeading.clear();
		EditHeading.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
}
