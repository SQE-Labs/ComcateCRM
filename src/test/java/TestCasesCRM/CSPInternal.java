package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.CSPInternalUtils;

public class CSPInternal extends CSPInternalUtils {

	@Test(priority = 0)
	public static void CSPInternal_Prerequisites() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_Prerequisites ");
		extentTest.setDescription(" CSPInternal_Prerequisites ");
		CSPInternalUtils.CSPInternal_Prerequisites();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(SelectedToggleNow.equals("Yes"));
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public static void CSPInternal_VerifyCSPOpensUp() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifyCSPOpensUp ");
		extentTest.setDescription(
				" Verify that CSP opens up, when user clicks on '+' icon > 'Customer submission' option, on Dashboard. ");
		CSPInternalUtils.CSPInternal_VerifyCSPOpensUp();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CSPTitleActual.equals(CSPTitleExpected));
		softAssert.assertTrue(ErrMessageActual.equals(ErrMessageExpected));
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void CSPInternal_VerifyPostAnonymouslycheckbox() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifyPostAnonymouslycheckbox ");
		extentTest.setDescription(
				" Verify that 'Post anonymously' checkbox appears beside 'Customer Information' header, for 'Can submit an issue anonymously?' set as 'Yes', on CSP. ");
		CSPInternalUtils.CSPInternal_VerifyPostAnonymouslycheckbox();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PostAnonymouslyState);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CSPInternal_VerifyCustomerInformationTile() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifyCustomerInformationTile ");
		extentTest.setDescription(
				" Verify that 'Customer Information' tile gets disabled, when user checks the 'Post anonymously' checkbox, on CSP. ");
		CSPInternalUtils.CSPInternal_VerifyCustomerInformationTile();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertFalse(ContactsTileState);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CSPInternal_AddExistingCustomer() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_AddExistingCustomer ");
		extentTest.setDescription(
				" Verify that user is able to search & add customer under 'Add Existing Customer' field, on CSP. ");
		CSPInternalUtils.CSPInternal_AddExistingCustomer();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertFalse(EmailValue.equals(null));
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void CSPInternal_VerifyCategoriesList() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifyCategoriesList ");
		extentTest.setDescription(
				" Verify that Categories added on 'Categories' page appear under 'Select a category for the issue' dropdown field, on CSP. ");
		CSPInternalUtils.CSPInternal_VerifyCategoriesList();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ActualCategorySel.equals(CreatedCategory1));
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void CSPInternal_SearchAndAddCategory() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_SearchAndAddCategory ");
		extentTest.setDescription(" Verify that user is able to search & add a category, on CSP. ");
		CSPInternalUtils.CSPInternal_SearchAndAddCategory();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ActualCategorySel2.equals(CreatedCategory1));
		softAssert.assertAll();
	}

	@Test(priority = 8)
	public static void CSPInternal_LocationRequiredValCategory() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_LocationRequiredValCategory ");
		extentTest.setDescription(
				" Verify that validation message appears under 'Select Location' tile, when user selects a 'Category' with checked 'Location Required' checkbox, on CSP. ");
		CSPInternalUtils.CSPInternal_LocationRequiredValCategory();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(LocValidMsg.equals("The location is required."));
		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void CSPInternal_AddLocation() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_AddLocation ");
		extentTest.setDescription(
				" Verify that user is able to add a location under 'Select Location' tile, when user selects a 'Category' with 'Include Location?' toggle set as 'Yes', on CSP. ");
		CSPInternalUtils.CSPInternal_AddLocation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void CSPInternal_CategoryWithLocationIncluded() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_CategoryWithLocationIncluded ");
		extentTest.setDescription(
				" Verify that 'Select Location' tile no longer appears, when user selects a 'Category' with 'Include Location?' toggle set as 'No', on CSP. ");
		CSPInternalUtils.CSPInternal_CategoryWithLocationIncluded();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(LocationPresence);
		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void CSPInternal_VerifyIssueDescription() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifyIssueDescription ");
		extentTest.setDescription(" Verify that user is able to add an issue description, on CSP. ");
		CSPInternalUtils.CSPInternal_VerifyIssueDescription();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 12)
	public static void CSPInternal_AddMultipleTags() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_AddMultipleTags ");
		extentTest.setDescription(" Verify that user is able to add multiple tags on 'Enter Tags' field, on CSP. ");
		CSPInternalUtils.CSPInternal_AddMultipleTags();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 13)
	public static void CSPInternal_AddAttachments() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_AddAttachments ");
		extentTest.setDescription(" Verify that user is able to add attachments under 'Attachments' tile, on CSP. ");
		CSPInternalUtils.CSPInternal_AddAttachments();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckImgSize);
		softAssert.assertAll();
	}

	@Test(priority = 14)
	public static void CSPInternal_VerifySubmissionCreation() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_VerifySubmissionCreation ");
		extentTest.setDescription(
				" Verify that Submission gets created successfully, when user clicks on 'Create Submission' button after entering data in the mandatory fields, on CSP. ");
		CSPInternalUtils.CSPInternal_VerifySubmissionCreation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(StatusOfSubmission.contains("Open"));
		softAssert.assertAll();
	}

	@Test(priority = 15)
	public static void CSPInternal_SubmissionDoesNotGetCreatedOnCancel() throws InterruptedException {
		extentTest = extent.startTest(" CSPInternal_SubmissionDoesNotGetCreatedOnCancel ");
		extentTest.setDescription(
				" Verify that Submission does not created, when user clicks on 'Cancel' button after entering data in mandatory fields, on CSP. ");
		CSPInternalUtils.CSPInternal_SubmissionDoesNotGetCreatedOnCancel();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

}
