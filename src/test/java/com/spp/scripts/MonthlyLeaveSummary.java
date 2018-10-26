package com.spp.scripts;


import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.GenerateAdvancedLeaveSummary;
import com.spp.pages.GenerateMonthlyLeaveSummary;

public class MonthlyLeaveSummary extends BaseTest{

	/*@Test(priority=0)
	public void GenerateMonthlyLeaveSummary_SC_118() throws Exception{
		GenerateMonthlyLeaveSummary gm=new GenerateMonthlyLeaveSummary(driver);
		gm.clickonleave();
		gm.clickonmonthlyleavesummary();
		gm.selectpaymonth("Jul/2018");
		Thread.sleep(2000);
		gm.selectleavepolicy("PolicyNo1");
		Thread.sleep(2000);
		gm.selectleavetype("Casual Leave");
		Thread.sleep(2000);
		gm.clickongetemployees();
		Thread.sleep(2000);
		gm.clickonload();
		Thread.sleep(2000);
		gm.selectallemployees();
		Thread.sleep(1000);
		gm.generatereport();
	}
	*/
	@Test(priority=1)
	public void GenerateAdvancedLeaveSummary_SC_119() throws Exception{
		GenerateAdvancedLeaveSummary gm=new GenerateAdvancedLeaveSummary(driver);
		gm.clickonleave();
		gm.clickonmonthlyleavesummary();
		gm.selectadvanceleavesummary();
		gm.selectpaymonth("Jul/2018");
		Thread.sleep(2000);
		gm.selectleavepolicy("PolicyNo1");
		Thread.sleep(2000);
		gm.selectleavetype("Casual Leave");
		Thread.sleep(2000);
		gm.clickongetemployees();
		Thread.sleep(2000);
		gm.clickonload();
		Thread.sleep(2000);
		gm.selectallemployees();
		Thread.sleep(1000);
		gm.generatereport();
	}
	
	
	/*@Test(priority=2)
	public void CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_486() throws Exception{
		CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster la=new CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		la.clickonleave();
		la.clickonmonthlyleavesummary();
	//	la.clickongenerallinks();
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC12983");
		la.enterEmployeeref("12342556186");
		la.enterEmployeename("Ashish");
		la.enterEmployeefather("Harish");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Female");
		la.selectMaritalStatus("Single");
		la.selectDateofJoining("06 June 2018");
		Thread.sleep(500);
		la.clickPresentAddress();
		la.selectState("Maharashtra");
		la.selectclassificationdetail();
		la.selectsalstructure("Structure");
		la.selectbranch("Chennai");
		la.selectattendancestructure("Karnataka");
		la.selectbank("CASH");
		la.selectleavepolicy("PolicyNo1");
		la.createemployee();
		String s=la.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
	}*/
}
