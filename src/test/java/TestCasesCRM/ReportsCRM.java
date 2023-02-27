package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.ReportsCRMUtils;

public class ReportsCRM extends ReportsCRMUtils{
	
	 @Test(priority = 0)
	public static void Reports_PreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" Reports_PreRequisite ");
		ReportsCRMUtils.Reports_PreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
		}

	@Test(priority = 1)
	public static void Reports_VerifyAdditionOfNewReports() throws InterruptedException {
		extentTest = extent.startTest(" Reports_VerifyAdditionOfNewReports ");
		extentTest.setDescription(
				" Verify that user is able to add new Reports under 'QS Reports' section, on 'Edit & Configure CRM' popup. ");
		ReportsCRMUtils.Reports_VerifyAdditionOfNewReports();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(StatusFound);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void Reports_VerifyEditedQSReport() throws InterruptedException {
		extentTest = extent.startTest(" Reports_VerifyEditedQSReport ");
		extentTest.setDescription(
				" Verify that user is able to edit the added Reports under 'QS Reports' section, on 'Edit & Configure CRM' popup. ");
		ReportsCRMUtils.Reports_VerifyEditedQSReport();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EditedIDFound);
		softAssert.assertAll();
	}

	 @Test(priority = 3)
	public static void Reports_VerifyCRMToggleForReports() throws InterruptedException {
		extentTest = extent.startTest(" Reports_VerifyCRMToggleForReports ");
		extentTest.setDescription(" Verify that 'CRM' toggle appears on the header of 'Reports' page. ");
		ReportsCRMUtils.Reports_VerifyCRMToggleForReports();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckCRMToggle);	
		softAssert.assertAll();
	}

	 @Test(priority = 4)
	public static void Reports_VerifyAllCRMReports() throws InterruptedException {
		extentTest = extent.startTest(" Reports_VerifyAllCRMReports ");
		extentTest.setDescription(" Verify that all CRM Reports added on 'Edit & Configure CRM' popup appears, when user clicks on 'CRM' toggle, on 'Reports' page. ");
		ReportsCRMUtils.Reports_VerifyAllCRMReports();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareReports);	
		softAssert.assertAll();
	}

}
