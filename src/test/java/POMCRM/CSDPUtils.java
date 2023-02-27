package POMCRM;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;

public class CSDPUtils extends CSPExternalUtils {

	public static String changeLinkDueDate = "//a[text()='Change']";
	public static String changeDueByPopup = "//div[text()='Change Due By']";
	public static String reasonField = "//textarea[@name='reason']";
	public static String saveButton = "//button[text()='Save']";
	public static String cancelButton = "//button[text()='Cancel']";
	public static String validationMsgReason = "//textarea[@name='reason']/following::span";
	public static String dueByDatepicker = "//input[@name='dueBy']";
	public static String updateDueDate = "//td[@class='rdtDay rdtActive']/following::td[1]";
	public static String changedDueDate = "//label[text()='Due By']/following::label[1]";
	public static String internalNotesContent = "//div[@class='internal-note-tile-content__content']";
	public static String internalNotesContent2 = "(//div[@class='internal-note-tile-content__content'])[2]";
	public static String escalateIssueToggle = "//div[@class='react-toggle-thumb']";
	public static String customerNameLink = "//label[text()='Customer Name']/following::a[1]";
	public static String coDPHeader = "//div[@class='contact-details__header__main']/h2[1]";
	public static String closeIconCoDP = "//div[@class='contact-details__header__close-icon']/img";
	public static String tagsLink = "//span[@class='clipped-text']/a";
	public static String cSLPHeader = "(//label[@class='dropdown__selector__label'])[1]";
	public static String imageIconCSDP = "//div[@id='cs-attachments']//button";
	public static String internalNotesIcon = "//div[@id='cs-notes']//button[@class='compose-note-icon btn btn-primary']";
	public static String addInternalNotePopup = "//div[text()='Add Internal Note']";
	public static String createNoteButton = "//button[text()='Create Note']";
	public static String internalNoteValidation = "//div[@class='notes']//span";
	public static String internalNoteField = "//textarea[@name='caseNote']";
	public static String editNoteIcon = "//button[@class='edit-btn internal-note-tile-content__actions__edit btn btn-primary']";
	public static String editInternalNotePopup = "//div[text()='Edit Internal Note']";

	public static By ChangeLinkDueDate = By.xpath(CSDPUtils.changeLinkDueDate);
	public static By ChangeDueByPopup = By.xpath(CSDPUtils.changeDueByPopup);
	public static By ReasonField = By.xpath(CSDPUtils.reasonField);
	public static By SaveButton = By.xpath(CSDPUtils.saveButton);
	public static By ValidationMsgReason = By.xpath(CSDPUtils.validationMsgReason);
	public static By DueByDatepicker = By.xpath(CSDPUtils.dueByDatepicker);
	public static By UpdateDueDate = By.xpath(CSDPUtils.updateDueDate);
	public static By ChangedDueDate = By.xpath(CSDPUtils.changedDueDate);
	public static By InternalNotesContent = By.xpath(CSDPUtils.internalNotesContent);
	public static By InternalNotesContent2 = By.xpath(CSDPUtils.internalNotesContent2);
	public static By EscalateIssueToggle = By.xpath(CSDPUtils.escalateIssueToggle);
	public static By CustomerNameLink = By.xpath(CSDPUtils.customerNameLink);
	public static By CoDPHeader = By.xpath(CSDPUtils.coDPHeader);
	public static By CloseIconCoDP = By.xpath(CSDPUtils.closeIconCoDP);
	public static By TagsLink = By.xpath(CSDPUtils.tagsLink);
	public static By CSLPHeader = By.xpath(CSDPUtils.cSLPHeader);
	public static By ImageIconCSDP = By.xpath(CSDPUtils.imageIconCSDP);
	public static By InternalNotesIcon = By.xpath(CSDPUtils.internalNotesIcon);
	public static By AddInternalNotePopup = By.xpath(CSDPUtils.addInternalNotePopup);
	public static By CreateNoteButton = By.xpath(CSDPUtils.createNoteButton);
	public static By InternalNoteValidation = By.xpath(CSDPUtils.internalNoteValidation);
	public static By InternalNoteField = By.xpath(CSDPUtils.internalNoteField);
	public static By EditNoteIcon = By.xpath(CSDPUtils.editNoteIcon);
	public static By EditInternalNotePopup = By.xpath(CSDPUtils.editInternalNotePopup);
	
