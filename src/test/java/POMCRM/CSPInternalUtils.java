package POMCRM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import BrowsersBase.DataInterface;
import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;

public class CSPInternalUtils extends SubmissionAssignmentUtils {

	public static String plusIconToCRM = "//*[@class='app-header__new']";
	public static String customerSubmissionOption = "//label[text()='Customer submission']";
	public static String cSPPopupTitle = "//div[@class='full-page-modal__header']/h1";
	public static String createSubmissionButton = "//button[text()='Create Submission']";
	public static String globalErrorMessageCSP = "//div[@class='create-submission__global-error']/h2";
	public static String postAnonymouslyCheckbox = "//label[text()='Post anonymously']";
	public static String addExistingCustomerField = "//label[@class='contact-tile__searchbox-label']/following::input[1]";
	public static String nameField = "//input[@name='name']";
	public static String emailField = "//input[@name='email']";
	public static String workPhoneField = "//input[@name='workPhone']";
	public static String selectedAnonymousToggle = "//div[@class='post-anonymous-section']//button[@class='square-btn btn btn-primary']";
	public static String yesToggleAnonymous = "//div[@class='post-anonymous-section']//button[2]";
	public static String saveChangesButton = "//button[text()='Save Changes']";
	public static String contactSearchResults = "(//div[@class='react-autosuggest__suggestion-element']/div)[3]";
	public static String categoryDropdown = "//label[@for='selectedCategory']/following::span[1]";
	public static String searchCategory = "//input[@name='query']";
	public static String selectedCategory = "//label[@for='selectedCategory']/following::label[1]";
	//public static String searchResultsCategory = "//ul[@class='dropdown__options--single']";
	public static String searchResultsCategory = "//ul[@class='dropdown__options--single']//li//b";
	public static String locationValidationMsg = "//div[@class='tile--error-msg']";
	public static String locationField = "//div[@class='location-tile__inputs-container']//input";
	public static String locationSearchResult = "//li[@id='react-autowhatever-1-section-0-item-0']";
	public static String EditLocation = "//div[@class='edit-address__header']/button";
	public static String issueDescriptionField = "//textarea[@name='issueDescription']";
	public static String tagsField = "//div[@class='tags-input__chips']/input";
	public static String attachmentIcon = "//div[text()='Attachments ']/following::button";
	public static String cameraButton = "//span[text()='Camera']";
	public static String addButton = "//button[text()='Add']";
	public static String imageThumb = "//img[@class='attachments-tile__saved-thumb']";
	public static String submisionStatus = "//h2[@class='customer-submission-details__status']";
	public static String closeSubmissionIcon = "//div[@class='customer-submission-details__close-icon']/img";
	public static String cancelButton = "//button[text()='Cancel']";

	public static By PlusIconToCRM = By.xpath(CSPInternalUtils.plusIconToCRM);
	public static By CustomerSubmissionOption = By.xpath(CSPInternalUtils.customerSubmissionOption);
	public static By CSPPopupTitle = By.xpath(CSPInternalUtils.cSPPopupTitle);
	public static By CreateSubmissionButton = By.xpath(CSPInternalUtils.createSubmissionButton);
	public static By GlobalErrorMessageCSP = By.xpath(CSPInternalUtils.globalErrorMessageCSP);
	public static By PostAnonymouslyCheckbox = By.xpath(CSPInternalUtils.postAnonymouslyCheckbox);
	public static By AddExistingCustomerField = By.xpath(CSPInternalUtils.addExistingCustomerField);
	public static By NameField = By.xpath(CSPInternalUtils.nameField);
	public static By EmailField = By.xpath(CSPInternalUtils.emailField);
	public static By WorkPhoneField = By.xpath(CSPInternalUtils.workPhoneField);
	public static By SelectedAnonymousToggle = By.xpath(CSPInternalUtils.selectedAnonymousToggle);
	public static By YesToggleAnonymous = By.xpath(CSPInternalUtils.yesToggleAnonymous);
	public static By SaveChangesButton = By.xpath(CSPInternalUtils.saveChangesButton);
	public static By ContactSearchResults = By.xpath(CSPInternalUtils.contactSearchResults);
	public static By CategoryDropdown = By.xpath(CSPInternalUtils.categoryDropdown);
	public static By SearchCategory = By.xpath(CSPInternalUtils.searchCategory);
	public static By SelectedCategory = By.xpath(CSPInternalUtils.selectedCategory);
	public static By SearchResultsCategory = By.xpath(CSPInternalUtils.searchResultsCategory);
	public static By LocationValidationMsg = By.xpath(CSPInternalUtils.locationValidationMsg);
	public static By LocationSearchResult = By.xpath(CSPInternalUtils.locationSearchResult);
	public static By LocationField = By.xpath(CSPInternalUtils.locationField);
	public static By IssueDescriptionField = By.xpath(CSPInternalUtils.issueDescriptionField);
	public static By TagsField = By.xpath(CSPInternalUtils.tagsField);
	public static By AttachmentIcon = By.xpath(CSPInternalUtils.attachmentIcon);
	public static By CameraButton = By.xpath(CSPInternalUtils.cameraButton);
	public static By AddButton = By.xpath(CSPInternalUtils.addButton);
	public static By ImageThumb = By.xpath(CSPInternalUtils.imageThumb);
	public static By SubmisionStatus = By.xpath(CSPInternalUtils.submisionStatus);
	public static By CloseSubmissionIcon = By.xpath(CSPInternalUtils.closeSubmissionIcon);
	public static By CancelButton = By.xpath(CSPInternalUtils.cancelButton);

