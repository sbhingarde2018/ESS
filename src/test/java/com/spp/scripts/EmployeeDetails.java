package com.spp.scripts;


import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
//import com.spp.pages.AddEmployeewithClassificationDetail;
//import com.spp.pages.AddNewEmployee;
import com.spp.pages.AddNewEmployeeTDS;
import com.spp.pages.AddNewHrCategoryDetailsofEmployee;
import com.spp.pages.AssignEmployee;
import com.spp.pages.CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule;
import com.spp.pages.CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule;
import com.spp.pages.CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule;
import com.spp.pages.CreateEmployeeESIContributionApplicability;
import com.spp.pages.CreateEmployeeviaExcelImport;
import com.spp.pages.CreateWeeklyOffDetailsofanEmployee;
import com.spp.pages.DeleteClassificationDetailsInEmployee;
import com.spp.pages.DeleteHrCategoryDetailsofEmployee;
import com.spp.pages.DeleteWeeklyOff;
import com.spp.pages.EditClassificationDetailsChangeSalaryStructureofanemployee;
import com.spp.pages.EditHrCategoryDetailsofEmployee;
import com.spp.pages.GenerateDataTemplate;
import com.spp.pages.GetHRDataTemplates;
import com.spp.pages.GetHRSampleTemplates;
import com.spp.pages.UpdateWeeklyOff;


public class EmployeeDetails extends BaseTest{
	
	@Test(priority=0)
	public void verifyAddNewEmployee_SC_77() throws Exception{
		AddNewEmployeeTDS at=new AddNewEmployeeTDS(driver);
		at.navigateEmployee();
		at.clickEmployeeDetails();
		at.clickAddNewEmployee();
		Thread.sleep(1000);
		//at.enterEmployeeId("ID101");
		at.enterEmployeeRefNo("Ref-T"+Utility.getRandNum(4441, 4966));
		at.enterEmployeeName("EMPA");
		at.enterFathername("Anand");
		at.enterdob("14 June 1980");
		at.selectGender("Male");
		at.selectMaritalStatus("Single");
		at.enterdoj("01 March 2019");
		//at.entersaldate("01 March 2019");
		Thread.sleep(1000);
		//at.selectPresentadd();
		at.selectstate("Maharashtra");
		Thread.sleep(1000);
		at.selectstatdetails();
		//at.checkTDS();
		//at.selectpanoption("ADD PAN");
		//at.enterpanno("PRAPM"+Utility.getRandNum(4441, 4966)+"T");
		//at.entereffectivedatePAN("01 November 2018");
		//Thread.sleep(1000);
		at.selectclassificationdetail();
		at.selectsalstructure("Structure");
		at.selectbranch("default");
		at.selectattendancestructure("Karnataka");
		at.selectbank("CASH");
		at.selectleavepolicy("abc");
		Thread.sleep(2000);
		at.selectdesignation("Tester");
		Thread.sleep(2000);
		at.createemployee();
		Thread.sleep(4000);
		String s=at.getMessage();
		Assert.assertEquals(s, "Employee successfully created");
	}
	
