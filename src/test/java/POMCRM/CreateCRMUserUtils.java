package POMCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import junit.framework.Assert;
import TestCasesCRM.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCRMUserUtils extends LoginAgencyUtils {

	public static String createUserButton = "//button[text()='Create User']";
	public static String createUserPopupTitle = "//h1[text()='Create User']";
	public static String firstNameField = "//input[@name='firstName']";
	public static String lastNameField = "//input[@name='lastName']";
	public static String emailField = "//input[@name='email']";
	public static String roleDropdown = "//label[text()='Role']/following::span[1]";
	public static String standardUserOption = "//*[text()='Standard User CRM']";
	
	public static String productAdminOption = "//*[text()='Product Admin CRM']";
	public static String addGroupDropdown = "//label[text()='Add Group']";
	public static String standardGroupCheckbox = "//label[text()='Standard Group']";
	public static String adminGroupCheckbox = "//label[text()='Admin Group']";
	public static String applyButton = "//button[text()='Apply']";
	public static String cancelButton = "//button[text()='Cancel']";
	public static String saveButton = "//button[text()='Save']";
	//public static String searchField = "//input[@placeholder='Filter by name or email']";
	public static String searchField = "//input[@placeholder='Filter by name or email'][@type='TEXT']";
	
	public static String usersCount = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String searchResultName = "//div[@class='rt-tr -odd']/div";
	public static String createUserPopupBtn = "//div[@class='user-form__header full-page-modal__header']//button[text()='Create User']";
	public static String editUserIcon = "//button[@class='edit-btn  btn btn-primary']";
	public static String editUserIcon1 = "(//button[@class='edit-btn  btn btn-primary'])[1]";
	public static String editUserpopupTitle = "//h1[text()='Edit User']";
	public static String yopmailSearchUser = "//input[@class='ycptinput']";
	public static String paginationText = "//span[@class='table__pagination-of-text']";
	public static String userSearchResult = "//div[@class='rt-tr-group']";
	public static String yopmailInboxArrow = "//button[@class='md']";
	public static String rolesTab = "//div[text()='Roles']";
	public static String createRoleButton = "//button[text()='Create Role']";
	public static String createRolePopupTitle = "//h1[text()='Create Role']";
	public static String roleNameField = "//input[@placeholder='Enter Text']";
	public static String descriptionField = "//textarea[@name='description']";
	public static String createRolePopupBtn = "//div[@class='modal-header']//following::button[text() ='Create Role']";
	public static String roleCreatedSuccessMsg = "//span[text()='Role created']";
	public static String resetPasswordLink = "//a[text()='Send Reset Password Link']";
	public static String iframeSwitch = "//iframe[@id='ifmail']";
	public static String firstMail = "//button[@class='lm']";
	public static String activateOktaBtn = "//span[text()='Activate Okta Account']";
	public static String newPassword = "//input[@name='newPassword']";
	public static String verifyPassword = "//input[@name='verifyPassword']";
	public static String resetPasswordBtn = "//span[text()='Reset Password']";
	public static String productSettingsToggle = "//span[@class='toggle__children']";
	public static String deleteReissueYesBtn = "//label[@title='Delete and Reissue Notice']/following::button[text()='Yes'][1]";
	public static String basicToggle = "//button[text()='Basic']";
	public static String groupsTab = "//div[text()='Groups']";
	public static String createNewGroupBtn = "//button[text()='Create New Group']";
	public static String createGroupPopupTitle = "//h1[text()='Create Group']";
	public static String createGroupPopupBtn = "//button[text()='Create Group']";
	public static String groupName = "//input[@name='label']";
	public static String groupCreatedSuccessMsg = "//span[text()='Group created']";
	public static String nextNavigationIcon = "//div[@class='table__pagination-nav-btns']/button[2]";
	public static String createMyAccountBtn = "//input[@value='Create My Account']";
	public static String standardUserCEOption = "//*[text()='Agency Admin CRM and CEM']";
	public static String agencyAdminUseerCECRMOption = "//*[text()='Agency Admin CRM and CEM']";

	public static By CreateUserButton = By.xpath(CreateCRMUserUtils.createUserButton);
	public static By CreateUserPopupTitle = By.xpath(CreateCRMUserUtils.createUserPopupTitle);
	public static By FirstNameField = By.xpath(CreateCRMUserUtils.firstNameField);
	public static By LastNameField = By.xpath(CreateCRMUserUtils.lastNameField);
	public static By EmailField = By.xpath(CreateCRMUserUtils.emailField);
	public static By RoleDropdown = By.xpath(CreateCRMUserUtils.roleDropdown);
	public static By StandardUserOption = By.xpath(CreateCRMUserUtils.standardUserOption);
	public static By StandardUseerCEOption = By.xpath(standardUserCEOption);
	public static By AgencyAdminUseerCECRMOption = By.xpath(agencyAdminUseerCECRMOption);
	public static By ProductAdminOption = By.xpath(CreateCRMUserUtils.productAdminOption);
	public static By AddGroupDropdown = By.xpath(CreateCRMUserUtils.addGroupDropdown);
	public static By StandardGroupCheckbox = By.xpath(CreateCRMUserUtils.standardGroupCheckbox);
	public static By AdminGroupCheckbox = By.xpath(CreateCRMUserUtils.adminGroupCheckbox);
	public static By ApplyButton = By.xpath(CreateCRMUserUtils.applyButton);
	public static By CancelButton = By.xpath(CreateCRMUserUtils.cancelButton);
	public static By SaveButton = By.xpath(CreateCRMUserUtils.saveButton);
	public static By SearchField = By.xpath(CreateCRMUserUtils.searchField);
	public static By CreateUserPopupBtn = By.xpath(CreateCRMUserUtils.createUserPopupBtn);
	public static By UsersCount = By.xpath(CreateCRMUserUtils.usersCount);
	public static By UserSearchResult = By.xpath(CreateCRMUserUtils.userSearchResult);
	public static By EditUserIcon = By.xpath(CreateCRMUserUtils.editUserIcon);
	
	public static By EditUseerIcon1 = By.xpath(CreateCRMUserUtils.editUserIcon1);
	
	public static By ResetPasswordLink = By.xpath(CreateCRMUserUtils.resetPasswordLink);
	public static By EditUserpopupTitle = By.xpath(CreateCRMUserUtils.editUserpopupTitle);
	public static By YopmailSearchUser = By.xpath(CreateCRMUserUtils.yopmailSearchUser);
	public static By PaginationText = By.xpath(CreateCRMUserUtils.paginationText);
	public static By SearchResultName = By.xpath(CreateCRMUserUtils.searchResultName);
	public static By YopmailInboxArrow = By.xpath(CreateCRMUserUtils.yopmailInboxArrow);
	public static By CreateRoleButton = By.xpath(CreateCRMUserUtils.createRoleButton);
	public static By RolesTab = By.xpath(CreateCRMUserUtils.rolesTab);
	public static By CreateRolePopupTitle = By.xpath(CreateCRMUserUtils.createRolePopupTitle);
	public static By RoleNameField = By.xpath(CreateCRMUserUtils.roleNameField);
	public static By DescriptionField = By.xpath(CreateCRMUserUtils.descriptionField);
	public static By CreateRolePopupBtn = By.xpath(CreateCRMUserUtils.createRolePopupBtn);
	public static By IframeSwitch = By.xpath(CreateCRMUserUtils.iframeSwitch);
	public static By FirstMail = By.xpath(CreateCRMUserUtils.firstMail);
	public static By ActivateOktaBtn = By.xpath(CreateCRMUserUtils.activateOktaBtn);
	public static By NewPassword = By.xpath(CreateCRMUserUtils.newPassword);
	public static By VerifyPassword = By.xpath(CreateCRMUserUtils.verifyPassword);
	public static By ResetPasswordBtn = By.xpath(CreateCRMUserUtils.resetPasswordBtn);
	public static By RoleCreatedSuccessMsg = By.xpath(CreateCRMUserUtils.roleCreatedSuccessMsg);
	public static By ProductSettingsToggle = By.xpath(CreateCRMUserUtils.productSettingsToggle);
	public static By DeleteReissueYesBtn = By.xpath(CreateCRMUserUtils.deleteReissueYesBtn);
	public static By BasicToggle = By.xpath(CreateCRMUserUtils.basicToggle);
	public static By GroupsTab = By.xpath(CreateCRMUserUtils.groupsTab);
	public static By CreateNewGroupBtn = By.xpath(CreateCRMUserUtils.createNewGroupBtn);
	public static By CreateGroupPopupTitle = By.xpath(CreateCRMUserUtils.createGroupPopupTitle);
	public static By CreateGroupPopupBtn = By.xpath(CreateCRMUserUtils.createGroupPopupBtn);
	public static By GroupName = By.xpath(CreateCRMUserUtils.groupName);
	public static By GroupCreatedSuccessMsg = By.xpath(CreateCRMUserUtils.groupCreatedSuccessMsg);
	public static By NextNavigationIcon = By.xpath(CreateCRMUserUtils.nextNavigationIcon);
	public static By CreateMyAccountBtn = By.xpath(CreateCRMUserUtils.createMyAccountBtn);
	public static By CasesTab = By.xpath("//a[text()='Cases']");
	public static By SubmissionsTab = By.xpath("//a[text()='Customer Submissions']");
	public static By LogoutDropdownArrow = By.xpath("//div[@class='app-header__user-name-caret']");
	public static By LogoutOption = By.xpath("//label[text()='Logout']");
	public static By AgencyAdminCEM = By.xpath("//*[text()='Agency Admin CEM']");
	public static By AgencyAdminCRMOnly = By.xpath("//*[text()='Agency Admin CRM']");
//	public static By  = "";

	public static String RandomFirstNameCRM = "CRM" + RandomStrings.RequiredCharacters(6);
	public static String RandomLastNameCRM = RandomStrings.RequiredCharacters(6);
	
	public static boolean CreateStandardUser_CompareCount;
	public static boolean CreateProductAdminUser_CompareCount; 
	public static boolean CEAbsence;
	public static boolean CRMAccess;
	public static String FirstUserName;
	
	public static String RandomupdatedPassword;
	
	public static void CreateCRMUser_CreateStandardUser() throws InterruptedException {
		WebDriverWaits.CloseOtherTabs();
		driver.navigate().to(DataInterface.URLUserManagement);
		Thread.sleep(6000);
		String[] CountUsers1 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersBefore = CountUsers1[0];
		int TotalUsersBefore = Integer.parseInt(UsersBefore);
		WebDriverWaits.VisibilityOfElementLocated(CreateUserButton, 2);
		WebDriverWaits.ClickOn(CreateUserButton);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(FirstNameField, "Stand" + RandomFirstNameCRM);
		WebDriverWaits.SendKeys(LastNameField, RandomLastNameCRM);
		String EmailRandom = "stand" + RandomFirstNameCRM + RandomLastNameCRM + "@yopmail.com";
		
		System.out.println(EmailRandom);
		
		WebDriverWaits.SendKeys(EmailField, EmailRandom);
		WebDriverWaits.ClickOn(RoleDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AgencyAdminUseerCECRMOption);
		WebDriverWaits.ClickOn(AddGroupDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(StandardGroupCheckbox);
		WebDriverWaits.ClickOn(ApplyButton);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateUserPopupBtn);
		Thread.sleep(15000);
		String[] CountUsers2 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersAfter = CountUsers2[0];
		int TotalUsersAfter = Integer.parseInt(UsersAfter);
		CreateStandardUser_CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
	}

	public static void CreateCRMUser_CreateProductAdminUser() throws InterruptedException {
		Thread.sleep(2000);
		String[] CountUsers1 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersBefore = CountUsers1[0];
		int TotalUsersBefore = Integer.parseInt(UsersBefore);
		WebDriverWaits.ClickOn(CreateUserButton);
		Thread.sleep(2000);
		FirstUserName = "Prod Admin" + RandomFirstNameCRM;
		WebDriverWaits.SendKeys(FirstNameField, FirstUserName);
		WebDriverWaits.SendKeys(LastNameField, RandomLastNameCRM);
		String EmailRandom = "prodadmin" + RandomFirstNameCRM + RandomLastNameCRM + "@yopmail.com";
		
		System.out.println(EmailRandom);
		
		WebDriverWaits.SendKeys(EmailField, EmailRandom);
		WebDriverWaits.ClickOn(RoleDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ProductAdminOption);
		WebDriverWaits.ClickOn(AddGroupDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AdminGroupCheckbox);
		WebDriverWaits.ClickOn(ApplyButton);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateUserPopupBtn);
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(9000);
		String[] CountUsers2 = WebDriverWaits.GetText(UsersCount).split(" ");
		String UsersAfter = CountUsers2[0];
		int TotalUsersAfter = Integer.parseInt(UsersAfter);
		CreateProductAdminUser_CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
	}
	
	public static void CreateStandardCEUser() throws InterruptedException {
		WebDriverWaits.ClickOn(CreateUserButton);
		Thread.sleep(2000);
		String rn = RandomStrings.RequiredCharacters(3);
		WebDriverWaits.SendKeys(FirstNameField, "CE User" + RandomFirstNameCRM);
		WebDriverWaits.SendKeys(LastNameField, RandomLastNameCRM);
		String EmailRandom = "stand" + RandomFirstNameCRM + rn + RandomLastNameCRM + "@yopmail.com";
		
		System.out.println(EmailRandom);
		
		WebDriverWaits.SendKeys(EmailField, EmailRandom);
		WebDriverWaits.ClickOn(RoleDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AgencyAdminUseerCECRMOption);
		WebDriverWaits.ClickOn(AddGroupDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(StandardGroupCheckbox);
		WebDriverWaits.ClickOn(ApplyButton);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateUserPopupBtn);
		Thread.sleep(15000);
	}
	
	
	public static void CreateStandardCRMUser() throws InterruptedException {
		WebDriverWaits.ClickOn(CreateUserButton);
		Thread.sleep(2000);
		String rn = RandomStrings.RequiredCharacters(3);
		WebDriverWaits.SendKeys(FirstNameField, "CE User" + RandomFirstNameCRM);
		WebDriverWaits.SendKeys(LastNameField, RandomLastNameCRM);
		String EmailRandom = "stand" + RandomFirstNameCRM + rn + RandomLastNameCRM + "@yopmail.com";
		
		System.out.println(EmailRandom);
		
		WebDriverWaits.SendKeys(EmailField, EmailRandom);
		WebDriverWaits.ClickOn(RoleDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AgencyAdminUseerCECRMOption);
		WebDriverWaits.ClickOn(AddGroupDropdown);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(StandardGroupCheckbox);
		WebDriverWaits.ClickOn(ApplyButton);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CreateUserPopupBtn);
		Thread.sleep(15000);
	}
	
	
	
	
	
	
	
	

	public static void CreateCRMUser_UpdateCEOnlyUserToCRMOnly() throws InterruptedException {
//		Login.LoginAgency();
//		Thread.sleep(3000);
//		driver.navigate().to(DataInterface.URLUserManagement);
		Thread.sleep(4000);
		WebDriverWaits.SendKeys(SearchField, "CE User");
		Thread.sleep(7000);
		int count = driver.findElements(By.xpath("//div[contains(text(),'No user found')]")).size();
		if(count > 0) {
			
			CreateStandardCEUser();
			Thread.sleep(5000);
			WebDriverWaits.Clear(SearchField);
			WebDriverWaits.SendKeys(SearchField, "CE User");
			Thread.sleep(10000);
		}
			
		
		WebDriverWaits.ClickOn(EditUserIcon);
		Thread.sleep(5000);
		WebElement FirstNameFld = WebDriverWaits.WaitUntilVisibleWE(FirstNameField);
		FirstNameFld.clear();
		WebDriverWaits.SendKeys(FirstNameField, "CE To CRM");
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(RoleDropdown);
		WebDriverWaits.ClickOn(ProductAdminOption);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(4000);
		
	}
	
	public static void CreateCRMUser_VerifyCRMProductAccessToCRMUser() throws InterruptedException, AWTException {
		//Login.LoginAgencyStage();
//		Thread.sleep(3000);
		driver.navigate().to(DataInterface.URLUserManagement);
		
		Thread.sleep(6000);
		WebElement SearchUserField = WebDriverWaits.WaitUntilVisibleWE(SearchField);
		SearchUserField.clear();
		SearchUserField.sendKeys("CE To CRM");
		Thread.sleep(10000);
		//WebDriverWaits.VisibilityOfElementLocated(EditUserIcon,2);
		int count = driver.findElements(By.xpath("//div[contains(text(),'No user found')]")).size();
		if(count > 0) {
			
			CreateStandardCRMUser();
			Thread.sleep(5000);
			WebDriverWaits.Clear(SearchField);
			WebDriverWaits.SendKeys(SearchField, "CE To CRM");
			Thread.sleep(10000);
		}
		WebDriverWaits.ClickOn(EditUserIcon);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(ResetPasswordLink);
		WebDriverWaits.VisibilityOfElementLocated(EmailField,2);
		String YopmailID = driver.findElement(EmailField).getAttribute("value");
		
		System.out.println(YopmailID);
		
		Robot robot = new Robot();
		Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_T);
