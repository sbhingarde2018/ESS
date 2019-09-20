package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.BulkIncrementUpdate;
//import com.spp.pages.BulkSalaryRateAllot;
import com.spp.pages.CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule;
//import com.spp.pages.CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule;
public class BulkIncrementDetails extends BaseTest {


	@Test(priority=0)
	public void BulkIncrementUpdate_SC_102() throws Exception { 
	BulkIncrementUpdate aa=new BulkIncrementUpdate(driver);
		aa.clickEmployeeLink();
		aa.selectBulkIncrementDetails();
		aa.selectPayMonth("Mar/2019");
		aa.selectSalaryStructure("Structure");
		Thread.sleep(2000);
		aa.selectSalaryHead("Basic");
		aa.selectGetValues();
		aa.resizeWindow();
		Thread.sleep(3000);
		aa.selectLoad();
		Thread.sleep(2000);
		aa.exitFullscreen();
		aa.uncheckCheckbox();
		aa.enterByAmount("2000");
		aa.selectIncrementButton();
		Thread.sleep(2000);
		aa.selectSaveValues();
		Thread.sleep(2000);
		String s=aa.getMessage();
		Assert.assertEquals(s, "Employees Salary Successfully Updated.");
		}
	
	@Test(priority=1)
	public void CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule_SC_468() throws Exception { 
	CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule be=new CheckifEmployeeBulkIncrementsDetailsGeneralLinksSalaryHeadsredirectstoMastermodule(driver);
		be.clickonemployee();
		be.clickonbulkincrementdetails();
		Thread.sleep(2000);
		//be.clickongenerallink();
		//Thread.sleep(2000);
		be.clickonsalaryhead();
		Thread.sleep(2000);
		be.addnewsalhead();
		be.enterheadname("Gross Salary");
		be.entershortname("GROSSS");
		be.createsalaryhead();
		String message = be.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
		Thread.sleep(3000);
		be.ClickDelete();
		}
	
}