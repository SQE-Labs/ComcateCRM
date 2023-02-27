package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.CSDPUtils;

public class CSDP extends CSDPUtils {
	@Test(priority = 1)
	public static void CSDP_OpenCSDPAfterSubmissionCreation() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_OpenCSDPAfterSubmissionCreation ");
		extentTest.setDescription(
				" Verify that CSDP opens up, when user clicks on 'Create Submission' button after entering data in the mandatory fields, on CSP. ");
		CSDPUtils.CSDP_OpenCSDPAfterSubmissionCreation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(StatusOfSubmission.equals("Open"));
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CSDP_ChangeDueByDate() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_ChangeDueByDate ");
		extentTest.setDescription(" Verify that user is able to change the Due By date, on CSDP. ");
		CSDPUtils.CSDP_ChangeDueByDate();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PopupTitleChangeDueBy.equals("Change Due By"));
		softAssert.assertTrue(ReasonValidationMsg.equals("The Reason is required."));
		softAssert.assertTrue(ValidationMsgMaxChar.equals("Min 1 and Max 500 characters limit."));
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CSDP_VerifyInternalNotesContent() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyInternalNotesContent ");
		extentTest.setDescription(
				" Verify that data entered in 'Reason' field while updating Due Date, also appears under 'Internal Notes' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyInternalNotesContent();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(InternalNotes.equals(RandomReason));
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void CSDP_VerifyEscalatedIssue() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyEscalatedIssue ");
		extentTest.setDescription(
				" Verify that user is able to Escalate the Issue on CSDP, after entering data in the mandatory field, on 'Change Escalation Status' popup. ");
		CSDPUtils.CSDP_VerifyEscalatedIssue();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ValidationMsgCharLimit.equals("500 character limit."));
		softAssert.assertTrue(EscalateToggleStatus);
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void CSDP_VerifyReasonWithInternalNotes() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyReasonWithInternalNotes ");
		extentTest.setDescription(
				" Verify that data entered in 'Reason' field while Escalating Issue, also appears under 'Internal Notes' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyReasonWithInternalNotes();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(InternalNotes2.equals(RandomReason2));
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void CSDP_VerifyNoEscalationOnCancel() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyNoEscalationOnCancel ");
		extentTest.setDescription(
				" Verify that the Issue does not get Escalated, when user clicks on 'Cancel' button, on 'Change Escalation Status' popup. ");
		CSDPUtils.CSDP_VerifyNoEscalationOnCancel();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EscalateToggleStatus);
		softAssert.assertAll();
	}

//	@Test(priority = 8)
//	public static void CSDP_VerifyAnonymousText() throws InterruptedException {
//		extentTest = extent.startTest(" CSDP_VerifyAnonymousText ");
//		extentTest.setDescription(" Verify that 'Anonymous' text appears under 'Customer Name' field, when user has created a Submission with 'Post Anonymously' checkbox checked. ");
//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertAll();
//	}

	@Test(priority = 9)
	public static void CSDP_VerifyDirectionToCoDP() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyDirectionToCoDP ");
		extentTest.setDescription(
				" Verify that user gets directed to CoDP, after clicking on the Name link under 'Customer Name' field, on CSDP. ");
		CSDPUtils.CSDP_VerifyDirectionToCoDP();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CustomerName.equals(CustomerDetailHeader));
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void CSDP_VerifyDirectionToCSLPFromTags() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyDirectionToCSLPFromTags ");
		extentTest.setDescription(
				" Verify that user gets directed to CSLP with 'Tags' filter applied, after clicking on 'Tags' link, on CSDP. ");
		CSDPUtils.CSDP_VerifyDirectionToCSLPFromTags();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CustomerDetailHeader.equals("Customer Submissions:"));
		softAssert.assertAll();
	}

