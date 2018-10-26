package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddLeaves;
import com.spp.pages.AutoAllotSettings;
import com.spp.pages.CarryoverLapseSettings;
import com.spp.pages.CheckAllowHalfaday;
import com.spp.pages.CheckAutoAllotSettingsForPresentDays;
import com.spp.pages.CheckAutoAllotSettingsHalfYearly;
import com.spp.pages.CheckAutoAllotSettingsHalfYearlyInLeaveSummary;
import com.spp.pages.CheckAutoAllotSettingsMonthly;
import com.spp.pages.CheckAutoAllotSettingsMonthlyInLeaveSummary;
import com.spp.pages.CheckAutoAllotSettingsQuarterly;
import com.spp.pages.CheckAutoAllotSettingsQuarterlyInLeaveSummary;
import com.spp.pages.CheckAutoAllotSettingsYearly;
import com.spp.pages.CheckAutoAllotSettingsYearlyInLeaveSummary;
import com.spp.pages.CheckAutoLeaveAllotmentPreviousMonthWithPaydaysForEveryMonth;
import com.spp.pages.CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth;
import com.spp.pages.CheckAutoLeaveAllotmentWithMonthlyForEvenMonth;
import com.spp.pages.CheckAutoLeaveAllotmentWithMonthlyForOddMonth;
import com.spp.pages.CheckAutoLeaveAllotmentWithPeriodInLeavePolicy;
import com.spp.pages.CheckExcessCasualLeaveTakenAsLOP;
import com.spp.pages.CheckForAllowHalfDayInLeaveModule;
import com.spp.pages.CheckForCarryOverInLeavePolicy;
import com.spp.pages.CheckForLapseExceedingInLeavePolicy;
import com.spp.pages.CheckForLapseUnavailedOnInLeavePolicy;
import com.spp.pages.CheckForLowerLimitInLeavePolicy;
import com.spp.pages.CheckForPrioritySettingsInLeavePolicy;
import com.spp.pages.CheckForUpperLimitInLeavePolicy;
import com.spp.pages.CheckMaxNoOfCasualLeaveAllowedAvailForMonth;
import com.spp.pages.CheckMaxNoOfEarnedLeaveAllowedAvailForYear;
import com.spp.pages.CheckPriordaystoapplycasualleave;
import com.spp.pages.CheckforMaxCasualLeavethatcanbeavailedforinstance;
import com.spp.pages.CheckforMaxEarnedLeavecanbeEncashedinayear;
import com.spp.pages.CheckforMinEarnedLeavecanbeEncashedperinstance;
import com.spp.pages.CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave;
import com.spp.pages.CheckforNooftimesEarnedLeavecanbeEncashedinayear;
import com.spp.pages.CloneLeavePolicy;
import com.spp.pages.CreateLeavePolicy;
import com.spp.pages.DeleteLeave;
import com.spp.pages.DeleteLeavePolicy;
import com.spp.pages.EncashmentSettings;
import com.spp.pages.GeneralLinkPolicy;
import com.spp.pages.HolidayWeeklyoffSettings;
import com.spp.pages.LeaveBehaviourSettings;
import com.spp.pages.UpdateAutoAllotSettingsHalfYearly;
import com.spp.pages.UpdateAutoAllotSettingsMonthly;
import com.spp.pages.UpdateAutoAllotSettingsPresentDays;
import com.spp.pages.UpdateAutoAllotSettingsQuarterly;
import com.spp.pages.UpdateAutoAllotSettingsYearly;
import com.spp.pages.UpdateLeavePolicy;

