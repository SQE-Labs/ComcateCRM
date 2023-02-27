package POMCRM;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import BrowsersBase.DataInterface;
import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;

public class CSPExternalUtils extends CSPInternalUtils {

	public static String reportAnIssuePage = "//nav[@class='crm-submission__navigation-bar']/h1";
	public static String issueDescriptionField = "//textarea[@name='description']";
	public static String validationMsgDescription = "//span[@class='field__error']";
	public static String nextButton = "//button[text()='Next']";
	public static String nextButtonSec2 = "(//button[text()='Next'])[2]";
	public static String nextButtonSec3 = "(//button[text()='Next'])[3]";
	public static String selectedCategory = "//div[@class='chip__wrapper active clickable']";
	public static String otherCategories = "//div[@class='chip__wrapper clickable']";
	public static String showMoreLinktext = "//a[@class='show-more']";
	public static String showMoreOnlyLinktext = "//a[@class='show-more' and text()='More']";

	public static String submissionUpdatesCheckbox = "//input[@name='hasSubscribed']";
	public static String noButton = "//button[text()='No']";
	public static String yesButton = "//button[text()='Yes']";
	public static String firstNameField = "//input[@name='firstName']";
	public static String lastNameField = "//input[@name='lastName']";
	public static String emailField = "//input[@name='email']";
	public static String emailPreferenceButton = "//button[text()='Email']";
	public static String otherField = "//input[@name='notificationNote']";
	public static String backButton = "//button[text()='Back']";
	public static String submitButton = "//button[text()='Submit']";
	public static String firstNameValidation = "//input[@name='firstName']/following::span[1]";
	public static String lastNameValidation = "//input[@name='firstName']/following::span[2]";
	public static String successMessage = "//section[@class='crm__success-message-section']/h5";
	public static String agencySearchField = "//span[@class='agencies-listing__search']/input";
	public static String editAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[2]";
	public static String cSPExternalURL = "//div[@class='agency-form__product-config']/a";
	public static String categoryExpandedSection = "//div[@class='crm-location-section']";
	public static String issueDescriptionTitle = "//h2[text()='Issue Description']";
	public static String attachmentThumbnail = "//img[@class='photos-tile__saved-thumb']";
	public static String deleteIconAttachment = "//img[@class='delete-button']";
	public static String locationSection = "//h2[text()='Location']";
	public static String locationSearchField = "//input[@type='text']";
	public static String changeLocationValue = "//button[contains(text(),'Change')]";
	public static String locationValidationMsg = "//div[@class='crm-location-field error']/following::span";
	//public static String locationSearchResult = "//div[@class='list-label']";
	public static String locationSearchResult = "//div[@class='list-label']//b";
	public static String selectCategoryTitle = "//h2[text()='Select Category']";
	public static String changeLocButton = "//button[text()='Change']";
	public static String submitSubmissionPage = "//div[@class='crm__anonymous-toggle col']/h5";
	//public static String emailValidationMsg = "//span[text()='Enter the details.']";
	public static String emailValidationMsg = "//*[@name='email']/../../span";

	public static By ReportAnIssuePage = By.xpath(CSPExternalUtils.reportAnIssuePage);
	public static By IssueDescriptionField = By.xpath(CSPExternalUtils.issueDescriptionField);
	public static By ValidationMsgDescription = By.xpath(CSPExternalUtils.validationMsgDescription);
	public static By NextButton = By.xpath(CSPExternalUtils.nextButton);
	public static By NextButtonSec2 = By.xpath(CSPExternalUtils.nextButtonSec2);
	public static By NextButtonSec3 = By.xpath(CSPExternalUtils.nextButtonSec3);
	public static By SelectedCategory = By.xpath(CSPExternalUtils.selectedCategory);
	public static By OtherCategories = By.xpath(CSPExternalUtils.otherCategories);
	public static By ShowMoreLinktext = By.xpath(CSPExternalUtils.showMoreLinktext);
	public static By ShowMoreOnlyLinktext = By.xpath(CSPExternalUtils.showMoreOnlyLinktext);
	

