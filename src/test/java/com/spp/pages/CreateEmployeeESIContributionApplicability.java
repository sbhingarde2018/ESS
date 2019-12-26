package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateEmployeeESIContributionApplicability extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//a[contains(text(),'ESI Contribution Applicability')]")
	WebElement ClickonESIContri;
	@FindBy(xpath="//input[@id='fr_date']")
	WebElement EffectiveDate;
	@FindBy(xpath="//a[@class='current']")
	WebElement ClickMonth;
	@FindBy(xpath="//input[@name='commit']")
	WebElement CreateESI;
	@FindBy(xpath="//*[@id=\"esi_applicability_result_response\"]/div/strong")
	WebElement successfulmessage;
	@FindBy(xpath="//table/tbody/tr/td[5]/a")
	WebElement Delete;
	
	public CreateEmployeeESIContributionApplicability(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	public void clickonESICon() {
		ClickonESIContri.click();
	}
	public void selecteffdate() {
		EffectiveDate.click();
	}
	public void SelectkMonth() {
		ClickMonth.click();
	}
	
	public void createesi() {
		CreateESI.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
	public void ClickDelete() throws InterruptedException {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
}