	public static By AddedCustomerName = By.xpath("//label[text()='Customer Name']/following-sibling::label");
	public static By PrintButton = By.xpath("//button[text()='Print']");
	public static By PrintSettingsPopup = By.xpath("//div[text()='Print Settings']");
	public static By PrintButtonPSP = By.xpath("//div[text()='Print Settings']/following::button[text()='Print']");
	public static By PrintPageSubmissionID = By.xpath("//h2[@class='customer-submission-print-details__number']");
	public static By CSDPSubmissionID = By.xpath("//h2[@class='customer-submission-details__number']");
	public static By ManageTagsButton = By.xpath("//button[text()='Manage Tags']");
	public static By ManageTagsPopup = By.xpath("//div[text()='Manage Tags']");
	public static By EnterTagsField = By.xpath("//input[@name='tags-input']");
	public static By SaveButtonTags = By.xpath("//input[@name='tags-input']/following::button[2]");
	public static By TagsSuccessMessage = By.xpath("//div[@class='success-custom-message']/span");	
	public static By TasksIcon = By.xpath("//p[text()='Tasks']/..//button");
	public static By AddATaskPopup = By.xpath("//div[text()='Add a Task']");
	public static By TaskNameField = By.xpath("//input[@name='name']");
	public static By TaskAssigneeDropdown = By.xpath("//label[@for='assigneeId']/following::span[1]");
	public static By TaskAssigneeOption = By.xpath("//label[@for='assigneeId']/following::ul/li[1]");
	public static By AddTaskButton = By.xpath("//button[text()='Add Task']");
	public static By AddedTaskName = By.xpath("//div[@class='tasks-table']//div[@class='rt-td'][2]/div");
	public static By EditTaskIcon = By.xpath("//button[@class='edit-btn edit-task-content__actions__edit space-right btn btn-primary']");
	public static By EditATaskPopup = By.xpath("//div[text()='Edit a Task']");
	public static By SaveButtonTask = By.xpath("//div[text()='Edit a Task']/following::button[2]");
	public static By TaskSectionIcon = By.xpath("//div[@class='cs-tasks__header']//button");
	public static By DeleteTaskIcon = By.xpath("//button[@class='delete-btn space-right btn btn-primary']");
	public static By TasksCountAtHeader = By.xpath("//div[@class='cs-tasks__header']/h2");
	public static By TaskCoulumns = By.xpath("//div[@class='rt-tr -odd']");
	public static By MoreButtonCSDP = By.xpath("//button[text()='More...']");
	public static By CloseSubmissionOption = By.xpath("//li[text()='Close Submission']");
	public static By YesCloseButton = By.xpath("//button[text()='Yes, Close']");
	public static By SubmissionStatus = By.xpath("//h2[@class='customer-submission-details__status']");
	public static By ReopenSubmissionOption = By.xpath("//li[text()='Reopen Submission']");
	public static By YesReopenButton = By.xpath("//button[text()='Yes, Reopen']");
	public static By YesDeleteButton = By.xpath("//button[text()='Yes, Delete']");
	public static By PossibleDuplicateSubmissionsPopup = By.xpath("//h2[text()='Possible Duplicate Submissions']");
	public static By SubmitAnywayButton = By.xpath("//button[text()='Submit Anyway']");
	
	
	public static String RandomReason;
	public static String Characters500;
	public static String RandomReason2;
	public static String RandomTaskName;
	public static String StatusOfSubmission;
	public static String PopupTitleChangeDueBy;
	public static String ReasonValidationMsg;
	public static String ValidationMsgMaxChar;
	public static String InternalNotes;
	public static String ValidationMsgCharLimit;
	public static boolean EscalateToggleStatus;
	public static String InternalNotes2;
	public static String CustomerName;
	public static String CustomerDetailHeader;
	public static boolean CheckImageSize;
	public static String InternalNotePopupTitle;
	public static String EditNotePopupTitle;
	public static String EditedNotes;
	public static String PrintSettingsPopupTitle;
	public static String PrintPageSubmissionHeader;
	public static String CSDPSubmissionHeader;
	public static String ManageTagsPopupTitle;
	public static String SuccessMessageTags;
	public static String ExpectedSuccessMsg;
	public static String AddTaskPopupTitle;
	public static String AddedTaskText;
	public static String EditTaskPopupTitle;
	public static String AddedTaskText2;
	public static boolean TasksCount;
	public static String ClosedStatusOfSubmission;
	public static String OpenedStatusOfSubmission;

