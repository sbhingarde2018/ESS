package com.spp.scripts;
import junit.framework.Assert;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;

import com.spp.generics.Utility;
import com.spp.pages.AddESIGroup;
import com.spp.pages.AddPFGroup;
import com.spp.pages.AddPTGroup;
import com.spp.pages.AssignPFGroupToBranch;
import com.spp.pages.AssignigESIGroupToBranch;
import com.spp.pages.AssignigPTGroupToBranch;
import com.spp.pages.BranchPage;
import com.spp.pages.DeleteAssignedESIGroupInBranch;
import com.spp.pages.DeleteAssignedPFGroupinBranch;
import com.spp.pages.DeleteAssignedPTGroupInBranch;
import com.spp.pages.DeleteBranch;
import com.spp.pages.DeleteESIGroup;
import com.spp.pages.DeleteESIGroupRate;
import com.spp.pages.DeletePFGroup;
import com.spp.pages.DeletePFGroupRate;
import com.spp.pages.DeletePTGroup;
import com.spp.pages.DeletePTGroupRate;
import com.spp.pages.DeleteUploadedDocument;
import com.spp.pages.DownloadUploadedDocument;
import com.spp.pages.EditAssignedESIGroupInBranch;
import com.spp.pages.EditAssignedPFGroupInBranch;
import com.spp.pages.EditAssignedPTGroupInBranch;
import com.spp.pages.EditBranch;
import com.spp.pages.EditESIAndESIRate;
import com.spp.pages.EditPFGroupandPFRate;
import com.spp.pages.EditPTGroup;
import com.spp.pages.Editcompanydetails;
import com.spp.pages.UploadDownloadDeleteDocument;
import com.spp.pages.UploadaDocument;

public class CompanyTestcase01 extends BaseTest{

	@Test(priority=0)
	public void verifyEditCompany_SC_46C() throws Exception{  
		Editcompanydetails ed=new Editcompanydetails(driver);
		Thread.sleep(5000);
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickEditCompany();
		ed.enterCompanyName("Relyon soft");
		ed.enterResponsiblePerson("Krishna murthy");
		ed.enterEstablishmentDate("05 March 2000");
		ed.enterPhoneNo1("9988776655");
		ed.enterAddress1("#73, Shreelekha Complex");
		ed.enterPhoneNo2("2234587");
		ed.enterEmail("relyonsoft@gmail.com");
		ed.enterAddress2("West of chord Road, Bengaluru");
		ed.enterAddress3("Karnataka 560086");
		ed.enterWebsite("www.relyon.com");
		ed.selectTAN("ADD TAN");
		ed.selectCompanyType("Public Sector Unit(PSU)");
		ed.enterTANNumber("DCFG12345R");
		ed.updateCompanyButton();
		String s=ed.getMessage();
		Assert.assertEquals(s,"Company was successfully updated.");
	}
	@Test(priority=1)
	public void verifyBranchPage_SC_47_54_55_56() throws Exception{
		BranchPage bp=new BranchPage(driver);
		Thread.sleep(5000);
		bp.navigateMaster();;
		bp.clickCompanayLink();
		bp.clickBranchLink();
		bp.clickAddBranchLink();
		bp.enterBranchName("Chennai");//CHANGE
		bp.enterReponsiblePersonName("Kavitha");
		Thread.sleep(3000);
		bp.enterBranchAddress("ChennaiA");
		bp.enterBranchState("TamilnaduA");
		bp.clickCreateBranchButton();
		String s=bp.getBranchMessage();
		Assert.assertEquals(s, "Branch was successfully created");
		Thread.sleep(3000);
		bp.clickPFDetail();
		Thread.sleep(3000);
		bp.selectPFGroup("Default");
		Thread.sleep(2000);
		bp.selectmonthoption();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreatePFDetail();
		String s1=bp.getPFMessage();
		Assert.assertEquals(s1, "PF detail successfully created.");
		Thread.sleep(3000);
		bp.clickESIDetail();
		bp.selectESIGroup("Default");
		bp.selectmonthoption();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreateESIdetail();
		String s2=bp.getESIMessage();
		Assert.assertEquals(s2,"ESI detail successfully created.");
		Thread.sleep(5000);
		bp.clickPTDetail();
		Thread.sleep(2000);
		bp.selectPTGroup("Default");
		bp.selectmonthoption();
		Thread.sleep(2000);
		bp.selectmonth();
		bp.clickCreatePTDetail();
		String s3=bp.getPTMessage();
		Assert.assertEquals(s3, "PT detail successfully created.");
	}
	
	
	
