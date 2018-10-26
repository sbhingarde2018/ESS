package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee;
import com.spp.pages.SetOpeningBalanceForEmployee;
import org.testng.Assert;

public class SetLeaveOpeningBalance extends BaseTest{
	
	/*@Test(priority=0)
	public void SetOpeningBalanceForEmployee_SC_104() throws Exception{
		SetOpeningBalanceForEmployee ty = new SetOpeningBalanceForEmployee(driver);
		ty.selectEmployee();
		ty.selectSetOpeningBalance();
		ty.selectLeaveType("Casual Leave (CL)");
		ty.selectGetEmployeeButtone();
		Thread.sleep(4000);
		ty.selectLoadButton();
		ty.selectMoreButton();
		Thread.sleep(2000);
		ty.selectOpeningBalance("2000");
		ty.selectUpdate();
		String d=ty.getMessage();
		Assert.assertEquals(d, "Leave Opening Balance successfully created.");
}*/
	@Test(priority=1)
	public void CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee_SC_474() throws Exception{
		CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee la=new CheckifEmployeeSetLeaveOpeningBalanceGeneralLinkEmployeeMasterredirectstoEmployeeMastertoAddNewEmployee(driver);
		la.clickonemployee();
		la.clickonsetleaveopeningbalance();
		la.clickongenerallinks();
		Thread.sleep(2000);
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC1234");
		la.enterEmployeeref("123456ABC");
		la.enterEmployeename("Preeti");
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
	}
}