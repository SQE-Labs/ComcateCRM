package POMNewAgencySetup;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;
import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCRM.CSPInternalUtils;
import POMCRM.CreateCRMUserUtils;
import POMCRM.DashboardCRMUtils;
import POMCRM.SubmissionSettingsUtils;
import net.bytebuddy.utility.RandomString;

public class AppPreRequisitesUtils extends AgencyCreationUtils {

	public static By AppMenuIcon = By.xpath("//div[@class='app-header__menu__icon']");
	public static By AgencySetupIcon = By
			.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']");
	public static By AgencySetUpIconLbl = By.xpath("//label[text()='Agency Setup']//preceding-sibling::a");
	public static By LocationManagementTab = By.xpath("//label[text()='Location Management']");
	public static By LocationandMapsTab = By.xpath("//label[text()='Location and Maps']");
	public static By LCFTab = By.xpath("//div[text()='Location Custom Fields']");
	public static By CreateCustomFieldButton = By.xpath("//button[text()='Create Custom Field']");
	public static By OpenedPopupsTitle = By.xpath("//div[@class='modal-header']");
	public static By NameFieldLCF = By.xpath("//input[@name='label']");
	public static By TypeDropdownField = By.xpath("//div[@class='Select-placeholder']");
	public static By CreateCustomFieldButton2 = By.xpath("//div[@class='modal-footer']//button[2]");
	public static By MapLayersTab = By.xpath("//div[text()='Map Layers']");
	public static By UploadMapLayerButton = By.xpath("//button[text()='Upload Map Layer']");
	public static By LabelField = By.xpath("//input[@name='label']");
	public static By UploadFileLink = By.xpath("//label[@for='file-upload__kml']");
	public static By UploadFileInput = By.xpath("//input[@id='file-upload__kml']");
	public static By CreateMapLayerButton = By.xpath("//button[text()='Create Map Layer']");
	public static By AgencyBoundaryTab = By.xpath("//div[text()='Agency Boundary']");
	public static By UploadKMZFileInput = By.xpath("//input[@id='file-upload__boundary']");
	public static By MapSettingsTab = By.xpath("//div[text()='Map Settings']");
	public static By SaveChangesButton = By.xpath("//button[text()='Save Changes']");
	public static By CenterLongitudeField = By.xpath("//input[@name='centerLongitude']");
	public static By CenterLatitudeField = By.xpath("//input[@name='centerLatitude']");
	public static By TextOptionForCLFType = By.xpath("//div[text()='Text']");
	public static By LCFsActiveCount = By.xpath("(//div[@class='agency-setup-tab__section__header']/h2)[1]");
	public static By MapLayerUploadFile = By.xpath("//input[@id='file-upload__kml']");
	public static By SaveButton = By.xpath("//button[text()='Save']");
	public static By UploadedFileLabel = By.xpath("//div[@class='file-upload']//b");
	public static By AgencyParcelFileInput = By.xpath("//input[@id='file-upload__layer']");
	public static By RefreshLinkText = By.xpath("//a[text()='Refresh']");
	public static By ForcedAbatementTab = By.xpath("//div[@class='tabs__names']/div[text()='Forced Abatement']");
	public static By CreateFAActivityButton = By.xpath("//button[text()='Create Forced Abatement Activity']");
	public static By LabelFieldFAA = By.xpath("//input[@name='label']");
	public static By DescriptionFieldFA = By.xpath("//textarea[@name='description']");
	public static By AddFieldLinkTextFA = By.xpath("//a[@class='fields-container__add-field']");
	public static By TypeDropdownFA = By.xpath("//div[@class='Select-value']");
	public static By CreateFAActivityButton2 = By
			.xpath("//h1[text()='Create Forced Abatement Activity']/following::button[2]");
	public static By CreatedFAALabel = By.xpath("//div[@class='sortable-table__body__td'][1]");
	public static By FieldsLabel = By.xpath("//div[@class='tile-header']/following::input[@name='label']");
	public static By ViolationsSidebarOption = By.xpath("//label[text()='Violations']");
	public static By CreateViolationButton = By.xpath("//button[text()='Create Violation']");
	public static By CreateViolationButton2 = By.xpath("(//button[text()='Create Violation'])[2]");
	public static By CreateViolationPopup = By.xpath("//h1[text()='Create Violation']");
	public static By ViolationTypeDropdown = By
			.xpath("//label[@title='Violation Type']/following::div[@class='Select-placeholder']");
	public static By CaseManagementSidebar = By.xpath("//label[text()='Case Management']");
	public static By WaterVioOption = By.xpath("//div[text()='Water']");
	public static By GeneralVioOption = By.xpath("//div[text()='General']");
	public static By VioOptionGeneral = By.xpath("//div[@aria-label='General']");
	
	public static By VioOptionAnimal = By.xpath("//div[@aria-label='Animal']");
	public static By AnimalVioOption = By.xpath("//div[text()='Animal']");
	public static By MunicipalCodeField = By.xpath("//label[text()='Municipal Code']/following::span[1]");
	public static By MunicipalCodeOption = By.xpath("//ul[@class='picklist-with-handler__picklist-section']/li");
	public static By AddedViolationsRows = By.xpath("//div[@class='sortable-table__body__tr']");
	public static By DispositionsTab = By.xpath("//div[text()='Dispositions']");
	public static By CreateInvalidDispositionButton = By.xpath("//button[text()='Create Invalid Disposition']");
	public static By CreateInvalidDispositionPopup = By.xpath("//div[text()='Create Invalid Disposition']");
	public static By CreateDispositionButton = By.xpath("//button[text()='Create Disposition']");
	public static By LabelValidation = By.xpath("//span[@class='field__error']");
	public static By InvalidDispositionsToggle = By.xpath("//button[text()='Invalid Dispositions']");
	public static By ActiveDispositionsHeader = By.xpath("//div[text()='Dispositions']/following::h2");
	public static By MunicipalCodeTab = By.xpath("//div[text()='Municipal Code']");
	public static By CreateMunicipalCodeButton = By.xpath("//button[text()='Create Municipal Code']");
	public static By CreateMunicipalCodePopup = By.xpath("//div[text()='Create Municipal Code']");
	public static By ArticleNumberField = By.xpath("//input[@name='articleNumber']");
	public static By DescriptionField = By.xpath("//textarea[@name='description']");
	public static By ResolutionActionField = By.xpath("//textarea[@name='resolutionAction']");
	public static By CreateMunicipalCodeButton2 = By.xpath("//div[@class='municipal-code-form__footer']/button[2]");
	public static By CEProdSideBar = By.xpath("//h6[text()='PRODUCT SETTINGS']/following::label[1]");
	public static By UserManagementSidebar = By.xpath("//label[text()='User Management']");
	public static By NoticesSidebar = By.xpath("//label[text()='Notices']");
	public static By ViolationsTab = By.xpath("//div[text()='Violations']");
	public static By CRMProdSideBar = By
			.xpath("//div[@class='sidebar__options-container__options flex-column--left'][2]/label");
	public static By CategoriesSideBar = By.xpath("//label[text()='Categories']");
	public static By FinesSideBar = By.xpath("//label[text()='Fines']"); 
	public static By LateFeeSubtab = By.xpath("//div[text()='Late Fees']");
	public static By SubmissionSettingsSideBar = By.xpath("//label[text()='Submission Settings']");
	public static By CodeEnforcementOption = By.xpath("//label[text()='Code Enforcement Case']");
	public static By CreateACasePopupTitle = By.xpath("//h1[text()='Create A Case']");
	public static By CancelButton = By.xpath("//button[text()='Cancel']");
    public static By AuditTrial   = By.xpath("//label[text()='Audit Trail']");
    public static By CreateFineBtn = By.xpath("//button[text()='Create Fine']");
    public static By CreateFinePopup = By.xpath("//div[@class='modal-header']");
    public static By CancelCreateFine = By.xpath("//button[text()='Cancel']");
    public static By DoNotAttachedNoticeChk = By.xpath("//label[text()='Do not associate a notice']");
    public static By CreateFinePopUpbtn = By.xpath("//div[text()='Create Fine'][@class='modal-header']//parent::div//button[text()='Create Fine']");
  
