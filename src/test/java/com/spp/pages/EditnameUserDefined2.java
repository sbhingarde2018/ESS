package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditnameUserDefined2 extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/nav/ul/li[5]/a/span")
	WebElement Perquisites;
	@FindBy(xpath="//tr[142]/td[1]/table/tbody/tr/th[2]/a")
	WebElement EditName;
	@FindBy(xpath="//tbody/tr[137]/td[1]/div/div/div[2]/form/div[2]/div/div/input")
	WebElement Heading;
	@FindBy(xpath="//*/div/div[2]/form/div[3]/div/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement SelectFinancialYear;
	
	public EditnameUserDefined2(WebDriver driver) {
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
	public void ClickPerquisites() {
		Perquisites.click();
	}
	public void clickEditName() {
		EditName.click();
	}
	public void EnterName(String value) {
		Heading.clear();
		Heading.sendKeys(value);
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
