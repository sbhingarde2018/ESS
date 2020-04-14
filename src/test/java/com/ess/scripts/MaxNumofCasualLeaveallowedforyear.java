package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.MaxNumofCasualLeaveallowedavailforyear;

  
 
public class MaxNumofCasualLeaveallowedforyear  extends BaseTest{
	
	@Test
	public void MaxnumberofCasualLeaveallowed_ess_74() throws Exception{
		
		
		MaxNumofCasualLeaveallowedavailforyear mx = new MaxNumofCasualLeaveallowedavailforyear(driver);
		
		mx.resizeWindow();
		
		mx.navigateMaster();
	
		mx.navigateLeavePolicy();

		mx.addLeavesForPolicy();
		
		mx.settingforleavedefi();
		
		mx.maxnoCasualLeave("2");
		
		mx.updatepolicy();
		
		mx.navigateleave();
		
		mx.seelctapplyleave();
		
		mx.advaneFilter();
		
		Thread.sleep(3000);
		
		mx.load();
		
		mx.applyLeaveForEmployee();

		mx.selectleaveltype();
		
		mx.selectFromdate("02 April 2020");
		
		mx.selectTodate("04 April 2020");
		
		mx.applytheLeave();
		String s=mx.getMessageLeave();
		
		Assert.assertEquals(s,"You are having insufficient leave balance");
		
		
		
	}

}
