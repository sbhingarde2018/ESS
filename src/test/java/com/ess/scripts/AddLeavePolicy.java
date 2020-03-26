package com.ess.scripts;

import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.CreateLeavePolicy;

import junit.framework.Assert;

public class AddLeavePolicy   extends BaseTest{
	@Test
	public void CreateLeavePolicy_ess_70() throws Exception{
		CreateLeavePolicy Cl = new CreateLeavePolicy (driver);
		Cl.navigateMaster();
		
		Cl.navigateLeavePolicy();
		
		Cl.AddNewLeavePolicy();
		
		Cl.EnterPolicyName("LeavePloicy");
	
		Cl.EnterPolicyType();
	
		Cl.CreateButton();
		String s=Cl.getMessage();
		Assert.assertEquals(s,"Leave policy master successfully created");
		

}
}

