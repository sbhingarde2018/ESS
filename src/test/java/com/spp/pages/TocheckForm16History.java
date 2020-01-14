package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class TocheckForm16History extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[9]/a")
	WebElement Form16;
	@FindBy(xpath="//a[contains(text(),'History')]")
	WebElement History;
	@FindBy(xpath="//select[@id='financial_year']")
	WebElement AssessmentYear;
	@FindBy(xpath="//*[@id=\"form16_filter\"]")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	
	
	public TocheckForm16History(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	public void ClickTDs() {
	TDS.click();
	}
	public void ClickForm16() {
		Form16.click();
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
