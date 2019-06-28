package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckifbydefaultsettingisbasedonDeclaredAmount extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[3]/a")
	WebElement OPtionsSettings;
	
	
	public TocheckifbydefaultsettingisbasedonDeclaredAmount(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickOPtionsSettings() {
		OPtionsSettings.click();
	}
}
