package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.SaveDEDUCTORDETAILS;
import com.spp.pages.SaveRESPONSIBLEPERSONDETAILS;
import com.spp.pages.SaveSTATUTORYDETAILS;

public class DeductorDetails extends BaseTest {
	
	@Test(priority=0)
	public void SaveDEDUCTORDETAILS_SC_1201() throws Exception {
		SaveDEDUCTORDETAILS ab=new SaveDEDUCTORDETAILS(driver);
		ab.ClickTDS();
		ab.ClickDedcutorDetails();
		Thread.sleep(3000);
		ab.EnterName("Shubham");
		ab.EnterFlatBlockNo("201");
		ab.EnterCity("Hyderabad");
		ab.EnterPincode("560002");
		ab.SelectState("KARNATAKA");
		ab.SelectAddressChange("No");
		ab.EnterEmail("Shubham@gmail.com");
		ab.ClickSaveBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Data successfully saved.");
		}
	@Test(priority=1)
	public void SaveRESPONSIBLEPERSONDETAILS_SC_1202() throws Exception {
		SaveRESPONSIBLEPERSONDETAILS ab=new SaveRESPONSIBLEPERSONDETAILS(driver);
		ab.ClickTDS();
		ab.ClickDedcutorDetails();
		Thread.sleep(3000);
		ab.ClickResponsiblePersonDetails();
		ab.EnterName("Shubham");
		ab.EnterFlatdoorNo("201");
		ab.EnterPincode("560002");
		ab.EnterPanNumber("QWER678Y");
		ab.SelectSex("Male");
		ab.EnterDesignation("Tester");
		ab.Selectstate("KARNATAKA");
		ab.SelectAddressChange("No");
		ab.clickSaveBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Data successfully saved.");
	}
	@Test(priority=2)
	public void SaveSTATUTORYDETAILS_SC_1203() throws Exception {
		SaveSTATUTORYDETAILS ab=new SaveSTATUTORYDETAILS(driver);
		ab.ClickTDS();
		ab.ClickDedcutorDetails();
		Thread.sleep(3000);
		ab.ClickStatutaryDetails();
		Thread.sleep(2000);
		ab.EnterTAN("DCFG12345R");
		ab.SelectStatus("Government");
		ab.SelectExistingTDSAssesse("No");
		ab.SelectReturnType("Digital");
		//ab.SelectDeductorType("Central Government");
		ab.ClickSave();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Data successfully saved.");
	}
}
