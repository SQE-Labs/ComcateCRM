package POMCRM;

import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;

import BrowsersBase.DataInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import CommonMethods.WebDriverWaits;

import static org.testng.Assert.assertEquals;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

public class SMSAndEmailVerificationUtils extends CSDPUtils {

	public static By MessagesIcon = By.xpath("//p[text()='Messages']/parent::div//button");
	public static By SubjectField = By.xpath("//div[@class='fade compose-email modal-base modal show']//input[@name='subject']");
	public static By IframeBody = By.xpath("//iframe[@id='compose-email-html-editor-modal_ifr']");
	public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	public static By SendButton = By.xpath("//button[text()='Send']");
	public static By PrivateSubmissionHeader = By.xpath("//h2[@class='private-submission-details__number']");
	public static By ReceivedMailHeader = By.xpath("//td[@align='center']/h2");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");
//	public static By  = By.xpath("");
	
	public static String RandomSubject;

	public static void ComposeMessage() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
		Thread.sleep(20000);
		String SubmissionNumberSplit[] = WebDriverWaits.GetText(CreateAndLinkCaseUtils.SubmissionNumber).split("#");
		String SubmissionNumberCSDP = SubmissionNumberSplit[1];
		WebDriverWaits.ClickOn(MessagesIcon);
		RandomSubject = RandomStrings.RequiredCharacters(10);
		WebDriverWaits.SendKeys(SubjectField, RandomSubject);
		WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeBody);
		Thread.sleep(2000);
		driver.switchTo().frame(switchFrame);
		String RandomBody = "Random Body" + RandomStrings.RequiredString(50);
		WebDriverWaits.SendKeys(MessageBody, RandomBody);
		driver.switchTo().defaultContent();
		WebDriverWaits.ClickOn(SendButton);
		Thread.sleep(2000);
		TwilioGetMessage();
		String[] FetchAllText = URLSubmissionInfo.split("https");
		String FetchSMSURL = "https" + FetchAllText[1];
		driver.navigate().to(FetchSMSURL);
//		String FetchSMSSubmissionNumber[] = URLSubmissionInfo.split("submission ");
//		String FinalSubmissionNumber[] = FetchSMSSubmissionNumber[1].split(" https");
//		System.out.println(FinalSubmissionNumber[0]);
		String OpenedSubmissionHeader[] = WebDriverWaits.GetText(PrivateSubmissionHeader).split("Submission #");
		System.out.println(OpenedSubmissionHeader[1]);
		System.out.println(SubmissionNumberCSDP);
//		softAssert.assertTrue(FinalSubmissionNumber[0].equals(OpenedSubmissionHeader[1]+"\n\n\n"));
		softAssert.assertEquals(SubmissionNumberCSDP,OpenedSubmissionHeader[1]);
		softAssert.assertAll();
	}


	public static final String ACCOUNT_SID = "AC98027249ebb226c5a5fac9eb11850e95";
	public static final String AUTH_TOKEN = "dfbfa613117596b5aab78f1e228143b3";
	public static String URLSubmissionInfo;
	public static String LatestSID;

	public static void TwilioGetMessage() throws InterruptedException {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

//		Call call = Call.fetcher("CA42ed11f93dc08b952027ffbc406d0868").fetch();
//		System.out.println(call.getTo());
		Thread.sleep(2000);
		ResourceSet<Message> messages = Message.reader().limit(1).read();
		for (Message record : messages) {
			Thread.sleep(2000);
			LatestSID = record.getSid();
			System.out.println(LatestSID);
		}

//		Message message = Message.fetcher("SM266b3c72cea3c143fa1040d10079923e").fetch();
		Message message = Message.fetcher(LatestSID).fetch();
		System.out.println(message.getTo());
		URLSubmissionInfo = message.getBody();
		System.out.println(URLSubmissionInfo);

		ResourceSet<Call> calls = Call.reader().read();
		for (Call call : calls) {
			System.out.println(call.getDirection());
		}
	}
	
	public static void VerifyMailReceivedByAssignee() throws InterruptedException, MessagingException, IOException{
		SoftAssert softAssert = new SoftAssert();
		CRMCommonMethods.CRM_CreateExternalSubmission("Yes","Location Not Required","No","Yes");
		Thread.sleep(2000);
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CSLPUtils.CSLPTab);
		Thread.sleep(6000);
		String SubmissionToSearch = WebDriverWaits.GetText(CSLPUtils.SubmissionID);
		ComposeMail.CustomerReceivedMail(SubmissionToSearch);
		boolean ExpectedCount = GMailHelper.SearchedMailCount == 1;
		softAssert.assertTrue(ExpectedCount);
		softAssert.assertAll();
	}
	
	public static void VerifyMailReceivedByCollaborator() throws InterruptedException, MessagingException, IOException, AWTException{
		SoftAssert softAssert = new SoftAssert();
		CRMCommonMethods.CRM_CreateExternalSubmission("Yes","Location Not Required","No","Yes");
		Thread.sleep(2000);
		driver.navigate().to(DataInterface.URLDashboard);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(CSLPUtils.CSLPTab);
		Thread.sleep(6000);
		String SubmissionToSearch = WebDriverWaits.GetText(CSLPUtils.SubmissionID);
		String CurrentWindow = driver.getWindowHandle();
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(9000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(1000);
		driver.navigate().to("https://yopmail.com/en/");
		Thread.sleep(3000);
		WebDriverWaits.SendKeys(YopmailSearchUser, DataInterface.AgencyUsername);
		WebDriverWaits.ClickOn(YopmailInboxArrow);
		Thread.sleep(3000);
		WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeSwitch);
		Thread.sleep(2000);
		driver.switchTo().frame(switchFrame);
		Thread.sleep(2000);
		String GetHeaderFromMail[] = WebDriverWaits.GetText(ReceivedMailHeader).split("#");
		String ReceivedSubmissionID[] = GetHeaderFromMail[1].split(")");
		Thread.sleep(3000);
		driver.switchTo().window(CurrentWindow);
		softAssert.assertEquals(SubmissionToSearch, ReceivedSubmissionID[0]);
		softAssert.assertAll();
	}


}
