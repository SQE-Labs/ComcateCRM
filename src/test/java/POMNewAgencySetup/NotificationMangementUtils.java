package POMNewAgencySetup;

import java.awt.AWTException;
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


public class NotificationMangementUtils extends AgencyCreationUtils {
    
	
	public static String notificationMangementSideBar = "//label[text()='Notification Management']";
	public static String caseNavigation = "//a[text()='Cases']";
	public static String activeNotifdetails = "//h2[contains(text(),'Active')]";
	public static String inActiveNotifdetails = "//h2[contains(text(),'Inactive')]";
	public static String notificationHeaderLbl = "//div[text()='Notifications']";
	public static String createNotificationPopupHeader = "//div[@class='modal-header']//h1";
	public static String createNotificationbtn = "//button[text()='Create Notification']";
	public static String createNotifPopUpbtn = "(//h1[text()='Create Notification']//parent::div//button)[2]";
	public static String cancelNotifPopUpbtn = "(//h1[text()='Create Notification']//parent::div//button)[1]"; 
	public static String crtNotificationLableName = "//input[@name='label']";
	public static String crtNotifDescription = "//input[@name='description']";
	public static String crtNotifPagingNxt = "(//div[@class='pagination-bottom']//button)[2]";
	public static String crtNotifGridPageCount = "//div[@class='pagination-bottom']//span";
	
	public static String activeNotifications = "//h2[contains(text(),'Active')]";
	public static String inActiveNotifications = "//h2[contains(text(),'Inactive')]";
	public static String editNotifSaveBtn = "//button[text()='Save']";
	public static String crtNotifInputLabelName = "//h1[text()='Create Notification']//ancestor::div[@class='modal-content']//input[@name='label']";
	public static String crtNotifActionDropdown = "//h1[text()='Create Notification']//ancestor::div[@class='modal-content']//span[@class='Select-arrow']";
	public static String crtNotifActiveToggle = "//button[text()='Active']";
	public static String crtNotifInactiveToggle = "//button[text()='Inactive']";
	public static String crtNotifInputDescription = "//h1[text()='Create Notification']//ancestor::div[@class='modal-content']//input[@name='description']";
	public static String crtNotifLableNameValidMsg = "//input[@name='label']//parent::div//following-sibling::span";
	public static String crtNotifGlobalValidMsg = "(//div[@class='modal-body']/div)[1]";
	
	public static String crtAddRuleBtn = "//button[text()='Add Rule']";
	public static String crtCreateRule = "(//h1[text()='Create Rule']//parent::div//following-sibling::div//button)[2]";
	public static String crtCancelCrtRule = "(//h1[text()='Create Rule']//parent::div//following-sibling::div//button)[1]";
	public static String crtRuleGolbalValidMsg = "(//div[@class='modal-body']/div)[3]"; 
	public static String crtRuleAddCriteria = "//a[text()='Add Criteria']"; 
	public static String crtRuleCriteriaValid = "//div[@class='criteria-list']//span[@class='field__error']";
	public static String crtRuleAddDelivery = "//a[text()='Add Delivery option']";
	public static String crtRuleAddDeliveryValid = "//div[@class='delivery-options']//span[@class='field__error']";
	
	public static String actionSelectArrow = "//label[@title='Action']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String operatorSelectArrow = "//label[@title='Operator']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String attributeSelectArrow = "//label[@title='Attribute']//parent::div//parent::div//span[@class='Select-arrow-zone']";
	public static String valueSelectArrow = "//label[@title='Value']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String sendOptionSelectArrow = "//label[@title='Send Options']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String useEmialTemplateSelectArrow = "//label[@title='Use Email Template']//parent::div//parent::div//span[@class='Select-arrow']";
	
