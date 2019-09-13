package com.spp.scripts;

//import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.ExcelUtil;
//import com.spp.common.ExcelUtil;
import com.spp.generics.Utility;
import com.spp.pages.CreateHolidayList;
import com.spp.pages.CreateHolidayUnderBranch;
import com.spp.pages.DeleteHoliday;
import com.spp.pages.DisablingEnablingHolidayFromBranch;
import com.spp.pages.ExcelUploadforHolidays;
import com.spp.pages.UpdateHolidayList;

public class HolidayList extends BaseTest {

	@Test(priority=0)
	public void verifyCreatedHoliday_SC_40() throws Exception {
		CreateHolidayList hl=new CreateHolidayList(driver);
		hl.clickMastserLink();
		hl.selectHolidayList();
		hl.clickView();
		hl.clickAddHoliday();
		hl.enterDate("14 August 2019");
		hl.enterDescription("Raksha Bandhan");
		hl.clickCreateButton();
		Thread.sleep(40000);
		//String s=hl.getMessage();
		//Assert.assertEquals(s, "Holiday Master List successfully created");
	}
	
	 @Test(priority=1)
	 public void verifyCreateHolidayUnderBranch_SC_41() throws InterruptedException{
		CreateHolidayUnderBranch hl=new CreateHolidayUnderBranch(driver);
		hl.clickMastserLink();
		hl.selectHolidayList();
		hl.clickView();
		hl.clickAddHoliday();
		hl.enterDate("20 October 2019");
		hl.enterDescription("Diwali");
		hl.clickCreateButton();
		Thread.sleep(40000);
		hl.clickDeleteButton();
		Thread.sleep(35000);
	} 
	
   @Test(priority=2)
   public void verifyUpdatedHolidayList_SC_42() throws Exception{
	   UpdateHolidayList uh=new UpdateHolidayList(driver);
	   uh.clickMastserLink();
	   uh.selectHolidayList();
	   uh.clickView();
	   uh.clickEditLink();
	   uh.enterDate("02 October 2019");
	   uh.enterDescription("Gandhi Jayanti");
	   uh.clickUpdateHoliday();
	   Thread.sleep(60000);
	   //String s=uh.getMessage();
	   //Assert.assertEquals(s, "Holiday Master List successfully updated");
	}
   
   @Test(priority=3)
   public void verifyDeletedHolidayList_SC_43() throws InterruptedException{
	   DeleteHoliday dh=new DeleteHoliday(driver);  
	   dh.clickMastserLink();
	   dh.selectHolidayList();
	   dh.clickView();
	   Thread.sleep(5000);
	   dh.clickDeleteButton();
	   Thread.sleep(2000);
	   dh.switchToPopUpAndDismiss();
	   Thread.sleep(2000);
	   dh.clickDeleteButton();
	   dh.switchToPopUpAndAccept(driver);
	   Thread.sleep(40000);
	}
  
   @Test(priority=4)
   public void verifyDisablingEnablingHolidayFromBranch_SC_44() throws InterruptedException{
	   DisablingEnablingHolidayFromBranch hl=new DisablingEnablingHolidayFromBranch(driver);
	   hl.clickMastserLink();
	   hl.selectHolidayList();
	   hl.clickView();
	   hl.clickFirstDisable();
	  //String s=hl.getMessage();
	  //Assert.assertEquals(s, "Holiday Was successfully updated.");
	}

   @Test(priority=5)
   public void verifyExcelUploadforHolidays_SC_45() throws Exception{
	   ExcelUploadforHolidays uh=new ExcelUploadforHolidays(driver);
	   uh.clickonmaster();
	   uh.clickonholidaylists();
	   uh.clickonview();
	   uh.generatesampletemplate();
	   Thread.sleep(2000);
	   uh.exceluploadforholidays();
	   Thread.sleep(2000);
	   uh.choosefile("C:\\Users\\Alfalabs\\Downloads\\HolidayMaster.xlsx");
	   uh.uploadfile();
	   Thread.sleep(5000);
	   //uh.deleteHoliday();
	}
}