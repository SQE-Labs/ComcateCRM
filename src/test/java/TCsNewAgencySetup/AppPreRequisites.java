package TCsNewAgencySetup;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POMCRM.CreateCRMUserUtils;
import POMNewAgencySetup.AppPreRequisitesUtils;
import TestCasesCRM.Login;
import POMNewAgencySetup.AgencyCreationUtils;

public class AppPreRequisites extends AppPreRequisitesUtils {

	@Test(priority = 1)
	public static void AgencySetup_VerifyAppConfigurations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyAppConfigurations ");
		extentTest.setDescription(
				" Verify that all the corresponding configurations appear, after user enters the Agency from Admin Login. ");
		//String RandomAgencyName =  RandomAgencyName;
		AppPreRequisitesUtils.AgencySetup_VerifyAppConfigurations(RandomAgencyName);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(GetCRMTrace, "CRM");
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void AgencySetup_VerifyCreationOfLCFs() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOfLCFs ");
		extentTest.setDescription(
				" Verify that user is able to Create, Add & Update multiple Location Custom Fields, on 'Location and Maps' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfLCFs();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(LCFTabTitle, "Location Custom Fields");
		softAssert.assertEquals(CLCFPopupTitle, ExpectedCLCFTitle);
		softAssert.assertTrue(CompareLCFsCount);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void AgencySetup_VerifyUploadedMapLayer() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyUploadedMapLayer ");
		extentTest.setDescription(
				" Verify that user is able to upload a Map Layer under 'Map Layers' tab, on 'Location and Maps' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyUploadedMapLayer();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(MapLayerTabTitle, "Map Layers");
		softAssert.assertEquals(CreateMLPopupTitle, ExpectedCreateMLTitle);
		softAssert.assertTrue(CompareMapLayersCount);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void AgencySetup_VerifyUploadedAgencyBoundary() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyUploadedAgencyBoundary ");
		extentTest.setDescription(
				" Verify that user is able to upload a valid KMZ file to define Agency Boundary, on 'Location and Maps' page. ");
		
		AppPreRequisitesUtils.AgencySetup_VerifyUploadedAgencyBoundary();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(BoundaryTabTitle, "Agency Boundary");
		softAssert.assertEquals(ActualBoundaryFile, ExpectedBoundaryFile);
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void AgencySetup_VerifyUploadedAgencyParcelFile() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyUploadedAgencyParcelFile ");
		extentTest.setDescription(
				" Verify that user is able to upload a valid ZIP file for Agency Paarcel File, under 'Map Settings' tab, on 'Location and Maps' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyUploadedAgencyParcelFile();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(MapSettingsTabTitle, "Map Settings");
		softAssert.assertEquals(ActualAPZipFile, ExpectedAPZipFile);
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void AgencySetup_VerifyCreatedUser() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreatedUser ");
		extentTest.setDescription(
				" Verify that user is able to Create a new User under 'Users' tab, on 'User Management' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreatedUser();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateCRMUserUtils.CreateProductAdminUser_CompareCount, true);
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void AgencySetup_VerifyAdditionOfFAActivity() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyAdditionOfFAActivity ");
		extentTest.setDescription(
				" Verify that user is able to create a Forced Abatement Activity under 'Forced Abatement' tab, on 'Case Management' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyAdditionOfFAActivity();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedFAActivity, "Forced Abatement");
		softAssert.assertAll();
	}

	@Test(priority = 8)
	public static void AgencySetup_VerifyCreationOfMunicipalCode() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOfMunicipalCode ");
		extentTest.setDescription(
				" Verify that user is able to create & add multiple Municipal Codes under 'Municipal Code' tab, on 'Violations' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfMunicipalCode();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateMunicipalCodePopupTitle, "Create Municipal Code");

		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void AgencySetup_VerifyCreationOfViolations() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOfViolations ");
		extentTest.setDescription(
				" Verify that user is able to create & add multiple Violations under 'Violations' tab, on 'Violations' page. ");
//		Login.LoginAdmin();
//		AgencySetup_VerifyAppConfigurations();
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfViolations();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckVio1);
		softAssert.assertTrue(CheckVio2);
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void AgencySetup_VerifyInvalidDispositionCreation() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyInvalidDispositionCreation ");
		extentTest.setDescription(
				" Verify that user is able to create an invalid disposition under 'Dispositions' tab, on 'Violations' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyInvalidDispositionCreation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(DispositionsPopupTitle, ExpectedDispositionsPopupTitle);
		softAssert.assertEquals(LabelValidationMsg, ExpDispositionLabelValidationMsg);
		softAssert.assertTrue(CheckDispositionCount);
		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void AgencySetup_VerifyCreationOfNonHTMLNotice() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOfNonHTMLNotice ");
		extentTest.setDescription(
				" Verify that user is able to create & add a Non-HTML Notice under 'Notices' tab, on 'Notices' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfNonHTMLNotice();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CompareCountNonHTML, true);
		softAssert.assertAll();
	}

	@Test(priority = 12)
	public static void AgencySetup_VerifyCreationOfHTMLNotice() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_AgencySetup_VerifyCreationOfHTMLNotice ");
		extentTest.setDescription(
				" Verify that user is able to create an HTML Notice of 'Case Notice' type, with a Violation type linked, on 'Notices' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfHTMLNotice();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CompareCountHTML, true);
		softAssert.assertAll();
	}

	@Test(priority = 13)
	public static void AgencySetup_AgencySetup_AgencySetup_VerifyCreationOfFADocument() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_AgencySetup_AgencySetup_VerifyCreationOfFADocument ");
		extentTest.setDescription(
				" Verify that user is able to create an HTML Notice of  'FA Document' type, on 'Notices' page. ");
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfFADocument();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CompareCountFADoc, true);
		softAssert.assertAll();
	}

	@Test(priority = 14)
	public static void AgencySetup_VerifyCreationOfCategories() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOfCategories ");
		extentTest.setDescription(
				" Verify that user is able to create & add multiple Categories under 'Categories' tab, on 'Categories' page. ");
//		Login.LoginAdmin();
//		AgencySetup_VerifyAppConfigurations();
		AppPreRequisitesUtils.AgencySetup_VerifyCreationOfCategories();
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertAll();
	}

	@Test(priority = 15)
	public static void AgencySetup_VerifySavedSubmissionSettings() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifySavedSubmissionSettings ");
		extentTest
				.setDescription(" Verify that user is able to save required settings, on 'Submission Settings' page. ");
//		Login.LoginAdmin();
//		AgencySetup_VerifyAppConfigurations();
		AppPreRequisitesUtils.AgencySetup_VerifySavedSubmissionSettings();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ToggleButtonState1);
		softAssert.assertTrue(ToggleButtonState2);
		softAssert.assertAll();
	}

