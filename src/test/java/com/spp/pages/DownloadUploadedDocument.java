package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DownloadUploadedDocument extends BasePage{
	@FindBy(id="master")
	WebElement ClickOnMaster;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[1]/ul/li[1]/a")
	WebElement ClickOnCompany;
	@FindBy(xpath="//a[contains(text(),'Documents')]")
	WebElement ClickOnDocuments;
	@FindBy(xpath="//a[@class='action-download']")
	WebElement DownloadFile;
	
	public DownloadUploadedDocument(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonmaster() {
		ClickOnMaster.click();
	}
	public void clickoncompany() {
		ClickOnCompany.click();
	}
	public void clickondocument() {
		ClickOnDocuments.click();
	}
	public void clickondownload() {
		DownloadFile.click();
	}
}
