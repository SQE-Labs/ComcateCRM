package TCsNewAgencySetup;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMNewAgencySetup.AgencyCreationUtils;

public class AgencyCreation extends AgencyCreationUtils{

	@Test(priority = 0)
	public static void AgencyCreation_OpenCreateAgencyPopup() throws InterruptedException {
		extentTest = extent.startTest(" AgencyCreation_OpenCreateAgencyPopup ");
		extentTest.setDescription(" Verify that 'Create Agency' popup opens up, when user clicks on 'Create Agency' button, on 'Agencies' page. ");
		AgencyCreationUtils.AgencyCreation_OpenCreateAgencyPopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(CreateAgencyPopupTitle, "Create Agency");
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public static void AgencyCreation_ConfigureCE() throws InterruptedException {
		extentTest = extent.startTest(" AgencyCreation_ConfigureCE ");
	    extentTest.setDescription(" Verify that user is able to Add & Configure Code Enforcement under 'Product Configuration' section, on 'Create Agency' popup. ");
		AgencyCreationUtils.AgencyCreation_ConfigureCE();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddAndConfigureCEPopupTitle, "Add & Configure Code Enforcement");
		softAssert.assertEquals(ValidationMSgProdName, ExpectedValidationMsgProdName);
		softAssert.assertEquals(ValidationMSgCharLimit, ExpectedProdCharLimitMsg);
		softAssert.assertEquals(AddedCETitle, "CE");
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public static void AgencyCreation_ConfigureCRM() throws InterruptedException {
		extentTest = extent.startTest(" AgencyCreation_ConfigureCRM ");
	    extentTest.setDescription(" Verify that user is able to Add & Configure CRM under 'Product Configuration' section, on 'Create Agency' popup. ");
		AgencyCreationUtils.AgencyCreation_ConfigureCRM();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(AddAndConfigureCRMPopupTitle, "Add & Configure CRM");
		softAssert.assertEquals(ValidationMSgProdNameCRM, ExpectedValidationMsgProdName);
		softAssert.assertEquals(ValidationMSgCharLimitCRM, ExpectedProdCharLimitMsgCRM);
		softAssert.assertEquals(AddedCRMTitle, "CRM");
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void AgencyCreation_VerifyNewAgencyCreation() throws InterruptedException {
		extentTest = extent.startTest(" AgencyCreation_VerifyNewAgencyCreation ");
	    extentTest.setDescription(" Verify that user is able to create a new Agency, after enter valid data in the mandatory fields, on 'Agencies' page. ");
		AgencyCreationUtils.AgencyCreation_VerifyNewAgencyCreation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(NewAgencyTitle, RandomAgencyName);
		softAssert.assertAll();
	}	
}
