package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.AllowHalfDay;


public class AllowHalffDay extends  BaseTest {
	
	@Test
	public void AllowHalffDay_ess_80() throws Exception{
		
	  	    AllowHalfDay hd = new AllowHalfDay(driver);
		
	      	hd.resizeWindow();
		    
		    Thread.sleep(2000);
		    hd.navigateMaster();
		    
		    Thread.sleep(2000);
		    hd.navigateLeavePolicy();
		    
		    Thread.sleep(2000);
		    hd.addLeavesForPolicy();
			
		    Thread.sleep(2000);
		    hd.settingforleavedefi();
			
		    Thread.sleep(2000);
		    hd.allowhalfday();
			
		    Thread.sleep(2000);
		    hd.updatepolicy();
			
		    Thread.sleep(2000);
		    hd.navigateleave();
			
		    Thread.sleep(2000);
		    hd.selectapplyleave();
			
			Thread.sleep(2000);
			hd.advaneFilter();
			  
			Thread.sleep(2000);
			hd.load();
			   
		    Thread.sleep(2000);
		    hd.applyLeaveForEmployee();
			
			Thread.sleep(2000);
			hd.selectleaveltype();
	    
	        Thread.sleep(2000);
	        hd.selectFromdate("02 April 2020");
	    
	        Thread.sleep(2000);
	        hd.selectTodate("02 April 2020");
	        
	        Thread.sleep(2000);
	        hd.applytheLeave();
	     
	        Thread.sleep(2000);
	        hd.resizeWindow();
	        
	        Thread.sleep(2000);
	        hd.unchecksecondhalf();
	        
	        Thread.sleep(2000);
	        hd.applytheLeave();
	        Thread.sleep(2000);
	        String s =  hd.getMessageLeave();
	        Assert.assertEquals(s,"Leave applied successfully.");
	    
	        Thread.sleep(2000);
	}		 
}
