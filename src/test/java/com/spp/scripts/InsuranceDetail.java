package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewInsuranceMaster;
import com.spp.pages.CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee;
import com.spp.pages.CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster;
import com.spp.pages.CreateInsuranceDetails;
import com.spp.pages.CreateInsurancePremiumPaymentHalfYearly;
import com.spp.pages.CreateInsurancePremiumPaymentQuarterly;
import com.spp.pages.CreateInsurancePremiumPaymentYearly;
import com.spp.pages.CreatePayment;
import com.spp.pages.DeleteEMIDetail;
import com.spp.pages.DeleteInsuranceDetail;
import com.spp.pages.EditEMIDetailInsuranceDetails;
import com.spp.pages.SalaryInsuranceReportsStandingInsDetailReportredirectstoReport;

public class InsuranceDetail extends BaseTest{

	
	@Test(priority=0)
	public void AddNewInsuranceMaster_SC_302() throws Exception{
		AddNewInsuranceMaster pi=new AddNewInsuranceMaster(driver);
		pi.navigateMaster();	
		pi.clickInsuranceMaster();
		pi.clickNewInsuranceMaster();
		pi.clickInsuranceName("LIC");
		pi.clickCreateinsurance();
		String d=pi.getMessage();
		Assert.assertEquals(d, "Insurance successfully created");
		pi.clickDeleteButton();
	}
	
	@Test(priority=1)
	public void CreateInsuranceDetails_SC_303() throws Exception{
		CreateInsuranceDetails pi=new CreateInsuranceDetails(driver);
		pi.clickonsalary();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		pi.resizeWindow();
		Thread.sleep(3000);
		pi.clickLoad();
		Thread.sleep(3000);
		pi.exitFullscreen();
		pi.clickView();
		Thread.sleep(3000);
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("Insurance_Master");
		pi.clickInsuranceNo("5667");
		pi.clickStartMonth("Aug/2019");
		pi.clickEndMonth("Aug/2019");
		pi.clickAmount("5000");
		pi.selectInstitutionName("AxisBankBranch-ABCD");
		pi.clickRemark("fgfhgjhgh");
		pi.clickMonthly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
	}  
	
	@Test(priority=2)
	public void EditEMIDetail_SC_382() throws Exception{
		EditEMIDetailInsuranceDetails pi=new EditEMIDetailInsuranceDetails(driver);
		pi.navigatesalary();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		pi.resizeWindow();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.exitFullscreen();
		pi.clickView();
		Thread.sleep(3000);
		pi.clickDetails();
		pi.clickEdit();
		pi.clickAmount("400");
		Thread.sleep(5000);
		pi.clickUpdate();
		String d=pi.getMessage();
		Assert.assertEquals(d, "Details Successfully updated");
	}


	@Test(priority=4)
	public void DeleteInsuranceDetail_SC_383() throws Exception{
		DeleteInsuranceDetail pi=new DeleteInsuranceDetail(driver);
		pi.navigateMaster();	
		pi.clickInsuranceDetails();
		pi.clickAddEmployee();
		pi.resizeWindow();
		Thread.sleep(5000);
		pi.clickLoad();
		Thread.sleep(4000);
		pi.exitFullscreen();
		pi.clickView();
		pi.clickDelete1();
		pi.clickDelete2();
		String c=pi.getMessage();
		System.out.println(c);
		Assert.assertEquals(c, ("Insurance successfully deleted"));
	}
	
