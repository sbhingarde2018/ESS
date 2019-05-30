package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.EditAllowancesAllowanceForRenderingServicesOutsideIndia;
import com.spp.pages.EditAllowancesAllowanceReceivedByEmployeeOfUNO;
import com.spp.pages.EditAllowancesAllowanceToHighCourtJudge;
import com.spp.pages.EditAllowancesAllowanceforTransportEmployees;
import com.spp.pages.EditAllowancesBorderAreaRemoteAreaAllowance;
import com.spp.pages.EditAllowancesChildrenHostelAllowance;
import com.spp.pages.EditAllowancesCompensatoryFieldAreaAllowance;
import com.spp.pages.EditAllowancesCompensatoryModifiedFieldAreaAllowance;
import com.spp.pages.EditAllowancesConveyanceTransportAllowance;
import com.spp.pages.EditAllowancesCounterInsurgencyAllowanceGrantedToMembersofArmedForces;
import com.spp.pages.EditAllowancesDifficultAreaOrDisturbedAreaAllowance;
import com.spp.pages.EditAllowancesEntertainmentAllowance;
import com.spp.pages.EditAllowancesHighAltitudeAllowance;
import com.spp.pages.EditAllowancesHighAltitudeAllowanceforarmedforces;
import com.spp.pages.EditAllowancesHouseRentAllowance;
import com.spp.pages.EditAllowancesIslandDutyAllowance;
import com.spp.pages.EditAllowancesOtherAllowance;
import com.spp.pages.EditAllowancesSnowBoundAreaOrAvalancheAllowance;
import com.spp.pages.EditAllowancesSpecialCompensatoryHighlyActiveFieldAreaAllowance;
import com.spp.pages.EditAllowancesSpecialCompensatoryHillyAreaAllowance;
import com.spp.pages.EditAllowancesSumptuaryAllowanceHCSCJudges;
import com.spp.pages.EditAllowancesTribalAreaScheduledAreaAgencyAreaAllowance;
import com.spp.pages.EditAllowancesUncongenialClimateAllowance;
import com.spp.pages.EditAllowancesUndergroundAllowance;
import com.spp.pages.EditAllowancesUserDefined;
import com.spp.pages.EditMainComponentBasic;
import com.spp.pages.EditMainComponentsCommisionasaofturnover;
import com.spp.pages.EditMainComponentsDAFormingpartofsalary;
import com.spp.pages.EditMainComponentsDANotformingpartofsalary;
//import com.spp.pages.EditPerquisitesCarOtherAutomotive;
import com.spp.pages.EditPerquisitesLeaveTravelConcession;
import com.spp.pages.EditPerquisitesElectricity;
import com.spp.pages.EditPerquisitesEmployerContributionToPF;
import com.spp.pages.EditPerquisitesFreeEducationforhouseholdmembers;
import com.spp.pages.EditPerquisitesFreeeducationforEmployeesChildren;
//import com.spp.pages.EditPerquisitesFreefoodandnonalcoholicbeverges;
import com.spp.pages.EditPerquisitesGardener;
import com.spp.pages.EditPerquisitesGas;
//import com.spp.pages.EditPerquisitesHolidayExpenses;
import com.spp.pages.EditPerquisitesHotelAccommodation;
import com.spp.pages.EditPerquisitesInterestCreditPF;
//import com.spp.pages.EditPerquisitesInterestfreeorconcessionalloans;
import com.spp.pages.EditPerquisitesMedical;
import com.spp.pages.EditPerquisitesPersonalAttendant;
import com.spp.pages.EditPerquisitesRentFreeAccommodation;
import com.spp.pages.EditPerquisitesSweeper;
import com.spp.pages.EditPerquisitesTaxPaidByEmployer;
import com.spp.pages.EditPerquisitesWatchman;
import com.spp.pages.EditPerquisitesWater;
import com.spp.pages.EditnameOtherAllowance;
import com.spp.pages.SelectLimitBorderAreaRemoteAreaAllowance;
import com.spp.pages.SelectLimitDifficultAreaOrDisturbedAreaAllowance;
import com.spp.pages.SelectLimitHighAltitudeAllowance;
import com.spp.pages.SelectLimitHighAltitudeAllowanceforarmedforces;
import com.spp.pages.SelectLimitSnowBoundAreaOrAvalancheAllowance;
import com.spp.pages.SelectLimitSpecialCompensatoryHillyAreaAllowance;
import com.spp.pages.SelectLimitUncongenialClimateAllowance;

