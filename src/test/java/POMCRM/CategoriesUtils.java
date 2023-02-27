package POMCRM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import junit.framework.Assert;

public class CategoriesUtils extends CreateCRMUserUtils {

	public static String categoriesTab = "//div[@class='tab-name tab-name--active']";
	public static String otherDefaultCategory = "//div[@class='sortable-table__body__td' and text()='Other']";
	public static String editDefaultLink = "//a[text()='Edit Default']";
	public static String resolutionTimePopup = "//div[@class='modal-header']";
	public static String resolutionTimeField = "//input[@name='resolveByDays']";
	public static String saveButton = "//button[text()='Save']";
	public static String cancelButton = "//button[text()='Cancel']";
	public static String defaultResolutionTime = "//span[@class='default-resolve-by-days']";
	public static String editCategoryIcon = "//button[@class='edit-btn space-right btn btn-primary']";
	public static String editOtherPopup = "//div[@class='full-page-modal__header']/h1";
	public static String validationMsgResolutionTime = "//span[@class='field__error']";
	public static String createCategoryButton = "//button[text()='Create Category']";
	public static String createACategoryPopup = "//div[@class='full-page-modal__header']/h1";
	public static String resolutionTime = "//span[@class='default-resolve-by-days']";
	public static String createCategoryPopupBtn = "//div[@class='full-page-modal__header']//following::button[text()='Create Category']";
	public static String validationMsgNameField = "(//span[@class='field__error'])[1]";
	public static String resolutionTimeOnCategoryPopup = "//input[@name='resolveByDays']";
	public static String keywordsField = "//input[@name='tags-input']";
	public static String addedKeywords = "//div[@class='chip__body']";
	public static String deleteIconKeyword = "//button[@class='chip__close-button']";
	public static String addFieldLink = "//a[text()='Add Field']";
	public static String addedFields = "//div[@class='category-modal__custom-fields']//li";
	public static String labelValidationMsg = "//div[@class='category-modal__custom-field']//span";
	public static String labelField = "//input[@name='label']";
	public static String dropdownLinkEmail = "//span[@class='dropdown__arrow']";
	public static String emailTemplatesOptions = "//div[@id='templateIds']//label";
	public static String templatesCancelButton = "//div[@class='flex-row--center dropdown__actions']/button[1]";
	public static String templatesSaveButton = "//div[@class='flex-row--center dropdown__actions']/button[2]";
	public static String labelSelect = "//div[@class='dropdown__selector__selected']/label";
	public static String selectedTemplates = "//div[@class='dropdown__selector__selected']/label";
	public static String nameField = "//input[@name='name']";
	public static String categoriesCountHeader = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String addedCategories = "//li[@class='sortable__element']";
	public static String notificationMsg = "//div[@class='notification-message']";
	public static String editCategoryIcon2 = "(//button[@class='edit-btn space-right btn btn-primary'])[2]";
	public static String inactiveToggle = "//button[text()='Inactive']";
	public static String inactiveCategoriesCount = "(//div[@class='agency-setup-tab__section__header']/h2)[2]";
	public static String inactiveAddedCategories = "//div[@class='rt-tr-group']";
	public static String actualCategoriesCount = "//div[@class='sortable-table__body__tr']";
	public static String locationRequiredCheckbox = "//label[text()='Location Required']";
	public static String noLocationToggle = "//button[text()='No']";

