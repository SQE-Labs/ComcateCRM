package CommonMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;
import POMCRM.CSDPUtils;
import POMCRM.CSPExternalUtils;
import TestCasesCRM.CSPInternal;
import TestCasesCRM.Categories;

public class CRMCommonMethods {

	public static void CRM_CreateSubmission(String Anonymous, String Customer, String Tags, String Location,
			String Attachment, String CategoryName) throws InterruptedException {
		BrowsersInvoked.driver.navigate().to(DataInterface.URLCreateCustomerSubmission);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(CSPInternal.CategoryDropdown);
		
//		WebDriverWaits.SendKeys(CSPInternal.SearchCategory, Categories.RandomCategoryname);
		
		WebDriverWaits.SendKeys(CSPInternal.SearchCategory, CategoryName);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CSPInternal.SearchResultsCategory);
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(CSPInternal.IssueDescriptionField, RandomDescription);
		Thread.sleep(2000);
		if (Anonymous == "Yes") {
			JavascriptExecutor jser = (JavascriptExecutor) BrowsersInvoked.driver;
			WebElement PostAnonymouslyCheckbox = (WebElement) jser
					.executeScript("return document.querySelector('div > div:nth-child(2) > span > input')");
			PostAnonymouslyCheckbox.click();
			Thread.sleep(2000);
		}
		if (Customer == "Yes") {
			WebDriverWaits.SendKeys(CSPInternal.AddExistingCustomerField, "a");
			Thread.sleep(4000);
			WebDriverWaits.ClickOn(CSPInternal.ContactSearchResults);
			 if(WebDriverWaits.GetValueAttribute(WorkPhoneField).isEmpty())
		         WebDriverWaits.SendKeys(CSPInternal.WorkPhoneField, "12322332322");
		      
		}
		if (Tags == "Yes") {
			for (int i = 0; i < 5; i++) {
				String RandomTags = RandomStrings.RequiredString(4);
				WebDriverWaits.SendKeys(CSPInternal.TagsField, RandomTags + ",");
			}
		}
		if (Location == "Yes") {
			WebDriverWaits.SendKeys(CSPInternal.LocationField, "Texas ");
			WebDriverWaits.WaitUntilVisible(CSPInternal.LocationSearchResult);
			WebDriverWaits.SendKeys(CSPInternal.LocationField, "City Museum");
			Thread.sleep(3000);
			WebDriverWaits.WaitUntilVisible(CSPInternal.LocationSearchResult);
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CSPInternal.LocationSearchResult);
			Thread.sleep(4000);
		}
		if (Attachment == "Yes") {
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CSPInternal.AttachmentIcon);
			Thread.sleep(2000);
			WebElement UploadFile3 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CSPInternal.AddButton);
			Thread.sleep(3000);
		}
		
		WebDriverWaits.ClickOn(CSPInternal.CreateSubmissionButton);
		Thread.sleep(2000);
		List<WebElement> DuplicateSubsPopup = BrowsersInvoked.driver
				.findElements(CSDPUtils.PossibleDuplicateSubmissionsPopup);
		if (DuplicateSubsPopup.size() == 1) {
			WebDriverWaits.ClickOn(CSDPUtils.SubmitAnywayButton);
		}
		Thread.sleep(5000);
	}

	public static void CRM_CreateCategory(String Checkbox, String IncludeLoc, String Keywords, String CategoryName)
			throws InterruptedException {
		// Location Required YY, Location Not Included NN, Location Not Required NY
		BrowsersInvoked.driver.navigate().to(DataInterface.URLCategories);
		;
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(Categories.CreateCategoryButton);
		if (Checkbox == "Yes") {
			WebDriverWaits.ClickOn(Categories.LocationRequiredCheckbox);
		}
		if (IncludeLoc == "No") {
			WebDriverWaits.ClickOn(Categories.NoLocationToggle);
		}
		if (Keywords == "Yes") {
			WebElement AddKeywordsField = WebDriverWaits.WaitUntilVisibleWE(Categories.KeywordsField);
			for (int i = 0; i < 10; i++) {
				String RandomKeyword = RandomStrings.RequiredCharacters(4);
				AddKeywordsField.sendKeys(RandomKeyword);
				AddKeywordsField.sendKeys(Keys.SPACE);
			}
		}
		WebDriverWaits.SendKeys(Categories.NameField, CategoryName);
		WebDriverWaits.ClickOn(Categories.CreateCategoryPopupBtn);
		List<WebElement> ExistsOrNot = BrowsersInvoked.driver.findElements(Categories.NotificationMsg);
		if (ExistsOrNot.size() == 1) {
			WebDriverWaits.ClickOn(Categories.CancelButton);
		}
		Thread.sleep(3000);
	}

	public static void CRM_CreateExternalSubmission(String Attachment, String Category, String Anonymous,
			String Contact) throws InterruptedException {
		CSPExternalUtils.CSPExternal_PreRequisite_OpenReportAnIssuePage();
		String RandomDescription = RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(CSPExternalUtils.IssueDescriptionField, RandomDescription);
		if (Attachment == "Yes") {
			Thread.sleep(2000);
			WebElement UploadFile = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");
			Thread.sleep(2000);
		}
		if (Category == "Location Not Included") {
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Included");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Included")) {
						AllCategories.click();
						break;
					}
				}
			}
		} else if (Category == "Location Required") {
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Required")) {
						AllCategories.click();
						break;
					}
				}
			}
			WebDriverWaits.ClickOn(CSPExternalUtils.LocationSearchField);
			WebDriverWaits.SendKeys(CSPExternalUtils.LocationSearchField, "Texas City Museum");
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CSPExternalUtils.LocationSearchResult);
		} else if (Category == "Location Not Required") {
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Required")) {
						AllCategories.click();
						break;
					}
				}
			}
		}
		WebDriverWaits.ClickOn(CSPExternalUtils.NextButtonSec2);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CSPExternalUtils.NextButtonSec3);

		if (Anonymous == "Yes") {
			WebDriverWaits.ClickOn(CSPExternalUtils.YesButton);
			WebDriverWaits.ClickOn(CSPExternalUtils.SubmitButton);
		}

		if (Contact == "Yes") {
			WebDriverWaits.ClickOn(CSPExternalUtils.EmailPreferenceButton);
			WebDriverWaits.ClickOn(CSPExternalUtils.TextMsgPreferenceButton);
			String RandomFirstName = RandomStrings.RequiredCharacters(6);
			String RandomLastName = RandomStrings.RequiredCharacters(6);
			WebDriverWaits.SendKeys(CSPExternalUtils.FirstNameField, RandomFirstName);
			WebDriverWaits.SendKeys(CSPExternalUtils.LastNameField, RandomLastName);
			WebDriverWaits.SendKeys(CSPExternalUtils.EmailField, "automationcomcate@gmail.com");
			WebDriverWaits.SendKeys(CSPExternalUtils.MobileNumberField, "+12057547399");
		}
		WebDriverWaits.ClickOn(CSPExternalUtils.SubmitButton);
		Thread.sleep(2000);
	}
	
	
	
	public static void CRM_CreateExternalSubmissionWithoutLogin(String Attachment, String Category, String Anonymous,
			String Contact) throws InterruptedException {
		CSPExternalUtils.CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin();
		String RandomDescription = RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(CSPExternalUtils.IssueDescriptionField, RandomDescription);
		if (Attachment == "Yes") {
			Thread.sleep(2000);
			WebElement UploadFile = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");
			Thread.sleep(2000);
		}
		
		WebDriverWaits.ClickOn(CSPExternalUtils.NextButton);
		
		if (Category == "Location Not Included") {
			
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Included");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Included")) {
						AllCategories.click();
						break;
					}
				}
			}
		} else if (Category == "Location Required") {
			//WebDriverWaits.ClickOn(CSPExternalUtils.NextButton);
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Required")) {
						AllCategories.click();
						break;
					}
				}
			}
			WebDriverWaits.ClickOn(CSPExternalUtils.LocationSearchField);
			WebDriverWaits.SendKeys(CSPExternalUtils.LocationSearchField, "Texas City Museum");
			Thread.sleep(3000);
			WebDriverWaits.ClickOn(CSPExternalUtils.LocationSearchResult);
		} else if (Category == "Location Not Required") {
			//WebDriverWaits.ClickOn(CSPExternalUtils.NextButton);
			String CategorySelected = WebDriverWaits.GetText(CSPExternalUtils.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = BrowsersInvoked.driver
						.findElements(CSPExternalUtils.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Required")) {
						AllCategories.click();
						break;
					}
				}
			}
		}
		WebDriverWaits.ClickOn(CSPExternalUtils.NextButtonSec2);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CSPExternalUtils.NextButtonSec3);

		if (Anonymous == "Yes") {
			WebDriverWaits.ClickOn(CSPExternalUtils.YesButton);
			WebDriverWaits.ClickOn(CSPExternalUtils.SubmitButton);
		}

		if (Contact == "Yes") {
			WebDriverWaits.ScrollIntoView(CSPExternalUtils.EmailPreferenceButton);
			WebDriverWaits.ClickOn(CSPExternalUtils.EmailPreferenceButton);
			Thread.sleep(2000);
			//WebDriverWaits.ClickOn(CSPExternalUtils.TextMsgPreferenceButton);
			String RandomFirstName = RandomStrings.RequiredCharacters(6);
			String RandomLastName = RandomStrings.RequiredCharacters(6);
			WebDriverWaits.SendKeys(CSPExternalUtils.FirstNameField, RandomFirstName);
			WebDriverWaits.SendKeys(CSPExternalUtils.LastNameField, RandomLastName);
			WebDriverWaits.SendKeys(CSPExternalUtils.EmailField, "automationcomcate@gmail.com");
			WebDriverWaits.SendKeys(CSPExternalUtils.MobileNumberField, "+12057547399");
		}
		WebDriverWaits.ClickOn(CSPExternalUtils.SubmitButton);
		Thread.sleep(2000);
	}
	
	
	

	public static By LocationSearchField = By.xpath("//div[@class='location-tile__inputs-container']//input");
	public static By LocationSearchResult = By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']");
	public static By CCPOption = By.xpath("//label[text()='Code Enforcement Case']");
	public static By CustomIssueIcon = By.xpath("(//div/i[@class='react-autosuggest__add-icon'])[2]");
	public static By ViolationSearchBox = By.xpath("//div[@id='violation-tile']//input");
	public static By ViolationsList = By.xpath("//div[@class='react-autosuggest__suggestion-element']/div");
	public static By AddContactField = By.xpath("//div[@class='contact-tile tile']//input");
	public static By CreateNewContact = By
			.xpath("//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']");
	public static By NameField = By.xpath("//input[@name='name']");
	public static By EmailField = By.xpath("//input[@name='email']");
	public static By WorkPhoneField = By.xpath("//input[@name='workPhone']");
	public static By CreateContactBtn = By.xpath("(//div[@class='full-page-modal__header']//button[2])[2]");
	public static By PropertyOwnerOption = By.xpath("//span/label[text()='Property Owner']");
	public static By ApplyButton = By.xpath("//button[text()='Apply']");
	public static By AddButton = By.xpath("//div[@class='attachments-modal__footer']/button[2]");
	public static By CreateCaseButton = By.xpath("//div/button[text()='Create Case']");
	public static By CreateScheduleInspectionButton = By.xpath("//div[@class='modal-footer']//button[2]");
	public static By CloseCDPIcon = By.xpath("//div[@class='case-details__close-icon']");
	public static By AnimalColourField = By.xpath("//input[@name='Animal Colour']");
	public static By AddanotherAnimalLinkText = By.xpath("//a[text()='Add another Animal']");
	public static By AddButtonViolation = By.xpath("//button[text()='Add']");
	public static By YesBtnConfirmationPopup = By.xpath("//div[@class='flex-row--center']/button[text()='Yes']");
	public static By FooterButton = By.xpath("//div[@class='footer_actions']/button");
	public static By InvalidVioToggle = By.xpath("//div[@class='multi-choice-buttons']/button[text()='Invalid']");
	public static By PerformInsButton = By.xpath("//button[text()='Perform Inspection']");
