package POMCRM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import BrowsersBase.DataInterface;
import CommonMethods.CRMCommonMethods;
import CommonMethods.WebDriverWaits;

public class SubmissionSettingsUtils extends CreateAndLinkCaseUtils {

	public static By YesToggle1 = By.xpath("//button[text()='Yes']");
	public static By NoToggle1 = By.xpath("//button[text()='No']");
	public static By YesToggle2 = By.xpath("(//button[text()='Yes'])[2]");
	public static By NoToggle2 = By.xpath("(//button[text()='No'])[2]");
	public static By DiscardChangesButton = By.xpath("//button[text()='Discard Changes']");
	public static By SaveChangesButton = By.xpath("//button[text()='Save Changes']");
	public static By CaseStatus = By.xpath("//h2[@class='case-details__case-status']");
	public static By SubmissionStatus = By.xpath("//h2[@class='customer-submission-details__status']");

	public static boolean ToggleButtonState;
	public static boolean ToggleButtonState2;
	public static boolean ToggleButtonState3;
	public static String FetchCaseStatusForYes;
	public static String FetchSubmissionStatusForYes;
	public static String FetchCaseStatusForNo;
	public static String FetchSubmissionStatusForNo;
	public static boolean ToggleButtonState4;
	public static boolean PostAnonymouslyPresence;
	public static boolean PostAnonymouslyAbsence;

	public static void SubmissionSettings_VerifyToggleButtonsState() throws InterruptedException {
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(YesToggle1);
		String GetClass = WebDriverWaits.WaitUntilVisibleWE(YesToggle1).getAttribute("class");
		ToggleButtonState = GetClass.equals("square-btn btn btn-primary");
		System.out.println(ToggleButtonState);
	}

	public static void SubmissionSettings_VerifyDiscardButtonFunctionality() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(NoToggle1);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(YesToggle1);
		WebDriverWaits.ClickOn(DiscardChangesButton);
		String GetClass = WebDriverWaits.WaitUntilVisibleWE(YesToggle1).getAttribute("class");
		ToggleButtonState2 = GetClass.equals("square-btn btn btn-primary");
		System.out.println(ToggleButtonState2);
	}

	public static void SubmissionSettings_VerifyChangesGetSaved() throws InterruptedException {
		WebDriverWaits.ClickOn(YesToggle1);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		String GetClass = WebDriverWaits.WaitUntilVisibleWE(YesToggle1).getAttribute("class");
		ToggleButtonState3 = GetClass.equals("square-btn btn btn-primary");
		System.out.println(ToggleButtonState3);
	}

	public static void SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission() throws InterruptedException {
		WebDriverWaits.ClickOn(YesToggle1);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		CreateAndLinkCase_PreRequisite();
		CreateAndLinkCase_OpenCCPToLinkTheCase();
		CreateAndLinkCase_VerifyLinkedCase();
		CRMCommonMethods.CE_CloseCaseOnCDP();
		Thread.sleep(3000);
		FetchCaseStatusForYes = WebDriverWaits.GetText(CaseStatus);
		WebDriverWaits.ClickOn(AssociatedSubmissionLink);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(10000);
		FetchSubmissionStatusForYes = WebDriverWaits.GetText(SubmissionStatus);
	}

	public static void SubmissionSettings_VerifyCaseDoesntCloseForNoToggle() throws InterruptedException {
		WebDriverWaits.CloseOtherTabs();
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(NoToggle1);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		CreateAndLinkCase_PreRequisite();
		CreateAndLinkCase_OpenCCPToLinkTheCase();
		CreateAndLinkCase_VerifyLinkedCase();
		CRMCommonMethods.CE_CloseCaseOnCDP();
		Thread.sleep(3000);
		FetchCaseStatusForNo = WebDriverWaits.GetText(CaseStatus);
		WebDriverWaits.ClickOn(AssociatedSubmissionLink);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(6000);
		FetchSubmissionStatusForNo = WebDriverWaits.GetText(SubmissionStatus);
		SubmissionSettings_VerifyToggleButtonsState();
		WebDriverWaits.ClickOn(SaveChangesButton);
	}

	public static void SubmissionSettings_VerifyselectionOfAnonymousToggles() throws InterruptedException {
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(YesToggle2);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		String GetClass = WebDriverWaits.WaitUntilVisibleWE(YesToggle2).getAttribute("class");
		ToggleButtonState4 = GetClass.equals("square-btn btn btn-primary");
		System.out.println(ToggleButtonState4);		
	}

	public static void SubmissionSettings_VerifyPostAnonymouslyForYesToggle() throws InterruptedException {
		WebDriverWaits.ClickOn(YesToggle2);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(8000);
		WebDriverWaits.ClickOn(PlusIconToCRM);
		WebDriverWaits.ClickOn(CustomerSubmissionOption);
		Thread.sleep(4000);
		WebElement PostAnonymously = WebDriverWaits.WaitUntilVisibleWE(PostAnonymouslyCheckbox);
		PostAnonymouslyPresence = PostAnonymously.isDisplayed();
	}

	public static void SubmissionSettings_VerifyPostAnonymouslyForNoToggle() throws InterruptedException {
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(NoToggle2);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(PlusIconToCRM);
		WebDriverWaits.ClickOn(CustomerSubmissionOption);
		Thread.sleep(4000);
		List<WebElement> PostAnonymously = driver.findElements(PostAnonymouslyCheckbox);
		PostAnonymouslyAbsence = PostAnonymously.size()==0;
		SubmissionDefaultsetttings();
	}
	
	
	public static void SubmissionDefaultsetttings() throws InterruptedException {
		
		driver.navigate().to(DataInterface.URLSubmissionSettings);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(YesToggle2);
		WebDriverWaits.ClickOn(SaveChangesButton);
		Thread.sleep(8000);
		
	}
	
	
}
