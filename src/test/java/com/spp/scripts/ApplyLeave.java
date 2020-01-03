package com.spp.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.ApplyDefaultLeave;
import com.spp.pages.ApplyUserDefinedtLeave;
//import com.spp.pages.CheckifEmployeeLeaveAllotAvailDateSettingsGeneralLinkredirectstoEmployeeMaster;
import com.spp.pages.CheckifLeaveApplyLeaveGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.DeleteAppliedLeave;
import com.spp.pages.SearchtheLeavesApplied;
import com.spp.pages.ToviewappliedLeaveDetailinLeaveSummarytab;

import junit.framework.Assert;
public class ApplyLeave extends BaseTest{

	@Test(priority=0)
	public void ApplyDefaultLeave_SC_109() throws Exception{
		ApplyDefaultLeave dl=new ApplyDefaultLeave(driver);
		dl.clickonleave();
		dl.clickonapplyleave();
		dl.resizeWindow();
		Thread.sleep(1000);
		dl.clickonfilterhead();
		Thread.sleep(2000);
		dl.clickonload();
		Thread.sleep(2000);
		dl.exitFullscreen();
		dl.applyleave();
		Thread.sleep(2000);
		dl.selectleavetype("Casual Leave (CL)");
		Thread.sleep(2000);
		dl.selectfromdate("24 February 2020");
		Thread.sleep(2000);
		dl.selecttodate("24 February 2020");
		Thread.sleep(2000);
		dl.clickonapply();
		Thread.sleep(2000);
		String s=dl.getMessage();
		Assert.assertEquals(s, "Leave applied successfully.");
		Thread.sleep(2000);
		dl.checkleavesummary();
		Thread.sleep(2000);
		dl.clickleavehistory();
		Thread.sleep(2000);
		dl.EnterFromHistoryDate("01 November 2013");
		dl.ClickSearch();
		Thread.sleep(3000);
		dl.ClickView();
		Thread.sleep(3000);
		dl.ClickDelete();
	}
	
	@Test(priority=1)
	public void ApplyUserDefinedtLeave_SC_110() throws Exception{
		ApplyUserDefinedtLeave dl=new ApplyUserDefinedtLeave(driver);
		dl.clickonleave();
		dl.clickonapplyleave();
		dl.resizeWindow();
		Thread.sleep(1000);
		dl.clickonfilterhead();
		Thread.sleep(3000);
		dl.clickonload();
		Thread.sleep(3000);
		dl.exitFullscreen();
		dl.applyleave();
		Thread.sleep(2000);
		dl.selectleavetype("Casual Leave (CL)");
		dl.selectfromdate("10 February 2020");
		Thread.sleep(2000);
		dl.selecttodate("10 February 2020");
		Thread.sleep(3000);
		dl.clickonapply();
		String s=dl.getMessage();
		Assert.assertEquals(s, "Leave applied successfully.");
		Thread.sleep(2000);
		dl.checkleavesummary();
		Thread.sleep(2000);
		dl.checkleavehistory();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void SearchtheLeavesApplied_SC_477() throws Exception{
		SearchtheLeavesApplied dl=new SearchtheLeavesApplied(driver);
		dl.clickonleave();
		dl.clickonapplyleave();
		Thread.sleep(2000);
		dl.resizeWindow();
		Thread.sleep(2000);
		dl.clickonfilterhead();
		Thread.sleep(2000);
		dl.clickonload();
		Thread.sleep(2000);
		dl.exitFullscreen();
		dl.applyleave();
		Thread.sleep(1000);
		dl.checkleavehistory();
		Thread.sleep(1000);
		dl.selectfromdate("15 October 2013");
		dl.selectodate("15 October 2020");
		dl.clickonsearch();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void ToviewappliedLeaveDetailinLeaveSummarytab_SC_478() throws Exception{
		ToviewappliedLeaveDetailinLeaveSummarytab st=new ToviewappliedLeaveDetailinLeaveSummarytab(driver);
		st.clickonleave();
		st.clickonapplyleave();
		Thread.sleep(2000);
		st.clickonfilterhead();
		st.resizeWindow();
		Thread.sleep(2000);
		st.clickonload();
		Thread.sleep(2000);
		st.exitFullscreen();
		st.applyleave();
		Thread.sleep(1000);
		st.checkleavehistory();
		Thread.sleep(1000);
		st.selectfromdate("01 August 2013");
		st.selectodate("14 August 2020");
		Thread.sleep(2000);
		st.clickonsearch();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void DeleteAppliedLeave_SC_112() throws Exception{
		DeleteAppliedLeave dl=new DeleteAppliedLeave(driver);
		dl.clickonleave();
		dl.clickonapplyleave();
		Thread.sleep(1000);
		dl.clickonfilterhead();
		dl.resizeWindow();
		Thread.sleep(2000);
		dl.clickonload();
		Thread.sleep(2000);
		dl.exitFullscreen();
		dl.applyleave();
		dl.checkleavehistory();
		Thread.sleep(2000);
		dl.enterHistoryFromDate("01 August 2013");
		//dl.enterHistoryToDate("14 August 2019");
		Thread.sleep(2000);
		dl.clickSearchButton();
		Thread.sleep(2000);
		dl.clickonview();
		Thread.sleep(2000);
		dl.clickondelete();
		Thread.sleep(2000);
		dl.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dl.clickondelete();
		Thread.sleep(2000);
		dl.switchToPopUpAndAccept(driver);
		String s=dl.getMessage();
		Assert.assertEquals(s, "Leave detail successfully deleted.");
		//dl.checkleavehistory();
	}
	
	@Test(priority=5)
	public void CheckifLeaveApplyLeaveGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_476() throws Exception{
	CheckifLeaveApplyLeaveGeneralLinkEmployeeMasterredirectstoEmployeeMaster dl=new CheckifLeaveApplyLeaveGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		dl.clickonleave();
		dl.clickonapplyleave();
		dl.clickongenerallinks();
		Thread.sleep(2000);
		dl.clickonemployeemaster();
		Thread.sleep(2000);
		dl.addnewemployee();
		dl.enterEmployeeid("ABC1237");
		dl.enterEmployeeref("Ref-T"+Utility.getRandNum(4201, 4306));
		dl.enterEmployeename("Lary");
		dl.enterEmployeefather("Harish");
		dl.selectDateofBirth("06 June 1995");
		dl.selectGender("Female");
		dl.selectMaritalStatus("Single");
		dl.selectDateofJoining("06 June 2018");
		Thread.sleep(500);
		dl.clickPresentAddress();
		dl.selectState("Maharashtra");
		dl.selectclassificationdetail();
		dl.selectsalstructure("Structure");
		dl.selectbranch("default");
		dl.selectattendancestructure("Karnataka");
		dl.selectbank("CASH");
		dl.selectleavepolicy("Default");
		dl.createemployee();
		String s=dl.getMessage();
	 	Assert.assertEquals(s, "Employee successfully created");
	 	dl.ClickEmpMod();
	 	dl.ClickEmpdetails();
	 	dl.ClickFilter();
	 	dl.resizeWindow();
	 	Thread.sleep(3000);
	 	dl.ClickLoad();
	 	Thread.sleep(3000);
	 	dl.selectSearch("Lary");
	 	dl.ClickDelete();
	}
}