package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.WebDriverWaits;
import POMCRM.SubmissionSettingsUtils;

public class SubmissionSettings extends SubmissionSettingsUtils {

	@Test(priority = 1)
	public static void SubmissionSettings_VerifyToggleButtonsState() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyToggleButtonsState ");
		extentTest.setDescription(
				" Verify that user is able to select any 'Closing the code case automatically closes the submission?' toggle buttons, on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyToggleButtonsState();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ToggleButtonState);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void SubmissionSettings_VerifyDiscardButtonFunctionality() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyDiscardButtonFunctionality ");
		extentTest.setDescription(
				" Verify that the changes do not get saved, when user clicks on 'Discard Changes' button, on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyDiscardButtonFunctionality();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertFalse(ToggleButtonState2);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void SubmissionSettings_VerifyChangesGetSaved() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyChangesGetSaved ");
		extentTest.setDescription(
				" Verify that the changes get saved, when user clicks on 'Save Changes' button, on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyChangesGetSaved();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ToggleButtonState3);	
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission ");
		extentTest.setDescription(
				" Verify that Submission gets closed automatically on closing the linked Case, when 'Closing the code case automatically closes the submission?' toggle button is set to 'Yes', on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(FetchCaseStatusForYes, "Closed");
		softAssert.assertEquals(FetchSubmissionStatusForYes, "Closed");
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void SubmissionSettings_VerifyCaseDoesntCloseForNoToggle() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyCaseDoesntCloseForNoToggle ");
		extentTest.setDescription(
				" Verify that Submission does not get closed automatically on closing the linked Case, when 'Closing the code case automatically closes the submission?' toggle button is set to 'No', on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyCaseDoesntCloseForNoToggle();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(FetchCaseStatusForNo, "Closed");
		softAssert.assertEquals(FetchSubmissionStatusForNo, "Open");
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void SubmissionSettings_VerifyselectionOfAnonymousToggles() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyselectionOfAnonymousToggles ");
		extentTest.setDescription(
				" Verify that user is able to select any 'Can submit an issue anonymously?' toggle button, on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyselectionOfAnonymousToggles();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ToggleButtonState4);	
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void SubmissionSettings_VerifyPostAnonymouslyForYesToggle() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyPostAnonymouslyForYesToggle ");
		extentTest.setDescription(
				" Verify that 'Post anonymously' checkbox appears on CSP, when 'Can submit an issue anonymously?' toggle button is set to 'Yes', on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyPostAnonymouslyForYesToggle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PostAnonymouslyPresence);	
		softAssert.assertAll();
	}

	@Test(priority = 8)
	public static void SubmissionSettings_VerifyPostAnonymouslyForNoToggle() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionSettings_VerifyPostAnonymouslyForNoToggle ");
		extentTest.setDescription(
				" Verify that 'Post anonymously' checkbox does not appear on CSP, when 'Can submit an issue anonymously?' toggle button is set to 'No', on 'Submission Settings' page. ");
		SubmissionSettingsUtils.SubmissionSettings_VerifyPostAnonymouslyForNoToggle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PostAnonymouslyPresence);	
		softAssert.assertAll();
	}
}
