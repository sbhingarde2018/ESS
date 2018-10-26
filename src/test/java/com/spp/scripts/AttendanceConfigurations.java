package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CreateAttendanceConfiguration;
import com.spp.pages.CreateAttendanceConfigwithAttendTypeMonthly;
import com.spp.pages.DeleteAttendanceConfig;
import com.spp.pages.UpdateAttendanceConfiguration;
import com.spp.pages.CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday;
import com.spp.pages.CheckForFixed30DaysInAttendanceConfig;
import com.spp.pages.CheckForOnlyWorkingDayAndHolidayInAttendanceConfig;
import com.spp.pages.CheckForOnlyWorkingDaysInAttendanceConfig;
import com.spp.pages.CheckForSalaryCalenderInAttendanceConfiguration;


public class AttendanceConfigurations extends BaseTest{
	
	/*@Test(priority=0)
	public void verifyCreatedAttendanceConfiguration_SC_83(){
		CreateAttendanceConfiguration ac=new CreateAttendanceConfiguration(driver);
		ac.clickMastserLink();
		ac.selectAttendanceConfiguration();
		ac.clickAddAttendanceConfig();
		ac.enterAttendanceName("chennai");
		ac.enterShortName("ch");
		ac.clickSalaryCalender();
		ac.clickAttendanceType();
		ac.clickCreateButton();
		String s=ac.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully created");
	}

	/*@Test(priority=1)
	public void verifyUpdatedAttendanceConfig_SC_85(){
		UpdateAttendanceConfiguration ua=new UpdateAttendanceConfiguration(driver);
		ua.clickMastserLink();
		ua.selectAttendanceConfiguration();
		ua.clickEditIcon();
		ua.enterAttendanceName("Hyderabad");
		ua.enterShortName("hy");
		ua.clickSalaryCalender();
		ua.clickAttendanceType();
		ua.clickUpdateButton();
		String s=ua.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully updated");
	}
	
	@Test(priority=3)
	public void verifyDeletedAttendanceConfig_SC_84(){
		DeleteAttendanceConfig ac=new DeleteAttendanceConfig(driver);
		ac.clickMastserLink();
		ac.selectAttendanceConfiguration();
		ac.clickDeleteButton();
		String s=ac.getMessage();
		Assert.assertEquals(s,"Attendance Configuration Successfully deleted");
	}
	@Test(priority=4)
	public void CheckForSalaryCalenderInAttendanceConfiguration_SC_319() throws InterruptedException{
		CheckForSalaryCalenderInAttendanceConfiguration ua=new CheckForSalaryCalenderInAttendanceConfiguration(driver);
		ua.clickMastserLink();
		ua.selectAttendanceConfiguration();
		ua.clickEditIcon();
		ua.clickSalaryCalender();
		ua.clickUpdateButton();
		String s=ua.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully updated");
		Thread.sleep(5000);
		ua.clickSalaryLink();
		ua.clickSalaryEditor();
		ua.clickPayMonth("Jan/2018");
		ua.clickSalaryStructure("Gross Salary Structure");
		ua.clickGetValues();
		Thread.sleep(4000);
		ua.clickLoad();
		Thread.sleep(4000);
		ua.clickSelectAllBox();
		ua.clickEmployee();
		ua.clickProcessSalaryButton();
		ua.clickEdit();
		
	}
	@Test(priority=5)
	public void CheckForOnlyWorkingDayAndHolidayInAttendanceConfig_SC_320() throws InterruptedException{
		CheckForOnlyWorkingDayAndHolidayInAttendanceConfig ua=new CheckForOnlyWorkingDayAndHolidayInAttendanceConfig(driver);
		ua.clickMastserLink();
		ua.selectAttendanceConfiguration();
		ua.clickEditIcon();
		ua.clickSalaryCalender();
		ua.clickUpdateButton();
		String s=ua.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully updated");
		Thread.sleep(5000);
		ua.clickSalaryLink();
		ua.clickSalaryEditor();
		ua.clickPayMonth("Mar/2018");
		ua.clickSalaryStructure("Gross Salary Structure");
		ua.clickGetValues();
		Thread.sleep(4000);
		ua.clickLoad();
		Thread.sleep(4000);
		ua.clickSelectAllBox();
		ua.clickEmployee();
		ua.clickProcessSalaryButton();
		ua.clickEdit();
		
	}
	@Test(priority=6)
	public void CheckForOnlyWorkingDaysInAttendanceConfig_SC_321() throws InterruptedException{
		CheckForOnlyWorkingDaysInAttendanceConfig ua=new CheckForOnlyWorkingDaysInAttendanceConfig(driver);
		ua.clickMastserLink();
		ua.selectAttendanceConfiguration();
		ua.clickEditIcon();
		ua.clickSalaryCalender();
		ua.clickUpdateButton();
		String s=ua.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully updated");
		Thread.sleep(5000);
		ua.clickSalaryLink();
		ua.clickSalaryEditor();
		ua.clickPayMonth("Mar/2018");
		ua.clickSalaryStructure("Gross Salary Structure");
		ua.clickGetValues();
		Thread.sleep(4000);
		ua.clickLoad();
		Thread.sleep(4000);
		ua.clickSelectAllBox();
		ua.clickEmployee();
		ua.clickProcessSalaryButton();
		ua.clickEdit();
	}
	@Test(priority=7)
	public void CheckForFixed30DaysInAttendanceConfig_SC_322() throws InterruptedException{
		CheckForFixed30DaysInAttendanceConfig ua=new CheckForFixed30DaysInAttendanceConfig(driver);
		ua.clickMastserLink();
		ua.selectAttendanceConfiguration();
		ua.clickEditIcon();
		ua.clickSalaryCalender();
		ua.clickUpdateButton();
		String s=ua.getMessage();
		Assert.assertEquals(s, "Attendance Configuration was Successfully updated");
		Thread.sleep(5000);
		ua.clickSalaryLink();
		ua.clickSalaryEditor();
		ua.clickPayMonth("Mar/2018");
		ua.clickSalaryStructure("Gross Salary Structure");
		ua.clickGetValues();
		Thread.sleep(4000);
		ua.clickLoad();
		Thread.sleep(4000);
		ua.clickSelectAllBox();
		ua.clickEmployee();
		ua.clickProcessSalaryButton();
		ua.clickEdit();
	}
	@Test(priority=8)
	public void CreateAttendanceConfigwithAttendTypeMonthly_SC_448() throws Exception{
		CreateAttendanceConfigwithAttendTypeMonthly ua=new CreateAttendanceConfigwithAttendTypeMonthly(driver);
		ua.clickonmaster();
		ua.clickonattendanceconfig();
		ua.addnewattendanceconfig();
		ua.enterattendancename("Delhi_"+Utility.getRandNum(10, 10000));
		Thread.sleep(2000);
		ua.entershortname("D_"+Utility.getRandNum(10, 10000));
		ua.selectsalcalender();
		ua.selectattendancetype();
		ua.createattendanceconfig();
		String d=ua.getMessage();
		Assert.assertEquals(d, "Attendance Configuration was Successfully created");
	}*/
	@Test(priority=9)
	public void CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday_SC_449() throws Exception{
		CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday ua=new CheckAttendanceConfigforOnlyWorkingDaysandWeeklyHoliday(driver);
		ua.clickonmaster();
		ua.clickonattendanceconfig();
		ua.editattendanceconfig();
		ua.selectsalcalender();
		ua.updateattendconfig();
		String d=ua.getMessage();
		Assert.assertEquals(d, "Attendance Configuration was Successfully updated");
	}
	
			
	
	
	
	
}

	