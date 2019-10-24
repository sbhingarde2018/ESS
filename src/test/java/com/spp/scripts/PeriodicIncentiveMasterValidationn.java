package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.PeriodicIncentiveMasterValidation;

public class PeriodicIncentiveMasterValidationn extends BaseTest {

		@Test(priority=0)
		public void PeriodicIncentiveMasterValidationn_sc_1802() throws Exception{
			
			PeriodicIncentiveMasterValidation pm = new PeriodicIncentiveMasterValidation(driver);
			pm.navigateMaster();
			pm.clickOnPeriodicIncentiveMaster();
			pm.clickOnADDPeriodicIncentiveMaster();
			pm.enterPeriodicIncentiveMasterName("");
			pm.selectCheckBox();
			pm.selectCheckBox();
			pm.clickOnCreatePeriodicIncentiveMaster();
			String s1 = pm.getPeriodicIncentiveMasterNameError();
			Assert.assertEquals(s1, "Periodic Incentive Name can't be blank");
			
			Thread.sleep(5000);
			
			
			pm.navigateMaster();
			pm.clickOnPeriodicIncentiveMaster();
			pm.clickOnADDPeriodicIncentiveMaster();
			pm.enterPeriodicIncentiveMasterName("Periodic_Bangalore");
			pm.selectCheckBox();
			pm.selectCheckBox();
			pm.clickOnCreatePeriodicIncentiveMaster();
			String s2 = pm.getSuccessMessage();
			Assert.assertEquals(s2, "Periodic Incentive successfully created");
			
			Thread.sleep(5000);
			
			
			pm.navigateMaster();
			pm.clickOnPeriodicIncentiveMaster();
			pm.clickOnADDPeriodicIncentiveMaster();
			pm.enterPeriodicIncentiveMasterName("Periodic_Bangalore");
			pm.selectCheckBox();
			pm.selectCheckBox();
			pm.clickOnCreatePeriodicIncentiveMaster();
			String s3= pm.getPeriodicIncentiveMasterValidationMessage();
			Assert.assertEquals(s3, "Periodic Incentive name already have taken");
			
			
			
			
		}
	
	

}