	public static By SubmissionUpdatesCheckbox = By.xpath(CSPExternalUtils.submissionUpdatesCheckbox);
	public static By NoButton = By.xpath(CSPExternalUtils.noButton);
	public static By YesButton = By.xpath(CSPExternalUtils.yesButton);
	public static By FirstNameField = By.xpath(CSPExternalUtils.firstNameField);
	public static By LastNameField = By.xpath(CSPExternalUtils.lastNameField);
	public static By EmailField = By.xpath(CSPExternalUtils.emailField);
	public static By EmailPreferenceButton = By.xpath(CSPExternalUtils.emailPreferenceButton);
	public static By OtherField = By.xpath(CSPExternalUtils.otherField);
	public static By BackButton = By.xpath(CSPExternalUtils.backButton);
	public static By SubmitButton = By.xpath(CSPExternalUtils.submitButton);
	public static By FirstNameValidation = By.xpath(CSPExternalUtils.firstNameValidation);
	public static By LastNameValidation = By.xpath(CSPExternalUtils.lastNameValidation);
	public static By SuccessMessage = By.xpath(CSPExternalUtils.successMessage);
	public static By AgencySearchField = By.xpath(CSPExternalUtils.agencySearchField);
	public static By EditAgencyIcon = By.xpath(CSPExternalUtils.editAgencyIcon);
	public static By CSPExternalURL = By.xpath(CSPExternalUtils.cSPExternalURL);
	public static By CategoryExpandedSection = By.xpath(CSPExternalUtils.categoryExpandedSection);
	public static By IssueDescriptionTitle = By.xpath(CSPExternalUtils.issueDescriptionTitle);
	public static By AttachmentThumbnail = By.xpath(CSPExternalUtils.attachmentThumbnail);
	public static By DeleteIconAttachment = By.xpath(CSPExternalUtils.deleteIconAttachment);
	public static By LocationSection = By.xpath(CSPExternalUtils.locationSection);
	public static By LocationSearchField = By.xpath(CSPExternalUtils.locationSearchField);
	public static By ChangeLoactionValue = By.xpath(CSPExternalUtils.changeLocationValue);
	public static By LocationValidationMsg = By.xpath(CSPExternalUtils.locationValidationMsg);
	public static By LocationSearchResult = By.xpath(CSPExternalUtils.locationSearchResult);
	public static By SelectCategoryTitle = By.xpath(CSPExternalUtils.selectCategoryTitle);
	public static By ChangeLocButton = By.xpath(CSPExternalUtils.changeLocButton);
	public static By SubmitSubmissionPage = By.xpath(CSPExternalUtils.submitSubmissionPage);
	public static By EmailValidationMsg = By.xpath(CSPExternalUtils.emailValidationMsg);
	public static By TextMsgPreferenceButton = By.xpath("//button[text()='Text Message']");
	public static By MobileNumberField = By.xpath("//input[@name='phoneNumber']");

	public static String RASPageTitle;
	public static String DescriptionValidation;
	public static String ExpectedDescriptionMsg;
	public static String Validation2000;
	public static String Expected2000Msg;
	public static boolean CategorySectionState;
	public static boolean CountAttachments;
	public static boolean CountAttachmentsAfter;
	public static String CategorySelected;
	public static boolean CountAllCategories;
	public static boolean NoLocationSection;
	public static String PageTitleSubmitSubmission;
	public static String ExpectedTitleSubmitSubmission;
	public static String ValidationMsgLocation;
	public static String ExpectedMsgLoc;
	public static String SubmitPageTitle;
	public static String ValidMsgFirstName;
	public static String ExpectedMsgName1;
	public static String ValidMsgLastName;
	public static String ExpectedMsgName2;
	public static String LimitMsgFirstName;
	public static String LimitMsgLastName;
	public static String CharLimitValidation;
	public static String EmailValidationMessage;
	public static String ExpectedEmailMsg;
	public static String InvalidMailMsg;
	public static String ExpectedInvalidMsg;
	public static String SubmissionSuccessMsg;
	public static String ExpectedSuccessMsg;
	public static String SubmissionSuccessMsgNA;
	public static Boolean categoryContains = false ;

