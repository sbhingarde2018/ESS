package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UploadForm16 extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[9]/a")
	WebElement Form16;
	@FindBy(xpath="//a[contains(text(),'Upload')]")
	WebElement Upload;
	@FindBy(xpath="//select[@id='financial_year']")
	WebElement AssessmentYear;
	@FindBy(xpath="//input[@id='form16_file']")
	WebElement ChooseFile;
	@FindBy(xpath="//input[@id='classbutton']")
	WebElement UploadBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div")
	WebElement SuccessMessage;
	
	public UploadForm16(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	public void ClickTDs() {
		TDS.click();
	}
	public void ClickForm16() {
		Form16.click();
	}
	public void ClickUpload() {
		Upload.click();
	}
	public void SelectAssessmentYear(String value) {
    	dropDownSelect(AssessmentYear, value);
	}
	public void clickChooseFile(String value) throws Exception {
		ChooseFile.sendKeys(value);
	}
	public void clickUploadBtn() throws Exception{
		UploadBtn.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
}