//	public static By  = By.xpath("");

	public static void CE_CreateACase() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jser = (JavascriptExecutor) BrowsersInvoked.driver;
		WebElement CCPBtnJSE = (WebElement) jser.executeScript(
				"return document.querySelector('#header > div.app-header__right > div:nth-child(2) > div.app-header__new')");
		Thread.sleep(10000);
		WebDriverWaits.ClickOnWE20(CCPBtnJSE);
		WebDriverWaits.ClickOn(CCPOption);
		Thread.sleep(10000);
		CE_AddLocation();
		CE_AddViolation();
		CE_AddContact();
//		CE_AddAttachment();
		WebDriverWaits.ClickOn(CreateCaseButton);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CreateScheduleInspectionButton);
		Thread.sleep(10000);
	}

	public static void CE_AddAttachment() throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) BrowsersInvoked.driver;
		Thread.sleep(2000);
		WebElement AttachmentIcon = (WebElement) jser
				.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
		Thread.sleep(6000);
		AttachmentIcon.click();
		Thread.sleep(2000);
		WebElement UploadFile4 = BrowsersInvoked.driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile4.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(AddButton);
		Thread.sleep(2000);
	}

	public static void CE_AddLocation() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.SendKeys(LocationSearchField, "Texas ");
		WebDriverWaits.WaitUntilVisible(LocationSearchResult);
		WebDriverWaits.SendKeys(LocationSearchField, "City Museum");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(LocationSearchResult);
		Thread.sleep(2000);
	}

	public static void CE_AddViolation() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ViolationSearchBox);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(ViolationSearchBox, "Wa");
//		WebDriverWaits.SendKeys(ViolationSearchBox, "Gen");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ViolationsList);
	}

	public static void CE_AddContact() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(AddContactField);
		WebDriverWaits.ClickOn(CreateNewContact);
		String RandomName = RandomStrings.RequiredCharacters(8);
		String RandomMail = RandomName + "@yopmail.com";
		String RandomContact = RandomStrings.RequiredDigits(10);
		WebDriverWaits.SendKeys(NameField, RandomName);
		WebDriverWaits.SendKeys(EmailField, RandomMail);
		WebDriverWaits.SendKeys(WorkPhoneField, RandomContact);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateContactBtn);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(PropertyOwnerOption);
		WebDriverWaits.ClickOn(ApplyButton);
		Thread.sleep(2000);
	}

	public static void CE_CloseCaseOnCDP() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(PerformInsButton);
		WebDriverWaits.ClickOn(InvalidVioToggle);
		WebDriverWaits.ClickOn(FooterButton);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(YesBtnConfirmationPopup);
		Thread.sleep(7000);
	}

}