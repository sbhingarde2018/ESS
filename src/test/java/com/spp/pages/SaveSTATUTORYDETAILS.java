package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class SaveSTATUTORYDETAILS extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[7]/a")
	WebElement DedcutorDetails;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/nav/ul/li[3]/a/span")
	WebElement StatutoryDetails;
	@FindBy(id="statutory_details_tan")
	WebElement TAN;
	@FindBy(id="statutory_details_status")
	WebElement Status;
	@FindBy(id="statutory_details_tds_assesse")
	WebElement ExistingTDSAssesse;
	@FindBy(id="statutory_details_return_type")
	WebElement ReturnType;
	@FindBy(id="statutory_details_deductor_type")
	WebElement DeductorType;
	@FindBy(xpath="//*[@id=\"deductor_statutory_details_form\"]/div[5]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement UpdateSuccess;

	public SaveSTATUTORYDETAILS(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickDedcutorDetails() {
		DedcutorDetails.click();
	}
	public void ClickStatutaryDetails() {
		StatutoryDetails.click();
	}
	public void EnterTAN(String value) {
		TAN.clear();
		TAN.sendKeys(value);
	}
	public void SelectStatus(String value) {
    	dropDownSelect(Status, value);
    }
	public void SelectExistingTDSAssesse(String value) {
    	dropDownSelect(ExistingTDSAssesse, value);
    }
	public void SelectReturnType(String value) {
    	dropDownSelect(ReturnType, value);
    }
	public void SelectDeductorType(String value) {
    	dropDownSelect(DeductorType, value);
    }
	public void ClickSave() {
		SaveBtn.click();
	}
	public String getMessage() {
    	return UpdateSuccess.getText();
	}
}