//		Thread.sleep(20000);
//		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		if(tabs.size()> 1) {
//			driver.switchTo().window((String) tabs.get(1));
//			Thread.sleep(1000);
//		}
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(8000);
		
		driver.navigate().to("https://yopmail.com/en/");
		Thread.sleep(7000);
		WebDriverWaits.VisibilityOfElementLocated(EmailField,1);
		WebDriverWaits.SendKeys(YopmailSearchUser, (YopmailID));
		
		WebDriverWaits.ClickOn(YopmailInboxArrow);
		Thread.sleep(3000);
		WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeSwitch);
		Thread.sleep(2000);
		driver.switchTo().frame(switchFrame);
		Thread.sleep(2000);
		WebDriverWaits.VisibilityOfElementLocated(ResetPasswordBtn,2);
		WebDriverWaits.ClickOn(ResetPasswordBtn);
		Thread.sleep(10000);
		ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
		System.out.print(tabs.size());
		
		
		Thread.sleep(3000);
		driver.switchTo().window((String) tabs2.get(2));
		RandomupdatedPassword = "Hello@12"+RandomStrings.RequiredDigits(5);
		
		int answerCheck = driver.findElements(By.xpath("//input[@id='input39']")).size();
		if (answerCheck > 0) {
			driver.findElement(By.xpath("//input[@id='input39']")).sendKeys("good");
			driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("Hello@123");   // QA
			//driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Hello@123");  //QA
			
			driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys(RandomupdatedPassword);   // Stage
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(RandomupdatedPassword);  //Stage
			
			driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
			Thread.sleep(5000);
		}
		else if(driver.findElements(By.xpath("//h1[contains(text(),'Welcome to Comcate')]")).size()  > 0) {
		Thread.sleep(4000);
//		WebDriverWaits.SendKeys(NewPassword, "Hello@123");   //QA
//		WebDriverWaits.SendKeys(VerifyPassword, "Hello@123");
		System.out.print(RandomupdatedPassword);
		WebDriverWaits.SendKeys(NewPassword, RandomupdatedPassword);
		WebDriverWaits.SendKeys(VerifyPassword, RandomupdatedPassword);
		WebDriverWaits.SendKeys(By.xpath("//input[@id='loginForm.securityAnswer']"), "good");
		
		WebDriverWaits.ClickOn(CreateMyAccountBtn);
		Thread.sleep(4000);
		}
		driver.switchTo().window((String) tabs2.get(0));
		driver.navigate().refresh();
		int cancelbtnCheck = driver.findElements(CancelButton).size();
		if (cancelbtnCheck > 0) {
			WebDriverWaits.ClickOn(CancelButton);
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(LogoutDropdownArrow);
			WebDriverWaits.ClickOn(LogoutOption);
			Thread.sleep(7000);
		}
		
		//driver.quit();
		//driver.manage().deleteAllCookies();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(chromeOptions);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
