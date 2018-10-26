package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassificationDetailsInEmployee extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[1][contains(text(),'1234')]/parent::tr/td[6]/a[1]")
	WebElement ClickOnView; 
	@FindBy(xpath="//*[@id=\"classification_details\"]/a")
	WebElement ClickClassificationDetail;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/table/tbody/tr[1]/td[7]/a")
	WebElement DeleteClassification;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfulmessage;
	
	
	
	public DeleteClassificationDetailsInEmployee(WebDriver driver) {
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
		ClickOnView.click();
	}
	public void clickclassificationdetail() {
		ClickClassificationDetail.click();
	}
	public void deletecclassification() {
		DeleteClassification.click();
	}
		public String getMessage(){
		return successfulmessage.getText();
	}
		
}
