package POMCRM;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import BrowsersBase.DataInterface;
import CommonMethods.CheckDownloadedFile;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import TestCasesCRM.Login;

public class CSLPUtils extends CSDPUtils {

	public static String cSLPTab = "//a[text()='Customer Submissions']";
	public static String customerSubmissionsHeader = "//label[@class='dropdown__selector__label']";
	public static String statusPrimaryFilter = "//label[text()='Status']";
	public static String createdPrimaryFilter = "//label[text()='Created']";
	public static String allButtonCSLP = "//button[text()='All']";
	public static String mineButton = "//button[text()='Mine']";
	public static String moreButton = "//label[text()='More...']";
	public static String tagsUnderColumn = "//span[@class='clipped-text']/a";
	public static String tagsAppliedFilter = "//label[@for='tagIds']";
	public static String selectedTag = "//label[@for='tagIds']/following::label[1]";
	public static String clearAllFiltersLink = "//a[text()='Clear all filters']";
	public static String nextPaginationCSLP = "//div[@class='table__pagination-nav-btns']/button[2]";
	public static String submissionID = "//span[@class='checkbox-holder']/following::a[1]";
	public static String submissionNumberHeader = "//div[text()='Submission Number']";
	public static String deleteLink = "//a[text()='Delete']";
	public static String deleteSubmissionPopup = "//div[@class='modal-header' and text()='Delete Submission']";
	public static String deleteTextField = "//input[@name='deleteText']";
	public static String deleteSubmissionButton = "//button[text()='Delete Submission']";
	public static String validationMsgDeleteSubmission = "//div[@class='modal-base__error modal-base__error--show']";
	public static String submissionsCount = "//div[@class='cs-listing__section__header']//following-sibling::span";
	public static String doNotDeleteButton = "//button[text()='Do Not Delete']";
	public static String paginationCount = "//span[@class='table__pagination-of-text']";
	public static String filterSlider = "//i[@class='fa fa-2 fa-sliders']";
	public static String categoryCheckbox = "//label[text()='Category']";
	public static String filterSliderClose = "//button[@class='drawer__close']";
	public static String categoryDropdownIcon = "//label[@for='categoryIds']/following::span[1]";
	public static String firstCategoryCheckbox = "//input[@id='Category-0']/following::label[1]";
	public static String categoryColumnResults = "//div[@class='rt-td'][9]";
	public static String crossSecondaryFilter = "//div[@class='filter-options category']/following::button[1]";
	public static String countSecondaryFilters = "//div[@class='filters-secondary__chip']";
	public static String cSLPSearchField = "//input[@name='searchQuery']";
	public static String anonymousColumn = "//span[text()='Anonymous']";

	public static By CSLPTab = By.xpath(CSLPUtils.cSLPTab);
	public static By CustomerSubmissionsHeader = By.xpath(CSLPUtils.customerSubmissionsHeader);
	public static By StatusPrimaryFilter = By.xpath(CSLPUtils.statusPrimaryFilter);
	public static By CreatedPrimaryFilter = By.xpath(CSLPUtils.createdPrimaryFilter);
	public static By AllButtonCSLP = By.xpath(CSLPUtils.allButtonCSLP);
	public static By MineButton = By.xpath(CSLPUtils.mineButton);
	public static By MoreButton = By.xpath(CSLPUtils.moreButton);
	public static By TagsUnderColumn = By.xpath(CSLPUtils.tagsUnderColumn);
	public static By TagsAppliedFilter = By.xpath(CSLPUtils.tagsAppliedFilter);
	public static By SelectedTag = By.xpath(CSLPUtils.selectedTag);
	public static By ClearAllFiltersLink = By.xpath(CSLPUtils.clearAllFiltersLink);
	public static By NextPaginationCSLP = By.xpath(CSLPUtils.nextPaginationCSLP);
	public static By SubmissionID = By.xpath(CSLPUtils.submissionID);
	public static By SubmissionNumberHeader = By.xpath(CSLPUtils.submissionNumberHeader);
	public static By DeleteLink = By.xpath(CSLPUtils.deleteLink);
	public static By DeleteSubmissionPopup = By.xpath(CSLPUtils.deleteSubmissionPopup);
	public static By DeleteTextField = By.xpath(CSLPUtils.deleteTextField);
	public static By DeleteSubmissionButton = By.xpath(CSLPUtils.deleteSubmissionButton);
	public static By ValidationMsgDeleteSubmission = By.xpath(CSLPUtils.validationMsgDeleteSubmission);
	public static By SubmissionsCount = By.xpath(CSLPUtils.submissionsCount);
	public static By DoNotDeleteButton = By.xpath(CSLPUtils.doNotDeleteButton);
	public static By PaginationCount = By.xpath(CSLPUtils.paginationCount);
	public static By FilterSlider = By.xpath(CSLPUtils.filterSlider);
	public static By CategoryCheckbox = By.xpath(CSLPUtils.categoryCheckbox);
	public static By FilterSliderClose = By.xpath(CSLPUtils.filterSliderClose);
	public static By CategoryDropdownIcon = By.xpath(CSLPUtils.categoryDropdownIcon);
	public static By FirstCategoryCheckbox = By.xpath(CSLPUtils.firstCategoryCheckbox);
	public static By CategoryColumnResults = By.xpath(CSLPUtils.categoryColumnResults);
	public static By CrossSecondaryFilter = By.xpath(CSLPUtils.crossSecondaryFilter);
	public static By CountSecondaryFilters = By.xpath(CSLPUtils.countSecondaryFilters);
	public static By CSLPSearchField = By.xpath(CSLPUtils.cSLPSearchField);
	public static By AnonymousColumn = By.xpath(CSLPUtils.anonymousColumn);

