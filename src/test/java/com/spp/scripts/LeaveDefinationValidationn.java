package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.LeaveDefinationValidation;

public class LeaveDefinationValidationn extends BaseTest {
	

	@Test(priority=0)
	public void AdvanceMasterValidation_sc_1760() throws Exception{
		
		LeaveDefinationValidation ld = new LeaveDefinationValidation(driver);
		ld.navigateMaster();
		ld.clickOnleavedefinitions();
		ld.enterLeaveName("");
		ld.enterShortName("");
		ld.clickOncreateLeave();
		String s1 = ld.getLeaveNameValidationMessage();
		Assert.assertEquals(s1, "Leave Name can't be blank");
		String s2 = ld.getShortNameValidationMessage();
		Assert.assertEquals(s2, "Short Name can't be blank");
		ld.navigateMaster();
		ld.clickOnleavedefinitions();
		ld.enterLeaveName("CausalLeave_Bangalore");
		ld.enterShortName("CL_BGR");
		ld.clickOncreateLeave();
		String s3 = ld.getSuccessMessage();
		Assert.assertEquals(s3,"Leave definition successfully created." );
		ld.navigateMaster();
		ld.clickOnleavedefinitions();
		ld.enterLeaveName("CausalLeave_Bangalore");
		ld.enterShortName("CL_BGR");
		ld.clickOncreateLeave();
		String s4 = ld.getLeaveErrrorMessage();
		Assert.assertEquals(s4, "Leave name has already been taken");
		String s5 = ld.getShortNameErrrorMessage();
		Assert.assertEquals(s5, "Short name has already been taken");
		
	}

	
}