	@Test(priority=1)
	public void verifyAssignEmployee_SC_78() throws Exception{
		AssignEmployee ww=new AssignEmployee(driver);
		ww.clickEmployeeLink();
		ww.selectEmployeeDetails();
		ww.selectFilterHead();
		//System.out.println("done1");
		//Thread.sleep(3000);
		//ww.clickEmployeewithoutClass();
		//System.out.println("done2");
		ww.resizeWindow();
		ww.selectLoadButton();
		Thread.sleep(4000);
		ww.exitFullscreen();
		ww.SearchEmp("EMPA");
		ww.selectViewButton();//------------------------------------- change emp path
		ww.selectClassificationDetails();
		ww.selectAddNewClassiDetails();
		ww.ClickEffectiveDate();
		ww.ClickMonth();
		//ww.selectSalaryStructure("Structure");
		//ww.selectAttendanceStructure("Karnataka");
		//ww.selectBranch("default");
		//ww.selectBank("CASH");
		//ww.selectLeavePolicy("Default");
		//ww.enterBankAc("74"+Utility.getRandNum());
		ww.clickCreateClassificationButton();
		Thread.sleep(6000);
		//String s=ww.getMessage();
		//Assert.assertEquals(s, "Employee detail was successfully created.");
		//Thread.sleep(4000);
		//ww.ClickDeletebutton();
		//ww.switchToPopUpAndAccept(driver);
		//Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CreateEmployeeviaExcelImport_SC_95() throws InterruptedException {
	CreateEmployeeviaExcelImport xl=new CreateEmployeeviaExcelImport(driver);
		xl.clickEmployeeTab();
		xl.clickEmployeeDetailsLink();
		xl.clickImportExportTab();
		Thread.sleep(5000);
		xl.ClickGenTemp();
		Thread.sleep(3000);
		xl.clickExcelTemplateUpload();
		xl.enterExcelFilePath("C:\\Users\\AlfaLabs\\Downloads\\EmployeeDetails.xlsx");
		xl.clickUpload();
		Thread.sleep(5000);
		xl.ReloadPage();
		Thread.sleep(5000);
		//xl.clickNotificationIcon();
		//xl.importBackgroundJobs();
		//xl.sortByLatestJob();
		//xl.sortByLatestJob();
		//String message = xl.getSuccessmessage();
		//Assert.assertEquals(message, "Successfully Imported");
	}
	
		@Test(priority=3)
	public void verifyDataTemplateGeneration_SC_96() throws InterruptedException, IOException {
	GenerateDataTemplate gxl = new GenerateDataTemplate(driver);
		gxl.clickEmployeeTab();
		gxl.clickEmployeeDetailsLink();
		gxl.clickImportExportTab();
		gxl.clickGenerateDataTemplateTab();
		gxl.SelectExcelType("Employees Data Template");
		gxl.clickGetEmployees();
		gxl.resizeWindow();
		Thread.sleep(4000);
		gxl.LoadEmployees();
		Thread.sleep(4000);
		gxl.exitFullscreen();
		gxl.DownloadTemplate();
		Thread.sleep(3000);
	}
		
			
	@Test(priority=4)
	public void CheckDeleteClassificationDetailsInEmployee_SC_421() throws Exception {
	DeleteClassificationDetailsInEmployee ce = new DeleteClassificationDetailsInEmployee(driver);
		ce.clickonemployee();
		ce.clickonemployeedetails();
		ce.clickonfilter();
		ce.resizeWindow();
		Thread.sleep(2000);
		ce.clickonload();
		Thread.sleep(2000);
		ce.exitFullscreen();
		ce.SearchEmp("EMPA");
		ce.selectViewButton();//------------------------------------- change emp path
		ce.selectClassificationDetails();
		ce.ClickDeleteButton1();
		ce.switchToPopUpAndAccept(driver);
		String message = ce.getMessage();
		Assert.assertEquals(message, "Employee detail was successfully deleted.");
		Thread.sleep(2000);
	}	
	@Test(priority=5)
	public void AddEmployeewithClassificationDetail_SC_440() throws Exception{
		AddNewEmployeeTDS at=new AddNewEmployeeTDS(driver);
		at.navigateEmployee();
		at.clickEmployeeDetails();
		at.clickAddNewEmployee();
		Thread.sleep(1000);
		at.enterEmployeeId("ID555");
		at.enterEmployeeRefNo("Ref-T102");
		at.enterEmployeeName("Nisha");
		at.enterFathername("Anand");
		at.enterdob("14 June 1980");
		at.selectGender("Female");
		at.selectMaritalStatus("Single");
		at.enterdoj("01 January 2018");
		//at.entersaldate("01 February 2018");
		Thread.sleep(1000);
		//at.selectPresentadd();
		at.selectstate("Maharashtra");
		Thread.sleep(1000);
		at.selectstatdetails();
		//at.checkTDS();
		//at.selectpanoption("ADD PAN");
		//at.enterpanno("PRAPM"+Utility.getRandNum(4441, 4966)+"S");
		//at.entereffectivedatePAN("01 January 2018");
		//Thread.sleep(1000);
		at.selectclassificationdetail();
		at.selectsalstructure("Structure");
		at.selectbranch("default");
		at.selectattendancestructure("Karnataka");
		at.selectbank("CASH");
		at.selectleavepolicy("Default");
		Thread.sleep(2000);
		at.selectdesignation("Tester");
		Thread.sleep(2000);
		at.createemployee();
		Thread.sleep(5000);
		String s=at.getMessage();
		Assert.assertEquals(s, "Employee successfully created");
	}

