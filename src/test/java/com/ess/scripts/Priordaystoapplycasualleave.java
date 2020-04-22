package com.ess.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ess.common.BaseTest;
import com.ess.pages.Priordaytoapplycasualleave;


public class Priordaystoapplycasualleave extends  BaseTest {
	
	@Test
	public void Priordaystoapplycasualleave_ess_78() throws Exception{
		
		Priordaytoapplycasualleave	 PR  = new Priordaytoapplycasualleave(driver);
		
		PR.resizeWindow();
		    
		    Thread.sleep(2000);
		    PR.navigateMaster();
		    
		    Thread.sleep(2000);
		    PR.navigateLeavePolicy();
			
		    Thread.sleep(2000);
		    PR.addLeavesForPolicy();
			
		    Thread.sleep(2000);
		    PR.settingforleavedefi();
			
		    Thread.sleep(2000);
		    PR.priordays("2");
			
		    Thread.sleep(2000);
		    PR.updatepolicy();
			
		    Thread.sleep(2000);
		    PR.navigateleave();
			
		    Thread.sleep(2000);
		    PR.selectapplyleave();
			
			Thread.sleep(2000);
			PR.advaneFilter();
			   
			Thread.sleep(2000);
			PR.load();
			   
		    Thread.sleep(2000);
			PR.applyLeaveForEmployee();
			
			Thread.sleep(2000);
			PR.selectleaveltype();
	    
	        Thread.sleep(2000);
	        PR.selectFromdate("02 April 2020");
	    
	        Thread.sleep(2000);
	        PR.selectTodate("04 April 2020");
	     
	        Thread.sleep(2000);
	        PR.applytheLeave();
	    
	        Thread.sleep(2000);
	        String s =  PR.getMessageLeave();
	        Assert.assertEquals(s,"You are having insufficient leave balance");
	    
	        Thread.sleep(2000);
	}		 

}
