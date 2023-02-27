package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import POMCRM.CreateAndLinkCaseUtils;
import org.openqa.selenium.JavascriptExecutor;

public class CreateAndLinkCase extends CreateAndLinkCaseUtils {

	@Test(priority = 0)
	public static void CreateAndLinkCase_PreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_PreRequisite ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_PreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public static void CreateAndLinkCase_OpenCCPToLinkTheCase() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_OpenCCPToLinkTheCase ");
		extentTest.setDescription(
				" Verify that CCP opens up, when user clicks on 'More' button > 'Create & Link Case' option, on CSDP. ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_OpenCCPToLinkTheCase();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CCPTitle.equals("Create A Case"));
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void CreateAndLinkCase_VerifyAutopopulatedData() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_VerifyAutopopulatedData ");
		extentTest.setDescription(
				" Verify that Submission details from CSDP gets autopopulated on corresponding fields of CCP. ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_VerifyAutopopulatedData();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(IssueDescriptionTextCCP.equals(DescriptionCSDP));
		softAssert.assertTrue(AttachmentCountCCP.equals(AttachmentsCountCSDP));
		softAssert.assertTrue(ContactOnCCP.equals(CustomerOnCSDP));
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CreateAndLinkCase_VerifyLinkedCase() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_VerifyLinkedCase ");
		extentTest.setDescription(
				" Verify that user is able to Create a Linked Case after entering data in the mandatory fields, on CCP. ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_VerifyLinkedCase();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CreateCasePopupTitle.equals("Create Case"));
		softAssert.assertTrue(AssociatedSubmission.equals(SubmissionNumberCSDP));
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CreateAndLinkCase_VerifyDirectionToAssociatedSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_VerifyDirectionToAssociatedSubmission ");
		extentTest.setDescription(
				" Verify that user gets directed to the corresponding Submission, after clicking on the 'Associated Submission' link on the Header of CDP. ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_VerifyDirectionToAssociatedSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(AssociatedCase.equals(CaseNumberLinked));
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void CreateAndLinkCase_VerifyDirectionToAssociatedCase() throws InterruptedException {
		extentTest = extent.startTest(" CreateAndLinkCase_VerifyDirectionToAssociatedSubmission ");
		extentTest.setDescription(
				" Verify that user gets directed to the corresponding Case, after clicking on the 'Associated Case' link on the Header of CSDP. ");
		CreateAndLinkCaseUtils.CreateAndLinkCase_VerifyDirectionToAssociatedCase();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CaseNumberLinked.equals(AssociatedCase2));
		softAssert.assertAll();
	}

//	@Test(priority = )
//	public static void CreateAndLinkCase_() throws InterruptedException {
//		extentTest = extent.startTest("  ");
//		extentTest.setDescription(" Verify that user is able to Unlink the Associated Case, after clicking on the 'Remove' link on the Header of CSDP. ");
//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertAll();
//	}

}
