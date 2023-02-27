package POMCRM;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import CommonMethods.CRMCommonMethods;
import CommonMethods.WebDriverWaits;
import TestCasesCRM.Login;

public class CreateAndLinkCaseUtils extends CSDPUtils {

	public static String descriptionTextCSDP = "//div[@class='description tile']//div[@class='grid-4-cols value']";
	public static String attachmentsHeaderCSDP = "//div[@id='cs-attachments']//h2/span";
	public static String addedCustomerCSDP = "//label[text()='Customer Name']/following::a[1]";
	public static String submissionNumber = "//h2[@class='customer-submission-details__number']";
	public static String moreButtonCSDP = "//button[text()='More...']";
	public static String createAndLinkCaseOption = "//li[text()='Create & Link Case']";
	public static String createACasePage = "//h1[text()='Create A Case']";
	public static String issueDescriptionCCP = "//textarea[@name='issueDescription']";
	public static String addedContactCCP = "//div[@class='contact__name-role']//b";
	public static String attachmentHeaderCCP = "//div[@class='attachment-tile tile']//h2/span";
	public static String locationSearchField = "//div[@class='location-tile__inputs-container']//input";
	public static String locationSearchResults = "//div[@class='react-autosuggest__suggestion-element']";
	public static String createCaseButton = "//button[text()='Create Case']";
	public static String createCasePopup = "//div[text()='Create Case']";
	public static String createScheduleInspectionButton = "//button[text()='Create & Schedule Inspection']";
	public static String associatedSubmissionLink = "//label[text()='Associated Submission']/following::a[1]";
	public static String linkedCaseNumber = "//h2[@class='case-details__case-number']";
	public static String associatedCaseLink = "//label[text()='Associated Case']/following::a[1]";
	public static String removeLink = "//a[text()='Remove Link']";

	public static By DescriptionTextCSDP = By.xpath(CreateAndLinkCaseUtils.descriptionTextCSDP);
	public static By AttachmentsHeaderCSDP = By.xpath(CreateAndLinkCaseUtils.attachmentsHeaderCSDP);
	public static By AddedCustomerCSDP = By.xpath(CreateAndLinkCaseUtils.addedCustomerCSDP);
	public static By SubmissionNumber = By.xpath(CreateAndLinkCaseUtils.submissionNumber);
	public static By MoreButtonCSDP = By.xpath(CreateAndLinkCaseUtils.moreButtonCSDP);
	public static By CreateAndLinkCaseOption = By.xpath(CreateAndLinkCaseUtils.createAndLinkCaseOption);
	public static By CreateACasePage = By.xpath(CreateAndLinkCaseUtils.createACasePage);
	public static By IssueDescriptionCCP = By.xpath(CreateAndLinkCaseUtils.issueDescriptionCCP);
	public static By AddedContactCCP = By.xpath(CreateAndLinkCaseUtils.addedContactCCP);
	public static By AttachmentHeaderCCP = By.xpath(CreateAndLinkCaseUtils.attachmentHeaderCCP);
	public static By LocationSearchField = By.xpath(CreateAndLinkCaseUtils.locationSearchField);
	public static By LocationSearchResults = By.xpath(CreateAndLinkCaseUtils.locationSearchResults);
	public static By CreateCaseButton = By.xpath(CreateAndLinkCaseUtils.createCaseButton);
	public static By CreateCasePopup = By.xpath(CreateAndLinkCaseUtils.createCasePopup);
	public static By CreateScheduleInspectionButton = By.xpath(CreateAndLinkCaseUtils.createScheduleInspectionButton);
	public static By AssociatedSubmissionLink = By.xpath(CreateAndLinkCaseUtils.associatedSubmissionLink);
	public static By LinkedCaseNumber = By.xpath(CreateAndLinkCaseUtils.linkedCaseNumber);
	public static By AssociatedCaseLink = By.xpath(CreateAndLinkCaseUtils.associatedCaseLink);
	public static By RemoveLink = By.xpath(CreateAndLinkCaseUtils.removeLink);

	public static String DescriptionCSDP;
	public static String AttachmentsCountCSDP;
	public static String CustomerOnCSDP;
	public static String SubmissionNumberCSDP;
	public static String CaseNumberLinked;
	public static String CCPTitle;
	public static String AssociatedCase2;
	public static String AssociatedCase;
	public static String AssociatedSubmission;
	public static String CreateCasePopupTitle;
	public static String IssueDescriptionTextCCP;
	public static String AttachmentCountCCP;
	public static String ContactOnCCP;

	public static void CreateAndLinkCase_PreRequisite() throws InterruptedException {
		WebDriverWaits.CloseOtherTabs();
		//Login.LoginAgency();
		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
		Thread.sleep(5000);
		DescriptionCSDP = WebDriverWaits.GetText(DescriptionTextCSDP);
		AttachmentsCountCSDP = WebDriverWaits.GetText(AttachmentsHeaderCSDP);
		CustomerOnCSDP = WebDriverWaits.GetText(AddedCustomerCSDP);
		String SubmissionNumberSplit[] = WebDriverWaits.GetText(SubmissionNumber).split("#");
		SubmissionNumberCSDP = SubmissionNumberSplit[1];
	}

	public static void CreateAndLinkCase_OpenCCPToLinkTheCase() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(MoreButtonCSDP);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CreateAndLinkCaseOption);
		Thread.sleep(6000);
		CCPTitle = WebDriverWaits.GetText(CreateACasePage);
	}

	public static void CreateAndLinkCase_VerifyAutopopulatedData() throws InterruptedException {
		Thread.sleep(5000);
		IssueDescriptionTextCCP = WebDriverWaits.GetText(IssueDescriptionCCP);
		AttachmentCountCCP = WebDriverWaits.GetText(AttachmentHeaderCCP);
		ContactOnCCP = WebDriverWaits.GetText(AddedContactCCP);
	}

	public static void CreateAndLinkCase_VerifyLinkedCase() throws InterruptedException {
		CRMCommonMethods.CE_AddLocation();
		CRMCommonMethods.CE_AddViolation();
		WebDriverWaits.ClickOn(CreateCaseButton);
		Thread.sleep(5000);
		CreateCasePopupTitle = WebDriverWaits.GetText(CreateCasePopup);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CreateScheduleInspectionButton);
		Thread.sleep(5000);
		AssociatedSubmission = WebDriverWaits.GetText(AssociatedSubmissionLink);
	}

	public static void CreateAndLinkCase_VerifyDirectionToAssociatedSubmission() throws InterruptedException {
		Thread.sleep(10000);
		String CaseNumberSplit[] = WebDriverWaits.GetText(LinkedCaseNumber).split("#");
		CaseNumberLinked = CaseNumberSplit[1];
		WebDriverWaits.ClickOn(AssociatedSubmissionLink);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(7000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(7000);
		AssociatedCase = WebDriverWaits.GetText(AssociatedCaseLink);
	}

	public static void CreateAndLinkCase_VerifyDirectionToAssociatedCase() throws InterruptedException {
		Thread.sleep(10000);
		AssociatedCase2 = WebDriverWaits.GetText(AssociatedCaseLink);
		WebDriverWaits.ClickOn(AssociatedCaseLink);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(2));
		Thread.sleep(4000);
		String CaseNumberSplit[] = WebDriverWaits.GetText(LinkedCaseNumber).split("#");
		CaseNumberLinked = CaseNumberSplit[1];
	}

//	public static void CreateAndLinkCase_VerifyCaseUnlinked() throws InterruptedException {
//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertAll();
//	}

}