    public static By CrtFineLabelValidMsg = By.xpath("(//span[@class='field__error'])[1]");
    public static By CrtFineDefaultAmountValidMsg = By.xpath("(//span[@class='field__error'])[2]");
    public static By CrtFineNoticeRequiredValidMsg = By.xpath("(//span[@class='field__error'])[4]");
    public static By CrtFineLabelName = By.xpath("//input[@name='label']");
    public static By CrtDefaultAmnt = By.xpath("//input[@name='defaultAmount']");
    public static By ActiveFines = By.xpath("(//div[@class='agency-setup-tab__section__header']//h2)[1]");
    public static By CrtFineSelectNoitce = By.xpath("//span[text()='Select Notice']");
    public static By CrtFineCheckHtmlNotice = By.xpath("(//input[@name='associatedNoticeIds'][@type='checkbox'][not (@disabled)])[1]");
    public static By CrtFineApplyNotices = By.xpath("//button[text()='Apply']");
    public static By CreateFineGridValLable = By.xpath("(//div[@class='rt-tr-group']//div[@class='rt-td']//div)[1]");
    public static By CrtFineGridDefAmt = By.xpath("(//div[@class='rt-tr-group']//div[@class='rt-td'])[4]");
    public static By EditActiveFine = By.xpath("//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//button[@class='edit-btn space-right btn btn-primary']");
    public static By EditSavebtn = By.xpath("//button[text()='Save']");
    public static By EditInactiveFine = By.xpath("//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//button[@class='edit-btn space-right btn btn-primary']");
    public static By InactiveFinebtn = By.xpath("//button[text()='Inactive']");
    public static By ActiveFinetoogle = By.xpath("//button[text()='Active']");
    public static By InactiveFines = By.xpath("(//div[@class='agency-setup-tab__section__header']//h2)[2]");
    public static By InactiveFineGridData = By.xpath("//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-tr-group']//div[@class='rt-td']");
    public static By ActiveFineGridData = By.xpath("//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-tr-group']//div[@class='rt-td']");
    public static By CreateLateFeebtn = By.xpath("//button[text()='Create Late Fee']");
    public static By CreateLateFeePopupText = By.xpath("//div[text()='Create Late Fee']");
    public static By CreateLateFeebtnpopup = By.xpath("//div[text()='Create Late Fee']//ancestor::div//button[text()='Create Late Fee']");
    public static By CrtLateFineLabelName = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='label']");
    public static By CrtLateFineLabeldesc = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='description']");
    public static By CrtLateFeeManualToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Manual Late Fee']");
    public static By CrtLateFeeFlatToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Flat Late Fee']");
    public static By CrtLateFeeFixedAmtToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Fixed Amount']");
    public static By CrtLateFeeAmount = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='amount']");
    public static By AfterDayLateFeePayDue = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='payByDays']");
    public static By CrtLateFeeOutstdBalToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='% of outstanding balance']");
    
    
    
    //	public static By  = By.xpath("");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");

	public static String createNonHtmlNoticeBtn = "//button[text()='Create Non-HTML Notice']";
	public static String createNonHtmlNoticePopup = "//div[text()='Create Non-HTML Notice']";
	public static String labelField = "//input[@name='label']";
	public static String createNoticeBtn = "//button[text()='Create Notice']";
	public static String createHtmlNoticeBtn = "//button[text()='Create HTML Notice']";
	public static String createHtmlNoticePopup = "//h1[text()='Create HTML Notice']";
	public static String mergeFieldsLink = "//span[text()='Merge Fields']";
	public static String addMergeFieldsPopup = "//div[text()='Add Merge Fields']";
	public static String countNotices = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String categoryDropdown = "//div[@class='Select-value']";
	public static String categoryOption = "//*[text()='Case Activity']";
	public static String fieldResults = "//div/div[@class='rt-td']/a";
	public static String categoryResults = "//div[text()='Case Activity']";
	public static String doneButton = "//button[text()='Done']";
	public static String previewButton = "//button[text()='Preview']";
	public static String previewPopupBody = "//div[@class='modal-base__body']//div/p";
	public static String fADocumentToggle = "//button[text()='FA Document']";
	public static String noticesPageLink = "//label[text()='Notices']";
	public static String editIconNotice = "//button[@class='edit-btn space-right btn btn-primary']";
	public static String noticeLabelColumn = "//div[@class='sortable-table__body__td'][1]";
	public static String noticesCountHeader = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String noticesCountActual = "//div[@class='sortable-table__body__td'][1]";
	public static String linkToVioTypesField = "//span[@class='Select-placeholder placeholder']";
	public static String waterOptionToLink = "//*[text()='Water']";
	public static String appHeaderIcon = "//div[@class='app-header__menu__icon']";
	public static String agencySetupLabel = "//label[text()='Agency Setup']";
	public static By CreateNonHtmlNoticeBtn = By.xpath(AppPreRequisitesUtils.createNonHtmlNoticeBtn);
	public static By CreateNonHtmlNoticePopup = By.xpath(AppPreRequisitesUtils.createNonHtmlNoticePopup);
	public static By CreateNoticeBtn = By.xpath(AppPreRequisitesUtils.createNoticeBtn);
	public static By CreateHtmlNoticeBtn = By.xpath(AppPreRequisitesUtils.createHtmlNoticeBtn);
	public static By MergeFieldsLink = By.xpath(AppPreRequisitesUtils.mergeFieldsLink);
	public static By AddMergeFieldsPopup = By.xpath(AppPreRequisitesUtils.addMergeFieldsPopup);
	public static By CreateHtmlNoticePopup = By.xpath(AppPreRequisitesUtils.createHtmlNoticePopup);
	public static By CountNotices = By.xpath(AppPreRequisitesUtils.countNotices);
	public static By CategoryDropdown = By.xpath(AppPreRequisitesUtils.categoryDropdown);
	public static By CategoryOption = By.xpath(AppPreRequisitesUtils.categoryOption);
	public static By FieldResults = By.xpath(AppPreRequisitesUtils.fieldResults);
	public static By CategoryResults = By.xpath(AppPreRequisitesUtils.categoryResults);
	public static By DoneButton = By.xpath(AppPreRequisitesUtils.doneButton);
	public static By PreviewButton = By.xpath(AppPreRequisitesUtils.previewButton);
	public static By PreviewPopupBody = By.xpath(AppPreRequisitesUtils.previewPopupBody);
	public static By FADocumentToggle = By.xpath(AppPreRequisitesUtils.fADocumentToggle);
	public static By NoticesPageLink = By.xpath(AppPreRequisitesUtils.noticesPageLink);
	public static By EditIconNotice = By.xpath(AppPreRequisitesUtils.editIconNotice);
	public static By NoticeLabelColumn = By.xpath(AppPreRequisitesUtils.noticeLabelColumn);
	public static By NoticesCountHeader = By.xpath(AppPreRequisitesUtils.noticesCountHeader);
	public static By NoticesCountActual = By.xpath(AppPreRequisitesUtils.noticesCountActual);
	public static By LinkToVioTypesField = By.xpath(AppPreRequisitesUtils.linkToVioTypesField);
	public static By WaterOptionToLink = By.xpath(AppPreRequisitesUtils.waterOptionToLink);
	public static By AppHeaderIcon = By.xpath(AppPreRequisitesUtils.appHeaderIcon);
	public static By AgencySetupLabel = By.xpath(AppPreRequisitesUtils.agencySetupLabel);

	public static String LCFTabTitle;
	public static String CLCFPopupTitle;
	public static String ExpectedCLCFTitle;
	public static String RandomCLFName;
	public static int LCFsCountBefore;
	public static int LCFsCountAfter;
	public static boolean CompareLCFsCount;
	public static String MapLayerTabTitle;
	public static String RandomLabelName;
	public static int MapLayerCountBefore;
	public static int MapLayerCountAfter;
	public static boolean CompareMapLayersCount;
	public static String CreateMLPopupTitle;
	public static String ExpectedCreateMLTitle;
	public static String ActualBoundaryFile;
	public static String ExpectedBoundaryFile;
	public static String BoundaryTabTitle;
	public static String ActualAPZipFile;
	public static String ExpectedAPZipFile;
	public static String MapSettingsTabTitle;
	public static String AddedFAActivity;
	public static String CreateViolationTitle;
	public static boolean CheckVio1;
	public static boolean CheckVio2;
	public static String DispositionsPopupTitle;
	public static String LabelValidationMsg;
	public static String[] DispositionsHeader;
	public static int DispositionsHeaderCount;
	public static String ExpectedDispositionsPopupTitle;
	public static String ExpDispositionLabelValidationMsg;
	public static boolean CheckDispositionCount;
	public static String CreateMunicipalCodePopupTitle;
	public static int CurrentNoticesCount;
	public static boolean CompareCountNonHTML;
	public static boolean CompareCountHTML;
	public static boolean CompareCountFADoc;
	public static String GetCRMTrace;
	public static boolean ToggleButtonState1;
	public static boolean ToggleButtonState2;
	public static boolean CCPStatus;
