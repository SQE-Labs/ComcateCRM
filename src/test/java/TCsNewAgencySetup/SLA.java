package TCsNewAgencySetup;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POMCRM.CreateCRMUserUtils;
import POMNewAgencySetup.AppPreRequisitesUtils;
import TestCasesCRM.Login;
import POMNewAgencySetup.AgencyCreationUtils;
import POMNewAgencySetup.SLAUtils;

public class SLA extends SLAUtils {
   
	@Test(priority = 0)
	public static void AgencySetup_SLAPreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_SLAPreRequisite ");
	    extentTest.setDescription(" Navigate to SLA Page");
	    Login.LoginAgencyStage();
	    SLAUtils.AgencySetup_SLAPreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualSLAHeader, expectedSLAHeader);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 1)
	public static void AgencySetup_CreateSLAPopupOpenAndClose() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAPopupOpenAndClose ");
	    extentTest.setDescription("Verify that user is able Close and Open 'Create SLA' pop up when click on 'Create SLA' and 'Cancel' button");
//	    Login.LoginAgencyStage();
//	    SLAUtils.AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_CreateSLAPopupOpenAndClose();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualSLApopHeader, expectedSLApopHeader);
		softAssert.assertEquals(SLApopHeader == 0, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 2)
	public static void AgencySetup_CreateSLAPopupValidatiionsAndCreateRulePopup() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAPopupOpenAndClose ");
	    extentTest.setDescription("Verify that Validation message appear when click on 'Create SLA' button with no data enterd and 'Add Rule' pop is open and closed when click"
	    		+ "on 'Add Rule' button and 'Cancel' button on 'Create Rule' pop up");
//	    Login.LoginAgencyStage();
//	    SLAUtils.AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_CreateSLAPopupValidatiionsAndCreateRulePopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualNameValidSLA, expectedNameValidSLA);
		softAssert.assertEquals(actualGlobalValidSLA, expectedGlobalValidSLA);
		softAssert.assertEquals(actualcrtRuleHeader1 == 0, true);
		softAssert.assertEquals(actualcrtRuleHeader, expectedCrtRuleHeader);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 3)
	public static void AgencySetup_CreateSLAAddRuleValidations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAAddRuleValidations ");
	    extentTest.setDescription("Verify that Add rule validation message appear when click on 'Add Rule' button on 'Create Rule' pop up ");
//	    Login.LoginAgencyStage();
//	    SLAUtils.AgencySetup_SLAPreRequisite();
//	    SLAUtils.AgencySetup_CreateSLAPopupValidatiionsAndCreateRulePopup();
	    SLAUtils.AgencySetup_CreateSLAAddRuleValidations();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualAddRuleAttributValidation, expectedAddRuleAttributValidation);
		softAssert.assertEquals(actualAddRuleOperatorValidation, expectedAddRuleOperatorValidation);
		softAssert.assertEquals(actualAddRuleValueValidation, expectedAddRuleValueValidation);
		
		softAssert.assertEquals(actualEsclatToValidation, expectedEsclatToValidation);
		softAssert.assertEquals(UseTemplateValidation, expectedUseTemplateValidation);
		softAssert.assertEquals(actualFreqSendingValidation, expectedFreqSendingValidation);
		
		softAssert.assertAll();
		
	}
	
	
	@Test(priority = 4)
	public static void AgencySetup_CreateSLA_AddRule() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAAddRuleValidations ");
	    extentTest.setDescription("Verify that Add rule validation message appear when click on 'Add Rule' button on 'Create Rule' pop up ");
	    Login.LoginAgencyStage();
	    SLAUtils.AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_CreateSLAPopupValidatiionsAndCreateRulePopup();
	    SLAUtils.AgencySetup_CreateSLAAddRuleValidations();
	    SLAUtils.AgencySetup_CreateSLA_AddRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedRuleDesc.contains(selectedCatVal),true);
		softAssert.assertEquals(AddedRuleDesc.contains(selectedAttriVal),true);
		softAssert.assertAll();
		
		
	}  
	
	
	@Test(priority = 5)
	public static void AgencySetup_CreateSLA() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLA ");
	    extentTest.setDescription("Verify that user is able to add SLA on 'SLA' page");
	    Login.LoginAgencyStage();
	    SLAUtils.AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_CreateSLAPopupValidatiionsAndCreateRulePopup();
	    SLAUtils.AgencySetup_CreateSLAAddRuleValidations();
	    SLAUtils.AgencySetup_CreateSLA_AddRule();
	    SLAUtils.AgencySetup_CreateSLA();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedRuleDesc.contains(selectedCatVal),true);
		softAssert.assertEquals(AddedRuleDesc.contains(selectedAttriVal),true);
		softAssert.assertAll();
		
		
	}
	
	
	
//	@Test(priority = )
//	public static void AgencySetup_VerifyAllLinksForCEDashboard() throws InterruptedException {
//		extentTest = extent.startTest(" AgencySetup_VerifyAllLinksForCEDashboard ");
//	    extentTest.setDescription(" Verify that all links under 'Cases', 'Inspections' & 'Notices' section appear, on CE Dashboard. ");
//	AppPreRequisitesUtils.AgencySetup_VerifyAllLinksForCEDashboard();
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertAll();
//	}

}