	public static By CategoriesTab = By.xpath(CategoriesUtils.categoriesTab);
	public static By OtherDefaultCategory = By.xpath(CategoriesUtils.otherDefaultCategory);
	public static By EditDefaultLink = By.xpath(CategoriesUtils.editDefaultLink);
	public static By ResolutionTimePopup = By.xpath(CategoriesUtils.resolutionTimePopup);
	public static By ResolutionTimeField = By.xpath(CategoriesUtils.resolutionTimeField);
	public static By SaveButton = By.xpath(CategoriesUtils.saveButton);
	public static By CancelButton = By.xpath(CategoriesUtils.cancelButton);
	public static By DefaultResolutionTime = By.xpath(CategoriesUtils.defaultResolutionTime);
	public static By EditCategoryIcon = By.xpath(CategoriesUtils.editCategoryIcon);
	public static By EditOtherPopup = By.xpath(CategoriesUtils.editOtherPopup);
	public static By ValidationMsgResolutionTime = By.xpath(CategoriesUtils.validationMsgResolutionTime);
	public static By ResolutionTime = By.xpath(CategoriesUtils.resolutionTime);
	public static By CreateCategoryButton = By.xpath(CategoriesUtils.createCategoryButton);
	public static By CreateACategoryPopup = By.xpath(CategoriesUtils.createACategoryPopup);
	public static By CreateCategoryPopupBtn = By.xpath(CategoriesUtils.createCategoryPopupBtn);
	public static By ValidationMsgNameField = By.xpath(CategoriesUtils.validationMsgNameField);
	public static By ResolutionTimeOnCategoryPopup = By.xpath(CategoriesUtils.resolutionTimeOnCategoryPopup);
	public static By KeywordsField = By.xpath(CategoriesUtils.keywordsField);
	public static By AddedKeywords = By.xpath(CategoriesUtils.addedKeywords);
	public static By DeleteIconKeyword = By.xpath(CategoriesUtils.deleteIconKeyword);
	public static By AddFieldLink = By.xpath(CategoriesUtils.addFieldLink);
	public static By AddedFields = By.xpath(CategoriesUtils.addedFields);
	public static By LabelValidationMsg = By.xpath(CategoriesUtils.labelValidationMsg);
	public static By LabelField = By.xpath(CategoriesUtils.labelField);
	public static By DropdownLinkEmail = By.xpath(CategoriesUtils.dropdownLinkEmail);
	public static By EmailTemplatesOptions = By.xpath(CategoriesUtils.emailTemplatesOptions);
	public static By TemplatesCancelButton = By.xpath(CategoriesUtils.templatesCancelButton);
	public static By TemplatesSaveButton = By.xpath(CategoriesUtils.templatesSaveButton);
	public static By LabelSelect = By.xpath(CategoriesUtils.labelSelect);
	public static By SelectedTemplates = By.xpath(CategoriesUtils.selectedTemplates);
	public static By NameField = By.xpath(CategoriesUtils.nameField);
	public static By CategoriesCountHeader = By.xpath(CategoriesUtils.categoriesCountHeader);
	public static By AddedCategories = By.xpath(CategoriesUtils.addedCategories);
	public static By NotificationMsg = By.xpath(CategoriesUtils.notificationMsg);
	public static By EditCategoryIcon2 = By.xpath(CategoriesUtils.editCategoryIcon2);
	public static By InactiveToggle = By.xpath(CategoriesUtils.inactiveToggle);
	public static By InactiveCategoriesCount = By.xpath(CategoriesUtils.inactiveCategoriesCount);
	public static By ActualCategoriesCount = By.xpath(CategoriesUtils.actualCategoriesCount);
	public static By LocationRequiredCheckbox = By.xpath(CategoriesUtils.locationRequiredCheckbox);
	public static By NoLocationToggle = By.xpath(CategoriesUtils.noLocationToggle);

	public static String RandomCategoryname = null;
	public static String NewResoTime;
	public static int CategoriesCountBefore;
	public static String TabTitle;
	public static String OtherTabTitle;
	public static String EditOtherPopupTitle;
	public static String EditResolutionPopupTitle;
	public static String ResolutionTimeValidationMsg;
	public static String[] ResoTextAfter;
	public static String CreateCategoryPopupTitle;
	public static String NameFieldValidationMsg;
	public static String ResoTimeOnPopup;
	public static int KeywordsSizeBefore;
	public static int KeywordsSizeAfter;
	public static int FieldsCount;
	public static String LabelFieldValidationMsg;
	public static String LabelText;
	public static String CheckedTemplate;
	public static String SelectedTemplate;
	public static int CategoriesCountAfter1;
	public static int CategoriesCountAfter2;
	public static int CategoriesCountAfter3;
	public static String NotificationText;
	public static int InactiveCountAfter;
	public static int InactiveCountBefore;
	public static int CategoriesCountHeader1;
	public static int CountCategoriesActual;

	public static void Categories_PreRequisite() throws InterruptedException {
		//WebDriverWaits.closetabs();
		driver.navigate().to(DataInterface.URLCategories);
		Thread.sleep(4000);
		TabTitle = WebDriverWaits.GetText(CategoriesTab);
	}

