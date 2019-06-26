package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class GenerateTDSExcelSheet extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[6]/a")
	WebElement ExportToTDSProfessional;
	@FindBy(id="sheet_type")
	WebElement EXcelSheetType;
	@FindBy(id="quarter")
	WebElement Quarter;
	@FindBy(id="financial_year")
	WebElement financialyear;
	@FindBy(xpath="//*[@id=\"tds_excel_excel_form\"]/div[2]/input")
	WebElement GenerateExcelSheet;
	
	
	public GenerateTDSExcelSheet(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickExportToTDSProfessional() {
		ExportToTDSProfessional.click();
	}
	public void SelectEXcelSheetType(String value) {
    	dropDownSelect(EXcelSheetType, value);
	}
	public void SelectQuarter(String value) {
    	dropDownSelect(Quarter, value);
	}
	public void Selectfinancialyear(String value) {
    	dropDownSelect(financialyear, value);
	}
	public void ClickGenerateExcelSheet() {
		GenerateExcelSheet.click();
	}
}
