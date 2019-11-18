	package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
//import com.spp.pages.AssignEmployee;
import com.spp.pages.ClassificationHeadPage;

public class ClassificationsheadValidation extends BaseTest {
	
	@Test(priority=0)
	public void verifyCreatedClassification_SC_1858() throws Exception{
		ClassificationHeadPage cc=new ClassificationHeadPage(driver);
		cc.clickMastserLink();
		cc.selectClassifications();
		cc.clickCreateButton();
		String s=cc.getMsgClassificationHeadingEmpty();
		Assert.assertEquals(s, "Classification Heading can't be blank");
		String s1=cc.getMsgDisplayOrderessempty();
		Assert.assertEquals(s1, "Display Order can't be blank");
		cc.clickEditClassification();
		Thread.sleep(500);
		cc.clickCreateGrade();
		String s2=cc.getMsgGradeNameEmpty();
		Assert.assertEquals(s2, "Grade Name can't be blank");
		cc.enterGradeName("A");
		cc.clickCreateGrade();
		Thread.sleep(500);
		cc.enterGradeName("A");
		cc.clickCreateGrade();
		String s3=cc.getMsgDublicateGradeName();
		Assert.assertEquals(s3, "Classification name has already been taken");

	}
}