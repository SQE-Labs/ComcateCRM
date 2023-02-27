package POMCRM;

import BrowsersBase.DataInterface;
import CommonMethods.WebDriverWaits;
import ExtentReport.ExtentReportClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginAgencyUtils extends ExtentReportClass {

	// Existing User Login Utils
	public static String Username = "okta-signin-username";
	public static String Password = "okta-signin-password";
	public static String Button = "okta-signin-submit";
	public static String agencyLoggedInUsername = "//div[@class='app-header__user-name']/label";
	public static String plusIconToCECRM = "//*[@class='app-header__new']";

	//stage credentials
	public static By NextButton = By.id("idp-discovery-submit");
	public static By OKTAUsernameField = By.xpath("//input[@id='idp-discovery-username']");
	public static By OKTAPasswordField = By.id("okta-signin-password");
	public static By OKTASubmitButton = By.id("okta-signin-submit");


	// Admin User Login Utils
	public static String adminUsername = "//input[@placeholder='Enter Email']";
	public static String adminPassword = "//input[@placeholder='Enter Password']";
	public static String adminButton = "//button[text()='Login']";
	public static String searchAgency = "//span[@class='agencies-listing__search']/input";
	public static String enterAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[1]";

	public static By UsernameField = By.id(LoginAgencyUtils.Username);
	public static By PasswordField = By.id(LoginAgencyUtils.Password);
	public static By SubmitButton = By.id(LoginAgencyUtils.Button);
	public static By AdminUsername = By.xpath(LoginAgencyUtils.adminUsername);
	public static By AdminPassword = By.xpath(LoginAgencyUtils.adminPassword);
	public static By AdminButton = By.xpath(LoginAgencyUtils.adminButton);
	public static By SearchAgency = By.xpath(LoginAgencyUtils.searchAgency);
	public static By EnterAgencyIcon = By.xpath(LoginAgencyUtils.enterAgencyIcon);
	public static By AgencyLoggedInUsername = By.xpath(LoginAgencyUtils.agencyLoggedInUsername);
	public static By PlusIconToCECRM = By.xpath(LoginAgencyUtils.plusIconToCECRM);

	public static String AgencyLoggedInUserName;


	public static void LoginAgencyStage() throws InterruptedException {
		driver.navigate().to(DataInterface.AgencyURL);
		//Thread.sleep(7000);
		WebDriverWaits.VisibilityOfElementLocated(OKTAUsernameField, 2);
		WebDriverWaits.SendKeys(OKTAUsernameField, DataInterface.AgencyUsername);
		WebDriverWaits.ClickOn(NextButton);
		WebDriverWaits.SendKeys(OKTAPasswordField, DataInterface.AgencyPassword);
		WebDriverWaits.WaitUntilVisible(OKTASubmitButton);
		WebDriverWaits.ClickOn(OKTASubmitButton);
		Thread.sleep(8000);
		WebDriverWaits.WaitUntilVisible(PlusIconToCECRM);
		WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
		if (CPPBtn.isDisplayed() == false) {
			Assert.assertEquals(false, true);
		}
		AgencyLoggedInUserName = WebDriverWaits.GetText(AgencyLoggedInUsername);
		//AppPreRequisites.AgencySetup_VerifyCreationOf50PlusCases();
	}

	public static void LoginAgencyCI() throws InterruptedException {
		driver.navigate().to(DataInterface.AgencyURL);
		Thread.sleep(7000);
		WebDriverWaits.SendKeys(UsernameField, DataInterface.AgencyUsername);
		WebDriverWaits.SendKeys(PasswordField, DataInterface.AgencyPassword);
		WebDriverWaits.WaitUntilVisible(SubmitButton);
		WebDriverWaits.ClickOn(SubmitButton);
		Thread.sleep(8000);
		WebDriverWaits.WaitUntilVisible(PlusIconToCECRM);
		WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
		if (CPPBtn.isDisplayed() == false) {
			Assert.assertEquals(false, true);
		}
		AgencyLoggedInUserName = WebDriverWaits.GetText(AgencyLoggedInUsername);
	}


	public static void LoginAgency() throws InterruptedException {
		driver.navigate().to(DataInterface.AgencyURL);
		Thread.sleep(7000);
		WebDriverWaits.SendKeys(UsernameField, DataInterface.AgencyUsername);
		WebDriverWaits.SendKeys(PasswordField, DataInterface.AgencyPassword);
		WebDriverWaits.WaitUntilVisible(SubmitButton);
		WebDriverWaits.ClickOn(SubmitButton);
		Thread.sleep(8000);
		WebDriverWaits.WaitUntilVisible(PlusIconToCECRM);
		WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
		if (CPPBtn.isDisplayed() == false) {
			Assert.assertEquals(false, true);
		}
		AgencyLoggedInUserName = WebDriverWaits.GetText(AgencyLoggedInUsername);


	}

	public static void LoginAdmin() throws InterruptedException {
		driver.navigate().to(DataInterface.AdminURL);
		Thread.sleep(4000);
		WebDriverWaits.SendKeys(AdminUsername, DataInterface.AdminUsername);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(AdminPassword, DataInterface.AdminPassword);
		WebDriverWaits.ClickOn(AdminButton);
		Thread.sleep(2000);
//		WebDriverWaits.SendKeys(SearchAgency, String.valueOf(DataInterface.AgencyID));
//		Thread.sleep(2000);
//		WebDriverWaits.ClickOn(EnterAgencyIcon);
//		Thread.sleep(8000);
//		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		Thread.sleep(3000);
//		driver.switchTo().window((String) tabs.get(1));
//		Thread.sleep(1000);
	}

}
