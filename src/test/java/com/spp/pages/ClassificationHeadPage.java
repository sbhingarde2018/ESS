package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ClassificationHeadPage extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//input[@value='Create Classification Heading']")
	WebElement createButton;
	@FindBy(id="classification_heading_classification_heading_name-error")
	WebElement classificationNameempty;
	@FindBy(id="classification_heading_display_order-error")
	WebElement displayOrderempty;
	@FindBy(xpath="//td[text()='Grade']//following::td[2]//a[1]")
	WebElement editclassification;
	@FindBy(xpath="//input[@name='commit']")
	WebElement createGrade;
	@FindBy(id="classification_classification_name-error")
	WebElement GradeNmaeEmpty;
	@FindBy(id="classification_classification_name")
	WebElement GradeName;
	@FindBy(xpath="//li[text()='Classification name has already been taken']")
	WebElement DublicateGradename;
	public ClassificationHeadPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	
	public String getMsgClassificationHeadingEmpty(){
		return classificationNameempty.getText();
	}
	public String getMsgDisplayOrderessempty(){
		return displayOrderempty.getText();
	}
	public void clickEditClassification(){
		editclassification.click();
	}
	public void clickCreateGrade(){
		createGrade.click();
	}
	
	public String getMsgGradeNameEmpty(){
		return GradeNmaeEmpty.getText();
	}
	public void enterGradeName(String value){
		GradeName.clear();
		GradeName.sendKeys(value);
	}
	public String getMsgDublicateGradeName(){
		return DublicateGradename.getText();
	}
	
	
}
