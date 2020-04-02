package com.ess.scripts;

import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.MaxnumberofCasualLeaveallowedavail;

import junit.framework.Assert;

public class MaxnumberofCasualLeaveallowed extends BaseTest{
	
	@Test
	public void MaxnumberofCasualLeaveallowed_ess_73() throws Exception{
		
		
		MaxnumberofCasualLeaveallowedavail mnc = new MaxnumberofCasualLeaveallowedavail(driver);
		
		mnc.navigateMaster();
	
		mnc.navigateLeavePolicy();
		
		mnc.addLeavesForPolicy();
	
		mnc.settingforleavedefi();
	
		mnc.maxnoCasualLeave("1");
		
		mnc.updatepolicy();
		
		mnc.navigateleave();
		
		mnc.seelctapplyleave();
		
		mnc.advaneFilter();
		
		mnc.load();
		
		mnc.applyLeaveForEmployee();
		
		mnc.selectleaveltype();
	
		mnc.selectFromdate("02 April 2020");

		mnc.selectTodate("04 April 2020");
	
		mnc.applytheLeave();
	
		String s=mnc.getMessageLeave();
		Assert.assertEquals(s,"You are having insufficient leave balance");
	
		
	}
	}
