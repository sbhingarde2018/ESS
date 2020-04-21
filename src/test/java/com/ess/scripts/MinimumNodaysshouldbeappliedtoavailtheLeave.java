package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.MinimumNodaysshouldbeappliedtoavailtheCasualLeave;

public class MinimumNodaysshouldbeappliedtoavailtheLeave extends  BaseTest {
	
	@Test
	public void MinimumNodaysshouldbeappliedtoavailtheCasualLeave_ess_76() throws Exception{
		
		MinimumNodaysshouldbeappliedtoavailtheCasualLeave min  = new MinimumNodaysshouldbeappliedtoavailtheCasualLeave(driver);
			
		
		    min.resizeWindow();
		    
		    Thread.sleep(2000);
		    min.navigateMaster();
		    
		    Thread.sleep(2000);
			min.navigateLeavePolicy();
			
		    Thread.sleep(2000);
			min.addLeavesForPolicy();
			
		    Thread.sleep(2000);
			min.settingforleavedefi();
			
		    Thread.sleep(2000);
			min.MinNoAvailtheLeave("2");
			
		    Thread.sleep(2000);
			min.updatepolicy();
			
		    Thread.sleep(2000);
			min.navigateleave();
			
		    Thread.sleep(2000);
			min.selectapplyleave();
			
			   Thread.sleep(2000);
			   min.advaneFilter();
			   
			   Thread.sleep(2000);
			   min.load();
			   
			Thread.sleep(2000);
			min.applyLeaveForEmployee();
			
			   Thread.sleep(2000);
	    min.selectleaveltype();
	    
	    Thread.sleep(2000);
	    min.selectFromdate("02 April 2020");
	    
	    Thread.sleep(2000);
	    min.selectTodate("04 April 2020");
	    
	    Thread.sleep(2000);
	    min.applytheLeave();
	    
	    Thread.sleep(2000);
	    String s =  min.getMessageLeave();
	    Assert.assertEquals(s,"You are having insufficient leave balance");
	    
	    Thread.sleep(2000);
		
	}

}