	@Test(priority = 16)
	public static void AgencySetup_VerifySuccessfulDirectionToCCP() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifySuccessfulDirectionToCCP ");
	    extentTest.setDescription(" Verify that user is able to direct to the CCP/CSP successfully, after setting up all the required configurations. ");
	    AppPreRequisitesUtils.AgencySetup_VerifySuccessfulDirectionToCCP();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CCPStatus);
		softAssert.assertAll();
	}

	@Test(priority = 17)
	public static void AgencySetup_VerifyCreationOf50PlusCases() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOf50PlusCases ");
	    extentTest.setDescription(" Verify that more than 50 submissions are created for pagination on CSLP. ");
	    AppPreRequisitesUtils.AgencySetup_VerifyCreationOf50PlusCases();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 18)
	public static void AgencySetup_VerifyCreationOf50PlusSubmissions() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreationOf50PlusSubmissions ");
	    extentTest.setDescription(" Verify that more than 50 cases are created for pagination on CLP. ");
	    AppPreRequisitesUtils.AgencySetup_VerifyCreationOf50PlusSubmissions();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 19)
	public static void AgencySetup_VerifyCaseCreationWithEntityViolation() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCaseCreationWithEntityViolation ");
	    extentTest.setDescription(" Verify that user creates a Case with 'Animal' violation, after entering data in mandatory fields to add an entity, on CCP.  ");
	    AppPreRequisitesUtils.AgencySetup_VerifyCaseCreationWithEntityViolation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}
	
	@Test(priority = 20)
	public static void AgencySetup_VerifyCreateFinePopup() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreateFinePopup ");
	    extentTest.setDescription("Verrify that user is able open 'Create Fine' pop up on clicking 'Create File' button on 'Fine' page and close the pop up when click on 'Cancel' Button'");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyCreateFinePopup();	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateFineText, "Create Fine");
		softAssert.assertEquals(CloseCreateFinePOpup, 0);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 21)
	public static void AgencySetup_VerifyFlatFineCreationDoNotAttachedNotices() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyFlatFineCreationDoNotAttachedNotices ");
	    extentTest.setDescription("Verify that user is able to add new flat fine on 'Fine' Page When 'Do not Associate a notice' check box is checked");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyFlatFineCreationDoNotAttachedNotices();	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualCrtFineLabelValidMsg, ExpectedCrtFineLabelValidMsg);
		softAssert.assertEquals(ActualCrtFineDefaultAmntValidMsg, ExpectedCrtFineDefaultAmntValidMsg);
		softAssert.assertEquals(BeforActiveFines + 1, AfterActiveFines);
		softAssert.assertAll();
	}
	
	
	
	@Test(priority = 22)
	public static void AgencySetup_VerifyFlatFineCreationAttachedNotices() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyFlatFineCreationAttachedNotices ");
	    extentTest.setDescription("Verify that user is able to add new flat fine on 'Fine' Page When 'Do not Associate a notice' check box is  unchecked");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyFlatFineCreationAttachedNotices();	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualNoticeRequiresValidMsg, ExpectedNoticeRequiresValidMsg);
		softAssert.assertEquals(BeforActiveFines + 1, AfterActiveFines);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 23)
	public static void AgencySetup_VerifyFlatFineEdit() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyFlatFineEdit ");
	    extentTest.setDescription("Verify that user is able to edit flat fine on 'Fine' Page ");
	    //Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyFlatFineEdit();	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(labelNameAfter.trim(),EditedLabelName.trim() );
		//softAssert.assertEquals(EditedDefAmt,DefltAmtAfter );
		//softAssert.assertTrue(EditedDefAmt.contains(DefltAmtAfter));
		softAssert.assertAll();
	}
	
	@Test(priority = 24)
	public static void AgencySetup_VerifyInactivateActiveFines() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyInactivateActiveFines ");
	    extentTest.setDescription("Verify that user is able to Inactivate the Active fine on 'Fine Page' ");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyInactivateActiveFines();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(InactivefineCountBefore + 1, InactivefineCountafter);
		softAssert.assertEquals(inactiveFineLabel, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 25)
	public static void AgencySetup_VerifyActivateInactiveFines() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyInactivateActiveFines ");
	    extentTest.setDescription("Verify that user is able to Inactivate the Active fine on 'Fine Page' ");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyActivateInactiveFines();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(activefineCountBefore + 1, activefineCountafter);
		softAssert.assertEquals(ActiveFineLabel, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 26)
	public static void AgencySetup_VerifyOpenCloseCreateLateFeePopup() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyOpenCloseCreateLateFeePopup ");
	    extentTest.setDescription("Verify that user is able to open 'Create Late Fee' Pop up after clicking 'Create Late Fee' button and able to close the pop up after clicking 'Cancel' button on 'Create Late Fee' pop up");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyOpenCloseCreateLateFeePopup();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualcreateLateFeePOp, ExpectedCreateLateFeePopup);
		softAssert.assertEquals(CloseCreateLateFeePOpup, 0);
		softAssert.assertEquals(ActualCrtLateFeeLabelValidMsg, ExpectedCrtLateFeeLabelValidMsg);
		softAssert.assertAll();
	}
	
	@Test(priority = 27)
	public static void AgencySetup_VerifyCreateFixedManualFlatFineLateFee() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreateFixedManualFlatFine ");
	    extentTest.setDescription("Verify that user is able to create a Flat, Fixed Amount type Manual Late Fee on 'Late Fee' page");
	   // Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyCreateFixedManualFlatFineLateFee();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(BeforeActiveLateFeeCount + 1, AfterActiveLateFeeCount);
		softAssert.assertEquals(NewAddedLateFeeLable, true);
		softAssert.assertAll();
	}
	
	
	@Test(priority = 27)
	public static void AgencySetup_VerifyCreateOutStdManualFlatFineLateFee() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyCreateOutStdManualFlatFine ");
	    extentTest.setDescription("Verify that user is able to create a Flat, % of outstanding balance type Manual Late Fee on 'Late Fee' page");
