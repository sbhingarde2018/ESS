package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class BulkTdsDeclarationsTemplateUpload extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[8]/a")
	WebElement BulkTDSDeclarations;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li/a[2]")
	WebElement Upload;
	@FindBy(id="computed_financial_year")
	WebElement FinancialYear;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//*[@id=\"employee_upload\"]/div[3]/div/div/fieldset/div/div[3]/input")
	WebElement UploadBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement SuccessMessage;
	
	
	public BulkTdsDeclarationsTemplateUpload(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	public void ClickTDs() {
	TDS.click();
	}
	public void ClickBulkTDSDeclarations() {
	BulkTDSDeclarations.click();
	}
	public void ClickUpload() throws Exception {
		Upload.click();
	}
	public void SelectFinancialYear(String value) throws Exception {
    	dropDownSelect(FinancialYear, value);
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
