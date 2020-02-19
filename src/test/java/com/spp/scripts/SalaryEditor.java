package com.spp.scripts;

import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckAdditionalSalaryReport;
import com.spp.pages.CheckBulkPayslipReport;
import com.spp.pages.CheckCreateNewPaymonth;
import com.spp.pages.CheckIncrementReport;
//import com.spp.pages.AllotSalaryNotOnGross;
//import com.spp.pages.AllotSalaryToEmployee;
//import com.spp.pages.AssignEmployee;
import com.spp.pages.CheckPaydaysPresentdaysAndBasic;
import com.spp.pages.CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead;
import com.spp.pages.CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure;
import com.spp.pages.CheckSalaryHead;
import com.spp.pages.CheckSalarySheetReport;
import com.spp.pages.CheckSalarySummary_FinancialYearReport;
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
import com.spp.pages.PublishedSalariesToSalaryEditor;
import com.spp.pages.ReleaseSalary;
import com.spp.pages.SalaryNotificationStatusDetails;
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
		ab.ClickFilter();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.ClickMore();   //extra step for getting failure without clicking on generate report
	 	//ab.ClickGenerateReport();
		//Thread.sleep(3000);
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
		ab.ClickSalaryEditor();  //extra step for getting failure without clicking on generate report
	//	Thread.sleep(3000);
	//	ab.ClickGenerateReport();
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
		ab.ClickSalarySheet();  //extra step for getting failure without clicking on generate report
		//ab.ClickGenerateFile();
		//Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void CheckIncrementReport_SC_1001() throws Exception {
		CheckIncrementReport ab = new CheckIncrementReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.CickIncrementReport();
		Thread.sleep(2000);
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2021");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateReport();
		Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void CheckAdditionalSalaryReport_SC_1002() throws Exception {
		CheckAdditionalSalaryReport ab = new CheckAdditionalSalaryReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickAdditionalSalary();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		//ab.ClickSelectEmp();
		ab.ClickGenerateReport();
		Thread.sleep(3000);
	}

	@Test(priority=7)
	public void CheckSalarySummary_FinancialYearReport_SC_1003() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummary();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Financial Year");
		ab.SelectFinancialYear("2017/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void CheckSalarySummary_CalendarYear_SC_1004() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummary();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Calendar Year");
		ab.SelectCalendarYear("2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(3000);
	}
	@Test(priority=9)
	public void CheckSalarySummary_BetweenMonths_SC_1005() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummary();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Between Months");
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2019");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void CheckCreateNewPaymonth_SC_1006() throws Exception {
		CheckCreateNewPaymonth ab = new CheckCreateNewPaymonth(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		ab.ClickGeneralLink();
		ab.ClickPaymonth();
		Thread.sleep(3000);
		ab.ClickCreatePaymonth();
		Thread.sleep(2000);
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(20000);
	//	String s2 = ab.getSuccessMessage();
	//	Assert.assertEquals(s2, "Paymonth created successfully");
	}
	@Test(priority=11)
	public void CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead_SC_1007() throws Exception {
		CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead ab = new CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead(driver);
		ab.ClickSalary();
		Thread.sleep(2000);
		ab.ClickSalaryEditor();
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickSalaryHeads();
		ab.ClickAddNewSalaryHead();
		ab.enterSalaryHeadName("Sal Head 1");
		ab.enterSalaryHeadShortName("SH1");
		ab.ClickCreateSalHead();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary head successfully created");
		Thread.sleep(2000);
		ab.ClickDeleteSalaryHead();
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
	}
	@Test(priority=12)
	public void CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure_SC_1008() throws Exception {
		CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure ab = new CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure(driver);
		ab.ClickSalary();
		ab.ClickSalaryEditor();
		Thread.sleep(2000);
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickSalaryStructure();
		Thread.sleep(2000);
		ab.ClickAddNewSalaryStructure();
		ab.enterNameSalaryStructure("AAA"+Utility.getRandNum(100, 200));
		ab.ClickBaseOnGross();
		ab.ClickCreateSalarystructure();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary group successfully created");
		Thread.sleep(2000);
	}
	
	@Test(priority=13)
	public void ProcessSalary_SC_1009() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
	 	ab.selectSalaryEditor();
	 	ab.selectPayMonth("Mar/2018");
	 	ab.selectSalaryStructure("Gross Salary Structure");
	 	ab.selectGetValues();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.selectProcess();
	 	Thread.sleep(3000);
	}
	
	@Test(priority=14)
	public void ProcessSalarywithFillCalculatedPT_SC_1010() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
	 	ab.selectSalaryEditor();
	 	ab.selectPayMonth("Mar/2018");
	 	ab.selectSalaryStructure("Gross Salary Structure");
	 	ab.selectGetValues();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.selectFillPT();
	 	ab.selectProcess();
	 	Thread.sleep(3000);
	 	
	}