		@Test(priority=6)
	public void EditClassificationDetailsChangeSalaryStructureofanemployee_SC_441() throws Exception{
		EditClassificationDetailsChangeSalaryStructureofanemployee dw= new EditClassificationDetailsChangeSalaryStructureofanemployee(driver);
		dw.clickonemployee();
		dw.clickonemployeedetails();
		dw.resizeWindow();
		dw.clickonfilter();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.exitFullscreen();
		dw.SearchEmp("Nisha");
		dw.clickonview();
		Thread.sleep(2000);
		dw.clickonclassificationdetails();
		Thread.sleep(1000);
		dw.clickonedit();
		dw.selectsalarystructure("grossstructure");
		dw.updateclassificationdetails();
		dw.switchToPopUpAndDismiss();
		dw.updateclassificationdetails();
		dw.switchToPopUpAndAccept(driver);
		String message = dw.getMessage();
		Assert.assertEquals(message, "Employee detail was successfully updated.");
	}

	@Test(priority=7)
	public void CreateEmployeeESIContributionApplicability_SC_452() throws Exception {
		CreateEmployeeESIContributionApplicability ca=new CreateEmployeeESIContributionApplicability(driver);
		ca.clickonemployee();
		ca.clickonemployeedetails();
		ca.resizeWindow();
		ca.clickonfilter();
		ca.resizeWindow();
		Thread.sleep(2000);
		ca.clickonload();
		Thread.sleep(2000);
		ca.exitFullscreen();
		ca.clickonview();
		Thread.sleep(2000);
		ca.clickonESICon();
		ca.selecteffdate();
		ca.SelectkMonth();
		ca.createesi();
		String message = ca.getMessage();
		Assert.assertEquals(message, "ESI Applicability Detail Successfully Created.");
		Thread.sleep(3000);
		ca.ClickDelete();
	}
	
	@Test(priority=8)
	public void CreateWeeklyOffDetailsofanEmployee_SC_453() throws Exception {
		CreateWeeklyOffDetailsofanEmployee ca=new CreateWeeklyOffDetailsofanEmployee(driver);
		ca.clickonemployee();
		ca.clickonemployeedetails();
		ca.resizeWindow();
		ca.clickonfilter();
		ca.resizeWindow();
		Thread.sleep(2000);
		ca.clickonload();
		Thread.sleep(2000);
		ca.exitFullscreen();
		ca.clickonview();
		ca.clickongeneral();
		Thread.sleep(2000);
		ca.clickonweeklyoff();
		Thread.sleep(2000);
		ca.addnewweeklyoff();
		ca.selecteffectivefromdate("01 January 2020");
		ca.selecteffectivetilldate("01 January 2020");
		ca.firstweeklyoff("Monday");
		ca.enterfirstorsecondhalf1("Full");
		ca.secondweeklyoff("Friday");
		ca.enterfirstorsecondhalf2("Full");
		ca.createweeklyoff();
		Thread.sleep(4000);
		//String message = ca.getMessage();
		//Assert.assertEquals(message, "Attendance Weekly Off successfully created");
	}
	