	public static String SelectedToggleForAnonymous;
	public static String SelectedToggleNow;
	public static String ErrMessageActual;
	public static String ErrMessageExpected;
	public static String CSPTitleActual;
	public static String CSPTitleExpected;
	public static boolean PostAnonymouslyState;
	public static boolean ContactsTileState;
	public static String EmailValue;
	public static String ActualCategorySel;
	public static String ActualCategorySel2;
	public static String LocValidMsg;
	public static boolean LocationPresence;
	public static boolean CheckImgSize;
	public static String StatusOfSubmission;
	public static String CreatedCategory1;
	public static String CreatedCategory2;
	public static String CreatedCategory3;

	public static void CSPInternal_Prerequisites() throws InterruptedException {
		//WebDriverWaits.closetabs();
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(6000);	
		String SelectedToggleForAnonymous = WebDriverWaits.GetText(SelectedAnonymousToggle);
		if (SelectedToggleForAnonymous.equals("No")) {
			WebDriverWaits.ClickOn(YesToggleAnonymous);
			WebDriverWaits.ClickOn(SaveChangesButton);
			Thread.sleep(3000);
		}
		SelectedToggleNow = WebDriverWaits.GetText(SelectedAnonymousToggle);
	}
	
	public static void CSPInternal_VerifyAllThreeCategoriesCreation() throws InterruptedException {
		CreatedCategory1 = "Location Required";
		CreatedCategory2 = "Location Not Included";
		CreatedCategory3 = "Location Not Required";		
		CRMCommonMethods.CRM_CreateCategory("Yes", "Yes", "No", CreatedCategory1);
		CRMCommonMethods.CRM_CreateCategory("No", "No", "No", CreatedCategory2);
		CRMCommonMethods.CRM_CreateCategory("Yes", "Yes", "No", CreatedCategory3);
	}