//	public static String ;
//	public static String ;
//	public static String ;
//	public static String ;
//	public static String ;

	public static void AgencySetup_VerifyAppConfigurations(String agencyName) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(SearchAgency).clear();
		WebDriverWaits.SendKeys(SearchAgency, agencyName);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(EnterAgencyIcon);
		Thread.sleep(10000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(1000);
		GetCRMTrace = WebDriverWaits.GetText(DashboardCRMUtils.CRMToggle);
	}

	public static void AgencySetup_VerifyCreationOfLCFs() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(AppMenuIcon);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(AgencySetupIcon);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(LocationManagementTab);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(LocationandMapsTab);
		Thread.sleep(10000);
		LCFTabTitle = WebDriverWaits.GetText(LCFTab);
		String LCFCountAtHeader[] = WebDriverWaits.GetText(LCFsActiveCount).split(" ");
		LCFsCountBefore = Integer.parseInt(LCFCountAtHeader[0]);
		WebDriverWaits.ClickOn(CreateCustomFieldButton);
		CLCFPopupTitle = WebDriverWaits.GetText(OpenedPopupsTitle);
		ExpectedCLCFTitle = "Create Location Custom Field";
		RandomCLFName = RandomStrings.RequiredCharacters(4);
		WebDriverWaits.SendKeys(NameFieldLCF, RandomCLFName);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(TypeDropdownField);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(TextOptionForCLFType);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(CreateCustomFieldButton2);
		Thread.sleep(10000);
		
		String LCFCountAtHeader2[] = WebDriverWaits.GetText(LCFsActiveCount).split(" ");
		LCFsCountAfter = Integer.parseInt(LCFCountAtHeader2[0]);
		System.out.println(LCFsCountBefore);
		System.out.println(LCFsCountAfter);
		CompareLCFsCount = (LCFsCountAfter == (LCFsCountBefore + 1));
	}

	public static void AgencySetup_VerifyUploadedMapLayer() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(MapLayersTab);
		Thread.sleep(6000);
		MapLayerTabTitle = WebDriverWaits.GetText(MapLayersTab);
		String MapLayerCountAtHeader[] = WebDriverWaits.GetText(LCFsActiveCount).split(" ");
		MapLayerCountBefore = Integer.parseInt(MapLayerCountAtHeader[0]);
		WebDriverWaits.ClickOn(UploadMapLayerButton);
		Thread.sleep(5000);
		CreateMLPopupTitle = WebDriverWaits.GetText(OpenedPopupsTitle);
		ExpectedCreateMLTitle = "Create Map Layer";
		RandomLabelName = RandomStrings.RequiredCharacters(6);
		WebDriverWaits.SendKeys(LabelField, RandomLabelName);
		WebElement UploadMapLayer = driver.findElement(By.xpath("//input[@id='file-upload__kml']"));
		Thread.sleep(5000);
		UploadMapLayer.sendKeys(System.getProperty("user.dir") + "/TestData/texas_city_KML (1).kmz");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CreateMapLayerButton);
		Thread.sleep(60000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(MapLayersTab);
		Thread.sleep(6000);
		String MapLayerCountAtHeader2[] = WebDriverWaits.GetText(LCFsActiveCount).split(" ");
		MapLayerCountAfter = Integer.parseInt(MapLayerCountAtHeader2[0]);
		CompareMapLayersCount = (MapLayerCountAfter == (MapLayerCountBefore + 1));
		System.out.println(MapLayerCountBefore);
		System.out.println(MapLayerCountAfter);
	}

	public static void AgencySetup_VerifyUploadedAgencyBoundary() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(8000);
		WebDriverWaits.ScrollIntoView(AgencyBoundaryTab);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AgencyBoundaryTab);
		Thread.sleep(5000);
		BoundaryTabTitle = WebDriverWaits.GetText(AgencyBoundaryTab);
		WebElement UploadBoundaryFile = driver.findElement(By.xpath("//input[@id='file-upload__boundary']"));
		Thread.sleep(8000);
		UploadBoundaryFile.sendKeys(System.getProperty("user.dir") + "/TestData/texas_city_KML (1).kmz");
		Thread.sleep(60000);
		int CheckRefresh = driver.findElements(RefreshLinkText).size();
