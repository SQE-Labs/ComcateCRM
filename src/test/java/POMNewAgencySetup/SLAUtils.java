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
import POMNewAgencySetup.NotificationMangementUtils;


public class SLAUtils extends AgencyCreationUtils {
    
	
	
	public static String sLASideBar = "//label[text()='SLA']";
	public static String sLAName = "//input[@name='label']";
	public static String sLADescription = "//input[@name='description']";
	public static String sLaHeaderLabel = "//div[text()='SLA']";
	public static String createSLABtn = "//button[text()='Create SLA']";
	public static String  crtSLAHeaderPopup = "//div[@class='modal-header']//h1[text()='Create SLA']";
	public static String crtSLACancel = "//div[@class='modal-header']//button[text()='Cancel']";
	public static String crtSLACreateSLA = "//div[@class='modal-header']//button[text()='Create SLA']";
	public static String editSLASave = "//div[@class='modal-header']//button[text()='Save']";
	public static String crtSLANameValid = "(//span[@class='field__error'])[1]";
	public static String  crtSLAGlobalValid = "(//div[@class='modal-body']/div)[1]";
	public static String crtSLAddRuleBtn = "//button[text()='Add Rule']";
	public static String crtSLACrtRuleHeader = "//h1[text()='Create Rule']";
	public static String crtRuleCncel = "//h1[text()='Create Rule']//parent::div//button[text()='Cancel']";
	public static String crtRuleCreateRule = "//h1[text()='Create Rule']//parent::div//button[text()='Create Rule']";
	public static String crtRuleSpecifyActValid = "//h2[text()='Specify Action']//ancestor::div[@class='fields-container tile']//span[@class='field__error']";
	public static String closeCriteria = "(//div[@class='close-icon'])[2]";
	public static String esclateToSelectArrow = "//label[@title='Escalate To']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String selectEsclateValue = "(//li[@class='multi']//input[@type='checkbox'])[1]";
	
	public static String freqSendingArrow = "//label[@title='Frequency of Sending Notifications']//parent::div//parent::div//span[@class='Select-arrow']";
	public static String freqSendingValue = "//div[@class='Select-menu-outer']//div[@aria-label='Daily']";
	public static String editRule = "(//h2[text()='Rules Set']//ancestor::div[@class='fields-container tile']//button)[2]";
	public static String editSaveRule = "//h1[text()='Edit Rule']//ancestor::div[@class='modal-header']//button[text()='Save']";
	public static String activeSLADet = "//h2[contains(text(),'Active')]";
	public static String existingErrorTemplate = "//div[contains(text(),'Duplicate name. Please use a different name.')]";
	public static String inactiveToggle = "//button[text()='Inactive']";
	public static String inActiveSLADet = "//h2[contains(text(),'Inactive')]";
	public static String activeToggle = "//button[text()='Active']";
	
	
	
	public static By SLASideBar = By.xpath(sLASideBar);
	public static By InActiveSLADet = By.xpath(inActiveSLADet);
	public static By InactiveToggle  = By.xpath(inactiveToggle);
	public static By ActiveToggle = By.xpath(activeToggle);
	public static By ExistingErrorTemplate = By.xpath(existingErrorTemplate);
	public static By EditSLASave = By.xpath(editSLASave);
	public static By ActiveSLADet = By.xpath(activeSLADet);
	public static By EditSaveRule = By.xpath(editSaveRule);
	public static By SLADescription = By.xpath(sLADescription);
	public static By SLAName  = By.xpath(sLAName);
	public static By SLaHeaderLabel = By.xpath(sLaHeaderLabel);
	public static By CreateSLABtn = By.xpath(createSLABtn);
	public static By CrtSLAHeaderPopup = By.xpath(crtSLAHeaderPopup);
	public static By CrtSLACancel = By.xpath(crtSLACancel);
	public static By CrtSLACreateSLA = By.xpath(crtSLACreateSLA);
	public static By CrtSLANameValid = By.xpath(crtSLANameValid);
	public static By CrtSLAGlobalValid = By.xpath(crtSLAGlobalValid);
	public static By CrtSLAddRuleBtn = By.xpath(crtSLAddRuleBtn);
	public static By CrtSLACrtRuleHeader = By.xpath(crtSLACrtRuleHeader);
	public static By CrtRuleCncel = By.xpath(crtRuleCncel);
	public static By CrtRuleCreateRule = By.xpath(crtRuleCreateRule);
	public static By CrtRuleSpecifyActValid = By.xpath(crtRuleSpecifyActValid);
	public static By CloseCriteria = By.xpath(closeCriteria);
	public static By EsclateToSelectArrow = By.xpath(esclateToSelectArrow);
	public static By SelectEsclateValue = By.xpath(selectEsclateValue);
	public static By FreqSendingArrow = By.xpath(freqSendingArrow);
	public static By FreqSendingValue = By.xpath(freqSendingValue);
	public static By EditRule = By.xpath(editRule);
	// Global Variables 
	
	//public static String emailTemplatesLabel ;
	public static String ActualSLAHeader ;
	public static String expectedSLAHeader = "SLA" ;
	public static String actualSLApopHeader ;
	public static String expectedSLApopHeader = "Create SLA" ;
	public static int SLApopHeader;
	
	public static String actualGlobalValidSLA ;
	public static String expectedGlobalValidSLA = "At least one rule should be present.";
	
	public static String actualNameValidSLA ;
	public static String expectedNameValidSLA = "The Name is required.";
	
	public static String actualcrtRuleHeader ; 
	public static String expectedCrtRuleHeader = "Create Rule";

	 public static void AgencySetup_SLAPreRequisite()throws InterruptedException {
		    Thread.sleep(10000);
	     	//driver.navigate().refresh();
	     	WebDriverWaits.ScrollIntoView(NotificationMangementUtils.CaseNavigation);
	     	Thread.sleep(3000);
	     	CRMCommonMethods.NavigateTo_AgencySetup();
	     	CRMCommonMethods.Navigate_To_SLA();
	     	ActualSLAHeader = WebDriverWaits.GetText(SLaHeaderLabel);
	     	
	 }
	 
	 public static void AgencySetup_CreateSLAPopupOpenAndClose() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CreateSLABtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CreateSLABtn);
		 Thread.sleep(4000);
		 
