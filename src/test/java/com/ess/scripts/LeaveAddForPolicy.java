package com.ess.scripts;

import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.AddleavestoLeavePolicy;

import junit.framework.Assert;

public class LeaveAddForPolicy  extends BaseTest {
	@Test
	public void LeaveAddForPolicy_ess_71() throws Exception{
		
		AddleavestoLeavePolicy ALP = new AddleavestoLeavePolicy(driver) ;
		
		ALP.navigateMaster();
		Thread.sleep(2000);
		ALP.navigateLeavePolicy();
		Thread.sleep(2000);
		ALP.addLeavesForPolicy();
		Thread.sleep(2000);
		ALP.selectLeaveType();
		Thread.sleep(2000);
		ALP.addButton();
		Thread.sleep(2000);
		String s= ALP.getMessage();
		Assert.assertEquals(s,"Leave policy setting was successfully created.");

}
}
