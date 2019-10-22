package com.spp.scripts;

//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
//import com.spp.pages.AllotSalaryNotOnGross;
//import com.spp.pages.AllotSalaryToEmployee;
//import com.spp.pages.AssignEmployee;
import com.spp.pages.CheckPaydaysPresentdaysAndBasic;
import com.spp.pages.CheckSalaryHead;
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
import com.spp.pages.GenerateEmployeeMasterReport;
import com.spp.pages.GenerateSalarySheet;
import com.spp.pages.GenerateSalarySheetReportCalculationTypeNotApplicable;
import com.spp.pages.GenerateSalarySheetToCheckPayDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDaysAndPayDays;
//import com.spp.pages.GetBulkReimbursementErrorLogExcel;
import com.spp.pages.ProcessSalaryCalculationTypeNotApplicable;
import com.spp.pages.PublishSalary;
import com.spp.pages.PublishSalary182;
import com.spp.pages.UpdateCalculationTypeLumpsum;
import com.spp.pages.UpdateCalculationTypeNotApplicable;
import com.spp.pages.UpdateMasterWeeklyOff;

import junit.framework.Assert;

public class EmployeeMasterReport extends BaseTest{
	
	@Test(priority=0)
	public void GenerateEmployeeMasterReport_SC_1204() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Date Of Joining");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.ClickGenerateReport();
 	}
	
	@Test(priority=1)
	public void GenerateEmployeeMasterReport_DateofLeaving_SC_1207() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Date Of Leaving");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.ClickGenerateReport();
 	}
	
	@Test(priority=2)
	public void GenerateEmployeeMasterReport_DateofBirth_SC_1208() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Date of Birth");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.ClickGenerateReport();
 	}
	
	@Test(priority=3)
	public void GenerateEmployeeMasterReport_ContactDetails_SC_1209() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Contact Details");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.ClickGenerateReport();
 	}
	
	@Test(priority=4)
	public void GenerateEmployeeMasterReport_EmployeeProfile_SC_1210() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Employee Profile");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		//ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.SelectBasicInfo();
 		ab.Selectclassification();
 		ab.Selectcontacts();
 		ab.Selectstatutory();
 		ab.ClickGenerateReport();
 	}
	
	@Test(priority=5)
	public void GenerateEmployeeMasterReport_HrDetails_SC_1211() throws Exception {
		GenerateEmployeeMasterReport ab = new GenerateEmployeeMasterReport(driver);
		ab.ClickReport();
		ab.ClickEmpMasterReport();
		ab.SelectReportType("Hr Details");
		ab.ClickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
		ab.ClickLoadButton();
		ab.exitFullscreen();
 		Thread.sleep(3000);
 		//ab.SearchEmp("ABCD");
 		ab.SelectEmp();
 		ab.SelectHrCategory();
 		ab.ClickGenerateReport();
 	}

}


