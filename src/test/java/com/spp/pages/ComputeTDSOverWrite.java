package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class ComputeTDSOverWrite extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[1]/a")
	WebElement Computation;
	@FindBy(id="tds_financial_year")
	WebElement FinancialYear;
	@FindBy(id="overwrite")
	WebElement OverWrite;
	@FindBy(id="filter_head")
	WebElement Filter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employee_tax_compute\"]/div[5]/input")
	WebElement ComputeBtn;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	
	public ComputeTDSOverWrite(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputation() {
		Computation.click();
	}
	public void SelectFinancialYear(String value) {
		dropDownSelect(FinancialYear, value);
	}
	public void ClickOverWrite() {
		OverWrite.click();
	}
	public void ClickFilter() {
		Filter.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickComputeBtn() {
		ComputeBtn.click();
	}
	public String getMessage() {
		return SuccessMessage.getText();
}
}