public class LeavePolicy extends BaseTest {

/*	@Test(priority=0)
	public void verifyCreatedLeavePolicy_SC_35(){
		CreateLeavePolicy lp=new CreateLeavePolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickAddLeavePolicy();
		lp.enterPolicyName("newLeavepolicy_"+Utility.getRandNum());
		lp.selectLeaveType("Leave Register");
		lp.enterRemarks("No Remarks");
		lp.clickCreateLeavePolicy();
		String s=lp.getmessage();
		Assert.assertEquals(s, "Leave policy master successfully created");
	}

	@Test(priority=1)
	public void verifyUpdatedLeavePolicy_SC_36() throws Exception{
		UpdateLeavePolicy lp=new UpdateLeavePolicy(driver);
		Thread.sleep(5000);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickEditLink();
		lp.enterPolicyName("newLeavepolicy_"+Utility.getRandNum());
		lp.enterRemarks("Not applicable");
		lp.clickUpdateLeavePolicy();
		String s=lp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully updated");
	} 

	@Test(priority=2)
	public void verifyAddedLeaves_SC_38(){
		AddLeaves al=new AddLeaves(driver);
		al.clickMastserLink();
		al.selectLeavePolicy();
		al.clickAddLeaves();	//change as per leave policy 
		al.selectLeaveType("Holiday (Ho)");
		al.clickAddButton();
		String s=al.getMessage();
		Assert.assertEquals(s, "Leave policy setting was successfully created.");
	}
	@Test(priority=4)
	public void verifyDeletedLeavePolicy_SC_37() throws InterruptedException{
		DeleteLeavePolicy dp=new DeleteLeavePolicy(driver);
		dp.clickMastserLink();
		dp.selectLeavePolicy();	
		dp.clickDeleteButton();//change as per leave policy 
		String s=dp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully deleted");
	}
	
	@Test(priority=3)
	public void verifyDeletedLeave_SC_39() throws InterruptedException{
		DeleteLeave dl=new DeleteLeave(driver);
		dl.clickMastserLink();
		dl.selectLeavePolicy();
		dl.clickAddLeaves();	//change as per leave policy 
		dl.clickDeleteButton();//change as per add leave
		String s=dl.getMessage();
		Assert.assertEquals(s, "Leave deleted successfully.");
	//	Thread.sleep(4000);
	//	dl.clickMastserLink();
	//	dl.selectLeavePolicy();
	//	dl.clickAddLeaves();
	//	dl.selectLeaveType("Casual Leave (CL)");
	//	dl.clickAddButton();
	} 

	@Test(priority=4)
	public void verifyDeletedLeavePolicy_SC_37() throws InterruptedException{
		DeleteLeavePolicy dp=new DeleteLeavePolicy(driver);
		dp.clickMastserLink();
		dp.selectLeavePolicy();	
		dp.clickDeleteButton();//change as per leave policy 
		String s=dp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully deleted");
	}
	
	@Test(priority=5)
	public void verifyCreatedClonePolicy_SC_270(){
		CloneLeavePolicy lp=new CloneLeavePolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickClonePolicy();
		lp.enterPolicyName("clonepolicy2_"+Utility.getRandNum());
		lp.selectCloneOfDropdown("PolicyNo1");
		lp.clickCreateButton();
		String s=lp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully Cloned");
//		dp.clickMastserLink();
//		dp.selectLeavePolicy();
//		dp.clickDeleteButton();

	}
	@Test(priority=6)
	public void verifyGeneralLink_SC_271() throws Exception {
		GeneralLinkPolicy lp=new GeneralLinkPolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickGeneraLink();
		Thread.sleep(5000);
		lp.clickLeaveDefinitionLink();

	}  

	
	@Test(priority=3)
	public void verifyUpdatedLeaveBeahaviour_SC_272_273(){
		LeaveBehaviourSettings lb=new LeaveBehaviourSettings(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		lb.enterCasualLeaveallowedavaiformonth("2");
		lb.enterCasualLeaveallowedavailforyear("24");
		lb.enterCasualLeavemustbeAvailedinYear("20");
		lb.enterCasualLeavethatcanbeAvailedforInstance("1");
		lb.enterDaysshouldbeAppliedtoAvailtheCasualLeave("1");
		lb.enterPriorDays("4");
		lb.clickBackDate();
		lb.clickAllowHalfDay();
		lb.clickAllowExcessLeave();
		lb.clickConsiderasLOP();
		lb.clickUpdateButton();
		String s=lb.getMessage();
		Assert.assertEquals(s, "Setting was successfully updated.");
	}
	@Test(priority=7)
	public void CheckMaxNoOfCasualLeaveAllowedAvailForMonth_SC_272() throws InterruptedException{
		CheckMaxNoOfCasualLeaveAllowedAvailForMonth lb=new CheckMaxNoOfCasualLeaveAllowedAvailForMonth(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
		lb.clickAvailForMonth("1");
		Thread.sleep(6000);
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(6000);
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("03 July 2018");
		lb.enterToDate("04 July 2018");
		lb.clickApplyButton();
		String abc = lb.getAlertText();
		System.out.println(abc);
		Assert.assertEquals(abc, "home loan can be given only 1 times in this service");
}
	
	@Test(priority=8)                                     
	public void CheckMaxNoOfEarnedLeaveAllowedAvailForYear_SC_273() throws InterruptedException{
		CheckMaxNoOfEarnedLeaveAllowedAvailForYear lb=new CheckMaxNoOfEarnedLeaveAllowedAvailForYear(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
		lb.clickAvailForYear("2");
		Thread.sleep(6000);
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(6000);
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("30 April 2018");
		lb.enterToDate("30 April 2018");
		lb.selectApplyButton();
//		String e=lb.getMessage2();
//		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(5000);
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("29 April 2018");
		lb.enterToDate("29 April 2018");
		lb.selectApplyButton();
//		String t=lb.getMessage2();
//		Assert.assertEquals(t, "Leave applied successfully.");
		Thread.sleep(5000);
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("28 April 2018");
		lb.enterToDate("28 April 2018");
		lb.selectApplyButton();
//		String j=lb.getMessage2();
//		Assert.assertEquals(e, "Cannot apply CL more than 2.0.");
//		Thread.sleep(6000);
//		lb.selectLeaveHistoryTab();
//		lb.selectView1();
//		Thread.sleep(7000);
//		lb.clickDelete();
		
	}
	@Test(enabled=false)
	public void CheckForAllowHalfDayInLeaveModule_SC_275() throws InterruptedException{
		CheckForAllowHalfDayInLeaveModule lb=new CheckForAllowHalfDayInLeaveModule(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
	   lb.clickAvailForMonth("2");
     	Thread.sleep(6000);
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(6000);
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("25 May 2018");
		lb.enterToDate("29 May 2018");
		lb.selectSecondHalf();
		lb.clickApplyButton();
		String e=lb.getMessage2();
		Assert.assertTrue(e.contains("Leave applied"));
		//Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		lb.selectLeaveHistory();
		lb.selectView();
		Thread.sleep(7000);
		lb.clickDeleteButton();
		}
	@Test(enabled=false)
	public void CheckExcessCasualLeaveTakenAsLOP_SC_276() throws InterruptedException{
		CheckExcessCasualLeaveTakenAsLOP lb=new CheckExcessCasualLeaveTakenAsLOP(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
//		lb.clickAvailForMonth("1");
//		Thread.sleep(6000);
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(6000);
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("2 April 2018");
		lb.enterToDate("2 April 2018");
		Thread.sleep(4000);
		lb.clickApplyButton();
		String e=lb.getMessage2();
		Assert.assertTrue(e.contains("Leave applied"));
		//Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		lb.selectLeaveHistory();
		lb.selectView();
		Thread.sleep(7000);
		lb.clickDeleteButton();
		
		
		}
	@Test(enabled=false)
	public void CheckForPrioritySettingsInLeavePolicy_SC_278() throws InterruptedException{
		CheckForPrioritySettingsInLeavePolicy lb=new CheckForPrioritySettingsInLeavePolicy(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
	    lb.clickEarnedLeave();
	    Thread.sleep(3000);
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(6000);
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("23 April 2018");
		lb.enterToDate("23 April 2018");
		Thread.sleep(4000);
		lb.clickApplyButton();
		String e=lb.getMessage2();
		Assert.assertTrue(e.contains("Leave applied"));
		//Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		lb.selectLeaveHistory();
		lb.selectView();
		Thread.sleep(7000);
		lb.clickDeleteButton();
		Thread.sleep(5000);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
	    //lb.clickEarnedLeave();
		lb.clickUpdateButton();
		} 
	  

	@Test(enabled=false)
	public void verifyUpdatedEncashementLeaves_SC_279() throws Exception{
		EncashmentSettings lc=new EncashmentSettings(driver);
		lc.clickMastserLink();
		lc.selectLeavePolicy();
		lc.clickAddLeaves();
		lc.clickSettingsLink();
		lc.clickLapseTab();
		Thread.sleep(2000);
		// lc.clickallowEarnedLeave();
	    Thread.sleep(1000);
	    System.out.println("----start");
	    										//check box should be ticked
		lc.enterEncashedPerInstance("5");    
	lc.enterencashedinYear("9");
	lc.enterNumberofTimesEncachsed("1");
	lc.selectRoundOff("Higher Half Day");
		lc.clickUpdateButton();
		String s=lc.getMessage();
		Assert.assertEquals(s, "Setting was successfully updated.");

	} 
	
	 @Test(priority=17) 
    public void CheckForCarryOverInLeavePolicys_SC_283() throws InterruptedException{
    	 CheckForCarryOverInLeavePolicy lb=new CheckForCarryOverInLeavePolicy(driver);
	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(4000);
	lb.clickLapseTab();
	Thread.sleep(4000);
	lb.clickCarryOver();
	lb.clickUpdateButton();
	String d=lb.getMessage1();
	Assert.assertEquals(d, "Setting was successfully updated.");
	Thread.sleep(6000);
	lb.clickLeaveLink();
	lb.clickAppyLeaveLink();
	lb.clickFilter();
	Thread.sleep(5000);
	lb.clickLoad();
	Thread.sleep(4000);
	lb.clickApplyLeave();
	Thread.sleep(4000);
	lb.clickLeaveSummaryTab();
	Thread.sleep(4000);
	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(4000);
	lb.clickLapseTab();
	lb.clickCarryOver();
	lb.clickUpdateButton();
	String t=lb.getMessage1();
	Assert.assertEquals(t, "Setting was successfully updated.");
	Thread.sleep(6000);
	lb.clickLeaveLink();
	lb.clickAppyLeaveLink();
	lb.clickFilter();
	Thread.sleep(4000);
	lb.clickLoad();
	Thread.sleep(4000);
	lb.clickApplyLeave();
	Thread.sleep(4000);
	lb.clickLeaveSummaryTab();
	Thread.sleep(4000);
}
     @Test(enabled=false) 
     public void CheckForLowerLimitInLeavePolicy_SC_284() throws InterruptedException{
    	 CheckForLowerLimitInLeavePolicy lb=new CheckForLowerLimitInLeavePolicy(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickLowerLimit();
 	lb.enterLowerBoxvalue("5"); 	
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickLeaveLink();
 	lb.clickAppyLeaveLink();
 	lb.clickFilter();
 	Thread.sleep(5000);
 	lb.clickLoad();
 	Thread.sleep(4000);
 	lb.clickApplyLeave();
 	Thread.sleep(4000);
 	lb.clickLeaveSummaryTab();
 	Thread.sleep(5000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickUpdateButton();
 	    
    }
     @Test(enabled=false) 
     public void CheckForUpperLimitInLeavePolicy_SC_285() throws InterruptedException{
    	 CheckForUpperLimitInLeavePolicy lb=new CheckForUpperLimitInLeavePolicy(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	Thread.sleep(4000);
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickUpperLimit();
 	Thread.sleep(3000);
 	lb.enterUpperBoxvalue("10"); 	
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickLeaveLink();
 	lb.clickAppyLeaveLink();
 	lb.clickFilter();
 	Thread.sleep(5000);
 	lb.clickLoad();
 	Thread.sleep(4000);
 	lb.clickApplyLeave();
 	Thread.sleep(4000);
 	lb.clickLeaveSummaryTab();
 	Thread.sleep(5000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickUpdateButton();
}
     @Test(priority=20) 
     public void CheckForLapseUnavailedOnInLeavePolicy_SC_286() throws InterruptedException{
    	 CheckForLapseUnavailedOnInLeavePolicy lb=new CheckForLapseUnavailedOnInLeavePolicy(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickLapseUnavailed();
 	Thread.sleep(3000);
 	lb.enterDropdown("Yearly");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickLeaveLink();
 	lb.clickAppyLeaveLink();
 	lb.clickFilter();
 	Thread.sleep(5000);
 	lb.clickLoad();
 	Thread.sleep(4000);
 	lb.clickApplyLeave();
 	Thread.sleep(4000);
 	lb.clickLeaveSummaryTab();
 	Thread.sleep(5000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickUpdateButton();
}
     @Test(priority=21) 
     public void CheckForLapseExceedingInLeavePolicy_SC_288() throws InterruptedException{
    	 CheckForLapseExceedingInLeavePolicy lb=new CheckForLapseExceedingInLeavePolicy(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickLapseUnavailed();
 	Thread.sleep(3000);
 	lb.enterDropdown("Month");
 	Thread.sleep(3000);
 	lb.enterDropdown1("Feb");
 	lb.clickLapseExceeding("8");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickLapseTab();
 	lb.clickCarryOver();
 	Thread.sleep(4000);
 	lb.clickUpdateButton();
}

	@Test(priority=5)
	public void verifyUpdatedCarryoverLapseLeaves() throws InterruptedException{
		CarryoverLapseSettings ls=new CarryoverLapseSettings(driver);
		ls.clickMastserLink();
		ls.selectLeavePolicy();
		ls.clickAddLeaves();
		ls.clickSettingsLink();
		ls.clickLapseTab();
		Thread.sleep(5000);
		ls.clickCarryOver();
		ls.clickLowerLimit();
	ls.enterLowerLimitValue(""+Utility.getRandNum1());
	ls.clickUpperLimit();
		ls.enterUpperLimitValue(""+Utility.getRandNum2());
	ls.clickUpdateButton();
	Thread.sleep(5000);
		String s=ls.getMessage();
		Assert.assertEquals(s, "Setting was successfully updated.");
		Thread.sleep(3000);
		ls.clickCarryOver();
		ls.clickUpdateButton();
		
	}
	
	@Test(priority=6)
	public void verifyUpdatedHolidayWeeklyLeaves_SC_291() throws Exception{
		HolidayWeeklyoffSettings hs=new HolidayWeeklyoffSettings(driver);
		hs.clickMastserLink();
		hs.selectLeavePolicy();	
		hs.clickAddLeaves();
		hs.clickSettingsLink();
		hs.clickHolidayTab();
		Thread.sleep(5000);
		hs.clickHolidayCasualLeave();
		hs.enterNoofCasualLeaves("3");
		hs.clickTab();
		hs.clickSandwichLeave();
		hs.clickWeeklyoffHoliday();
		Thread.sleep(3000);
		hs.enterNoofCasualLeavesforWeekly("3");
		hs.clickTab();
		hs.clickSuffix();
		hs.clickUpdateButton();
		String s=hs.getMessage();
		Assert.assertEquals(s, "Setting was successfully updated.");
		Thread.sleep(300);
		hs.clickHolidayCasualLeave();
		hs.clickWeeklyoffHoliday();
		hs.clickUpdateButton();
		
	}
	 @Test(priority=22) 
     public void CheckAutoLeaveAllotmentWithPeriodInLeavePolicy_SC_294() throws InterruptedException{
    	 CheckAutoLeaveAllotmentWithPeriodInLeavePolicy lb=new CheckAutoLeaveAllotmentWithPeriodInLeavePolicy(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(5000);
 	lb.SelectAllotType("Period");
 	lb.SelectAllotOn("Pay Days");
 	lb.SelectRoundOff("None");
 	lb.SelectEffectiveFrom("May/2016");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton(); 
} 

	@Test(enabled=false)
	public void verifyUpdatedAutoAllotSettings_SC_299() throws Exception{
		AutoAllotSettings as=new AutoAllotSettings(driver);
		as.clickMastserLink();
		as.selectLeavePolicy();
		as.clickAddLeaves();
		as.clickSettingsLink();
		as.clickAutoAllot();
		Thread.sleep(5000);
		as.clickLeaveAllotment();
		as.selectAllotType("Monthly");
		//as.selectAllotOn("Actual Days");
		as.selectRoundOff("Lower Full Day");
		as.selectEffectiveFrom("Feb/2018");
		as.enterNumberOfDays("2");
		as.clickUpdateButton();
		String s=as.getMessage();
		Assert.assertEquals(s, "Setting was successfully updated.");
		Thread.sleep(4000);
		as.clickLeaveAllotment();
		as.clickUpdateButton();
	}
	
	
	
	     @Test(priority=23) 
     public void CheckAutoLeaveAllotmentWithMonthlyForEvenMonth_SC_301() throws InterruptedException{
    	 CheckAutoLeaveAllotmentWithMonthlyForEvenMonth lb=new CheckAutoLeaveAllotmentWithMonthlyForEvenMonth(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Period");
 	Thread.sleep(4000);
 	lb.SelectAllotOn("Pay Days");
 	//lb.SelectRoundOff("None");
 	lb.SelectEffectiveFrom("Apr/2016");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Apr/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(7000);
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("May/2018");
 	//Thread.sleep(4000);
 	//lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton(); 
}
     @Test(priority=24) 
     public void CheckAutoLeaveAllotmentWithMonthlyForOddMonth_SC_300() throws InterruptedException{
    	 CheckAutoLeaveAllotmentWithMonthlyForOddMonth lb=new CheckAutoLeaveAllotmentWithMonthlyForOddMonth(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Period");
 	lb.SelectAllotOn("Pay Days");
 	//lb.SelectRoundOff("None");
 	lb.SelectEffectiveFrom("Apr/2016");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("Apr/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(7000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton(); 
}

     @Test(priority=25) 
     public void CheckAutoLeaveAllotmentPreviousMonthWithPaydaysForEveryMonth_SC_305() throws InterruptedException{
    	 CheckAutoLeaveAllotmentPreviousMonthWithPaydaysForEveryMonth lb=new CheckAutoLeaveAllotmentPreviousMonthWithPaydaysForEveryMonth(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Monthly");
 	Thread.sleep(4000);
 	lb.SelectAllotOn("Pay Days");
 	lb.SelectEveryMonth("Every Month");
 	lb.SelectEffectiveFrom("May/2017");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("May/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(7000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();    
} 
     @Test(priority=26) 
     public void CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth_SC_306() throws InterruptedException{
    	 CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth lb=new CheckAutoLeaveAllotmentPreviousMonthWithPresentDaysForEveryMonth(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Monthly");
 	Thread.sleep(4000);
 	lb.SelectAllotOn("Present Days");
 	lb.SelectEveryMonth("Every Month");
 	lb.SelectEffectiveFrom("May/2017");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(6000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("new");
 	lb.clickPaymonth("May/2017");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(7000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();    
}
     @Test(priority=27) 
     public void UpdateAutoAllotSettingsMonthly_SC_356() throws InterruptedException{
    	 UpdateAutoAllotSettingsMonthly lb=new UpdateAutoAllotSettingsMonthly(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Monthly");
 	Thread.sleep(5000);
 	lb.SelectAllotOn("Actual Days");
 	lb.SelectAsPerMonth("Current Month");
 	lb.SelectForMonth("Every Month");
 	Thread.sleep(4000);
 	//lb.SelectEveryMonth("Every Month");
 	lb.SelectEffectiveFrom("Feb/2018");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("1");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(4000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();  
}
     @Test(priority=28) 
	public void CheckAutoAllotSettingsMonthly_SC_357() throws InterruptedException{
	    	 CheckAutoAllotSettingsMonthly lb=new CheckAutoAllotSettingsMonthly(driver);
	lb.clickReport();
	lb.clickAdvanceLeaveReport();
	lb.selectLeaveReport("Allotment");
	lb.selectLeavePolicy("new");
	lb.clickFromDate("Jan/2018");
	lb.clickToDate("Apr/2018");
	lb.clickSelectCasualLeave();
	lb.clickGetEmployee();
	Thread.sleep(4000);
	lb.clickLoad();
	Thread.sleep(5000);
	lb.clickEmployee1();
	//lb.clickEmployee2();
	lb.clickGenerateReport();
	Thread.sleep(7000);
}


     @Test(priority=29) 
     public void UpdateAutoAllotSettingsPresentDays_SC_358() throws InterruptedException{
    	 UpdateAutoAllotSettingsPresentDays lb=new UpdateAutoAllotSettingsPresentDays(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Monthly");
 	Thread.sleep(5000);
 	lb.SelectAllotOn("Present Days");
 	lb.SelectAsPerMonth("Current Month");
 	lb.SelectForMonth("Every Month");
 	Thread.sleep(4000);
 	lb.SelectEffectiveFrom("Feb/2018");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("1");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(4000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();  
}  
     @Test(priority=30) 
	public void CheckAutoAllotSettingsForPresentDays_SC_359() throws InterruptedException{
	    	 CheckAutoAllotSettingsForPresentDays lb=new CheckAutoAllotSettingsForPresentDays(driver);
	lb.clickReport();
	lb.clickAdvanceLeaveReport();
	lb.selectLeaveReport("Allotment");
	lb.selectLeavePolicy("new");
	lb.clickFromDate("Feb/2018");
	lb.clickToDate("Apr/2018");
	lb.clickSelectCasualLeave();
	lb.clickGetEmployee();
	Thread.sleep(4000);
	lb.clickLoad();
	Thread.sleep(5000);
	lb.clickEmployee1();
	lb.clickEmployee2();
	lb.clickGenerateReport();
	Thread.sleep(7000);
}
@Test(priority=31) 
     public void UpdateAutoAllotSettingsQuarterly_SC_360() throws InterruptedException{
    	 UpdateAutoAllotSettingsQuarterly lb=new UpdateAutoAllotSettingsQuarterly(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Quarterly");
 	Thread.sleep(5000);
// 	lb.SelectAllotOn("Calendar Year");
// 	lb.SelectAsPerMonth("Current half-year");
// 	lb.SelectForMonth("Every Month");
 	Thread.sleep(4000);
 	lb.SelectEffectiveFrom("Jan/2018");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(4000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();     
}

     @Test(priority=32) 
 	public void CheckAutoAllotSettingsQuarterly_SC_361() throws InterruptedException{
    	 CheckAutoAllotSettingsQuarterly lb=new CheckAutoAllotSettingsQuarterly(driver);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Allotment");
 	lb.selectLeavePolicy("new");
 	lb.clickFromDate("Jan/2018");
 	lb.clickToDate("Mar/2018");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(5000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(7000);
 }
     @Test(priority=33) 
     public void UpdateAutoAllotSettingsHalfYearly_SC_362() throws InterruptedException{
    	 UpdateAutoAllotSettingsHalfYearly lb=new UpdateAutoAllotSettingsHalfYearly(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(4000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(4000);
 	lb.SelectAllotType("Half Yearly");
 	Thread.sleep(5000);
// 	lb.SelectAllotOn("Calendar Year");
// 	lb.SelectAsPerMonth("Current half-year");
// 	lb.SelectForMonth("Every Month");
 	Thread.sleep(4000);
 	lb.SelectEffectiveFrom("Jan/2018");
 	Thread.sleep(5000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(4000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(4000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton();     
}
     @Test(priority=34) 
  	public void CheckAutoAllotSettingsHalfYearly_SC_363() throws InterruptedException{
    	 CheckAutoAllotSettingsHalfYearly lb=new CheckAutoAllotSettingsHalfYearly(driver);
  	lb.clickReport();
  	lb.clickAdvanceLeaveReport();
  	lb.selectLeaveReport("Allotment");
  	lb.selectLeavePolicy("new");
  	lb.clickFromDate("Jan/2018");
  	lb.clickToDate("Apr/2018");
  	lb.clickSelectAllCheckBox();
  	lb.clickGetEmployee();
  	Thread.sleep(4000);
  	lb.clickLoad();
  	Thread.sleep(5000);
  	lb.clickEmployee1();
  	lb.clickEmployee2();
  	lb.clickGenerateReport();
  	Thread.sleep(7000);
}
	@Test(priority=35) 
    public void UpdateAutoAllotSettingsYearly_SC_364() throws InterruptedException{
   	 UpdateAutoAllotSettingsYearly lb=new UpdateAutoAllotSettingsYearly(driver);
	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(4000);
	lb.clickAutoAllotTab();
	Thread.sleep(4000);
	lb.clickLeaveAllotmentBox();
	Thread.sleep(4000);
	lb.SelectAllotType("Yearly");
	Thread.sleep(5000);
//	lb.SelectAllotOn("Calendar Year");
//   lb.SelectAsPerMonth("Current half-year");
//	lb.SelectForMonth("Every Month");
	Thread.sleep(4000);
	lb.SelectEffectiveFrom("Jan/2018");
	Thread.sleep(5000);
	lb.enterNoOfLeaves("2");
	//lb.enterPeriodInDays("20");
	lb.clickUpdateButton();
	String d=lb.getMessage1();
	Assert.assertEquals(d, "Setting was successfully updated.");
	Thread.sleep(4000);
	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(4000);
	lb.clickAutoAllotTab();
	lb.clickLeaveAllotmentBox();
	lb.clickUpdateButton();     
}
	@Test(priority=36) 
  	public void CheckAutoAllotSettingsYearly_SC_365() throws InterruptedException{
    	 CheckAutoAllotSettingsYearly lb=new CheckAutoAllotSettingsYearly(driver);
  	lb.clickReport();
  	lb.clickAdvanceLeaveReport();
  	lb.selectLeaveReport("Allotment");
  	lb.selectLeavePolicy("new");
  	lb.clickFromDate("Jan/2018");
  	lb.clickToDate("Apr/2018");
  	lb.clickSelectCasualLeave();
  	lb.clickGetEmployee();
  	Thread.sleep(4000);
  	lb.clickLoad();
  	Thread.sleep(5000);
  	lb.clickSelectAll();
  	lb.clickGenerateReport();
  	Thread.sleep(7000);
}
	@Test(priority=37) 
  	public void CheckAutoAllotSettingsMonthlyInLeaveSummary_SC_414() throws InterruptedException{
		CheckAutoAllotSettingsMonthlyInLeaveSummary lb=new CheckAutoAllotSettingsMonthlyInLeaveSummary(driver);
		lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	Thread.sleep(4000);
	 	lb.clickLeaveAllotmentBox();
	 	Thread.sleep(4000);
	 	lb.SelectAllotType("Monthly");
	 	Thread.sleep(5000);
	 	lb.SelectAllotOn("Actual Days");
	 	lb.SelectAsPerMonth("Current Month");
	 	lb.SelectForMonth("Every Month");
	 	Thread.sleep(4000);
	 	//lb.SelectEveryMonth("Every Month");
	 	lb.SelectEffectiveFrom("Apr/2018");
	 	Thread.sleep(5000);
	 	lb.enterNoOfLeaves("2");
	 	//lb.enterPeriodInDays("20");
	 	lb.clickUpdateButton();
	 	Thread.sleep(7000);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(5000);
	 	lb.clickLoad();
	 	Thread.sleep(4000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(4000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
	 	lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	lb.clickLeaveAllotmentBox();
	 	lb.clickUpdateButton();  
}
	@Test(priority=38) 
  	public void CheckAutoAllotSettingsQuarterlyInLeaveSummary_SC_415() throws InterruptedException{
		CheckAutoAllotSettingsQuarterlyInLeaveSummary lb=new CheckAutoAllotSettingsQuarterlyInLeaveSummary(driver);
		lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	Thread.sleep(4000);
	 	lb.clickLeaveAllotmentBox();
	 	Thread.sleep(4000);
	 	lb.SelectAllotType("Quarterly");
	 	Thread.sleep(5000);
//	 	lb.SelectAllotOn("Actual Days");
//	 	lb.SelectAsPerMonth("Current Month");
//	 	lb.SelectForMonth("Every Month");
//	 	Thread.sleep(4000);
	 	//lb.SelectEveryMonth("Every Month");
	 	lb.SelectEffectiveFrom("Jan/2018");
	 	Thread.sleep(5000);
	 	lb.enterNoOfLeaves("2");
	 	//lb.enterPeriodInDays("20");
	 	lb.clickUpdateButton();
	 	Thread.sleep(7000);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(5000);
	 	lb.clickLoad();
	 	Thread.sleep(4000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(4000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
	 	lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	lb.clickLeaveAllotmentBox();
	 	lb.clickUpdateButton();  
}
	@Test(priority=39) 
  	public void CheckAutoAllotSettingsHalfYearlyInLeaveSummary_SC_416() throws InterruptedException{
		CheckAutoAllotSettingsHalfYearlyInLeaveSummary lb=new CheckAutoAllotSettingsHalfYearlyInLeaveSummary(driver);
		lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	Thread.sleep(4000);
	 	lb.clickLeaveAllotmentBox();
	 	Thread.sleep(4000);
	 	lb.SelectAllotType("Half Yearly");
	 	Thread.sleep(5000);
//	 	lb.SelectAllotOn("Actual Days");
//	 	lb.SelectAsPerMonth("Current Month");
//	 	lb.SelectForMonth("Every Month");
//	 	Thread.sleep(4000);
	 	//lb.SelectEveryMonth("Every Month");
	 	lb.SelectEffectiveFrom("Jan/2018");
	 	Thread.sleep(5000);
	 	lb.enterNoOfLeaves("2");
	 	//lb.enterPeriodInDays("20");
	 	lb.clickUpdateButton();
	 	Thread.sleep(7000);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(5000);
	 	lb.clickLoad();
	 	Thread.sleep(4000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(4000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
	 	lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	lb.clickLeaveAllotmentBox();
	 	lb.clickUpdateButton();  
}
	@Test(priority=40) 
  	public void CheckAutoAllotSettingsYearlyInLeaveSummary_SC_417() throws InterruptedException {
		CheckAutoAllotSettingsYearlyInLeaveSummary lb=new CheckAutoAllotSettingsYearlyInLeaveSummary(driver);
		lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	Thread.sleep(4000);
	 	lb.clickLeaveAllotmentBox();
	 	Thread.sleep(4000);
	 	lb.SelectAllotType("Yearly");
	 	Thread.sleep(5000);
//	 	lb.SelectAllotOn("Actual Days");
//	 	lb.SelectAsPerMonth("Current Month");
//	 	lb.SelectForMonth("Every Month");
//	 	Thread.sleep(4000);
	 	//lb.SelectEveryMonth("Every Month");
	 	lb.SelectEffectiveFrom("Jan/2018");
	 	Thread.sleep(5000);
	 	lb.enterNoOfLeaves("2");
	 	//lb.enterPeriodInDays("20");
	 	lb.clickUpdateButton();
	 	Thread.sleep(7000);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(5000);
	 	lb.clickLoad();
	 	Thread.sleep(4000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(4000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
	 	lb.clickMastserLink();
	 	lb.selectLeavePolicy();
	 	lb.clickAddLeaves();
	 	lb.clickSettingsLink();
	 	Thread.sleep(4000);
	 	lb.clickAutoAllotTab();
	 	lb.clickLeaveAllotmentBox();
	 	lb.clickUpdateButton();  
}
	@Test(priority=41)
	public void CheckPriordaystoapplycasualleave_SC_310() throws InterruptedException{
		CheckPriordaystoapplycasualleave pd=new CheckPriordaystoapplycasualleave(driver);
		pd.clickMastserLink();
		pd.selectLeavePolicy();
		pd.clickAddLeaves();
		pd.clickSettingsLink();
		pd.enterpriordays("3");
		pd.clickUpdateButton();
		String a=pd.getMessage1();
		Assert.assertEquals(a, "Setting was successfully updated.");
		Thread.sleep(3000);
		pd.clickLeaveLink();
		pd.clickAppyLeaveLink();
		Thread.sleep(500);
		pd.clickFilter();
		Thread.sleep(2000);
		pd.clickLoad();
		Thread.sleep(2000);
		pd.clickApplyLeave();
		pd.selectLeaveType("Casual Leave (CL)");
		pd.enterFromDate("10 July 2018");
		pd.enterToDate("13 July 2018");
		pd.selectApplyButton();
		String e=pd.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
	
	}
	@Test(priority=41)
	public void CheckAllowHalfaday_SC_309() throws InterruptedException{
		CheckAllowHalfaday pd=new CheckAllowHalfaday(driver);
		pd.clickMastserLink();
		pd.selectLeavePolicy();
		pd.clickAddLeaves();
		pd.clickSettingsLink();
		pd.clickonallowhalfday();
		pd.clickUpdateButton();
		String a=pd.getMessage1();
		Assert.assertEquals(a, "Setting was successfully updated.");
		Thread.sleep(3000);
		pd.clickLeaveLink();
		pd.clickAppyLeaveLink();
		Thread.sleep(500);
		pd.clickFilter();
		Thread.sleep(2000);
		pd.clickLoad();
		Thread.sleep(2000);
		pd.clickApplyLeave();
		pd.selectLeaveType("Casual Leave (CL)");
		pd.enterFromDate("20 July 2018");
		pd.enterToDate("20 July 2018");
		Thread.sleep(3000);
		pd.disablefirsthalf();
		Thread.sleep(2000);
		pd.selectApplyButton();
		String e=pd.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
	
	}
	@Test(priority=42)
	public void CheckforMaxCasualLeavethatcanbeavailedforinstance_SC_308() throws InterruptedException{
		CheckforMaxCasualLeavethatcanbeavailedforinstance mc=new CheckforMaxCasualLeavethatcanbeavailedforinstance(driver);
		mc.clickMastserLink();
		mc.selectLeavePolicy();
		mc.clickAddLeaves();
		mc.clickSettingsLink();
		mc.entermaxnoofcasualleave("1");
		mc.clickUpdateButton();
		String a=mc.getMessage1();
		Assert.assertEquals(a, "Setting was successfully updated.");
		Thread.sleep(3000);
		mc.clickLeaveLink();
		mc.clickAppyLeaveLink();
		Thread.sleep(500);
		mc.clickFilter();
		Thread.sleep(2000);
		mc.clickLoad();
		Thread.sleep(2000);
		mc.clickApplyLeave();
		mc.selectLeaveType("Casual Leave (CL)");
		mc.enterFromDate("20 July 2018");
		mc.enterToDate("20 July 2018");
		Thread.sleep(2000);
		mc.selectApplyButton();
		String e=mc.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(4000);
		mc.selectLeaveType("Casual Leave (CL)");
		mc.enterFromDate("23 July 2018");
		mc.enterToDate("25 July 2018");
		Thread.sleep(2000);
		mc.selectApplyButton();
	}*/
/*	@Test(priority=43) not running
	public void CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave_SC_308() throws InterruptedException{
		CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave mc=new CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave(driver);
		mc.clickMastserLink();
		mc.selectLeavePolicy();
		mc.clickAddLeaves();
		mc.clickSettingsLink();
		mc.entermindaystoapplycasualleave("2");
		mc.clickUpdateButton();
		String a=mc.getMessage1();
		Assert.assertEquals(a, "Setting was successfully updated.");
		Thread.sleep(3000);
		mc.clickLeaveLink();
		mc.clickAppyLeaveLink();
		Thread.sleep(500);
		mc.clickFilter();
		Thread.sleep(2000);
		mc.clickLoad();
		Thread.sleep(2000);
		mc.clickApplyLeave();
		mc.selectLeaveType("Casual Leave (CL)");
		mc.enterFromDate("20 July 2018");
		mc.enterToDate("21 July 2018");
		Thread.sleep(2000);
		mc.selectApplyButton();
		String e=mc.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(4000);
		mc.selectLeaveType("Casual Leave (CL)");
		mc.enterFromDate("23 July 2018");
		mc.enterToDate("23 July 2018");
		Thread.sleep(2000);
		mc.selectApplyButton();
		String abc = mc.getAlertText();
		System.out.println(abc);
		Assert.assertEquals(abc, "Minimum 2.0 CL should be applied to avail CL.");
		Thread.sleep(3000);
		mc.selectLeaveType("Casual Leave (CL)");
		mc.enterFromDate("25 July 2018");
		mc.enterToDate("27 July 2018");
		Thread.sleep(2000);
		mc.selectApplyButton();
		String c=mc.getMessage2();
		Assert.assertEquals(c, "Leave applied successfully.");
	}*/
	@Test(priority=44)
	public void  CheckforMinEarnedLeavecanbeEncashedperinstance_SC_280() throws InterruptedException{
		CheckforMinEarnedLeavecanbeEncashedperinstance el=new CheckforMinEarnedLeavecanbeEncashedperinstance(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(500);
		el.clickonsettings();
		Thread.sleep(500);
		el.clickonlapsecarry();
		Thread.sleep(500);
		el.allowleavetobeencashed();
		Thread.sleep(500);
		el.enterminleaveencash("2");
		Thread.sleep(500);
		el.clickonupdate();
		String a=el.successfulmessage();
		Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(2000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Aug/2018");
		Thread.sleep(500);
		el.selectleave("Earned Leave");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(500);	
		el.clickonsave();
		String s=el.getalertmessage();
		Assert.assertEquals(s, "No of encashed leave is lesser than the min leaves to be encashed as per setting.");
	}
	@Test(priority=45)
	public void  CheckforMaxEarnedLeavecanbeEncashedinayear_SC_281() throws InterruptedException{
		CheckforMaxEarnedLeavecanbeEncashedinayear el=new CheckforMaxEarnedLeavecanbeEncashedinayear(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(500);
		el.clickonsettings();
		Thread.sleep(500);
		el.clickonlapsecarry();
		Thread.sleep(500);
		//el.allowleavetobeencashed();
		Thread.sleep(500);
		el.enterminleaveencash("1");
		Thread.sleep(500);
		el.entermaxleaveencash("2");
		el.clickonupdate();
		String a=el.successfulmessage();
		Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(2000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Aug/2018");
		Thread.sleep(500);
		el.selectleave("Earned Leave");
		Thread.sleep(1000);
		el.enternoofleaves("3");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(500);	
		el.clickonsave();
		String s=el.getalertmessage();
		Assert.assertEquals(s, "You can encash upto 2.0 number of leaves");
	}
	@Test(priority=46)
	public void  CheckforNooftimesEarnedLeavecanbeEncashedinayear_SC_282() throws InterruptedException{
		CheckforNooftimesEarnedLeavecanbeEncashedinayear el=new CheckforNooftimesEarnedLeavecanbeEncashedinayear(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(500);
		el.clickonsettings();
		Thread.sleep(500);
		el.clickonlapsecarry();
		Thread.sleep(500);
	//	el.allowleavetobeencashed();
		Thread.sleep(500);
		el.enterminleaveencash("1");
		Thread.sleep(500);
		el.entermaxleaveencash("2");
		Thread.sleep(500);
		el.enternooftimesleavecanbeencash("1");
		el.clickonupdate();
		String a=el.successfulmessage1();
		Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(2000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Aug/2018");
		Thread.sleep(500);
		el.selectleave("Earned Leave");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(500);	
		el.clickonsave();
		String s=el.successfulmessage2();
		Assert.assertEquals(s, "Leave encashment successfully created.");
		Thread.sleep(2000);
		/*el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.clickonview();*/
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Aug/2018");
		Thread.sleep(500);
		el.selectleave("Earned Leave");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(500);	
		el.clickonsave();
		String p=el.getalertmessage();
		Assert.assertEquals(p, "Encash limit exceeded in a year.");
	}
	
	
}