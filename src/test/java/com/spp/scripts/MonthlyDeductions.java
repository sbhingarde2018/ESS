package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.MapEMItoTDS;
import com.spp.pages.SaveMapEMItoTDS;
import com.spp.pages.TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage;

public class MonthlyDeductions extends BaseTest {
	
	@Test(priority=0)
	public void MapEMItoTDS_SC_1180() throws Exception {
		MapEMItoTDS ab=new MapEMItoTDS(driver);
		ab.ClickTDS();
		ab.ClickMonthlyDeductions();
		Thread.sleep(2000);
		ab.SelectMonthYear("Jan/2019");
		ab.SelectSalaryStructure("Structure");
		ab.ClickGetEmployees();
		ab.resizeWindow();
		ab.ClickLoad();
		Thread.sleep(4000);
		ab.exitFullscreen();
		ab.ClickMapEmitoTds();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Maped EMI to TDS Successfully.");
	}
	@Test(priority=1)
	public void SaveMapEMItoTDS_SC_1181() throws Exception {
		SaveMapEMItoTDS ab=new SaveMapEMItoTDS(driver);
		ab.ClickTDS();
		ab.ClickMonthlyDeductions();
		Thread.sleep(2000);
		ab.SelectMonthYear("Mar/2019");
		ab.SelectSalaryStructure("Structure");
        ab.ClickGetEmployees();
		ab.resizeWindow();
		Thread.sleep(2000);
		ab.ClickLoad();
		Thread.sleep(4000);
		ab.exitFullscreen();
		ab.ClickMapEmitoTds();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Maped EMI to TDS Successfully.");
		Thread.sleep(4000);
		ab.ClickSave();
		//String j=ab.getMessage();
		//Assert.assertEquals(j, "Saved Successfully. Process Salary for TDS to take effect.");
	}
	@Test(priority=2)
	public void TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage_SC_1200() throws Exception {
		TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage ab=new TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage(driver);
		ab.ClickTDS();
		ab.ClickMonthlyDeductions();
		Thread.sleep(2000);
		ab.ClickEmployeeSalaryEditor();
		Thread.sleep(3000);
		ab.SelectPayMonth("Mar/2019");
		ab.SelectSalaryStructure("Structure");
		ab.ClickGetValues();
		ab.resizeWindow();
		Thread.sleep(2000);
		ab.ClickLoad();
		Thread.sleep(4000);
		ab.exitFullscreen();
		ab.ClickProcessSalary();
	}
	
}
