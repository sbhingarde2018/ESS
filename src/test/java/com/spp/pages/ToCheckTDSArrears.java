package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class ToCheckTDSArrears extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationalDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td[4]/a")
	WebElement Details;


	public ToCheckTDSArrears(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonTDS() {
		TDS.click();
	}
	public void clickonComputationalDetails() {
		ComputationalDetails.click();
	}
	public void clickonDetails() {
		Details.click();
	}
}