//	    Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyCreateOutStdManualFlatFineLateFee();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(BeforeActiveLateFeeCount + 1, AfterActiveLateFeeCount);
		softAssert.assertEquals(NewAddedLateFeeLable, true);
		softAssert.assertAll();
	}
	
	@Test(priority = 28)
	public static void AgencySetup_VerifyInactivateActiveLateFee() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyInactivateActiveLateFee ");
	    extentTest.setDescription("Verify that user is able to Inactivate the Active fine on 'Fine Page' ");
//        Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyInactivateActiveLateFee();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(InactiveLateFeeCountBefore + 1, InactiveLateFeeCountafter);
		softAssert.assertEquals(inactiveLateFeeLabel, true);
		softAssert.assertAll();
	}
	
	@Test(priority = 29)
	public static void AgencySetup_VerifyActivateInActiveLateFee() throws InterruptedException {
		extentTest = extent.startTest(" AgencySetup_VerifyActivateInActiveLateFee ");
	    extentTest.setDescription("Verify that user is able to Activate the Inactive Late Fee on 'Late Fee' Page");
//        Login.LoginAgencyStage();
	    AppPreRequisitesUtils.AgencySetup_VerifyActivateInActiveLateFee();
	    
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(activeLateFeeCountBefore + 1, activeLateFeeCountafter);
		softAssert.assertEquals(ActiveLateFeeLabel, true);
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