		@Test(priority=9)
	public void UpdateWeeklyOff_SC_454() throws Exception{
		UpdateWeeklyOff uf= new UpdateWeeklyOff(driver);
		uf.clickonemployee();
		uf.clickonemployeedetails();
		uf.resizeWindow();
		uf.clickonfilter();
		uf.resizeWindow();
		Thread.sleep(2000);
		uf.clickonload();
		Thread.sleep(2000);
		uf.exitFullscreen();
		uf.clickonview();
		uf.clickongeneral();
		Thread.sleep(2000);
		uf.clickonweeklyoff();
		Thread.sleep(2000);
		uf.clickonedit();
		uf.updatedate("01 August 2019");
		uf.updateweeklyoff();
		Thread.sleep(3000);
		//String message = uf.getMessage();
		//Assert.assertEquals(message, "Attendance Weekly Off successfully updated");
	}
	
	@Test(priority=10)
	public void DeleteWeeklyOff_SC_455() throws Exception{
		DeleteWeeklyOff dw= new DeleteWeeklyOff(driver);
		dw.clickonemployee();
		dw.clickonemployeedetails();
		dw.resizeWindow();
		dw.clickonfilter();
		dw.resizeWindow();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.exitFullscreen();
		dw.clickonview();
		Thread.sleep(2000);
		dw.clickongeneral();
		Thread.sleep(2000);
		dw.clickonweeklyoff();
		Thread.sleep(2000);
		dw.clickondelete();
		dw.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dw.clickondelete();
		dw.switchToPopUpAndAccept(driver);
		Thread.sleep(3000);
		//String message = dw.getMessage();
		//Assert.assertEquals(message, "Attendance Weekly Off was successfully deleted.");
	}
	
	@Test(priority=11)
	public void AddNewHrCategoryDetailsofEmployee_SC_456() throws Exception{
		AddNewHrCategoryDetailsofEmployee de=new AddNewHrCategoryDetailsofEmployee(driver);
		de.clickonemployee();
		de.clickonemployeedetails();
		de.resizeWindow();
		de.clickonfilter();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.clickonview();
		de.clickonhrcategory();
		Thread.sleep(2000);
		de.clickonpersonal();
		Thread.sleep(2000);
		de.addnewpersonalhrcat();
		de.enterbloodgrp("AB");
		de.enterqualification("BE");
		de.enternationality("Indian");
		de.clickonsave();
		String message = de.getMessage();
		Assert.assertEquals(message, "Hr Detail Created Successfully");
		de.exitFullscreen();
	}
	
	@Test(priority=12)
	public void EditHrCategoryDetailsofEmployee_SC_457() throws Exception{
		EditHrCategoryDetailsofEmployee de=new EditHrCategoryDetailsofEmployee(driver);
		de.clickonemployee();
		de.clickonemployeedetails();
		de.resizeWindow();
		de.clickonfilter();
		de.resizeWindow();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.exitFullscreen();
		de.clickonview();
		de.clickonhrcategory();
		Thread.sleep(2000);
		de.clickonpersonal();
		Thread.sleep(2000);
		de.edithrcat();
		de.enterbloodgrp("B");
		de.clickonsave();
		String message = de.getMessage();
		Assert.assertEquals(message, "Hr Detail Updated Successfully");
		de.exitFullscreen();
	}
	
	@Test(priority=13)
	public void DeleteHrCategoryDetailsofEmployee_SC_458() throws Exception {
	DeleteHrCategoryDetailsofEmployee de=new DeleteHrCategoryDetailsofEmployee(driver);
		de.clickonemployee();
		de.clickonemployeedetails();
		de.clickonfilter();
		de.resizeWindow();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.exitFullscreen();
		de.clickonview();
		de.clickonhrcategory();
		Thread.sleep(2000);
		de.clickonpersonal();
		Thread.sleep(2000);
		de.deletehrcategory();
		Thread.sleep(2000);
		de.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		de.deletehrcategory();
		Thread.sleep(2000);
		de.switchToPopUpAndAccept(driver);
		Thread.sleep(5000);
		//String message = de.getMessage();
		//Assert.assertEquals(message, "Hr master detail successfully deleted.");
	}
	
