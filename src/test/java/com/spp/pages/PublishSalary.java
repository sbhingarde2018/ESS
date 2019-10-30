package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PublishSalary extends BasePage{
	public PublishSalary(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//select[@id='salary_structure']")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//div[@class='text-center mt10']//div//input[@name='commit']")
	WebElement Process;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[7]/a")
	WebElement Edit;
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div[2]/a")
	WebElement SubmitForReview;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[3]/a")
	WebElement Review;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[8]/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"tabs-2\"]/div[2]/a[1]")
	WebElement publish;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[1]/strong")
	WebElement successfulMessage;
	@FindBy(xpath="//input[@id='fill_pt']")
	WebElement FillPT;
	@FindBy(xpath="//tr[1]/td[4]/a")
	WebElement More;
	@FindBy(xpath="//fieldset/table/tbody/tr[2]/td[1]/div/div/div/input[1]")
	WebElement BasicUnit;
	@FindBy(xpath="//div[@class='block lightblue p0']//input[@name='commit']")
	WebElement Save;
	@FindBy(xpath="//a[contains(text(),'Salary Process List')]")
	WebElement SalaryProcessList;
	@FindBy(xpath="//*[@id=\"salary_review\"]/tbody/tr[1]/td[7]")
	WebElement Status;
	@FindBy(xpath="//div[@id='tabs-2']//a[@class='btn2 btn-bglightblue'][contains(text(),'Reject')]")
	WebElement Reject;
	
	public void ClickReject() {
		Reject.click();
	}
	public void ClickSalaryProcessList() {
		SalaryProcessList.click();
	}
	public void ClickSave() {
		Save.click();
	}
	public void selectSalary() {
		Salary.click();
	}
	public void selectSalaryEditor() {
		SalaryEditor.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalaryStructure(String value){
		dropDownSelect(SalaryStructure, value);
	}
	public void selectGetValues() {
		GetValues.click();
	}
	public void selectLoad() {
		Load.click();
	}
	public void selectProcess() {
		Process.click();
	}
	public void selectEdit() {
		Edit.click();
	}
	public void selectSubmitForReview() {
		SubmitForReview.click();
	}
	public void selectReview() {
		Review.click();
	}
	public void selectview() {
		view.click();
	}
	public void selectpublish() {
		publish.click();
	}
	public String getMessage() {
		return successfulMessage.getText();
	}
	public void selectFillPT() {
		FillPT.click();
	}
	public void selectMore() {
		More.click();
	}
	public void EnterBasicUnit(String value) throws Exception{
		BasicUnit.sendKeys(value);
	}
	public String getStatus(){
		return Status.getText();
	}
}
