package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class DeleteVIADeductionsRoyaltyonPatents80RRB extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\\\"ui-id-2\\\"]/li[2]/a")
	WebElement VIDeductions;
	@FindBy(xpath="//table/tbody/tr[18]/td[3]/a")
	WebElement RoyaltyIncomeetcofAuthorsofcertainbooks80QQB;
	@FindBy(xpath="//tbody/tr[1]/td[5]/a/img")
	WebElement Delete;
	
	public DeleteVIADeductionsRoyaltyonPatents80RRB(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputationDetails() {
		ComputationDetails.click();
	}
	public void ClickDetails() {
		Details.click();
	}
	public void ClickVIDeduction() {
		VIDeductions.click();
	}
	public void ClickDeductions() {
		RoyaltyIncomeetcofAuthorsofcertainbooks80QQB.click();
	}
	public void ClickDelete() {
		Delete.click();
	}
}
