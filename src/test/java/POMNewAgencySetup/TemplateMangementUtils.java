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


public class TemplateMangementUtils extends AgencyCreationUtils {
    
	
	public static String loggedUserName = "//div[@class='app-header__user-name']//label";
	public static String templateManagementSideBarTab = "//label[text()='Template Management']";
	public static String textTemplatesTab = "//div[@class='tab-name ']";
	public static String createTemplateBtn = "//h2[contains(text(),'Active')]//parent::div//button";
	public static String emailTemplatesTab = "//div[@class='tab-name ']//preceding-sibling::div";
	public static String createTemplatePopupHeader = "//div[@class='modal-header']//h1";  
	
	public static String inactiveTemplate = "//h2[contains(text(),'Inactive')]";
	
	public static String cancelCrtTemplate = "//button[text()='Cancel']";
	public static String saveCrtTemplate="//button[text()='Save']";
	public static String templateNameTxt = "//input[@name='name']";
	public static By TemplateNameTxt = By.xpath(templateNameTxt);
	public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	public static By IncludeMagicLinkchk = By.xpath("//input[@name='MagicLinkToggle'][@type='checkbox']");
	public static By PreviewTemplateBtn = By.xpath("//button[text()='Preview']"); 
	public static By PreviewTempHeader = By.xpath("(//div[@class='modal-header'])[2]");
	public static By PreviewTemplateBdyMesg = By.xpath("(//div[@class='modal-header'])[2]//following-sibling::div//p");
	public static By ClosePreview = By.xpath("//button[text()='Close']"); 
	public static By IframeBody = By.xpath("//iframe[@id='editor_ifr']"); 
	public static String activeTooglebtn = "//button[text()='Active']";
	public static String inactiveTooglebtn = "//button[text()='Inactive']";
	
	public static String ExistingErrorTemplate = "//div[contains(text(),'Error while creating config email template')]";
	
	
	public static By ActiveTogglebtn = By.xpath(activeTooglebtn);
	public static By InactiveTooglebtn = By.xpath(inactiveTooglebtn);
	
	public static By EmailTemplatesTab = By.xpath(emailTemplatesTab);
	public static By CreateTemplateBtn = By.xpath(createTemplateBtn);
	public static By TextTemplatesTab = By.xpath(textTemplatesTab);
	public static By TemplateManagementSideBarTab = By.xpath(templateManagementSideBarTab); 
	public static By CreateTemplatePopupHeader = By.xpath(createTemplatePopupHeader);
	public static By CancelCrtTemplate = By.xpath(cancelCrtTemplate);
	public static By SaveCrtTemplate = By.xpath(saveCrtTemplate);
	public static By LoggedUserName = By.xpath(loggedUserName);
	public static By InactiveTemplate = By.xpath(inactiveTemplate);
	
	
	public static String nameValidMsg = "";
	public static String emailSubLineValidMsg = "";
	public static String emailBdyValidMsg = "//label[@class='html-editor__error']"; 
	public static String emailSubLineInput = "//input[@name='subject']";
	
	
	
	public static By EmailBdyValidMsg = By.xpath(emailBdyValidMsg); 
	public static By EmailSubLineInput = By.xpath(emailSubLineInput);
	
	
	
	
	
	
	
	
	// Global Variables 
	
	public static String emailTemplatesLabel ;
	public static String TextMessageTemplateLabel;
	public static String CrtTemplateHeader;
	public static Boolean ClosedCrtTemplatePopup;
	public static String ActualNameValidMsg ;
	public static String ActualEmailSubLineValidMsg ; 
	public static String ActualEmailBdyValidMsg ; 
	public static String EmailSubLnMsg ;
	public static String templateName;
	public static String rndSubLine; 
	public static String TemplateMessgae;
	public static String ActualpreviewTempData;
	public static String ExpectedpreviewTemplateData ;
	public static String ActualpreviewTempHeader;
	public static String LoggedUser;
	
	
	public static String ExpectedpreviewTemplateHeader  = "Preview Email Template";
	public static String ExpectedNameValidMsg = "The Name is required.";
	public static String ExpectedEmailSubLineValidMsg = "Min 1 and Max 150 characters limit.";
	public static String ExpectedEmailBdyValidMsg = "The Email Body is required.";  
	public static String ExpectedemailTemplatesLabel = "Email Templates" ;
	public static String ExpectedTextMessageTemplateLabel = "Text Message Templates";
	public static String ExpectedCrtTemplateHeader = "Create Template";
	
	
	
