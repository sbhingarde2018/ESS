package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class EditnameUserDefined extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div/nav/ul/li[4]/a/span")
	WebElement Allowances;
	@FindBy(xpath="//*[@id=\"references\"]/table/tbody/tr[114]/td[1]/table/tbody/tr/th[2]/a")
	WebElement EditName;
	@FindBy(id="custom_heading")
	WebElement EditHeading;
	@FindBy(xpath="//*/div/div[2]/form/div[3]/div/input") 
	WebElement SaveBtn;    
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	
	public EditnameUserDefined(WebDriver driver) {
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
	public String getMessage() {
		return UpdateSuccess.getText();
}
}