	public static By SaveAsButton = By.xpath("//button[text()='Save As']");
	public static By SaveAsPopup = By.xpath("//div[text()='Save As']");
	public static By ErrorMsgSaveAsPopup = By.xpath("//span[text()='The Filter Name is required.']");
	public static By FilterNameField = By.xpath("//input[@placeholder='Enter Text']");
	public static By CountSavedFilters = By.xpath("(//ul[@class='dropdown__options--single'])[1]/li");
	public static By CrossIconFilters = By.xpath("//button[@class='delete-btn  btn btn-primary']");
	public static By FiltersDropdown = By.xpath("(//div[@class='dropdown__selector__selected']/label)[1]");
	public static By YesDelete = By.xpath("//div[@class='flex-row--middle']/button[2]");
	public static By DownloadButton = By.xpath("//button[text()='Download']");
	public static By CSVOption = By.xpath("//li[text()='CSV']");
	public static By CSVSuccessMessage = By.xpath("//div[@class='success-custom-message']");
	public static By AgencyUserName = By.xpath("//div[@class='app-header__user-name']/label");
	public static By IssueDescriptionColumn = By.xpath("//div[text()='Issue Description']");
	public static By IssueDescriptionCheckbox = By.xpath("//label[@for='checkbox-column-Issue Description']");
	public static By ColumnControlWidget = By.xpath("//i[@class='fa fa-2 fa-cog']");
	public static By CloseColumnControl = By.xpath("//button[@class='drawer__close']");
	public static By CrossIconForCSDP = By.xpath("//div[@class='customer-submission-details__close-icon']/img");

	public static ArrayList<Integer> IDArray = new ArrayList<Integer>();
	public static String CSLPHeader;
	public static String ExpectedHeader;
	public static boolean PrimaryFiltersPresence;
	public static String TagFilterText;
	public static String TagText;
	public static String SelectedTagText;
	public static boolean PaginationDifference;
	public static boolean VerifyDescendingOrder;
	public static boolean VerifyAscendingOrder;
	public static String DeleteSubmissionTitle;
	public static String ValidationMessageDeleteSubmission;
	public static String ExpectedMsgDeleteSubmission;
	public static boolean SubmissionDeletion;
	public static int SubmissionCountAtHeader;
	public static int TotalCasesCount;
	public static boolean ClearAllFiltersPresence;
	public static boolean ClearAllFiltersAbsence;
	public static boolean CompareFilterResultsCount;
	public static boolean CompareRemovedFilterCount;
	public static boolean CompareSearchResultsCount;
	public static boolean VerifyAbsenceOfCol;
	public static boolean VerifyColumnsPresence;
	public static String SaveAsPopupTitle;
	public static boolean CompareCountDeletedFilter;
	public static String SuccessMsgCSV;
	public static String ExpectedMsgCSV;
	public static String FileStatus;
	public static String RecentSubmissionID;
	public static String OpenedSubmissionID;
	public static boolean CompareMineResultsCount;

