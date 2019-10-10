package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddPFGroupValidation;

public class PFgroupvalidationtestcase extends BaseTest{

	@Test(priority=0)
	public void PFGroupValidation_SC_1748() throws Exception{
		AddPFGroupValidation ag=new AddPFGroupValidation(driver);
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickAddPFLink();
		ag.enterPFGroupName("PF_Test");
		ag.enterPFNumber("KN/45669");
		ag.enterPFAddress("Bangalore");
		ag.clickPFCreateButton();
		Thread.sleep(1000);
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickAddPFLink();
		ag.enterPFGroupName("");
		ag.enterPFNumber("");
		ag.enterDBFileCode("IFC0001");
		ag.enterExtension("1");
		ag.enterPFAddress("");
		ag.clickPFCreateButton();
		String s=ag.getMessage_Pfname();//checking mandatory fields
		Assert.assertEquals(s, "PF Group can't be blank");
		String s1=ag.getMessage_Pfno();
		Assert.assertEquals(s1, "PF Number can't be blank");
		String s3=ag.getMessage_Pfaddress();
		Assert.assertEquals(s3, "Address can't be blank");
		ag.enterPFGroupName("PF_Test");
		ag.enterPFNumber("KN/45669");
		ag.enterPFAddress("Bangalore");
		ag.clickPFCreateButton();
		String s4=ag.getMessage_Pfnamedublicate();//checkin dublicate pf name and no
		Assert.assertEquals(s4, "Pf group has already been taken");
		String s5=ag.getMessage_Pfnodublicate();
		Assert.assertEquals(s5, "Pf number has already been taken");
		

	}
	@Test(priority=1)
	public void PFGroupRateValidation_SC_1749() throws Exception{
		AddPFGroupValidation ag=new AddPFGroupValidation(driver);
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickPFgroupEdit();
		Thread.sleep(100);
		ag.clickPFRateLinkButton();
		ag.selectEffectiveDate("");
		ag.enterepfa("");
		ag.entercutoff("");
		ag.enteraccountno2("");
		ag.enterpensionfund("");
		ag.enteraccountno21("");
		ag.enteraccountno22("");
		Thread.sleep(100);
		ag.clickPFGroupRateButton();
		String s=ag.getMessagePaymonthEmpty();//checking mandatory fields
		Assert.assertEquals(s, "This field is required.");
		String s1=ag.getMessageepf();
		Assert.assertEquals(s1, "This field is required.");
		String s2=ag.getMessagecutoff();
		Assert.assertEquals(s2, "This field is required.");
		String s3=ag.getMessageaccountno2();
		Assert.assertEquals(s3, "This field is required.");
		String s4=ag.getMessagePensionfun();
		Assert.assertEquals(s4, "This field is required.");
		String s5=ag.getMessageaccountno21();
		Assert.assertEquals(s5, "This field is required.");
		String s6=ag.getMessageaccountno22();
		Assert.assertEquals(s6, "This field is required.");
        ag.enterepfa("12");
		ag.enterpensionfund("8.33");
		ag.clickPFGroupRateButton();
		String s7=ag.getMessageverifyepfa_b();//EPF(A-B) displaying correct value
		Assert.assertEquals(s7, "3.67");
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickDeletePFButton();
        }
	
	
}
