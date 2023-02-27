package POMCRM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import BrowsersBase.DataInterface;
import CommonMethods.WebDriverWaits;
public class DashboardCRMUtils extends CSLPUtils{
		
	public static By CRMToggle = By.xpath("//div[@class='multi-choice-buttons']/button[2]");
	public static By SLAHeader = By.xpath("//div[@class='dashboard__widgets-holder dashboard__widgets-holder--cases']/h2");
	public static By AssignedForMeLink = By.xpath("//div[@class='widget widget--all-dashboard']/a/label");
	public static By MineButton = By.xpath("//button[text()='Mine']");
	public static By ForMyDepartMentLink = By.xpath("//div[@class='widget widget--all-dashboard'][2]//label");
	public static By ForMyAgency = By.xpath("//div[@class='widget widget--all-dashboard'][3]//label");
	public static By CountAtLink1 = By.xpath("//div[@class='widget widget--all-dashboard']//a/span[1]");
	public static By CountAtLink2 = By.xpath("(//div[@class='widget widget--all-dashboard']//a/span[1])[2]");
	public static By CountAtLink3 = By.xpath("(//div[@class='widget widget--all-dashboard']//a/span[1])[3]");
	public static By SubmissionID = By.xpath("//span[@class='checkbox-holder']/following::a[1]");

	public static int CountAtCSLPForLink1;
	public static int CountAtCSLPForLink2;
	public static int CountAtCSLPForLink3;
	public static String CRMToggleText;
	public static String SLAHeaderText;
	public static boolean CheckMineButtonState;
	public static String SubCountForAssignedToMe;
	public static String SubCountForMyDepartment;
	public static String SubCountForMyAgency;
	
	public static void Dashboard_VerifyCRMToggleButton() throws InterruptedException {
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(3000);
		CRMToggleText = WebDriverWaits.GetText(CRMToggle);
	}

	public static void Dashboard_VerifyDirectionToCRMDashboard() throws InterruptedException {
		WebDriverWaits.ClickOn(CRMToggle);
		Thread.sleep(3000);
		SLAHeaderText = WebDriverWaits.GetText(SLAHeader);
	}

	public static void Dashboard_VerifyDirectionToCSLPForAssignedToMELink() throws InterruptedException {
		WebDriverWaits.ClickOn(AssignedForMeLink);
		Thread.sleep(3000);
		CheckMineButtonState = WebDriverWaits.WaitUntilVisibleWE(MineButton).isEnabled();
		List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
		CountAtCSLPForLink1 = AllSubmissionsID.size();
	}

	public static void Dashboard_VerifyDirectionToCSLPForMyDepartment() throws InterruptedException {
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CRMToggle);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(ForMyDepartMentLink);		
		Thread.sleep(3000);
		List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
		CountAtCSLPForLink2 = AllSubmissionsID.size();
	}

	public static void Dashboard_VerifyDirectionToCSLPForMyAgency() throws InterruptedException {
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CRMToggle);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(ForMyAgency);
		Thread.sleep(3000);
		List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
		CountAtCSLPForLink3 = AllSubmissionsID.size();
	}

	public static void Dashboard_VerifyTheCountOfSubmissions() throws InterruptedException {
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(CRMToggle);
		Thread.sleep(3000);
		SubCountForAssignedToMe = WebDriverWaits.GetText(CountAtLink1);
		SubCountForMyDepartment = WebDriverWaits.GetText(CountAtLink2);
		SubCountForMyAgency = WebDriverWaits.GetText(CountAtLink3);
	}


}
