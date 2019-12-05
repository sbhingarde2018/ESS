package com.spp.scripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddFormula;
import com.spp.pages.DeleteFormula;
import com.spp.pages.FormulaValidationPage;
import com.spp.pages.UpdateFormula;

public class FormulaEditorValidation extends BaseTest {
	
	@Test(priority=0)
	public void FormulaEditorValidation_SC_1893()throws Exception{
	FormulaValidationPage af=new FormulaValidationPage(driver);
		af.clickMastserLink();
		af.selectFormulaEditor();
		af.clickAddFormula();
		af.enterName("basicformula");
		af.clickVerifyButton();
		af.enterName("");
		Thread.sleep(3000);
		af.clickBasicFormula();
		String s=af.getFormulaExpressionValidationMessage();
		Assert.assertEquals(s, "Formula does not have any expression!");
		Thread.sleep(3000);
		af.clickOperator();
		Thread.sleep(3000);
		af.enterExpression("0.50");
		af.clickVerifyButton();
		String s1=af.getFormulaNameValidationMessage();
		Assert.assertEquals(s1, "Formulae name can't be blank");
		Thread.sleep(3000);
		af.enterName("basicformula");
		af.clickSaveButton();
		af.clickMastserLink();
		af.selectFormulaEditor();
		af.clickAddFormula();
		af.enterName("basicformula");
		af.clickBasicFormula();
		Thread.sleep(3000);
		af.clickOperator();
		Thread.sleep(3000);
		af.enterExpression("0.50");
		af.clickVerifyButton();
		String s3=af.getFormulaNameDublicateMessage(); 
		Assert.assertEquals(s3, "Formulae name has already been taken");

	}
	
}