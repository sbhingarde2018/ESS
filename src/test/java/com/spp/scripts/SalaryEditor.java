package com.spp.scripts;

import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.CheckBulkPayslipReport;
//import com.spp.pages.AllotSalaryNotOnGross;
//import com.spp.pages.AllotSalaryToEmployee;
//import com.spp.pages.AssignEmployee;
import com.spp.pages.CheckPaydaysPresentdaysAndBasic;
import com.spp.pages.CheckSalaryHead;
import com.spp.pages.CheckSalarySheetReport;
import com.spp.pages.EditEmployee;
import com.spp.pages.EditEmployee30Nov;
import com.spp.pages.EditEmployee6Nov;
import com.spp.pages.EditEmployeeDOL;
import com.spp.pages.EditSalaryGroupBasedOnPayDays;
import com.spp.pages.EditSalaryGroupRoundOffActual;
import com.spp.pages.EditSalaryGroupRoundOffHigherRupee;
import com.spp.pages.EditSalaryGroupRoundOffNearestRupee;
import com.spp.pages.EditSalaryHeadEnableCalculativeField;
import com.spp.pages.EditSalaryRateDetails;
import com.spp.pages.EditSalaryRateDetails196;
import com.spp.pages.EditSalaryRateDetailsDOL;
import com.spp.pages.GenerateSalarySheet;
import com.spp.pages.GenerateSalarySheetReportCalculationTypeNotApplicable;
import com.spp.pages.GenerateSalarySheetToCheckPayDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDaysAndPayDays;
import com.spp.pages.GetSampleTemplate;
import com.spp.pages.HoldSalary;
//import com.spp.pages.GetBulkReimbursementErrorLogExcel;
import com.spp.pages.ProcessSalaryCalculationTypeNotApplicable;
import com.spp.pages.PublishSalary;
import com.spp.pages.PublishSalary182;
import com.spp.pages.ReleaseSalary;
import com.spp.pages.UpdateCalculationTypeLumpsum;
import com.spp.pages.UpdateCalculationTypeNotApplicable;
import com.spp.pages.UpdateMasterWeeklyOff;

import junit.framework.Assert;


public class SalaryEditor extends BaseTest{
	
	@Test(priority=0)
	public void HoldSalary_SC_152() throws Exception{
		HoldSalary ab = new HoldSalary(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.selectPayMonth("Nov/2017");
		ab.selectSalaryStructure("Gross Salary Structure");
		ab.ClickGetValues();
		ab.ClickFilter();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.SearchEmp("HoldSal");
		ab.ClickMore();
		Thread.sleep(3000);
		ab.ClickCheckbox();
		ab.ClickSaveValues();
		Thread.sleep(3000);
		ab.ClickProcess();
		Thread.sleep(3000);
		ab.ClickEdit();
		ab.ClickSubmitForReview();
		Thread.sleep(3000);
		ab.ClickSalary();
		ab.selectReview();
		ab.selectview();
		ab.selectpublish();
		Thread.sleep(3000);
		ab.ClickReport();
		ab.ClickSalarySheet();
		ab.SelectSalarySheet("Hold Salary");
		ab.selectPayMonth("Nov/2017");
		ab.ClickGetEmp();
		//ab.ClickFilter();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickGenerateReport();
	}
	
	@Test(priority=1)
	public void ReleaseSalary_SC_153() throws Exception{
		ReleaseSalary ab = new ReleaseSalary(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReleaseSalary();
		ab.selecteMonth("Nov/2017");
		ab.selectReleaseMonth("Jan/2018");
		ab.ClickSave();
		Thread.sleep(3000);
		ab.ClickReport();
		Thread.sleep(2000);
		ab.ClickSalarySheet();
		ab.SelectSalarySheet("Release Salary");
		ab.selectPayMonth("Jan/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickGenerateReport();
	}
	
	@Test(priority=2)
	public void GetSampleTemplate_SC_997() throws Exception{
		GetSampleTemplate ab = new GetSampleTemplate(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickImportExport();
		Thread.sleep(2000);
		ab.ClickGetSampleTemplate();
		Thread.sleep(2000);
		ab.selectPayMonth("Jan/2018");
		ab.selectSalaryStructure("Gross Salary Structure");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectAllEmp();
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
	}
	
	@Test(priority=3)
	public void CheckBulkPayslipReport_SC_999() throws Exception{
		CheckBulkPayslipReport ab = new CheckBulkPayslipReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickBulkPayslip();
		Thread.sleep(2000);
		ab.selectPayMonth("Jan/2018");
		ab.selectSalStructure("Gross Salary Structure");
		ab.selectPayslipType("Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectAllEmp();
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
	}
	@Test(priority=4)
	public void CheckSalarySheetReport_SC_1000() throws Exception {
		CheckSalarySheetReport ab = new CheckSalarySheetReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySheet();
		Thread.sleep(2000);
		ab.SelectSalarySheet("Salary Sheet");
		ab.selectPayMonth("Jan/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectAllEmp();
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
	}
}