	        public static void TemplateMangement_PreRequisite() throws InterruptedException {
	        	driver.navigate().refresh();
	        	Thread.sleep(10000);
	        	WebDriverWaits.scrolltoUp();
	        	CRMCommonMethods.NavigateTo_AgencySetup();
	        	CRMCommonMethods.NavigateTo_TemplateManagement();
	        	emailTemplatesLabel = WebDriverWaits.GetText(EmailTemplatesTab);
	        	TextMessageTemplateLabel = WebDriverWaits.GetText(TextTemplatesTab); 
	        	LoggedUser = WebDriverWaits.GetText(LoggedUserName);
	        }
	 
			public static void TemplateMangement_CloseandOpenCreateTemplatePOpup() throws InterruptedException {
				Thread.sleep(3000);
				WebDriverWaits.ScrollIntoView(CreateTemplateBtn);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CreateTemplateBtn);
				Thread.sleep(2000); 
				CrtTemplateHeader = WebDriverWaits.GetText(CreateTemplatePopupHeader);
				Thread.sleep(8000);
				WebDriverWaits.ScrollIntoView(CancelCrtTemplate);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CancelCrtTemplate);
				Thread.sleep(4000);
				ClosedCrtTemplatePopup = (driver.findElements(CreateTemplatePopupHeader).size() == 0);
				Thread.sleep(2000);
			}
			
			
			
			
			public static String GetCustomXPath (int index) { 
				String xpath = "(//span[@class='field__error'])["+index+"]" ;
				return xpath;
			}
			
			public static void TemplateMangement_VerifyValidationsOnCreateTemplatePOpup() throws InterruptedException, AWTException {
				
				Thread.sleep(3000);
				WebDriverWaits.ScrollIntoView(CreateTemplateBtn);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CreateTemplateBtn);
				Thread.sleep(4000); 
				
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate);
				Thread.sleep(2000);
				nameValidMsg = GetCustomXPath(1);
				emailSubLineValidMsg = GetCustomXPath(3);
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(4000);
				ActualNameValidMsg = WebDriverWaits.FindElementByXPath(nameValidMsg).getText();
				Thread.sleep(1000);
				ActualEmailSubLineValidMsg = WebDriverWaits.FindElementByXPath(emailSubLineValidMsg).getText();
				WebDriverWaits.ScrollIntoView(EmailBdyValidMsg);
				Thread.sleep(3000);
				ActualEmailBdyValidMsg = WebDriverWaits.GetText(EmailBdyValidMsg);
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(EmailSubLineInput);
				String rng = RandomStrings.RequiredString(151);
				Thread.sleep(5000);
				WebDriverWaits.SendKeys(EmailSubLineInput, rng);
				Thread.sleep(5000);
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(4000);
				EmailSubLnMsg = WebDriverWaits.FindElementByXPath(emailSubLineValidMsg).getText();
				Thread.sleep(2000);
				
			}
			
			public static String AddDocument = "//label[text()='Add Related Documents']"; 
			public static String addedFiles = "//div[@class='chip__body']";
			public static By AddedFiles = By.xpath(addedFiles);
			public static int filescount ; 
			public static Boolean filesCountCheck ; 
			public static String  DocumentJellyFish = "Jellyfish_11zon.jpg";
			public static String DocumentPanda = "Panda_11zon.jpg";
	 
			public static void TemplateMangement_VerifyAdditionofMultipleDocTemplatePOpup () throws InterruptedException, AWTException{
				
				String path1 = System.getProperty("user.dir") + "\\TestData\\Jellyfish_11zon.jpg";
				Thread.sleep(2000);
				System.out.println(path1);
				CRMCommonMethods.AddTemplateFiles(AddDocument,path1);
				
				Thread.sleep(3000);
				
				String path2 = System.getProperty("user.dir") + "\\TestData\\Panda_11zon.jpg";
				Thread.sleep(2000);
				System.out.println(path2);
				CRMCommonMethods.AddTemplateFiles(AddDocument,path2);
				Thread.sleep(3000); 
				filescount = driver.findElements(AddedFiles).size();
				filesCountCheck = filescount == 2;
			}
	 
			
			
			public static void TemplateMangement_VerifyEmailPreviewPopDataAutoPopulated()throws InterruptedException ,AWTException{
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(TemplateNameTxt);
				Thread.sleep(2000);
				templateName = RandomStrings.RequiredCharacters(3) + "Template";
				WebDriverWaits.SendKeys(TemplateNameTxt, templateName);
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(EmailSubLineInput);
				rndSubLine = RandomStrings.RequiredCharacters(3) + "EmailSubjectLine";
				Thread.sleep(5000);
				WebDriverWaits.Clear(EmailSubLineInput);
				Thread.sleep(2000);
				WebDriverWaits.SendKeys(EmailSubLineInput, rndSubLine);
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(TemplateManagementSideBarTab);
				Thread.sleep(2000);
				TemplateMessgae = RandomStrings.RequiredCharacters(10);
				ExpectedpreviewTemplateData = TemplateMessgae;
				WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeBody);
				Thread.sleep(2000);
				
				driver.switchTo().frame(switchFrame);
				WebDriverWaits.SendKeys(MessageBody, TemplateMessgae);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(IncludeMagicLinkchk);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(IncludeMagicLinkchk);
				Thread.sleep(1000);
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(PreviewTemplateBtn);
				Thread.sleep(4000);
				ActualpreviewTempHeader = WebDriverWaits.GetText(PreviewTempHeader);
				ActualpreviewTempData = WebDriverWaits.GetText(PreviewTemplateBdyMesg);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(ClosePreview);
				Thread.sleep(4000);
			}
			
			
			
			public static String TemplateGridNameLbl ;
			public static String TemplateGridSubLine ;
			
			public static String TemplateGridRelatedDoc ;
			
			public static String TemplateGridLastUpdated ; 
			
			public static String ActiveTemplatecount;
			
			public static By ActiveTemplates = By.xpath("//h2[contains(text(),'Active')]");
			
			public static String GetInactiveTemplateXPath (int index) {
				String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]";
			    return xPath;
			}
			
			
			
			public static String GetCustomTemplateGridXPath(int index) {
				String xPath = "(//div[@class='sortable-table__body__tr']/div)["+index+"]";
				return xPath;
			}
			
			
			public static String GetInactiveEditIconXPath(int index) {
				String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])["+index+"]//button";
				return xPath;
			}
			
			public static String GetTemplateEditButtonXPath(int index) {
				String xPath = "(//div[@class='sortable-table__body__tr']/div)["+index+"]//button";
				return xPath;
			}
			
			
			public static String GetCustomTemplateMoreLinlXPath(int index) {
				
				String xPathMore = "(//div[@class='sortable-table__body__tr']/div)[" +index+ "]//span//following-sibling::a[text()='more']" ;
			    return xPathMore;
			}
			
			
          public static String GetCustomTemplateLessLinlXPath(int index) {
				
				String xPathLess = "(//div[@class='sortable-table__body__tr']/div)["+index+"]//span//following-sibling::a[text()=' less']" ;
			    return xPathLess;
			}
          
          
          public static String LastUpdatedGridXPath(int index) {
        	  String xPathLastUpdateBy = "(//div[@class='sortable-table__body__tr']/div)["+index+"]//span" ;
			    return xPathLastUpdateBy ;
          }
			
			
			
			public static void TemplateMangement_VerifyTemplateAdditionOfTemplate() throws InterruptedException ,AWTException {
				
				
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate); 
				Thread.sleep(2000); 
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				int index  = ((Integer.parseInt(ActiveTemplatecount))*5)- 4;
				TemplateGridNameLbl = driver.findElement(By.xpath(GetCustomTemplateGridXPath(index))).getText();
				
				TemplateGridSubLine = driver.findElement(By.xpath(GetCustomTemplateGridXPath(index+1))).getText();
				Thread.sleep(4000);
				WebElement ele = driver.findElement(By.xpath(GetCustomTemplateMoreLinlXPath(index + 2)));
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click();", ele);
				//WebDriverWaits.ClickByJsExecuter(By.xpath(GetCustomTemplateMoreLinlXPath(index + 2)));
				Thread.sleep(2000);
				TemplateGridRelatedDoc = driver.findElement(By.xpath(GetCustomTemplateGridXPath(index + 2))).getText();
				
				TemplateGridLastUpdated = driver.findElement(By.xpath(LastUpdatedGridXPath(index + 3))).getText();
				//String textd1 = DocumentJellyFish.split(".")[0];
				Thread.sleep(2000);
			}
			
			public static Boolean TemplateNameStatus;
			
			public static String EditTemplateHeader; 
			public static String actualTemplateName;
			
			public static By EditTemplatePopHeader = By.xpath(createTemplatePopupHeader);
			public static void TemplateMangement_VerifyEditTheTemplate( ) throws InterruptedException ,AWTException {
				
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				int index  = Integer.parseInt(ActiveTemplatecount)*5; 
				
				WebDriverWaits.ScrollIntoView(By.xpath(GetTemplateEditButtonXPath(index)));
				Thread.sleep(2000);
				actualTemplateName = "Edit " + WebDriverWaits.GetText(By.xpath(GetCustomTemplateGridXPath(index - 4)));
				
				WebDriverWaits.ClickByJsExecuter(By.xpath(GetTemplateEditButtonXPath(index)));
				Thread.sleep(4000);
				
				EditTemplateHeader = WebDriverWaits.GetText(EditTemplatePopHeader);
				TemplateNameStatus = driver.findElement(TemplateNameTxt).isEnabled();
				Thread.sleep(2000);
				WebDriverWaits.ScrollIntoView(EmailSubLineInput);
				rndSubLine = RandomStrings.RequiredString(3) + "EmailSubEdited";
				Thread.sleep(5000);
				WebDriverWaits.Clear(EmailSubLineInput);
				Thread.sleep(2000);
				WebDriverWaits.SendKeys(EmailSubLineInput, rndSubLine);
				Thread.sleep(5000);
				
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate); 
				Thread.sleep(2000); 
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(By.xpath(GetCustomTemplateGridXPath(index)));
				Thread.sleep(2000);
				TemplateGridSubLine = driver.findElement(By.xpath(GetCustomTemplateGridXPath(index - 3))).getText();
				Thread.sleep(4000);
				
			}
			
			
			public static String InactivatedTemplate;
			public static String ActivatedTemplate;
			public static String InactiveTemplatecount;
			public static String InactiveTemplatecountBefore;
			public static String InactiveTemplatecountAfter;
			public static int actualCount;
			public static int expectedCount;
			
			public static int actualCountActive;
			public static int expectedCountActive;
			
			public static void TemplateMangement_VerifyActivateAndDeActivateTemplate() throws InterruptedException ,AWTException {
				
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				int indexActive  = Integer.parseInt(ActiveTemplatecount)*5; 
				ActivatedTemplate = driver.findElement(By.xpath(GetCustomTemplateGridXPath(indexActive -4))).getText();
				
				WebDriverWaits.ScrollIntoView(InactiveTemplate);
				Thread.sleep(2000);
				InactiveTemplatecountBefore = WebDriverWaits.GetText(InactiveTemplate).split(" ")[0];
				expectedCount = Integer.parseInt(InactiveTemplatecountBefore)+ 1;
				
				WebDriverWaits.ScrollIntoView(By.xpath(GetTemplateEditButtonXPath(indexActive)));
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(By.xpath(GetTemplateEditButtonXPath(indexActive)));
				Thread.sleep(4000);
				WebDriverWaits.ClickByJsExecuter(InactiveTooglebtn);
				Thread.sleep(1000);
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate); 
				Thread.sleep(2000); 
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(5000);
				  
				
				
				WebDriverWaits.ScrollIntoView(InactiveTemplate);
				InactiveTemplatecountAfter = WebDriverWaits.GetText(InactiveTemplate).split(" ")[0];
				int indexInactive  = Integer.parseInt(InactiveTemplatecountAfter)*5;  
				actualCount = Integer.parseInt(InactiveTemplatecountAfter);
				
				InactivatedTemplate = driver.findElement(By.xpath(GetInactiveTemplateXPath(indexInactive -4))).getText();
				Thread.sleep(2000);
				
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				expectedCountActive = Integer.parseInt(ActiveTemplatecount)+1;
				Thread.sleep(1000);
				
				WebDriverWaits.ScrollIntoView(By.xpath(GetInactiveEditIconXPath(indexInactive)));
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(By.xpath(GetInactiveEditIconXPath(indexInactive)));
				Thread.sleep(4000);
				WebDriverWaits.ClickByJsExecuter(ActiveTogglebtn);
				Thread.sleep(1000);
				WebDriverWaits.ScrollIntoView(SaveCrtTemplate); 
				Thread.sleep(2000); 
				WebDriverWaits.ClickByJsExecuter(SaveCrtTemplate);
				Thread.sleep(5000);
				
				
				
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				actualCountActive = Integer.parseInt(ActiveTemplatecount);
				
				indexActive  = Integer.parseInt(ActiveTemplatecount)*5; 
				ActivatedTemplate = driver.findElement(By.xpath(GetCustomTemplateGridXPath(indexActive -4))).getText();
				
				Thread.sleep(2000);
				
				
				
			}
	 
			
			public static String existingTemplateName ;
			public static String expectedMsg ;
			public static String actualMsg = "Error while creating config email template";
			public static void TemplateMangement_VerifyErrorMessgeOnAdditionOfExistingTemplate() throws InterruptedException ,AWTException {
				
				Thread.sleep(5000);
				WebDriverWaits.ScrollIntoView(ActiveTemplates);
				ActiveTemplatecount = WebDriverWaits.GetText(ActiveTemplates).split(" ")[0];
				int indexActive  = Integer.parseInt(ActiveTemplatecount)*5; 
				existingTemplateName = driver.findElement(By.xpath(GetCustomTemplateGridXPath(indexActive -4))).getText();
				Thread.sleep(2000);
				CRMCommonMethods.addNewTemplate(existingTemplateName);
				expectedMsg = WebDriverWaits.GetText(By.xpath(ExistingErrorTemplate));
				Thread.sleep(1000);
				WebDriverWaits.ScrollIntoView(CancelCrtTemplate);
				Thread.sleep(2000);
				WebDriverWaits.ClickByJsExecuter(CancelCrtTemplate);
				Thread.sleep(4000);
				
				
				
			}
	 
	 
	 
	 

}