		 actualSLApopHeader = WebDriverWaits.GetText(CrtSLAHeaderPopup);
		 WebDriverWaits.ScrollIntoView(CrtSLACancel);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtSLACancel);
		 Thread.sleep(4000);
		 SLApopHeader = driver.findElements(CrtSLAHeaderPopup).size();
		 
		 
	 }
	 
	 
	 public static int actualcrtRuleHeader1;
	
	 public static void AgencySetup_CreateSLAPopupValidatiions() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(CreateSLABtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CreateSLABtn);
		 Thread.sleep(4000);
		 WebDriverWaits.ScrollIntoView(CrtSLACreateSLA);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtSLACreateSLA);
		 Thread.sleep(3000);
		 actualNameValidSLA = WebDriverWaits.GetText(CrtSLANameValid);
		 actualGlobalValidSLA = WebDriverWaits.GetText(CrtSLAGlobalValid);
		 Thread.sleep(2000);
		 		 
	 }
	 
	 

	 
	 
	 
	 public static String actualAddRuleAttributValidation;
	 public static String actualAddRuleOperatorValidation;
	 public static String actualAddRuleValueValidation;
	 
	 public static String actualEsclatToValidation;
	 public static String UseTemplateValidation;
	 public static String actualFreqSendingValidation;
	 
	 
	 
	 public static String expectedAddRuleAttributValidation = "The Attribute is required.";
	 public static String expectedAddRuleOperatorValidation = "The Operator is required.";
	 public static String expectedAddRuleValueValidation = "The Value is required.";
	 
	 public static String expectedEsclatToValidation = "The Escalate To is required.";
	 public static String expectedUseTemplateValidation = "The Template is required.";
	 public static String expectedFreqSendingValidation = "The Frequency is required.";
	 
	 public static void AgencySetup_CreateSLAAddRuleValidations() throws InterruptedException {
		 
		 WebDriverWaits.ScrollIntoView(CrtSLAddRuleBtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtSLAddRuleBtn);
		 Thread.sleep(3000);
		 actualcrtRuleHeader = WebDriverWaits.GetText(CrtSLACrtRuleHeader);
		 WebDriverWaits.ScrollIntoView(CrtRuleCncel);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtRuleCncel);
		 Thread.sleep(3000);
		 actualcrtRuleHeader1 = driver.findElements(CrtSLACrtRuleHeader).size();
		 Thread.sleep(1000);
		 WebDriverWaits.ScrollIntoView(CrtSLAddRuleBtn);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtSLAddRuleBtn);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(NotificationMangementUtils.CrtRuleAddCriteria);
		 Thread.sleep(3000);
		 WebDriverWaits.ScrollIntoView(CrtRuleCreateRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CrtRuleCreateRule);
		 Thread.sleep(3000);
		 ArrayList<String> criteriaValid = new ArrayList<String>();
		 driver.findElements(NotificationMangementUtils.CrtRuleCriteriaValid)
			.stream()
			.forEach(x -> criteriaValid.add(x.getText()));
		 
		 actualAddRuleAttributValidation = criteriaValid.get(3);
		 actualAddRuleOperatorValidation = criteriaValid.get(4);
		 actualAddRuleValueValidation = criteriaValid.get(5); 
		 
		 
		 WebDriverWaits.ScrollIntoView(CrtRuleSpecifyActValid);
		 Thread.sleep(2000);
		 ArrayList<String> specifyActValid = new ArrayList<String>();
		 driver.findElements(CrtRuleSpecifyActValid)
			.stream()
			.forEach(x -> specifyActValid.add(x.getText()));
		 
		 actualEsclatToValidation = specifyActValid.get(2);
		 UseTemplateValidation = specifyActValid.get(4);
		 actualFreqSendingValidation = specifyActValid.get(5); 
		 
		 Thread.sleep(2000);
	 }
	 
	 public static String selectedAttriVal;
	 public static String selectedCatVal;
	 public static String AddedRuleDesc;
	 public static void AgencySetup_CreateSLA_AddRule() throws InterruptedException {
		 Thread.sleep(1000);
		 WebDriverWaits.ScrollIntoView(CloseCriteria);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(CloseCriteria);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(NotificationMangementUtils.ValueSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickByJsExecuter(NotificationMangementUtils.SelectValue);
		 Thread.sleep(1000);
		 
		 selectedAttriVal = WebDriverWaits.GetText(NotificationMangementUtils.SelectedAttribute);
		 selectedCatVal = WebDriverWaits.GetText(NotificationMangementUtils.SelectedValue);
		 
		 
		 WebDriverWaits.ClickOn(EsclateToSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickByJsExecuter(SelectEsclateValue);
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ClickOn(NotificationMangementUtils.UseEmialTemplateSelectArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(NotificationMangementUtils.SelectUseEmailTemp);
		 Thread.sleep(1000);
		 
		 
		 
		 WebDriverWaits.ClickOn(FreqSendingArrow);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickOn(FreqSendingValue);
		 Thread.sleep(1000);
		 
		 WebDriverWaits.ScrollIntoView(NotificationMangementUtils.CrtCreateRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickByJsExecuter(NotificationMangementUtils.CrtCreateRule);
		 Thread.sleep(3000); 
		 WebDriverWaits.ScrollIntoView(NotificationMangementUtils.AddedRuleCriteria);
		 Thread.sleep(2000);
		 AddedRuleDesc = WebDriverWaits.GetText(NotificationMangementUtils.AddedRuleCriteria);
		 
		 Thread.sleep(2000);
		 
	 }
	 
	 
	 
	 public static String EdditedRuleDesc;
	 public static void AgencySetup_CreateSLA_EditAddRule() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 WebDriverWaits.ScrollIntoView(EditRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(EditRule);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(NotificationMangementUtils.ValueSelectArrow);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickByJsExecuter(NotificationMangementUtils.SelectValue);
		 Thread.sleep(1000);
		 WebDriverWaits.ClickByJsExecuter(NotificationMangementUtils.SelectCatValue2);
		 Thread.sleep(3000);
		 WebDriverWaits.ClickOn(NotificationMangementUtils.ValueSelectArrow);
		 Thread.sleep(3000);
		 selectedCatVal = WebDriverWaits.GetText(NotificationMangementUtils.SelectedValue);
		 
		 WebDriverWaits.ScrollIntoView(EditSaveRule);
		 Thread.sleep(2000);
		 WebDriverWaits.ClickOn(EditSaveRule);
		 Thread.sleep(4000);
		 WebDriverWaits.ScrollIntoView(NotificationMangementUtils.AddedRuleCriteria);
		 Thread.sleep(2000);
		 EdditedRuleDesc = WebDriverWaits.GetText(NotificationMangementUtils.AddedRuleCriteria);
		 
		 Thread.sleep(2000);
		 
		 
	 }
	 
	 
	 
	 
	  public static String sLALableName ;
	  public static String actualSLAName ;
	  public static String sLADesription ;
	  public static String actuaalsLADesription;
	  public static int AfteractiveSLACount;
	  public static int BeforeactiveSLACount;
	  public static String newAddedSLA ;
	  
	  public static String GetActiveSLAGridData(int index) {
			String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]";
		    return xPath;
		}
	  
       public static void AgencySetup_CreateSLA() throws InterruptedException
       {
	
	    Thread.sleep(2000);
	    WebDriverWaits.ScrollIntoView(ActiveSLADet);
	    Thread.sleep(2000);
	    BeforeactiveSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
	    
	    
	    sLALableName = "SLA"+ RandomStrings.RequiredCharacters(4);
	    Thread.sleep(3000);
	    
	    WebDriverWaits.SendKeys(SLAName, sLALableName);
	    Thread.sleep(1000);
	    sLADesription = "SLADesc"+ RandomStrings.RequiredCharacters(4);
	    WebDriverWaits.SendKeys(SLADescription, sLADesription);
	    
	    WebDriverWaits.ScrollIntoView(CrtSLACreateSLA);
	    Thread.sleep(2000);
	    WebDriverWaits.ClickOn(CrtSLACreateSLA);
	    Thread.sleep(4000);
	    
	    WebDriverWaits.ScrollIntoView(ActiveSLADet);
	    Thread.sleep(2000);
	    AfteractiveSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
	    int gridindx = 4 * AfteractiveSLACount; 
	    
	    newAddedSLA = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 3)));
	    
	    Thread.sleep(1000);
	    
	
     }
       
       
       
       public static String GetActiveSLAEditIcon(int index) {
    	   
   		String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)["+index+"]";
   	    return xPath;
   	    
   	}
   	
       
       
       
       public static String newEditSLA;
       public static String EditsLADesription;
    public static void AgencySetup_EditSLA() throws InterruptedException {
	
    	Thread.sleep(2000);
	    WebDriverWaits.ScrollIntoView(ActiveSLADet);
	    Thread.sleep(2000);
	    BeforeactiveSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
	    int indx = BeforeactiveSLACount;
	    WebDriverWaits.ClickOn(By.xpath(GetActiveSLAEditIcon(indx)));
	    Thread.sleep(4000);
	    sLALableName = "EditSLA"+ RandomStrings.RequiredCharacters(4);
	    Thread.sleep(3000);
	    WebDriverWaits.Clear(SLAName);
	    Thread.sleep(2000);
	    WebDriverWaits.SendKeys(SLAName, sLALableName);
	    Thread.sleep(1000);
	    WebDriverWaits.Clear(SLADescription);
	    Thread.sleep(2000);
	    sLADesription = "EditSLADesc"+ RandomStrings.RequiredCharacters(4);
	    WebDriverWaits.SendKeys(SLADescription, sLADesription);
	    
	    WebDriverWaits.ScrollIntoView(EditSLASave);
	    Thread.sleep(2000);
	    WebDriverWaits.ClickOn(EditSLASave);
	    Thread.sleep(4000);
	    
	    WebDriverWaits.ScrollIntoView(ActiveSLADet);
	    Thread.sleep(2000);
	    AfteractiveSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
	    int gridindx = 4 * AfteractiveSLACount; 
	    
	    newEditSLA = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 3)));
	    EditsLADesription = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 2)));
	    
	    Thread.sleep(1000);
	    
	
     }
    
    
    public static String existingSLAName ;
    public static String existingsLADesription;
    public static String expectedduplicatErrorMessage = "Duplicate name. Please use a different name.";
    public static String actualErrorMsg;
    
    public static void AgencySetup_ErrorMessageAppearCreatingExistingSLAName() throws InterruptedException{
    	
    	Thread.sleep(3000);
    	WebDriverWaits.ScrollIntoView(ActiveSLADet);
 	    Thread.sleep(2000);
 	    AfteractiveSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
 	    int gridindx = 4 * AfteractiveSLACount; 
    	existingSLAName = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 3)));
    	existingsLADesription = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 2)));
 	    
    	WebDriverWaits.ScrollIntoView(CreateSLABtn);
    	Thread.sleep(2000);
    	WebDriverWaits.ClickOn(CreateSLABtn);
    	Thread.sleep(3000);
    	WebDriverWaits.SendKeys(SLAName, existingSLAName);
 	    Thread.sleep(2000);
 	    WebDriverWaits.SendKeys(SLADescription, existingsLADesription);
 	   AgencySetup_CreateSLAAddRuleValidations();
 	   AgencySetup_CreateSLA_AddRule();
 	   WebDriverWaits.ScrollIntoView(CrtSLACreateSLA);
	    Thread.sleep(2000);
	    WebDriverWaits.ClickOn(CrtSLACreateSLA);
	    Thread.sleep(3000);
 	   
 	   
 	  actualErrorMsg = WebDriverWaits.GetText(ExistingErrorTemplate);
	  Thread.sleep(1000);
 	  WebDriverWaits.ScrollIntoView(CrtSLACancel);
 	  Thread.sleep(2000);
 	  WebDriverWaits.ClickOn(CrtSLACancel);
 	  Thread.sleep(3000);
 	  
    	
    	
    }
    
    
	
	public static String GetInactiveSLAGridData (int index) {
		String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]";
	    return xPath;
	}
	
	public static String GetInactiveSLAEditIcon(int index) {
		String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)["+index+"]";
	    return xPath;
	}
	
    
	
	public static String activeSLAName;
	public static String inactivateSLA;
	public static int activeSLACount;
	public static int inactiveSLACount;
	public static int inactiveSLACountBefore;
	
    public static void AgencySetup_InactivteActiveSLA() throws InterruptedException {
    	
    	WebDriverWaits.ScrollIntoView(InActiveSLADet);
	    Thread.sleep(2000);
	    inactiveSLACountBefore = Integer.parseInt(WebDriverWaits.GetText(InActiveSLADet).split(" ")[0]);
    	Thread.sleep(3000);
    	
    	WebDriverWaits.ScrollIntoView(ActiveSLADet);
 	    Thread.sleep(2000);
 	    activeSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
 	    int gridindx = 4 * activeSLACount; 
 	   activeSLAName = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 3)));
 	   
 	   WebDriverWaits.ScrollIntoView(By.xpath(GetActiveSLAEditIcon(activeSLACount)));
 	   Thread.sleep(2000);
 	   WebDriverWaits.ClickOn(By.xpath(GetActiveSLAEditIcon(activeSLACount)));
	   Thread.sleep(4000);
	   WebDriverWaits.ScrollIntoView(InactiveToggle);
	   Thread.sleep(2000);
	   WebDriverWaits.ClickOn(InactiveToggle);
	   WebDriverWaits.ScrollIntoView(EditSLASave);
	    Thread.sleep(2000);
	   WebDriverWaits.ClickOn(EditSLASave);
	   Thread.sleep(4000);
	   
	   WebDriverWaits.ScrollIntoView(InActiveSLADet);
	   Thread.sleep(2000);
	   inactiveSLACount = Integer.parseInt(WebDriverWaits.GetText(InActiveSLADet).split(" ")[0]);
	   int indx = 4 * inactiveSLACount; 
	   inactivateSLA = WebDriverWaits.GetText(By.xpath(GetInactiveSLAGridData(indx - 3)));
	   Thread.sleep(2000);
	   
    }
    
    
    
    public static String inactiveSLAName;
	public static String ActivateSLA;
	public static int activeSLACountBefore;
	
    public static void AgencySetup_ActivateInactiveSLA() throws InterruptedException {
    	Thread.sleep(3000);
       WebDriverWaits.ScrollIntoView(ActiveSLADet);
 	   Thread.sleep(2000);
 	   activeSLACountBefore = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
 	   
 	   WebDriverWaits.ScrollIntoView(InActiveSLADet);
	   Thread.sleep(2000);
	   inactiveSLACount = Integer.parseInt(WebDriverWaits.GetText(InActiveSLADet).split(" ")[0]);
	   int indx = 4 * inactiveSLACount; 
	   inactivateSLA = WebDriverWaits.GetText(By.xpath(GetInactiveSLAGridData(indx - 3)));
	   Thread.sleep(2000); 	   
 	   WebDriverWaits.ScrollIntoView(By.xpath(GetInactiveSLAEditIcon(inactiveSLACount)));
 	   Thread.sleep(2000);
 	   WebDriverWaits.ClickOn(By.xpath(GetInactiveSLAEditIcon(inactiveSLACount)));
	   Thread.sleep(4000);
	   WebDriverWaits.ScrollIntoView(ActiveToggle);
	   Thread.sleep(2000);
	   WebDriverWaits.ClickOn(ActiveToggle);
	   WebDriverWaits.ScrollIntoView(EditSLASave);
	    Thread.sleep(2000);
	   WebDriverWaits.ClickOn(EditSLASave);
	   Thread.sleep(4000);
	   
	   WebDriverWaits.ScrollIntoView(ActiveSLADet);
 	   Thread.sleep(2000);
 	   activeSLACount = Integer.parseInt(WebDriverWaits.GetText(ActiveSLADet).split(" ")[0]);
 	   
 	   int gridindx = 4 * activeSLACount; 
 	   WebDriverWaits.ScrollIntoView(By.xpath(GetActiveSLAGridData(gridindx - 3)));
 	   Thread.sleep(3000);
	   activeSLAName = WebDriverWaits.GetText(By.xpath(GetActiveSLAGridData(gridindx - 3)));
	   Thread.sleep(2000);
    }
       
	    
    
    
    
    
    
    
    
    
    
    
    
       
	    
	    
 
	 

}
