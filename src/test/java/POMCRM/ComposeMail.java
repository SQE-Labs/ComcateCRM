package POMCRM;

import CommonMethods.CRMCommonMethods;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ComposeMail extends CSPInternalUtils {

	public static By MessagesIcon = By.xpath("//p[text()='Messages']/parent::div//button");
	public static By SubjectField = By
			.xpath("//div[@class='fade compose-email modal-base modal show']//input[@name='subject']");
	public static By IframeBody = By.xpath("//iframe[@id='compose-email-html-editor-modal_ifr']");
	public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	public static By SendButton = By.xpath("//button[text()='Send']");

	public static void ComposeMessage() throws InterruptedException, MessagingException, IOException {
		SoftAssert softAssert = new SoftAssert();
//		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
//		Thread.sleep(20000);
//		WebDriverWaits.ClickOn(MessagesIcon);
//		RandomSubject = RandomStrings.RequiredString(10);
//		WebDriverWaits.SendKeys(SubjectField, RandomSubject);
//		WebElement switchFrame = WebDriverWaits.WaitUntilVisibleWE(IframeBody);
//		Thread.sleep(2000);
//		driver.switchTo().frame(switchFrame);
//		String RandomBody = "Random Body" + RandomStrings.RequiredString(50);
//		WebDriverWaits.SendKeys(MessageBody, RandomBody);
//		driver.switchTo().defaultContent();
//		WebDriverWaits.ClickOn(SendButton);
//		Thread.sleep(2000);
		CustomerReceivedMail(SMSAndEmailVerificationUtils.RandomSubject);
		boolean ExpectedCount = GMailHelper.SearchedMailCount == 1;
		softAssert.assertTrue(ExpectedCount);
		softAssert.assertAll();

	}

	public static void CustomerReceivedMail(String SearchBySubject) throws InterruptedException, MessagingException, IOException {

		String userName = "automationcomcate@gmail.com";
		String password = "wmvssnvqztusgxva";

		GMailHelper gmailHelper = new GMailHelper(userName, password);

		// Date mailSendTime = new Date("Thu May 18 03:28:19 EST 2018");
//		System.out.println("Mail send time : " + mailSendTime.toString());

		List<javax.mail.Message> inboxMessageList = gmailHelper.searchEmail(2, "Inbox", SearchBySubject);
//			Message firstMessage = inboxMessageList.get(0);
//			String body = gmailHelper.getText(true, (Part) firstMessage.getContent());
//
//			System.out.println("Message Subject : " + firstMessage.getSubject());
//			System.out.println("Message Content : " + body);

	}
}
