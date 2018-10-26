package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.UpdateLeaveAllotAvailDateSettingsInBulk;

public class LeaveAllotAvailDateSettings extends BaseTest {
	
	
/*	@Test(priority=0)
	public void UpdateLeaveAllotAvailDateSettingsInBulk_SC_107() throws Exception{
		UpdateLeaveAllotAvailDateSettingsInBulk af=new UpdateLeaveAllotAvailDateSettingsInBulk(driver);
		af.selectEmployee();
		af.selectLeaveAllotAvail();
		af.selectLeaveType("Compensatory Off (CO)");
		af.selectGetEmployee();
		Thread.sleep(5000);
		af.selectLoadButton();
		af.selectMoreLink();
		Thread.sleep(3000);
		af.selectAllotFrom("16 May 2018");
		af.selectAvailFrom("25 May 2018");
		Thread.sleep(4000);
		af.selectUpdateButton();
		Thread.sleep(5000);
		String s=af.getMessage();
 		Assert.assertEquals(s, "Leave Allot/Avail Date configuration successfully updated.");
 		af.selectMoreLink1();	
}*/
	@Test(priority=1)
	public void CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster_SC_473() throws Exception{
		CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster la=new CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster(driver);
		la.clickonemployee();
		la.clickonleaveallotdetails();
		la.clickongenerallinks();
		Thread.sleep(2000);
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC123");
		la.enterEmployeeref("1234569786");
		la.enterEmployeename("Pooja");
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