package TCsNewAgencySetup;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POMCRM.CreateCRMUserUtils;
import POMNewAgencySetup.AppPreRequisitesUtils;
import TestCasesCRM.Login;
import POMNewAgencySetup.AgencyCreationUtils;
import POMNewAgencySetup.TemplateMangementUtils;

public class TemplateManagement extends TemplateMangementUtils {
   
	
	@Test(priority = 1)
	public static void TemplateMangement_PreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" TemplateMangement_PreRequisite ");
		extentTest.setDescription(
				"Verify TemplateMangement sub tab is open after clicking on TemplateMangement sidebar under Agency setup.");
		
		TemplateMangementUtils.TemplateMangement_PreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(emailTemplatesLabel, ExpectedemailTemplatesLabel);
		softAssert.assertEquals(TextMessageTemplateLabel,ExpectedTextMessageTemplateLabel );
		softAssert.assertAll();
	}
	
	
	
	@Test(priority = 2)
	public static void TemplateMangement_CloseandOpenCreateTemplatePOpup() throws InterruptedException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that user is able to open and close the '' popup after clicking the '' and '' buttons on '' and '' pages respectively");
		TemplateMangementUtils.TemplateMangement_CloseandOpenCreateTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CrtTemplateHeader, ExpectedCrtTemplateHeader);
		softAssert.assertEquals(ClosedCrtTemplatePopup, true);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void TemplateMangement_VerifyValidationsOnCreateTemplatePOpup() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that appropriate validation messages appears, on clicking the 'Save' button when no/ data exceeding the max limit is entered in fields, on 'Create Template' popup");
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
		TemplateMangementUtils.TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualNameValidMsg, ExpectedNameValidMsg);
		softAssert.assertEquals(ActualEmailSubLineValidMsg, ExpectedEmailSubLineValidMsg);
		softAssert.assertEquals(ActualEmailBdyValidMsg, ExpectedEmailBdyValidMsg);
		softAssert.assertEquals(ActualEmailSubLineValidMsg, EmailSubLnMsg);
		softAssert.assertAll();
	}
	
	@Test(priority = 4)
	public static void TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_CloseandOpenCreateTemplatePOpup ");
		extentTest.setDescription(
				"Verify that user is able to add/remove a single as well as multiple documents, on 'Create Template' popup");
//	    Login.LoginAgencyStage();
//	    TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
		
		TemplateMangementUtils.TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(filesCountCheck, true);
		softAssert.assertEquals(filesAfterCountCheck, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 5)
	public static void TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated ");
		extentTest.setDescription("Verify that 'Preview Email Template' popup opens up with appropriate data, when user clicks 'Preview' button, on 'Create Template' popup.");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
//		TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
		
		TemplateMangementUtils.TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualpreviewTempData, ExpectedpreviewTemplateData);
		softAssert.assertEquals(ActualpreviewTempHeader, ExpectedpreviewTemplateHeader);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 6)
	public static void TemplateMangement_VerifyTemplateAdditionOfTemplate() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyTemplateAdditionAndEditTemplate ");
		extentTest.setDescription("New template gets added under 'Email templates' tab, when user clicks on 'Save' button after entering data in mandatory fields, on 'Create Template' popup.");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
//		TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
//		TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated();
		
		TemplateMangementUtils.TemplateMangement_VerifyTemplateAdditionOfTemplate();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(TemplateGridNameLbl, templateName);
		softAssert.assertEquals(TemplateGridSubLine.trim(), rndSubLine.trim());
//		softAssert.assertEquals(TemplateGridSubLine, rndSubLine);
		softAssert.assertEquals(TemplateGridRelatedDoc.contains((DocumentJellyFish.replace(".jpg",""))), true);
		softAssert.assertEquals(TemplateGridRelatedDoc.contains((DocumentPanda.replace(".jpg",""))), true);
		softAssert.assertEquals(TemplateGridLastUpdated.contains(LoggedUser), true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 7)
	public static void TemplateMangement_VerifyEditTheTemplate() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyEditTheTemplate ");
		extentTest.setDescription("Verify that respective 'Edit <Template Name>' popup opens up, when user clicks on 'Edit' icon of any template and able to edit template on 'Template Management' page.");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();
//		TemplateMangement_VerifyValidationsOnCreateTemplatePOpup();
//		TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup();
//		TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated();
		
		TemplateMangementUtils.TemplateMangement_VerifyEditTheTemplate();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(TemplateGridSubLine.trim(), rndSubLine.trim());
		softAssert.assertEquals(TemplateNameStatus, false);
		softAssert.assertEquals(actualTemplateName,EditTemplateHeader);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 8)
	public static void TemplateMangement_VerifyErrorMessgeOnAdditionOfExistingTemplate() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyErrorMessgeOnAdditionOfExistingTemplate ");
		extentTest.setDescription("Verify that an error message appears & Template does not get created, when user clicks on 'Save' button, after entering existing data in 'Name' field, on 'Create Template' popup.");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();	
		TemplateMangementUtils.TemplateMangement_VerifyErrorMessgeOnAdditionOfExistingTemplate();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualMsg, expectedMsg);
		softAssert.assertAll();
	} 
	
	
	
	@Test(priority = 9)
	public static void TemplateMangement_VerifyActivateAndDeActivateTemplate() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" TemplateMangement_VerifyActivateAndDeActivateTemplate ");
		extentTest.setDescription("Verify that user able to activate/deactivate the template on 'Email Template' Page");
		
//		Login.LoginAgencyStage();
//		TemplateMangement_PreRequisite();	
		TemplateMangementUtils.TemplateMangement_VerifyActivateAndDeActivateTemplate();
		SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(actualCount, expectedCount);
	    softAssert.assertEquals(ActivatedTemplate, InactivatedTemplate);
	    softAssert.assertEquals(InactivatedTemplate, ActivatedTemplate);
	    softAssert.assertEquals(actualCountActive, expectedCountActive);
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