//		List<WebElement> RefreshPresent = driver.findElements(RefreshLinkText);
		while(CheckRefresh > 0) {
		WebDriverWaits.ScrollIntoView(RefreshLinkText)	;
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(RefreshLinkText);
		Thread.sleep(10000);
		
		CheckRefresh = driver.findElements(RefreshLinkText).size();
	}
		//driver.navigate().refresh();
		Thread.sleep(6000);
		//WebDriverWaits.ClickOn(AgencyBoundaryTab);
		Thread.sleep(15000);
		WebDriverWaits.ScrollIntoView(UploadedFileLabel);
		ActualBoundaryFile = WebDriverWaits.GetText(UploadedFileLabel);
		ExpectedBoundaryFile = "texas_city_KML__1_.kmz";
//		ExpectedBoundaryFile = "City_Boundaries.kmz";
	}

	public static void AgencySetup_VerifyUploadedAgencyParcelFile() throws InterruptedException {
		Thread.sleep(10000);
		
		WebDriverWaits.ScrollIntoView(MapSettingsTab);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(MapSettingsTab);
		Thread.sleep(3000);
		MapSettingsTabTitle = WebDriverWaits.GetText(MapSettingsTab);
		WebElement UploadBoundaryFile = driver.findElement(By.xpath("//input[@id='file-upload__layer']"));
		Thread.sleep(3000);
		UploadBoundaryFile.sendKeys(System.getProperty("user.dir") + "/TestData/Texas_City.gdb.zip");
		Thread.sleep(60000);
		driver.navigate().refresh();
		int CheckRefresh = driver.findElements(RefreshLinkText).size();
		while(CheckRefresh > 0) {
		WebDriverWaits.ScrollIntoView(RefreshLinkText)	;
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(RefreshLinkText);
		Thread.sleep(10000);
		CheckRefresh = driver.findElements(RefreshLinkText).size();
	}
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(MapSettingsTab);
		Thread.sleep(3000);
		WebDriverWaits.Clear(CenterLongitudeField);
		WebDriverWaits.SendKeys(CenterLongitudeField, "-94.8992156982421900000000000");
		WebDriverWaits.Clear(CenterLatitudeField);
		WebDriverWaits.SendKeys(CenterLatitudeField, "29.3833717078824430000000000");
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(8000);
		jser.executeScript("window.scrollBy(0,450)", "");
		WebElement SaveChangesButtonMS = (WebElement) jser.executeScript(
				"return document.querySelector('div > div.agency-setup-tab__actions.map-settings__actions > button.square-btn.btn.btn-primary')");
		Thread.sleep(6000);
		WebDriverWaits.ClickOnWE(SaveChangesButtonMS);
//		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(6000);
		ActualAPZipFile = WebDriverWaits.GetText(UploadedFileLabel);
		ExpectedAPZipFile = "Texas_City.gdb.zip";
	}

	public static void AgencySetup_VerifyCreatedUser() throws InterruptedException {
//		driver.navigate().to(DataInterface.URLUserManagement);
		driver.navigate().refresh();
		Thread.sleep(8000);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(AppMenuIcon);
		Thread.sleep(6000);
		WebElement AgencySetupIconJS = (WebElement) jser.executeScript(
				"return document.querySelector('div.tools-dropdown__tool.flex-column--center.active > a')");
		Thread.sleep(3000);
		WebDriverWaits.ClickOnWE(AgencySetupIconJS);
//		WebDriverWaits.ClickOn(AgencySetupIcon);
		Thread.sleep(2000);
		jser.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(UserManagementSidebar);
		Thread.sleep(2000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		CreateCRMUserUtils.CreateCRMUser_CreateProductAdminUser();
	}

	public static void AgencySetup_VerifyAdditionOfFAActivity() throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CEProdSideBar);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CaseManagementSidebar);
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ForcedAbatementTab);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateFAActivityButton);
		WebDriverWaits.SendKeys(LabelFieldFAA, "Forced Abatement");
		String RandomDescription = RandomStrings.RequiredString(20);
		WebDriverWaits.SendKeys(DescriptionFieldFA, RandomDescription);
		WebDriverWaits.ClickOn(AddFieldLinkTextFA);
		WebDriverWaits.SendKeys(FieldsLabel, "Text");
		WebDriverWaits.ClickOn(CreateFAActivityButton2);
		Thread.sleep(2000);
		AddedFAActivity = WebDriverWaits.GetText(CreatedFAALabel);
	}

	public static void AgencySetup_VerifyCreationOfMunicipalCode() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(ViolationsSidebarOption);
		Thread.sleep(2000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(MunicipalCodeTab);
		WebDriverWaits.ClickOn(CreateMunicipalCodeButton);
		Thread.sleep(2000);
		CreateMunicipalCodePopupTitle = WebDriverWaits.GetText(CreateMunicipalCodePopup);
		String RandomArticleNumber = RandomStrings.RequiredDigits(4);
		String RandomDescription = RandomStrings.RequiredCharacters(50);
		String RandomResolutionAction = RandomStrings.RequiredCharacters(20);
		WebDriverWaits.SendKeys(ArticleNumberField, RandomArticleNumber);
		WebDriverWaits.SendKeys(DescriptionField, RandomDescription);
		WebDriverWaits.SendKeys(ResolutionActionField, RandomResolutionAction);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateMunicipalCodeButton2);

	}

	public static void AgencySetup_VerifyCreationOfViolations() throws InterruptedException {
     	
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Thread.sleep(5000);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(ViolationsSidebarOption);
		Thread.sleep(5000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ViolationsTab);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CreateViolationButton);
		Thread.sleep(2000);
		CreateViolationTitle = WebDriverWaits.GetText(CreateViolationPopup);
		WebDriverWaits.SendKeys(LabelField, "Water");
		Thread.sleep(2000);
		WebDriverWaits.ScrollIntoView(ViolationTypeDropdown);
		WebDriverWaits.ClickOn(ViolationTypeDropdown);
		Thread.sleep(2000);
		//WebDriverWaits.ScrollIntoView(GeneralVioOption);
		//WebDriverWaits.ClickByJsExecuter(GeneralVioOption);
		WebDriverWaits.ClickOn(VioOptionGeneral);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(MunicipalCodeField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(MunicipalCodeOption);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateViolationButton2);
		Thread.sleep(10000);
		
		List<WebElement> AddedViolations = WebDriverWaits.WaitUntilVisibleList(AddedViolationsRows);
		System.out.println(AddedViolations.size());
		CheckVio1 = (AddedViolations.size() == 1);
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebDriverWaits.ScrollIntoView(CreateViolationButton);
		WebDriverWaits.ClickOn(CreateViolationButton);
		Thread.sleep(6000);
		WebDriverWaits.SendKeys(LabelField, "Animal");
		WebDriverWaits.ClickOn(ViolationTypeDropdown);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(VioOptionAnimal);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(MunicipalCodeField);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(MunicipalCodeOption);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CreateViolationButton2);
		
		Thread.sleep(10000);
		AddedViolations = WebDriverWaits.WaitUntilVisibleList(AddedViolationsRows);
		System.out.println(AddedViolations.size());
		CheckVio2 = (AddedViolations.size() == 2);
		Thread.sleep(4000);
	}

	public static void AgencySetup_VerifyInvalidDispositionCreation() throws InterruptedException {
		driver.navigate().refresh();
		//driver.navigate().to(DataInterface.URLViolations);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(DispositionsTab);
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(CreateInvalidDispositionButton);
		Thread.sleep(6000);
		DispositionsPopupTitle = WebDriverWaits.GetText(CreateInvalidDispositionPopup);
		ExpectedDispositionsPopupTitle = "Create Invalid Disposition";
		WebDriverWaits.ClickOn(CreateDispositionButton);
		LabelValidationMsg = WebDriverWaits.GetText(LabelValidation);
		ExpDispositionLabelValidationMsg = "The Label is required.";
		WebDriverWaits.SendKeys(LabelField, "Invalid Dispositionnn");
//		WebDriverWaits.ClickOn(InvalidDispositionsToggle);
		WebDriverWaits.ClickOn(CreateDispositionButton);
		Thread.sleep(6000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(6000);
		
		driver.navigate().refresh();
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(DispositionsTab);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Invalid Dispositions']")).click();
		Thread.sleep(2000);
		DispositionsHeader = WebDriverWaits.GetText(ActiveDispositionsHeader).split(" ");
		DispositionsHeaderCount = Integer.parseInt(DispositionsHeader[0]);
		CheckDispositionCount = (DispositionsHeaderCount == 1);
	}

	public static void AgencySetup_VerifyCreationOfNonHTMLNotice() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(8000);
		Thread.sleep(2000);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jser.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(NoticesSidebar);
		Thread.sleep(2000);
		String[] NoticesSplit = WebDriverWaits.GetText(CountNotices).split(" ");
		String CountText = NoticesSplit[0];
		int NoticesCountBefore = Integer.parseInt(CountText);
		Thread.sleep(2000);
		jser.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateNonHtmlNoticeBtn);
		Thread.sleep(2000);
		String RandomLabel = "Non-HTML " + RandomStrings.RequiredCharacters(8);
		WebDriverWaits.SendKeys(LabelField, RandomLabel);
		WebDriverWaits.ClickOn(CreateNoticeBtn);
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(8000);
		String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
		String CountText2 = NoticesSplit2[0];
		CurrentNoticesCount = Integer.parseInt(CountText2);
		CompareCountNonHTML = CurrentNoticesCount == (NoticesCountBefore + 1);
	}

	public static void AgencySetup_VerifyCreationOfHTMLNotice() throws InterruptedException {
		WebDriverWaits.ClickOn(CreateHtmlNoticeBtn);
		String RandomLabel = "HTML " + RandomStrings.RequiredCharacters(8);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(LabelField, RandomLabel);
		WebDriverWaits.ClickOn(MergeFieldsLink);
		WebDriverWaits.ClickOn(FieldResults);
		WebDriverWaits.ClickOn(DoneButton);
		WebDriverWaits.ClickOn(CreateNoticeBtn);
		Thread.sleep(12000);
		String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
		String CountText2 = NoticesSplit2[0];
		int NoticesCountAfter = Integer.parseInt(CountText2);
		CompareCountHTML = NoticesCountAfter == (CurrentNoticesCount + 1);
	}

	public static void AgencySetup_VerifyCreationOfFADocument() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CreateHtmlNoticeBtn);
		
		WebDriverWaits.ClickOn(FADocumentToggle);
		String RandomLabel = "FA Doc " + RandomStrings.RequiredCharacters(8);
		WebDriverWaits.SendKeys(LabelField, RandomLabel);
		WebDriverWaits.ClickOn(MergeFieldsLink);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(FieldResults);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(DoneButton);
		Thread.sleep(5000);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateNoticeBtn);
		Thread.sleep(12000);
		String[] NoticesSplit2 = WebDriverWaits.GetText(CountNotices).split(" ");
		String CountText2 = NoticesSplit2[0];
		int NoticesCountAfter = Integer.parseInt(CountText2);
		CompareCountFADoc = NoticesCountAfter == (CurrentNoticesCount + 2);
	}

	public static void AgencySetup_VerifyCreationOfCategories() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(6000);
		WebDriverWaits.ClickOn(AppMenuIcon);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(AgencySetupIcon);
		Thread.sleep(10000);
		WebDriverWaits.ScrollIntoView(AuditTrial);
		Thread.sleep(2000);
		
		WebDriverWaits.ScrollIntoView(CRMProdSideBar);
		if(!driver.findElement(CategoriesSideBar).isDisplayed()) {
			WebDriverWaits.ClickOn(CRMProdSideBar);
			Thread.sleep(5000);
		}
		WebDriverWaits.scrolltoUp();
		WebDriverWaits.ScrollIntoView(CategoriesSideBar);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CategoriesSideBar);
		Thread.sleep(5000);
		CRMCommonMethods.CRM_CreateCategoryAppPrerequisute("No", "Yes", "Yes", "Location Not Required");
		CRMCommonMethods.CRM_CreateCategoryAppPrerequisute("Yes", "Yes", "Yes", "Location Required");
		CRMCommonMethods.CRM_CreateCategoryAppPrerequisute("No", "No", "Yes", "Location Not Included");
	}

	public static void AgencySetup_VerifySavedSubmissionSettings() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(8000);
		//Thread.sleep(4000);
		WebDriverWaits.scrolltoUp();
		Thread.sleep(1000);
		WebDriverWaits.ScrollIntoView(AppMenuIcon);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(AppMenuIcon);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(AgencySetupIcon);
		Thread.sleep(10000);
		WebDriverWaits.ScrollIntoView(AuditTrial);
		Thread.sleep(2000);
		if(!driver.findElement(SubmissionSettingsSideBar).isDisplayed()) {
			WebDriverWaits.ScrollIntoView(CRMProdSideBar);
			WebDriverWaits.ClickByJsExecuter(CRMProdSideBar);
			
		}
		Thread.sleep(5000);
		WebDriverWaits.ScrollIntoView(SubmissionSettingsSideBar);
		WebDriverWaits.ClickOn(SubmissionSettingsSideBar);
		Thread.sleep(2000);
		WebDriverWaits.ScrollIntoView(SubmissionSettingsUtils.NoToggle1);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SubmissionSettingsUtils.NoToggle1);
		Thread.sleep(5000);
		WebDriverWaits.ScrollIntoView(SubmissionSettingsUtils.YesToggle2);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SubmissionSettingsUtils.YesToggle2);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(5000);
		String GetClassT1 = WebDriverWaits.WaitUntilVisibleWE(SubmissionSettingsUtils.NoToggle1).getAttribute("class");
		ToggleButtonState1 = GetClassT1.equals("square-btn btn btn-primary");
		String GetClassT2 = WebDriverWaits.WaitUntilVisibleWE(SubmissionSettingsUtils.YesToggle2).getAttribute("class");
		ToggleButtonState2 = GetClassT2.equals("square-btn btn btn-primary");
		}

	public static void AgencySetup_VerifySuccessfulDirectionToCCP() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWaits.ScrollIntoView(CSPInternalUtils.PlusIconToCRM);
		Thread.sleep(2000);;
		WebDriverWaits.ClickOn(CSPInternalUtils.PlusIconToCRM);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CodeEnforcementOption);
		
		Thread.sleep(13000);//CreateACasePopupTitle
		List<WebElement> CCPHeader = driver.findElements(CreateACasePopupTitle);
		CCPStatus = CCPHeader.size()==1;
		WebDriverWaits.ClickOn(CancelButton);
		Thread.sleep(4000);
	}

	public static void AgencySetup_VerifyCreationOf50PlusCases() throws InterruptedException {
		Thread.sleep(5000);
		for(int i = 0; i <= 50; i++) {
		CRMCommonMethods.CE_CreateACase();
		WebDriverWaits.ClickOn(CRMCommonMethods.CloseCDPIcon);		
		Thread.sleep(5000);
		}
	}

	public static void AgencySetup_VerifyCreationOf50PlusSubmissions() throws InterruptedException {
		Thread.sleep(5000);
		for(int i = 0; i <= 50; i++) {
		CRMCommonMethods.CRM_CreateSubmissionPreRequisite("No", "Yes", "No", "No", "No", "Location Not Required");
		}
	}

	public static void AgencySetup_VerifyCaseCreationWithEntityViolation() throws InterruptedException {
		Thread.sleep(5000);
		Thread.sleep(6000);
		int CheckCancel = BrowsersInvoked.driver.findElements(CSPInternalUtils.CancelCreateCase).size();
		if(CheckCancel > 0) {
			WebDriverWaits.ScrollIntoView(CSPInternalUtils.CancelCreateCase);
			WebDriverWaits.ClickOn(CSPInternalUtils.CancelCreateCase);
			Thread.sleep(4000);
		}
		
		int CancelSubmission = BrowsersInvoked.driver.findElements(CSPInternalUtils.CloseSubmissionIcon).size();
		if(CancelSubmission > 0) {
			WebDriverWaits.ScrollIntoView(CSPInternalUtils.CloseSubmissionIcon);
			WebDriverWaits.ClickOn(CSPInternalUtils.CloseSubmissionIcon);
			Thread.sleep(4000);
		}
		
		
		Thread.sleep(6000);
		int CreateCaseCheck = driver.findElements(CSPInternalUtils.PlusIconToCRM).size();
		if(CreateCaseCheck > 0) {
			WebDriverWaits.ScrollIntoView(CSPInternalUtils.PlusIconToCRM);
			Thread.sleep(2000);;
			WebDriverWaits.ClickOn(CSPInternalUtils.PlusIconToCRM);
			Thread.sleep(5000);
			WebDriverWaits.ClickOn(CodeEnforcementOption);
			
			Thread.sleep(13000);//CreateACasePopupTitle
		}
		
		
		CRMCommonMethods.CE_AddLocation();
		CRMCommonMethods.CE_AddContact();
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.ViolationSearchBox);
		Thread.sleep(5000);
		WebDriverWaits.SendKeys(CRMCommonMethods.ViolationSearchBox, "Animal");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.ViolationsList);
		Thread.sleep(5000);
		WebDriverWaits.SendKeys(CRMCommonMethods.AnimalColourField, "Black");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.AddButtonViolation);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.AddanotherAnimalLinkText);
		Thread.sleep(5000);
		WebDriverWaits.SendKeys(CRMCommonMethods.AnimalColourField, "White");
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.AddButtonViolation);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.CreateCaseButton);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CRMCommonMethods.AssignCaseTo);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CRMCommonMethods.InspectionAssigneeTo);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CRMCommonMethods.CreateScheduleInspectionButton);
		Thread.sleep(10000);
		WebDriverWaits.ClickOn(CRMCommonMethods.CloseCDPIcon);		
		Thread.sleep(5000);
		}
	
