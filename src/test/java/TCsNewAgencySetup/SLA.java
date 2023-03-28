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
//	    Login.LoginAgencyStage();
	    SLAUtils.AgencySetup_SLAPreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualSLAHeader, expectedSLAHeader);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 1)
	public static void AgencySetup_CreateSLAPopupOpenAndClose() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAPopupOpenAndClose ");
	    extentTest.setDescription("Verify that user is able open and close 'Create SLA' pop up when click on 'Create SLA' and 'Cancel' button on  'SLA Page ' and 'Create SLA' page respectively");
	    SLAUtils.AgencySetup_CreateSLAPopupOpenAndClose();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualSLApopHeader, expectedSLApopHeader);
		softAssert.assertEquals(SLApopHeader == 0, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 2)
	public static void AgencySetup_CreateSLAPopupValidatiions() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAPopupValidatiions ");
	    extentTest.setDescription("Verify that Validation message appears when click on 'Create SLA' button with no data,rule added on 'Create SLA' page");
	    SLAUtils.AgencySetup_CreateSLAPopupValidatiions();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualNameValidSLA, expectedNameValidSLA);
		softAssert.assertEquals(actualGlobalValidSLA, expectedGlobalValidSLA);

		softAssert.assertAll();
	}
	
	
	@Test(priority = 3)
	public static void AgencySetup_CreateSLAAddRuleValidations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLAAddRuleValidations ");
	    extentTest.setDescription("Verify that Add rule validation message appear when click on 'Add Rule' button on 'Create Rule' pop up ");
	    SLAUtils.AgencySetup_CreateSLAAddRuleValidations();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualcrtRuleHeader1 == 0, true);
		softAssert.assertEquals(actualcrtRuleHeader, expectedCrtRuleHeader);
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
	    extentTest.setDescription("Verify that user is able to add new rule  on 'Create SLA' page");
	    SLAUtils.AgencySetup_CreateSLA_AddRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedRuleDesc.contains(selectedCatVal),true);
		softAssert.assertEquals(AddedRuleDesc.contains(selectedAttriVal),true);
		softAssert.assertAll();
		
		
	}  
	
	
	
	@Test(priority = 5)
	public static void AgencySetup_CreateSLA_EditAddRule() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLA_EditAddRule ");
	    extentTest.setDescription("Verify that  Edit the rule on 'Create SLA' page");
//	    AgencySetup_SLAPreRequisite();
//	    AgencySetup_CreateSLAPopupOpenAndClose();
//	    AgencySetup_CreateSLAPopupValidatiions();
//	    AgencySetup_CreateSLAAddRuleValidations();
//	    AgencySetup_CreateSLA_AddRule();
	    SLAUtils.AgencySetup_CreateSLA_EditAddRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(EdditedRuleDesc.contains(selectedCatVal),true);
		
		softAssert.assertAll();
		
		
	}
	
	@Test(priority = 6)
	public static void AgencySetup_CreateSLA() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateSLA ");
	    extentTest.setDescription("Verify that user is able to add SLA on 'SLA' page");
//	    AgencySetup_SLAPreRequisite();
//	    AgencySetup_CreateSLAPopupOpenAndClose();
//	    AgencySetup_CreateSLAPopupValidatiions();
//	    AgencySetup_CreateSLAAddRuleValidations();
//	    AgencySetup_CreateSLA_AddRule();
//	    SLAUtils.AgencySetup_CreateSLA_EditAddRule();
	    SLAUtils.AgencySetup_CreateSLA();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(newAddedSLA,sLALableName);
		softAssert.assertEquals(AfteractiveSLACount,BeforeactiveSLACount+1);
		softAssert.assertAll();
		
		
	}
	
	@Test(priority = 7)
	public static void AgencySetup_EditSLA() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_EditSLA ");
	    extentTest.setDescription("Verify that user is able to edit SLA on 'SLA' page");
//	    AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_EditSLA();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(newEditSLA,sLALableName);
		softAssert.assertEquals(EditsLADesription,sLADesription);
		softAssert.assertAll();
	


}
	
	
	@Test(priority = 8)
	public static void AgencySetup_ErrorMessageAppearCreatingExistingSLAName() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_ErrorMessageAppearCreatingExistingSLAName ");
	    extentTest.setDescription("Verify that error message appears & Template does not get created, when user clicks on 'Save' button, after entering existing data in 'Name' field, on 'Create SLA' popup.");
//	    AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_ErrorMessageAppearCreatingExistingSLAName();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualErrorMsg,expectedduplicatErrorMessage);
		softAssert.assertAll();
}
	
	@Test(priority = 9)
	public static void AgencySetup_InactivteActiveSLA() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_ErrorMessageAppearCreatingExistingSLAName ");
	    extentTest.setDescription("Verify that user able to Inactivate the active SLA on 'SLA' page");
//	    AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_InactivteActiveSLA();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(inactiveSLACountBefore + 1,inactiveSLACount);
		softAssert.assertEquals(activeSLAName,inactivateSLA);
		softAssert.assertAll();
}
	
	
	@Test(priority = 10)
	public static void AgencySetup_ActivateInactiveSLA() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_ActivateInactiveSLA ");
	    extentTest.setDescription("Verify that user able to Activate the Inactive SLA on 'SLA' page");
//	    AgencySetup_SLAPreRequisite();
	    SLAUtils.AgencySetup_ActivateInactiveSLA();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(activeSLACountBefore + 1,activeSLACount);
		softAssert.assertEquals(activeSLAName,inactivateSLA);
		softAssert.assertAll();
}
	
}
