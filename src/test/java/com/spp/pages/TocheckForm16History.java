package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class TocheckForm16History extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[8]/a")
	WebElement BulkTDSDeclarations;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[1]/a")
	WebElement History;
	@FindBy(id="financial_year")
	WebElement AssessmentYear;
	@FindBy(xpath="//*[@id=\"form16_filter\"]")
	WebElement GetEmp;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	
	
	public TocheckForm16History(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	public void ClickTDs() {
	TDS.click();
	}
	public void ClickBulkTDSDeclarations() {
	BulkTDSDeclarations.click();
	}
	public void ClickHistory() {
		History.click();
	}
	public void SelectAssessmentYear(String value) {
    	dropDownSelect(AssessmentYear, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
}
