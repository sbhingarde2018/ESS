	package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddClassificationviaExcelUpload;
import com.spp.pages.AddClasssificationDetails;
import com.spp.pages.AssignEmployee;
import com.spp.pages.CheckAssignedClassificationDetailsCanBeDeletedOrNot;
import com.spp.pages.CheckForDuplicateClassificationHeadingAndDisplayOrder;
import com.spp.pages.CreateClassification;
import com.spp.pages.DeleteClassification;
import com.spp.pages.DeleteClassificationDetails;
import com.spp.pages.EditClassification;
import com.spp.pages.EditClasssificationDetails;

public class Classifications extends BaseTest {
	
	/*@Test(priority=0)
	public void verifyCreatedClassification_SC_62(){
		CreateClassification cc=new CreateClassification(driver);
		cc.clickMastserLink();
		cc.selectClassifications();
		cc.enterClassificationName("classification111");
		cc.enterDisplayOrder("111");
		cc.clickCreateButton();
		String s=cc.getMessage();
		Assert.assertEquals(s, "Classification Heading created successfully.");
	}

	@Test(priority=1)
	public void verifyUpdatedClassification_SC_352() throws Exception{
		EditClassification ec=new EditClassification(driver);
		ec.clickMastserLink();
		ec.selectClassifications();
		Thread.sleep(7000);
		ec.clickEditIcon();
		Thread.sleep(7000);
		ec.enterClassificationName("Class111");
		ec.enterDisplayOrder("112");
		ec.clickUpdateButton();
		String s=ec.getMessage();
		Assert.assertEquals(s, "Classification Heading successfully updated.");
	}
	
	@Test(priority=2)
	public void verifyCreatedClassificationDetails_SC_64(){
		AddClasssificationDetails ac=new AddClasssificationDetails(driver);
		ac.clickMastserLink();
		ac.selectClassifications();
		ac.clickDetailsLink();
		ac.enterClassificationDetailName("ClassDetail1");
		ac.clickCreateButton();
		String s=ac.getMessage();
		Assert.assertEquals(s, "Classification created successfully.");
	}
	
	@Test(priority=3)
	public void verifyUpdatedClassificationDetails_SC_353() throws Exception{
		EditClasssificationDetails ec=new EditClasssificationDetails(driver);
		ec.clickMastserLink();
		ec.selectClassifications();
		ec.clickDetailsLink();
		Thread.sleep(7000);
		ec.clickEditIcon();
		Thread.sleep(7000);
		ec.enterClassificationDetailName("ClassDetail2");
		ec.clickUpdateButton();
		String s=ec.getMessage();
		Assert.assertEquals(s, "Classification successfully updated.");
	}
	
	@Test(priority=4)
	public void verifyDeletedClassificationDetails_SC_65(){
		DeleteClassificationDetails dc=new DeleteClassificationDetails(driver);
		dc.clickMastserLink();
		dc.selectClassifications();
		dc.clickDetailsLink();
		dc.clickDeleteButton();
		String s=dc.getMessage();
		Assert.assertEquals(s, "Classification was successfully deleted.");
	}
	
	@Test(priority=5)
	public void verifyDeletedClassification_SC_63(){
		DeleteClassification dc=new DeleteClassification(driver);	
		dc.clickMastserLink();
		dc.selectClassifications();
		dc.clickDeleteButton();
		String s=dc.getMessage();
		Assert.assertEquals(s, "Classification heading was successfully deleted.");
	}
	@Test(priority=6)
	public void CheckForDuplicateClassificationHeadingAndDisplayOrder_SC_328() throws InterruptedException{
		CheckForDuplicateClassificationHeadingAndDisplayOrder cc=new CheckForDuplicateClassificationHeadingAndDisplayOrder(driver);
		cc.clickMastserLink();
		cc.selectClassifications();
		cc.enterClassificationName("Heading");
		cc.enterDisplayOrder("11");
		cc.clickCreateButton();
		String s=cc.getMessage1();
		Assert.assertEquals(s, "Classification Heading created successfully.");
		Thread.sleep(5000);
		cc.clickMastserLink();
		cc.selectClassifications();
		cc.enterClassificationName("Heading");
		cc.enterDisplayOrder("11");
		cc.clickCreateButton();
		String i=cc.getMessage2();
		Assert.assertEquals(i, "Classification heading name has already been taken");
		String n=cc.getMessage3();
		Assert.assertEquals(n, "Display order value has already been taken");
		Thread.sleep(5000);
		cc.clickMastserLink();
		cc.selectClassifications();
		cc.clickDeleteButton();
		cc.switchToPopUpAndAccept(driver);
	}
	@Test(priority=7) 
	public void CheckAssignedClassificationDetailsCanBeDeletedOrNot_SC_329() throws Exception{
		CheckAssignedClassificationDetailsCanBeDeletedOrNot ww=new CheckAssignedClassificationDetailsCanBeDeletedOrNot(driver);
		ww.clickEmployeeLink();
		ww.selectEmployeeDetails();
		ww.selectFilterHead();
		Thread.sleep(4000);
		ww.selectLoadButton();
		Thread.sleep(5000);
		ww.selectViewButton();
		ww.selectClassificationDetails();
		ww.selectAddNewClassiDetails();
		ww.selectSalaryStructure("Gross Salary Structure");
		ww.selectAttendanceStructure("Hyderabad");
		ww.selectBranch("Chennai");
		ww.selectBank("CASH");
		ww.selectLeavePolicy("PolicyNo1");
	//	ww.enterBankAc("74"+Utility.getRandNum());
		ww.clickCreateClassificationButton();
		String s=ww.getMessage1();
		Assert.assertEquals(s, "Employee detail was successfully created.");
		Thread.sleep(5000);
		ww.clickMastserLink();
		ww.selectClassifications();
		ww.clickDeleteButton();
		String abc = ww.getAlertText();
		System.out.println(abc);
		Assert.assertEquals(abc, "<li>Classification is being used, you're not allowed to delete.</li>");
}	*/
	@Test(priority=8)
	public void AddClassificationviaExcelUpload_SC_66() throws Exception {
	AddClassificationviaExcelUpload ac=new AddClassificationviaExcelUpload(driver);
	ac.clickonmaster();
	ac.clickonclassification();
	ac.clickondetails();
	//ac.generatetemplate();
	ac.clickonexceluploadforclassification();
	Thread.sleep(5000);
	ac.choosefile("ClassificationDetail.xlsx");
	Thread.sleep(5000);
	ac.uploadfile();
	}
}
