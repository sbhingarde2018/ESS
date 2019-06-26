package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.GenerateTDSExcelSheet;
import com.spp.pages.GenerateTDSExcelSheetQuarter2;
import com.spp.pages.GenerateTDSExcelSheetQuarter3;
import com.spp.pages.GenerateTDSExcelSheetQuarter4;

public class ExporttoTDSExcel extends BaseTest {
	@Test(priority=0)
	public void GenerateTDSExcelSheet_SC_1194() throws Exception {
		GenerateTDSExcelSheet ab=new GenerateTDSExcelSheet(driver);
		ab.ClickTDS();
		ab.ClickExportToTDSProfessional();
		Thread.sleep(3000);
		ab.SelectEXcelSheetType("Professional");
		ab.SelectQuarter("Quarter 1");
		ab.Selectfinancialyear("2018/2019");
		ab.ClickGenerateExcelSheet();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void GenerateTDSExcelSheetQuarter2_SC_1195() throws Exception {
		GenerateTDSExcelSheetQuarter2 ab=new GenerateTDSExcelSheetQuarter2(driver);
		ab.ClickTDS();
		ab.ClickExportToTDSProfessional();
		Thread.sleep(3000);
		ab.SelectEXcelSheetType("Professional");
		ab.SelectQuarter("Quarter 2");
		ab.Selectfinancialyear("2018/2019");
		ab.ClickGenerateExcelSheet();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void GenerateTDSExcelSheetQuarter3_SC_1196() throws Exception {
		GenerateTDSExcelSheetQuarter3 ab=new GenerateTDSExcelSheetQuarter3(driver);
		ab.ClickTDS();
		ab.ClickExportToTDSProfessional();
		Thread.sleep(3000);
		ab.SelectEXcelSheetType("Professional");
		ab.SelectQuarter("Quarter 3");
		ab.Selectfinancialyear("2018/2019");
		ab.ClickGenerateExcelSheet();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void GenerateTDSExcelSheetQuarter4_SC_1197() throws Exception {
		GenerateTDSExcelSheetQuarter4 ab=new GenerateTDSExcelSheetQuarter4(driver);
		ab.ClickTDS();
		ab.ClickExportToTDSProfessional();
		Thread.sleep(3000);
		ab.SelectEXcelSheetType("Professional");
		ab.SelectQuarter("Quarter 4");
		ab.Selectfinancialyear("2018/2019");
		ab.ClickGenerateExcelSheet();
		Thread.sleep(2000);
	}
}