	@Test(priority=2)
	public void veifyUpdatedBranch_SC_177C() throws Exception{
		EditBranch ed=new EditBranch(driver);
		ed.navigateMaster();
		ed.clickCompanayLink();
		ed.clickBranchLink();
		ed.clickEditBranchLink();
		ed.enterBranchName("Chennai");
		ed.enterReponsiblePersonName("Raju");
		ed.enterBranchAddress("#25,CMBT,Chennai");
		ed.clickUpdateBranchButton();
		String s=ed.getMessage();
		Assert.assertEquals(s, "Branch details successfully updated.");
	}
	
	
	@Test(priority=3)
	public void verifyEditAssignedPFGroupInBranch_SC_178C() throws Exception{
		EditAssignedPFGroupInBranch db=new EditAssignedPFGroupInBranch(driver);//pf group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPFDetailTab();
		db.clickEditPFGroup();
		db.editeffectivedate("01 January 2013"); 
		Thread.sleep(2000);
		db.updatepfdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "PF detail successfully updated.");
	
}
	@Test(priority=4)
	public void verifyEditAssignedESIGroupInBranch_SC_179C() throws Exception{
		EditAssignedESIGroupInBranch db=new EditAssignedESIGroupInBranch(driver);//esi group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickESIDetailTab();
		db.clickEditESIGroup();
		db.editeffectivedate("01 January 2013"); 
		Thread.sleep(2000);
		db.updateESIdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "ESI detail successfully updated.");
}
	
	@Test(priority=5)
	public void verifyEditAssignedPTGroupInBranch_SC_180C() throws Exception{
		EditAssignedPTGroupInBranch db=new EditAssignedPTGroupInBranch(driver);//pt group should be present
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPTDetailTab();
		db.clickEditPTGroup();
		db.editeffectivedate("01 January 2013"); 
		Thread.sleep(2000);
		db.updatepTdetail();
		String s=db.getMessage();
		Assert.assertEquals(s, "PT detail successfully updated.");
	} 
	
	
	
	
	@Test(priority=6)
	public void verifyDeleteAssignedPFGroupInBranch_SC_424() throws Exception{
		DeleteAssignedPFGroupinBranch db=new DeleteAssignedPFGroupinBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonpfdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"PF details successfully deleted.");
		
	}
	@Test(priority=7)
	public void verifyDeleteAssignedESIGroupInBranch_SC_425() throws Exception{
		DeleteAssignedESIGroupInBranch db=new DeleteAssignedESIGroupInBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonESIdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"ESI details successfully deleted.");
		
	}
	@Test(priority=8)
	public void verifyDeleteAssignedPTGroupInBranch_SC_426() throws Exception{
		DeleteAssignedPTGroupInBranch db=new DeleteAssignedPTGroupInBranch(driver);
		db.navigateMaster();
		db.clickoncompany();
		db.clickonbranch();
		Thread.sleep(1000);
		db.clickonedit();
		Thread.sleep(1000);
		db.clickonPTdetail();
		Thread.sleep(1000);
		db.clickondelete();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickondelete();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s,"PT details successfully deleted.");
		
	}
	
	@Test(priority=9)
	public void verifyDeletedBranch_SC_181C() throws Exception{
		DeleteBranch db=new DeleteBranch(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickDeleteBranchButton();
		db.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		db.clickDeleteBranchButton();
		db.switchToPopUpAndAccept(driver);
		String s=db.getMessage();
		Assert.assertEquals(s, "Branch is successfully destroyed.");
	} 
	
	@Test(priority=10)
	public void UploadDocument_SC_57() throws Exception{
		UploadaDocument up=new UploadaDocument(driver);//DELETE DOCUMENT BEFORE RUNNING
		up.clickonmaster();
		up.clickoncompany();
		Thread.sleep(2000);
		up.clickondocument();
		Thread.sleep(2000);
		up.addnewdocument();
		up.uploadfile("C:\\Users\\alfalabs\\Documents\\Document1.xlsx");
		Thread.sleep(2000);
		up.enterremarks("Upload file");
		Thread.sleep(2000);
		up.uploadnewdocument();
		String s=up.getMessage();
		Assert.assertEquals(s,"Company Document Was Successfully Uploaded");	
	}
	
	@Test(priority=11)
	public void DownloadUploadedDocument_SC_183() throws Exception{
		DownloadUploadedDocument du=new DownloadUploadedDocument(driver);
		du.clickonmaster();
		du.clickoncompany();
		Thread.sleep(2000);
		du.clickondocument();
		Thread.sleep(2000);
		du.clickondownload();
		
	}
	
	@Test(priority=12)
	public void verifyDeleteUploadedDocument_SC_184C() throws Exception{
		DeleteUploadedDocument db=new DeleteUploadedDocument(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickDocumentLink();
		db.clickDeleteButton();
		String f=db.getMessage();
		Assert.assertEquals(f, "Company Document Was Successfully Deleted");
	}
	
	/*@Test(priority=13)
	public void verifyPFGroupCreated_SC_48_49() throws Exception{
		AddPFGroup ag=new AddPFGroup(driver);
		ag.navigateMaster();
		ag.clickCompanayLink();
		ag.clickAddPFLink();
		ag.enterPFGroupName("PF_1");
		ag.enterPFNumber("KN/45889");
		ag.enterDBFileCode("IFC0001");
		ag.enterExtension("1");
		ag.enterPFAddress("Chennai");
		ag.clickPFCreateButton();
		Thread.sleep(3000);
		ag.clickPFRateLinkButton();
		Thread.sleep(2000);	
		ag.selectEffectiveDate("May/2013");
		ag.clickPFGroupRateButton();
		String s=ag.getMessage();
		Assert.assertEquals(s, "PF group rate successfully created.");
	} 
	
	@Test(priority=14)
	public void verifyESIGroupCreated_SC_50_51() throws Exception{
		AddESIGroup ae=new AddESIGroup(driver);
		Thread.sleep(5000);
		ae.navigateMaster();
		ae.clickCompanayLink();
		ae.clickESILink();
		ae.clickAddressLink();
		ae.enterESIName("ESI_1");
		ae.enterESINumber("cn/23456SD58DE6787");
		ae.enterESIAddress("Chennai,TN");
		ae.enterESIOffice("CMBT");
		ae.clickCreateESI();
		Thread.sleep(5000);
		ae.clickESIRateLink();
		ae.selectESIEffectiveDate("May/2013");
		ae.clickCreateESIRate();
		String s=ae.getMessage();
		Assert.assertEquals(s, "ESI group rate successfully created.");
	}
	
	@Test(priority=15)//not running default pt group slab not present
	public void verifyPTGroupCreatedSC_52_53() throws Exception{
		AddPTGroup pt=new AddPTGroup(driver);
		Thread.sleep(3000);
		pt.navigateMaster();
		pt.clickCompanayLink();
		pt.clickPTLink();
		pt.clickAddPTLink();
		pt.enterPTGroupName("PT_1");
		pt.selectState("mah");
		pt.enterPTAddress("maha");
		pt.enterPTOCircleNumber("123");
		pt.enterPTCertificateNumber("RE1234");
		pt.selectReturnType("Half Yearly");
		pt.clickCreatePT();
		Thread.sleep(3000);
		pt.clickPTRate();
		pt.selectEffectiveFrom("May/2013");
		pt.clickPTGroupRateButton();
		Thread.sleep(3000);
		pt.clickSettingsLink();
		pt.clickFillDefaultButton();	
		String s=pt.getMessage();
		Assert.assertEquals(s, "PT group rate successfully created");
	}
	
	@Test(priority=16)	
	public void verifyUpdatePFGroup_SC_187_203() throws Exception{
		EditPFGroupandPFRate ep=new EditPFGroupandPFRate(driver);
		Thread.sleep(5000);
		ep.navigateMaster();
		ep.clickCompanayLink();
		ep.clickEditPFGroup();
		ep.enterPFGroupName("PF-1");
		ep.enterPFNumber("CN/20317fTudxszc888");
		ep.enterDBFileCode("234355");
		ep.enterExtension("2");	
		ep.enterPFAddress("Sholinganltlure,Chetnnai.");
		ep.clickUpdatePFButton();
		ep.clickPFRateLinkButton();
		Thread.sleep(5000);
		//ep.clickEditPFRateButton();
		ep.selectEffectiveFrom("Aug/2017");
		Thread.sleep(5000);
		ep.enterEPFValue("10");
		ep.enterCutoffValue("000");
		ep.enterAccountNO2("1");
		ep.enterPensionFund("8.34");
		ep.enterAccountNo21("0.1");
		ep.enterAccountNo22("0.1"); 
		Thread.sleep(1000);
		ep.clickUpdatePFRateButton();
		String s=ep.getMessage();
		Assert.assertEquals(s, "PF group rate successfully updated.");
	}  
	
	@Test(priority=17)
	public void verifyDeletedPFGroup_SC_192() throws Exception{   
		DeletePFGroup dg=new DeletePFGroup(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		dg.clickPFGroupLink();
		dg.clickDeletePFGroupButton();
		Thread.sleep(2000);
		dg.switchToPopUpAndDismiss();
		Thread.sleep(3000);
		dg.clickDeletePFGroupButton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"PF group successfully deleted");
		}
	
	@Test(priority=18)
	public void verifyUpdateESIGroup_SC_195_206() throws Exception{ 
		EditESIAndESIRate er=new EditESIAndESIRate(driver);
		Thread.sleep(5000);
		er.navigateMaster();
		er.clickCompanayLink();
		er.clickESILink();
		er.clickEditESILink();
		er.enterESIName("ESI-1");
		er.enterESINumber("123645FS678CS9");
		er.enterESIAddress("Shollinganallure,Chennai");
		er.enterESIOffice("Techpark");
		er.clickupdateESIButton();
		Thread.sleep(2000);
		er.clickESILink();
		er.clickEditESILink();
		Thread.sleep(2000);
		er.clickESIRateLink();
		Thread.sleep(2000);
		er.clickEditESIRateIcon();
		Thread.sleep(3000);
		er.enterEmployeeRate("1.25");
		er.enterEmployerRate("10");
		er.enterCutOff("1010");
		er.enterMinimumLimit("65");
		Thread.sleep(3000);
		er.clickUpdateESIRateButton();
		Assert.assertEquals("ESI group rate successfully updated", "ESI group rate successfully updated");
	}
	
	@Test(priority=19)
	public void verifyDeletedESIGoup_SC_197() throws Exception{
		DeleteESIGroup de=new DeleteESIGroup(driver);
		de.navigateMaster();
		de.clickCompanayLink();
		de.clickESILink();
		Thread.sleep(2000);
		de.clickDeleteEditESIGroupButton();
		de.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		de.clickDeleteEditESIGroupButton();
		de.switchToPopUpAndAccept(driver);
		String s=de.getMessage();
		Assert.assertEquals(s, "ESI group successfully deleted");
	}
	
	@Test(priority=20)
	public void verifyUpdatePTGroup_SC_199_209() throws Exception{
		EditPTGroup ep=new EditPTGroup(driver);
		Thread.sleep(2000);
		ep.navigateMaster();
		ep.clickCompanayLink();
		ep.clickPTLink();
		ep.clickEditPTGroup();
		ep.enterPTGroupName("PT-103");
		ep.enterPTAddress("#25,chennai1");
		ep.enterPTCertificateNumber("234563");
		ep.enterPTOCircleNumber("65783474");
		ep.clickPTLock();
		ep.clickUpdatePTGroupButton();
		Thread.sleep(3000);
		ep.clickPTRate();
		Thread.sleep(2000);
		ep.clickSettingsLink();
		ep.clickEditPTRateLink();
		Thread.sleep(2000);
		ep.enterMinimumField("700");
		ep.enterPTField("20");
		ep.selectCategory("f");
		ep.clickUpdatePTRate();	
		String s=ep.getMessage();
		Assert.assertEquals(s,"PT rate successfully updated.");
	}
	
	@Test(priority=21)
	public void verifyDeletedPTGroup_SC_202() throws Exception{
		DeletePTGroup dpg=new DeletePTGroup(driver);
		//Thread.sleep(1000);
		dpg.navigateMaster();
		dpg.clickCompanayLink();
		dpg.clickPTLink();
		Thread.sleep(2000);
		dpg.clickDeleteFirstPT();
		Thread.sleep(2000);
		dpg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dpg.clickDeleteFirstPT();
		Thread.sleep(1000);
		dpg.switchToPopUpAndAccept(driver);
        String s=dpg.getMessage();
        Assert.assertEquals(s, "PT Group was successfully deleted.");
	} 
	
	@Test(priority=22)
	public void verifyDeletedPFGroup_SC_204() throws Exception{   
		DeletePFGroupRate dg=new DeletePFGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(2000);
		dg.clickonpf();
		dg.clickedit();
		Thread.sleep(2000);
		dg.clickPFRateLinkButton();
		dg.clickdeletepfratebutton();
		dg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dg.clickdeletepfratebutton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"PF group rate successfully deleted.");
		
}
	
	@Test(priority=23)
	public void verifyDeletedESIGroup_SC_208() throws Exception{   
		DeleteESIGroupRate dg=new DeleteESIGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(4000);
		dg.clickESIGroup();
		dg.clickEditLink();
		dg.clickESIRate();
		dg.clickDeleteButton();
		dg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dg.clickDeleteButton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"ESI group rate successfully deleted.");
		
}
	
	@Test(priority=24)
	public void verifyDeletedPTGroup_SC_211() throws Exception{   
		DeletePTGroupRate dg=new DeletePTGroupRate(driver);
		Thread.sleep(3000);
		dg.navigateMaster();
		dg.clickCompanayLink();
		Thread.sleep(4000);
		dg.clickPTGroup();
		dg.clickEditLink();
		dg.clickPTRate();
		dg.clickSettings();
		dg.clickDeleteButton();
		dg.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dg.clickDeleteButton();
		dg.switchToPopUpAndAccept(driver);
		String s=dg.getMessage();
		Assert.assertEquals(s,"PT Rate successfully deleted");
	}
	
	/*@Test(priority=25)
	public void verifyAssignPFGroupToBranch_SC_54C() throws Exception{
		AssignPFGroupToBranch db=new AssignPFGroupToBranch(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPFDetailTab();
		db.selectPFGroup("Default");
		db.enterEffectiveFrom("May/2018");                      //created PF Group data needs to delete (sol:Take random dates from calender)
		db.ClickCreatePfDetails();
		String s=db.getMessage();
		Assert.assertEquals(s, "PF detail successfully created.");
		}	
	
	@Test(priority=13)
	public void verifyAssignigESIGroupToBranch_SC_55C() throws Exception{
		AssignigESIGroupToBranch db=new AssignigESIGroupToBranch(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickESIDetailTab();
		db.selectESIGroup("Default");
		db.enterEffectiveFrom("May/2018");                      //created PF Group data needs to delete (sol:Take random dates from calender)
		db.ClickCreateESIDetail();
		Thread.sleep(2000);
		String s=db.getMessage();
		Assert.assertEquals(s, "ESI detail successfully created.");
		}	

	@Test(priority=14)
	public void verifyAssignigPTGroupToBranch_SC_56C() throws Exception{
		AssignigPTGroupToBranch db=new AssignigPTGroupToBranch(driver);
		db.navigateMaster();
		db.clickCompanayLink();
		db.clickBranchLink();
		db.clickEditlink();
		db.clickPTDetailTab();
		db.selectPTGroup("kolhapur");
		db.enterEffectiveFrom("May/2018");           //created PF Group data needs to delete (sol:Take random dates from calender)
		db.ClickCreatePTDetail();
		Thread.sleep(2000);
		String s=db.getMessage();
		Assert.assertEquals(s, "PT detail successfully created.");
		}	*/
	

	
}