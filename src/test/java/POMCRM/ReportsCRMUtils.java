package POMCRM;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
public class ReportsCRMUtils extends DashboardCRMUtils {
	public static By CRMSectionEditIcon = By.xpath("//h4[text()='CRM']/following::button[1]");
	public static By AddReportLinkText = By.xpath("//div[text()='Add Report']");
	public static By DashboardNameField = By.xpath("//label[@title='Dashboard Name']/following::input[1]");
	public static By DashboardIDField = By.xpath("//label[@title='Dashboard ID']/following::input[1]");
	public static By AddReportButton = By.xpath("//button[text()='Add Report']");
	public static By QSReportsList = By
			.xpath("//div[@class='product-form__executive-reports']//div[@class='rt-td'][1]");
	public static By QSReportEditIcon = By.xpath("//div[@class='product-form__executive-reports']//button");
	public static By DashboardIDList = By
			.xpath("//div[@class='product-form__executive-reports']//div[@class='rt-td'][2]");
	public static By SaveButton = By.xpath("//div[@class='integration__footer']/button[text()='Save']");
	public static By SaveQSReportPopup =  By.xpath("//div[@class='product-form__footer']/button[text()='Save']");
	public static By SaveEditAgencyPopup =  By.xpath("//div[@class='case-header__actions']/button[text()='Save']");
	public static By ReportsTab =  By.xpath("//a[text()='Reports']");
	public static By CRMToggle =  By.xpath("//button[text()='CRM']");
	public static By AppReportsList =  By.xpath("//div[@class='sidebar']//label");
	public static By QsReportNextListButton = By.xpath("(//div[text()='Edit & Configure CRM']//following::div[@class='table__pagination-nav-btns']//button)[2]");
    public static By QsReportPreListButton = By.xpath("(//div[text()='Edit & Configure CRM']//following::div[@class='table__pagination-nav-btns']//button)[1]");
	
	public static By SaveReportAdded = By.xpath("//div[text()='Edit & Configure CRM']//following::button[text()='Save']");
	public static By SaveEditAgency = By.xpath("//h1[text()='Edit Agency']//following::button[text()='Save']");
	public static By ActiveQSReport = By.xpath("//*[@class='product-form__executive-reports']//div[text()='Active']//ancestor::div[@class='rt-tr-group']//div[@class='rt-td'][1]");
	
