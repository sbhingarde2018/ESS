package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.BulkSalaryRateAllot;
import com.spp.pages.CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule;

public class BulkSalaryRateDetails extends BaseTest {
	
	@Test(priority=0)
	public void BulkSalaryRateAllot_SC_101() throws Exception { 
	BulkSalaryRateAllot bb=new BulkSalaryRateAllot(driver);
		bb.clickEmployeeLink();
		bb.selectBulkSalaryRateDetails();
		bb.selectPayMonth("Mar/2019");
		bb.selectSalaryStructure("Structure");
		bb.resizeWindow();
		Thread.sleep(2000);
		bb.selectGetEmployees();
		Thread.sleep(2000);
		bb.selectLoad();
		Thread.sleep(2000);
		bb.exitFullscreen();
		String i=bb.getMessage();
		Assert.assertEquals(i, "Employees Successfully Loaded.");
		Thread.sleep(10000);
		bb.selectMoreButton();
		bb.enterBasic("9000");
		bb.selectPopulateButton();
		Thread.sleep(5000);
		String q=bb.getMessage();
		Assert.assertEquals(q, "Employees Salary successfully Populated.");
		Thread.sleep(3000);
		bb.selectSaveValues();
		Thread.sleep(2000);
		String r=bb.getMessage();
		Assert.assertEquals(r, "Employees Salary successfully Updated.");
		Thread.sleep(3000);
		bb.selectCloseButton();
		}
	
	@Test(priority=1)
	public void CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule_SC_467() throws Exception { 
	CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule be=new CheckifEmployeeBulkSalaryRateDetailsGeneralLinksSalaryHeadsredirectstoMastermodule(driver);
		be.clickonemployee();
		be.clickonbulksalaryratedetails();
		Thread.sleep(2000);
		//be.clickongenerallink();
		//Thread.sleep(2000);
		be.clickonsalaryhead();
		Thread.sleep(4000);
		be.addnewsalhead();
		be.enterheadname("Gross_Salary");
		be.entershortname("GROSSS");
		be.createsalaryhead();
		Thread.sleep(1000);
		String message = be.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
		Thread.sleep(3000);
		be.ClickDelete();
		Thread.sleep(1000);
		}

}