//	public static void AgencySetup_VerifyAllLinksForCEDashboard() throws InterruptedException {
//	Thread.sleep(2000);
//}
	
	public static String CreateFineText;
	public static int CloseCreateFinePOpup ;
	
	public static void AgencySetup_VerifyCreateFinePopup() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(8000);
		CRMCommonMethods.NavigateTo_AgencySetup();
		CRMCommonMethods.NavigateTo_Fines();
		WebDriverWaits.ScrollIntoView(CreateFineBtn);
		Thread.sleep(2000);
		WebDriverWaits.ClickByJsExecuter(CreateFineBtn);
		Thread.sleep(3000);
		CreateFineText = WebDriverWaits.GetText(CreateFinePopup);
		WebDriverWaits.ScrollIntoView(CancelCreateFine);
		Thread.sleep(2000);
		WebDriverWaits.ClickByJsExecuter(CancelCreateFine);
		Thread.sleep(2000);
		CloseCreateFinePOpup = driver.findElements(CreateFinePopup).size();
		Thread.sleep(1000);
		
		
	}
	
	public static String ActualCrtFineLabelValidMsg ;
	public static String ActualCrtFineDefaultAmntValidMsg ;
	
	public static String ExpectedCrtFineLabelValidMsg = "The Label is required." ;
	public static String ExpectedCrtFineDefaultAmntValidMsg  = "Number should be greater than 0"; 
	
	public static String ActualNoticeRequiresValidMsg ;
	public static String ExpectedNoticeRequiresValidMsg = "The Notice is required.";
	
	
	public static String labelName ;
	public static String DefaultFineAmount ;
	public static int BeforActiveFines ;
	public static int AfterActiveFines ;
	
	
	
	public static void AgencySetup_VerifyFlatFineCreationDoNotAttachedNotices() throws InterruptedException {
		
		//Thread.sleep(1000);
		Thread.sleep(5000);
//		CRMCommonMethods.NavigateTo_AgencySetup();
//		CRMCommonMethods.NavigateTo_Fines();
		String ActiveFinesVal = (WebDriverWaits.GetText(ActiveFines).split(" "))[0];
		BeforActiveFines = Integer.parseInt(ActiveFinesVal);
		WebDriverWaits.ScrollIntoView(CreateFineBtn);
		Thread.sleep(2000);
		WebDriverWaits.ClickByJsExecuter(CreateFineBtn);
		Thread.sleep(3000);
		WebDriverWaits.ClickByJsExecuter(DoNotAttachedNoticeChk);
		WebDriverWaits.ClickOn(CreateFinePopUpbtn);
		Thread.sleep(2000);
		ActualCrtFineLabelValidMsg = WebDriverWaits.GetText(CrtFineLabelValidMsg);
		ActualCrtFineDefaultAmntValidMsg = WebDriverWaits.GetText(CrtFineDefaultAmountValidMsg);
		labelName = RandomStrings.RequiredString(3) +  "Fine";
		WebDriverWaits.SendKeys(CrtFineLabelName, labelName);
		DefaultFineAmount = RandomStrings.RequiredDigits(4);
		WebDriverWaits.SendKeys(CrtDefaultAmnt, DefaultFineAmount);
		WebDriverWaits.ClickOn(CreateFinePopUpbtn);
		Thread.sleep(4000);
		AfterActiveFines = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
		Thread.sleep(1000);
		
		
		
	}
	
	
    public static void AgencySetup_VerifyFlatFineCreationAttachedNotices() throws InterruptedException {
		
		//Thread.sleep(1000);
		Thread.sleep(5000);
//		CRMCommonMethods.NavigateTo_AgencySetup();
//		CRMCommonMethods.NavigateTo_Fines();
		String ActiveFinesVal = (WebDriverWaits.GetText(ActiveFines).split(" "))[0];
		BeforActiveFines = Integer.parseInt(ActiveFinesVal);
		WebDriverWaits.ScrollIntoView(CreateFineBtn);
		Thread.sleep(2000);
		WebDriverWaits.ClickByJsExecuter(CreateFineBtn);
		Thread.sleep(3000);

		WebDriverWaits.ClickOn(CreateFinePopUpbtn);
		Thread.sleep(2000);
		ActualNoticeRequiresValidMsg = WebDriverWaits.GetText(CrtFineNoticeRequiredValidMsg);
		labelName = RandomStrings.RequiredString(3) +  "Fine";
		WebDriverWaits.SendKeys(CrtFineLabelName, labelName);
		DefaultFineAmount = RandomStrings.RequiredDigits(4);
		WebDriverWaits.SendKeys(CrtDefaultAmnt, DefaultFineAmount);
		Thread.sleep(1000);
		WebDriverWaits.ClickByJsExecuter(CrtFineSelectNoitce);
		Thread.sleep(1000);
		WebDriverWaits.ClickByJsExecuter(CrtFineCheckHtmlNotice);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CrtFineApplyNotices);
		Thread.sleep(1000);
		
		WebDriverWaits.ClickOn(CreateFinePopUpbtn);
		Thread.sleep(4000);
		AfterActiveFines = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
		Thread.sleep(1000);
		
		
		
	}
    
    public static String LabelValBefore ;
    public static String labelNameAfter;
    public static String DefltAmtAfter;
    public static String DefltAmtBefore;
    public static String EditedLabelName;
    public static String EditedDefAmt;
    
    public static void AgencySetup_VerifyFlatFineEdit() throws InterruptedException{
    	
    	
    			Thread.sleep(5000);
//    			CRMCommonMethods.NavigateTo_AgencySetup();
//    			CRMCommonMethods.NavigateTo_Fines();
    			WebDriverWaits.ClickByJsExecuter(EditActiveFine);
    			Thread.sleep(2000);
    			LabelValBefore = driver.findElement(CrtFineLabelName).getAttribute("value");
    			labelNameAfter = RandomStrings.RequiredString(3) +  "FineEdited";
    			WebDriverWaits.Clear(CrtFineLabelName);
    			WebDriverWaits.SendKeys(CrtFineLabelName, labelNameAfter);
    			DefltAmtAfter = RandomStrings.RequiredDigits(2);
    			
    			WebDriverWaits.Clear(CrtDefaultAmnt);
    			WebDriverWaits.SendKeys(CrtDefaultAmnt, DefltAmtAfter);
    			DefltAmtAfter = driver.findElement(CrtDefaultAmnt).getAttribute("value");
    			Thread.sleep(1000);
    			WebDriverWaits.ClickOn(EditSavebtn);
    			Thread.sleep(4000);
    			EditedLabelName = WebDriverWaits.GetText(CreateFineGridValLable);
    			EditedDefAmt = WebDriverWaits.GetText(CrtFineGridDefAmt);
    			Thread.sleep(3000);
    			
    			
    	
    }
    
    public static int InactivefineCountBefore;
    public static int InactivefineCountafter;
    public static String activeFineLabel;
    public static Boolean inactiveFineLabel;
   
	
    public static void AgencySetup_VerifyInactivateActiveFines() throws InterruptedException {
    	
    	Thread.sleep(5000);
//		CRMCommonMethods.NavigateTo_AgencySetup();
//		CRMCommonMethods.NavigateTo_Fines();
		InactivefineCountBefore = Integer.parseInt((WebDriverWaits.GetText(InactiveFines)).split(" ")[0]);
		WebDriverWaits.ClickByJsExecuter(EditActiveFine);
		Thread.sleep(2000);
		activeFineLabel = driver.findElement(CrtFineLabelName).getAttribute("value");
		WebDriverWaits.ScrollIntoView(InactiveFinebtn);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(InactiveFinebtn);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(EditSavebtn);
		Thread.sleep(4000);
		List<String> allinactiveFineLabels = new ArrayList<>();
		InactivefineCountafter = Integer.parseInt((WebDriverWaits.GetText(InactiveFines)).split(" ")[0]);
		driver.findElements(InactiveFineGridData)
		.stream()
		.forEach(x -> allinactiveFineLabels.add(x.getText()));

		inactiveFineLabel = allinactiveFineLabels.contains(activeFineLabel);
		Thread.sleep(2000);
		
    }
    
    public static int activefineCountBefore;
    public static int activefineCountafter;
    public static String InactiveFineLabel;
    public static Boolean ActiveFineLabel;
