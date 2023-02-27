package POMNewAgencySetup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import POMCRM.LoginAgencyUtils;
import TestCasesCRM.Login;

public class AgencyCreationUtils extends Login{

	public static By CreateAgencyButton = By.xpath("//button[text()='Create Agency']");
	public static By AgencyNameField = By.xpath("//input[@name='name']");
	public static By StreetAddressField = By.xpath("//input[@name='streetAddress']");
	public static By CityField = By.xpath("//input[@name='city']");
	public static By StateDropdownField = By.xpath("//label[text()='Select Option']");
	public static By ZipField = By.xpath("//input[@name='zip']");
	public static By TimezoneDropdownField = By.xpath("//div[@class='Select-placeholder']");
	public static By EmailField = By.xpath("//input[@name='email']");
	public static By WebsiteURLField = By.xpath("//input[@name='websiteURL']");
	public static By SendFromEmailField = By.xpath("//input[@name='sendFromEmail']");
	public static By SendFromTextMessageToggle = By.xpath("(//div[@class='react-toggle-thumb'])[2]");
	public static By CodeEnforcementLinkText = By.xpath("//div[text()='Code Enforcement']");
	public static By CRMLinkText = By.xpath("//div[text()='CRM']");
	public static By ProductNameField = By.xpath("//div[@class='product-form__info']//input");
//	public static By WaterVioToggle = By.xpath("//span[text()='Water']");
	public static By WaterVioToggle = By.xpath("//span[text()='General']");
	public static By AnimalVioToggle = By.xpath("//span[text()='Animal']");
	public static By AddCodeEnforcementButton = By.xpath("//button[text()='Add Code Enforcement']");
	public static By CRMProductNameField = By.xpath("//div[@class='product-form__info crm']//input");
	public static By AddCRMButton = By.xpath("//button[text()='Add CRM']");
	public static By CreateAgencyButton2 = By.xpath("//h1[text()='Create Agency']/following::button[2]");
	public static By CreateAgencyPopup = By.xpath("//h1[text()='Create Agency']");
	public static By ValidationMsg = By.xpath("//span[@class='field__error']");
	public static By PlusIconOnHeader = By.xpath("//div[@class='app-header__new']");
	public static By CCPOption = By.xpath("//label[text()='Code Enforcement Case']");
	public static By CSPOption = By.xpath("//label[text()='Customer submission']");
	public static By AddAndConfigureCEPopup = By.xpath("//div[text()='Add & Configure Code Enforcement']");
	public static By ValidationProdName = By.xpath("//div[@class='product-form__info']//span");
	public static By AddAndConfigureCRMPopup = By.xpath("//div[text()='Add & Configure CRM']");
	public static By ValidationProdNameCRM = By.xpath("//div[@class='product-form__info crm']//span");
	public static By ProductNameFieldCRM = By.xpath("//div[@class='product-form__info crm']//input");
	public static By StateSearchField = By.xpath("//input[@name='query']");
	public static By SearchedStateOption = By.xpath("//ul[@class='dropdown__options--single']//span");
	public static By PSTOption = By.xpath("//*[text()='PST']");
	public static By SendFromTextMessageField = By.xpath("//input[@name='sendFromPhoneNumber']");
	public static By AgencySearchField = By.xpath("//input[@placeholder='Search by keyword']");
	public static By AddedCEProduct = By.xpath("//div[@class='agency-form__product-header-title']/h4[1]");
	public static By AddedCRMProduct = By.xpath("(//div[@class='agency-form__product-header-title']/h4[1])[2]");
	public static By NewAgencyCreated = By.xpath("//div[@class='rt-tr -odd']/div[2]");
	
	public static String CreateAgencyPopupTitle ;
	public static String AddAndConfigureCEPopupTitle;
	public static String ValidationMSgProdName;
	public static String ValidationMSgCharLimit;
	public static String ExpectedValidationMsgProdName ;
	public static String ExpectedProdCharLimitMsg ;
	public static String AddedCETitle ;
	public static String AddAndConfigureCRMPopupTitle ;
	public static String ValidationMSgProdNameCRM ;
	public static String AddedCRMTitle ;
	public static String ValidationMSgCharLimitCRM;
	public static String RandomAgencyName ;
	public static String NewAgencyTitle;
	public static String ExpectedProdCharLimitMsgCRM;
	