		public static void CSDP_OpenCSDPAfterSubmissionCreation() throws InterruptedException {
		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "Yes", "Yes","Location Required");
		Thread.sleep(3000);
		StatusOfSubmission = WebDriverWaits.GetText(SubmisionStatus);
	}

	public static void CSDP_ChangeDueByDate() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ChangeLinkDueDate);
		PopupTitleChangeDueBy = WebDriverWaits.GetText(ChangeDueByPopup);
		WebDriverWaits.ClickOn(SaveButton);
		ReasonValidationMsg = WebDriverWaits.GetText(ValidationMsgReason);
		Characters500 = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life";
		WebDriverWaits.SendKeys(ReasonField, Characters500);
		WebDriverWaits.ClickOn(SaveButton);
		ValidationMsgMaxChar = WebDriverWaits.GetText(ValidationMsgReason);
		WebElement ReasonFieldWE = WebDriverWaits.WaitUntilVisibleWE(ReasonField);
		ReasonFieldWE.clear();
		RandomReason = RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(ReasonField, RandomReason);
		WebDriverWaits.ClickOn(DueByDatepicker);
		WebDriverWaits.ClickOn(UpdateDueDate);
		WebDriverWaits.ClickOn(SaveButton);
	}

	public static void CSDP_VerifyInternalNotesContent() throws InterruptedException {
		InternalNotes = WebDriverWaits.GetText(InternalNotesContent);
	}

	public static void CSDP_VerifyEscalatedIssue() throws InterruptedException {
		WebDriverWaits.ClickOn(EscalateIssueToggle);
		RandomReason2 = RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(ReasonField, Characters500);
		WebDriverWaits.ClickOn(SaveButton);
		ValidationMsgCharLimit = WebDriverWaits.GetText(ValidationMsgReason);
		WebElement ReasonFieldWE = WebDriverWaits.WaitUntilVisibleWE(ReasonField);
		ReasonFieldWE.clear();
		WebDriverWaits.SendKeys(ReasonField, RandomReason2);
		WebDriverWaits.ClickOn(SaveButton);
		WebElement EscalateToggle = WebDriverWaits.WaitUntilVisibleWE(EscalateIssueToggle);
		EscalateToggleStatus = EscalateToggle.isEnabled();
	}

	public static void CSDP_VerifyReasonWithInternalNotes() throws InterruptedException {
		InternalNotes2 = WebDriverWaits.GetText(InternalNotesContent2);
	}

	public static void CSDP_VerifyNoEscalationOnCancel() throws InterruptedException {
		WebDriverWaits.ClickOn(EscalateIssueToggle);
		WebDriverWaits.SendKeys(ReasonField, RandomReason2);
		WebDriverWaits.ClickOn(CancelButton);
		WebElement EscalateToggle = WebDriverWaits.WaitUntilVisibleWE(EscalateIssueToggle);
		EscalateToggleStatus = EscalateToggle.isEnabled();
	}

