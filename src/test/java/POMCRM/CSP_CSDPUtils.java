package POMCRM;

import org.testng.asserts.SoftAssert;
import CommonMethods.CRMCommonMethods;
import CommonMethods.WebDriverWaits;

public class CSP_CSDPUtils extends CSDPUtils {
	
	public static void CSP_CSDP_CreateSubmissionWithAnonymousUser() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		CRMCommonMethods.CRM_CreateSubmission("Yes", "No", "No", "No", "No", "Location Not Included");		
		String AddedCustomer = WebDriverWaits.GetText(AddedCustomerName);
		softAssert.assertTrue(AddedCustomer.equals("Anonymous12344"));
		softAssert.assertAll(AddedCustomer);
	}
	
	public static void CSP_CSDP_CreateSubmissionWithoutContact() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		// without attachment as well
		CRMCommonMethods.CRM_CreateSubmission("No", "No", "No", "No", "No", "Location Not Included");
		String AddedCustomer = WebDriverWaits.GetText(AddedCustomerName);
		softAssert.assertTrue(AddedCustomer.equals("Unknown"));
		softAssert.assertAll();
	}

	public static void CSP_CSDP_CreateSubmissionWithoutLocation() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
		//assertion
		softAssert.assertAll();
	}

	public static void CSP_CSDP_CreateSubmissionWithoutTags() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		// location included covered as well
		CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "No", "Yes", "Yes", "Location Required");
		//assertion
		softAssert.assertAll();
	}


}