	public static void CSPExternal_PreRequisite_OpenReportAnIssuePage() throws InterruptedException {
		WebDriverWaits.CloseOtherTabs();
		//LoginAdmin();
		driver.navigate().to(DataInterface.AdminURL);
		Thread.sleep(7000);
		String AgencyID = Integer.toString(DataInterface.AgencyID);
		Thread.sleep(3000);
		WebDriverWaits.SendKeys(AgencySearchField, AgencyID);
		Thread.sleep(7000);
		WebDriverWaits.ClickOn(EditAgencyIcon);
		Thread.sleep(7000);
		WebDriverWaits.ClickOn(CSPExternalURL);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(2000);
		RASPageTitle = WebDriverWaits.GetText(ReportAnIssuePage);
	}
	
	
	public static void CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin() throws InterruptedException {
		//LoginAdmin();
		WebDriverWaits.CloseOtherTabs();
		Thread.sleep(2000);
		String AgencyID = Integer.toString(DataInterface.AgencyID);
		Thread.sleep(3000);
		WebDriverWaits.SendKeys(AgencySearchField, AgencyID);
		Thread.sleep(7000);
		WebDriverWaits.ClickOn(EditAgencyIcon);
		Thread.sleep(7000);
		WebDriverWaits.ClickOn(CSPExternalURL);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(2000);
		RASPageTitle = WebDriverWaits.GetText(ReportAnIssuePage);
	}

	public static void CSPExternal_VerifyIssueDescription() throws InterruptedException {
		WebDriverWaits.ClickOn(NextButton);
		DescriptionValidation = WebDriverWaits.GetText(ValidationMsgDescription);
		ExpectedDescriptionMsg = "The Issue description is required.";
		String Description2001 = "A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet.There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out!A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet.There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out!A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet.There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out!A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet.There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out!A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits).Thanks Everyone";
		WebDriverWaits.SendKeys(IssueDescriptionField, Description2001);
		WebDriverWaits.ClickOn(NextButton);
		Thread.sleep(3000);
		Validation2000 = WebDriverWaits.GetText(ValidationMsgDescription);
		Expected2000Msg = "2000 character limit.";
		WebElement DescriptionField = WebDriverWaits.WaitUntilVisibleWE(IssueDescriptionField);
		DescriptionField.clear();
		String RandomDescription = RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(IssueDescriptionField, RandomDescription);
		WebDriverWaits.ClickOn(NextButton);
		WebElement CategorySection = WebDriverWaits.WaitUntilVisibleWE(CategoryExpandedSection);
		CategorySectionState = CategorySection.isDisplayed();
	}

