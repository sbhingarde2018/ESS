package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddHRDetails;
import com.spp.pages.CreateHRCategory;
import com.spp.pages.CreateHRCategorywithoutRequired;
import com.spp.pages.DeleteHRCategory;
import com.spp.pages.DeleteHRDetails;
import com.spp.pages.EditHRCategory;
import com.spp.pages.EditHRDetails;
import com.spp.pages.HRCategoryValidationPage;

public class HRCategoryValidation extends BaseTest{

	@Test(priority=0)
	public void verifyCreatedHRCategory_SC_1845() throws Exception{
		HRCategoryValidationPage ch=new HRCategoryValidationPage(driver);
		ch.clickMastserLink();
		ch.selectHRCategory();
		//ch.enterHRName("ContactAddress13");
		ch.clickCreateButton();
		String s=ch.getHRCateoryEmptyMessage();
		Assert.assertEquals(s, "HR Category can't be blank");
		Thread.sleep(1000);
		ch.enterHRName("Personal");
		ch.clickCreateButton();
		String s1=ch.getDublicateHRCateoryMessage();
		Assert.assertEquals(s1, "Category name has already been taken");
	}

}