//		WebDriverWaits.SendKeys(LoginAgencyUtils.UsernameField, YopmailID);     // QA
//		WebDriverWaits.SendKeys(PasswordField, DataInterface.AgencyPassword);
//		WebDriverWaits.ClickOn(SubmitButton);                                   // QA
		
		
		
		driver.navigate().to(DataInterface.AgencyURL);
//		Thread.sleep(10000);
//		WebDriverWaits.SendKeys(OKTAUsernameField, YopmailID);
//		WebDriverWaits.ClickOn(NextButton); 
//		driver.findElement(OKTAUsernameField).sendKeys(YopmailID);
//		WebDriverWaits.SendKeys(OKTAPasswordField, RandomupdatedPassword);
//		WebDriverWaits.WaitUntilVisible(OKTASubmitButton);
//		WebDriverWaits.ClickOn(OKTASubmitButton);
//
		Thread.sleep(10000);	
		List<WebElement> CRMPresence = driver.findElements(SubmissionsTab);
		CRMAccess = CRMPresence.size()==1;
		}
	
	public static void CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser() throws InterruptedException, AWTException {
//		Login.LoginAgency();
//		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.navigate().to(DataInterface.URLUserManagement);
	    Thread.sleep(6000);
		Thread.sleep(6000);
		//WebElement SearchUserField = WebDriverWaits.WaitUntilVisibleWE(SearchField);
		driver.findElement(SearchField).clear();
		//SearchUserField.clear();
		driver.findElement(SearchField).sendKeys("CE To CRM");
		Thread.sleep(5000);
		WebDriverWaits.VisibilityOfElementLocated(EditUserIcon, 2);
		WebDriverWaits.ClickOn(EditUserIcon);
		WebDriverWaits.WaitForElementInteractable(RoleDropdown,2);
		WebDriverWaits.ClickOn(RoleDropdown);	
		Thread.sleep(5000);
		//WebDriverWaits.VisibilityOfElementLocated(AgencyAdminCEM, 1);
		WebDriverWaits.ScrollIntoView(AgencyAdminCRMOnly);
		WebDriverWaits.ClickOn(AgencyAdminCRMOnly);
		Thread.sleep(5000);
		WebElement FirstNameFld = WebDriverWaits.WaitUntilVisibleWE(FirstNameField);
		FirstNameFld.clear();
		WebDriverWaits.SendKeys(FirstNameField, "CRM to CE");
		String YopmailID = driver.findElement(EmailField).getAttribute("value");
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(5000);
		//WebDriverWaits.WaitForElementInteractable(LogoutDropdownArrow, 2);
		WebDriverWaits.ClickOn(LogoutDropdownArrow);
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(LogoutOption);
		Thread.sleep(5000);
		
		// Login for Stage 
		//Login.LoginAgencyStage(); 
		
		 // QA
//		WebDriverWaits.SendKeys(LoginAgencyUtils.UsernameField, YopmailID);
//		WebDriverWaits.SendKeys(PasswordField, DataInterface.AgencyPassword);
//		WebDriverWaits.ClickOn(SubmitButton);
		
		driver.navigate().to(DataInterface.AgencyURL);
		Thread.sleep(7000);
		WebDriverWaits.VisibilityOfElementLocated(OKTAUsernameField, 2);
		WebDriverWaits.SendKeys(OKTAUsernameField, YopmailID);
		WebDriverWaits.ClickOn(NextButton); 
		WebDriverWaits.SendKeys(OKTAPasswordField, DataInterface.AgencyPassword);
		WebDriverWaits.WaitUntilVisible(OKTASubmitButton);
		WebDriverWaits.ClickOn(OKTASubmitButton);
		
		
		Thread.sleep(8000);	
		List<WebElement> CLPPresence = driver.findElements(CasesTab);
		CEAbsence = CLPPresence.size()==0;
	}


}
