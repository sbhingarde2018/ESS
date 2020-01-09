package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.ComputeTDS;
import com.spp.pages.ComputeTDSOverWrite;

public class Computation extends BaseTest {

	@Test(priority=0)
	public void ComputeTDS_SC_1054() throws Exception{
		ComputeTDS ab=new ComputeTDS(driver);
		ab.ClickTDS();
		ab.ClickComputation();
		ab.SelectFinancialYear("2018/2019");
		ab.resizeWindow();
		ab.ClickFilter();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(3000);
		ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickComputeBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Request for tds computation is processing. You can check the status in Process Background Jobs.");
		Thread.sleep(10000);
	}
	
	@Test(priority=1)
	public void ComputeTDSOverWrite_SC_1086() throws Exception{
		ComputeTDSOverWrite ab=new ComputeTDSOverWrite(driver);
		ab.ClickTDS();
		ab.ClickComputation();
		ab.SelectFinancialYear("2018/2019");
		ab.ClickOverWrite();
		ab.resizeWindow();
		ab.ClickFilter();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(3000);
		ab.exitFullscreen();
		Thread.sleep(3000);
		ab.ClickComputeBtn();
		String j=ab.getMessage();
		Assert.assertEquals(j, "Request for tds computation is processing. You can check the status in Process Background Jobs.");
		Thread.sleep(10000);
	}
}
