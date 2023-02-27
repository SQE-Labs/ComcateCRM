package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMCRM.DashboardCRMUtils;

public class DashboardCRM extends DashboardCRMUtils{
		
	 @Test(priority = 1)
	public static void Dashboard_VerifyCRMToggleButton() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyCRMToggleButton ");
		extentTest.setDescription(" Verify that 'CRM' toggle button appears beside 'Dashboard' header, on 'Dashboard' page. ");
		DashboardCRMUtils.Dashboard_VerifyCRMToggleButton();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CRMToggleText, "CRM");
		softAssert.assertAll();
	 }

	 @Test(priority = 2)
	public static void Dashboard_VerifyDirectionToCRMDashboard() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyDirectionToCRMDashboard ");
		extentTest.setDescription(" Verify that user gets directed to CRM Dashboard, after clicking on 'CRM' toggle button, on Dashboard. ");
		DashboardCRMUtils.Dashboard_VerifyDirectionToCRMDashboard();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SLAHeaderText, "SLA");	
		softAssert.assertAll();
	}

	 @Test(priority = 3)
	public static void Dashboard_VerifyDirectionToCSLPForAssignedToMELink() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyDirectionToCSLPForAssignedToMELink ");
		extentTest.setDescription(" Verify that user gets directed to CSLP with respective Filter applied, after clicking on 'Open submission assigned for me' link, on Dashboard. ");
		DashboardCRMUtils.Dashboard_VerifyDirectionToCSLPForAssignedToMELink();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckMineButtonState);
		softAssert.assertAll();
	}

	 @Test(priority = 4)
	public static void Dashboard_VerifyDirectionToCSLPForMyDepartment() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyDirectionToCSLPForMyDepartment ");
		extentTest.setDescription(" Verify that user gets directed to CSLP with respective Filter applied, after clicking on 'Open submissions for my department' link, on Dashboard. ");
		DashboardCRMUtils.Dashboard_VerifyDirectionToCSLPForMyDepartment();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	 @Test(priority = 5)
	public static void Dashboard_VerifyDirectionToCSLPForMyAgency() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyDirectionToCSLPForMyAgency ");
		extentTest.setDescription(" Verify that user gets directed to CSLP with respective Filter applied, after clicking on 'Open submissions for my agency' link, on Dashboard. ");
		DashboardCRMUtils.Dashboard_VerifyDirectionToCSLPForMyAgency();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	 @Test(priority = 6)
	public static void Dashboard_VerifyTheCountOfSubmissions() throws InterruptedException {
		extentTest = extent.startTest(" Dashboard_VerifyTheCountOfSubmissions ");
		extentTest.setDescription(" Verify that accurate count of Submissions appears on CSLP, when user clicks on respective link on Dashboard. ");
		DashboardCRMUtils.Dashboard_VerifyTheCountOfSubmissions();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubCountForAssignedToMe, CountAtCSLPForLink1);
		softAssert.assertEquals(SubCountForMyDepartment, CountAtCSLPForLink2);
		softAssert.assertEquals(SubCountForMyAgency, CountAtCSLPForLink3);
		softAssert.assertAll();
	}


}
