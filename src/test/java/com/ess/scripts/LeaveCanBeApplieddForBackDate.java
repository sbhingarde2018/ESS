package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.LeaveCanBeAppliedForBackDate;

public class LeaveCanBeApplieddForBackDate extends  BaseTest {
	
	@Test
	public void LeaveCanBeApplieddForBackDate_ess_79() throws Exception{
		
		LeaveCanBeAppliedForBackDate BD  = new LeaveCanBeAppliedForBackDate(driver);
		
	    	BD.resizeWindow();
		    
		    Thread.sleep(2000);
		    BD.navigateMaster();
		    
		    Thread.sleep(2000);
		    BD.navigateLeavePolicy();
		    
		    Thread.sleep(2000);
		    BD.addLeavesForPolicy();
			
		    Thread.sleep(2000);
		    BD.settingforleavedefi();
			
		    Thread.sleep(2000);
		    BD.backday();
			
		    Thread.sleep(2000);
		    BD.updatepolicy();
			
		    Thread.sleep(2000);
		    BD.navigateleave();
			
		    Thread.sleep(2000);
		    BD.selectapplyleave();
			
			Thread.sleep(2000);
			BD.advaneFilter();
			   
			Thread.sleep(2000);
			BD.load();
			   
		    Thread.sleep(2000);
		    BD.applyLeaveForEmployee();
			
			Thread.sleep(2000);
			BD.selectleaveltype();
	    
	        Thread.sleep(2000);
	        BD.selectFromdate("02 April 2020");
	    
	        Thread.sleep(2000);
	        BD.selectTodate("02 April 2020");
	     
	        Thread.sleep(2000);
	        BD.resizeWindow();
	        
	        BD.applytheLeave();
	        Thread.sleep(2000);
	        String s =  BD.getMessageLeave();
	        Assert.assertEquals(s,"Leave can be applied for back date, if the Apr/2020 is Default Paymonth.");
	    
	        Thread.sleep(2000);
	}		 
 

}