//	public static void CSDP_VerifyAnonymousText() throws InterruptedException {
//		extentTest = extent.startTest(" CSDP_VerifyAnonymousText ");
//		extentTest.setDescription(" Verify that 'Anonymous' text appears under 'Customer Name' field, when user has created a Submission with 'Post Anonymously' checkbox checked. ");
//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertAll();
//	}

	public static void CSDP_VerifyDirectionToCoDP() throws InterruptedException {
		CustomerName = WebDriverWaits.GetText(CustomerNameLink);
		WebDriverWaits.ClickOn(CustomerNameLink);
		Thread.sleep(4000);
		CustomerDetailHeader = WebDriverWaits.GetText(CoDPHeader);
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(CloseIconCoDP);
		Thread.sleep(3000);
	}

	public static void CSDP_VerifyDirectionToCSLPFromTags() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(TagsLink);
		Thread.sleep(6000);
		CustomerDetailHeader = WebDriverWaits.GetText(CSLPHeader);
		driver.navigate().back();
		Thread.sleep(6000);
	}

//	public static void CSDP_VerifyUpdatedLocation() throws InterruptedException {
//		extentTest = extent.startTest(" CSDP_VerifyUpdatedLocation ");
//		extentTest.setDescription(" Verify that user is able edit & save the Location under 'Location' tile, on CSDP. ");
//		SoftAssert softAssert = new SoftAssert();
//		
//		softAssert.assertAll();
//	}

	public static void CSDP_VerifyAddedAttachments() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ImageIconCSDP);
		Thread.sleep(2000);
		WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(AddButton);
		List<WebElement> CountAttachments = driver.findElements(ImageThumb);
		int ImgSize = CountAttachments.size();
		CheckImageSize = ImgSize >= 1;
	}

	public static void CSDP_VerifyAddedInternalNote() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(InternalNotesIcon);
		InternalNotePopupTitle = WebDriverWaits.GetText(AddInternalNotePopup);
		String AllChar5000 = "abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc d. ";
		WebDriverWaits.SendKeys(InternalNoteField, AllChar5000);
		WebDriverWaits.ClickOn(CreateNoteButton);
		Thread.sleep(2000);
//		String ValidationMsg1 = WebDriverWaits.GetText(InternalNoteValidation);
//		softAssert.assertTrue(ValidationMsg1.equals("Min 1 and Max 5000 characters limit."));
		WebElement InternalNoteFieldWE = WebDriverWaits.WaitUntilVisibleWE(InternalNoteField);
		Thread.sleep(6000);
		InternalNoteFieldWE.clear();
		String RandomNote = "Internal Note " + RandomStrings.RequiredString(40);
		WebDriverWaits.SendKeys(InternalNoteField, RandomNote);
		WebDriverWaits.ClickOn(CreateNoteButton);