public class ComputationDetails extends BaseTest {
	/*@Test(priority=0)
	public void EditMainComponentBasic_SC_1055() throws Exception{
		EditMainComponentBasic ab=new EditMainComponentBasic(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
		Thread.sleep(2000);
		ab.ClickBasicEdit();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
	}
	@Test(priority=1)
	public void EditMainComponentsDAFormingpartofsalary_SC_1056() throws Exception{
		EditMainComponentsDAFormingpartofsalary ab=new EditMainComponentsDAFormingpartofsalary(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
		Thread.sleep(2000);
		ab.ClickDAFormingEdit();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
		
	}
	@Test(priority=2)
	public void EditMainComponentsDANotformingpartofsalary_SC_1057() throws Exception{
	EditMainComponentsDANotformingpartofsalary ab=new EditMainComponentsDANotformingpartofsalary(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
		Thread.sleep(2000);
		ab.ClickDANotFormingEdit();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
	}
	@Test(priority=3)
	public void EditMainComponentsCommisionasaofturnover_SC_1058() throws Exception{
		EditMainComponentsCommisionasaofturnover ab=new EditMainComponentsCommisionasaofturnover(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
		Thread.sleep(2000);
		ab.ClickCommisionEdit();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickMainComponent();
	 }
	@Test(priority=4)
	public void EditAllowancesHouseRentAllowance_SC_1059() throws Exception{
		EditAllowancesHouseRentAllowance ab=new EditAllowancesHouseRentAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHRA();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
	}
	@Test(priority=5)
	public void EditAllowancesConveyanceTransportAllowance_SC_1060() throws Exception{
		EditAllowancesConveyanceTransportAllowance ab=new EditAllowancesConveyanceTransportAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
		
	}
	@Test(priority=6)
	public void EditAllowancesChildrenHostelAllowance_SC_1061() throws Exception{
		EditAllowancesChildrenHostelAllowance ab=new EditAllowancesChildrenHostelAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHostelAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
	}
	@Test(priority=7)
	public void EditAllowancesAllowanceforTransportEmployees_SC_1062() throws Exception{
		EditAllowancesAllowanceforTransportEmployees ab=new EditAllowancesAllowanceforTransportEmployees(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickTransportAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
	}
	@Test(priority=8)
	public void EditAllowancesTribalAreaScheduledAreaAgencyAreaAllowance_SC_1063() throws Exception{
		EditAllowancesTribalAreaScheduledAreaAgencyAreaAllowance ab=new EditAllowancesTribalAreaScheduledAreaAgencyAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickTribalAreaAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
	}
	@Test(priority=9)
	public void EditAllowancesSpecialCompensatoryHillyAreaAllowance_SC_1064() throws Exception{
		EditAllowancesSpecialCompensatoryHillyAreaAllowance ab=new EditAllowancesSpecialCompensatoryHillyAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHillyareaAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		
	}
	@Test(priority=10)
	public void EditAllowancesHighAltitudeAllowance_SC_1065() throws Exception{
		EditAllowancesHighAltitudeAllowance ab=new EditAllowancesHighAltitudeAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHighAltitudeAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=11)
	public void EditAllowancesUncongenialClimateAllowance_SC_1066() throws Exception{
		EditAllowancesUncongenialClimateAllowance ab=new EditAllowancesUncongenialClimateAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickClimateAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=12)
	public void EditAllowancesSnowBoundAreaOrAvalancheAllowance_SC_1067() throws Exception{
		EditAllowancesSnowBoundAreaOrAvalancheAllowance ab=new EditAllowancesSnowBoundAreaOrAvalancheAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickSnowAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=13)
	public void EditAllowancesDifficultAreaOrDisturbedAreaAllowance_SC_1068() throws Exception{
		EditAllowancesDifficultAreaOrDisturbedAreaAllowance ab=new EditAllowancesDifficultAreaOrDisturbedAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickDifficultAreaAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=14)
	public void EditAllowancesBorderAreaRemoteAreaAllowance_SC_1069() throws Exception{
		EditAllowancesBorderAreaRemoteAreaAllowance ab=new EditAllowancesBorderAreaRemoteAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickBorderAreaAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=15)
	public void EditAllowancesCompensatoryFieldAreaAllowance_SC_1070() throws Exception{
		EditAllowancesCompensatoryFieldAreaAllowance ab=new EditAllowancesCompensatoryFieldAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickCompensatoryAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=16)
	public void EditAllowancesCompensatoryModifiedFieldAreaAllowance_SC_1071() throws Exception{
		EditAllowancesCompensatoryModifiedFieldAreaAllowance ab=new EditAllowancesCompensatoryModifiedFieldAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickModifiedCompensatoryAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=17)
	public void EditAllowancesCounterInsurgencyAllowanceGrantedToMembersofArmedForces_SC_1072() throws Exception{
		EditAllowancesCounterInsurgencyAllowanceGrantedToMembersofArmedForces ab=new EditAllowancesCounterInsurgencyAllowanceGrantedToMembersofArmedForces(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickCounterInsurgencyAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=18)
	public void EditAllowancesUndergroundAllowance_SC_1073() throws Exception{
		EditAllowancesUndergroundAllowance ab=new EditAllowancesUndergroundAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickUnderGroundAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=19)
	public void EditAllowancesSpecialCompensatoryHighlyActiveFieldAreaAllowance_SC_1074() throws Exception{
		EditAllowancesSpecialCompensatoryHighlyActiveFieldAreaAllowance ab=new EditAllowancesSpecialCompensatoryHighlyActiveFieldAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickSpclCompensatoryAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=20)
	public void EditAllowancesHighAltitudeAllowanceforarmedforces_SC_1075() throws Exception{
		EditAllowancesHighAltitudeAllowanceforarmedforces ab=new EditAllowancesHighAltitudeAllowanceforarmedforces(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHighALtitudeArmedAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=21)
	public void EditAllowancesIslandDutyAllowance_SC_1076() throws Exception{
		EditAllowancesIslandDutyAllowance ab=new EditAllowancesIslandDutyAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickIslandAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=22)
	public void EditAllowancesEntertainmentAllowance_SC_1077() throws Exception{
		EditAllowancesEntertainmentAllowance ab=new EditAllowancesEntertainmentAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickEntertainmentAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=23)
	public void EditAllowancesAllowanceForRenderingServicesOutsideIndia_SC_1078() throws Exception{
		EditAllowancesAllowanceForRenderingServicesOutsideIndia ab=new EditAllowancesAllowanceForRenderingServicesOutsideIndia(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickRenderingAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=24)
	public void EditAllowancesAllowanceToHighCourtJudge_SC_1079() throws Exception{
		EditAllowancesAllowanceToHighCourtJudge ab=new EditAllowancesAllowanceToHighCourtJudge(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHighcourtAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=25)
	public void EditAllowancesSumptuaryAllowanceHCSCJudges_SC_1080() throws Exception{
		EditAllowancesSumptuaryAllowanceHCSCJudges ab=new EditAllowancesSumptuaryAllowanceHCSCJudges(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickSumptuaryAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		}
	@Test(priority=26)
	public void EditAllowancesAllowanceReceivedByEmployeeOfUNO_SC_1081() throws Exception{
		EditAllowancesAllowanceReceivedByEmployeeOfUNO ab=new EditAllowancesAllowanceReceivedByEmployeeOfUNO(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickEmpUNOAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		}
	@Test(priority=27)
	public void EditAllowancesOtherAllowance_SC_1082() throws Exception{
		EditAllowancesOtherAllowance ab=new EditAllowancesOtherAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickotherAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		}
	@Test(priority=28)
	public void EditnameOtherAllowance_SC_1083() throws Exception{
		EditnameOtherAllowance ab=new EditnameOtherAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickEditName();
		ab.EnterHeadingName("Paid Allowance");
		ab.ClickSaveBtn();
		Thread.sleep(2000);
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		}
	@Test(priority=29)
	public void EditAllowancesUserDefined_SC_1084() throws Exception{
		EditAllowancesUserDefined ab=new EditAllowancesUserDefined(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickUDAllowanceGiven();
		ab.EnterEditedValues("20");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=30)
	public void SelectLimitSpecialCompensatoryHillyAreaAllowance_SC_1085() throws Exception{
		SelectLimitSpecialCompensatoryHillyAreaAllowance ab=new SelectLimitSpecialCompensatoryHillyAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHillyareaAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=31)
	public void SelectLimitHighAltitudeAllowance_SC_1087() throws Exception{
		SelectLimitHighAltitudeAllowance ab=new SelectLimitHighAltitudeAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickHighAltitudeAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=32)
	public void SelectLimitUncongenialClimateAllowance_SC_1088() throws Exception{
		SelectLimitUncongenialClimateAllowance ab=new SelectLimitUncongenialClimateAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickUncongenialAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=33)
	public void SelectLimitSnowBoundAreaOrAvalancheAllowance_SC_1089() throws Exception{
		SelectLimitSnowBoundAreaOrAvalancheAllowance ab=new SelectLimitSnowBoundAreaOrAvalancheAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickSnowBoundAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=34)
	public void SelectLimitDifficultAreaOrDisturbedAreaAllowance_SC_1090() throws Exception{
		SelectLimitDifficultAreaOrDisturbedAreaAllowance ab=new SelectLimitDifficultAreaOrDisturbedAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickDiffAreaAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=35)
	public void SelectLimitBorderAreaRemoteAreaAllowance_SC_1091() throws Exception{
		SelectLimitBorderAreaRemoteAreaAllowance ab=new SelectLimitBorderAreaRemoteAreaAllowance(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickBorderAreaAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("300");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=36)
	public void SelectLimitHighAltitudeAllowanceforarmedforces_SC_1092() throws Exception{
		SelectLimitHighAltitudeAllowanceforarmedforces ab=new SelectLimitHighAltitudeAllowanceforarmedforces(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
		Thread.sleep(2000);
		ab.ClickArmedForcesAllowanceGiven();
		ab.EnterEditedValues("25");
		ab.SelectLimit("1060");
		ab.ClickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickAllowances();
	}
	@Test(priority=37)
	public void EditPerquisitesRentFreeAccommodation_SC_1093() throws Exception{
		EditPerquisitesRentFreeAccommodation ab=new EditPerquisitesRentFreeAccommodation(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickRentFreeAcc();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=38)
	public void EditPerquisitesMedical_SC_1094() throws Exception{
		EditPerquisitesMedical ab=new EditPerquisitesMedical(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickMedical();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=39)
	public void EditPerquisitesLeaveTravelConcession_SC_1095() throws Exception{
		EditPerquisitesLeaveTravelConcession ab=new EditPerquisitesLeaveTravelConcession(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickLeaveTravelConcession();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=40)
	public void EditPerquisitesFreeEducationforhouseholdmembers_SC_1096() throws Exception{
		EditPerquisitesFreeEducationforhouseholdmembers ab=new EditPerquisitesFreeEducationforhouseholdmembers(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickFreeEducation();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=41)
	public void EditPerquisitesFreeeducationforEmployeesChildren_SC_1097() throws Exception{
		EditPerquisitesFreeeducationforEmployeesChildren ab=new EditPerquisitesFreeeducationforEmployeesChildren(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickFreeEducationEmp();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=42)
	public void EditPerquisitesGas_SC_1098() throws Exception{
		EditPerquisitesGas ab=new EditPerquisitesGas(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickGas();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=43)
	public void EditPerquisitesElectricity_SC_1099() throws Exception{
		EditPerquisitesElectricity ab=new EditPerquisitesElectricity(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickElectricity();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=44)
	public void EditPerquisitesWater_SC_1100() throws Exception{
		EditPerquisitesWater ab=new EditPerquisitesWater(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickWater();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=45)
	public void EditPerquisitesGardener_SC_1101() throws Exception{
		EditPerquisitesGardener ab=new EditPerquisitesGardener(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickGardener();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}*/
	@Test(priority=46)
	public void EditPerquisitesSweeper_SC_1102() throws Exception{
		EditPerquisitesSweeper ab=new EditPerquisitesSweeper(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickSweeper();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=47)
	public void EditPerquisitesWatchman_SC_1103() throws Exception{
		EditPerquisitesWatchman ab=new EditPerquisitesWatchman(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickWatchman();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=48)
	public void EditPerquisitesPersonalAttendant_SC_1104() throws Exception{
		EditPerquisitesPersonalAttendant ab=new EditPerquisitesPersonalAttendant(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickPersonalAttendants();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=49)
	public void EditPerquisitesEmployerContributionToPF_SC_1105() throws Exception{
		EditPerquisitesEmployerContributionToPF ab=new EditPerquisitesEmployerContributionToPF(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickEmpContribution();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=50)
	public void EditPerquisitesInterestCreditPF_SC_1106() throws Exception{
		EditPerquisitesInterestCreditPF ab=new EditPerquisitesInterestCreditPF(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickIntrestCredit();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=51)
	public void EditPerquisitesTaxPaidByEmployer_SC_1107() throws Exception{
		EditPerquisitesTaxPaidByEmployer ab=new EditPerquisitesTaxPaidByEmployer(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickTaxPaidByEmp();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=52)
	public void EditPerquisitesHotelAccommodation_SC_1108() throws Exception{
		EditPerquisitesHotelAccommodation ab=new EditPerquisitesHotelAccommodation(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickHotelAccomodation();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	/*@Test(priority=53)
	public void EditPerquisitesInterestfreeorconcessionalloans_SC_1109() throws Exception{
		EditPerquisitesInterestfreeorconcessionalloans ab=new EditPerquisitesInterestfreeorconcessionalloans(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickInterestFree();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=54)
	public void EditPerquisitesCarOtherAutomotive_SC_1110() throws Exception{
		EditPerquisitesCarOtherAutomotive ab=new EditPerquisitesCarOtherAutomotive(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickCarOtherAutoMotive();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=55)
	public void EditPerquisitesHolidayExpenses_SC_1111() throws Exception{
		EditPerquisitesHolidayExpenses ab=new EditPerquisitesHolidayExpenses(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickHolidayExp();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=56)
	public void EditPerquisitesFreefoodandnonalcoholicbeverges_SC_1112() throws Exception{
		EditPerquisitesFreefoodandnonalcoholicbeverges ab=new EditPerquisitesFreefoodandnonalcoholicbeverges(driver);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
		Thread.sleep(2000);
		ab.ClickFreeFood();
		ab.EnterEditedValues("20");
		ab.clickUpdateBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Updated successfully.");
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickComputationDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickPerquisites();
	}
	@Test(priority=57)
	public void EditPerquisitesGiftsVouchers_SC_1113() throws Exception{
	
	}*/
}
	