	public static void AgencyCreation_OpenCreateAgencyPopup() throws InterruptedException {		
		//LoginAgencyUtils.LoginAdmin();
		Thread.sleep(15000);
		WebElement element = driver.findElement(CreateAgencyButton);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		//WebDriverWaits.ClickOn(CreateAgencyButton);
		CreateAgencyPopupTitle = WebDriverWaits.GetText(CreateAgencyPopup);
		WebDriverWaits.ClickOn(SendFromTextMessageToggle);
		WebDriverWaits.ClickOn(CreateAgencyButton2);
		
	}
	
	public static void AgencyCreation_ConfigureCE() throws InterruptedException {		
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(CodeEnforcementLinkText);
		AddAndConfigureCEPopupTitle = WebDriverWaits.GetText(AddAndConfigureCEPopup);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AddCodeEnforcementButton);
		ValidationMSgProdName = WebDriverWaits.GetText(ValidationProdName);
		ExpectedValidationMsgProdName = "Product name cannot be empty";
		String Char20Plus = RandomStrings.RequiredCharacters(21);
		WebDriverWaits.SendKeys(ProductNameField, Char20Plus);
		WebDriverWaits.ClickOn(AddCodeEnforcementButton);
		ValidationMSgCharLimit = WebDriverWaits.GetText(ValidationProdName);
		ExpectedProdCharLimitMsg = "Product name cannot be longer than 20 characters";
		Thread.sleep(2000);
		WebDriverWaits.WaitUntilVisibleWE(ProductNameField).clear();
		WebDriverWaits.SendKeys(ProductNameField, "CE");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(WaterVioToggle);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AnimalVioToggle);
		WebDriverWaits.ClickOn(AddCodeEnforcementButton);
		AddedCETitle = WebDriverWaits.GetText(AddedCEProduct);
	}
	
	public static void AgencyCreation_ConfigureCRM() throws InterruptedException {		
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CRMLinkText);
		AddAndConfigureCRMPopupTitle = WebDriverWaits.GetText(AddAndConfigureCRMPopup);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AddCRMButton);
		ValidationMSgProdNameCRM = WebDriverWaits.GetText(ValidationProdNameCRM);
		String Char50Plus = RandomStrings.RequiredCharacters(51);
		WebDriverWaits.SendKeys(ProductNameFieldCRM, Char50Plus);
		WebDriverWaits.ClickOn(AddCRMButton);
		ValidationMSgCharLimitCRM = WebDriverWaits.GetText(ValidationProdNameCRM);
		ExpectedProdCharLimitMsgCRM = "Product name cannot be longer than 50 characters";
		Thread.sleep(5000);
		WebElement ProdNameFieldCRM = WebDriverWaits.WaitUntilVisibleWE(ProductNameFieldCRM);
		Thread.sleep(2000);
		ProdNameFieldCRM.clear();
		//		WebDriverWaits.WaitUntilVisibleWE(ProductNameFieldCRM).clear();
		WebDriverWaits.SendKeys(ProductNameFieldCRM, "CRM");
		WebDriverWaits.ClickOn(AddCRMButton);
		AddedCRMTitle = WebDriverWaits.GetText(AddedCRMProduct);
	}
	
	public static void AgencyCreation_VerifyNewAgencyCreation() throws InterruptedException {		
		RandomAgencyName = "NAVA_" + RandomStrings.RequiredCharacters(8);	
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(AgencyNameField, RandomAgencyName);
		WebDriverWaits.SendKeys(StreetAddressField, "21 Lane");
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(CityField, "Austin");
		WebDriverWaits.ClickOn(StateDropdownField);		
		WebDriverWaits.SendKeys(StateSearchField, "Texas");
		WebDriverWaits.ClickOn(SearchedStateOption);		
		WebDriverWaits.SendKeys(ZipField, "77494");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(TimezoneDropdownField);		
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(PSTOption);		
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(EmailField, "newagencyviaautomation@yopmail.com");
		WebDriverWaits.SendKeys(WebsiteURLField, "https://demo.comcate.com");
		WebDriverWaits.SendKeys(SendFromEmailField, "team-comcate");
		WebDriverWaits.SendKeys(SendFromTextMessageField, "+12057547399");
		WebDriverWaits.ClickOn(CreateAgencyButton2);
		Thread.sleep(8000);
		WebDriverWaits.SendKeys(AgencySearchField, RandomAgencyName);
		Thread.sleep(7000);
		NewAgencyTitle = WebDriverWaits.GetText(NewAgencyCreated);
	}
	
}
