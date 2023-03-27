package TCsNewAgencySetup;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POMCRM.CreateCRMUserUtils;
import POMNewAgencySetup.AppPreRequisitesUtils;
import POMNewAgencySetup.NotificationMangementUtils;
import TestCasesCRM.Login;
import POMNewAgencySetup.AgencyCreationUtils;
import POMNewAgencySetup.TemplateMangementUtils;

public class NotificationManagement extends NotificationMangementUtils {
   
	
	
	
	
	@Test(priority = 0)
	public static void AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_NotificationPreRequisite ");
	    extentTest.setDescription("Verify navigation to 'Notification Management' and default Active -5 and Inactive -4 Notification count");
//	    Login.LoginAgencyStage();
	    NotificationMangementUtils.AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualnotificationHeader, expectednotificationHeader);
		
//		softAssert.assertEquals(actualDefaultActiveNotifCount, expectedDefaultActiveNotifCount);
//		softAssert.assertEquals(actualDefaultInactiveNotifCount, expedtedDefaultInactiveNotifCount);
		softAssert.assertAll();
	}
	
	@Test(priority = 1)
	public static void AgencySetup_CreateNotificationPopCloseOpenAndValidations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationPopCloseOpenAndValidations ");
	    extentTest.setDescription(" Verify create Notification Pop Up Close and Open,validation messages on 'Create Notification Pop Up'");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
	    
	    NotificationMangementUtils.AgencySetup_CreateNotificationPopCloseOpenAndValidations();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualCrtNotifPopupHeader, expectedCrtNotifPopupHeader);
		softAssert.assertEquals(PopupClosed, true);
		softAssert.assertEquals(actualLabelNameValid, expectedLableNameValid);
		softAssert.assertEquals(actualNotifGlobalValidMsg, expectedNotifGlobalValidMsg);
		softAssert.assertAll();
	} 
	
	
	
	@Test(priority = 2)
	public static void AgencySetup_CreateNotificationAddRulePopupValidations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationAddRulePopupValidations ");
	    extentTest.setDescription(" Verify that user is able to open and close 'Create Rule' pop up when click 'Add Rule button 'and Validation message on 'Create Rule' popup when click on 'Create Rule' button");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
//	    AgencySetup_CreateNotificationPopCloseOpenAndValidations();
	    NotificationMangementUtils.AgencySetup_CreateNotificationAddRulePopupValidations();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedAddRuleGlobalValidation, actualAddRuleGlobalValidation);
		softAssert.assertEquals(expectedAddRuleAttributValidation, actualAddRuleAttributValidation);
		softAssert.assertEquals(expectedAddRuleOperatorValidation, actualAddRuleOperatorValidation);
		softAssert.assertEquals(expectedAddRuleValueValidation, actualAddRuleValueValidation);
		softAssert.assertEquals(expectedAddRuleSendOptValidation, actualAddRuleSendOptValidation);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 3)
	public static void AgencySetup_CreateNotificationAddRule() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationAddRulePopupValidations ");
	    extentTest.setDescription("Verify that user is able to add Rules under 'Rules Set' section, on 'Create Notification' popup.");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
//	    AgencySetup_CreateNotificationPopCloseOpenAndValidations();
	    
	    NotificationMangementUtils.AgencySetup_CreateNotificationAddRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedRuleDesc.contains(selectedCatVal),true);
		softAssert.assertEquals(AddedRuleDesc.contains(selectedAttriVal),true);
		softAssert.assertAll();
	}
	
	@Test(priority = 4)
	public static void AgencySetup_CreateNotificationCreateNotifiction() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationAddRulePopupValidations ");
	    extentTest.setDescription("Verify that user is able to create & add a Notification, under 'Notifications' tab.");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
//	    AgencySetup_CreateNotificationPopCloseOpenAndValidations();
//	    NotificationMangementUtils.AgencySetup_CreateNotificationAddRule();
	    NotificationMangementUtils.AgencySetup_CreateNotificationCreateNotifiction();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualNotifLable.trim(),notificationnLabelName.trim());
		softAssert.assertEquals(actualNotifdesc.trim(),notificationnDescription.trim());
		softAssert.assertAll();
	}
	

	@Test(priority = 5)
	public static void AgencySetup_CreateNotifictionMultipleCriteriaDeliveryOption() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotifictionMultipleCriteriaDeliveryOption ");
	    extentTest.setDescription("Verify that user is able to create & add a Notification, under 'Notifications' tab.");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
	    NotificationMangementUtils.AgencySetup_CreateNotifictionMultipleCriteriaDeliveryOption();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualNotifLable,notificationnLabelName);
		softAssert.assertEquals(actualNotifdesc,notificationnDescription);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 6)
	public static void AgencySetup_CreateNotificationInactivateActiveNotificatiion() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationAddRulePopupValidations ");
	    extentTest.setDescription("Verify that user is able to Inactivate the Active notification on 'Notofication Mangement' Page");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
	    NotificationMangementUtils.AgencySetup_CreateNotificationInactivateActiveNotificatiion();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActivatNotif,InactivatedNotif);
		softAssert.assertEquals(InactiveNotifCountAfter,InactiveNotifCountBefore + 1);
		softAssert.assertEquals(actualEditNotificationHeader,expectedEditNotificationHeader);
		softAssert.assertAll();
	}
	
	@Test(priority = 7)
	public static void AgencySetup_CreateNotificationActivateInactiveNotificatiion() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_CreateNotificationAddRulePopupValidations ");
	    extentTest.setDescription("Verify that user is able to Activate the Inactive notification on 'Notofication Mangement' Page");
//	    Login.LoginAgencyStage();
//	    AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount();
	    NotificationMangementUtils.AgencySetup_CreateNotificationActivateInactiveNotificatiion();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(InactiveNotif,ActivatedNotif);
		softAssert.assertEquals(ActiveNotifCountAfter,ActiveNotifCountBefore + 1);
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
