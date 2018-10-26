package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.EnterLeaveDetailsforanEmployeewithMonthlyAttendance;
import com.spp.pages.GenerateMonthlyAttendanceTemplate;

public class MonthlyAttendance extends BaseTest{
	
	/*@Test(priority=0)
	public void EnterLeaveDetailsforanEmployeewithMonthlyAttendance_SC_120() throws Exception{
		EnterLeaveDetailsforanEmployeewithMonthlyAttendance de=new EnterLeaveDetailsforanEmployeewithMonthlyAttendance(driver);
		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectpaymonth("Jul/2018");
		Thread.sleep(1000);
		de.selectleavepolicy("Policy2");
		de.clickongetemployees();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.clickonmakeleaveentry();
		Thread.sleep(1000);
		de.entercompoff("1");
		de.clickonupdatevalues();
		String s=de.getMessage();
 		Assert.assertEquals(s, "Monthly attendance saved successfully");
 		Thread.sleep(3000);
 		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectpaymonth("Jul/2018");
		Thread.sleep(1000);
		de.selectleavepolicy("Policy2");
		de.clickongetemployees();
		Thread.sleep(2000);
		de.clickonload();
		Thread.sleep(2000);
		de.clickonmakeleaveentry();
	}*/
	@Test(priority=2)
	public void GenerateMonthlyAttendanceTemplate_SC_487() throws Exception{
		GenerateMonthlyAttendanceTemplate de=new GenerateMonthlyAttendanceTemplate(driver);
		de.clickonleave();
		de.clickonmonthlyattendance();
		de.selectmonthlyattendance();
		Thread.sleep(2000);
		de.generatemonthlyattendance();
		Thread.sleep(2000);
		de.selectpaymonth("Jul/2018");
		de.selectleavepolicy("Policy2");
		de.generatetemplate();
	}
	/*@Test(priority=1)
	public void CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_487() throws Exception{
		CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster la=new CheckifLeaveMonthlyAttendanceGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		la.clickonleave();
		la.clickonmonthlyattendance();
	//	la.clickongenerallinks();
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC12983NVM");
		la.enterEmployeeref("12342RE61864232");
		la.enterEmployeename("Amol");
		la.enterEmployeefather("Suresh");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Male");
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
