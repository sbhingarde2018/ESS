package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[5]/a")
	WebElement ClickOnBulkSalaryRateDetails;
	@FindBy(xpath="//h3[contains(text(),'General Links')]")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//ul[@id='ui-id-2']//a[contains(text(),'Salary Heads')]")
	WebElement ClickOnSalaryHead;
	@FindBy(xpath="//a[contains(text(),'Add New Salary Head')]")
	WebElement AddNewSalaryHead;
	@FindBy(xpath="//*[@id='salary_head_head_name']")
	WebElement EnterHeadName;
	@FindBy(xpath="//*[@id='salary_head_short_name']")
	WebElement EnterShortName;
	@FindBy(xpath="//*[@id=\"salary_head_form\"]/div[2]/input")
	WebElement CreateSalaryHead;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Gross_Salary')]/parent::tr/td[5]/a[2]")
	WebElement ClickDelete;
	
	public CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonbulksalaryratedetails() {
		ClickOnBulkSalaryRateDetails.click();
	}
	public void clickongenerallink() {
		ClickonGeneralLinks.click();
	}
	public void clickonsalaryhead() {
		ClickOnSalaryHead.click();
	}
	public void addnewsalhead() {
		AddNewSalaryHead.click();
	}
	public void enterheadname(String value) {
		EnterHeadName.sendKeys(value);
	}
	public void entershortname(String value) {
		EnterShortName.sendKeys(value);
	}
	public void createsalaryhead() {
		CreateSalaryHead.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	public void ClickDelete() throws Exception{
		ClickDelete.click();
		Thread.sleep(2000);
		switchToPopUpAndAccept(driver);
	}
}
