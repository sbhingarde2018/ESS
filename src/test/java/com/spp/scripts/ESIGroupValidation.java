package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddEsiGroupValidation;
import com.spp.pages.DeleteESIGroup;
import com.spp.pages.DeleteESIGroupRate;
import com.spp.pages.EditESIAndESIRate;

public class ESIGroupValidation extends BaseTest {

	@Test(priority=0)
	public void ESIgroupvalidation_SC_1779() throws Exception{
		AddEsiGroupValidation ae=new AddEsiGroupValidation(driver);
		Thread.sleep(5000);
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.clickAddressLink();
		ae.enterESIName("ESI_Bangalore");
		ae.enterESINumber("ESI/BG/01");
		ae.enterESIAddress("Chennai,TN");
		ae.enterESIOffice("CMBT");
		ae.clickCreateESI();
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.clickAddressLink();
		ae.enterESIName("ESI_Bangalore");
		ae.enterESINumber("ESI/BG/01");
		ae.enterESIAddress("Chennai,TN");
		ae.enterESIOffice("CMBT");
		ae.clickCreateESI();
		String s4=ae.getdublicateesiname();
		Assert.assertEquals(s4, "Esi group name has already been taken");
		Thread.sleep(5000);
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.clickAddressLink();
		ae.enterESIName("");
		ae.enterESINumber("");
		ae.enterESIAddress("");
		ae.enterESIOffice("");
		ae.clickCreateESI();
	String s1=ae.getesigroupnameMessage();
		Assert.assertEquals(s1, "ESI Group can't be blank");
		String s2=ae.getesigroupnoMessage();
		Assert.assertEquals(s2, "ESI Number can't be blank");
		String s3=ae.getesigroupaddressMessage();
		Assert.assertEquals(s3, "Address can't be blank");
	}
	@Test(priority=1)
	public void ESIgroupratevalidation_SC_1784() throws Exception{
		AddEsiGroupValidation ae=new AddEsiGroupValidation(driver);
		Thread.sleep(5000);
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.editESIgroup();
		ae.clickESIRateLink();
		ae.selectESIEffectiveDate("Select");
		ae.enteremployeerate("");
		ae.enteremployerrate("");
		ae.entercutoff("");
		ae.enterroundoff("Select");
		ae.clickCreateESIRate();
		String s=ae.geteffectivedatemsg();
		Assert.assertEquals(s, "This field is required.");
		String s1=ae.getempoyeratemsg();
		Assert.assertEquals(s1, "This field is required.");
		String s2=ae.getempoyeratemsg();
		Assert.assertEquals(s2, "This field is required.");
		String s3=ae.getcutoffmsg();
		Assert.assertEquals(s3, "This field is required.");
		String s4=ae.getrounoffmsg();
		Assert.assertEquals(s4, "This field is required.");
		ae.selectESIEffectiveDate("Mar/2020");
		Thread.sleep(5000);
		ae.enteremployeerate("sam");
		ae.enteremployerrate("sam");
		ae.entercutoff("sam");
		ae.enterroundoff("Higher Rupee");
		ae.clickCreateESIRate();
		String s5=ae.getempoyeeratenotnomsg();
		Assert.assertEquals(s5, "Employee rate is not a number");
		String s6=ae.getempoyerratenotnomsg();
		Assert.assertEquals(s6, "Employer rate is not a number");
		String s7=ae.getcutoffnotnomsg();
		Assert.assertEquals(s7, "Cut off is not a number");
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.deleteESIgroup();
		
	}
}
	