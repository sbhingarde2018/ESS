package com.spp.scripts;

//import java.awt.event.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddLeaves;
import com.spp.pages.AllotAvailDateSettingsDefaultSettingPage;
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
//import com.spp.pages.CheckMaxNoOfCasualLeaveAllowedAvailForMonth;
//import com.spp.pages.CheckMaxNoOfEarnedLeaveAllowedAvailForYear;
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
import com.spp.pages.ToCheckIfLeaveCanBeAppliedSuccesfullyForFutureMonthsPage;
import com.spp.pages.ToCheckNoofCasualLeaveDayseitherPrefixedorSuffixedtoHolidaytomarkH;
import com.spp.pages.ToCheckifappliedCasualLeavehasWeeklyOffconsiderasCasualLeavewithprefix;
import com.spp.pages.UpdateAutoAllotSettingsHalfYearly;
import com.spp.pages.UpdateAutoAllotSettingsMonthly;
import com.spp.pages.UpdateAutoAllotSettingsPresentDays;
import com.spp.pages.UpdateAutoAllotSettingsQuarterly;
import com.spp.pages.UpdateAutoAllotSettingsYearly;
import com.spp.pages.UpdateLeavePolicy;

public class LeavePolicy extends BaseTest {

	@Test(priority=0)
	public void verifyCreatedLeavePolicy_SC_35(){
		CreateLeavePolicy lp=new CreateLeavePolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickAddLeavePolicy();
		lp.enterPolicyName("LeavePolicyMaster");
		lp.selectLeaveType("Leave Register");
		lp.enterRemarks("No Remarks");
		lp.clickCreateLeavePolicy();
		String s=lp.getmessage();
		Assert.assertEquals(s, "Leave policy master successfully created");
	}
	
	@Test(priority=1)
	public void verifyUpdatedLeavePolicy_SC_36() throws Exception{
		UpdateLeavePolicy lp=new UpdateLeavePolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickEditLink();
		lp.enterPolicyName("LeavePolicyTest");
		lp.enterRemarks("Not applicable");
		lp.clickUpdateLeavePolicy();
		String s=lp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully updated");
	} 	
	@Test(priority=2)
	public void verifyDeletedLeavePolicy_SC_37() throws InterruptedException{
		DeleteLeavePolicy dp=new DeleteLeavePolicy(driver);
		dp.clickMastserLink();
		dp.selectLeavePolicy();	
		dp.clickDeleteButton();//change as per leave policy 
		String s=dp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully deleted");
	}
	@Test(priority=3)
	public void verifyAddedLeaves_SC_38() throws Exception{
		AddLeaves al=new AddLeaves(driver);
		al.clickMastserLink();
		al.selectLeavePolicy();
		al.clickAddLeavePolicy();
		al.enterPolicyName("LeavePolicyTest");
		//al.selectLeaveType("Leave Register");
		al.enterRemarks("No Remarks");
		al.clickCreateLeavePolicy();
		Thread.sleep(3000);
		//al.clickMastserLink();
		//al.selectLeavePolicy();
		al.clickAddLeaves();	//change as per leave policy 
		al.selectLeaveType("Casual Leave (CL)");
		al.clickAddButton();
		String s=al.getMessage();
		Assert.assertEquals(s, "Leave policy setting was successfully created.");
	}
		
	@Test(priority=4)
	public void verifyDeletedLeave_SC_39() throws InterruptedException{
		DeleteLeave dl=new DeleteLeave(driver);
		dl.clickMastserLink();
		dl.selectLeavePolicy();
		dl.clickAddLeaves();	//change as per leave policy 
		dl.clickDeleteButton();//change as per add leave
		String s=dl.getMessage();
		Assert.assertEquals(s, "Leave deleted successfully.");		
	}
		
	
		
	@Test(priority=5)
	public void verifyCreatedClonePolicy_SC_270(){
		CloneLeavePolicy lp=new CloneLeavePolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickClonePolicy();
		lp.enterPolicyName("ClonePolicy1");
		lp.selectCloneOfDropdown("Default");
		lp.clickCreateButton();
		String s=lp.getMessage();
		Assert.assertEquals(s, "Leave policy master successfully Cloned");
		lp.clickDelete();
	}
	
	@Test(priority=6)
	public void verifyGeneralLink_SC_271() throws Exception {
		GeneralLinkPolicy lp=new GeneralLinkPolicy(driver);
		lp.clickMastserLink();
		lp.selectLeavePolicy();
		lp.clickGeneraLink();
		Thread.sleep(5000);
		lp.clickLeaveDefinitionLink();
		System.out.println("Leave Definition Page is Displayed");
	}