//	@Test(priority = 11)
//	public static void CSDP_VerifyUpdatedLocation() throws InterruptedException {
//		extentTest = extent.startTest(" CSDP_VerifyUpdatedLocation ");
//		extentTest.setDescription(" Verify that user is able edit & save the Location under 'Location' tile, on CSDP. ");
//		SoftAssert softAssert = new SoftAssert();
//		
//		softAssert.assertAll();
//	}

	@Test(priority = 12)
	public static void CSDP_VerifyAddedAttachments() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyAddedAttachments ");
		extentTest.setDescription(" Verify that user is able to add attachments under 'Attachments' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyAddedAttachments();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckImageSize);
		softAssert.assertAll();
	}

	@Test(priority = 13)
	public static void CSDP_VerifyAddedInternalNote() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyAddedInternalNote ");
		extentTest.setDescription(
				" Verify that user is able to add internal notes under 'Internal Notes' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyAddedInternalNote();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(InternalNotePopupTitle.equals("Add Internal Note"));
		softAssert.assertAll();
	}

	@Test(priority = 14)
	public static void CSDP_VerifyUpdatedNote() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyUpdatedNote ");
		extentTest.setDescription(" Verify that user is able to edit & delete Internal Notes, on CSDP. ");
		CSDPUtils.CSDP_VerifyUpdatedNote();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EditNotePopupTitle.equals("Edit Internal Note"));
		softAssert.assertTrue(EditedNotes.equals(RandomEditedNote));
		softAssert.assertAll();
	}

	@Test(priority = 15)
	public static void CSDP_VerifyUserIsAbleToPrintCSD() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyUserIsAbleToPrintCSD ");
		extentTest.setDescription(" Verify that user is able to Print the 'Customer Submission' details, on Print Preview page. ");
		CSDPUtils.CSDP_VerifyUserIsAbleToPrintCSD();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PrintSettingsPopupTitle.equals("Print Settings"));
		softAssert.assertTrue(PrintPageSubmissionHeader.equals(CSDPSubmissionHeader));
		softAssert.assertAll();
	}

	@Test(priority = 16)
	public static void CSDP_VerifyMultipleTagsAddition() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyMultipleTagsAddition ");
		extentTest.setDescription(" Verify that user is able to add multiple tags on 'Enter Tags' field, on 'Add Tags' popup. ");
		CSDPUtils.CSDP_VerifyMultipleTagsAddition();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ManageTagsPopupTitle.equals("Manage Tags"));
		softAssert.assertEquals(SuccessMessageTags, ExpectedSuccessMsg);
		softAssert.assertAll();
	}

	@Test(priority = 20)
	public static void CSDP_VerifyAdditionOfTasks() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyAdditionOfTasks ");
		extentTest.setDescription(" Verify that user is able to add a Task under 'Tasks' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyAdditionOfTasks();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(AddTaskPopupTitle.equals("Add a Task"));
		softAssert.assertEquals(AddedTaskText, RandomTaskName);
		softAssert.assertAll();
	}

	@Test(priority = 21)
	public static void CSDP_VerifyUpdationAndDeletionOfTasks() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyUpdationAndDeletionOfTasks ");
		extentTest.setDescription(" Verify that user is able to edit & delete a Task under 'Tasks' tile, on CSDP. ");
		CSDPUtils.CSDP_VerifyUpdationAndDeletionOfTasks();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EditTaskPopupTitle.equals("Edit a Task"));
		softAssert.assertTrue(TasksCount);
		softAssert.assertAll();
	}

	@Test(priority = 22)
	public static void CSDP_VerifyClosedSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyClosedSubmission ");
		extentTest.setDescription(" Verify that user is able to close the Submission, after clicking on 'More' button > 'Close Submission' option, on CSDP. ");
		CSDPUtils.CSDP_VerifyClosedSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddedTaskText2, RandomTaskName + " Edited");
		softAssert.assertTrue(ClosedStatusOfSubmission.equals("Closed"));
		softAssert.assertAll();
	}

	@Test(priority = 23)
	public static void CSDP_VerifyReopenedSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSDP_VerifyReopenedSubmission ");
		extentTest.setDescription(" Verify that user is able to reopen the Closed Submission, after clicking on 'More' button > 'Reopen Submission' option, on CSDP. ");
		CSDPUtils.CSDP_VerifyReopenedSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(OpenedStatusOfSubmission.equals("Open"));
		softAssert.assertAll();
	}

}
