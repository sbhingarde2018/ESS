package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.InsuranceMasterValidation;

public class InsuranceMasterValidationn extends BaseTest{
	@Test(priority=0)
	public void InsuranceMasterValidation_sc_1780() throws Exception{
		InsuranceMasterValidation IM = new InsuranceMasterValidation(driver);
		IM.navigateMaster();
		Thread.sleep(2000);
		IM.clickOnInsuranceMaster();
		Thread.sleep(2000);
		IM.ClickOnADDNewInsuranceMaster();
		Thread.sleep(2000);
		IM.enterInsuranceMasterName("");
		Thread.sleep(2000);
		IM.selectCheckBox();
		Thread.sleep(2000);
		IM.clickOnCreateInsurance();
		Thread.sleep(2000);
		String S1 = IM.getInsuranceNameError();
		Thread.sleep(2000);
		Assert.assertEquals(S1, "Insurance Name can't be blank");
		Thread.sleep(5000);
		
		IM.navigateMaster();
		Thread.sleep(2000);
		IM.clickOnInsuranceMaster();
		Thread.sleep(2000);
		IM.ClickOnADDNewInsuranceMaster();
		Thread.sleep(2000);
		IM.enterInsuranceMasterName("Master");
		Thread.sleep(2000);
		IM.selectCheckBox();
		Thread.sleep(2000);
		IM.clickOnCreateInsurance();
		Thread.sleep(2000);
		String S2 = IM.getSuccessMessage();
		Thread.sleep(2000);
		Assert.assertEquals(S2, "Insurance successfully created");
		Thread.sleep(5000);
		
		
		IM.navigateMaster();
		Thread.sleep(2000);
		IM.clickOnInsuranceMaster();
		Thread.sleep(2000);
		IM.ClickOnADDNewInsuranceMaster();
		Thread.sleep(2000);
		IM.enterInsuranceMasterName("Master");
		Thread.sleep(2000);
		IM.selectCheckBox();
		Thread.sleep(2000);
		IM.clickOnCreateInsurance();
		Thread.sleep(2000);
		String S3 = IM.getInsuranceMasterErorMessage();
		Thread.sleep(2000);
		Assert.assertEquals(S3, "Insurance name already have taken");
		Thread.sleep(5000);
		
		IM.navigateMaster();
		Thread.sleep(2000);
		IM.clickOnInsuranceMaster();
		Thread.sleep(2000);
		IM.ClickOnADDNewInsuranceMaster();
		Thread.sleep(2000);
		IM.enterInsuranceMasterName("Master_Bangalore");
		Thread.sleep(2000);
		IM.selectCheckBox();
		Thread.sleep(2000);
		IM.clickOnCreateInsurance();
		Thread.sleep(2000);
		String S4 = IM.getSuccessMessage();
		Thread.sleep(2000);
		Assert.assertEquals(S4, "Insurance successfully created");
		Thread.sleep(5000);
		
		

}
	
	
	
	
	
}
