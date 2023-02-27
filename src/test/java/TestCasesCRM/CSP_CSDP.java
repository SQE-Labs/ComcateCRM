package TestCasesCRM;

import org.testng.annotations.Test;

import POMCRM.CSP_CSDPUtils;

public class CSP_CSDP extends CSP_CSDPUtils{

	@Test(priority = 1)
	public static void CSP_CSDP_CreateSubmissionWithAnonymousUser() throws InterruptedException {
		extentTest = extent.startTest(" CSP_CSDP_CreateSubmissionWithAnonymousUser ");
		CSP_CSDPUtils.CSP_CSDP_CreateSubmissionWithAnonymousUser();
	}
	
	@Test(priority = 2)
	public static void CSP_CSDP_CreateSubmissionWithoutContact() throws InterruptedException {
		extentTest = extent.startTest(" CSP_CSDP_CreateSubmissionWithoutContact ");
		CSP_CSDPUtils.CSP_CSDP_CreateSubmissionWithoutContact();
	}

	@Test(priority = 3)
	public static void CSP_CSDP_CreateSubmissionWithoutLocation() throws InterruptedException {
		extentTest = extent.startTest(" CSP_CSDP_CreateSubmissionWithoutLocation ");
		CSP_CSDPUtils.CSP_CSDP_CreateSubmissionWithoutLocation();
	}

	@Test(priority = 4)
	public static void CSP_CSDP_CreateSubmissionWithoutTags() throws InterruptedException {
		extentTest = extent.startTest(" CSP_CSDP_CreateSubmissionWithoutTags ");
		CSP_CSDPUtils.CSP_CSDP_CreateSubmissionWithoutTags();
	}

}
