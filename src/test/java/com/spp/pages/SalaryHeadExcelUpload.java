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
	@FindBy(xpath="//a[text()='Generate Sample Template']")
	WebElement GenerateSampleTemplate;
	@FindBy(xpath="//a[contains(text(),'Excel Template Upload')]")
	WebElement ExcelTemplateUploadLink;
	@FindBy(id="excel_file")
	WebElement ChooseFile;
	@FindBy(xpath="//input[@value='Upload File']")
	WebElement UploadLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a")
	WebElement SalaryHeadsLink;
	@FindBy(xpath="//span[contains(text(),'Deduction')]")
	WebElement DeductionTab;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'BasicHeadEarn')]/parent::tr/td[5]/a[2]")
	WebElement DeleteUploadedEarningHead;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'BasicHeadDeduct')]/parent::tr/td[5]/a[2]")
	WebElement DeleteUploadedDeductionHead;
	
	
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
	public void clickGenerateSampleTemplate() throws Exception{
		GenerateSampleTemplate.click();
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
	public void deductionSalaryHeadDelete() throws Exception{
		DeleteUploadedDeductionHead.click();
	}
	public void earningSalaryHeadDelete() throws Exception{
		DeleteUploadedEarningHead.click();
	}
}