	public static void CSPExternal_VerifyAddedAttachments() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyAddedAttachments ");
		extentTest.setDescription(
				" Verify that user is able to attach files, after clicking on the 'Browse file' link, on 'Report an issue' page. ");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(IssueDescriptionTitle);
		Thread.sleep(2000);
		WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");
		Thread.sleep(2000);
		WebElement UploadFile2 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile2.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
		Thread.sleep(3000);
		List<WebElement> AttachmentCountBefore = driver.findElements(AttachmentThumbnail);
		CountAttachments = AttachmentCountBefore.size() == 2;
		WebDriverWaits.ClickOn(DeleteIconAttachment);
		List<WebElement> AttachmentCountAfter = driver.findElements(AttachmentThumbnail);
		CountAttachmentsAfter = AttachmentCountAfter.size() == 1;
	}

	public static void CSPExternal_VerifyCorrespondingCategoryToKeyword() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyCorrespondingCategoryToKeyword ");
		extentTest.setDescription(
				" Verify that corresponding Category with added keyword in 'Describe the issue' textbox, appears selected by default, under 'Select Category' section. ");
		WebDriverWaits.SendKeys(IssueDescriptionField, "Location Not Included");
		WebDriverWaits.ClickOn(NextButton);
		CategorySelected = WebDriverWaits.GetText(SelectedCategory);
		List<WebElement> ShowMoreLink = driver.findElements(ShowMoreLinktext);
		List<String> CategoriesText = new ArrayList<String>();
		
		if (ShowMoreLink.size() == 1) {
			WebDriverWaits.ClickOn(ShowMoreLinktext);
			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			
			driver.findElements(OtherCategories).stream().forEach(x -> CategoriesText.add(x.getText()));
			
			CountAllCategories = CountCategories.size() > 0;
			categoryContains = CategoriesText.contains("Location Not Included");
		}
		else {
			
			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			driver.findElements(OtherCategories).stream().forEach(x -> CategoriesText.add(x.getText()));
			CountAllCategories = CountCategories.size() > 0;
			categoryContains = CategoriesText.contains("Location Not Included");
		}
	}

	public static void CSPExternal_VerifyNoLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyNoLocationSection ");
		extentTest.setDescription(
				" Verify that 'Location' section no longer appears, when user selects a 'Category' with 'Include Location?' toggle set as 'No'. ");
		String CategorySelected = WebDriverWaits.GetText(SelectedCategory);
		boolean CompareSelCategory = CategorySelected.equals("Location Not Included");
		if (!CompareSelCategory) {
			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			for (int i = 0; i < CountCategories.size(); i++) {
				WebElement AllCategories = CountCategories.get(i);
				String CategoriesText = AllCategories.getText();
				if (CategoriesText.equals("Location Not Included")) {
					AllCategories.click();
					break;
				}
			}
		}
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(NextButtonSec2);
		List<WebElement> LocationSec = driver.findElements(LocationSection);
		NoLocationSection = LocationSec.size() == 0;
		PageTitleSubmitSubmission = WebDriverWaits.GetText(SubmitSubmissionPage);
		ExpectedTitleSubmitSubmission = "Stay Updated on the Progress of your Submission";
		WebDriverWaits.ClickOn(BackButton);
	}

	public static void CSPExternal_VerifyRequiredLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyRequiredLocationSection ");
		extentTest.setDescription(
				" Verify that validation message appears under 'Location' section, when user clicks on 'Next' button, after selecting a Location Required 'Category'. ");
		try{
		    WebDriverWaits.ClickOn(ShowMoreOnlyLinktext);
		}
			catch(Exception e)
		{
		}
		String CategorySelected = WebDriverWaits.GetText(SelectedCategory);

		boolean CompareSelCategory = CategorySelected.equals("Location Required");
		if (!CompareSelCategory) {
			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			for (int i = 0; i < CountCategories.size(); i++) {
				WebElement AllCategories = CountCategories.get(i);
				String CategoriesText = AllCategories.getText();
				if (CategoriesText.equals("Location Required")) {
					AllCategories.click();
					break;
				}
			}
		}
		WebDriverWaits.ClickOn(NextButtonSec2);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(NextButtonSec3);
		ValidationMsgLocation = WebDriverWaits.GetText(LocationValidationMsg);
		ExpectedMsgLoc = "The location is required.";
		WebDriverWaits.ClickOn(LocationSearchField);
		WebDriverWaits.SendKeys(LocationSearchField, "Texas City Museum");
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(LocationSearchResult);
		WebDriverWaits.ClickOn(NextButtonSec3);
		Thread.sleep(2000);
		SubmitPageTitle = WebDriverWaits.GetText(SubmitSubmissionPage);
		WebDriverWaits.ClickOn(BackButton);
	}

	public static void CSPExternal_VerifyNonMandatoryLocationSection() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyNonMandatoryLocationSection ");
		extentTest.setDescription(
				" Verify that user is able to add a location under 'Location' section, when user selects a 'Category' with 'Include Location?' toggle set as 'Yes'. ");
		WebDriverWaits.ClickOn(SelectCategoryTitle);
		try{
			WebDriverWaits.ClickOn(ShowMoreOnlyLinktext);
		}
		catch(Exception e)
		{
		}
		String CategorySelected = WebDriverWaits.GetText(SelectedCategory);
		boolean CompareSelCategory = CategorySelected.equals("Location Not Required");
		if (!CompareSelCategory) {
			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			for (int i = 0; i < CountCategories.size(); i++) {
				WebElement AllCategories = CountCategories.get(i);
				String CategoriesText = AllCategories.getText();
				if (CategoriesText.equals("Location Not Required")) {
					AllCategories.click();
					break;
				}
			}
		}
		WebDriverWaits.ClickOn(NextButtonSec2);
		WebDriverWaits.ClickOn(ChangeLocButton);
		WebDriverWaits.ClickOn(NextButtonSec3);
		//WebDriverWaits.ClickOn(BackButton);
		Thread.sleep(5000);
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		   WebElement ele = driver.findElement(ChangeLoactionValue);
//		   jse.executeScript("arguments[0].click();", ele); 
//		//WebDriverWaits.ClickOn(ChangeLoactionValue);
		Thread.sleep(3000);
		SubmitPageTitle = WebDriverWaits.GetText(SubmitSubmissionPage);
		/*
		 * WebDriverWaits.ClickOn(LocationSearchField);
		 * WebDriverWaits.SendKeys(LocationSearchField, "Texas City Museum");
		 * Thread.sleep(3000); WebDriverWaits.ClickOn(LocationSearchResult);
		 * WebDriverWaits.ClickOn(NextButtonSec3);
		 */
	}

	public static void CSPExternal_VerifyMandatoryFieldsForNonAnonymous() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyMandatoryFieldsForNonAnonymous ");
		extentTest.setDescription(
				" Verify that validation messages appear under 'First Name' & 'Last Name' fields, when 'Post anonymously' checkbox is unchecked, on 'Report an issue' page. ");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(SubmitButton);
		ValidMsgFirstName = WebDriverWaits.GetText(FirstNameValidation);
		ExpectedMsgName1 = "The First Name is required.";
		ValidMsgLastName = WebDriverWaits.GetText(LastNameValidation);
		ExpectedMsgName2 = "The Last Name is required.";
		String Text21Chars = RandomStrings.RequiredCharacters(21);
		WebDriverWaits.SendKeys(FirstNameField, Text21Chars);
		WebDriverWaits.WaitUntilVisibleWE(FirstNameField).clear();
		WebDriverWaits.SendKeys(LastNameField, Text21Chars);
		WebDriverWaits.WaitUntilVisibleWE(LastNameField).clear();
		WebDriverWaits.ClickOn(SubmitButton);
		LimitMsgFirstName = WebDriverWaits.GetText(FirstNameValidation);
		LimitMsgLastName = WebDriverWaits.GetText(LastNameValidation);
		CharLimitValidation = "20 character limit.";
	}

	public static void CSPExternal_VerifyEmailFieldPreference() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyEmailFieldPreference ");
		extentTest.setDescription(
				" Verify that validation message appears under 'Email' field, when 'I want to receive updates on my submission' checkbox is checked, on 'Report an issue' page. ");
		Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(EmailPreferenceButton);
		WebDriverWaits.ClickOn(EmailPreferenceButton);
		WebDriverWaits.ClickOn(SubmitButton);
		EmailValidationMessage = WebDriverWaits.GetText(EmailValidationMsg);
		ExpectedEmailMsg = "Enter the details.";
		String InvalidMail = "invalid@mail";
		WebDriverWaits.SendKeys(EmailField, InvalidMail);
		WebDriverWaits.ClickOn(SubmitButton);
		Thread.sleep(2000);
		InvalidMailMsg = WebDriverWaits.GetText(EmailValidationMsg);
	   ExpectedInvalidMsg = "Email format is invalid.";
	}

	public static void CSPExternal_VerifyAnonymousSubmission() throws InterruptedException {
		extentTest = extent.startTest(" CSPExternal_VerifyAnonymousSubmission ");
		extentTest.setDescription(
				" Verify that user is able to Submit the issue Anonymously, on 'Report an issue' page. ");
		WebDriverWaits.ScrollIntoView(YesButton);
		WebDriverWaits.ClickOn(YesButton);
		WebDriverWaits.ClickOn(SubmitButton);
		SubmissionSuccessMsg = WebDriverWaits.GetText(SuccessMessage);
		ExpectedSuccessMsg = "Issue submitted successfully";
	}

	public static void CSPExternal_VerifyNonAnonymousSubmission() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" CSPExternal_VerifyNonAnonymousSubmission ");
		extentTest.setDescription(
				" Verify that user is able to submit the issue after entering the Contact details, on 'Report an issue' page. ");
//		String CRMURL = driver.getCurrentUrl();
//		Robot robot = new Robot();
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_T);
//		Thread.sleep(9000);
//		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window((String) tabs.get(1));
//		Thread.sleep(1000);
//		driver.navigate().to(CRMURL);
		driver.navigate().refresh();
		Thread.sleep(7000);
		driver.navigate().to("https://admin-stage.comcate.com/agencies");
		Thread.sleep(4000);
		//CRMCommonMethods.CRM_CreateExternalSubmission("Yes","Location Not Required","No","Yes");
		CRMCommonMethods.CRM_CreateExternalSubmissionWithoutLogin("Yes","Location Not Required","No","Yes");
		SubmissionSuccessMsgNA = WebDriverWaits.GetText(SuccessMessage);
	}

}