	public static String actionSelectArrow1 = "(//label[@title='Action']//parent::div//parent::div//span[@class='Select-arrow'])[1]";
	public static String operatorSelectArrow1 = "(//label[@title='Operator']//parent::div//parent::div//span[@class='Select-arrow'])[1]";
	public static String attributeSelectArrow1 = "(//label[@title='Attribute']//parent::div//parent::div//span[@class='Select-arrow-zone'])[1]";
	public static String valueSelectArrow1 = "(//label[@title='Value']//parent::div//parent::div//span[@class='Select-arrow'])[1]";
	public static String sendOptionSelectArrow1 = "(//label[@title='Send Options']//parent::div//parent::div//span[@class='Select-arrow'])[1]";
	public static String useEmialTemplateSelectArrow1 = "(//label[@title='Use Email Template']//parent::div//parent::div//span[@class='Select-arrow'])[1]";
	public static String recipentArrow2 = "(//label[@title='Recipient']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	
	public static String actionSelectArrow2 = "(//label[@title='Action']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	public static String operatorSelectArrow2 = "(//label[@title='Operator']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	public static String attributeSelectArrow2 = "(//label[@title='Attribute']//parent::div//parent::div//span[@class='Select-arrow-zone'])[2]";
	public static String valueSelectArrow2 = "(//label[@title='Value']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	public static String sendOptionSelectArrow2 = "(//label[@title='Send Options']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	public static String useEmialTemplateSelectArrow2 = "(//label[@title='Use Email Template']//parent::div//parent::div//span[@class='Select-arrow'])[2]";
	
	
	
	
	public static String selectAttribute = "//div[@class='Select-menu-outer']//div[@aria-label='Submission Category']";
	public static String selectOperator = "//div[@class='Select-menu-outer']//div[@aria-label='Equals']";
	public static String selectValue = "(//li[@class='multi']//input[@type='checkbox'])[1]";
	public static String selectCatValue2 = "(//li[@class='multi']//input[@type='checkbox'])[2]";
	public static String sendToOption = "//div[@class='Select-menu-outer']//div[@aria-label='Send To']";
	public static String selectUseEmailTemp = "//div[@class='Select-menu-outer']//div[@aria-label='Submission Created']";
	public static String selectedAttribute = "(//input[@name='attribute']//parent::div//span)[1]";
	public static String selectedValue = "(//input[@name='value']//parent::div//span)[1]";
	public static String selectActionValue = "//div[@class='Select-menu-outer']//div[@aria-label='Submission Received']";
	public static String addedRuleCriteria = "(//div[@class='sortable-table__body__td'])[1]";
	
	
	
	public static String selectAttribute1 = "//div[@class='Select-menu-outer']//div[@aria-label='Case Assignee']";
	public static String selectOperator1 = "//div[@class='Select-menu-outer']//div[@aria-label='Equals']";
	public static String selectValu1 = "//div[@class='Select-menu-outer']//div[@aria-label='Logged In User']";
	
	public static String sendToOption1 = "//div[@class='Select-menu-outer']//div[@aria-label='Send To']";
	public static String selectUseEmailTemp1 = "//div[@class='Select-menu-outer']//div[@aria-label='Submission Created']";
	
	
	public static String selectAttribute2 = "//div[@class='Select-menu-outer']//div[@aria-label='Case Notification']";
	public static String selectOperator2 = "//div[@class='Select-menu-outer']//div[@aria-label='Equals']"; 
	public static String selectValu2 = "//div[@class='Select-menu-outer']//div[@aria-label='Inspection Assigned']";
	
	public static String sendToOption2 = "//div[@class='Select-menu-outer']//div[@aria-label='Send To']";
	public static String selectUseEmailTemp2 = "//div[@class='Select-menu-outer']//div[@aria-label='Notice Issued']";
	public static String reciptentOption2 = "//div[@class='Select-menu-outer']//div[@aria-label='Collaborator']";
	
	//public static By ActiveTogglebtn = By.xpath(activeTooglebtn);
	public static By CaseNavigation = By.xpath(caseNavigation);
//	public static By SelectValu2 = By.xpath(selectValu2);
	public static By SelectCatValue2 = By.xpath(selectCatValue2);
    public static By NotificationMangementSideBar = By.xpath(notificationMangementSideBar);
    public static By NotificationHeaderLbl = By.xpath(notificationHeaderLbl);
    public static By CreateNotificationbtn = By.xpath(createNotificationbtn);
    public static By CreateNotificationPopupHeader = By.xpath(createNotificationPopupHeader);
    public static By EditNotificationPopupHeader = By.xpath(createNotificationPopupHeader);
    public static By CancelNotifPopUpbtn = By.xpath(cancelNotifPopUpbtn);
	public static By CreateNotifPopUpbtn = By.xpath(createNotifPopUpbtn); 
	public static By CrtNotifLableNameValidMsg = By.xpath(crtNotifLableNameValidMsg);
	public static By CrtNotifGlobalValidMsg = By.xpath(crtNotifGlobalValidMsg);
	public static By ActiveNotifdetails = By.xpath(activeNotifdetails);
	public static By InActiveNotifdetails = By.xpath(inActiveNotifdetails);
	public static By CrtAddRuleBtn = By.xpath(crtAddRuleBtn);
	public static By CrtRuleAddCriteria = By.xpath(crtRuleAddCriteria);
	public static By CrtCreateRule = By.xpath(crtCreateRule);
	public static By CrtRuleGolbalValidMsg = By.xpath(crtRuleGolbalValidMsg);
	public static By CrtRuleCriteriaValid = By.xpath(crtRuleCriteriaValid); 
	public static By CrtRuleAddDelivery = By.xpath(crtRuleAddDelivery);
	public static By CrtRuleAddDeliveryValid = By.xpath(crtRuleAddDeliveryValid);
	public static By CrtCancelCrtRule = By.xpath(crtCancelCrtRule);
	
	public static By OperatorSelectArrow = By.xpath(operatorSelectArrow);
	public static By AttributeSelectArrow = By.xpath(attributeSelectArrow);
	public static By ValueSelectArrow = By.xpath(valueSelectArrow); 
	public static By SendOptionSelectArrow = By.xpath(sendOptionSelectArrow);
	public static By UseEmialTemplateSelectArrow = By.xpath(useEmialTemplateSelectArrow);
	
	public static By SelectAttribute = By.xpath(selectAttribute);
	public static By SelectOperator = By.xpath(selectOperator);
	public static By SelectValue = By.xpath(selectValue);
	public static By SendToOption = By.xpath(sendToOption);
	public static By SelectUseEmailTemp = By.xpath(selectUseEmailTemp);
	
	public static By SelectedAttribute = By.xpath(selectedAttribute);
	public static By SelectedValue = By.xpath(selectedValue); 
	public static By AddedRuleCriteria = By.xpath(addedRuleCriteria); 
	
	public static By CrtNotificationLableName = By.xpath(crtNotificationLableName);
	public static By CrtNotifActionSelectArrow = By.xpath(actionSelectArrow);
	public static By CrtNotifselectActionValue = By.xpath(selectActionValue);
	public static By CrtNotifDescription = By.xpath(crtNotifDescription);
	public static By CrtNotifPagingNxt = By.xpath(crtNotifPagingNxt);
	public static By CrtNotifGridPageCount = By.xpath(crtNotifGridPageCount);
	public static By CrtNotifInactiveToggle = By.xpath(crtNotifInactiveToggle);
	public static By EditNotifSaveBtn = By.xpath(editNotifSaveBtn);
	public static By CrtNotifActiveToggle = By.xpath(crtNotifActiveToggle);
	public static By ActionSelectArrow1 = By.xpath(actionSelectArrow1);
	
	public static By OperatorSelectArrow1 = By.xpath(operatorSelectArrow1);
	public static By AttributeSelectArrow1 = By.xpath(attributeSelectArrow1);
	public static By ValueSelectArrow1 = By.xpath(valueSelectArrow1);
	public static By SendOptionSelectArrow1 = By.xpath(sendOptionSelectArrow1);
	public static By UseEmialTemplateSelectArrow1 = By.xpath(useEmialTemplateSelectArrow1);
	
	public static By ActionSelectArrow2 = By.xpath(actionSelectArrow2);
	public static By OperatorSelectArrow2 = By.xpath(operatorSelectArrow2);
	public static By AttributeSelectArrow2 = By.xpath(attributeSelectArrow2);
	public static By ValueSelectArrow2 = By.xpath(valueSelectArrow2);
	public static By SendOptionSelectArrow2 = By.xpath(sendOptionSelectArrow2);
	public static By UseEmialTemplateSelectArrow2 = By.xpath(useEmialTemplateSelectArrow2);
	
	
	
	
	
	
	
	
	
	public static String GetCrtRuleValidationbyIndexXPath(int index) {
		String xPath = "(//h2[text()='Define Criteria']//ancestor::div[@class='fields-container tile']//span[@class='field__error'])["+index+"]";
	    return xPath;
	}
	
	public static String GetCrtRuleValidationXPath(int index) {
		String xPath = "//h2[text()='Define Criteria']//ancestor::div[@class='fields-container tile']//span[@class='field__error']";
	    return xPath;
	}
	
	public static String GetActiveNotiificationGridData(int index) {
		String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]";
	    return xPath;
	}
	
	public static String GetActiveNotiificationEditIcon(int index) {
		String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)["+index+"]";
	    return xPath;
	}
	
	
	public static String GetInactiveNotiificationGridData (int index) {
		String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]";
	    return xPath;
	}
	
	public static String GetInactiveNotiificationEditIcon(int index) {
		String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)["+index+"]";
	    return xPath;
	}
	
	public static String SelectCustomeActionValue (String value) {
		String xPath = "//div[@class='Select-menu-outer']//div[@aria-label='"+value+"']";
		return xPath;
	}
	
	
	// Global Variables 
	
	
	public static String ActualnotificationHeader;
	public static String expectednotificationHeader = "Notifications"; 
	
	public static String ActualCrtNotifPopupHeader;
	public static String expectedCrtNotifPopupHeader = "Create Notification";
	public static Boolean PopupClosed; 
	
	
	public static String actualNotifGlobalValidMsg ; 
	public static String expectedNotifGlobalValidMsg = "At least one rule should be present.";
	
	public static String actualLabelNameValid ;
	public static String expectedLableNameValid = "The Name is required."; 
	
	
	public static int actualDefaultActiveNotifCount ; 
	public static int expectedDefaultActiveNotifCount = 5;
	
	public static int actualDefaultInactiveNotifCount ;
	public static int expedtedDefaultInactiveNotifCount = 4;  
	
	public static String selectedAttriVal;
	
	public static String selectedCatVal;
	public static String AddedRuleDesc;
	public static int InactiveNotifCount;
	 public static String expectedAddRuleGlobalValidation = "At least one delivery option should be present." ;
	 public static String actualAddRuleGlobalValidation ;
	 
	 public static String expectedAddRuleAttributValidation = "The Attribute is required." ;
	 public static String actualAddRuleAttributValidation ;
	 
	 public static String expectedAddRuleOperatorValidation = "The Operator is required." ;
	 public static String actualAddRuleOperatorValidation ;
	 
	 public static String expectedAddRuleValueValidation = "The Value is required." ;
	 public static String actualAddRuleValueValidation ;
	 
	 public static String expectedAddRuleSendOptValidation = "The Send Options is required." ;
	 public static String actualAddRuleSendOptValidation ;
	 public static String notificationnLabelName ;
	 public static String notificationnDescription;
	 
	 public static int activeNotifCount;
	 public static int inActiveNotifCount;
	 public static String actualNotifLable;
	 public static String actualNotifdesc;
	 public static int gridIndex;
	 public static String  InactivatedNotif;
	 public static String ActivatNotif;
	 public static int InactiveNotifCountBefore;
	 public static int InactiveNotifCountAfter;
	
	//public static String emailTemplatesLabel ;
	
	 
	 public static void AgencySetup_NotificationPreRequisiteAndDefaultNotificationCount()throws InterruptedException {
		Thread.sleep(10000);
     	//driver.navigate().refresh();
     	WebDriverWaits.ScrollIntoView(CaseNavigation);
     	Thread.sleep(3000);
     	CRMCommonMethods.NavigateTo_AgencySetup();
     	CRMCommonMethods.Navigate_To_NotificationMangement();
     	ActualnotificationHeader = WebDriverWaits.GetText(NotificationHeaderLbl);
     	actualDefaultActiveNotifCount= Integer.parseInt(WebDriverWaits.GetText(ActiveNotifdetails).split(" ")[0]);
     	actualDefaultInactiveNotifCount = Integer.parseInt(WebDriverWaits.GetText(InActiveNotifdetails).split(" ")[0]);
     
	 }
	 
	 public static void AgencySetup_CreateNotificationPopCloseOpenAndValidations() throws InterruptedException {
		 
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ScrollIntoView(CreateNotificationbtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CreateNotificationbtn);
		 Thread.sleep(3000);
		 ActualCrtNotifPopupHeader = WebDriverWaits.GetText(CreateNotificationPopupHeader);
		 Thread.sleep(1000);
		 WebDriverWaits.ScrollIntoView(CancelNotifPopUpbtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CancelNotifPopUpbtn);
		 Thread.sleep(3000);
		 PopupClosed = driver.findElement(By.xpath(notificationHeaderLbl)).isDisplayed(); 
		 Thread.sleep(2000);
		 
		 WebDriverWaits.ScrollIntoView(CreateNotificationbtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CreateNotificationbtn);
		 Thread.sleep(3000);
		 
		 WebDriverWaits.ClickByJsExecuter(CreateNotifPopUpbtn);
		 Thread.sleep(3000); 
		 
		 actualLabelNameValid =  WebDriverWaits.GetText(CrtNotifLableNameValidMsg);
		 actualNotifGlobalValidMsg =  WebDriverWaits.GetText(CrtNotifGlobalValidMsg);
		 
		 
		 
		 
	 } 
	 
	 
	 
	 
	 public static void AgencySetup_CreateNotificationAddRulePopupValidations() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CrtAddRuleBtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtAddRuleBtn);
		 Thread.sleep(3000);
		 
		 WebDriverWaits.ScrollIntoView(CrtRuleAddCriteria);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtRuleAddCriteria);
		 Thread.sleep(2000);
		 
		 WebDriverWaits.ScrollIntoView(CrtCreateRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtCreateRule);
		 Thread.sleep(3000);
		 
		 actualAddRuleGlobalValidation =  WebDriverWaits.GetText(CrtRuleGolbalValidMsg); 
		 
		 ArrayList<String> criteriaValid = new ArrayList<String>();
		 driver.findElements(CrtRuleCriteriaValid)
			.stream()
			.forEach(x -> criteriaValid.add(x.getText()));
		 
		 actualAddRuleAttributValidation = criteriaValid.get(0);
		 actualAddRuleOperatorValidation = criteriaValid.get(1);
		 actualAddRuleValueValidation = criteriaValid.get(2);
		 
		 
		 WebDriverWaits.ScrollIntoView(CrtRuleAddDelivery);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtRuleAddDelivery);
		 Thread.sleep(3000);
		 
		 WebDriverWaits.ScrollIntoView(CrtCreateRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtCreateRule);
		 Thread.sleep(3000); 
		 
		 
		 
		 ArrayList<String> addDeliveryValid = new ArrayList<String>();
		 driver.findElements(CrtRuleAddDeliveryValid)
			.stream()
			.forEach(x -> addDeliveryValid.add(x.getText()));
		 
		 actualAddRuleSendOptValidation = addDeliveryValid.get(0);
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CrtCancelCrtRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtCancelCrtRule);
		 Thread.sleep(2000);
		 
	 }
	 
	 public static void AgencySetup_CreateNotificationAddRule()  throws InterruptedException {
		 
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CrtAddRuleBtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtAddRuleBtn);
		 Thread.sleep(5000);
		 WebDriverWaits.ClickOn(AttributeSelectArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(SelectAttribute);
		 Thread.sleep(1000);
		 
		 selectedAttriVal = WebDriverWaits.GetText(SelectedAttribute);
		 
		 WebDriverWaits.ClickOn(OperatorSelectArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(SelectOperator);
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ClickOn(ValueSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickByJsExecuter(SelectValue);
		 Thread.sleep(1000);
		 
		 selectedCatVal = WebDriverWaits.GetText(SelectedValue);
		 
		 WebDriverWaits.ScrollIntoView(CrtRuleAddDelivery);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtRuleAddDelivery);
		 Thread.sleep(3000);
		 
		 WebDriverWaits.ClickOn(SendOptionSelectArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(SendToOption);
		 Thread.sleep(1000);
		 
		 
		 WebDriverWaits.ClickOn(UseEmialTemplateSelectArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(SelectUseEmailTemp);
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ScrollIntoView(CrtCreateRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtCreateRule);
		 Thread.sleep(3000); 
		 WebDriverWaits.ScrollIntoView(AddedRuleCriteria);
		 Thread.sleep(2000);
		 AddedRuleDesc = WebDriverWaits.GetText(AddedRuleCriteria);
		 
		 
	 }
	 
	 
	
	 public static void AgencySetup_CreateNotificationCreateNotifiction () throws InterruptedException {
		 
		 notificationnLabelName = "Notif" + RandomStrings.RequiredCharacters(3);
		 notificationnDescription = "NDesc" + RandomStrings.RequiredCharacters(3) ;
		 Thread.sleep(4000);
		 WebDriverWaits.SendKeys(CrtNotificationLableName, notificationnLabelName);
		 Thread.sleep(1000);
		 WebDriverWaits.SendKeys(CrtNotifDescription, notificationnDescription); 
		 WebDriverWaits.ClickOn(CrtNotifActionSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(CrtNotifselectActionValue);
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CreateNotifPopUpbtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CreateNotifPopUpbtn);
		 Thread.sleep(8000);
		 WebDriverWaits.ScrollIntoView(ActiveNotifdetails);
		 Thread.sleep(2000);
		 activeNotifCount= Integer.parseInt(WebDriverWaits.GetText(ActiveNotifdetails).split(" ")[0]);
		 int check = driver.findElements(CrtNotifPagingNxt).size();
		 if(check > 0) {
			while(driver.findElement(CrtNotifPagingNxt).isEnabled()) {
				
				WebDriverWaits.ScrollIntoView(CrtNotifPagingNxt);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CrtNotifPagingNxt);
				Thread.sleep(5000);
			}
		 }
		 
		 int pagecount = Integer.parseInt(driver.findElement(CrtNotifGridPageCount).getText().split(" ")[1]);
		 if(pagecount > 1) {
			 for(int i =1 ; i<pagecount;i++) {
				 activeNotifCount = activeNotifCount - 10; 
			 }
		 }
		 
		 gridIndex = activeNotifCount * 5;
	     actualNotifLable = WebDriverWaits.GetText(By.xpath(GetActiveNotiificationGridData(gridIndex - 4 )));
	     actualNotifdesc =  WebDriverWaits.GetText(By.xpath(GetActiveNotiificationGridData(gridIndex - 3 )));
	     Thread.sleep(2000);
	     
	 }
	 
	 
	 public static void clickonCreateNotificationButton () throws InterruptedException {
		 WebDriverWaits.ScrollIntoView(CreateNotificationbtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CreateNotificationbtn);
		 Thread.sleep(3000);
	 }
	 
	 public static void AddRuleWithMultipleCriteraAndDelivery(int criteriaDelCount) throws InterruptedException {
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CrtAddRuleBtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtAddRuleBtn);
		 Thread.sleep(5000); 
		 
		for(int index =1;index < criteriaDelCount; index++) {
		 
		 WebDriverWaits.ScrollIntoView(CrtRuleAddCriteria);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(CrtRuleAddCriteria);
		 Thread.sleep(2000);
		}
		 
		 Thread.sleep(5000);
		 WebDriverWaits.ClickOn(AttributeSelectArrow1);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(By.xpath(selectAttribute1));
		 Thread.sleep(1000);
		 
		
		 
		 WebDriverWaits.ClickOn(OperatorSelectArrow1);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(By.xpath(selectOperator1));
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ClickOn(ValueSelectArrow1);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(By.xpath(selectValu1));
		 Thread.sleep(1000);
		 
		 
		 /////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 WebDriverWaits.ClickOn(AttributeSelectArrow2);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(By.xpath(selectAttribute2));
		 Thread.sleep(1000);
		
		
		 
		 WebDriverWaits.ClickOn(OperatorSelectArrow2);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(By.xpath(selectOperator2));
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ClickOn(ValueSelectArrow2);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(By.xpath(selectValu2));
		 Thread.sleep(1000);
		 
		 
		 for(int index =1;index <= criteriaDelCount; index++) {
			 
			 WebDriverWaits.ScrollIntoView(CrtRuleAddDelivery);
			 Thread.sleep(2000);
			 WebDriverWaits.ClickByJsExecuter(CrtRuleAddDelivery);
			 Thread.sleep(3000);
			}
		 
		 WebDriverWaits.ClickOn(By.xpath(sendOptionSelectArrow1));
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(By.xpath(sendToOption1));
		 Thread.sleep(2000);
		 
		 
		 WebDriverWaits.ClickOn(By.xpath(useEmialTemplateSelectArrow1));
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(By.xpath(selectUseEmailTemp1));
		 Thread.sleep(2000);
		 
		 WebDriverWaits.ClickOn(By.xpath(sendOptionSelectArrow2));
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(By.xpath(sendToOption2));
		 Thread.sleep(2000);
		 
		 WebDriverWaits.ClickOn(By.xpath(recipentArrow2));
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(By.xpath(reciptentOption2));
		 Thread.sleep(2000);
		 
		 WebDriverWaits.ClickOn(By.xpath(useEmialTemplateSelectArrow2));
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(By.xpath(selectUseEmailTemp2));
		 Thread.sleep(2000);
 
	
		
			 WebDriverWaits.ScrollIntoView(CrtCreateRule);
			 Thread.sleep(2000);
			 WebDriverWaits.ClickByJsExecuter(CrtCreateRule);
			 Thread.sleep(5000); 
			 
 
	 }
	
	 public static void AgencySetup_CreateNotifictionMultipleCriteriaDeliveryOption() throws InterruptedException{
		 
		 clickonCreateNotificationButton();
		 WebDriverWaits.ClickOn(CrtNotifActionSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(By.xpath(SelectCustomeActionValue("Code Case Management")));
		 Thread.sleep(2000);
		 AddRuleWithMultipleCriteraAndDelivery(2);
		 AgencySetup_CreateNotificationCreateNotifiction();
		 
	 }
	
	 
	 public static int GetInactiveGridIndex() throws InterruptedException {
		 WebDriverWaits.ScrollIntoView(InActiveNotifdetails);
		 Thread.sleep(2000);
		 InactiveNotifCount = Integer.parseInt(WebDriverWaits.GetText(InActiveNotifdetails).split(" ")[0]);
		 gridIndex = InactiveNotifCount * 5;
		 return gridIndex;
		 
	 }
	 
	 public static int GetActiveGridIndex() throws InterruptedException {
		 
		 WebDriverWaits.ScrollIntoView(ActiveNotifdetails);
		 Thread.sleep(2000);
		 activeNotifCount= Integer.parseInt(WebDriverWaits.GetText(ActiveNotifdetails).split(" ")[0]);
		 int check = driver.findElements(CrtNotifPagingNxt).size();
		 if(check > 0) {
			while(driver.findElement(CrtNotifPagingNxt).isEnabled()) {
				
				WebDriverWaits.ScrollIntoView(CrtNotifPagingNxt);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CrtNotifPagingNxt);
				Thread.sleep(5000);
			}
		 }
		 
		 int pagecount = Integer.parseInt(driver.findElement(CrtNotifGridPageCount).getText().split(" ")[1]);
		 if(pagecount > 1) {
			 for(int i =1 ; i<pagecount;i++) {
				 activeNotifCount = activeNotifCount - 10; 
			 }
		 }
		 
		 return activeNotifCount;
		 
	 }
	 
	 public static String actualEditNotificationHeader ;
	 public static String expectedEditNotificationHeader ="Edit Notification";
	 public static void AgencySetup_CreateNotificationInactivateActiveNotificatiion() throws InterruptedException{
		 
	     Thread.sleep(2000);
		 gridIndex = GetActiveGridIndex();
		 ActivatNotif = WebDriverWaits.GetText(By.xpath(GetActiveNotiificationGridData((gridIndex * 5)-4)));
		 WebDriverWaits.ScrollIntoView(InActiveNotifdetails);
		 Thread.sleep(2000);
		 InactiveNotifCountBefore = Integer.parseInt(WebDriverWaits.GetText(InActiveNotifdetails).split(" ")[0]);
	     Thread.sleep(2000);
	     WebDriverWaits.ScrollIntoView(By.xpath(GetActiveNotiificationEditIcon(gridIndex)));
	     Thread.sleep(2000);
	     WebDriverWaits.ClickByJsExecuter(By.xpath(GetActiveNotiificationEditIcon(gridIndex)));
	     Thread.sleep(3000);
	     actualEditNotificationHeader = WebDriverWaits.GetText(EditNotificationPopupHeader);
	     WebDriverWaits.ClickOn(CrtNotifInactiveToggle);
	     Thread.sleep(1000);
	     WebDriverWaits.ScrollIntoView(EditNotifSaveBtn);
	     Thread.sleep(2000);
	     WebDriverWaits.ClickOn(EditNotifSaveBtn);
	     Thread.sleep(5000);
	     Thread.sleep(2000);
		 InactiveNotifCountAfter = Integer.parseInt(WebDriverWaits.GetText(InActiveNotifdetails).split(" ")[0]);
	     InactivatedNotif = WebDriverWaits.GetText(By.xpath(GetInactiveNotiificationGridData(GetInactiveGridIndex() - 4)));
	     Thread.sleep(2000);
	 }
	 
	 public static String InactiveNotif;
	 public static String ActivatedNotif;
	 
	 public static int ActiveNotifCountBefore;
	 public static int ActiveNotifCountAfter;
	 
 public static void AgencySetup_CreateNotificationActivateInactiveNotificatiion() throws InterruptedException{
		 
	     Thread.sleep(2000);
	     InactiveNotif = WebDriverWaits.GetText(By.xpath(GetInactiveNotiificationGridData(GetInactiveGridIndex() - 4)));
		 WebDriverWaits.ScrollIntoView(ActiveNotifdetails);
		 Thread.sleep(2000);
		 ActiveNotifCountBefore = Integer.parseInt(WebDriverWaits.GetText(ActiveNotifdetails).split(" ")[0]);
	     Thread.sleep(2000);
	     int inactivebtnindex = GetInactiveGridIndex() / 5;
	     WebDriverWaits.ScrollIntoView(By.xpath(GetInactiveNotiificationEditIcon(inactivebtnindex)));
	     Thread.sleep(2000);
	     WebDriverWaits.ClickByJsExecuter(By.xpath(GetInactiveNotiificationEditIcon(inactivebtnindex)));
	     Thread.sleep(3000);
	     WebDriverWaits.ClickOn(CrtNotifActiveToggle);
	     Thread.sleep(1000);
	     WebDriverWaits.ScrollIntoView(EditNotifSaveBtn);
	     Thread.sleep(2000);
	     WebDriverWaits.ClickOn(EditNotifSaveBtn);
	     Thread.sleep(5000);
	     Thread.sleep(2000);
	     WebDriverWaits.ScrollIntoView(ActiveNotifdetails);
	     Thread.sleep(2000);
	     ActiveNotifCountAfter = Integer.parseInt(WebDriverWaits.GetText(ActiveNotifdetails).split(" ")[0]);
	     gridIndex = GetActiveGridIndex();
	     ActivatedNotif = WebDriverWaits.GetText(By.xpath(GetActiveNotiificationGridData((gridIndex *5) - 4)));
	     Thread.sleep(2000);
	 }
	 
	 

}