	public static void CSPInternal_VerifyCSPOpensUp() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(PlusIconToCRM);
		WebDriverWaits.ClickOn(CustomerSubmissionOption);
		Thread.sleep(9000);
		CSPTitleActual = WebDriverWaits.GetText(CSPPopupTitle);
		CSPTitleExpected = "Create Customer Submission";
		WebDriverWaits.ClickOn(CreateSubmissionButton);
		ErrMessageActual = WebDriverWaits.GetText(GlobalErrorMessageCSP);
		ErrMessageExpected = "Please complete all fields marked in red below to continue.";
	}

	public static void CSPInternal_VerifyPostAnonymouslycheckbox() throws InterruptedException {
		WebElement PostAnonymously = WebDriverWaits.WaitUntilVisibleWE(PostAnonymouslyCheckbox);
		PostAnonymouslyState = PostAnonymously.isDisplayed();
	}

	public static void CSPInternal_VerifyCustomerInformationTile() throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		WebElement PostAnonymouslyCheckbox2 = (WebElement) jser
				.executeScript("return document.querySelector('div > div:nth-child(2) > span > input')");
		PostAnonymouslyCheckbox2.click();
		Thread.sleep(3000);
		WebElement ContactsTile = WebDriverWaits.WaitUntilVisibleWE(NameField);
		ContactsTileState = ContactsTile.isEnabled();
	}

	public static void CSPInternal_AddExistingCustomer() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(6000);		
		WebDriverWaits.SendKeys(AddExistingCustomerField, "a");
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(ContactSearchResults);
		EmailValue = driver.findElement(EmailField).getAttribute("value");
	}

	public static void CSPInternal_VerifyCategoriesList() throws InterruptedException {
		CSPInternal_VerifyAllThreeCategoriesCreation();
		driver.navigate().to(DataInterface.URLCreateCustomerSubmission);
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(CategoryDropdown);
		WebDriverWaits.SendKeys(SearchCategory, CreatedCategory1);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SearchResultsCategory);
		Thread.sleep(2000);
		ActualCategorySel = WebDriverWaits.GetText(SelectedCategory);
	}

	public static void CSPInternal_SearchAndAddCategory() throws InterruptedException {
		WebDriverWaits.ClickOn(CategoryDropdown);
		WebDriverWaits.SendKeys(SearchCategory, CreatedCategory1);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SearchResultsCategory);
		Thread.sleep(2000);
		ActualCategorySel2 = WebDriverWaits.GetText(SelectedCategory);
	}

	public static void CSPInternal_LocationRequiredValCategory() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateSubmissionButton);
		Thread.sleep(2000);
		LocValidMsg = WebDriverWaits.GetText(LocationValidationMsg);
	}

	public static void CSPInternal_AddLocation() throws InterruptedException {
		WebDriverWaits.ClickOn(CategoryDropdown);
		WebDriverWaits.SendKeys(SearchCategory, "Location Not Required");
		WebDriverWaits.ClickOn(SearchResultsCategory);
		WebDriverWaits.SendKeys(LocationField, "Texas ");
		WebDriverWaits.WaitUntilVisible(LocationSearchResult);
		WebDriverWaits.SendKeys(LocationField, "City Museum");
		Thread.sleep(2000);
		WebDriverWaits.WaitUntilVisible(LocationSearchResult);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(LocationSearchResult);
	}

	public static void CSPInternal_CategoryWithLocationIncluded() throws InterruptedException {
		WebDriverWaits.ClickOn(CategoryDropdown);
		WebDriverWaits.SendKeys(SearchCategory, CreatedCategory2);
		WebDriverWaits.ClickOn(SearchResultsCategory);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);
		List<WebElement> LocationTile = driver.findElements(LocationField);
		LocationPresence = (LocationTile.size() == 0);
	}

	public static void CSPInternal_VerifyIssueDescription() throws InterruptedException {
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(IssueDescriptionField, RandomDescription);
	}

	public static void CSPInternal_AddMultipleTags() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			String RandomTags = RandomStrings.RequiredString(4);
			WebDriverWaits.SendKeys(TagsField, RandomTags + ",");
		}
	}

	public static void CSPInternal_AddAttachments() throws InterruptedException {
		WebDriverWaits.ClickOn(AttachmentIcon);
		Thread.sleep(2000);
		WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(AddButton);
		List<WebElement> CountAttachments = driver.findElements(ImageThumb);
		int ImgSize = CountAttachments.size();
		CheckImgSize = ImgSize >= 1;
	}

	public static void CSPInternal_VerifySubmissionCreation() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CreateSubmissionButton);
		StatusOfSubmission = WebDriverWaits.GetText(SubmisionStatus);
	}

	public static void CSPInternal_SubmissionDoesNotGetCreatedOnCancel() throws InterruptedException {
		WebDriverWaits.ClickOn(CloseSubmissionIcon);
		WebDriverWaits.ClickOn(PlusIconToCRM);
		WebDriverWaits.ClickOn(CustomerSubmissionOption);
		Thread.sleep(9000);
		WebDriverWaits.ClickOn(CancelButton);
	}

}