	@Test(priority=7)
	public void verifyUpdatedLeaveBeahaviour_SC_272() throws InterruptedException{
		LeaveBehaviourSettings lb=new LeaveBehaviourSettings(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		lb.enterCasualLeaveallowedavaiformonth("1");
		lb.clickUpdateButton();
		Thread.sleep(2000);
		lb.Leavemaster();
		lb.ApplyLeavemodule();
		lb.ClickonFilter();
		lb.resizeWindow();
		Thread.sleep(3000);
		lb.ClickOnLOAD();
		Thread.sleep(3000);
		lb.exitFullscreen();
		lb.ClickOnApplyLeave();
		Thread.sleep(2000);
		lb.SelectLeave("Casual Leave (CL)");
		lb.EnterFromDate("21 December 2019");
		lb.EnterToDate("25 December 2019");
		Thread.sleep(3000);
		String alert = lb.getalertMessage();
		Assert.assertEquals(alert, "Cannot apply CL more than 1.0 in a month.");
		//lb.ClickLeaveHistory();
		Thread.sleep(2000);
		//lb.EnterHistoryFromDate("01 August 2014");
		//lb.ClickSearchButton();
		//Thread.sleep(3000);
		//lb.ClickView();
		//Thread.sleep(4000);
		//lb.ClickDeleteButton();	
		//Thread.sleep(3000);
	}

	@Test(priority=8)                  
	public void CheckMaxNoOfEarnedLeaveAllowedAvailForYear_SC_273() throws InterruptedException{
		LeaveBehaviourSettings lb=new LeaveBehaviourSettings(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(2000);
		lb.enterCasualLeaveallowedavaiformonth("2");
		lb.enterCasualLeaveallowedavailforyear("2");
		lb.clickUpdateButton();
		lb.Leavemaster();
		lb.ApplyLeavemodule();
		lb.ClickonFilter();
		lb.resizeWindow();
		Thread.sleep(3000);
		lb.ClickOnLOAD();
		lb.exitFullscreen();
		lb.ClickOnApplyLeave();
		Thread.sleep(2000);
		lb.SelectLeave("Casual Leave (CL)");
		lb.EnterFromDate("08 January 2020");
		Thread.sleep(2000);
		lb.EnterToDate("08 January 2020");
		Thread.sleep(2000);
		lb.clickapply();
		Thread.sleep(8000);
		lb.SelectLeave("Casual Leave (CL)");
		lb.EnterFromDate("12 February 2020");
		Thread.sleep(2000);
		lb.EnterToDate("12 February 2020");
		Thread.sleep(2000);
		lb.clickapply();
		Thread.sleep(8000);
		lb.SelectLeave("Casual Leave (CL)");
		lb.EnterFromDate("10 March 2020");
		Thread.sleep(2000);
		lb.EnterToDate("10 March 2020");
		Thread.sleep(2000);
		//lb.clickapply();
		Thread.sleep(3000);
		String alert = lb.getalertMessage();
		Assert.assertEquals(alert, "Cannot apply CL more than 2.0 in a year.");
		Thread.sleep(2000);
		lb.ClickLeaveHistory();
		Thread.sleep(2000);
		lb.EnterHistoryFromDate("01 August 2014");
		lb.ClickSearchButton();
		Thread.sleep(3000);
		lb.ClickView();
		Thread.sleep(3000);
		lb.ClickDeleteButton();	
		Thread.sleep(7000);
		lb.ClickView();
		Thread.sleep(3000);
		lb.ClickDeleteButton();	
		
	}
	@Test(priority=9)
	public void CheckForAllowHalfDayInLeaveModule_SC_275() throws InterruptedException{
		CheckForAllowHalfDayInLeaveModule lb=new CheckForAllowHalfDayInLeaveModule(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(2000);
		lb.enterCasualLeaveallowedavaiformonth("2");
		lb.enterCasualLeaveallowedavailforyear("2");
		lb.clickAllowHalfDay();
		lb.clickUpdateButton();
		//String d=lb.getMessage1();
		//Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(3000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		lb.resizeWindow();
		Thread.sleep(3000);
		lb.clickLoad();
		Thread.sleep(3000);
		lb.exitFullscreen();
		lb.ClickOnApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("10 March 2020");
		lb.enterToDate("10 March 2020");
		Thread.sleep(2000);
		lb.selectSecondHalf();
		lb.clickApplyButton();
		String e=lb.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		lb.clickLeaveHistory();
		lb.enterHistoryToDate("01 August 2014");
		lb.clickSearchButton();
		lb.selectView();
		Thread.sleep(3000);
		lb.clickDeleteButton();
		Thread.sleep(3000);
	}
	
	@Test(priority=10)
	public void CheckExcessCasualLeaveTakenAsLOP_SC_276() throws InterruptedException{
		CheckExcessCasualLeaveTakenAsLOP lb=new CheckExcessCasualLeaveTakenAsLOP(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
		lb.clickAvailForMonth("2");
		//lb.clickAvailForYear();
		lb.clickAllowAccessCasual();
		lb.clickConsiderAccessCasual();
		lb.clickUpdateButton();
		//String d=lb.getMessage1();
		//Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(5000);
		lb.clickLeaveLink();
		lb.clickAppyLeaveLink();
		lb.clickFilter();
		lb.resizeWindow();
		Thread.sleep(5000);
		lb.clickLoad();
		Thread.sleep(4000);
		lb.exitFullscreen();
		lb.clickApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("10 March 2020");
		lb.enterToDate("11 March 2020");
		Thread.sleep(4000);
		lb.clickApplyButton();
		String e=lb.getMessage2();
		//Assert.assertTrue(e.contains("Leave applied"));
		Assert.assertEquals(e, "Leave applied successfully.");
		lb.selectLeaveHistory();
		Thread.sleep(3000);
		lb.enterHistoryToDate("01 August 2014");
		lb.clickSearchButton();
		Thread.sleep(3000);
		lb.selectView();
		Thread.sleep(5000);
		lb.clickDeleteButton();
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void CheckForPrioritySettingsInLeavePolicy_SC_278() throws InterruptedException{
		CheckForPrioritySettingsInLeavePolicy lb=new CheckForPrioritySettingsInLeavePolicy(driver);
		lb.clickMastserLink();
		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(4000);
	    lb.clickEarnedLeave();
	    lb.clickEarnedLeave();
	    lb.clickCompensatoryOff();
	  //  lb.clickLOP();
		lb.clickUpdateButton();
		String d=lb.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		lb.clickLeaveLink();
		lb.clickApplyLeave();
		lb.clickFilter();
		lb.resizeWindow();
		Thread.sleep(3000);
		lb.clickLoad();
		Thread.sleep(3000);
		lb.exitFullscreen();
		lb.ClickonApplyLeave();
		lb.selectLeaveType("Casual Leave (CL)");
		lb.enterFromDate("10 March 2020");
		lb.enterToDate("11 March 2020");
		Thread.sleep(4000);
		lb.clickApplyButton();
		String e=lb.getMessage2();
		//Assert.assertTrue(e.contains("Leave applied"));
		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		lb.selectLeaveHistory();
		Thread.sleep(3000);
		lb.enterHistoryToDate("01 August 2014");
		lb.clickSearchButton();
		Thread.sleep(3000);
		lb.clickView();
		Thread.sleep(5000);
		lb.clickDeleteButton();
		Thread.sleep(5000);
	} 
	
	@Test(priority=12)
	public void verifyUpdatedEncashementLeaves_SC_279() throws Exception {
		EncashmentSettings lc=new EncashmentSettings(driver);
		lc.clickMastserLink();
		lc.selectLeavePolicy();
		lc.clickAddLeaves();
		lc.clickSettingsLink();
		lc.clickLapseTab();
		//Thread.sleep(2000);
		//lc.clickallowEarnedLeave();
	    //Thread.sleep(1000);
	    //System.out.println("----start");
	    										//check box should be ticked
		//lc.enterEncashedPerInstance("5");    
		//lc.enterencashedinYear("9");
		//lc.enterNumberofTimesEncachsed("1");
		//lc.selectRoundOff("Higher Half Day");
		//lc.clickUpdateButton();
		//String s=lc.getMessage();
		//Assert.assertEquals(s, "Setting was successfully updated.");
		lc.clickLeaveLink();
		lc.clickLeaveEncashment();
		lc.clickFilter();
		lc.resizeWindow();
		Thread.sleep(5000);
		lc.clickLoad();
		Thread.sleep(6000);
		lc.exitFullscreen();
		lc.clickView();
		lc.clickAddNewLeaveEnc();
		lc.clickSelectLeave();
		Thread.sleep(3000);
	} 
	
	@Test(priority=13)
	public void  CheckforMinEarnedLeavecanbeEncashedperinstance_SC_280() throws InterruptedException{
		CheckforMinEarnedLeavecanbeEncashedperinstance el=new CheckforMinEarnedLeavecanbeEncashedperinstance(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(2000);
		el.clickonsettings();
		Thread.sleep(2000);
		el.clickonlapsecarry();
		Thread.sleep(2000);
		el.allowleavetobeencashed();
		//Thread.sleep(500);
		el.enterminleaveencash("2");
		Thread.sleep(2000);
		el.clickonupdate();
		//String a=el.successfulmessage();
		//Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(7000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		el.resizeWindow();
		Thread.sleep(3000);
		el.clickonload();
		Thread.sleep(3000);
		el.exitFullscreen();
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Dec/2020");
		Thread.sleep(500);
		el.selectleave("Casual Leave (CL)");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(500);	
		el.clickonsave();
		Thread.sleep(5000);	
		String s=el.getalertmessage();
		Assert.assertEquals(s, "No of encashed leave is lesser than the min leaves to be encashed as per setting.");
	}
	
	@Test(priority=14)
	public void  CheckforMaxEarnedLeavecanbeEncashedinayear_SC_281() throws InterruptedException{
		CheckforMaxEarnedLeavecanbeEncashedinayear el=new CheckforMaxEarnedLeavecanbeEncashedinayear(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(5000);
		el.clickonsettings();
		Thread.sleep(5000);
		el.clickonlapsecarry();
		Thread.sleep(5000);
		//el.allowleavetobeencashed();
		Thread.sleep(5000);
		el.enterminleaveencash("1");
		Thread.sleep(5000);
		el.entermaxleaveencash("2");
		el.clickonupdate();
		String a=el.successfulmessage();
		Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(2000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		el.resizeWindow();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.exitFullscreen();
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Dec/2020");
		Thread.sleep(5000);
		el.selectleave("Casual Leave (CL)");
		Thread.sleep(1000);
		el.enternoofleaves("3");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(5000);	
		el.clickonsave();
		Thread.sleep(5000);	
		//String s=el.getalertmessage();
		//Assert.assertEquals(s, "No of encashed leave is greater than the max leaves to be encashed as per setting.");
	}
	
	@Test(priority=15)
	public void  CheckforNooftimesEarnedLeavecanbeEncashedinayear_SC_282() throws InterruptedException{
		CheckforNooftimesEarnedLeavecanbeEncashedinayear el=new CheckforNooftimesEarnedLeavecanbeEncashedinayear(driver);
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(2000);
		el.clickonsettings();
		Thread.sleep(2000);
		el.clickonlapsecarry();
		Thread.sleep(5000);
	//	el.allowleavetobeencashed();
		Thread.sleep(5000);
		el.enterminleaveencash("1");
		Thread.sleep(5000);
		el.entermaxleaveencash("2");
		Thread.sleep(5000);
		el.enternooftimesleavecanbeencash("1");
		el.clickonupdate();
		String a=el.successfulmessage1();
		Assert.assertEquals(a,"Setting was successfully updated.");
		Thread.sleep(2000);
		el.clickonleave();
		el.clickonleaveencashment();
		el.clickonfilter();
		el.resizeWindow();
		Thread.sleep(2000);
		el.clickonload();
		Thread.sleep(3000);
		el.exitFullscreen();
		el.clickonview();
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Dec/2020");
		Thread.sleep(5000);
		el.selectleave("Casual Leave (CL)");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(500);
		el.checkshowinsalary();
		Thread.sleep(5000);	
		el.clickonsave();
		String s=el.successfulmessage2();
		Assert.assertEquals(s, "Leave encashment successfully created.");
		Thread.sleep(2000);
		el.addnewleaveencashment();
		Thread.sleep(1000);
		el.selectmonth("Dec/2020");
		Thread.sleep(5000);
		el.selectleave("Casual Leave (CL)");
		Thread.sleep(1000);
		el.enternoofleaves("1");
		Thread.sleep(1000);
		el.enterunitrate("500");
		Thread.sleep(5000);
		el.checkshowinsalary();
		Thread.sleep(5000);	
		el.clickonsave();
		Thread.sleep(5000);	
		String p=el.getalertmessage();
		Assert.assertEquals(p, "Encash limit exceeded in a year.");
		el.ClickNavigateBack();
		el.ClickDelete();
		el.clickonmaster();
		el.clickonleavepolicy();
		el.clickonaddeaves();
		Thread.sleep(2000);
		el.clickonsettings();
		Thread.sleep(2000);
		el.clickonlapsecarry();
		Thread.sleep(2000);
		el.clickonupdate();
    	Thread.sleep(5000);
	}

	@Test(priority=16) 
    public void CheckForCarryOverInLeavePolicys_SC_283() throws InterruptedException{
    CheckForCarryOverInLeavePolicy lb=new CheckForCarryOverInLeavePolicy(driver);
    	lb.clickMastserLink();
    	lb.selectLeavePolicy();
    	lb.clickAddLeaves();
    	Thread.sleep(3000);
    	lb.clickSettingsLink();
    	Thread.sleep(2000);
    	lb.clickLapseTab();
    	Thread.sleep(3000);
    	lb.clickCarryOver();
    	//lb.clickCarryOver();
    	lb.clickUpdateButton();
    	Thread.sleep(9000);
    	String d=lb.getMessage1();
    	Assert.assertEquals(d, "Setting was successfully updated.");
    	lb.clickLeaveLink();
    	lb.clickAppyLeaveLink();
    	lb.resizeWindow();
    	lb.clickFilter();
    	Thread.sleep(3000);
    	lb.clickLoad();
    	Thread.sleep(4000);
    	lb.exitFullscreen();
    	Thread.sleep(3000);
    	lb.clickApplyLeave();
    	Thread.sleep(2000);
    	lb.clickLeaveSummaryTab();
    	Thread.sleep(2000);
    	//String a=lb.getCLBalance();
    	//Assert.assertEquals(a, "4.04");
    	lb.clickMastserLink();
    	lb.selectLeavePolicy();
    	lb.clickAddLeaves();
    	lb.clickSettingsLink();
    	Thread.sleep(4000);
    	lb.clickLapseTab();
    	lb.clickCarryOver();
    	lb.clickUpdateButton();
    	Thread.sleep(9000);
    	//String t=lb.getMessage1();
    	//Assert.assertEquals(t, "Setting was successfully updated.");
    	//Thread.sleep(6000);
    	lb.clickLeaveLink();
    	lb.clickAppyLeaveLink();
    	lb.clickFilter();
    	lb.resizeWindow();
    	Thread.sleep(4000);
    	lb.clickLoad();
    	Thread.sleep(3000);
    	lb.exitFullscreen();
    	Thread.sleep(3000);
    	lb.clickApplyLeave();
    	Thread.sleep(4000);
    	lb.clickLeaveSummaryTab();
    	Thread.sleep(4000);
    	//String b=lb.getCLBalance();
    	//Assert.assertEquals(b, "0.17");
    }
	
	@Test(priority=17) 
    public void CheckForLowerLimitInLeavePolicy_SC_284() throws InterruptedException{
   	CheckForLowerLimitInLeavePolicy lb=new CheckForLowerLimitInLeavePolicy(driver);
   		lb.clickMastserLink();
   		lb.selectLeavePolicy();
   		lb.clickAddLeaves();
   		lb.clickSettingsLink();
   		lb.clickLapseTab();
   		lb.clickCarryOver();
   		Thread.sleep(4000);
   		//lb.clickLowerLimit();
   		lb.clickLowerLimit();
   		lb.enterLowerBoxvalue("1");	
   		lb.clickUpdateButton();
   		//String d=lb.getMessage1();
   		//Assert.assertEquals(d, "Setting was successfully updated.");
   		Thread.sleep(8000);
   		Thread.sleep(5000);
   		lb.clickLeaveLink();
   		lb.clickAppyLeaveLink();
   		lb.resizeWindow();
   		Thread.sleep(2000);
   		lb.clickFilter();
   		Thread.sleep(3000);
   		lb.clickLoad();
   		Thread.sleep(3000);
   		lb.exitFullscreen();
   		Thread.sleep(4000);
   		lb.clickApplyLeave();
   		Thread.sleep(4000);
   		lb.clickLeaveSummaryTab();
   		Thread.sleep(5000);
 
   		lb.clickReport();
   		lb.clickAdvanceLeaveReport();
   		lb.selectLeaveReport("Summary");
   		lb.selectLeavePolicy("ClonePolicy");
   		lb.clickPaymonth("Dec/2020");
   		lb.clickSelectAllCheckBox();
   		lb.clickGetEmployee();
   		lb.resizeWindow();
   		Thread.sleep(2000);
   		lb.clickLoad();
   		Thread.sleep(3000);
   		lb.exitFullscreen();
   		Thread.sleep(3000);
   		lb.clickEmployee1();
   		lb.clickEmployee2();
   		lb.clickGenerateReport();
   		Thread.sleep(3000);
   		lb.clickMastserLink();
   		lb.selectLeavePolicy();
		lb.clickAddLeaves();
		lb.clickSettingsLink();
		Thread.sleep(3000);
		lb.clickLapseTab();
		lb.clickCarryOver();
		Thread.sleep(2000);
		lb.clickUpdateButton();
		Thread.sleep(7000);	
		Thread.sleep(8000);
	}
	
	@Test(priority=18) 
    public void CheckForUpperLimitInLeavePolicy_SC_285() throws InterruptedException{
   	CheckForUpperLimitInLeavePolicy lb=new CheckForUpperLimitInLeavePolicy(driver);
   		lb.clickMastserLink();
   		lb.selectLeavePolicy();
   		lb.clickAddLeaves();
   		lb.clickSettingsLink();
   		Thread.sleep(2000);
   		lb.clickLapseTab();
   		Thread.sleep(2000);
   		lb.clickCarryOver();
   		Thread.sleep(2000);
   		lb.clickUpperLimit();
   		Thread.sleep(9000);
   		lb.enterUpperBoxvalue("1"); 	
   		lb.clickUpdateButton();
   		//String d=lb.getMessage1();
   		//Assert.assertEquals(d, "Setting was successfully updated.");
   		Thread.sleep(8000);
   		lb.clickLeaveLink();
   		lb.clickAppyLeaveLink();
   		lb.resizeWindow();
   		lb.clickFilter();
   		lb.resizeWindow();
   		Thread.sleep(3000);
   		lb.clickLoad();
   		Thread.sleep(3000);
   		lb.exitFullscreen();
   		Thread.sleep(4000);
   		lb.clickApplyLeave();
   		Thread.sleep(4000);
   		lb.clickLeaveSummaryTab();
   		Thread.sleep(5000);
   		lb.clickReport();
   		lb.clickAdvanceLeaveReport();
   		lb.selectLeaveReport("Summary");
   		lb.selectLeavePolicy("ClonePolicy");
   		lb.clickPaymonth("Dec/2020");
   		lb.clickSelectAllCheckBox();
   		lb.clickGetEmployee();
   		lb.resizeWindow();
   		Thread.sleep(3000);
   		lb.clickLoad();
   		Thread.sleep(3000);
   		lb.exitFullscreen();
   		Thread.sleep(3000);
   		lb.clickEmployee1();
   		lb.clickEmployee2();
   		lb.clickGenerateReport();
   		Thread.sleep(2000);
   		lb.clickMastserLink();
   		lb.selectLeavePolicy();
   		lb.clickAddLeaves();
   		lb.clickSettingsLink();
   		Thread.sleep(2000);
   		lb.clickLapseTab();
   		lb.clickCarryOver();
   		Thread.sleep(2000);
   		lb.clickUpdateButton();
   		
   		Thread.sleep(8000);
	}
	 
     @Test(priority=19) 
     public void CheckForLapseUnavailedOnInLeavePolicy_SC_286() throws InterruptedException{
     CheckForLapseUnavailedOnInLeavePolicy lb=new CheckForLapseUnavailedOnInLeavePolicy(driver);
 		lb.clickMastserLink();
 		lb.selectLeavePolicy();
 		lb.clickAddLeaves();
 		lb.clickSettingsLink();
 		Thread.sleep(2000);
 		lb.clickLapseTab();
 		lb.clickCarryOver();
 		Thread.sleep(2000);
 		lb.clickLapseUnavailed();
 		Thread.sleep(3000);
 		lb.enterDropdown("Yearly");
 		lb.clickUpdateButton();
 		//String d=lb.getMessage1();
 		//Assert.assertEquals(d, "Setting was successfully updated.");
 		Thread.sleep(9000);
 		lb.clickLeaveLink();
 		lb.clickAppyLeaveLink();
 		lb.clickFilter();
 		lb.resizeWindow();
 		Thread.sleep(3000);
 		lb.clickLoad();
 		Thread.sleep(3000);
 		lb.exitFullscreen();
 		Thread.sleep(3000);
 		lb.clickApplyLeave();
 		Thread.sleep(4000);
 		lb.clickLeaveSummaryTab();
 		Thread.sleep(3000);
 		lb.clickReport();
 		lb.clickAdvanceLeaveReport();
 		lb.selectLeaveReport("Summary");
 		lb.selectLeavePolicy("ClonePolicy");
 		lb.clickPaymonth("Dec/2020");
 		lb.clickSelectAllCheckBox();
 		lb.clickGetEmployee();
 		lb.resizeWindow();
 		Thread.sleep(2000);
 		lb.clickLoad();
 		Thread.sleep(2000);
 		lb.exitFullscreen();
 		Thread.sleep(3000);
 		lb.clickEmployee1();
 		lb.clickEmployee2();
 		lb.clickGenerateReport();
 		Thread.sleep(3000);
 		lb.clickMastserLink();
 		lb.selectLeavePolicy();
 		lb.clickAddLeaves();
 		lb.clickSettingsLink();
 		Thread.sleep(2000);
 		lb.clickLapseTab();
 		lb.clickCarryOver();
 		Thread.sleep(2000);
 		lb.clickUpdateButton();
 		Thread.sleep(7000);
     }

    @Test(priority=20) 
     public void CheckForLapseExceedingInLeavePolicy_SC_288() throws InterruptedException{
     CheckForLapseExceedingInLeavePolicy lb=new CheckForLapseExceedingInLeavePolicy(driver);
    	 lb.clickMastserLink();
    	 Thread.sleep(2000);
    	 lb.selectLeavePolicy();
    	 lb.clickAddLeaves();
    	 lb.clickSettingsLink();
    	 Thread.sleep(2000);
    	 lb.clickLapseTab();
    	 lb.clickCarryOver();
    	 Thread.sleep(2000);
    	 lb.clickLapseUnavailed();
    	 Thread.sleep(3000);
    	 lb.enterDropdown("Month");
    	 Thread.sleep(3000);
    	 lb.enterDropdown1("Dec");
    	 lb.clickLapseExceeding("8");
    	 lb.clickUpdateButton();
    	// String d=lb.getMessage1();
    	 //Assert.assertEquals(d, "Setting was successfully updated.");
    	 Thread.sleep(9000);
    	 lb.clickReport();
    	 lb.clickAdvanceLeaveReport();
    	 lb.selectLeaveReport("Summary");
    	 lb.selectLeavePolicy("ClonePolicy");
    	 lb.clickPaymonth("Dec/2020");
    	 lb.clickSelectAllCheckBox();
    	 lb.clickGetEmployee();
    	 lb.resizeWindow();
    	 Thread.sleep(2000);
    	 lb.clickLoad();
    	 Thread.sleep(2000);
    	 lb.exitFullscreen();
    	 Thread.sleep(3000);
    	 lb.clickEmployee1();
    	 lb.clickEmployee2();
    	 lb.clickGenerateReport();
    	 Thread.sleep(3000);
    	 lb.clickMastserLink();
    	 lb.selectLeavePolicy();
    	 lb.clickAddLeaves();
    	 lb.clickSettingsLink();
    	 Thread.sleep(2000);
    	 lb.clickLapseTab();
    	 lb.clickCarryOver();
    	 Thread.sleep(2000);
    	 lb.clickUpdateButton();
    	 Thread.sleep(9000);
     }

	@Test(priority=21)
	public void ToCheckNoofCasualLeaveDaysthatareeithertobePrefixedorSuffixedtoaHolidaytomarkH_SC_292() throws InterruptedException{
		ToCheckNoofCasualLeaveDayseitherPrefixedorSuffixedtoHolidaytomarkH mi = new ToCheckNoofCasualLeaveDayseitherPrefixedorSuffixedtoHolidaytomarkH(driver);
		mi.clickMastserLink();
		mi.selectLeavePolicy();
		mi.clickAddLeaves();
		Thread.sleep(2000);
		mi.clickSettingsLink();
		Thread.sleep(2000);
		mi.enterCasualLeaveallowedavaiformonth("5");
		mi.enterCasualLeaveallowedavailforyear("5");
		//mi.clickAllowHalfDay();
		mi.clickUpdateButtonA();
		Thread.sleep(2000);
		mi.clickWeeklyOff();
		Thread.sleep(2000);
		mi.clickHolidayLeaveCheckbox();
		mi.HolidayPrefixLeaves("1");
		mi.clickHolidayPrefixCheckbox();
		Thread.sleep(4000);
		mi.clickUpdateButton();
		//String d = mi.getMessage1();
		//Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(4000);
		mi.clickLeaveLink();
		mi.clickAppyLeaveLink();
		mi.clickFilter();
		mi.resizeWindow();
		Thread.sleep(3000);
		mi.clickLoad();
		Thread.sleep(3000);
		mi.exitFullscreen();
		mi.ClickOnApplyLeave();
		mi.selectLeaveType("Casual Leave (CL)");
		Thread.sleep(3000);
		mi.enterFromDate("21 January 2020");
		Thread.sleep(3000);
		mi.enterToDate("22 January 2020");
		Thread.sleep(3000);
		mi.clickApplyButton();
		String e = mi.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		mi.selectLeaveHistory();
		mi.enterHistoryFromDate("01 August 2014");
		Thread.sleep(3000);
		mi.clickSearchButton();
		Thread.sleep(3000);
		mi.selectView();
		Thread.sleep(5000);
		mi.clickDeleteButton();
		Thread.sleep(8000);
	}
	
	@Test(priority=22)
	public void ToCheckifappliedCasualLeavehasWeeklyOffconsiderasCasualLeavewithprefix_SC_293() throws InterruptedException{
		ToCheckifappliedCasualLeavehasWeeklyOffconsiderasCasualLeavewithprefix ab = new ToCheckifappliedCasualLeavehasWeeklyOffconsiderasCasualLeavewithprefix(driver);
		ab.clickMastserLink();
		ab.selectLeavePolicy();
		ab.clickAddLeaves();
		ab.clickSettingsLink();
		Thread.sleep(2000);
		ab.clickWeeklyOff();
		Thread.sleep(4000);
		ab.clickWeeklyOffLeaveCheckbox();
		ab.WeeklyOffPrefixLeaves("1");
		ab.clickWeeklyOffPrefixCheckbox();
		ab.clickUpdateButton();
		String d=ab.getMessage1();
		Assert.assertEquals(d, "Setting was successfully updated.");
		ab.clickLeaveLink();
		ab.clickAppyLeaveLink();
		ab.clickFilter();
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.clickLoad();
		Thread.sleep(3000);
		ab.exitFullscreen();
		ab.ClickOnApplyLeave();
		ab.selectLeaveType("Casual Leave (CL)");
		Thread.sleep(3000);
		ab.enterFromDate("17 January 2020");
		Thread.sleep(3000);
		ab.enterToDate("19 January 2020");
		Thread.sleep(3000);
		ab.clickApplyButton();
		String e=ab.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		ab.selectLeaveHistory();
		ab.enterLeaveHistoryFromDate("01 August 2014");
		ab.clickSearchButton();
		ab.selectView();
		Thread.sleep(4000);
		ab.clickDeleteButton();
		Thread.sleep(3000);
	}

	@Test(priority=23)
	public void verifyUpdatedHolidayWeeklyLeaves_SC_291() throws Exception{
		HolidayWeeklyoffSettings hs=new HolidayWeeklyoffSettings(driver);
		hs.clickMastserLink();
		hs.selectLeavePolicy();
		hs.clickAddLeaves();
		hs.clickSettingsLink();
		Thread.sleep(2000);
		hs.clickWeeklyOff();
		Thread.sleep(4000);
		hs.clickHolidayLeaveCheckbox();
		hs.HolidayPrefixLeaves("1");
		hs.clickHolidayCL();
		Thread.sleep(4000);
		hs.clickWeeklyOffLeaveCheckbox();
		Thread.sleep(3000);
		hs.WeeklyOffPrefixLeaves("1");
		hs.clickWeeklyOffCL();
		hs.clickUpdateButton();
		//String d=hs.getMessage1();
		//Assert.assertEquals(d, "Setting was successfully updated.");
		Thread.sleep(3000);
		hs.clickLeaveLink();
		hs.clickAppyLeaveLink();
		hs.resizeWindow();
		Thread.sleep(3000);
		hs.clickFilter();
		Thread.sleep(3000);
		hs.clickLoad();
		Thread.sleep(3000);
		hs.exitFullscreen();
		hs.ClickOnApplyLeave();
		hs.selectLeaveType("Casual Leave (CL)");
		Thread.sleep(3000);
		hs.enterFromDate("21 January 2020");
		Thread.sleep(3000);
		hs.enterToDate("22 January 2020");
		Thread.sleep(2000);
		hs.clickApplyButton();
		String e = hs.getMessage2();
		Assert.assertEquals(e, "Leave applied successfully.");
		Thread.sleep(6000);
		hs.selectLeaveType("Casual Leave (CL)");
		Thread.sleep(3000);
		hs.enterFromDate("17 January 2020");
		Thread.sleep(3000);
		hs.enterToDate("18 January 2020");
		Thread.sleep(2000);
		hs.clickApplyButton();
		Thread.sleep(3000);
		hs.selectLeaveHistory();
		hs.enterLeaveHistoryFromDate("01 September 2014");
		hs.clickSearchButton();
		Thread.sleep(3000);
		hs.selectView();
		Thread.sleep(6000);
		hs.clickDeleteButton();
		Thread.sleep(6000);
		hs.selectView();
		Thread.sleep(6000);
		hs.clickDeleteButton();
		Thread.sleep(6000);
		hs.clickMastserLink();
		hs.selectLeavePolicy();
		hs.clickAddLeaves();
		hs.clickSettingsLink();
		Thread.sleep(2000);
		hs.clickWeeklyOff();
		Thread.sleep(4000);
		hs.clickHolidayLeaveCheckbox_2();
		hs.clickWeeklyOffLeaveCheckbox_2();
		hs.clickUpdateButton();
	}
	
	@Test(priority=24) 
     public void CheckAutoLeaveAllotmentWithPeriodInLeavePolicy_SC_294() throws InterruptedException{
    	 CheckAutoLeaveAllotmentWithPeriodInLeavePolicy lb=new CheckAutoLeaveAllotmentWithPeriodInLeavePolicy(driver);
    	 lb.clickMastserLink();
    	 lb.selectLeavePolicy();
    	 lb.clickAddLeaves();
    	 lb.clickSettingsLink();
    	 Thread.sleep(2000);
    	 lb.clickAutoAllotTab();
    	 Thread.sleep(2000);
    	 lb.clickLeaveAllotmentBox();
    	 Thread.sleep(5000);
    	 lb.SelectAllotType("Period");
    	 lb.SelectAllotOn("Pay Days");
    	 lb.SelectRoundOff("None");
    	 lb.SelectEffectiveFrom("Jan/2020");
    	 lb.enterNoOfLeaves("2");
 		 lb.enterPeriodInDays("20");
 		 lb.clickUpdateButton();
 		 Thread.sleep(2000);
 		 String d=lb.getMessage1();
 		 Assert.assertEquals(d, "Setting was successfully updated.");
 		 lb.clickReport();
 		 lb.clickAdvanceLeaveReport();
 		 lb.selectLeaveReport("Summary");
 		 lb.selectLeavePolicy("ClonePolicy");
 		 lb.clickPaymonth("Jan/2020");
 		 lb.clickSelectAllCheckBox();
 		 lb.clickGetEmployee();
 		 lb.resizeWindow();
 		 Thread.sleep(4000);
 		 lb.clickLoad();
 		 Thread.sleep(3000);
 		 lb.exitFullscreen();
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
 		 Thread.sleep(6000);
	}

	@Test(priority=25)
	public void verifyUpdatedAutoAllotSettings_SC_299() throws Exception{
		AutoAllotSettings lb =new AutoAllotSettings(driver);
		lb.clickMastserLink();
   	 lb.selectLeavePolicy();
   	 lb.clickAddLeaves();
   	 lb.clickSettingsLink();
   	 Thread.sleep(2000);
   	 lb.clickAutoAllotTab();
   	 Thread.sleep(2000);
   	 lb.clickLeaveAllotmentBox();
   	 Thread.sleep(5000);
   	 lb.SelectAllotType("Monthly");
   	 lb.SelectAllotOn("Pay Days");
   	 lb.SelectRoundOff("Lower Full Day");
   	Thread.sleep(2000);
   	 lb.SelectEffectiveFrom("Feb/2020");
   	Thread.sleep(2000);
   	 lb.enterNoOfLeaves("2");
		// lb.enterPeriodInDays("20")
		 lb.clickUpdateButton();
		 Thread.sleep(2000);
		 String d=lb.getMessage1();
		 Assert.assertEquals(d, "Setting was successfully updated.");
		 lb.clickReport();
		 lb.clickAdvanceLeaveReport();
		 lb.selectLeaveReport("Summary");
		 lb.selectLeavePolicy("ClonePolicy");
		 lb.clickPaymonth("Feb/2020");
		 lb.clickSelectAllCheckBox();
		 lb.clickGetEmployee();
		 lb.resizeWindow();
		 Thread.sleep(4000);
		 lb.clickLoad();
		 Thread.sleep(3000);
		 lb.exitFullscreen();
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
		 Thread.sleep(6000);
	}
	
	@Test(priority=26) 
     public void CheckAutoLeaveAllotmentWithMonthlyForEvenMonth_SC_301() throws InterruptedException{
    CheckAutoLeaveAllotmentWithMonthlyForEvenMonth lb=new CheckAutoLeaveAllotmentWithMonthlyForEvenMonth(driver);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(2000);
 	lb.clickAutoAllotTab();
 	Thread.sleep(2000);
 	lb.clickLeaveAllotmentBox();
 	Thread.sleep(2000);
 	lb.SelectAllotType("Monthly");
 	Thread.sleep(2000);
 	lb.SelectAllotOn("Pay Days");
 	lb.SelectForMonth("Even Month");
 	//lb.SelectRoundOff("None");
 	lb.SelectEffectiveFrom("Jun/2020");
 	Thread.sleep(2000);
 	lb.enterNoOfLeaves("2");
 	//lb.enterPeriodInDays("20");
 	lb.clickUpdateButton();
 	String d=lb.getMessage1();
 	Assert.assertEquals(d, "Setting was successfully updated.");
 	Thread.sleep(2000);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Summary");
	Thread.sleep(2000);
	lb.clickPaymonth("Jun/2020");
	Thread.sleep(2000);
 	lb.selectLeavePolicy("ClonePolicy");
	Thread.sleep(2000);
 	lb.clickSelectAllCheckBox();
 	lb.resizeWindow();
	Thread.sleep(2000);
 	lb.clickGetEmployee();
 	Thread.sleep(2000);
 	lb.clickLoad();
 	Thread.sleep(2000);
 	//lb.exitFullscreen();
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	
 	lb.selectLeaveReport("Summary");
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickPaymonth("Jul/2020");
 	//Thread.sleep(4000);
 	//lb.clickSelectAllCheckBox();
 	//lb.resizeWindow();
 	Thread.sleep(2000);
 	lb.clickGetEmployee();
 	Thread.sleep(2000);
 	lb.clickLoad();
 	Thread.sleep(2000);
 	lb.exitFullscreen();
 	Thread.sleep(2000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(2000);
 	lb.clickMastserLink();
 	lb.selectLeavePolicy();
 	lb.clickAddLeaves();
 	lb.clickSettingsLink();
 	Thread.sleep(2000);
 	lb.clickAutoAllotTab();
 	lb.clickLeaveAllotmentBox();
 	lb.clickUpdateButton(); 
 	Thread.sleep(3000);
}
     @Test(priority=27) 
     public void CheckAutoLeaveAllotmentWithMonthlyForOddMonth_SC_300() throws InterruptedException{
    	 CheckAutoLeaveAllotmentWithMonthlyForOddMonth lb=new CheckAutoLeaveAllotmentWithMonthlyForOddMonth(driver);
    	 lb.clickMastserLink();
    	 	lb.selectLeavePolicy();
    	 	lb.clickAddLeaves();
    	 	lb.clickSettingsLink();
    	 	Thread.sleep(2000);
    	 	lb.clickAutoAllotTab();
    	 	Thread.sleep(2000);
    	 	lb.clickLeaveAllotmentBox();
    	 	Thread.sleep(2000);
    	 	lb.SelectAllotType("Monthly");
    	 	Thread.sleep(2000);
    	 	lb.SelectAllotOn("Pay Days");
    	 	lb.SelectForMonth("Odd Month");
    	 	//lb.SelectRoundOff("None");
    	 	lb.SelectEffectiveFrom("Sep/2020");
    	 	Thread.sleep(2000);
    	 	lb.enterNoOfLeaves("2");
    	 	//lb.enterPeriodInDays("20");
    	 	lb.clickUpdateButton();
    	 	String d=lb.getMessage1();
    	 	Assert.assertEquals(d, "Setting was successfully updated.");
    	 	Thread.sleep(2000);
    	 	lb.clickReport();
    	 	lb.clickAdvanceLeaveReport();
    	 	lb.selectLeaveReport("Summary");
    		Thread.sleep(2000);
    		lb.clickPaymonth("Sep/2020");
    		Thread.sleep(2000);
    	 	lb.selectLeavePolicy("ClonePolicy");
    		Thread.sleep(2000);
    	 	lb.clickSelectAllCheckBox();
    	 	lb.resizeWindow();
    		Thread.sleep(2000);
    	 	lb.clickGetEmployee();
    	 	Thread.sleep(2000);
    	 	lb.clickLoad();
    	 	Thread.sleep(2000);
    	 	//lb.exitFullscreen();
    	 	lb.clickEmployee1();
    	 	lb.clickEmployee2();
    	 	lb.clickGenerateReport();
    	 	Thread.sleep(5000);
    	 	
    	 	lb.selectLeaveReport("Summary");
    	 	lb.selectLeavePolicy("ClonePolicy");
    	 	lb.clickPaymonth("Oct/2020");
    	 	//Thread.sleep(4000);
    	 	//lb.clickSelectAllCheckBox();
    	 	//lb.resizeWindow();
    	 	Thread.sleep(2000);
    	 	lb.clickGetEmployee();
    	 	Thread.sleep(2000);
    	 	lb.clickLoad();
    	 	Thread.sleep(2000);
    	 	lb.exitFullscreen();
    	 	Thread.sleep(2000);
    	 	lb.clickEmployee1();
    	 	lb.clickEmployee2();
    	 	lb.clickGenerateReport();
    	 	Thread.sleep(2000);
    	 	lb.clickMastserLink();
    	 	lb.selectLeavePolicy();
    	 	lb.clickAddLeaves();
    	 	lb.clickSettingsLink();
    	 	Thread.sleep(2000);
    	 	lb.clickAutoAllotTab();
    	 	lb.clickLeaveAllotmentBox();
    	 	lb.clickUpdateButton(); 
    	 	Thread.sleep(3000);
}

  @Test(priority=28) 
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
 	lb.SelectEffectiveFrom("Nov/2020");
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
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickPaymonth("Nov/2020");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	lb.resizeWindow();
 	Thread.sleep(3000);
 	lb.clickLoad();
 	Thread.sleep(3000);
 	lb.exitFullscreen();
 	Thread.sleep(2000);
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
     @Test(priority=29) 
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
 	lb.SelectEffectiveFrom("Dec/2020");
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
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickPaymonth("Dec/2020");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	lb.resizeWindow();
 	Thread.sleep(4000);
 	lb.clickLoad();
 	Thread.sleep(2000);
 	lb.exitFullscreen();
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
    @Test(priority=30)
 	public void CheckforMaxCasualLeavethatcanbeavailedforinstance_SC_308() throws InterruptedException{
 		CheckforMaxCasualLeavethatcanbeavailedforinstance mc=new CheckforMaxCasualLeavethatcanbeavailedforinstance(driver);
 		mc.clickMastserLink();
 		mc.selectLeavePolicy();
 		mc.clickAddLeaves();
 		mc.clickSettingsLink();
 		mc.entermaxnoofcasualleave("2");
 		Thread.sleep(3000);
 		mc.clickUpdateButton();
 		//Thread.sleep(2000);
 		String a=mc.getMessage1();
 		Assert.assertEquals(a, "Setting was successfully updated.");
 		Thread.sleep(4000);
 		mc.clickLeaveLink();
 		//Thread.sleep(3000);
 		mc.clickAppyLeaveLink();
 		Thread.sleep(3000);
 		mc.resizeWindow();
 		Thread.sleep(5000);
 		mc.clickFilter();
 		Thread.sleep(2000);
 		mc.clickLoad();
 		Thread.sleep(2000);
 		mc.exitFullscreen();
 		Thread.sleep(4000);
 		mc.clickApplyLeave();
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("20 January 2020");
 		mc.enterToDate("21 January 2020");
 		Thread.sleep(2000);
 		mc.selectApplyButton();
 		String e=mc.getMessage2();
 		Assert.assertEquals(e, "Leave applied successfully.");
 		Thread.sleep(3000);
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("11 February 2020");
 		mc.enterToDate("13 February 2020");
 		Thread.sleep(2000);
 		mc.selectApplyButton();
 		String f=mc.getMessage3();
 		Assert.assertEquals(f, "Max days instance error: Maximum 2.0 days CL can be applied in a single instance.");
 		Thread.sleep(4000);
 		mc.selectLeaveHistory();
		mc.enterLeaveHistoryFromDate("01 September 2014");
		mc.clickSearchButton();
		Thread.sleep(3000);
		mc.selectView();
		Thread.sleep(6000);
		mc.clickDeleteButton();
		Thread.sleep(6000);
		mc.clickMastserLink();
 		mc.selectLeavePolicy();
 		mc.clickAddLeaves();
 		mc.clickSettingsLink();
 		mc.entermaxnoofcasualleave("");
 		mc.clickUpdateButton();
 		Thread.sleep(3000);
 		
 	}
    @Test(priority=31) //not running
 	public void CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave_SC_307() throws InterruptedException{
 		CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave mc=new CheckforMinimumNodaysshouldbeappliedtoavailtheCasualLeave(driver);
 		mc.clickMastserLink();
 		mc.selectLeavePolicy();
 		mc.clickAddLeaves();
 		mc.clickSettingsLink();
 		mc.entermindaystoapplycasualleave("2");
 		Thread.sleep(3000);
 		mc.clickUpdateButton();
 		String a=mc.getMessage1();
 		Assert.assertEquals(a, "Setting was successfully updated.");
 		Thread.sleep(3000);
 		mc.clickLeaveLink();
 		mc.clickAppyLeaveLink();
 		Thread.sleep(3000);
 		mc.resizeWindow();
 		Thread.sleep(2000);
 		mc.clickFilter();
 		Thread.sleep(2000);
 		mc.clickLoad();
 		Thread.sleep(2000);
 		mc.exitFullscreen();
 		Thread.sleep(3000);
 		mc.clickApplyLeave();
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("20 January 2020");
 		mc.enterToDate("21 January 2020");
 		Thread.sleep(2000);
 		mc.selectApplyButton();
 		String e=mc.getMessage2();
 		Assert.assertEquals(e, "Leave applied successfully.");
 		Thread.sleep(4000);
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("11 February 2020");
 		mc.enterToDate("11 February 2020");
 		Thread.sleep(3000);
 		//mc.selectApplyButton();
 		String f=mc.getMessage();
 		Assert.assertEquals(f, "Minimum 2.0 CL should be applied to avail CL.");
 		Thread.sleep(3000);
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("11 February 2020");
 		mc.enterToDate("13 February 2020");
 		Thread.sleep(2000);
 		mc.selectApplyButton();
 		String c=mc.getMessage2();
 		Assert.assertEquals(c, "Leave applied successfully.");
 		Thread.sleep(4000);
 		mc.selectLeaveHistory();
		mc.enterLeaveHistoryFromDate("01 September 2014");
		mc.clickSearchButton();
		Thread.sleep(2000);
		mc.selectView();
		Thread.sleep(3000);
		mc.clickDeleteButton();
		Thread.sleep(4000);
		mc.selectView();
		Thread.sleep(3000);
		mc.clickDeleteButton();
		Thread.sleep(4000);
		mc.clickMastserLink();
 		mc.selectLeavePolicy();
 		mc.clickAddLeaves();
 		mc.clickSettingsLink();
 		mc.entermindaystoapplycasualleave("");
 		mc.clickUpdateButton();
 		Thread.sleep(3000);
 	}
     
    @Test(priority=32)
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
 		Thread.sleep(2000);
 		pd.clickLeaveLink();
 		pd.clickAppyLeaveLink();
 		pd.resizeWindow();
 		Thread.sleep(2000);
 		pd.clickFilter();
 		Thread.sleep(2000);
 		pd.clickLoad();
 		Thread.sleep(2000);
 		pd.exitFullscreen();
 		Thread.sleep(2000);
 		pd.clickApplyLeave();
 		pd.selectLeaveType("Casual Leave (CL)");
 		pd.enterFromDate("23 January 2020");
 		pd.enterToDate("23 January 2020");
 		pd.disablefirsthalf();
 		pd.selectApplyButton();
 		String e=pd.getMessage2();
 		Assert.assertEquals(e, "Leave applied successfully.");
 		Thread.sleep(3000);
 		pd.clickMastserLink();
 		pd.selectLeavePolicy();
 		pd.clickAddLeaves();
 		pd.clickSettingsLink();
 		pd.clickonallowhalfday_2();
 		pd.clickUpdateButton();
 		Thread.sleep(2000);
 		pd.clickLeaveLink();
 		pd.clickAppyLeaveLink();
 		Thread.sleep(2000);
 		pd.resizeWindow();
 		Thread.sleep(3000);
 		pd.clickFilter();
 		Thread.sleep(3000);
 		pd.clickLoad();
 		Thread.sleep(2000);
 		pd.exitFullscreen();
 		Thread.sleep(2000);
 		pd.clickApplyLeave();
 		pd.selectLeaveType("Casual Leave (CL)");
 		pd.enterFromDate("24 January 2020");
 		pd.enterToDate("24 January 2020");
 		pd.disablefirsthalf();
 		Thread.sleep(2000);
 		pd.selectApplyButton();
 		String f=pd.getErrorMessage();
 		Assert.assertEquals(f, "Allow half day error: Cannot apply half day CL.");
 		Thread.sleep(3000);
 		pd.selectLeaveHistory();
		pd.enterLeaveHistoryFromDate("01 September 2014");
		pd.clickSearchButton();
		pd.selectView();
		Thread.sleep(3000);
		pd.clickDeleteButton();
		Thread.sleep(4000);
 	}
 
   @Test(priority=33)
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
 		pd.resizeWindow();
 		Thread.sleep(2000);
 		pd.clickFilter();
 		Thread.sleep(2000);
 		pd.clickLoad();
 		Thread.sleep(2000);
 		pd.exitFullscreen();
 		Thread.sleep(3000);
 		pd.clickApplyLeave();
 		pd.selectLeaveType("Casual Leave (CL)");
 		pd.enterFromDate("24 December 2019"); //change date as per todays date.
 		pd.enterToDate("24 December 2019");
 		pd.selectApplyButton();
 		String e=pd.getMessage2();
 		Assert.assertEquals(e, "Leave applied successfully.");
 		Thread.sleep(3000);
 		pd.selectLeaveHistory();
		pd.enterLeaveHistoryFromDate("01 September 2014");
		pd.clickSearchButton();
		pd.selectView();
		Thread.sleep(3000);
		pd.clickDeleteButton();
		Thread.sleep(4000);
 	}
   @Test(priority=34)
   public void UpdateAutoAllotSettingsPresentDays_SC_358() throws InterruptedException{
  	 UpdateAutoAllotSettingsPresentDays lb=new UpdateAutoAllotSettingsPresentDays(driver);
	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	Thread.sleep(2000);
	lb.clickLeaveAllotmentBox();
	Thread.sleep(2000);
	lb.SelectAllotType("Monthly");
	Thread.sleep(1000);
	lb.SelectAllotOn("Present Days");
	lb.SelectAsPerMonth("Current Month");
	lb.SelectForMonth("Every Month");
	Thread.sleep(2000);
	lb.SelectEffectiveFrom("Feb/2020");
	Thread.sleep(2000);
	lb.enterNoOfLeaves("2");
	//lb.enterPeriodInDays("20");
	Thread.sleep(2000);
	lb.clickUpdateButton();
	String d=lb.getMessage1();
	Assert.assertEquals(d, "Setting was successfully updated.");
	Thread.sleep(3000);
}
   @Test(priority=35) 
 	public void CheckAutoAllotSettingsForPresentDays_SC_359() throws InterruptedException{
 	CheckAutoAllotSettingsForPresentDays lb=new CheckAutoAllotSettingsForPresentDays(driver);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Allotment");
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickFromDate("Feb/2020");
 	lb.clickToDate("Dec/2020");
 	lb.clickSelectCasualLeave();
 	lb.clickGetEmployee();
 	Thread.sleep(2000);
 	lb.resizeWindow();
 	Thread.sleep(2000);
 	lb.clickLoad();
 	Thread.sleep(3000);
 	lb.exitFullscreen();
 	Thread.sleep(3000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
	lb.selectLeavePolicy();
	Thread.sleep(2000);
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	lb.clickLeaveAllotmentBox();
	lb.clickUpdateButton(); 
	Thread.sleep(2000);
   }
   @Test(priority=36) 
     public void UpdateAutoAllotSettingsMonthly_SC_356() throws InterruptedException{
    	 UpdateAutoAllotSettingsMonthly lb=new UpdateAutoAllotSettingsMonthly(driver);
 	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	Thread.sleep(2000);
	lb.clickLeaveAllotmentBox();
	Thread.sleep(2000);
	lb.SelectAllotType("Monthly");
	Thread.sleep(1000);
	lb.SelectAllotOn("Actual Days");
	lb.SelectAsPerMonth("Current Month");
	lb.SelectForMonth("Every Month");
	Thread.sleep(2000);
	lb.SelectEffectiveFrom("Jan/2020");
	Thread.sleep(2000);
	lb.enterNoOfLeaves("2");
	//lb.enterPeriodInDays("20");
	Thread.sleep(2000);
	lb.clickUpdateButton();
	String d=lb.getMessage1();
	Assert.assertEquals(d, "Setting was successfully updated.");
	Thread.sleep(3000);
}
    @Test(priority=37) 
  	public void CheckAutoAllotSettingsMonthlyInLeaveSummary_SC_414() throws InterruptedException{
		CheckAutoAllotSettingsMonthlyInLeaveSummary lb=new CheckAutoAllotSettingsMonthlyInLeaveSummary(driver);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(2000);
	 	lb.resizeWindow();
	 	Thread.sleep(3000);
	 	lb.clickLoad();
	 	Thread.sleep(2000);
	 	lb.exitFullscreen();
	 	Thread.sleep(3000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(2000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
}

   @Test(priority=38) 
	public void CheckAutoAllotSettingsMonthly_SC_357() throws InterruptedException{
	    	 CheckAutoAllotSettingsMonthly lb=new CheckAutoAllotSettingsMonthly(driver);
	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Allotment");
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickFromDate("Feb/2020");
 	lb.clickToDate("Dec/2020");
 	lb.clickSelectCasualLeave();
 	lb.clickGetEmployee();
 	Thread.sleep(2000);
 	lb.resizeWindow();
 	Thread.sleep(2000);
 	lb.clickLoad();
 	Thread.sleep(3000);
 	lb.exitFullscreen();
 	Thread.sleep(3000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
	lb.selectLeavePolicy();
	Thread.sleep(2000);
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	lb.clickLeaveAllotmentBox();
	lb.clickUpdateButton(); 
	Thread.sleep(2000);
}

	@Test(priority=39) 
     public void UpdateAutoAllotSettingsQuarterly_SC_360() throws InterruptedException{
    	 UpdateAutoAllotSettingsQuarterly lb=new UpdateAutoAllotSettingsQuarterly(driver);
		 	lb.clickMastserLink();
			lb.selectLeavePolicy();
			lb.clickAddLeaves();
			lb.clickSettingsLink();
			Thread.sleep(2000);
			lb.clickAutoAllotTab();
			Thread.sleep(2000);
			lb.clickLeaveAllotmentBox();
			Thread.sleep(2000);
			lb.SelectAllotType("Quarterly");
			//Thread.sleep(1000);
			//lb.SelectAllotOn("Calendar Year");
			//lb.SelectAsPerMonth("Current Month");
			//lb.SelectForMonth("Every Month");
			Thread.sleep(2000);
			lb.SelectEffectiveFrom("Jan/2020");
			Thread.sleep(2000);
			lb.enterNoOfLeaves("2");
			//lb.enterPeriodInDays("20");
			Thread.sleep(2000);
			lb.clickUpdateButton();
			String e=lb.getMessage1();
			Assert.assertEquals(e, "Setting was successfully updated.");
			Thread.sleep(3000);

}
@Test(priority=40) 
  	public void CheckAutoAllotSettingsQuarterlyInLeaveSummary_SC_415() throws InterruptedException{
		CheckAutoAllotSettingsQuarterlyInLeaveSummary lb=new CheckAutoAllotSettingsQuarterlyInLeaveSummary(driver);	
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(2000);
	 	lb.resizeWindow();
	 	Thread.sleep(3000);
	 	lb.clickLoad();
	 	Thread.sleep(2000);
	 	lb.exitFullscreen();
	 	Thread.sleep(3000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(2000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
}
    @Test(priority=41) 
 	public void CheckAutoAllotSettingsQuarterly_SC_361() throws InterruptedException{
    	 CheckAutoAllotSettingsQuarterly lb=new CheckAutoAllotSettingsQuarterly(driver);
 	lb.clickReport();
 	lb.clickAdvanceLeaveReport();
 	lb.selectLeaveReport("Allotment");
 	lb.selectLeavePolicy("ClonePolicy");
 	lb.clickFromDate("Jan/2020");
 	lb.clickToDate("Mar/2020");
 	lb.clickSelectAllCheckBox();
 	lb.clickGetEmployee();
 	Thread.sleep(2000);
 	lb.resizeWindow();
 	Thread.sleep(2000);
 	lb.clickLoad();
 	Thread.sleep(2000);
 	lb.exitFullscreen();
 	Thread.sleep(3000);
 	lb.clickEmployee1();
 	lb.clickEmployee2();
 	lb.clickGenerateReport();
 	Thread.sleep(5000);
 	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	Thread.sleep(2000);
	lb.clickLeaveAllotmentBox();
	Thread.sleep(2000);
	lb.clickUpdateButton(); 
	Thread.sleep(2000);

 }
    @Test(priority=42) 
    public void UpdateAutoAllotSettingsHalfYearly_SC_362() throws InterruptedException{
    UpdateAutoAllotSettingsHalfYearly lb=new UpdateAutoAllotSettingsHalfYearly(driver);
 	lb.clickMastserLink();
	lb.selectLeavePolicy();
	lb.clickAddLeaves();
	lb.clickSettingsLink();
	Thread.sleep(2000);
	lb.clickAutoAllotTab();
	Thread.sleep(2000);
	lb.clickLeaveAllotmentBox();
	Thread.sleep(2000);
	lb.SelectAllotType("Half Yearly");
	//Thread.sleep(1000);
	//lb.SelectAllotOn("Calendar Year");
	//lb.SelectAsPerMonth("Current Month");
	//lb.SelectForMonth("Every Month");
	Thread.sleep(2000);
	lb.SelectEffectiveFrom("Jan/2020");
	Thread.sleep(2000);
	lb.enterNoOfLeaves("2");
	//lb.enterPeriodInDays("20");
	Thread.sleep(2000);
	lb.clickUpdateButton();
	String e=lb.getMessage1();
	Assert.assertEquals(e, "Setting was successfully updated.");
	Thread.sleep(3000);
}
    @Test(priority=43) 
  	public void CheckAutoAllotSettingsHalfYearlyInLeaveSummary_SC_416() throws InterruptedException{
		CheckAutoAllotSettingsHalfYearlyInLeaveSummary lb=new CheckAutoAllotSettingsHalfYearlyInLeaveSummary(driver);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(2000);
	 	lb.resizeWindow();
	 	Thread.sleep(3000);
	 	lb.clickLoad();
	 	Thread.sleep(2000);
	 	lb.exitFullscreen();
	 	Thread.sleep(3000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(2000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
    }
   @Test(priority=44) 
  	public void CheckAutoAllotSettingsHalfYearly_SC_363() throws InterruptedException{
    	 CheckAutoAllotSettingsHalfYearly lb=new CheckAutoAllotSettingsHalfYearly(driver);
    	 lb.clickReport();
    	 	lb.clickAdvanceLeaveReport();
    	 	lb.selectLeaveReport("Allotment");
    	 	lb.selectLeavePolicy("ClonePolicy");
    	 	lb.clickFromDate("Jan/2020");
    	 	lb.clickToDate("Jun/2020");
    	 	lb.clickSelectAllCheckBox();
    	 	lb.clickGetEmployee();
    	 	Thread.sleep(2000);
    	 	lb.resizeWindow();
    	 	Thread.sleep(2000);
    	 	lb.clickLoad();
    	 	Thread.sleep(2000);
    	 	lb.exitFullscreen();
    	 	Thread.sleep(3000);
    	 	lb.clickEmployee1();
    	 	lb.clickEmployee2();
    	 	lb.clickGenerateReport();
    	 	Thread.sleep(5000);
    	 	lb.clickMastserLink();
    		lb.selectLeavePolicy();
    		lb.clickAddLeaves();
    		lb.clickSettingsLink();
    		Thread.sleep(2000);
    		lb.clickAutoAllotTab();
    		Thread.sleep(2000);
    		lb.clickLeaveAllotmentBox();
    		Thread.sleep(2000);
    		lb.clickUpdateButton(); 
    		Thread.sleep(2000);

}
	@Test(priority=45) 
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
	lb.SelectEffectiveFrom("Jan/2020");
	Thread.sleep(5000);
	lb.enterNoOfLeaves("2");
	//lb.enterPeriodInDays("20");
	lb.clickUpdateButton();
	String d=lb.getMessage1();
	Assert.assertEquals(d, "Setting was successfully updated.");
	Thread.sleep(4000);  
}
	@Test(priority=46) 
  	public void CheckAutoAllotSettingsYearlyInLeaveSummary_SC_417() throws InterruptedException {
		CheckAutoAllotSettingsYearlyInLeaveSummary lb=new CheckAutoAllotSettingsYearlyInLeaveSummary(driver);
		lb.clickLeaveLink();
	 	lb.clickAppyLeaveLink();
	 	lb.clickFilter();
	 	Thread.sleep(2000);
	 	lb.resizeWindow();
	 	Thread.sleep(3000);
	 	lb.clickLoad();
	 	Thread.sleep(2000);
	 	lb.exitFullscreen();
	 	Thread.sleep(3000);
	 	lb.clickApplyLeave();
	 	Thread.sleep(2000);
	 	lb.clickLeaveSummaryTab();
	 	Thread.sleep(5000);
}
	@Test(priority=47) 
  	public void CheckAutoAllotSettingsYearly_SC_365() throws InterruptedException{
    	 CheckAutoAllotSettingsYearly lb=new CheckAutoAllotSettingsYearly(driver);
    	 lb.clickReport();
 	 	lb.clickAdvanceLeaveReport();
 	 	lb.selectLeaveReport("Allotment");
 	 	lb.selectLeavePolicy("ClonePolicy");
 	 	lb.clickFromDate("Jan/2020");
 	 	lb.clickToDate("Dec/2020");
 	 	lb.clickSelectAllCheckBox();
 	 	lb.clickGetEmployee();
 	 	Thread.sleep(2000);
 	 	lb.resizeWindow();
 	 	Thread.sleep(2000);
 	 	lb.clickLoad();
 	 	Thread.sleep(2000);
 	 	lb.exitFullscreen();
 	 	Thread.sleep(3000);
 	 //	lb.clickEmployee1();
 	 	lb.clickEmployee2();
 	 	lb.clickGenerateReport();
 	 	Thread.sleep(5000);
 	 	lb.clickMastserLink();
 		lb.selectLeavePolicy();
 		lb.clickAddLeaves();
 		lb.clickSettingsLink();
 		Thread.sleep(2000);
 		lb.clickAutoAllotTab();
 		Thread.sleep(2000);
 		lb.clickLeaveAllotmentBox();
 		Thread.sleep(2000);
 		lb.clickUpdateButton(); 
 		Thread.sleep(2000);	
}
	@Test(priority=48)
	public void ToCheckIfLeaveCanBeAppliedSuccesfullyForFutureMonths_SC_364() throws InterruptedException {
		ToCheckIfLeaveCanBeAppliedSuccesfullyForFutureMonthsPage mc = new ToCheckIfLeaveCanBeAppliedSuccesfullyForFutureMonthsPage (driver);
		mc.clickMastserLink();
 		mc.selectLeavePolicy();
 		mc.clickAddLeaves();
 		mc.clickSettingsLink();
 		mc.enterMaxLeavePerYear("5");
 		Thread.sleep(3000);
 		mc.clickUpdateButton();
 		String a=mc.getMessage1();
 		Assert.assertEquals(a, "Setting was successfully updated.");
 		Thread.sleep(3000);
 		mc.clickLeaveLink();
 		mc.clickAppyLeaveLink();
 		Thread.sleep(3000);
 		mc.resizeWindow();
 		Thread.sleep(2000);
 		mc.clickFilter();
 		Thread.sleep(2000);
 		mc.clickLoad();
 		Thread.sleep(2000);
 		mc.exitFullscreen();
 		Thread.sleep(3000);
 		mc.clickApplyLeave();
 		mc.selectLeaveType("Casual Leave (CL)");
 		mc.enterFromDate("20 July 2020");
 		mc.enterToDate("20 July 2020");
 		Thread.sleep(2000);
 		mc.selectApplyButton();
 		String e=mc.getMessage2();
 		Assert.assertEquals(e, "Leave applied successfully.");
 		mc.selectLeaveHistory();
		mc.enterLeaveHistoryFromDate("01 September 2014");
		mc.clickSearchButton();
		Thread.sleep(2000);
		mc.selectView();
		Thread.sleep(3000);
		mc.clickDeleteButton();
		Thread.sleep(4000); 	
	}
	@Test(priority=49)
	public void AllotAvailDateSettingsDefaultSetting_SC_754() throws InterruptedException {
		AllotAvailDateSettingsDefaultSettingPage ab = new AllotAvailDateSettingsDefaultSettingPage(driver);
		ab.clickMastserLink();
		ab.selectLeavePolicy();
		ab.clickAddLeaves();
		Thread.sleep(2000);
		ab.selectLeaveType("Earned Leave (EL)");
		ab.clickAdd();
		Thread.sleep(2000);
		ab.clickSettingsLink();
		ab.clickAllot_Avail();
		Thread.sleep(5000);
		ab.clickGoToAddLeave();
		ab.clickDeleteLeave();
		Thread.sleep(4000);
	}
	@Test(priority=50)
	public void Allot_AvailDateSettingsToCheckIfLeavesAreAutoAllottedForNewlyCreatedLeaves_SC_755() throws InterruptedException {
		AllotAvailDateSettingsDefaultSettingPage ab = new AllotAvailDateSettingsDefaultSettingPage(driver);
		ab.clickMastserLink();
		ab.selectLeavePolicy();
		ab.clickAddLeaves();
		Thread.sleep(2000);
		ab.selectLeaveType("Earned Leave (EL)");
		ab.clickAdd();
		Thread.sleep(3000);
		ab.clickReport();
		ab.clickAdvanceLeaveReport();
		ab.selectLeaveReport("Summary");
		ab.selectLeavePolicy("abc");
		ab.clickPaymonth("Dec/2020");
		ab.clickSelectAllCheckBox();
		ab.clickGetEmployee();
		ab.resizeWindow();
	 	Thread.sleep(3000);
	 	ab.clickLoad();
	 	Thread.sleep(2000);
	 	ab.exitFullscreen();
	 	Thread.sleep(3000);
	 	ab.clickEmployee1();
	 	ab.clickGenerateReport();
	 	Thread.sleep(7000);
	 	ab.clickMastserLink();
		ab.selectLeavePolicy();
		ab.clickAddLeaves();
		Thread.sleep(2000);
		ab.clickDeleteLeave();
		Thread.sleep(4000);
	}
	
	/*@Test(priority=36)
	public void DeleteClone() throws Exception {
		UpdateAutoAllotSettingsMonthly up = new UpdateAutoAllotSettingsMonthly(driver);
		up.clickMastserLink();
		up.selectLeavePolicy();
		up.deleteClone();
	}*/
	
	/*@Test(priority=5)
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
		
	}*/
	
	
}