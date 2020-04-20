package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.MaxCasualLeavethatcanbeavailedforinstance;

public class MaxNoCasualLeavethatcanbeavailedforinstance extends BaseTest {
	
	@Test
	public void MaxCasualLeavethatcanbeavailedforinstance_ess_77() throws Exception{
		
	MaxCasualLeavethatcanbeavailedforinstance mxinst = new MaxCasualLeavethatcanbeavailedforinstance(driver);
	
	mxinst.resizeWindow();
	
	Thread.sleep(2000);
	mxinst.navigateMaster();
	
	Thread.sleep(2000);
	mxinst.navigateLeavePolicy();
	
	Thread.sleep(2000);
	mxinst.addLeavesForPolicy();
	
	Thread.sleep(2000);
	mxinst.settingforleavedefi();
	
	
	Thread.sleep(2000);
	mxinst.maxLeaveAppliedPerInstance("2");
	
	Thread.sleep(2000);	
	mxinst.updatepolicy();
	
	Thread.sleep(2000);
	mxinst.navigateleave();

	Thread.sleep(2000);
	mxinst.selectapplyleave();
	
	Thread.sleep(2000);
	mxinst.advaneFilter();
	
	Thread.sleep(2000);
	mxinst.load();
	
	Thread.sleep(2000);
	mxinst.applyLeaveForEmployee();
	
	Thread.sleep(2000);	
	mxinst.selectleaveltype();
	
	Thread.sleep(2000);
	mxinst.selectFromdate("02 April 2020");
	
	Thread.sleep(2000);
	mxinst.selectTodate("04 April 2020");
	
	Thread.sleep(2000);
	mxinst.applytheLeave();
	
	Thread.sleep(2000);

    String s = mxinst.getMessageLeave();
    Assert.assertEquals(s,"You are having insufficient leave balance");

	Thread.sleep(2000);
	
	
}
}