	@Test(priority=14)
	public void GetHRSampleTemplates_SC_460() throws Exception{
		GetHRSampleTemplates gh= new GetHRSampleTemplates(driver);
		gh.clickonemployee();
		gh.clickonemployeedetails();
		gh.clickonimportexport();
		Thread.sleep(2000);
		gh.clickonhrsampletemplate();
		gh.selecthrcategory("Personal");
		gh.gettemplate();
	}
	
	@Test(priority=15)
	public void GetHRDataTemplates_SC_461() throws Exception{
		GetHRDataTemplates gd=new GetHRDataTemplates(driver);
		gd.clickonemployee();
		gd.clickonemployeedetails();
		gd.clickonimportexport();
		Thread.sleep(2000);
		gd.clickonhrdatatemplate();
		gd.selecthrcategory("Personal");
		gd.resizeWindow();
		gd.getemployees();
		gd.resizeWindow();
		Thread.sleep(2000);
		gd.clickonload();
		Thread.sleep(2000);
		gd.exitFullscreen();
		gd.getdatatemplate();
	}
	
	@Test(priority=16)
	public void CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule_SC_462() throws Exception {
		CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule cr=new CheckifEmployeeEmployeeDetailsReportsEmployeeMasterReportredirectstoReportmodule(driver);
		cr.clickonemployee();
		cr.clickonemployeedetails();
		cr.clickonreports();
		Thread.sleep(2000);
		cr.clickonmasterreport();
		Thread.sleep(2000);
		cr.selectreporttype("Date Of Joining");
		cr.getemployees();
		cr.resizeWindow();
		Thread.sleep(2000);
		cr.clickonload();
		Thread.sleep(2000);
		cr.selectemployee();
		Thread.sleep(2000);
		cr.generatereport();
		cr.exitFullscreen();
	}
	@Test(priority=17)
	public void CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule_SC_463() throws Exception {
		CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule cr=new CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule(driver);
		cr.clickonemployee();
		cr.clickonemployeedetails();
		cr.clickonreports();
		Thread.sleep(2000);
		cr.clickonstatreport();
		Thread.sleep(2000);
		cr.selectreporttype("ESI");
		//cr.selectgroup("Default");
		cr.selectorderby("Employee Name");
		//cr.selectpaymonth("Sep/2019");
		Thread.sleep(2000);
		cr.generatestatreport();
	}
	
	@Test(priority=18)
	public void CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule_SC_464() throws Exception {
		CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule cr=new CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule(driver);
		cr.clickonemployee();
		cr.clickonemployeedetails();
		cr.clickonreports();
		Thread.sleep(2000);
		cr.clickonemployeesummary();
		cr.clickonviewsummary();
		cr.downloadpdf();
		Thread.sleep(3000);
		//cr.downloadexcel();
	}

	@Test(priority=19)
	public void CheckDeleteEmployeeExtra() throws Exception {
	DeleteClassificationDetailsInEmployee ce = new DeleteClassificationDetailsInEmployee(driver);
		ce.clickonemployee();
		ce.clickonemployeedetails();
		ce.clickonfilter();
		ce.resizeWindow();
		Thread.sleep(3000);
		ce.clickonload();
		Thread.sleep(3000);
		ce.DeleteEmployee();
		ce.switchToPopUpAndAccept(driver);
		ce.DeleteEmployee1();
		ce.switchToPopUpAndAccept(driver);
		ce.exitFullscreen();
		Thread.sleep(2000);
		//String message = ce.getMessage();
		//Assert.assertEquals(message, "Employee detail was successfully deleted.");
	}
}