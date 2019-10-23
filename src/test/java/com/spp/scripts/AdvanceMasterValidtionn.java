package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AdvanceMasterValidtion;

public class AdvanceMasterValidtionn extends BaseTest {
	@Test(priority=0)
	public void AdvanceMasterValidtionn_sc_1793() throws Exception{
		
		AdvanceMasterValidtion am = new AdvanceMasterValidtion(driver);
		am.navigateMaster();
		am.clickOnAdvanceMaster();
		am.clickOnADDAdvanceMaster();
		am.enterAdvanceName("");
		am.selectCheckBox();
		am.selectCheckBox();
		am.clickOnCreateAddvance();
		String s1 = am.getAdvanceNameErrorMessage();
		Assert.assertEquals(s1, "Advance Name can't be blank");
		
		Thread.sleep(5000);
		
		am.navigateMaster();
		am.clickOnAdvanceMaster();
		am.clickOnADDAdvanceMaster();
		am.enterAdvanceName("Advance_Bangalore");
		am.selectCheckBox();
		am.selectCheckBox();
		am.clickOnCreateAddvance();
		String s2 = am.getSuccessMessage();
		Assert.assertEquals(s2, "Advance successfully created");
		
		Thread.sleep(5000);
		am.navigateMaster();
		am.clickOnAdvanceMaster();
		am.clickOnADDAdvanceMaster();
		am.enterAdvanceName("Advance_Bangalore");
		am.selectCheckBox();
		am.selectCheckBox();
		am.clickOnCreateAddvance();
		String s3 = am.getAdvanceMasterValidationMessage();
		Assert.assertEquals(s3, "Advance name already have taken");
		
		Thread.sleep(5000);
		
		

}
}
