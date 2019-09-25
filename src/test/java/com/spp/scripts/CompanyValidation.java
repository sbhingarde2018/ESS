package com.spp.scripts;

import java.io.File;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.EditCompanydetailsValidation;
import com.spp.pages.Editcompanydetails;

import junit.framework.Assert;

public class CompanyValidation extends BaseTest{
	
	@Test(priority=0)
	public void verifyEditCompany_SC_46C() throws Exception{  
		EditCompanydetailsValidation ed=new EditCompanydetailsValidation(driver);
		Thread.sleep(5000);
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickEditCompany();
		File file = new File(INPUT_PATH);
		ed.companylogo(file.getAbsolutePath());
		ed.updateCompanyButton();
		String s6=ed.getMessageinvalidlogo();
		Assert.assertEquals(s6,"Photo is invalid");
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickEditCompany();
		ed.enterCompanyName("");
		ed.enterResponsiblePerson("");
		ed.enterEstablishmentDate("");
		ed.enterPhoneNo1("");
		ed.enterAddress1("");
		ed.enterPhoneNo2("");
		ed.enterEmail("");
		ed.enterAddress2("West of chord Road, Bengaluru");
		ed.enterAddress3("Karnataka 560086");
		ed.enterWebsite("www.relyon.com");
		ed.selectTAN("ADD TAN");
		ed.selectCompanyType("Public Sector Unit(PSU)");
		ed.enterTANNumber("DCFG12345R");
		ed.updateCompanyButton();
		String s=ed.getMessageCompanyname();
		Assert.assertEquals(s,"Company Name can't be blank");
		String s1=ed.getMessageResopnseperson();
		Assert.assertEquals(s1,"Responsible Person can't be blank");
		String s2=ed.getMessageEstablishdate();
		Assert.assertEquals(s2,"Established Date can't be blank");
		String s3=ed.getMessagePhoneno();
		Assert.assertEquals(s3,"Phone Number 1 can't be blank");
		String s4=ed.getMessageAddress();
		Assert.assertEquals(s4,"Address Line 1 can't be blank");
		String s5=ed.getMessageEmail();
		Assert.assertEquals(s5,"Email can't be blank");
		
		
		//String s=ed.getMessage();
		//Assert.assertEquals(s,"Company was successfully updated.");
	}
}