//		softAssert.assertAll();
	}
    
	public static String RandomEditedNote;
	public static void CSDP_VerifyUpdatedNote() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWaits.VisibilityOfElementLocated(EditNoteIcon, 1);
		WebDriverWaits.ClickOn(EditNoteIcon);
		Thread.sleep(4000);
		//WebDriverWaits.VisibilityOfElementLocated(EditInternalNotePopup, 2);
		EditNotePopupTitle = WebDriverWaits.GetText(EditInternalNotePopup);
		WebElement InternalNoteFieldWE = WebDriverWaits.WaitUntilVisibleWE(InternalNoteField);
		InternalNoteFieldWE.clear();
		String RandomNote = "***Edited*** Internal Note " + RandomStrings.RequiredString(40);
		RandomEditedNote = RandomNote;
		WebDriverWaits.SendKeys(InternalNoteField, RandomNote);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(4000);
		EditedNotes = WebDriverWaits.GetText(InternalNotesContent);
	}
	
	public static void CSDP_VerifyUserIsAbleToPrintCSD() throws InterruptedException {
	CSDPSubmissionHeader = WebDriverWaits.GetText(CSDPSubmissionID);
	Thread.sleep(3000);
	WebDriverWaits.ClickOn(PrintButton);
	PrintSettingsPopupTitle = WebDriverWaits.GetText(PrintSettingsPopup);
	WebDriverWaits.ClickOn(PrintButtonPSP);
	Thread.sleep(2000);
	String currentWindow = driver.getWindowHandle();
	Thread.sleep(4000);
	ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(2000);
	PrintPageSubmissionHeader = WebDriverWaits.GetText(PrintPageSubmissionID);
	driver.switchTo().window(currentWindow);
}
	
	public static void CSDP_VerifyMultipleTagsAddition() throws InterruptedException {
	WebDriverWaits.ClickOn(ManageTagsButton);
	ManageTagsPopupTitle = WebDriverWaits.GetText(ManageTagsPopup);
	for(int i=0;i<3;i++) {
		String RandomTags = RandomStrings.RequiredCharacters(4) + ",";
		WebDriverWaits.SendKeys(EnterTagsField, RandomTags);
	}
	WebDriverWaits.ClickOn(SaveButtonTags);
	SuccessMessageTags = WebDriverWaits.GetText(TagsSuccessMessage);
	ExpectedSuccessMsg = "Tags saved successfully";
}
	
	public static void CSDP_VerifyAdditionOfTasks() throws InterruptedException {
	WebDriverWaits.ClickOn(TasksIcon);
	AddTaskPopupTitle = WebDriverWaits.GetText(AddATaskPopup);
	RandomTaskName = RandomStrings.RequiredCharacters(8);
	WebDriverWaits.SendKeys(TaskNameField, RandomTaskName);	
	WebDriverWaits.ClickOn(TaskAssigneeDropdown);
	WebDriverWaits.ClickOn(TaskAssigneeOption);
	WebDriverWaits.ClickOn(AddTaskButton);
	AddedTaskText = WebDriverWaits.GetText(AddedTaskName);
}
	
	public static void CSDP_VerifyUpdationAndDeletionOfTasks() throws InterruptedException {
	WebDriverWaits.ClickOn(EditTaskIcon);
	EditTaskPopupTitle = WebDriverWaits.GetText(EditATaskPopup);
	Thread.sleep(4000);
	WebDriverWaits.SendKeys(TaskNameField, " Edited");	
	Thread.sleep(2000);
	WebDriverWaits.ClickOn(SaveButtonTask);
	Thread.sleep(4000);
	AddedTaskText2 = WebDriverWaits.GetText(AddedTaskName);
	WebDriverWaits.ClickOn(TaskSectionIcon);
	WebDriverWaits.SendKeys(TaskNameField, "TaskToDelete");	
	WebDriverWaits.ClickOn(TaskAssigneeDropdown);
	WebDriverWaits.ClickOn(TaskAssigneeOption);
	WebDriverWaits.ClickOn(AddTaskButton);
	Thread.sleep(2000);
	WebDriverWaits.ClickOn(DeleteTaskIcon);
	WebDriverWaits.ClickOn(YesDeleteButton);	
	List<WebElement> CountTasks = driver.findElements(TaskCoulumns);
	TasksCount = CountTasks.size()==1;
}
	
	public static void CSDP_VerifyClosedSubmission() throws InterruptedException {
	Thread.sleep(4000);
	WebDriverWaits.ClickOn(MoreButtonCSDP);
	Thread.sleep(2000);
	WebDriverWaits.ClickOn(CloseSubmissionOption);
	WebDriverWaits.ClickOn(YesCloseButton);
	Thread.sleep(4000);
	ClosedStatusOfSubmission = WebDriverWaits.GetText(SubmissionStatus);
}
	
	public static void CSDP_VerifyReopenedSubmission() throws InterruptedException {
	Thread.sleep(4000);
	WebDriverWaits.ClickOn(MoreButtonCSDP);
	Thread.sleep(2000);
	WebDriverWaits.ClickOn(ReopenSubmissionOption);
	WebDriverWaits.ClickOn(YesReopenButton);
	Thread.sleep(4000);
	OpenedStatusOfSubmission = WebDriverWaits.GetText(SubmissionStatus);
	}
	
}
