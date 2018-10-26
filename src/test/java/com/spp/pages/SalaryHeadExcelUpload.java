package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryHeadExcelUpload extends BasePage{

	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Salary Heads']")
	WebElement salaryheads;
	@FindBy(xpath="//*[@id='ui-accordion-accordion-panel-0']/li[2]/a")
	WebElement ExcelTemplateUploadLink;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//input[@value='Upload File']")
	WebElement UploadLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a")
	WebElement SalaryHeadsLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/nav/ul/li[2]/a/span")
	WebElement DeductionTab;
	
	
	public SalaryHeadExcelUpload(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickSalaryHeads() throws Exception{
		salaryheads.click();
	}

	public void clickExcelTemplateUploadLink() throws Exception{
		ExcelTemplateUploadLink.click();
	}
	
	public void clickChooseFile(String value) throws Exception{
		ChooseFile.sendKeys(value);
	}
	public void clickUploadLink() throws Exception{
		UploadLink.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickSalaryHeadsLink() throws Exception{
		SalaryHeadsLink.click();
	}
	public void clickDeductionTab() throws Exception{
		DeductionTab.click();
	}
	
}
