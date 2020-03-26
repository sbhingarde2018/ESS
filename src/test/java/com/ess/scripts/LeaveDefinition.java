package com.ess.scripts;

import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.AddLeaveDefinitions;


import junit.framework.Assert;

public class LeaveDefinition extends BaseTest{
	
	@Test
	public void LeaveDefinition_ess_62() throws Exception{
		 AddLeaveDefinitions LD= new AddLeaveDefinitions(driver);
		 
		LD.navigateMaster();
		
		 LD.navigateLeaveDefinition();
		
		 LD.enterLeaveName("Earn Leave");
		
		 LD.enterShortName("ELl");
		
		 LD.selectLeaveSetting();
		
		 LD.createLeave();
		
		String s=LD.getMessage();
		Assert.assertEquals(s,"Leave definition successfully created.");
		
		

}
}