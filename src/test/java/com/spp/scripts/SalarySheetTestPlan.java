package com.spp.scripts;

//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.AddNewEmployeeTDS;
import com.spp.pages.AddNewSalaryAllotment;
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
import com.spp.pages.GenerateSalarySheet;
import com.spp.pages.GenerateSalarySheetReportCalculationTypeNotApplicable;
import com.spp.pages.GenerateSalarySheetToCheckPayDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDays;
import com.spp.pages.GenerateSalarySheetToCheckPresentDaysAndPayDays;
//import com.spp.pages.GetBulkReimbursementErrorLogExcel;
import com.spp.pages.ProcessSalaryCalculationTypeNotApplicable;
import com.spp.pages.PublishSalary;
import com.spp.pages.PublishSalary182;
import com.spp.pages.PublishSalary_166;
import com.spp.pages.UpdateCalculationTypeLumpsum;
import com.spp.pages.UpdateCalculationTypeNotApplicable;
import com.spp.pages.UpdateMasterWeeklyOff;

import junit.framework.Assert;

public class SalarySheetTestPlan extends BaseTest{
	
	
	/*@Test(priority=0)
 	public void UpdateCalculationTypeNotApplicable_SC_157() throws Exception{
		UpdateCalculationTypeNotApplicable sh=new UpdateCalculationTypeNotApplicable(driver);
 		Thread.sleep(2000);
 		sh.navigateMaster();
 		Thread.sleep(2000);
 		sh.clickSalaryStructureLink();
 		sh.clickSettingsLink();
  		sh.clickEditLink();
  		sh.selectCalculationType("Not Applicable");
  		sh.clickUpdateSalaryGroupDetail();
  		String s=sh.getMessage();
  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
	}*/
	@Test(priority=1)
	public void AddNewSalaryAllotmentCalculationType_NotApplicable_SC_158() throws Exception{
		EditSalaryRateDetails rr= new EditSalaryRateDetails(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		rr.resizeWindow();
		Thread.sleep(3000);
		rr.selectLoadButton();
		Thread.sleep(3000);
		rr.exitFullscreen();
	 	Thread.sleep(3000);
	 	rr.EnterSearch("CalcTyp NotApplicable e");
		rr.ClickAllotSalaryNewEmployee();
		rr.selectEffectiveFrom("Nov/2017");
		rr.selectGetRate();
		rr.enterGrossSal("40000");
		rr.enterBasic("20000");
		//rr.enterMess("2000");
		//rr.selectPopulateButton();
		rr.SelectSaveButton();
	 	String s=rr.getMessage();
	 	Assert.assertEquals(s, "Salary Allotted successfully");
	}
	/*@Test(priority=2)
 	public void UpdateCalculationTypeLumpsum_SC_161() throws Exception{
		UpdateCalculationTypeLumpsum sh=new UpdateCalculationTypeLumpsum(driver);
 		Thread.sleep(2000);
 		sh.navigateMaster();
 		Thread.sleep(2000);
 		sh.clickSalaryStructureLink();
 		sh.clickSettingsLink();
  		sh.clickEditLink();
  		sh.selectCalculationType("Lumpsum");
  		sh.clickUpdateSalaryGroupDetail();
  		String s=sh.getMessage();
  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
	}*/
	@Test(priority=3)
	public void AddNewSalaryAllotmentCalculationTypeLumpsum_SC_162() throws Exception{
		EditSalaryRateDetails rr= new EditSalaryRateDetails(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		rr.resizeWindow();
		Thread.sleep(3000);
		rr.selectLoadButton();
		Thread.sleep(3000);
		rr.exitFullscreen();
	 	Thread.sleep(3000);
	 	rr.EnterSearch("CalcTyp Lumpsum e");
		rr.ClickAllotSalaryNewEmployee();
		rr.selectEffectiveFrom("Nov/2017");
		rr.selectGetRate();
		rr.enterGrossSal("40000");
		rr.enterBasic("20000");
		//rr.enterMess("2000");
		//rr.selectPopulateButton();
		rr.SelectSaveButton();
	 	String s=rr.getMessage();
	 	Assert.assertEquals(s, "Salary Allotted successfully");
	}
	/*@Test(priority=4)
 	public void UpdateMasterWeeklyOff_SC_163() throws Exception{
		UpdateMasterWeeklyOff sh=new UpdateMasterWeeklyOff(driver);
 		Thread.sleep(5000);
 		sh.navigateMaster();
 		sh.clickMasterWeeklyHoliday();
 		sh.clickView();
 		sh.clickNewMasterWeeklyOff();
 		sh.enterEffectiveFrom("05 June 2014");
 		sh.selectFirstOff("Sunday");
 		sh.selectFullDay1("Full");
 		sh.selectSecondOff("Saturday");
 		sh.selectFullDay2("Full");
 		sh.clickCreateMasterWeeklyOffButton();
 		String a=sh.getMessage();
 		Assert.assertEquals(a, "Master Weekly off Successfully created.");
 		sh.clickWeeklyOffHistory();
 		Thread.sleep(2000);
 		sh.clickDeleteButton();
}
	@Test(priority=5)
	public void EditSalaryHeadEnableCalculativeField_SC_164() throws Exception{
	EditSalaryHeadEnableCalculativeField sh=new EditSalaryHeadEnableCalculativeField(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryHeadsLink();
		sh.clickEditSalaryHeadsLink();
		sh.enterSalaryHeadName("Edu Allowance");
		sh.enterSalaryHeadShortName("Edu4");
		Thread.sleep(2000);
		sh.clickCalcultaiveFieldRadioButton();
		sh.clickUpdateButton();
		String e=sh.getMessage();
		Assert.assertEquals(e, "Salary head succesfully updated");
		Thread.sleep(2000);
}*/
	@Test(priority=6)
	public void EditSalaryRateDetailsEducationAllowanceasCalculativeField_SC_165() throws Exception {
		EditSalaryRateDetails rr= new EditSalaryRateDetails(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.clickListingEmpSalaryAlloted();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		rr.resizeWindow();
		Thread.sleep(3000);
		rr.selectLoadButton();
		Thread.sleep(3000);
		rr.exitFullscreen();
	 	Thread.sleep(3000);
	 	rr.EnterSearchAllotedFilter("Donald");
		rr.ClickEdit();
		rr.selectEffectiveFrom("Nov/2017");
		rr.selectGetRate();
		rr.enterGrossSal("40000");
		rr.enterBasic("20000");
		//rr.enterMess("2000");
		//rr.selectPopulateButton();
		rr.SelectSaveButton();
	 	String s=rr.getMessage();
	 	Assert.assertEquals(s, "Salary Allotted successfully");
	}
	@Test(priority=7)
	public void PublishSalary_CalculativefieldEnabledforEducationAllowance_SC_166() throws Exception{
		PublishSalary_166 ab = new PublishSalary_166(driver);
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
		ab.SearchEmp("Shanti");
		ab.ClickPublishMore();
		Thread.sleep(3000);
		ab.EnterUnit("2");
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
		ab.selectSalary();
	 	ab.selectPublishedSalary();
	 	ab.selectPayMonth("Nov/2017");
	 	ab.selectPublishSalaryStructure("Gross Salary Structure");
	 	ab.selectGetEmployee();
	 	Thread.sleep(3000);
	 	ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.selectLoad();
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	}
	
  /* @Test(priority=8)
	 public void ProcessSalaryCalculationTypeNotApplicable_SC_159() throws Exception{
		 ProcessSalaryCalculationTypeNotApplicable rt = new ProcessSalaryCalculationTypeNotApplicable(driver);
	 	 rt.selectSalary();
	 	 rt.selectSalaryEditor();
	 	 rt.selectPayMonth("Apr/2024");
	 	 rt.selectSalaryStructure("Structure");
	 	 rt.selectGetValues();
	 	 Thread.sleep(3000);
	 	 rt.resizeWindow();
	 	 Thread.sleep(3000);
	 	 rt.selectLoad();
	 	 rt.exitFullscreen();
	 	 Thread.sleep(3000);
	 	 rt.ClickselectAll();
	 	 rt.ClickselectEmp();
	 	 rt.selectProcess();
	 	 rt.selectEdit();
	 	 rt.selectSubmitForReview();
	 	 rt.selectSalary();
	 	 rt.selectReview();
	 	 rt.selectview();
	 	 rt.selectpublish();
	 	 String r=rt.getMessage();
	 	 Assert.assertEquals(r, "Salary is published successfully");
	 	
}*/
   /*@Test(priority=9)
	 public void GenerateSalarySheetReportCalculationTypeNotApplicable_SC_160() throws Exception{
	GenerateSalarySheetReportCalculationTypeNotApplicable rt = new GenerateSalarySheetReportCalculationTypeNotApplicable(driver);
	 	 rt.selectReports();
	 	 rt.selectSalarySheet();
	 	 rt.selectreport("All Components");
	 	 rt.selectPayMonth("Apr/2019");
	 	 rt.selectExcel();
	 	 rt.selectGetEmployee();
	 	 Thread.sleep(3000);
	 	 rt.resizeWindow();
		 Thread.sleep(3000);
	 	 rt.selectLoad();
	 	 rt.exitFullscreen();
	 	 Thread.sleep(3000);
	 	 String r=rt.getMessage();
	 	 Assert.assertEquals(r, "Employees Successfully Loaded.");
	 	 Thread.sleep(4000);
	 	 rt.selectGenerateReport();
}
	 @Test(priority=10)
	 public void GenerateSalarySheet_SC_167() throws Exception{
		 GenerateSalarySheet rt = new GenerateSalarySheet(driver);
	 	 rt.selectReports();
	 	 rt.selectSalarySheet();
	 	 rt.selectreport("All Components");
	 	 rt.selectPayMonth("Apr/2019");
	 	 rt.selectExcel();
	 	 rt.selectGetEmployee();
	 	 Thread.sleep(3000);
	 	 rt.resizeWindow();
		 Thread.sleep(3000);
	 	 rt.selectLoad();
	 	 rt.exitFullscreen();
	 	 Thread.sleep(3000);
	 	 String r=rt.getMessage();
	 	 Assert.assertEquals(r, "Employees Successfully Loaded.");
	 	 Thread.sleep(4000);
	 	 rt.selectGenerateReport();
}*/
	/*@Test(priority=11)
	  public void verifyEditEmployee_SC_168() throws Exception{
			EditEmployee ww=new EditEmployee(driver);
			ww.clickEmployeeLink();
			ww.selectEmployeeDetails();
			ww.selectFilterHead();
			//System.out.println("done1");
			//Thread.sleep(3000);
			//ww.clickEmployeewithoutClass();
			//System.out.println("done2");
			ww.resizeWindow();
		 	Thread.sleep(3000);
			ww.selectLoadButton();
			Thread.sleep(3000);
			ww.exitFullscreen();
	 		Thread.sleep(3000);
	 		ww.SearchEmp("ABCD");
	 		Thread.sleep(3000);
			ww.selectViewButton();
			ww.selectEditEmployee();
			ww.selectDateOfJoining("01 March 2018");
			Thread.sleep(3000);
			ww.selectDateOfSalary("01 March 2018");
			Thread.sleep(4000);
			ww.clickUpdateButton();
			Thread.sleep(3000);
			String r=ww.getMessage();
	 		Assert.assertEquals(r, "Employee detail successfully updated.");
}*/
	 /*@Test(priority=12)
	 public void EditSalaryRateDetails_SC_173() throws Exception {
			EditSalaryRateDetails rr= new EditSalaryRateDetails(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
			Thread.sleep(3000);
			rr.selectLoadButton();
			Thread.sleep(3000);
			rr.exitFullscreen();
		 	Thread.sleep(3000);
			rr.selectAllotSalaryButton();
			rr.selectEffectiveFrom("Mar/2018");
			rr.selectGetRate();
			rr.enterGrossSal("40000");
			rr.enterBasic("20000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
		 	String s=rr.getMessage();
		 	Assert.assertEquals(s, "Salary Allotted successfully");
}*/
	/*@Test(priority=13)
 	public void PublishSalary182_SC_182() throws Exception{
			PublishSalary182 rt = new PublishSalary182(driver);
			rt.selectSalary();
			rt.selectSalaryEditor();
			rt.selectPayMonth("Mar/2018");
			rt.selectSalaryStructure("Gross Salary Structure");
			rt.selectGetValues();
			Thread.sleep(3000);
			rt.resizeWindow();
			Thread.sleep(3000);
			rt.selectLoad();
			rt.exitFullscreen();
			Thread.sleep(3000);
			rt.ClickselectAll();
			rt.ClickselectEmp();
			rt.selectProcess();
			rt.selectEdit();
			rt.selectSubmitForReview();
			rt.selectSalary();
			rt.selectReview();
			rt.selectview();
			rt.selectpublish();
			String r=rt.getMessage();
			Assert.assertEquals(r, "Salary is published successfully");	
}*/
	/* @Test(priority=14)
	 public void CheckPaydaysPresentdaysAndBasic_SC_185() throws Exception{
		 	CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
		 	rt.selectSalary();
		 	rt.selectPublishedSalary();
		 	rt.selectPayMonth("Mar/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetEmployee();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
		 	Thread.sleep(3000);
}*/
	/* @Test(priority=15)
		public void GenerateSalarySheetToCheckPayDays_SC_186() throws Exception{
		 GenerateSalarySheetToCheckPayDays rt = new GenerateSalarySheetToCheckPayDays(driver);
	 		rt.selectReports();
	 		rt.selectSalarySheet();
	 		rt.selectreport("All Components");
	 		rt.selectPayMonth("Mar/2019");
	 		rt.selectExcel();
	 		rt.selectGetEmployee();
	 		Thread.sleep(3000);
	 		rt.resizeWindow();
		 	Thread.sleep(3000);
	 		rt.selectLoad();
	 		Thread.sleep(3000);
			rt.exitFullscreen();
	 		//Thread.sleep(3000);
	 		String r=rt.getMessage();
	 		Assert.assertEquals(r, "Employees Successfully Loaded.");
	 		Thread.sleep(2000);
	 		rt.selectGenerateReport();
	 		//Thread.sleep(2000);
	 		//driver.close();
}*/

	/*@Test(priority=16)
	  public void GenerateSalarySheetToCheckPresentDays_SC_186() throws Exception{
	    	GenerateSalarySheetToCheckPresentDays rt = new GenerateSalarySheetToCheckPresentDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Mar/2018");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
}*/
	 /*@Test(priority=17)
	 public void EditEmployee6Nov_SC_188() throws Exception{
		 EditEmployee6Nov ww=new EditEmployee6Nov(driver);
			ww.clickEmployeeLink();
			ww.selectEmployeeDetails();
			ww.selectFilterHead();
			//System.out.println("done1");
			//Thread.sleep(3000);
			//ww.clickEmployeewithoutClass();
			//System.out.println("done2");
			ww.resizeWindow();
		 	Thread.sleep(3000);
			ww.selectLoadButton();
			ww.exitFullscreen();
	 		Thread.sleep(3000);
	 		ww.SearchEmp("ABCD");
	 		Thread.sleep(3000);
			ww.selectViewButton();
			ww.selectEditEmployee();
			ww.selectDateOfJoining("06 March 2018");
			//Thread.sleep(3000);
			ww.selectDateOfSalary("06 March 2018");
			Thread.sleep(3000);
			ww.clickUpdateButton();
			Thread.sleep(3000);
			String r=ww.getMessage();
	 		Assert.assertEquals(r, "Employee detail successfully updated.");
}
	 @Test(priority=18)
	 public void EditSalaryRateDetails_SC_189() throws Exception {
			EditSalaryRateDetails rr= new EditSalaryRateDetails(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
			 Thread.sleep(3000);
			rr.selectLoadButton();
			rr.exitFullscreen();
		 	Thread.sleep(3000);
			rr.selectAllotSalaryButton();
			rr.selectEffectiveFrom("Mar/2018");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
		 	String s=rr.getMessage();
		 	Assert.assertEquals(s, "Salary Allotted successfully");
}
	 
	
	 @Test(priority=19)
	 public void PublishSalary190_SC_190() throws Exception{
		 	PublishSalary rt = new PublishSalary(driver);
		 	rt.selectSalary();
		 	rt.selectSalaryEditor();
		 	rt.selectPayMonth("Mar/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetValues();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
		 	Thread.sleep(3000);
		 	rt.selectProcess();
		 	rt.selectEdit();
		 	rt.selectSubmitForReview();
		 	rt.selectSalary();
		 	rt.selectReview();
		 	rt.selectview();
	 	 	rt.selectpublish();
	 	 	String r=rt.getMessage();
	 	 	Assert.assertEquals(r, "Salary is published successfully");
}
	 @Test(priority=20)
	 public void CheckPaydaysPresentdaysAndBasic191_SC_191() throws Exception{
		  	CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
	 		rt.selectSalary();
	 		rt.selectPublishedSalary();
	 		rt.selectPayMonth("Mar/2018");
	 		rt.selectSalaryStructure("Gross Salary Structure");
	 		rt.selectGetEmployee();
	 		Thread.sleep(3000);
	 		rt.resizeWindow();
	 		Thread.sleep(3000);
	 		rt.selectLoad();
	 		rt.exitFullscreen();
	 		Thread.sleep(3000);
}*/
	 /*@Test(priority=21)
	 public void GenerateSalarySheetToCheckPresentDaysAndPayDays_SC_193() throws Exception{
	   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
		rt.selectReports();
		rt.selectSalarySheet();
		rt.selectreport("All Components");
		rt.selectPayMonth("Mar/2018");
		rt.selectExcel();
		rt.selectGetEmployee();
		Thread.sleep(3000);
		rt.selectLoad();
		Thread.sleep(3000);
		String r=rt.getMessage();
		Assert.assertEquals(r, "Employees Successfully Loaded.");
		Thread.sleep(4000);
		rt.selectGenerateReport();
}*/
	/*@Test(priority=22)
	 public void EditEmployee30Nov_SC_194() throws Exception{
		 	EditEmployee30Nov ww=new EditEmployee30Nov(driver);
			ww.clickEmployeeLink();
			ww.selectEmployeeDetails();
			ww.selectFilterHead();
			//System.out.println("done1");
			//Thread.sleep(3000);
			//ww.clickEmployeewithoutClass();
			//System.out.println("done2");
			ww.resizeWindow();
		 	Thread.sleep(3000);
			ww.selectLoadButton();
			Thread.sleep(2000);
			ww.exitFullscreen();
	 		Thread.sleep(3000);
	 		ww.SearchEmp("ABCD");
	 		Thread.sleep(3000);
			ww.selectViewButton();
			ww.selectEditEmployee();
			ww.selectDateOfJoining("30 March 2018");
			Thread.sleep(3000);
			ww.selectDateOfSalary("30 March 2018");
			Thread.sleep(3000);
			ww.clickUpdateButton();
			Thread.sleep(2000);
			String r=ww.getMessage();
			Assert.assertEquals(r, "Employee detail successfully updated.");
}
	@Test(priority=23)
	public void EditSalaryRateDetails196_SC_196() throws Exception {
			EditSalaryRateDetails196 rr= new EditSalaryRateDetails196(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
		 	Thread.sleep(3000);
			rr.selectLoadButton();
			rr.exitFullscreen();
	 		Thread.sleep(3000);
			rr.selectAllotSalaryButton();
			rr.selectEffectiveFrom("Mar/2018");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
		 	String s=rr.getMessage();
		 	Assert.assertEquals(s, "Salary Allotted successfully");
}
	 @Test(priority=24)
	 public void PublishSalary198_SC_198() throws Exception{
		 	PublishSalary rt = new PublishSalary(driver);
		 	rt.selectSalary();
		 	rt.selectSalaryEditor();
		 	rt.selectPayMonth("Mar/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetValues();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
	 		Thread.sleep(3000);
		 	rt.selectProcess();
		 	rt.selectEdit();
		 	rt.selectSubmitForReview();
		 	rt.selectSalary();
		 	rt.selectReview();
		 	rt.selectview();
		 	rt.selectpublish();
		 	String r=rt.getMessage();
		 	Assert.assertEquals(r, "Salary is published successfully");
}
	 @Test(priority=25)
	 public void CheckPaydaysPresentdaysAndBasic200_SC_200() throws Exception{
		 	CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
		 	rt.selectSalary();
		 	rt.selectPublishedSalary();
		 	rt.selectPayMonth("Mar/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetEmployee();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
	 		Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
	 		Thread.sleep(3000);
}*/
	 /*@Test(priority=26)
	 public void GenerateSalarySheetToCheckPresentDaysAndPayDays201_SC_201() throws Exception{
	   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
		rt.selectReports();
		rt.selectSalarySheet();
		rt.selectreport("All Components");
		rt.selectPayMonth("Nov/2017");
		rt.selectExcel();
		rt.selectGetEmployee();
		Thread.sleep(3000);
		rt.selectLoad();
		Thread.sleep(3000);
		String r=rt.getMessage();
		Assert.assertEquals(r, "Employees Successfully Loaded.");
		Thread.sleep(4000);
		rt.selectGenerateReport();
}*/
	/*@Test(priority=27)
	 public void EditEmployeeDOL_SC_205() throws Exception{
		 	EditEmployeeDOL ww=new EditEmployeeDOL(driver);
			ww.clickEmployeeLink();
			ww.selectEmployeeDetails();
			ww.selectFilterHead();
			//System.out.println("done1");
			//Thread.sleep(3000);
			//ww.clickEmployeewithoutClass();
			//System.out.println("done2");
			ww.resizeWindow();
	 		Thread.sleep(2000);
			ww.selectLoadButton();
			Thread.sleep(2000);
			ww.exitFullscreen();
	 		Thread.sleep(3000);
	 		ww.SearchEmp("ABCDDOL");
	 		Thread.sleep(3000);
			ww.selectViewButton();
			ww.selectEditEmployee();
			ww.selectSeparationInfo();
			ww.selectDateOfLeaving("01 January 2018");
			ww.selectReasonForLeaving("On Leave");
			Thread.sleep(4000);
			ww.clickUpdateButton();
			Thread.sleep(1000);
			String r=ww.getMessage();
	 		Assert.assertEquals(r, "Employee detail successfully updated.");
} 
	 @Test(priority=28)
	 public void EditSalaryRateDetailsDOL_SC_207() throws Exception {
			EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectListingEmployee();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
		 	Thread.sleep(2000);
			rr.selectLoadButton();
			rr.exitFullscreen();
		 	Thread.sleep(3000);
		 	rr.SearchEmp("ABCDDOL");
		 	Thread.sleep(3000);
			rr.selectEditButton();
			rr.selectEffectiveFrom("Jan/2018");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
		 	String s=rr.getMessage();
		 	Assert.assertEquals(s, "Salary Allotted successfully");
} 
	
	 @Test(priority=29)
	 public void PublishSalary_SC_210() throws Exception{
		 	PublishSalary rt = new PublishSalary(driver);
		 	rt.selectSalary();
		 	rt.selectSalaryEditor();
		 	rt.selectPayMonth("Jan/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetValues();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(2000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
		 	Thread.sleep(3000);
		 	rt.selectProcess();
		 	rt.selectEdit();
	 		rt.selectSubmitForReview();
	 		rt.selectSalary();
	 		rt.selectReview();
	 		rt.selectview();
	 		rt.selectpublish();
	 		String r=rt.getMessage();
	 		Assert.assertEquals(r, "Salary is published successfully");
}
	 @Test(priority=30)
	 public void CheckPaydaysPresentdaysAndBasic_SC_212() throws Exception{
		 	CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
		 	rt.selectSalary();
		 	rt.selectPublishedSalary();
		 	rt.selectPayMonth("Jan/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetEmployee();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
	 		Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
	 		Thread.sleep(3000);
}*/
	 /*@Test(priority=31)
	 public void GenerateSalarySheetToCheckPresentDaysAndPayDays_SC_213() throws Exception{
	   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
		rt.selectReports();
		rt.selectSalarySheet();
		rt.selectreport("All Components");
		rt.selectPayMonth("Nov/2017");
		rt.selectExcel();
		rt.selectGetEmployee();
		Thread.sleep(3000);
		rt.selectLoad();
		Thread.sleep(3000);
		String r=rt.getMessage();
		Assert.assertEquals(r, "Employees Successfully Loaded.");
		Thread.sleep(4000);
		rt.selectGenerateReport();
}*/
	 /*@Test(priority=32)
	 public void EditEmployeeDOL_SC_214() throws Exception{
		 	EditEmployeeDOL ww=new EditEmployeeDOL(driver);
			ww.clickEmployeeLink();
			ww.selectEmployeeDetails();
			ww.selectFilterHead();
			//System.out.println("done1");
			//Thread.sleep(3000);
			//ww.clickEmployeewithoutClass();
			//System.out.println("done2");
			ww.resizeWindow();
			Thread.sleep(2000);
			ww.selectLoadButton();
			Thread.sleep(2000);
			ww.exitFullscreen();
			Thread.sleep(3000);
			ww.SearchEmp("ABCDDOL");
			Thread.sleep(3000);
			ww.selectViewButton();
			ww.selectEditEmployee();
			ww.selectSeparationInfo();
			ww.selectDateOfLeaving("06 January 2018");
			ww.selectReasonForLeaving("On Leave");
			Thread.sleep(4000);
			ww.clickUpdateButton();
			String r=ww.getMessage();
			Assert.assertEquals(r, "Employee detail successfully updated.");
}
	
	 @Test(priority=33)
	 public void EditSalaryRateDetailsDOL_SC_215() throws Exception {
		 	EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
		 	rr.clickEmployeeLink();
		 	rr.selectSalaryRateDetails();
		 	rr.selectListingEmployee();
		 	rr.selectAdvancedFilterIcon();
		 	Thread.sleep(3000);
		 	rr.resizeWindow();
		 	Thread.sleep(2000);
		 	rr.selectLoadButton();
		 	rr.exitFullscreen();
		 	Thread.sleep(3000);
		 	rr.SearchEmp("ABCDDOL");
		 	Thread.sleep(3000);
		 	rr.selectEditButton();
		 	rr.selectEffectiveFrom("Jan/2018");
		 	rr.selectGetRate();
		 	rr.enterGrossSal("25000");
		 	rr.enterBasic("3000");
		 	//rr.enterMess("2000");
		 	//rr.selectPopulateButton();
		 	rr.SelectSaveButton();
		 	String s=rr.getMessage();
		 	Assert.assertEquals(s, "Salary Allotted successfully");
}
	 @Test(priority=34)
	 public void PublishSalary_SC_216() throws Exception{
		 	PublishSalary rt = new PublishSalary(driver);
		 	rt.selectSalary();
		 	rt.selectSalaryEditor();
		 	rt.selectPayMonth("Jan/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetValues();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(2000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
		 	Thread.sleep(3000);
		 	rt.selectProcess();
		 	rt.selectEdit();
		 	rt.selectSubmitForReview();
		 	rt.selectSalary();
		 	rt.selectReview();
		 	rt.selectview();
		 	rt.selectpublish();
		 	String r=rt.getMessage();
		 	Assert.assertEquals(r, "Salary is published successfully");
}
	  @Test(priority=35)
	  public void CheckPaydaysPresentdaysAndBasic_SC_217() throws Exception{
		  	CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
		 	rt.selectSalary();
		 	rt.selectPublishedSalary();
		 	rt.selectPayMonth("Jan/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetEmployee();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
	 		Thread.sleep(3000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
	 		Thread.sleep(3000);
}*/
	  /*@Test(priority=36)
		 public void GenerateSalarySheetToCheckPresentDaysAndPayDays_SC_218() throws Exception{
		   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Nov/2017");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
}*/
	/*@Test(priority=37)
	  public void EditEmployeeDOL_SC_219() throws Exception{
		  	EditEmployeeDOL ww=new EditEmployeeDOL(driver);
		  	ww.clickEmployeeLink();
		  	ww.selectEmployeeDetails();
		  	ww.selectFilterHead();
		  	//System.out.println("done1");
		  	//Thread.sleep(3000);
		  	//ww.clickEmployeewithoutClass();
		  	//System.out.println("done2");
		  	ww.resizeWindow();
		  	Thread.sleep(2000);
		  	ww.selectLoadButton();
		  	Thread.sleep(2000);
		  	ww.exitFullscreen();
		  	Thread.sleep(3000);
		  	ww.SearchEmp("ABCDDOL");
		  	Thread.sleep(3000);
		  	ww.selectViewButton();
		  	ww.selectEditEmployee();
		  	ww.selectSeparationInfo();
		  	ww.selectDateOfLeaving("30 February 2018");
		  	ww.selectReasonForLeaving("On Leave");
		  	Thread.sleep(4000);
		  	ww.clickUpdateButton();
		  	String r=ww.getMessage();
		  	Assert.assertEquals(r, "Employee detail successfully updated.");
} 
	  @Test(priority=38)
	  public void EditSalaryRateDetailsDOL_SC_220() throws Exception {
			EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectListingEmployee();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
	 		Thread.sleep(2000);
			rr.selectLoadButton();
			rr.exitFullscreen();
	 		Thread.sleep(3000);
	 		rr.SearchEmp("ABCDDOL");
	 		Thread.sleep(3000);
			rr.selectEditButton();
			rr.selectEffectiveFrom("Feb/2018");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
	 		String s=rr.getMessage();
	 		Assert.assertEquals(s, "Salary Allotted successfully");
}
	 @Test(priority=39)
	 public void PublishSalary_SC_221() throws Exception{
		 	PublishSalary rt = new PublishSalary(driver);
		 	rt.selectSalary();
		 	rt.selectSalaryEditor();
		 	rt.selectPayMonth("Feb/2018");
		 	rt.selectSalaryStructure("Gross Salary Structure");
		 	rt.selectGetValues();
		 	Thread.sleep(3000);
		 	rt.resizeWindow();
		 	Thread.sleep(2000);
		 	rt.selectLoad();
		 	rt.exitFullscreen();
		 	Thread.sleep(3000);
		 	rt.selectProcess();
		 	rt.selectEdit();
		 	rt.selectSubmitForReview();
		 	rt.selectSalary();
		 	rt.selectReview();
		 	rt.selectview();
		 	rt.selectpublish();
		 	String r=rt.getMessage();
		 	Assert.assertEquals(r, "Salary is published successfully");
}
	 @Test(priority=40)
	 public void CheckPaydaysPresentdaysAndBasic_SC_222() throws Exception{
			CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
			 rt.selectSalary();
			 rt.selectPublishedSalary();
			 rt.selectPayMonth("Feb/2018");
			 rt.selectSalaryStructure("Gross Salary Structure");
			 rt.selectGetEmployee();
			 Thread.sleep(3000);
			 rt.resizeWindow();
		 	 Thread.sleep(3000);
			 rt.selectLoad();
			 rt.exitFullscreen();
		 	 Thread.sleep(3000);
}*/
		 /*@Test(priority=41)
		 public void GenerateSalarySheetToCheckPresentDaysAndPayDays_SC_223() throws Exception{
		   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Nov/2017");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
	}*/
		/* @Test(priority=42)
		 	public void PublishSalary_SC_224() throws Exception{
			 PublishSalary rt = new PublishSalary(driver);
		 	 rt.selectSalary();
		 	 rt.selectSalaryEditor();
		 	 rt.selectPayMonth("Nov/2017");
		 	 rt.selectSalaryStructure("GS_Lumpsum");
		 	 rt.selectGetValues();
		 	 Thread.sleep(3000);
		 	 rt.resizeWindow();
		 	 Thread.sleep(3000);
		 	 rt.selectLoad();
		 	 rt.exitFullscreen();
	 		 Thread.sleep(3000);
		 	 rt.selectProcess();
		 	 rt.selectEdit();
		 	 rt.selectSubmitForReview();
		 	 rt.selectSalary();
		 	 rt.selectReview();
		 	 rt.selectview();
		 	 rt.selectpublish();
		 	 String r=rt.getMessage();
		 	 Assert.assertEquals(r, "Salary is published successfully");
	}*/
		 /*@Test(priority=43)
		 public void GenerateSalarySheetReport_SC_226() throws Exception{
		   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Nov/2017");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
	}*/
	/*	@Test(priority=44)
		 	public void EditSalaryGroupRoundOffActual_SC_227() throws Exception{
				EditSalaryGroupRoundOffActual sh=new EditSalaryGroupRoundOffActual(driver);
		 		Thread.sleep(5000);
		 		sh.navigateMaster();
		 		sh.clickSalaryStructureLink();
		 		sh.clickSettingsLink();
		  		sh.clickEditLink();
		  		sh.selectCalculationType("Lumpsum");
		  		//sh.selectBasedOn("Pay Days");
		  		sh.selectRoundOff("Actual");
		  		sh.clickUpdateSalaryGroupDetail();
		  		String s=sh.getMessage();
		  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
	}
		 @Test(priority=45)
		  public void EditSalaryRateDetailsDOL_SC_228() throws Exception {
			EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectListingEmployee();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
	 		Thread.sleep(2000);
			rr.selectLoadButton();
			rr.exitFullscreen();
	 		Thread.sleep(3000);
	 		rr.SearchEmp("ABCDLumpsum");
	 		Thread.sleep(3000);
			rr.selectEditButton();
			rr.selectEffectiveFrom("Nov/2017");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3000");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
	 		String s=rr.getMessage();
	 		Assert.assertEquals(s, "Salary Allotted successfully");
}
		 @Test(priority=46)
		 	public void PublishSalary_SC_229() throws Exception{
			 PublishSalary rt = new PublishSalary(driver);
			 rt.selectSalary();
		 	 rt.selectSalaryEditor();
		 	 rt.selectPayMonth("Nov/2017");
		 	 rt.selectSalaryStructure("GS_Lumpsum");
		 	 rt.selectGetValues();
		 	 Thread.sleep(3000);
		 	 rt.resizeWindow();
		 	 Thread.sleep(3000);
		 	 rt.selectLoad();
		 	 rt.exitFullscreen();
	 		 Thread.sleep(3000);
		 	 rt.selectProcess();
		 	 rt.selectEdit();
		 	 rt.selectSubmitForReview();
		 	 rt.selectSalary();
		 	 rt.selectReview();
		 	 rt.selectview();
		 	 rt.selectpublish();
		 	 String r=rt.getMessage();
		 	 Assert.assertEquals(r, "Salary is published successfully");
	}
		 @Test(priority=47)
		 	public void CheckSalaryHead_SC_232() throws Exception{
			 CheckSalaryHead rt = new CheckSalaryHead(driver);
		 	 rt.selectSalary();
		 	 rt.selectPublishedSalary();
		 	 rt.selectPayMonth("Nov/2017");
		 	 rt.selectSalaryStructure("GS_Lumpsum");
		 	 rt.selectGetEmployee();
		 	 rt.resizeWindow();
		 	 Thread.sleep(3000);
		 	 rt.selectLoad();
		 	 rt.exitFullscreen();
	 		 Thread.sleep(3000);
	}*/
		 /*@Test(priority=48)
		 public void GenerateSalarySheetReport_SC_233() throws Exception{
		   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Nov/2017");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
	}*/
	/*	@Test(priority=49)
		 	public void EditSalaryGroupRoundOffNearestRupee_SC_235() throws Exception{
				EditSalaryGroupRoundOffNearestRupee sh=new EditSalaryGroupRoundOffNearestRupee(driver);
		 		Thread.sleep(5000);
		 		sh.navigateMaster();
		 		sh.clickSalaryStructureLink();
		 		sh.clickSettingsLink();
		  		sh.clickEditLink();
		  		sh.selectCalculationType("Lumpsum");
		  		sh.selectRoundOff("Nearest Rupee");
		  		sh.clickUpdateSalaryGroupDetail();
		  		String s=sh.getMessage();
		  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
	}
		 @Test(priority=50)
		  public void EditSalaryRateDetailsDOL_SC_236() throws Exception {
			EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
			rr.clickEmployeeLink();
			rr.selectSalaryRateDetails();
			rr.selectListingEmployee();
			rr.selectAdvancedFilterIcon();
			Thread.sleep(3000);
			rr.resizeWindow();
	 		Thread.sleep(2000);
			rr.selectLoadButton();
			rr.exitFullscreen();
	 		Thread.sleep(3000);
	 		rr.SearchEmp("ABCDLumpsum");
	 		Thread.sleep(3000);
			rr.selectEditButton();
			rr.selectEffectiveFrom("Nov/2017");
			rr.selectGetRate();
			rr.enterGrossSal("25000");
			rr.enterBasic("3002.20");
			//rr.enterMess("2000");
			//rr.selectPopulateButton();
			rr.SelectSaveButton();
	 		String s=rr.getMessage();
	 		Assert.assertEquals(s, "Salary Allotted successfully");
}
		 @Test(priority=51)
		 	public void PublishSalary_SC_237() throws Exception{
			 PublishSalary rt = new PublishSalary(driver);
			 rt.selectSalary();
		 	 rt.selectSalaryEditor();
		 	 rt.selectPayMonth("Nov/2017");
		 	 rt.selectSalaryStructure("GS_Lumpsum");
		 	 rt.selectGetValues();
		 	 Thread.sleep(3000);
		 	 rt.resizeWindow();
		 	 Thread.sleep(3000);
		 	 rt.selectLoad();
		 	 rt.exitFullscreen();
	 		 Thread.sleep(3000);
		 	 rt.selectProcess();
		 	 rt.selectEdit();
		 	 rt.selectSubmitForReview();
		 	 rt.selectSalary();
		 	 rt.selectReview();
		 	 rt.selectview();
		 	 rt.selectpublish();
		 	 String r=rt.getMessage();
		 	 Assert.assertEquals(r, "Salary is published successfully");
	}
		@Test(priority=52)
		 	public void CheckSalaryHead_SC_238() throws Exception{
			 CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
		 	 rt.selectSalary();
		 	 rt.selectPublishedSalary();
		 	 rt.selectPayMonth("Nov/2017");
		 	 rt.selectSalaryStructure("Structure_3");
		 	 rt.selectGetEmployee();
		 	 Thread.sleep(3000);
		 	 rt.resizeWindow();
		 	 Thread.sleep(3000);
		 	 rt.selectLoad();
		 	 rt.exitFullscreen();
	 		 Thread.sleep(3000);
	}*/
		 /*@Test(enabled=false)
		 public void GenerateSalarySheetReport_SC_239() throws Exception{
		   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
			rt.selectReports();
			rt.selectSalarySheet();
			rt.selectreport("All Components");
			rt.selectPayMonth("Nov/2017");
			rt.selectExcel();
			rt.selectGetEmployee();
			Thread.sleep(3000);
			rt.selectLoad();
			Thread.sleep(3000);
			String r=rt.getMessage();
			Assert.assertEquals(r, "Employees Successfully Loaded.");
			Thread.sleep(4000);
			rt.selectGenerateReport();
	}*/
	/*	@Test(priority=53)
		 	public void EditSalaryGroupRoundOffHigherRupee_SC_240() throws Exception{
				EditSalaryGroupRoundOffHigherRupee sh=new EditSalaryGroupRoundOffHigherRupee(driver);
		 		Thread.sleep(5000);
		 		sh.navigateMaster();
		 		sh.clickSalaryStructureLink();
		 		sh.clickSettingsLink();
		  		sh.clickEditLink();
		  		sh.selectCalculationType("Lumpsum");
		  		sh.selectRoundOff("Higher Rupee");
		  		sh.clickUpdateSalaryGroupDetail();
		  		String s=sh.getMessage();
		  	Assert.assertEquals(s, "Salary structure detail succesfully updated");
	}
		 @Test(priority=54)
		  public void EditSalaryRateDetailsDOL_SC_241() throws Exception {
			EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
				rr.clickEmployeeLink();
				rr.selectSalaryRateDetails();
				rr.selectListingEmployee();
				rr.selectAdvancedFilterIcon();
				Thread.sleep(3000);
				rr.resizeWindow();
			 	Thread.sleep(3000);
				rr.selectLoadButton();
				rr.exitFullscreen();
		 		Thread.sleep(3000);
		 		rr.SearchEmp("ABCDHR");
		 		Thread.sleep(3000);
				rr.selectEditButton();
				rr.selectEffectiveFrom("Nov/2017");
				rr.selectGetRate();
				rr.enterGrossSal("25000");
				rr.enterBasic("3000.20");
				//rr.enterMess("2000");
				//rr.selectPopulateButton();
				rr.SelectSaveButton();
		 		String s=rr.getMessage();
		 		Assert.assertEquals(s, "Salary Allotted successfully");
		 		
		}
		 @Test(priority=55)
				 	public void PublishSalary_SC_242() throws Exception{
					 PublishSalary rt = new PublishSalary(driver);
					 rt.selectSalary();
				 	 rt.selectSalaryEditor();
				 	 rt.selectPayMonth("Nov/2017");
				 	 rt.selectSalaryStructure("Structure_3");
				 	 rt.selectGetValues();
				 	 Thread.sleep(3000);
				 	 rt.resizeWindow();
				 	 Thread.sleep(3000);
				 	 rt.selectLoad();
				 	 rt.exitFullscreen();
			 		 Thread.sleep(3000);
				 	 rt.selectProcess();
				 	 rt.selectEdit();
				 	 rt.selectSubmitForReview();
				 	 rt.selectSalary();
				 	 rt.selectReview();
				 	 rt.selectview();
				 	 rt.selectpublish();
				 	 String r=rt.getMessage();
				 	 Assert.assertEquals(r, "Salary is published successfully");
			}
				 @Test(priority=56)
				 	public void CheckSalaryHead_SC_243() throws Exception{
					 CheckPaydaysPresentdaysAndBasic rt = new CheckPaydaysPresentdaysAndBasic(driver);
				 	 rt.selectSalary();
				 	 rt.selectPublishedSalary();
				 	 rt.selectPayMonth("Nov/2017");
				 	 rt.selectSalaryStructure("Structure_3");
				 	 rt.selectGetEmployee();
				 	 Thread.sleep(3000);
				 	 rt.resizeWindow();
				 	 Thread.sleep(3000);
				 	 rt.selectLoad();
				 	 rt.exitFullscreen();
			 		 Thread.sleep(3000);
			}*/
				/* @Test(priority=57)
				 public void GenerateSalarySheetReport_SC_244() throws Exception{
				   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
					rt.selectReports();
					rt.selectSalarySheet();
					rt.selectreport("All Components");
					rt.selectPayMonth("Nov/2017");
					rt.selectExcel();
					rt.selectGetEmployee();
					Thread.sleep(3000);
					rt.selectLoad();
					Thread.sleep(3000);
					String r=rt.getMessage();
					Assert.assertEquals(r, "Employees Successfully Loaded.");
					Thread.sleep(4000);
					rt.selectGenerateReport();
			}*/
				 /*@Test(priority=58)
				 	public void EditSalaryGroupBasedOnPayDays_SC_247() throws Exception{
						EditSalaryGroupBasedOnPayDays sh=new EditSalaryGroupBasedOnPayDays(driver);
				 		Thread.sleep(5000);
				 		sh.navigateMaster();
				 		sh.clickSalaryStructureLink();
				 		sh.clickSettingsLink();
				  		sh.clickEditLink();
				  		sh.selectCalculationType("Lumpsum");
				  		sh.selectBasedOn("Pay Days");
				  		sh.clickUpdateSalaryGroupDetail();
				  		String s=sh.getMessage();
				  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
				}*/
			/* @Test(priority=59)
				  public void EditSalaryRateDetailsDOL_SC_248() throws Exception {
					EditSalaryRateDetailsDOL rr= new EditSalaryRateDetailsDOL(driver);
					rr.clickEmployeeLink();
				 	rr.selectSalaryRateDetails();
				 	rr.selectListingEmployee();
				 	rr.selectAdvancedFilterIcon();
				 	Thread.sleep(3000);
				 	rr.resizeWindow();
				 	Thread.sleep(2000);
				 	rr.selectLoadButton();
				 	rr.exitFullscreen();
				 	Thread.sleep(3000);
				 	rr.SearchEmp("ABCDPA");
				 	Thread.sleep(3000);
				 	rr.selectEditButton();
				 	rr.selectEffectiveFrom("Nov/2017");
				 	rr.selectGetRate();
				 	rr.enterGrossSal("25000");
				 	rr.enterBasic("3000");
				 	//rr.enterMess("2000");
				 	//rr.selectPopulateButton();
				 	rr.SelectSaveButton();
				 	String s=rr.getMessage();
				 	Assert.assertEquals(s, "Salary Allotted successfully");
	} 
				 
				 @Test(priority=60)
				 	public void PublishSalary_SC_249() throws Exception{
					 PublishSalary rt = new PublishSalary(driver);
					 rt.selectSalary();
				 	 rt.selectSalaryEditor();
				 	 rt.selectPayMonth("Nov/2017");
				 	 rt.selectSalaryStructure("Structure_0");
				 	 rt.selectGetValues();
				 	 Thread.sleep(3000);
				 	 rt.resizeWindow();
				 	 Thread.sleep(3000);
				 	 rt.selectLoad();
				 	 rt.exitFullscreen();
			 		 Thread.sleep(3000);
				 	 rt.selectProcess();
				 	 rt.selectEdit();
				 	 rt.selectSubmitForReview();
				 	 rt.selectSalary();
				 	 rt.selectReview();
				 	 rt.selectview();
				 	 rt.selectpublish();
				 	 String r=rt.getMessage();
				 	 Assert.assertEquals(r, "Salary is published successfully");
			}
				 @Test(priority=61)
				 	public void CheckSalaryHead_SC_250() throws Exception{
					 CheckSalaryHead rt = new CheckSalaryHead(driver);
				 	 rt.selectSalary();
				 	 rt.selectPublishedSalary();
				 	 rt.selectPayMonth("Nov/2017");
				 	 rt.selectSalaryStructure("Structure_0");
				 	 rt.selectGetEmployee();
				 	 Thread.sleep(3000);
				 	 rt.resizeWindow();
				 	 Thread.sleep(3000);
				 	 rt.selectLoad();
				 	 rt.exitFullscreen();
			 		 Thread.sleep(3000);
			}*/
				 	
				/* @Test(priority=62)
				 public void GenerateSalarySheetReport_SC_258() throws Exception{
				   GenerateSalarySheetToCheckPresentDaysAndPayDays rt = new GenerateSalarySheetToCheckPresentDaysAndPayDays(driver);
					rt.selectReports();
					rt.selectSalarySheet();
					rt.selectreport("All Components");
					rt.selectPayMonth("Nov/2017");
					rt.selectExcel();
					rt.selectGetEmployee();
					Thread.sleep(3000);
					rt.selectLoad();
					Thread.sleep(3000);
					String r=rt.getMessage();
					Assert.assertEquals(r, "Employees Successfully Loaded.");
					Thread.sleep(4000);
					rt.selectGenerateReport();
			}*/
				 
}				