	public static String RandomID;
	public static ArrayList<String> ReportsListAdmin = new ArrayList<String>();
	public static boolean StatusFound;
	public static boolean EditedIDFound;
	public static boolean CheckCRMToggle;
	public static boolean CompareReports;
	public static void Reports_PreRequisite() throws InterruptedException {
      //WebDriverWaits.closetabs();
		LoginAdmin();
		Thread.sleep(10000);
		String AgencyID = Integer.toString(DataInterface.AgencyID);
		WebDriverWaits.SendKeys(AgencySearchField, AgencyID);
		Thread.sleep(5000);
		WebDriverWaits.ClickOn(EditAgencyIcon);
		Thread.sleep(10000);
		WebDriverWaits.WaitUntilVisible(CRMSectionEditIcon);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(CRMSectionEditIcon);
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		WebDriverWaits.ClickOn(CRMSectionEditIcon);
		Thread.sleep(2000);
		
//		List<WebElement> QSReports = driver.findElements(QSReportsList);
//		for (int i = 0; i < QSReports.size(); i++) {
//			WebElement QSReport = QSReports.get(i);
//			String QSReportText = QSReport.getText();
//			ReportsListAdmin.add(QSReportText);
//		}
	}
	public static void Reports_VerifyAdditionOfNewReports() throws InterruptedException {
		WebDriverWaits.ClickOn(AddReportLinkText);
		String RandomName = RandomStrings.RequiredCharacters(9);
		RandomID = RandomStrings.RequiredString(15);
		WebDriverWaits.SendKeys(DashboardNameField, RandomName);
		WebDriverWaits.SendKeys(DashboardIDField, RandomID);
		WebDriverWaits.ClickOn(AddReportButton);
		Thread.sleep(7000);
		if (driver.findElements(QsReportPreListButton).size() > 0) {
		Boolean listPrebtncheck = driver.findElement(QsReportPreListButton).isEnabled();
		while(listPrebtncheck){
		    WebDriverWaits.ClickOn(QsReportPreListButton);
		    Thread.sleep(2000);
		    listPrebtncheck = driver.findElement(QsReportPreListButton).isEnabled();
			
			
		}
		
		}
		
		List<String> QSReportText = new ArrayList<String>();
		driver.findElements(ActiveQSReport).stream().forEach(x -> QSReportText.add(x.getText()) );
		
		if(driver.findElements(QsReportNextListButton).size() > 0) {

		Boolean listbtncheck = driver.findElement(QsReportNextListButton).isEnabled();
		while(listbtncheck){
		    WebDriverWaits.ClickOn(QsReportNextListButton);
		    listbtncheck = driver.findElement(QsReportNextListButton).isEnabled();
			Thread.sleep(1000);
			driver.findElements(ActiveQSReport).stream().forEach(x -> QSReportText.add(x.getText()) );
		}
		}

		int Count = 0;
		for (int j = 0; j < QSReportText.size(); j++) {
			String QSReporty = QSReportText.get(j);
			
			if (QSReporty.equals(RandomName)) {
				Count++;
			}
		}
		
		
		for (int ix = 0; ix < QSReportText.size(); ix++) {
			String QSReportz = QSReportText.get(ix);
			
			ReportsListAdmin.add(QSReportz);
		}
		
		
		
		StatusFound = (Count == 1);
		WebDriverWaits.ClickOn(SaveReportAdded);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(SaveEditAgency);
		Thread.sleep(10000);
	}
	public static void Reports_VerifyEditedQSReport() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(EditAgencyIcon);
		Thread.sleep(10000);
		WebDriverWaits.WaitUntilVisible(CRMSectionEditIcon);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(CRMSectionEditIcon);
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		WebDriverWaits.ClickOn(CRMSectionEditIcon);
		Thread.sleep(2000);
		RandomID = RandomStrings.RequiredString(15);
		String DashboardNewId = "Edited123#";
		WebDriverWaits.ClickOn(QSReportEditIcon);
		Thread.sleep(2000);
		driver.findElement(DashboardIDField).clear();
		WebDriverWaits.SendKeys(DashboardIDField, DashboardNewId);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(5000);
		String DashboardIDs = driver.findElement(DashboardIDList).getText();
		int Count;
		
		if(DashboardIDs.equalsIgnoreCase(DashboardNewId)){
			Count = 1;
		}
		else {
			Count = 0;
		}
		
		EditedIDFound = (Count == 1);
		WebDriverWaits.ClickOn(SaveQSReportPopup);
		WebDriverWaits.ClickOn(SaveEditAgencyPopup);
	}
	public static void Reports_VerifyCRMToggleForReports() throws InterruptedException {
		//LoginAgency();
		driver.navigate().to("https://app-stage.comcate.com/agencies/181/reports");
		Thread.sleep(10000);
		WebDriverWaits.WaitUntilVisible(ReportsTab);
		WebDriverWaits.ClickOn(ReportsTab);
		Thread.sleep(10000);
		//driver.findElement(ReportsTab).click();
		List<WebElement> CRMTogglePresence = driver.findElements(CRMToggle);
		CheckCRMToggle = CRMTogglePresence.size()==1;
	}
	public static void Reports_VerifyAllCRMReports() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWaits.WaitUntilVisible(CRMToggle);
		WebDriverWaits.ClickOn(CRMToggle);
		Thread.sleep(12000);
		ArrayList<String> ReportsListApp = new ArrayList<String>();
		List<WebElement> ReportsList = driver.findElements(AppReportsList);
		for (int i = 0; i < ReportsList.size(); i++) {
			WebElement AppReports = ReportsList.get(i);
			String ReportsText = AppReports.getText();
			ReportsListApp.add(ReportsText);
		}
		CompareReports = (ReportsListApp.equals(ReportsListAdmin));
	}
}