	public static void CSLP_VerifyCSLPOpensUP() throws InterruptedException {
		//WebDriverWaits.closetabs();
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CSLPTab);
		Thread.sleep(6000);
		CSLPHeader = WebDriverWaits.GetText(CustomerSubmissionsHeader);
		ExpectedHeader = "Customer Submissions:";
	}

	public static void CSLP_VerifyPrimaryFilters() throws InterruptedException {
		WebElement PrimaryFilter1 = WebDriverWaits.WaitUntilVisibleWE(StatusPrimaryFilter);
		WebElement PrimaryFilter2 = WebDriverWaits.WaitUntilVisibleWE(CreatedPrimaryFilter);
		WebElement PrimaryFilter3 = WebDriverWaits.WaitUntilVisibleWE(AllButtonCSLP);
		WebElement PrimaryFilter4 = WebDriverWaits.WaitUntilVisibleWE(MineButton);
		WebElement PrimaryFilter5 = WebDriverWaits.WaitUntilVisibleWE(MoreButton);
		PrimaryFiltersPresence = ((PrimaryFilter1.isDisplayed()) == true) && (PrimaryFilter2.isDisplayed() == true)
				&& (PrimaryFilter3.isDisplayed() == true) && (PrimaryFilter4.isDisplayed() == true)
				&& (PrimaryFilter5.isDisplayed() == true);
	}

	public static void CSLP_VerifyTagFilter() throws InterruptedException {
		TagText = WebDriverWaits.GetText(TagsUnderColumn);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(TagsUnderColumn);
		Thread.sleep(2000);
		TagFilterText = WebDriverWaits.GetText(TagsAppliedFilter);
		Thread.sleep(2000);
		SelectedTagText = WebDriverWaits.GetText(SelectedTag);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ClearAllFiltersLink);
	}

	public static void CSLP_VerifyNavigationFromPagination() throws InterruptedException {
		Thread.sleep(2000);
		String[] CaseIDBeforeClick = WebDriverWaits.GetText(SubmissionID).split("-");
		String ID1 = CaseIDBeforeClick[1];
		System.out.println(ID1);
		WebDriverWaits.ClickOn(NextPaginationCSLP);
		Thread.sleep(5000);
		String[] CaseIDAfterClick = WebDriverWaits.GetText(SubmissionID).split("-");
		String ID2 = CaseIDAfterClick[1];
		System.out.println(ID2);
		int differenceID = Integer.parseInt(ID1) - Integer.parseInt(ID2);
		PaginationDifference = differenceID >= 50;
	}

	public static void CSLP_VerifyDescendingOrderOfSubmissions() throws InterruptedException {
		int FinalIDs;
		try {
			Thread.sleep(1000);
			List<WebElement> AllSubmissionsID = WebDriverWaits.WaitUntilVisibleList(SubmissionID);
			int CountIDs = AllSubmissionsID.size() / 2;
			for (int i = 0; i < CountIDs; i++) {
				WebElement IDList = AllSubmissionsID.get(i);
				String[] IDList1 = IDList.getText().split("-");
				String IDs = IDList1[1];
				FinalIDs = Integer.parseInt(IDs);
				IDArray.add(FinalIDs);
			}
			int State = 0;
			Integer[] arr = new Integer[IDArray.size()];
			for (int i = 0; i < 1; i++) {
				arr[i] = IDArray.get(i);
				for (int j = i + 1; j < IDArray.size(); j++) {
					arr[j] = IDArray.get(j);
					if ((arr[j] < arr[i]) == false) {
						State = 1;
					}
				}
			}
			VerifyDescendingOrder = (State==0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void CSLP_VerifyAscendingOrderOfCases() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SubmissionNumberHeader);
		Thread.sleep(8000);
		List<WebElement> AllSubmissionsID = WebDriverWaits.WaitUntilVisibleList(SubmissionID);
		int CountIDs = AllSubmissionsID.size() / 2;
		IDArray.clear();
		for (int i = 0; i < CountIDs; i++) {
			WebElement IDList = AllSubmissionsID.get(i);
			String[] IDList1 = IDList.getText().split("-");
			String IDs = IDList1[1];
			int FinalIDs = Integer.parseInt(IDs);
			IDArray.add(FinalIDs);
		}
		int State = 0;
		Integer[] arr = new Integer[IDArray.size()];
		for (int i = 0; i < 1; i++) {
			arr[i] = IDArray.get(i);
			for (int j = i + 1; j < IDArray.size(); j++) {
				arr[j] = IDArray.get(j);
				if ((arr[j] > arr[i]) == false) {
					State = 1;
				}
				VerifyAscendingOrder = (State==0);
			}
		}
	}

	public static void CSLP_VerifyDeletedSubmission() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(SubmissionNumberHeader);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(DeleteLink);
		DeleteSubmissionTitle = WebDriverWaits.GetText(DeleteSubmissionPopup);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(DeleteSubmissionButton);
		ValidationMessageDeleteSubmission = WebDriverWaits.GetText(ValidationMsgDeleteSubmission);
		ExpectedMsgDeleteSubmission = "Please enter DELETE in all caps";
		Thread.sleep(3000);
		String[] CountCases = WebDriverWaits.GetText(SubmissionsCount).split(" ");
		String CountBefore = CountCases[0];
		System.out.println(CountBefore);
		int BeforeDeleting = Integer.parseInt(CountBefore);
		System.out.println(BeforeDeleting);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(DeleteTextField, "DELETE");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(DeleteSubmissionButton);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		String[] CountCases2 = WebDriverWaits.GetText(SubmissionsCount).split(" ");
		String CountAfter = CountCases2[0];
		System.out.println(CountAfter);
		int AfterDeleting = Integer.parseInt(CountAfter);
		System.out.println(AfterDeleting);
		SubmissionDeletion = (AfterDeleting < BeforeDeleting);
	}

	public static void CSLP_VerifyTotalCountOfSubmissions() throws InterruptedException {
		Thread.sleep(3000);
		String[] CountOfCases = WebDriverWaits.GetText(SubmissionsCount).split(" ");
		String CountHeader = CountOfCases[0];
		SubmissionCountAtHeader = Integer.parseInt(CountHeader);
		String[] PaginationCounts = WebDriverWaits.GetText(PaginationCount).split(" ");
		String PaginationFinal = PaginationCounts[1];
		int PgCount = Integer.parseInt(PaginationFinal);
		int CountCasesCLP = (PgCount - 1) * 50;
		for (int i = 0; i < PgCount - 1; i++) {
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(NextPaginationCSLP);
			Thread.sleep(3000);
		}
		List<WebElement> AllCasesID = WebDriverWaits.WaitUntilVisibleList(SubmissionID);
		int CountIDs = AllCasesID.size();
		TotalCasesCount = CountCasesCLP + CountIDs;
	}

	public static void CSLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(7000);
		WebDriverWaits.ClickOn(TagsUnderColumn);
		Thread.sleep(2000);
		List<WebElement> ClearAllFilters = WebDriverWaits.WaitUntilVisibleList(ClearAllFiltersLink);
		ClearAllFiltersPresence = ClearAllFilters.size() == 1;
	}

	public static void CSLP_VerifyClearAllFiltersAfterClicking() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(TagsUnderColumn);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(ClearAllFiltersLink);
		Thread.sleep(2000);
		List<WebElement> ClearAllFilters = driver.findElements(ClearAllFiltersLink);
		ClearAllFiltersAbsence = ClearAllFilters.size() == 0;
	}

	public static void CSLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(FilterSlider);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CategoryCheckbox);
		WebDriverWaits.ClickOn(FilterSliderClose);
		WebDriverWaits.ClickOn(CategoryDropdownIcon);
		WebDriverWaits.ClickOn(FirstCategoryCheckbox);
		WebDriverWaits.ClickOn(CategoryDropdownIcon);
		Thread.sleep(5000);
		String[] CountOfCases = WebDriverWaits.GetText(SubmissionsCount).split(" ");
		String CountHeader = CountOfCases[0];
		int CountAtHeader = Integer.parseInt(CountHeader);
		System.out.println(CountAtHeader + " CountAtHeader");
		Thread.sleep(5000);
		List<WebElement> FilterAppliedCount = driver.findElements(SubmissionID);
		System.out.println(FilterAppliedCount.size() + " FilterAppliedCount");
		CompareFilterResultsCount = (CountAtHeader == FilterAppliedCount.size());
	}

	public static void CSLP_VerifyFilterGetsRemoved() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> SecondaryFilters = WebDriverWaits.WaitUntilVisibleList(CountSecondaryFilters);
		int countSF1 = SecondaryFilters.size();
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CrossSecondaryFilter);
		Thread.sleep(3000);
		List<WebElement> SecondaryFilters2 = driver.findElements(CountSecondaryFilters);
		int countSF2 = SecondaryFilters2.size();
		CompareRemovedFilterCount = (countSF1 > countSF2);
	}

	public static void CSLP_VerifyFilterAndSearch() throws InterruptedException {
		Thread.sleep(10000);
		//WebDriverWaits.ClickOn(ClearAllFiltersLink);
		WebDriverWaits.SendKeys(CSLPSearchField, "Anonymous");
		Thread.sleep(10000);
		List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
		int CountIDs = AllSubmissionsID.size();
		Thread.sleep(10000);
		List<WebElement> AnonymousList = driver.findElements(AnonymousColumn);
		int AnonymousTextList = AnonymousList.size();
		CompareSearchResultsCount = (AnonymousTextList == CountIDs);
		WebDriverWaits.ClickOn(ClearAllFiltersLink);
	}

	public static void CSLP_VerifyRemovalOfColumns() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(ColumnControlWidget);
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(IssueDescriptionCheckbox);
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(CloseColumnControl);
		Thread.sleep(5000);
		List<WebElement> IssueDescriptionCol = driver.findElements(IssueDescriptionColumn);
		VerifyAbsenceOfCol = IssueDescriptionCol.size() == 0;
	}

	public static void CSLP_VerifyRestorationOfColumns() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(ColumnControlWidget);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(IssueDescriptionCheckbox);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CloseColumnControl);
		Thread.sleep(5000);
		List<WebElement> IssueDescriptionCol = driver.findElements(IssueDescriptionColumn);
		VerifyColumnsPresence = (IssueDescriptionCol.size() == 1);
	}

	public static void CSLP_VerifySavedFilter() throws InterruptedException {
		WebDriverWaits.ClickOn(FiltersDropdown);
		Thread.sleep(3000);
		//List<WebElement> DeleteFilters = WebDriverWaits.WaitUntilVisibleList(CrossIconFilters);
		
//		if (CountFiltersCross >= 5) {
//			for (int d = 0; d < 2; d++) {
//				WebElement CrossIcons = DeleteFilters.get(d);
//				CrossIcons.click();
//				WebDriverWaits.ClickOn(YesDelete);
//			}
//		}
		int CountFiltersCross = driver.findElements(CrossIconFilters).size();
		if (CountFiltersCross > 0) {
			driver.findElement(CrossIconFilters).click();
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(YesDelete);
			CountFiltersCross = driver.findElements(CrossIconFilters).size();
		}
		WebDriverWaits.ClickOn(FiltersDropdown);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(SaveAsButton);
		Thread.sleep(5000);
		SaveAsPopupTitle = WebDriverWaits.GetText(SaveAsPopup);
		String FilterNameRandom = RandomStrings.RequiredString(5);
		WebDriverWaits.SendKeys(FilterNameField, "Filter " + (FilterNameRandom));
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(FiltersDropdown);
		Thread.sleep(5000);
		//
	}

	public static void CSLP_VerifyDeletedFilter() throws InterruptedException {
		List<WebElement> CountFilters = WebDriverWaits.WaitUntilVisibleList(CountSavedFilters);
		int FiltersCount = CountFilters.size();
		WebDriverWaits.ClickOn(CrossIconFilters);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(YesDelete);
		Thread.sleep(5000);
		List<WebElement> CountFiltersAfter = WebDriverWaits.WaitUntilVisibleList(CountSavedFilters);
		int FiltersCountAfter = CountFiltersAfter.size();
		CompareCountDeletedFilter = FiltersCountAfter == (FiltersCount - 1);
	}

	public static void CSLP_VerifyCSVFile() throws InterruptedException {
		WebDriverWaits.ClickOn(DownloadButton);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CSVOption);
		Thread.sleep(10000);
		//SuccessMsgCSV = WebDriverWaits.GetText(CSVSuccessMessage);
		ExpectedMsgCSV = "CSV file downloaded successfully";
		Thread.sleep(5000);
		FileStatus = CheckDownloadedFile.isFileDownloaded("AUTOMATION_NEW_AGENCY_12-18-2022_11-27-pm_csv.csv");
	}

	public static void CSLP_VerifyDirectionToRespectiveSubmission() throws InterruptedException {
		Thread.sleep(5000);
		RecentSubmissionID = WebDriverWaits.GetText(SubmissionID);
		WebDriverWaits.CloseOtherTabs();
		WebDriverWaits.ClickOn(SubmissionID);
		Thread.sleep(8000);
		String OpenedSubmission[] = WebDriverWaits.GetText(CSDPSubmissionID).split("#");
		OpenedSubmissionID = OpenedSubmission[1];
		WebDriverWaits.ClickOn(CrossIconForCSDP);
		Thread.sleep(5000);
	}

	public static void CSLP_VerifySubmissionsForMineButton() throws InterruptedException {
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(MineButton);
		Thread.sleep(6000);
		List<WebElement> AllSubmissions = WebDriverWaits.WaitUntilVisibleList(SubmissionID);
		String LoggedInUserName = WebDriverWaits.GetText(AgencyUserName);
		Thread.sleep(6000);
		List<WebElement> AgencyUserCases = driver.findElements(By.xpath("//span[text()='" + (LoggedInUserName) + "']"));
		int UserCasesCount = AgencyUserCases.size();
		CompareMineResultsCount = (AllSubmissions.size() == UserCasesCount);
	}

}
