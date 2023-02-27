package TestCasesCRM;

import POMCRM.CSLPUtils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CSLP extends CSLPUtils {

	@Test(priority = 1)
	public static void CSLP_VerifyCSLPOpensUP() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyCSLPOpensUP ");
		extentTest.setDescription(
				" Verify that 'Customer Submission Listing' page opens up, when user clicks on 'Customer Submission' header, on Dashboard. ");
		CSLPUtils.CSLP_VerifyCSLPOpensUP();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CSLPHeader, ExpectedHeader);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void CSLP_VerifyPrimaryFilters() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyPrimaryFilters ");
		extentTest.setDescription(" Verify that all the Primary filters appear on the CSLP. ");
		CSLPUtils.CSLP_VerifyPrimaryFilters();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PrimaryFiltersPresence);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CSLP_VerifyTagFilter() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyTagFilter ");
		extentTest.setDescription(
				" Verify that respective Tag Filter gets applied, when user clicks on any Tag under 'Tags' column, on CSLP. ");
		CSLPUtils.CSLP_VerifyTagFilter();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(TagFilterText, "Tags");
		softAssert.assertEquals(TagText, SelectedTagText);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CSLP_VerifyNavigationFromPagination() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyNavigationFromPagination ");
		extentTest.setDescription(
				" Verify that user is able to navigate to the next page, after clicking on the 'Next' arrow icon, on CSLP. ");
		CSLPUtils.CSLP_VerifyNavigationFromPagination();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PaginationDifference);
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void CSLP_VerifyDescendingOrderOfSubmissions() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyDescendingOrderOfSubmissions ");
		extentTest.setDescription(" Verify that by default submissions are arranged in descending order, on CSLP. ");
		CSLPUtils.CSLP_VerifyDescendingOrderOfSubmissions();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(VerifyDescendingOrder);
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void CSLP_VerifyAscendingOrderOfCases() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyAscendingOrderOfCases ");
		extentTest.setDescription(
				" Verify that user is able to sort the submissions, after clicking on the 'Case Number' header, on CSLP. ");
		CSLPUtils.CSLP_VerifyAscendingOrderOfCases();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(VerifyAscendingOrder);
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void CSLP_VerifyDeletedSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyDeletedSubmission ");
		extentTest.setDescription(
				" Verify that user is able to delete a Submission, after entering 'DELETE' text in mandatory field, on 'Delete Case' popup. ");
		CSLPUtils.CSLP_VerifyDeletedSubmission();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(DeleteSubmissionTitle, "Delete Submission");
		softAssert.assertEquals(ValidationMessageDeleteSubmission, ExpectedMsgDeleteSubmission);
		softAssert.assertTrue(SubmissionDeletion);
		softAssert.assertAll();
	}

	@Test(priority = 8)
	public static void CSLP_VerifyTotalCountOfSubmissions() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyTotalCountOfSubmissions ");
		extentTest
				.setDescription(" Verify that accurate total count of submissions appear above submissions, on CSLP. ");
		CSLPUtils.CSLP_VerifyTotalCountOfSubmissions();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(TotalCasesCount, SubmissionCountAtHeader);
		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void CSLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyClearAllFiltersLinkText ");
		extentTest.setDescription(
				" Verify that 'Clear all filters' link text appears, when user applies any filter on the submissions, on CSLP. ");
		CSLPUtils.CSLP_VerifyClearAllFiltersLinkText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ClearAllFiltersPresence);
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void CSLP_VerifyClearAllFiltersAfterClicking() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyClearAllFiltersAfterClicking ");
		extentTest.setDescription(
				" Verify that 'Clear all filters' link text no longer appears, when user clicks on 'Clear all filters' link text, on CSLP. ");
		CSLPUtils.CSLP_VerifyClearAllFiltersAfterClicking();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ClearAllFiltersAbsence);
		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void CSLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyApplicationOfsecondaryFilters ");
		extentTest.setDescription(
				" Verify that user is able to select & apply the secondary filters, after clicking on 'Filters' slider icon, on CSLP. ");
		CSLPUtils.CSLP_VerifyApplicationOfsecondaryFilters();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareFilterResultsCount);
		softAssert.assertAll();
	}

	@Test(priority = 12)
	public static void CSLP_VerifyFilterGetsRemoved() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyFilterGetsRemoved ");
		extentTest.setDescription(
				" Verify that secondary filter gets removed, when user clicks on 'Cross' icon of filter, on CSLP. ");
		CSLPUtils.CSLP_VerifyFilterGetsRemoved();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareRemovedFilterCount);
		softAssert.assertAll();
	}

	 @Test(priority = 13)
	public static void CSLP_VerifyFilterAndSearch() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyFilterAndSearch ");
		extentTest.setDescription(" Verify that user is able to filter & search the Submissions by 'Filter submissions by keyword' search field, on CSLP. ");
		CSLPUtils.CSLP_VerifyFilterAndSearch();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareSearchResultsCount);
		softAssert.assertAll();
	}

	 @Test(priority = 14)
	public static void CSLP_VerifyRemovalOfColumns() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyRemovalOfColumns ");
		extentTest.setDescription(" Verify that user is able to remove respective columns, after deselecting the checkboxes from 'Column Control' widget, on CSLP. ");
		CSLPUtils.CSLP_VerifyRemovalOfColumns();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(VerifyAbsenceOfCol);
		softAssert.assertAll();
	}

	 @Test(priority = 15)
	public static void CSLP_VerifyRestorationOfColumns() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyRestorationOfColumns ");
		extentTest.setDescription(" Verify that removed columns reappear on CSLP, when user clicks on 'Restore Defaults' link text, on Column Control sidebar. ");
		CSLPUtils.CSLP_VerifyRestorationOfColumns();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(VerifyColumnsPresence);
		softAssert.assertAll();
	}

	 @Test(priority = 16)
	public static void CSLP_VerifySavedFilter() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifySavedFilter ");
		extentTest.setDescription(" Verify that user is able to Save a Filter, after user clicks on 'Save As' button on the top of CSLP. ");
		CSLPUtils.CSLP_VerifySavedFilter();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SaveAsPopupTitle, "Save As");
		softAssert.assertAll();
	}

	 @Test(priority = 17)
	public static void CSLP_VerifyDeletedFilter() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyDeletedFilter ");
		extentTest.setDescription(" Verify that user is able to delete the added filter under 'SAVED FILTERS' dropdown field, on CSLP. ");
		CSLPUtils.CSLP_VerifyDeletedFilter();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareCountDeletedFilter);
		softAssert.assertAll();
	}

	 @Test(priority = 18)
	public static void CSLP_VerifyCSVFile() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyCSVFile ");
		extentTest.setDescription(" Verify that user is able to download the CSV file, after clicking on 'Download' button > 'CSV' option, on CSLP. ");
		CSLPUtils.CSLP_VerifyCSVFile();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SuccessMsgCSV, ExpectedMsgCSV);
		softAssert.assertAll();
	}

	 @Test(priority = 19)
	public static void CSLP_VerifyDirectionToRespectiveSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifyDirectionToRespectiveSubmission ");
		extentTest.setDescription(" Verify that user gets directed to the respective Submission, after clicking on any Submission link, on CSLP. ");
		CSLPUtils.CSLP_VerifyDirectionToRespectiveSubmission();
		SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(FileStatus, "File Present");
		softAssert.assertEquals(RecentSubmissionID, OpenedSubmissionID);
		softAssert.assertAll();
	}

	 @Test(priority = 20)
	public static void CSLP_VerifySubmissionsForMineButton() throws InterruptedException {
		extentTest = extent.startTest(" CSLP_VerifySubmissionsForMineButton ");
		extentTest.setDescription(" Verify that only logged in Agency user's submissions appear, when user clicks on 'Mine' button, on CSLP. ");
		CSLPUtils.CSLP_VerifySubmissionsForMineButton();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareMineResultsCount);
	softAssert.assertAll();
	}

}
