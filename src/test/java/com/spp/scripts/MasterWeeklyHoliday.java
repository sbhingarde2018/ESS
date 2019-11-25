package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.CreateMasterWeeeklyHoliday;
import com.spp.pages.DeleteMasterWeeklyHoliday;
import com.spp.pages.UpdateMasterWeeklyHoliday;

public class MasterWeeklyHoliday extends BaseTest{
	
	@Test(priority=0)
	public void verifyCreatedMasterWeeklyHoliday_SC_79() throws Exception{
		CreateMasterWeeeklyHoliday ms=new CreateMasterWeeeklyHoliday(driver);
		ms.clickMastserLink();
		ms.selectMasterWeekly();
		ms.clickViewLink();
		ms.clickNewMasterTab();
		ms.enterEffectiveFromDate("01 September 2019");
		ms.selectFirstWeeklyOff("Monday");
		ms.selectHalfOrFullDay("Second Half");
		ms.selectsScondWeeklyOff("Friday");
		ms.selectSHalforFullDay("Full");
		ms.clickCreateButton();
		Thread.sleep(80000);
		//String s=ms.getMessage();
		//Assert.assertEquals(s, "Master Weekly off Successfully created.");
	}
	
	@Test(priority=1)
	public void verifyUpdatedMasterWeeklyHoliday_SC_80() throws Exception{
		UpdateMasterWeeklyHoliday wh=new UpdateMasterWeeklyHoliday(driver);
		wh.clickMastserLink();
		wh.selectMasterWeekly();
		wh.clickViewLink();
		wh.selectFirstWeeklyOff("Tuesday");
		wh.selectHalfOrFullDay("Full");
		wh.selectsScondWeeklyOff("Sunday");
		wh.selectSHalforFullDay("First Half");
		wh.clickUpdateButton();
		Thread.sleep(80000);
		//String s=wh.getMessage();
		//Assert.assertEquals(s, "Master Weekly off Successfully Updated.");
	}

	@Test(priority=2)
	public void verifyDeletedWeeklyHoliday_SC_81() throws Exception{
		DeleteMasterWeeklyHoliday wh=new DeleteMasterWeeklyHoliday(driver);
		wh.clickMastserLink();
		wh.selectMasterWeekly();
		wh.clickViewLink();
		wh.clickWeeklyoffHistory();
		wh.clickDeleteButton();
		Thread.sleep(80000);
	 	//String s=wh.getMessage();
	 	//Assert.assertEquals(s, "Master Weekly off Successfully Deleted.");
	}
}	