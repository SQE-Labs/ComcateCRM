package TestCasesCRM;

import java.awt.AWTException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.CSPExternalUtils;

public class CSPExternal extends CSPExternalUtils {


	@Test(priority = 1)
	public static void CSPExternal_PreRequisite_OpenReportAnIssuePage() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_OpenReportAnIssuePage ");
		extentTest.setDescription(
				" Verify that 'Report an issue' page opens up, when user clicks on the URL under CRM section, on 'Edit Agency' popup. ");
		CSPExternalUtils.CSPExternal_PreRequisite_OpenReportAnIssuePage();
		//CSPExternalUtils.CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(RASPageTitle, "Report an issue");
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void CSPExternal_VerifyIssueDescription() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyIssueDescription ");
		extentTest.setDescription(
				" Verify that user is able to add Issue Description in 'Describe the issue' textbox, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyIssueDescription();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(DescriptionValidation, ExpectedDescriptionMsg);
		softAssert.assertEquals(Validation2000, Expected2000Msg);
		softAssert.assertTrue(CategorySectionState);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CSPExternal_VerifyAddedAttachments() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyAddedAttachments ");
		extentTest.setDescription(
				" Verify that user is able to attach files, after clicking on the 'Browse file' link, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyAddedAttachments();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CountAttachments);
		softAssert.assertTrue(CountAttachmentsAfter);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CSPExternal_VerifyCorrespondingCategoryToKeyword() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyCorrespondingCategoryToKeyword ");
		extentTest.setDescription(
				" Verify that corresponding Category with added keyword in 'Describe the issue' textbox, appears selected by default, under 'Select Category' section. ");
//		//Login.LoginAgency();
//		CSPExternal_PreRequisite_OpenReportAnIssuePage();
//		 CSPExternal_VerifyIssueDescription();
//		 CSPExternal_VerifyAddedAttachments();
		CSPExternalUtils.CSPExternal_VerifyCorrespondingCategoryToKeyword();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(categoryContains);
		softAssert.assertTrue(CountAllCategories);
		softAssert.assertAll();
		}

	@Test(priority = 5)
	public static void CSPExternal_VerifyNoLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyNoLocationSection ");
		extentTest.setDescription(
				" Verify that 'Location' section no longer appears, when user selects a 'Category' with 'Include Location?' toggle set as 'No'. ");
		CSPExternalUtils.CSPExternal_VerifyNoLocationSection();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(NoLocationSection);
		softAssert.assertEquals(PageTitleSubmitSubmission, ExpectedTitleSubmitSubmission);
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void CSPExternal_VerifyRequiredLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyRequiredLocationSection ");
		extentTest.setDescription(" Verify that validation message appears under 'Location' section, when user clicks on 'Next' button, after selecting a Location Required 'Category'. ");
		CSPExternalUtils.CSPExternal_VerifyRequiredLocationSection();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ValidationMsgLocation, ExpectedMsgLoc);
		softAssert.assertEquals(SubmitPageTitle, ExpectedTitleSubmitSubmission);
		softAssert.assertAll();
		}

	@Test(priority = 7)
	public static void CSPExternal_VerifyNonMandatoryLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyNonMandatoryLocationSection ");
		extentTest.setDescription(" Verify that user is able to add a location under 'Location' section, when user selects a 'Category' with 'Include Location?' toggle set as 'Yes'. ");
		CSPExternalUtils.CSPExternal_VerifyNonMandatoryLocationSection();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmitPageTitle, ExpectedTitleSubmitSubmission);
		softAssert.assertAll();
		}

	@Test(priority = 8)
	public static void CSPExternal_VerifyMandatoryFieldsForNonAnonymous() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyMandatoryFieldsForNonAnonymous ");
		extentTest.setDescription(" Verify that validation messages appear under 'First Name' & 'Last Name' fields, when 'Post anonymously' checkbox is unchecked, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyMandatoryFieldsForNonAnonymous();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ValidMsgFirstName, ExpectedMsgName1);
		softAssert.assertEquals(ValidMsgLastName, ExpectedMsgName2);
		softAssert.assertEquals(LimitMsgFirstName, CharLimitValidation);
		softAssert.assertEquals(LimitMsgLastName, CharLimitValidation);
		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void CSPExternal_VerifyEmailFieldPreference() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyEmailFieldPreference ");
		extentTest.setDescription(" Verify that validation message appears under 'Email' field, when 'I want to receive updates on my submission' checkbox is checked, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyEmailFieldPreference();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(EmailValidationMessage, ExpectedEmailMsg);
		softAssert.assertEquals(InvalidMailMsg, ExpectedInvalidMsg);
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void CSPExternal_VerifyAnonymousSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyAnonymousSubmission ");
		extentTest.setDescription(" Verify that user is able to Submit the issue Anonymously, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyAnonymousSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsg, ExpectedSuccessMsg);
		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void CSPExternal_VerifyNonAnonymousSubmission() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" CSPExternal_VerifyNonAnonymousSubmission ");
		extentTest.setDescription(" Verify that user is able to submit the issue after entering the Contact details, on 'Report an issue' page. ");
		CSPExternalUtils.CSPExternal_VerifyNonAnonymousSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsgNA, ExpectedSuccessMsg);
		softAssert.assertAll();
		Thread.sleep(2000);
	}

}
