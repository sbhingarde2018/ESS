package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.GenerateTDSReport;
import com.spp.pages.GenerateTDSReportReporttypeStatementofTotalIncome;

public class TDSReports extends BaseTest {
	
	@Test(priority=0)
	public void GenerateTDSReport_SC_1192() throws Exception {
		GenerateTDSReport ab=new GenerateTDSReport(driver);
		ab.ClickTDS();
		ab.ClickReports();
		Thread.sleep(3000);
		ab.SelectAssessmenth("2019/2020");
		ab.SelectReportType("Salary Extract");
		ab.ClickGetEmployees();
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(4000);
		ab.exitFullscreen();
		Thread.sleep(2000);
		ab.ClickSelectEmp();
		ab.ClickGenerateReport();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void GenerateTDSReportReporttypeStatementofTotalIncome_SC_1193() throws Exception {
		GenerateTDSReportReporttypeStatementofTotalIncome ab=new GenerateTDSReportReporttypeStatementofTotalIncome(driver);
		ab.ClickTDS();
		ab.ClickReports();
		Thread.sleep(3000);
		ab.SelectAssessmenth("2019/2020");
		ab.SelectReportType("Statement Of Total Income");
		ab.ClickGetEmployees();
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(4000);
		ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickSelectEmpt();
		ab.ClickGenerateReport();
		Thread.sleep(2000);
	}

}