public static void AgencySetup_VerifyActivateInactiveFines() throws InterruptedException {
    	
    	Thread.sleep(5000);
//		CRMCommonMethods.NavigateTo_AgencySetup();
//		CRMCommonMethods.NavigateTo_Fines();
		activefineCountBefore = Integer.parseInt((WebDriverWaits.GetText(ActiveFines)).split(" ")[0]);
		WebDriverWaits.ClickByJsExecuter(EditInactiveFine);
		Thread.sleep(2000);
		InactiveFineLabel = driver.findElement(CrtFineLabelName).getAttribute("value");
		WebDriverWaits.ScrollIntoView(ActiveFinetoogle);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ActiveFinetoogle);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(EditSavebtn);
		Thread.sleep(4000);
		List<String> allactiveFineLabels = new ArrayList<>();
		activefineCountafter = Integer.parseInt((WebDriverWaits.GetText(ActiveFines)).split(" ")[0]);
		driver.findElements(ActiveFineGridData)
		.stream()
		.forEach(x -> allactiveFineLabels.add(x.getText()));

		ActiveFineLabel = allactiveFineLabels.contains(InactiveFineLabel);
		Thread.sleep(2000);
		
    }

     public static String ActualcreateLateFeePOp;
     public static String  ExpectedCreateLateFeePopup = "Create Late Fee";
     public static int CloseCreateLateFeePOpup;
     public static String ExpectedCrtLateFeeLabelValidMsg = "The Label is required." ;
     public static String ActualCrtLateFeeLabelValidMsg ;
     
	 public static void AgencySetup_VerifyOpenCloseCreateLateFeePopup () throws InterruptedException {
		 
		 Thread.sleep(5000);
//		CRMCommonMethods.NavigateTo_AgencySetup();
        CRMCommonMethods.NavigateTo_LateFeesSubTab();
        WebDriverWaits.ScrollIntoView(CreateLateFeebtn);
        Thread.sleep(1000);
        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtn);
        Thread.sleep(2000);
        ActualcreateLateFeePOp = WebDriverWaits.GetText(CreateLateFeePopupText);
        Thread.sleep(1000);
        WebDriverWaits.ScrollIntoView(CreateLateFeebtnpopup);
        Thread.sleep(2000);
        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtnpopup);
        Thread.sleep(2000);
        WebDriverWaits.ScrollIntoView(CrtFineLabelValidMsg);
        Thread.sleep(2000); 
        
        ActualCrtLateFeeLabelValidMsg = WebDriverWaits.GetText(CrtFineLabelValidMsg);
        WebDriverWaits.ScrollIntoView(CancelButton);
        Thread.sleep(2000);
        WebDriverWaits.ClickOn(CancelButton);
        Thread.sleep(1000);
        CloseCreateLateFeePOpup = driver.findElements(CreateFinePopup).size();
		Thread.sleep(1000);
        
        
        
		 
	 }
	 
	 public static String LateFeeLabel;
	 public static String LateFeeLabelDesc; 
	 public static String LateFeeAmount;
	 public static String PayDueAfterDay;
	 public static int AfterActiveLateFeeCount;
	 public static int BeforeActiveLateFeeCount;
	 public static Boolean NewAddedLateFeeLable;
	 
	 public static void AgencySetup_VerifyCreateFixedManualFlatFineLateFee() throws InterruptedException {
		 
		    Thread.sleep(5000);
//			CRMCommonMethods.NavigateTo_AgencySetup();
	        CRMCommonMethods.NavigateTo_LateFeesSubTab();
	        BeforeActiveLateFeeCount  = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
	        WebDriverWaits.ScrollIntoView(CreateLateFeebtn);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtn);
	        Thread.sleep(2000);
	        LateFeeLabel = RandomStrings.RequiredCharacters(3) + " LateFine";
	        WebDriverWaits.SendKeys(CrtLateFineLabelName, LateFeeLabel); 
	        Thread.sleep(1000);
	        LateFeeLabelDesc = RandomStrings.RequiredCharacters(3) + " LateFineDesc";
	        WebDriverWaits.SendKeys(CrtLateFineLabeldesc, LateFeeLabelDesc);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeManualToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeFlatToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeFixedAmtToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ScrollIntoView(CrtLateFeeAmount);
	        Thread.sleep(1000);
	        LateFeeAmount = RandomStrings.RequiredDigits(4);
	        WebDriverWaits.SendKeys(CrtLateFeeAmount, LateFeeAmount);
	        PayDueAfterDay = RandomStrings.RequiredDigits(1);
	        Thread.sleep(1000);
	        WebDriverWaits.SendKeys(AfterDayLateFeePayDue, PayDueAfterDay);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtnpopup);
	        Thread.sleep(2000);
	        AfterActiveLateFeeCount = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
			Thread.sleep(1000);
			List<String> allactiveLateFeeLabels = new ArrayList<>();
			driver.findElements(ActiveFineGridData)
			.stream()
			.forEach(x -> allactiveLateFeeLabels.add(x.getText()));
			
			NewAddedLateFeeLable = allactiveLateFeeLabels.contains(LateFeeLabel);
			Thread.sleep(2000);
	        
	        
	 }
	 
	 
	 public static void AgencySetup_VerifyCreateOutStdManualFlatFineLateFee() throws InterruptedException {
		 
		    Thread.sleep(5000);
//			CRMCommonMethods.NavigateTo_AgencySetup();
	        CRMCommonMethods.NavigateTo_LateFeesSubTab();
	        BeforeActiveLateFeeCount  = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
	        WebDriverWaits.ScrollIntoView(CreateLateFeebtn);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtn);
	        Thread.sleep(2000);
	        LateFeeLabel = RandomStrings.RequiredCharacters(3) + " LateFine";
	        WebDriverWaits.SendKeys(CrtLateFineLabelName, LateFeeLabel); 
	        Thread.sleep(1000);
	        LateFeeLabelDesc = RandomStrings.RequiredCharacters(3) + " LateFineDesc";
	        WebDriverWaits.SendKeys(CrtLateFineLabeldesc, LateFeeLabelDesc);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeManualToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeFlatToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ClickByJsExecuter(CrtLateFeeOutstdBalToggle);
	        Thread.sleep(1000);
	        
	        WebDriverWaits.ScrollIntoView(CrtLateFeeAmount);
	        Thread.sleep(1000);
	        LateFeeAmount = RandomStrings.RequiredDigits(4);
	        WebDriverWaits.SendKeys(CrtLateFeeAmount, LateFeeAmount);
	        PayDueAfterDay = RandomStrings.RequiredDigits(1);
	        Thread.sleep(1000);
	        WebDriverWaits.SendKeys(AfterDayLateFeePayDue, PayDueAfterDay);
	        Thread.sleep(1000);
	        WebDriverWaits.ClickByJsExecuter(CreateLateFeebtnpopup);
	        Thread.sleep(2000);
	        AfterActiveLateFeeCount = Integer.parseInt((WebDriverWaits.GetText(ActiveFines).split(" "))[0]);
			Thread.sleep(1000);
			List<String> allactiveLateFeeLabels = new ArrayList<>();
			driver.findElements(ActiveFineGridData)
			.stream()
			.forEach(x -> allactiveLateFeeLabels.add(x.getText()));
			
			NewAddedLateFeeLable = allactiveLateFeeLabels.contains(LateFeeLabel);
			Thread.sleep(2000);
	        
	        
	 }
	 
	 
	 
	 public static int InactiveLateFeeCountBefore;
	    public static int InactiveLateFeeCountafter;
	    public static String activeLateFeeLabel;
	    public static Boolean inactiveLateFeeLabel;
	   
		
	    public static void AgencySetup_VerifyInactivateActiveLateFee() throws InterruptedException {
	    	
	    	Thread.sleep(5000);
//	    	CRMCommonMethods.NavigateTo_AgencySetup();
	        CRMCommonMethods.NavigateTo_LateFeesSubTab();
	    	InactiveLateFeeCountBefore = Integer.parseInt((WebDriverWaits.GetText(InactiveFines)).split(" ")[0]);
			WebDriverWaits.ClickByJsExecuter(EditActiveFine);
			Thread.sleep(2000);
			activeLateFeeLabel = driver.findElement(CrtFineLabelName).getAttribute("value");
			WebDriverWaits.ScrollIntoView(InactiveFinebtn);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(InactiveFinebtn);
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(EditSavebtn);
			Thread.sleep(4000);
			List<String> allinactiveFineLabels = new ArrayList<>();
			InactiveLateFeeCountafter = Integer.parseInt((WebDriverWaits.GetText(InactiveFines)).split(" ")[0]);
			driver.findElements(InactiveFineGridData)
			.stream()
			.forEach(x -> allinactiveFineLabels.add(x.getText()));

			inactiveLateFeeLabel = allinactiveFineLabels.contains(activeLateFeeLabel);
			Thread.sleep(2000);
			
	    }
	 
	    
	    
	    public static int activeLateFeeCountBefore;
	    public static int activeLateFeeCountafter;
	    public static String InactiveLateFeeLabel;
	    public static Boolean ActiveLateFeeLabel;
	public static void AgencySetup_VerifyActivateInActiveLateFee() throws InterruptedException {
	    	
	    	Thread.sleep(5000);
//			CRMCommonMethods.NavigateTo_AgencySetup();
			CRMCommonMethods.NavigateTo_LateFeesSubTab();
	    	activeLateFeeCountBefore = Integer.parseInt((WebDriverWaits.GetText(ActiveFines)).split(" ")[0]);
			WebDriverWaits.ClickByJsExecuter(EditInactiveFine);
			Thread.sleep(2000);
			InactiveLateFeeLabel = driver.findElement(CrtFineLabelName).getAttribute("value");
			WebDriverWaits.ScrollIntoView(ActiveFinetoogle);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(ActiveFinetoogle);
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(EditSavebtn);
			Thread.sleep(4000);
			List<String> allactiveFineLabels = new ArrayList<>();
			activeLateFeeCountafter = Integer.parseInt((WebDriverWaits.GetText(ActiveFines)).split(" ")[0]);
			driver.findElements(ActiveFineGridData)
			.stream()
			.forEach(x -> allactiveFineLabels.add(x.getText()));

			ActiveLateFeeLabel = allactiveFineLabels.contains(InactiveLateFeeLabel);
			Thread.sleep(2000);
			
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
