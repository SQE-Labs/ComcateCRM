package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.SubmissionAssignmentUtils;

public class SubmissionAssignment extends SubmissionAssignmentUtils {

	@Test(priority = 0)
	public static void SubmissionAssignment_OpenEditAssignmentPopup() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_OpenEditAssignmentPopup ");
		extentTest.setDescription(
				" Verify that 'Edit Assignment' popup opens up after clicking the 'Edit' icon next to 'Submission Assignment' rule on the 'Assignment Rules' page. ");
		SubmissionAssignmentUtils.SubmissionAssignment_OpenEditAssignmentPopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(EditAssignmentPopupTitle, "Edit Assignment");
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public static void SubmissionAssignment_VerifyNoUpdationWithoutARule() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_VerifyNoUpdationWithoutARule ");
		extentTest.setDescription(
				" Verify that user is not able to save the changes, when no Rule is added under 'Rules Set' tile, on 'Edit Assignment' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_VerifyNoUpdationWithoutARule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(NameValue, RandomName);
		softAssert.assertEquals(NoRuleValidationText, ExpectedValidation);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void SubmissionAssignment_OpenCreateRulePopup() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_OpenCreateRulePopup ");
		extentTest.setDescription(
				" Verify that 'Create Rule' popup opens up, when user clicks the 'Add Rule' button, on 'Edit Assignment' popup.  ");
		SubmissionAssignmentUtils.SubmissionAssignment_OpenCreateRulePopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateRulePopupTitle, "Create Rule");
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void SubmissionAssignment_AddMultipleCriterias() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_AddMultipleCriteria ");
		extentTest.setDescription(
				" Verify that user is able to add multiple criterias under 'Define Critera' tile, after clicking on 'Add Criteria' link, on 'Create Rule' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_AddMultipleCriterias();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SizeAfter, true);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void SubmissionAssignment_VerifyAddedRule() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_VerifyAddedRule ");
		extentTest.setDescription(
				" Verify that the created rule gets added under 'Rules Set' tile, on 'Edit Assignment' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_VerifyAddedRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void SubmissionAssignment_EditAddedRule() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_EditAddedRule ");
		extentTest.setDescription(
				" Verify that user is able to edit the added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_EditAddedRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CompareStr, false);
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void SubmissionAssignment_DeleteAddedRule() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_DeleteAddedRule ");
		extentTest.setDescription(
				" Verify that user is able to delete that added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_DeleteAddedRule();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CompareCount_DeletedRule, true);
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void SubmissionAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
		extentTest = extent.startTest(" SubmissionAssignment_AssignmentRuleUnderInactiveSection ");
		extentTest.setDescription(
				" Verify that Assignment Rule appears under 'Inactive' section, when user sets 'Status' toggle button as Inactive, on 'Edit Assignment' popup. ");
		SubmissionAssignmentUtils.SubmissionAssignment_AssignmentRuleUnderInactiveSection();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

}