	public static void Categories_VerifyDefaultCategory() throws InterruptedException {
		Thread.sleep(1000);
		OtherTabTitle = WebDriverWaits.GetText(OtherDefaultCategory);
		WebDriverWaits.ClickOn(EditCategoryIcon);
		Thread.sleep(2000);
		EditOtherPopupTitle = WebDriverWaits.GetText(EditOtherPopup);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CancelButton);
	}

	public static void Categories_UpdateDefaultResolutionTime() throws InterruptedException {
		Thread.sleep(4000);
		String[] ResoTextBefore = WebDriverWaits.GetText(ResolutionTime).split(" ");
		int ResoTimeBefore = Integer.parseInt(ResoTextBefore[0]);
		System.out.println(ResoTimeBefore);
		WebDriverWaits.ClickOn(EditDefaultLink);
		Thread.sleep(1000);
		EditResolutionPopupTitle = WebDriverWaits.GetText(ResolutionTimePopup);
		WebElement ResolutionField = WebDriverWaits.WaitUntilVisibleWE(ResolutionTimeField);
		Thread.sleep(2000);
		ResolutionField.clear();
		Thread.sleep(1000);
//		String FetchResoValue = ResolutionField.getAttribute("value");
//		
//		System.out.println("Value is "+FetchResoValue);
////		Thread.sleep(2000);
////		for (int i=0; i<=3; i++) {
////		ResolutionField.sendKeys(Keys.BACK_SPACE);
////		}
//		Thread.sleep(5000);
//		//WebDriverWaits.ClickOn(ResolutionTimeField);	
//		Thread.sleep(2000);
//		WebDriverWaits.ClickOn(SaveButton);
//		Thread.sleep(2000);
//		ResolutionTimeValidationMsg = WebDriverWaits.GetText(ValidationMsgResolutionTime);
//		System.out.println(ResolutionTimeValidationMsg);
		NewResoTime = Integer.toString(ResoTimeBefore + 1);
		Thread.sleep(5000);
		ResolutionField.sendKeys(NewResoTime);
		System.out.println(NewResoTime);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(2000);
		ResoTextAfter = WebDriverWaits.GetText(ResolutionTime).split(" ");
	}

	public static void Categories_OpenCreateACategoryPopup() throws InterruptedException {
		String[] HeaderCount = WebDriverWaits.GetText(CategoriesCountHeader).split(" ");
		CategoriesCountBefore = Integer.parseInt(HeaderCount[0]);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CreateCategoryButton);
		Thread.sleep(2000);
		CreateCategoryPopupTitle = WebDriverWaits.GetText(CreateACategoryPopup);
		WebDriverWaits.ClickOn(CreateCategoryPopupBtn);
	}

	public static void Categories_VerifyResolutionTimeOnCreateCategoryPopup() throws InterruptedException {
		ResoTimeOnPopup = driver.findElement(ResolutionTimeOnCategoryPopup).getAttribute("value");
		System.out.println(ResoTimeOnPopup);
	}

	public static void Categories_AddKeywordsAndCustomFields() throws InterruptedException {
		Thread.sleep(3000);
		WebElement AddKeywordsField = WebDriverWaits.WaitUntilVisibleWE(KeywordsField);
		for (int i = 0; i < 10; i++) {
			String RandomKeyword = RandomStrings.RequiredCharacters(4);
			AddKeywordsField.sendKeys(RandomKeyword);
			AddKeywordsField.sendKeys(Keys.SPACE);
		}
		Thread.sleep(2000);
		List<WebElement> KeywordsAdded = driver.findElements(AddedKeywords);
		KeywordsSizeBefore = KeywordsAdded.size();
		for (int i = 0; i < 7; i++) {
			WebDriverWaits.ClickOn(DeleteIconKeyword);
		}
		Thread.sleep(2000);
		List<WebElement> KeywordsAfterDeletion = driver.findElements(AddedKeywords);
		KeywordsSizeAfter = KeywordsAfterDeletion.size();
		WebDriverWaits.ClickOn(AddFieldLink);
		List<WebElement> FieldsAdded = driver.findElements(AddedFields);
		FieldsCount = FieldsAdded.size();
		WebDriverWaits.ClickOn(CreateCategoryPopupBtn);
		LabelFieldValidationMsg = WebDriverWaits.GetText(LabelValidationMsg);
		WebDriverWaits.SendKeys(LabelField, "TextLabel");
	}

	public static void Categories_VerifyLinkedEmailTemplates() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(DropdownLinkEmail);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(EmailTemplatesOptions);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(TemplatesCancelButton);
		Thread.sleep(2000);
		LabelText = WebDriverWaits.GetText(LabelSelect);
		System.out.println(LabelText);
		WebDriverWaits.ClickOn(DropdownLinkEmail);
		WebDriverWaits.ClickOn(EmailTemplatesOptions);
		Thread.sleep(2000);
		CheckedTemplate = WebDriverWaits.GetText(EmailTemplatesOptions);
		System.out.println(CheckedTemplate);
		WebDriverWaits.ClickOn(TemplatesSaveButton);
		Thread.sleep(2000);
		SelectedTemplate = WebDriverWaits.GetText(SelectedTemplates);
		System.out.println(SelectedTemplate);
	}

	public static void Categories_VerifyCategoryCreation() throws InterruptedException {
		String RandomCN = RandomStrings.RequiredCharacters(5);
		RandomCategoryname = "Category " + RandomCN;
		WebDriverWaits.SendKeys(NameField, RandomCategoryname);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CreateCategoryPopupBtn);
		Thread.sleep(6000);
		String[] HeaderCount = WebDriverWaits.GetText(CategoriesCountHeader).split(" ");
		CategoriesCountAfter1 = Integer.parseInt(HeaderCount[0]);
	}

	public static void Categories_VerifyNoCategoryCreationOnCancel() throws InterruptedException {
		WebDriverWaits.ClickOn(CreateCategoryButton);
		String RandomCategoryname = RandomStrings.RequiredCharacters(5);
		WebDriverWaits.SendKeys(NameField, "Category " + RandomCategoryname);
		WebDriverWaits.ClickOn(DropdownLinkEmail);
		WebDriverWaits.ClickOn(EmailTemplatesOptions);
		WebDriverWaits.ClickOn(TemplatesSaveButton);
		WebDriverWaits.ClickOn(CancelButton);
		Thread.sleep(6000);
		String[] HeaderCount = WebDriverWaits.GetText(CategoriesCountHeader).split(" ");
		CategoriesCountAfter2 = Integer.parseInt(HeaderCount[0]);
	}

	public static void Categories_CantCreateCategoryWithExistingName() throws InterruptedException {
		WebDriverWaits.ClickOn(CreateCategoryButton);
		WebDriverWaits.SendKeys(NameField, RandomCategoryname);
		WebDriverWaits.ClickOn(CreateCategoryPopupBtn);
		Thread.sleep(1000);
		NotificationText = WebDriverWaits.GetText(NotificationMsg);
		WebDriverWaits.ClickOn(CancelButton);
	}

	public static void Categories_VerifyUpdatedCategory() throws InterruptedException {
		Thread.sleep(6000);
		String[] InactiveCountHeader = WebDriverWaits.GetText(InactiveCategoriesCount).split(" ");
		InactiveCountBefore = Integer.parseInt(InactiveCountHeader[0]);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(EditCategoryIcon2);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(InactiveToggle);
		WebElement NameFld = WebDriverWaits.WaitUntilVisibleWE(NameField);
		NameFld.clear();
		NameFld.sendKeys("Edited " + RandomCategoryname);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(6000);
		String[] ActiveHeaderCount = WebDriverWaits.GetText(CategoriesCountHeader).split(" ");
		CategoriesCountAfter3 = Integer.parseInt(ActiveHeaderCount[0]);
		Thread.sleep(2000);
		String[] InactiveHeaderCount = WebDriverWaits.GetText(InactiveCategoriesCount).split(" ");
		InactiveCountAfter = Integer.parseInt(InactiveHeaderCount[0]);
	}

	public static void Categories_VerifyAccurateCount() throws InterruptedException {
		String[] HeaderCount = WebDriverWaits.GetText(CategoriesCountHeader).split(" ");
		CategoriesCountHeader1 = Integer.parseInt(HeaderCount[0]);
		List<WebElement> ActualCountCategories = driver.findElements(ActualCategoriesCount);
		CountCategoriesActual = ActualCountCategories.size();
	}
}