	@Test(priority=3)
	public void DeleteEMIDetail_SC_384() throws Exception{
		DeleteEMIDetail de=new DeleteEMIDetail(driver);
		de.navigatesalary();
		de.clickInsuranceDetails();
		de.clickAddEmployee();
		de.resizeWindow();
		Thread.sleep(5000);
		de.clickLoad();
		Thread.sleep(4000);
		de.exitFullscreen();
		de.clickView();
		de.clickDetails();
		de.clickDelete1();
		de.clickNoButton();
		Thread.sleep(5000);
		de.clickDelete2();
		de.clickYesButton();
		String d=de.getMessage();
		Assert.assertEquals(d, "Details Successfully Deleted.");
	
	}
	@Test(priority=5)
	public void CheckifSalaryInsuranceReportsStandingInsDetailReportredirectstoReport_SC_615() throws Exception{
		SalaryInsuranceReportsStandingInsDetailReportredirectstoReport si=new SalaryInsuranceReportsStandingInsDetailReportredirectstoReport(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
		si.clickonstandInsdetailrpt();
		Thread.sleep(1000);
		si.selectsitype("Insurance");
		si.selectreporttype("Detailed Report");
		si.selectmonthfrom("Aug/2019");
		si.selectmonthto("Aug/2019");
		si.selectgroupby("Employee Name");
		si.selectorderby("Insurance Name");
		si.clickgetemployees();
		si.resizeWindow();
		Thread.sleep(3000);
		si.clickonload();
		Thread.sleep(3000);
		si.exitFullscreen();
		String s=si.getMessage();
		Assert.assertEquals(s, "Employees Successfully Loaded.");
		Thread.sleep(2000);
		si.selectemployee();
		si.clickongeneratereport();
	}
	@Test(priority=6)
	public void CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster_SC_616() throws Exception{
		CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster si=new CheckifSalaryInsuranceGeneralLinksInsuranceMasterredirectstoMaster(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(1000);
		si.clickoninsurancemaster();
		Thread.sleep(2000);
		si.addnewinsurancemaster();
		si.enterinsurancename("InsuranceLIC");
		si.clickoncreateinsurance();
		String d=si.getMessage();
		Assert.assertEquals(d, "Insurance successfully created");
		Thread.sleep(3000);
		si.clickdeleteInsuranceMaster();
	}
	
	
	@Test(priority=7)
	public void CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee_SC_617() throws Exception{
		CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee si=new CheckifSalaryInsuranceGeneralLinksEmployeeMasterredirectstoEmployee(driver);
		si.clickonsalary();
		si.clickoninsurancedetail();
		si.clickongenerallinks();
		Thread.sleep(2000);
		si.clickonemployeemaster();
		si.addnewemployee();
		si.enterEmployeeid("ABC12345");
		si.enterEmployeeref("12345");
		si.enterEmployeename("Aditya");
		si.enterEmployeefather("Harish");
		si.selectDateofBirth("06 June 1995");
		si.selectGender("Female");
		si.selectMaritalStatus("Single");
		si.selectDateofJoining("06 April 2013");
		Thread.sleep(500);
		si.clickPresentAddress();
		si.selectState("Maharashtra");
		si.selectclassificationdetail();
		si.selectsalstructure("Structure");
		si.selectbranch("default");
		si.selectattendancestructure("Karnataka");
		si.selectbank("CASH");
		si.selectleavepolicy("Default");
		si.createemployee();
		String s=si.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
 		Thread.sleep(5000);
 		si.clickonemployee();
 		si.clickonemployeedetails();
 		si.clickonfilter();
 		si.resizeWindow();
 		Thread.sleep(3000);
 		si.clickonload();
 		Thread.sleep(3000);
 		si.exitFullscreen();
 		si.deleteemployee();
		
	}
	/*@Test(priority=5)
	public void CreateInsurancePremiumPaymentQuarterly_SC_618() throws Exception{
		CreateInsurancePremiumPaymentQuarterly pi=new CreateInsurancePremiumPaymentQuarterly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("LIC");
		pi.clickInsuranceNo("567");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("5000");
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		pi.clickRemark("fgfhgjhgh");
		pi.clickquaterly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
		Thread.sleep(3000);
		pi.clickdelete();
	}
	@Test(priority=6)
	public void CreateInsurancePremiumPaymentHalfYearly_SC_619() throws Exception{
		CreateInsurancePremiumPaymentHalfYearly pi=new CreateInsurancePremiumPaymentHalfYearly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("LIC");
		pi.clickInsuranceNo("5678");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("5000");
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		pi.clickRemark("fgfhgjhgh");
		pi.clickhalfyearly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
		Thread.sleep(3000);
		pi.clickdelete();
	}
	@Test(priority=7)
	public void CreateInsurancePremiumPaymentYearly_SC_620() throws Exception{
		CreateInsurancePremiumPaymentYearly pi=new CreateInsurancePremiumPaymentYearly(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickAddNewInsuranceDetails();
		pi.selectInsuranceName("LIC");
		pi.clickInsuranceNo("5678");
		pi.clickStartMonth("Apr/2013");
		pi.clickEndMonth("Apr/2013");
		pi.clickAmount("5000");
		pi.selectInstitutionName("HDFC Bank-FORT MUMBAI");
		pi.clickRemark("fgfhgjhgh");
		pi.clickyearly();
		pi.clickCreateInsurancebutton();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Insurance successfully created");
		
	}
	
	@Test(priority=8)
	public void CreatePayment_SC_621() throws Exception{
		CreatePayment pi=new CreatePayment(driver);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickondetail();
		pi.selectfrommonth("Apr/2013");
		pi.selecttomonth("Apr/2013");
		pi.entermodifiedamount("12000");
		pi.enterinstitutionname("HDFC Bank-FORT MUMBAI");
		pi.enterremarks("dnjkh");
		pi.createpayment();
		String c=pi.getMessage();
		Assert.assertEquals(c, "Details Successfully created.");
		Thread.sleep(5000);
		pi.clickonsalary();	
		pi.clickoninsurancedetail();
		Thread.sleep(2000);
		pi.clickaddemployees();
		Thread.sleep(3000);
		pi.clickonload();
		Thread.sleep(3000);
		pi.clickonview();
		pi.clickdelete();
		Thread.sleep(5000);
		pi.navigateMaster();
		pi.clickInsuranceMaster();
		pi.clickdeleteInsuranceMaster();
	}*/
}

