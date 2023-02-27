package TestCasesCRM;

import java.awt.AWTException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.WebDriverWaits;
import POMCRM.CreateCRMUserUtils;

public class CreateCRMUser extends CreateCRMUserUtils {

	@Test(priority = 1)
	public static void CreateCRMUser_CreateStandardUser() throws InterruptedException {
		extentTest = extent.startTest(" CreateCRMUser_CreateStandardUser ");
		extentTest.setDescription(
				" Verify that user is able to create a user with 'Standard User CRM' Role and Group, on the 'Create User' page. ");
		CreateCRMUserUtils.CreateCRMUser_CreateStandardUser();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateStandardUser_CompareCount, true);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void CreateCRMUser_CreateProductAdminUser() throws InterruptedException {
		extentTest = extent.startTest(" CreateCRMUser_CreateProductAdminUser ");
		extentTest.setDescription(
				" Verify that user is able to create a user with 'Product Admin CRM' Role and Group, on the 'Create User' page. ");
		CreateCRMUserUtils.CreateCRMUser_CreateProductAdminUser();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateProductAdminUser_CompareCount, true);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void CreateCRMUser_UpdateCEOnlyUserToCRMOnly() throws InterruptedException {
		extentTest = extent.startTest(" CreateCRMUser_UpdateCEOnlyUserToCRMOnly ");
		extentTest.setDescription(
				" Verify that user is able to update the permissions of a CE only user to CRM only, on the 'Edit User' page ");
		CreateCRMUserUtils.CreateCRMUser_UpdateCEOnlyUserToCRMOnly();
		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(, true);
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void CreateCRMUser_VerifyCRMProductAccessToCRMUser() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" CreateCRMUser_VerifyCRMProductAccessToCRMUser ");
		extentTest.setDescription(
				" Verify that user is able to access CRM product, after changing the permissions from CE only to CRM only, on the 'Edit User' page ");
		CreateCRMUserUtils.CreateCRMUser_VerifyCRMProductAccessToCRMUser();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CRMAccess, true);
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser() throws InterruptedException, AWTException {
		extentTest = extent.startTest(" CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser ");
		extentTest.setDescription(
				" Verify that user is not able to access CE product, after changing the permissions from CE only to CRM only, on the 'Edit User' page ");
		//WebDriverWaits.CloseOtherTabs();
		CreateCRMUserUtils.CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CEAbsence, true);
		softAssert.assertAll();
	}

}
