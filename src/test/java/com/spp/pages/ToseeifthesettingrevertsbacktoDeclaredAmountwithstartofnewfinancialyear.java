package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear extends BasePage {
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[1]/a")
	WebElement Paymonth;
	@FindBy(xpath="//*[@id=\"create_paymonth_form\"]/div[4]/div/div/fieldset/div[2]/input")
	WebElement CreatePaymonthBtn;
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[3]/a")
	WebElement OptionSettings;
	
	
	public ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickPaymonth() {
		Paymonth.click();
	}
	public void clickCreatePaymonth() {
		CreatePaymonthBtn.click();
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickOptionSettings() {
		OptionSettings.click();
	}
}
