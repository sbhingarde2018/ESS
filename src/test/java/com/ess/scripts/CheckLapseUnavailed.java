package com.ess.scripts;

import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.CheckLapseUnavailedon;

import junit.framework.Assert;

public class CheckLapseUnavailed extends BaseTest{
	
	@Test
	public void LeaveAddForPolicy_ess_91() throws Exception{
		
		CheckLapseUnavailedon LP = new CheckLapseUnavailedon (driver);
		
		LP.navigateMaster();
	
		LP.navigateLeavePolicy();
		
		LP.addLeavesForPolicy();
		
		LP.settingforleavedefi();
		
		LP.clickOnLapse();
		
	    //LP.clickOnCarryOver();
		
		//LP.selectlaps();
	
		LP.selectlapstype();
		
		LP.selectmonth();
		
		LP.lapsExceeding("5");
	
		LP.updateButtonlectlaps();

		String s=LP.getMessage();
		Assert.assertEquals(s,"Setting was successfully updated.");
		
		
		
	
	

}
}
