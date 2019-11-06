package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.StatePage;

public class StatesValidation extends BaseTest {
	@Test(priority=0)
	public void ValidatioStates_SC_1845() throws Exception{
		StatePage cs=new StatePage(driver);
		cs.clickMastserLink();
		cs.selectState();
		cs.clickCreateButton();
		String s=cs.getMessagestatenameempty();
		Assert.assertEquals(s, "State Name can't be blank");
		Thread.sleep(500);
		cs.enterStateName("Karnataka");
		cs.clickCreateButton();
		String s1=cs.getMessagedublicatestatenameempty();
		Assert.assertEquals(s1, "State name has already been taken");
				
	}
}
