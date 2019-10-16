package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.GroupInsuranceMasterValidation;

public class GroupInsuranceMasterValidationn extends BaseTest {
	@Test(priority=0)
	public void GroupInsuranceMasterValidationn_sc_1790() throws Exception{
		GroupInsuranceMasterValidation GM = new GroupInsuranceMasterValidation(driver);
		GM.navigateMaster();
		
		GM.clickOnGroupInsuranceMaster();
		GM.ClickOnADDNewGroupInsuranceMaster();
	
		GM.enterGroupInsuranceMasterName("");
		
		GM.selectCheckBox();
		
		GM.clickOnCreateGroupInsurance();
		
		String S1 = GM.getGroupInsuranceNameError();
		
		Assert.assertEquals(S1, "Group Insurance Name can't be blank");
		
		Thread.sleep(5000);
		
		GM.navigateMaster();
		GM.clickOnGroupInsuranceMaster();
		GM.ClickOnADDNewGroupInsuranceMaster();
		GM.enterGroupInsuranceMasterName("Group_Insurance_For_Bangalore");
		GM.selectCheckBox();
		GM.clickOnCreateGroupInsurance();
		String S2 = GM.getSuccessMessage();
		Assert.assertEquals(S2, "Group Insurance successfully created");
		
		Thread.sleep(5000);
		
		GM.navigateMaster();
		GM.clickOnGroupInsuranceMaster();
		GM.ClickOnADDNewGroupInsuranceMaster();
		GM.enterGroupInsuranceMasterName("Group_Insurance_For_Bangalore");
		GM.selectCheckBox();
		GM.clickOnCreateGroupInsurance();
		String S3 = GM.getGroupInsuranceMasterErorMessage();
		Assert.assertEquals(S3, "Group Insurance name already have taken");
		
		Thread.sleep(5000);
		
		GM.navigateMaster();
		GM.clickOnGroupInsuranceMaster();
		GM.ClickOnADDNewGroupInsuranceMaster();
		GM.enterGroupInsuranceMasterName("Group_Insurance_For_Mumbai");
		GM.selectCheckBox();
		GM.clickOnCreateGroupInsurance();
		String S4 = GM.getSuccessMessage();
		Assert.assertEquals(S4, "Group Insurance successfully created");
		
		Thread.sleep(5000);
		
		
}
	
	
	
	

}
