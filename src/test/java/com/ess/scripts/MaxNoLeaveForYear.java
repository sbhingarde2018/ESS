package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.MaxNumberLeaveForYear;

public class MaxNoLeaveForYear  extends BaseTest{
	
	@Test
	public void MaxnumberofCasualLeaveallowed_ess_74() throws Exception{
		
		MaxNumberLeaveForYear mx = new MaxNumberLeaveForYear(driver);
		

		Thread.sleep(2000);
		mx.resizeWindow();
		

		Thread.sleep(2000);
		mx.navigateMaster();
	     

		Thread.sleep(2000);
		mx.navigateLeavePolicy();

		Thread.sleep(2000);
		mx.addLeavesForPolicy();

		Thread.sleep(2000);
		mx.settingforleavedefi();

		Thread.sleep(2000);
		mx.maxnoCasualLeave("2");

		Thread.sleep(2000);
		mx.updatepolicy();

		Thread.sleep(2000);
		mx.navigateleave();

		Thread.sleep(2000);
		mx.seelctapplyleave();

		Thread.sleep(2000);
		mx.advaneFilter();

		Thread.sleep(2000);
		mx.load();

		Thread.sleep(2000);
		mx.applyLeaveForEmployee();

		Thread.sleep(2000);
		mx.selectleaveltype();

		Thread.sleep(2000);
		mx.selectFromdate("02 April 2020");

		Thread.sleep(2000);
		mx.selectTodate("04 April 2020");

		Thread.sleep(2000);
		mx.applytheLeave();
		String s=mx.getMessageLeave();
		
		Assert.assertEquals(s,"You are having insufficient leave balance");
		
		
		
	}
		
}

