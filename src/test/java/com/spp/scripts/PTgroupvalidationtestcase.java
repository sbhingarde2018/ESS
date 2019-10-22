package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.PTGroupValidation;

public class PTgroupvalidationtestcase extends BaseTest {
/*
	@Test(priority=0)//not running default pt group slab not present
	public void PTGroupValidationSC_1795() throws Exception{
		PTGroupValidation pt=new PTGroupValidation(driver);
		Thread.sleep(3000);
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("PT_Bangalore");
		pt.selectState("Karnataka");
		pt.enterPTAddress("Bangalore");
		pt.selectReturnType("Half Yearly");
		pt.clickCreatePT();
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("");
		pt.selectState("");
		pt.enterPTAddress("");
		pt.selectReturnType("");
		pt.clickCreatePT();
		String s=pt.getPTGroupMessage();
		Assert.assertEquals(s, "PT Group name can't be blank");
		String s1=pt.getPTSateMessage();
		Assert.assertEquals(s1, "State can't be blank");
		String s2=pt.getPTAddressMessage();
		Assert.assertEquals(s2, "Address can't be blank");
		String s3=pt.getPTreturnperiodMessage();
		Assert.assertEquals(s3, "Return Type can't be blank");
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("PT_Bangalore");
		pt.selectState("Karnataka");
		pt.enterPTAddress("Bangalore");
		pt.selectReturnType("Half Yearly");
		pt.clickCreatePT();
		String s4=pt.getPTGroupDublicateMessage();
		Assert.assertEquals(s4, "Name has already been taken");
	}*/
	@Test(priority=1)//not running default pt group slab not present
	public void PTGrouprateValidationSC_1805() throws Exception{
		PTGroupValidation pt=new PTGroupValidation(driver);
		Thread.sleep(3000);
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.EditPTGroupButton();
		pt.clickPTRate();
		pt.selectEffectiveFrom("Select");//checking effective date is empty
		pt.clickPTGroupRateButton();
		String s=pt.getPTEffDateMessage();
		Assert.assertEquals(s, "This field is required.");
		pt.selectEffectiveFrom("Mar/2019");
		pt.clickPTGroupRateButton();
		pt.selectEffectiveFrom("Mar/2019");
		pt.clickPTGroupRateButton();//checking effective date is dublicate
		String s1=pt.geteEffDateDublicateMessage();
		Assert.assertEquals(s1, "Pt group has already been taken");
		pt.clickSettingsLink();
		pt.clickCreatePTRate();//Checking PT amount and minimum salary is not empty
		String s2=pt.getPTMinimumSalaryMessage();
		Assert.assertEquals(s2, "Min sal range can't be blank");
		String s3=pt.getPTAmountMessage();
		Assert.assertEquals(s3, "Pt can't be blank");
		pt.enterMinimumSalary("yh");
		pt.enterPTAmount("yh");
		pt.clickCreatePTRate();//Checking PT amount and minimum salary not a number
		Thread.sleep(400);
        String s4=pt.getMinSalaryNotaNoMessage();
		Assert.assertEquals(s4, "Min sal range is not a number");
		String s5=pt.getPTNotaNoMessage();
		Assert.assertEquals(s5, "Pt is not a number");
	}
}
