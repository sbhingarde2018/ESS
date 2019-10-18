package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.BulkITDeclarationsTemplateDownload;
import com.spp.pages.BulkTdsDeclarationsTemplateUpload;

public class BulkTdsDeclarations extends BaseTest {
	@Test(priority=0)
	public void BulkITDeclarationsTemplateDownload_SC_1198() throws Exception {
		BulkITDeclarationsTemplateDownload ab=new BulkITDeclarationsTemplateDownload(driver);
		ab.ClickTDs();
		ab.ClickBulkTDSDeclarations();
		Thread.sleep(3000);
		ab.SelectFinancialYear("2018/2019");
		ab.ClickFilterHead();
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.ClickLoad();
		ab.exitFullscreen();
		ab.SelectEmp();
		ab.ClickDownload();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Bulk Tds Declarations Dowloaded Successfully");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void BulkTdsDeclarationsTemplateUpload_SC_1199() throws Exception {
		BulkTdsDeclarationsTemplateUpload ab=new BulkTdsDeclarationsTemplateUpload(driver);
		ab.ClickTDs();
		ab.ClickBulkTDSDeclarations();
		Thread.sleep(3000);
		ab.ClickUpload();
		Thread.sleep(3000);
		ab.SelectFinancialYear("2018/2019");
		ab.clickChooseFile("C:\\Users\\AlfaLabs\\Downloads\\BulkItDeclarationTemplate.xlsx");
		Thread.sleep(4000);
		ab.clickUploadBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Request for uploading income tax declarations is accepted and will take time. You can check the status of the same in Process Background Jobs.");
	}
}
