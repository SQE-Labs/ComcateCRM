package TestCasesCRM;

import org.testng.annotations.Test;

import POMCRM.SMSAndEmailVerificationUtils;

import java.awt.*;
import java.io.IOException;

import javax.mail.MessagingException;

public class SMSAndEmailVerification extends SMSAndEmailVerificationUtils{

	@Test(priority = 1)
	public static void ComposeMessage() throws InterruptedException {
		extentTest = extent.startTest(" ComposeMessage ");
		Login.LoginAgencyStage();
		SMSAndEmailVerificationUtils.ComposeMessage();
	}

	@Test(priority = 2)
	public static void ComposeMail() throws InterruptedException, AWTException, MessagingException, IOException {
		extentTest = extent.startTest(" ComposeMail ");
		POMCRM.ComposeMail.ComposeMessage();
	}

	@Test(priority = 3)
	public static void VerifyMailReceivedByAssignee() throws InterruptedException, MessagingException, IOException {
		extentTest = extent.startTest(" VerifyMailReceivedByAssignee ");
		SMSAndEmailVerificationUtils.VerifyMailReceivedByAssignee();
	}

	@Test(priority = 4)
	public static void VerifyMailReceivedByCollaborator() throws InterruptedException, MessagingException, IOException, AWTException {
		extentTest = extent.startTest(" VerifyMailReceivedByCollaborator ");
		SMSAndEmailVerificationUtils.VerifyMailReceivedByCollaborator();
	}

//	@Test(priority = )
//	public static void SMSVerification() throws InterruptedException {
//		extentTest = extent.startTest("  ");
//		SMSAndEmailVerificationUtils.SMSVerification();
//	}

}