/*	@Test(priority=15)
	public void SaveValuesEarnings_SalaryEditorMore_SC_1011() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
	 	ab.selectSalaryEditor();
	 	ab.selectPayMonth("Mar/2018");
	 	ab.selectSalaryStructure("Gross Salary Structure");
	 	ab.selectGetValues();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.selectMore();
	 	ab.EnterBasicUnit("1");
	 	ab.ClickSave();
	 	Thread.sleep(3000);
	 	ab.selectProcess();
	 	Thread.sleep(3000);
	}
	@Test(priority=15)
	public void SubmitforSalaryReview_SC_1013() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
		ab.ClickSalaryProcessList();
		ab.selectEdit();
	 	ab.selectSubmitForReview();
	 	Thread.sleep(3000);
	 	//String r=ab.getStatus();
	 	//Assert.assertEquals(r, "Submitted For Review");
	}
	
	@Test(priority=16)
	public void PublishSalary_SC_1014() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
		ab.selectReview();
		ab.selectview();
		ab.selectpublish();
		String r=ab.getMessage();
		Assert.assertEquals(r, "Salary is published successfully");
	}
	@Test(priority=17)
	public void RejectSalaryReview_SC_1015() throws Exception {
		PublishSalary ab = new PublishSalary(driver);
		ab.selectSalary();
		ab.selectReview();
		ab.selectview();
		ab.ClickReject();
		//String r=ab.getMessage();
		//Assert.assertEquals(r, "Salary is rejected successfully");
		
	}
	@Test(priority=18)
	public void CheckEmployeesSalaryDetails_SC_1016() throws Exception {
		CheckPaydaysPresentdaysAndBasic ab = new CheckPaydaysPresentdaysAndBasic(driver);
		ab.selectSalary();
		ab.selectPublishedSalary();
		ab.selectPayMonth("Mar/2018");
		ab.selectSalaryStructure("Gross Salary Structure");
		ab.selectGetEmployee();
		Thread.sleep(3000);
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.selectLoad();
		ab.exitFullscreen();
		Thread.sleep(6000);
	}
	@Test(priority=19)
	public void Salary_PublishedSalaries_Links_SalaryEditorRedirectsto_SalaryEditor_SC_1017() throws Exception {
		PublishedSalariesToSalaryEditor ab = new PublishedSalariesToSalaryEditor(driver);
		ab.selectSalary();
		ab.selectPublishedSalary();
		//ab.selectLinks();
		Thread.sleep(3000);
		ab.selectSalariEditorLink();
		Thread.sleep(3000);
		ab.selectPayMonth("Mar/2018");
	 	ab.selectSalaryStructure("Gross Salary Structure");
	 	ab.selectGetValues();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.selectProcess();
	 	Thread.sleep(6000);
	}
	@Test(priority=20)
	public void CheckSalary_PublishedSalaries_Reports_BulkPayslip_redirectstoReportsmodule_SC_1018() throws Exception {
		CheckBulkPayslipReport ab = new CheckBulkPayslipReport(driver);
		ab.ClickSalary();;
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickBulkPayslipReport();
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
		Thread.sleep(6000);
	}
	
	@Test(priority=21)
	public void CheckSalary_PublishedSalaris_Reports_SalarySheetRedirectstoReportsmodule_SC_1019() throws Exception {
		CheckSalarySheetReport ab = new CheckSalarySheetReport(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySheetReport();
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
		Thread.sleep(6000);
	}
	@Test(priority=22)
	public void CheckSalary_PublishedSalaris_Reports_IncrementRedirectstoReportsmodule_SC_1020() throws Exception {
		CheckIncrementReport ab = new CheckIncrementReport(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.CickIncrement();
		Thread.sleep(2000);
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2027");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateReport();
		Thread.sleep(6000);
	}
	@Test(priority=23)
	public void CheckSalary_PublishedSalaris_Reports_SalarySummaryFinancialYear_RedirectstoReports_SC_1021() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Financial Year");
		ab.SelectFinancialYear("2017/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(6000);
	}
	
	@Test(priority=24)
	public void CheckSalary_PublishedSalaris_Reports_SalarySummaryCalendarYear_RedirectstoReports_SC_1022() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Calendar Year");
		ab.SelectCalendarYear("2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(6000);
	}
	@Test(priority=25)
	public void CheckSalary_PublishedSalaris_Reports_SalarySummaryBetweenMonths_RedirectstoReports_SC_1023() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Between Months");
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2019");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(3000);
	}
	@Test(priority=26)
	public void CheckSalary_PublishedSalaries_GeneralLink_PaymonthsredirectstoCreate_NewPaymonthpage_SC_1026() throws Exception {
		CheckCreateNewPaymonth ab = new CheckCreateNewPaymonth(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickGeneralLink();
		ab.ClickPublishPaymonths();
		Thread.sleep(3000);
		ab.ClickCreatePaymonth();
		Thread.sleep(2000);
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Paymonth created successfully");
	}
	@Test(priority=27)
	public void CheckSalary_PublishedSalaries_GeneralLink_SalaryHeadsredirectsto_ListingSalaryHeads_SC_1027() throws Exception {
		CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead ab = new CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickPublishSalaryHeads();
		Thread.sleep(2000);
		ab.ClickAddNewSalaryHead();
		ab.enterSalaryHeadName("Sal Head 1");
		ab.enterSalaryHeadShortName("SH1");
		ab.ClickCreateSalHead();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary head successfully created");
		Thread.sleep(2000);
		ab.ClickDeleteSalaryHead();
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
	}
	@Test(priority=28)
	public void CheckSalary_PublishedSalaries_GeneralLink_SalaryStructureredirectsto_ListingStructure_SC_1028() throws Exception {
		CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure ab = new CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure(driver);
		ab.ClickSalary();
		ab.selectPublishedSalary();
		Thread.sleep(2000);
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickPublishSalaryStructure();
		Thread.sleep(2000);
		ab.ClickAddNewSalaryStructure();
		ab.enterNameSalaryStructure("Abcccb");
		ab.ClickBaseOnGross();
		ab.ClickCreateSalarystructure();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary group successfully created");
		Thread.sleep(2000);
	}
	@Test(priority=29)
	public void CheckEmployeesSalaryNotificationStatusDetails_SC_1029() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		//String s2 = ab.getSuccessMessage();
		//Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=30)
	public void SendMail_Employees_SalaryNotificationStatusDetails_SC_1030() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=31)
	public void CheckEmployeesSalaryNotificationStatusDetailsDetailedPayslip_SC_1031() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("Detailed Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		//String s2 = ab.getSuccessMessage();
		//Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=32)
	public void SendMail_Employees_SalaryNotificationStatusDetails_DetailedPayslip_SC_1032() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("Detailed Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=33)
	public void CheckEmployeesSalaryNotificationStatusDetailsTDSPayslip_SC_1033() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("TDS Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=34)
	public void SendMail_Employees_SalaryNotificationStatusDetails_TDSPayslip_SC_1034() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Pending");
		ab.SelectPayslip("TDS Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=35)
	public void CheckEmployeesSalaryNotificationStatusDetails_NotificationStatus_Failure_SC_1035() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=36)
	public void SendMailEmployeesSalaryNotificationStatusDetails_NotificationStatus_Failure_SC_1036() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=38)
	public void CheckEmployeesSalaryNotificationStatusDetails_DetailedPayslip_NotificationStatus_Failure_SC_1038() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("Detailed Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=39)
	public void SendMailEmployeesSalaryNotificationStatusDetails_DetailedPayslip_NotificationStatus_Failure_SC_1039() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("Detailed Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=40)
	public void CheckEmployeesSalaryNotificationStatusDetails_TDSPayslip_NotificationStatus_Failure_SC_1041() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("TDS Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
	}
	@Test(priority=41)
	public void CheckEmployeesSalaryNotificationStatusDetails_TDSPayslip_NotificationStatus_Failure_SC_1043() throws Exception {
		SalaryNotificationStatusDetails ab = new SalaryNotificationStatusDetails(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.SelectPayMonth("Feb/2020");
		ab.Selectnotificationstatus("Failure");
		ab.SelectPayslip("TDS Payslip");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		//Thread.sleep(3000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Employees Successfully Loaded.");
		ab.ClickSelectAll();
		ab.ClickSelectEmp();
		ab.ClickSendEMail();
		Thread.sleep(3000);
	}
	@Test(priority=42)
	public void CheckSalary_PublishedSalaryNotifications_Links_SalaryEditorredirectstoSalaryEditor_SC_1044() throws Exception {
		PublishedSalariesToSalaryEditor ab = new PublishedSalariesToSalaryEditor(driver);
		ab.selectSalary();
		ab.ClickPublishedSalaryNotifications();
		//ab.selectLinks();
		Thread.sleep(3000);
		ab.selectSalariEditorLink();
		Thread.sleep(3000);
		ab.selectPayMonth("Mar/2018");
	 	ab.selectSalaryStructure("Gross Salary Structure");
	 	ab.selectGetValues();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.selectProcess();
	 	Thread.sleep(6000);
	}
	@Test(priority=43)
	public void CheckSalary_PublishedSalaryNotifications_Reports_BulkPayslip_redirectstoReportsmodule_SC_1045() throws Exception{
		CheckBulkPayslipReport ab = new CheckBulkPayslipReport(driver);
		ab.ClickSalary();;
		ab.ClickPublishedSalaryNotifications();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickBulkPayslipReport();
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
		Thread.sleep(6000);
	}
	@Test(priority=44)
	public void CheckSalary_PublishedSalaryNotifications_Reports_SalarySheet_redirectstoReportsmodule_SC_1046() throws Exception{
		CheckSalarySheetReport ab = new CheckSalarySheetReport(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySheetReport();
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
		Thread.sleep(6000);
	}
	@Test(priority=45)
	public void CheckSalary_PublishedSalaryNotifications_Reports_IncrementReport_redirectstoReport_SC_1047() throws Exception{
		CheckIncrementReport ab = new CheckIncrementReport(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.ClickReports();
		Thread.sleep(2000);
		ab.CickIncrement();
		Thread.sleep(2000);
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2027");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateReport();
		Thread.sleep(6000);
	}
	@Test(priority=46)
	public void CheckSalary_PublishedSalaryNotifications_Reports_SalarySummaryFinancialYear_RedirectstoReports_SC_1048() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Financial Year");
		ab.SelectFinancialYear("2017/2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(6000);
	}
	@Test(priority=47)
	public void CheckSalary_PublishedSalaryNotifications_Reports_SalarySummaryCalendarYear_RedirectstoReports_SC_1049() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Calendar Year");
		ab.SelectCalendarYear("2018");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(6000);
	}
	@Test(priority=48)
	public void CheckSalary_PublishedSalaryNotifications_Reports_SalarySummaryBetweenMonths_RedirectstoReports_SC_1050() throws Exception {
		CheckSalarySummary_FinancialYearReport ab = new CheckSalarySummary_FinancialYearReport(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickReports();
		Thread.sleep(2000);
		ab.ClickSalarySummaryReport();
		Thread.sleep(2000);
		ab.SelectSalDurationType("Between Months");
		ab.SelectFromYear("Jan/2017");
		ab.SelectToYear("Jan/2019");
		ab.ClickGetEmp();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.ClickLoad();
	 	ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmp();
		ab.ClickGenerateFile();
		Thread.sleep(3000);
	}
	@Test(priority=49)
	public void CheckSalary_PublishedSalaryNotifications_GeneralLink_PaymonthsredirectstoCreate_NewPaymonthpage_SC_1051() throws Exception {
		CheckCreateNewPaymonth ab = new CheckCreateNewPaymonth(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickPublishPaymonths();
		Thread.sleep(3000);
		ab.ClickCreatePaymonth();
		Thread.sleep(2000);
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		String s2 = ab.getSuccessMessage();
		Assert.assertEquals(s2, "Paymonth created successfully");
	}
	@Test(priority=50)
	public void CheckSalary_PublishedSalaryNotifications_GeneralLink_SalaryHeadsredirectsto_ListingSalaryHeads_SC_1052() throws Exception {
		CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead ab = new CheckSalaryEditorRedirectstoListingSalaryHeadspagetoAddNewSalaryHead(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickPublishSalaryHeads();
		Thread.sleep(2000);
		ab.ClickAddNewSalaryHead();
		ab.enterSalaryHeadName("Sal Head 1");
		ab.enterSalaryHeadShortName("SH1");
		ab.ClickCreateSalHead();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary head successfully created");
		Thread.sleep(2000);
		ab.ClickDeleteSalaryHead();
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
	}
	@Test(priority=51)
	public void CheckSalary_PublishedSalaryNotifications_GeneralLink_SalaryStructureredirectsto_ListingStructure_SC_1053() throws Exception {
		CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure ab = new CheckSalaryEditorRedirectstoListingStructurepagetoCreateNewSalaryStructure(driver);
		ab.ClickSalary();
		ab.ClickPublishedSalaryNotifications();
		Thread.sleep(2000);
		ab.ClickGeneralLink();
		Thread.sleep(2000);
		ab.ClickPublishSalaryStructure();
		Thread.sleep(2000);
		ab.ClickAddNewSalaryStructure();
		ab.enterNameSalaryStructure("Abb");
		ab.ClickBaseOnGross();
		ab.ClickCreateSalarystructure();
		String s2 = ab.getMessage();
		Assert.assertEquals(s2, "Salary group successfully created");
		Thread.sleep(2000);
	}*/
	
}
