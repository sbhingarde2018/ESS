package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddSalaryHead;
import com.spp.pages.CheckAddingSalaryHeadIsAnEarningOrDeductionhead;
import com.spp.pages.CheckOpenComponentAndCalculativeField;
import com.spp.pages.CheckOpenComponentCalculativeFieldDeductionField;
import com.spp.pages.DeleteSalaryHead;
import com.spp.pages.EditSalaryHead;
import com.spp.pages.SalaryHeadExcelUpload;

public class SalaryHeadTestcase extends BaseTest {
	
	@Test(priority=0)
	public void verifycreatedSalaryHead_SC_1() throws Exception{
		AddSalaryHead sh=new AddSalaryHead(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryHeadsLink();
		sh.clickAddSalaryHeadsLink();
		sh.enterSalaryHeadName("Education Allowance");
		sh.enterSalaryHeadShortName("EA2");
		sh.clickOpenComponentRadioButton();
		sh.clickCalcultaiveFieldRadioButton();
		sh.clickConsiderForGratuity();
		sh.clickConsiderForLeaveEncahment();
		sh.clickCreateSalaryHeadButton();
		String s=sh.getMessage();
		Assert.assertEquals(s, "Salary head successfully created");
	}
	@Test(priority=1)
	public void verifyEditedSalaryHead_SC_2() throws Exception{
		EditSalaryHead es=new EditSalaryHead(driver);
		es.navigateMaster();
		es.clickSalaryHeadsLink();
		es.clickEditSalaryHeadsLink();
		es.enterSalaryHeadName("Education Allowance");
		es.enterSalaryHeadShortName("EDU2");
		es.clickOpenComponentRadioButton();
		es.clickCalcultaiveFieldRadioButton();
		es.clickConsiderForLeaveEncahment();
		es.clickConsiderForGratuity();
		es.clickUpdateButton();
		String s=es.getMessage();
		Assert.assertEquals(s, "Salary head succesfully updated");
	}
	@Test(priority=2)
	public void verifyDeletedSalaryHead_SC_3() throws Exception{
		DeleteSalaryHead ds=new DeleteSalaryHead(driver);
		ds.navigateMaster();
		ds.clickSalaryHeadsLink();
		ds.clickDeleteSalaryHeadsButton();
		ds.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		ds.clickDeleteSalaryHeadsButton();
		ds.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		String s=ds.getMessage();
		Assert.assertEquals(s, "Salary head successfully deleted");
	}
	
	@Test(priority=3)
 	public void SalaryHeadExcelUpload_SC_4() throws Exception{
    	SalaryHeadExcelUpload sh=new SalaryHeadExcelUpload(driver);
 		Thread.sleep(5000);
 		sh.navigateMaster();
 		sh.clickSalaryHeads();
 		sh.clickGenerateSampleTemplate();
 		sh.clickExcelTemplateUploadLink();
 		sh.clickChooseFile("C:\\Users\\alfalabs\\Downloads\\SalaryHead.xlsx");
 		Thread.sleep(2000);
 		Thread.sleep(3000);
 		sh.clickUploadLink();
 		String z=sh.getMessage();
 		Assert.assertEquals(z, "Template has been uploaded successfully.");
 		Thread.sleep(2000);
 		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		Thread.sleep(3000);
   		sh.earningSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
   		Thread.sleep(2000);
 		sh.clickDeductionTab();
 		Thread.sleep(2000);
 		//sh.deductionSalaryHeadDelete();//to rerun this testcase delete previous data from salary head>earnings,deduction//	or change data in excel file. 
 		//sh.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=4)
  	public void CheckAddingSalaryHeadIsAnEarningOrDeductionhead_SC_230() throws Exception{
    	CheckAddingSalaryHeadIsAnEarningOrDeductionhead sh=new CheckAddingSalaryHeadIsAnEarningOrDeductionhead(driver);
  		Thread.sleep(5000);
  		sh.navigateMaster();
  		sh.clickSalaryHeads();
  		Thread.sleep(2000);
  		sh.clickAddNewSalaryHead1();
  		sh.clickHeadName("Earning1");
  		sh.clickShortName("EA1");
  		sh.clickEarnings();
  		sh.clickcreateSalaryHeadButton();
  		String q = sh.getMessage();
  		Assert.assertEquals(q, "Salary head successfully created");
  		sh.navigateMaster();
  		//sh.navigateMaster();
  		//sh.navigateMaster();
  		sh.clickSalaryHeads();
  		sh.clickAddNewSalaryHead1();
  		sh.clickHeadName("Deduction1");
  		sh.clickShortName("DE1");
  		sh.clickDeductionBox();
  		sh.clickcreateSalaryHeadButton();
  		String s = sh.getMessage();
  		Assert.assertEquals(s, "Salary head successfully created");
  		sh.clickDeductionTab();
  		Thread.sleep(5000);
  		sh.navigateMaster();
  		sh.clickSalaryHeads();
  	}
	@Test(priority=5)
   	public void CheckOpenComponentAndCalculativeField_SC_231() throws Exception{
    	CheckOpenComponentAndCalculativeField sh=new CheckOpenComponentAndCalculativeField(driver);
   		Thread.sleep(5000);
   		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		sh.clickEdit();
   		Thread.sleep(5000);
   		sh.clickOpenComponent();
   		sh.clickCalculativeField();
   		sh.clickUpdateSalaryHeadButton();
   		String a=sh.getMessage();
   		Assert.assertEquals(a, "Salary head succesfully updated");
   		String b = sh.Earning1CheckYesOpenComponent();
   		Assert.assertEquals(b, "Yes");
   		String c = sh.Earning1CheckYesCalculativeField();
   		Assert.assertEquals(c, "Yes");
	}
	@Test(priority=6)
    public void CheckOpenComponentCalculativeFieldDeductionField_SC_427() throws Exception{
    	CheckOpenComponentCalculativeFieldDeductionField sh=new CheckOpenComponentCalculativeFieldDeductionField(driver);
   		Thread.sleep(5000);
   		sh.navigateMaster();
   		sh.clickSalaryHeads();
   		sh.earningSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
   		Thread.sleep(5000);
   		sh.clickOnDeductionTab();
   		sh.clickEdit();
   		Thread.sleep(3000);
   		sh.clickOpenComponent();
   		sh.clickCalculativeField();
   		sh.clickUpdateSalaryHeadButton();
   		String a=sh.getMessage();
   		Assert.assertEquals(a, "Salary head succesfully updated");
   		sh.clickOnDeductionTab1();
   		String b = sh.deduction1CheckYesOpenComponent();
   		Assert.assertEquals(b, "Yes");
   		String c = sh.deduction1CheckYesCalculativeField();
   		Assert.assertEquals(c, "Yes");
   		sh.deductionSalaryHeadDelete();
   		sh.switchToPopUpAndAccept(driver);
    }
}