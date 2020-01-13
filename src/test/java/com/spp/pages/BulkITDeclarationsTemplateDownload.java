package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class BulkITDeclarationsTemplateDownload extends BasePage {
	@FindBy(xpath="//a[@id='tds']")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[8]/a")
	WebElement BulkTDSDeclarations;
	@FindBy(id="tds_financial_year")
	WebElement FinancialYear;
	@FindBy(id="filter_head")
	WebElement FilterHead;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Jaya')]/parent::tr/td[1]")
	WebElement SelectEmp;
	@FindBy(xpath="//*[@id=\"bulk_it_download\"]/div[5]/input")
	WebElement Download;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessMessage;
	
	
	public BulkITDeclarationsTemplateDownload(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);

	}
	public void ClickTDs() {
		TDS.click();
	}
	public void ClickBulkTDSDeclarations() {
		BulkTDSDeclarations.click();
	}
	public void SelectFinancialYear(String value) {
    	dropDownSelect(FinancialYear, value);
	}
	public void ClickFilterHead() {
		FilterHead.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void SelectEmp() {
		SelectEmp.click();
	}
	public void ClickDownload() {
		Download.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
}
