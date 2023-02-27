package TestCasesCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonMethods.WebDriverWaits;
import POMCRM.CategoriesUtils;

public class Categories extends CategoriesUtils {

	@Test(priority = 0)
	public static void Categories_PreRequisite() throws InterruptedException {
		extentTest = extent.startTest(" Categories_PreRequisite ");
		CategoriesUtils.Categories_PreRequisite();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Categories", TabTitle);
		softAssert.assertAll();
	}

	@Test(priority = 1)
	public static void Categories_VerifyDefaultCategory() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyDefaultCategory ");
		extentTest.setDescription(
				" Verify that by default 'Other' category appears under 'Active Category' section, on 'Categories' page. ");
		CategoriesUtils.Categories_VerifyDefaultCategory();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(OtherTabTitle.equals("Other"));
		softAssert.assertTrue(EditOtherPopupTitle.equals("Edit Other"));
	}

	@Test(priority = 2)
	public static void Categories_UpdateDefaultResolutionTime() throws InterruptedException {
		extentTest = extent.startTest(" Categories_UpdateDefaultResolutionTime ");
		extentTest.setDescription(
				" Verify that user is able to edit & save the Default Resolution Time, on 'Categories' page. ");
		CategoriesUtils.Categories_UpdateDefaultResolutionTime();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EditResolutionPopupTitle.equals("Edit Default Resolution Time"));
//		softAssert.assertTrue(ResolutionTimeValidationMsg.equals("The Resolution Time is required."));
		softAssert.assertTrue(ResoTextAfter[0].equals(NewResoTime));
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public static void Categories_OpenCreateACategoryPopup() throws InterruptedException {
		extentTest = extent.startTest(" Categories_OpenCreateACategoryPopup ");
		extentTest.setDescription(
				" Verify that 'Create a Category' popup opens up, when user clicks on 'Create Category' button, on 'Categories' page. ");
		CategoriesUtils.Categories_OpenCreateACategoryPopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CreateCategoryPopupTitle.equals("Create a Category"));
		NameFieldValidationMsg = WebDriverWaits.GetText(ValidationMsgNameField);
		softAssert.assertTrue(NameFieldValidationMsg.equals("The Name is required."));
		softAssert.assertAll();
	}

	@Test(priority = 4)
	public static void Categories_VerifyResolutionTimeOnCreateCategoryPopup() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyResolutionTimeOnCreateCategoryPopup ");
		extentTest.setDescription(
				" Verify that corresponding Resolution Time appears on 'Create a Category' popup with Resolution Time under 'Categories' tab. ");
		CategoriesUtils.Categories_VerifyResolutionTimeOnCreateCategoryPopup();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(ResoTimeOnPopup.equals(NewResoTime));
		softAssert.assertAll();
	}

	@Test(priority = 5)
	public static void Categories_AddKeywordsAndCustomFields() throws InterruptedException {
		extentTest = extent.startTest(" Categories_AddKeywordsAndCustomFields ");
		extentTest.setDescription(
				" Verify that user is able to add Keywords & Custom Fields, on 'Create a Category' popup. ");
		CategoriesUtils.Categories_AddKeywordsAndCustomFields();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(KeywordsSizeBefore == 10);
		softAssert.assertTrue(KeywordsSizeAfter == (KeywordsSizeBefore - 7));
		softAssert.assertTrue(FieldsCount == 1);
		softAssert.assertTrue(LabelFieldValidationMsg.equals("The Label is required."));
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public static void Categories_VerifyLinkedEmailTemplates() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyLinkedEmailTemplates ");
		extentTest.setDescription(" Verify that user is able to link Email Templates, on 'Create a Category' popup. ");
		CategoriesUtils.Categories_VerifyLinkedEmailTemplates();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(LabelText.equals("Select"));
		softAssert.assertTrue(CheckedTemplate.equals(SelectedTemplate));
		softAssert.assertAll();
	}

	@Test(priority = 7)
	public static void Categories_VerifyCategoryCreation() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyCategoryCreation ");
		extentTest.setDescription(
				" Verify that user is able to create a Category, after entering data in all mandatory fields, on 'Create a Category' popup. ");
		CategoriesUtils.Categories_VerifyCategoryCreation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CategoriesCountAfter1 == (CategoriesCountBefore + 1));
		softAssert.assertAll();
	}

	@Test(priority = 8)
	public static void Categories_VerifyNoCategoryCreationOnCancel() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyNoCategoryCreationOnCancel ");
		extentTest.setDescription(
				" Verify that Category does not get created, when user clicks on 'Cancel' button, on 'Create a Category' popup. ");
		CategoriesUtils.Categories_VerifyNoCategoryCreationOnCancel();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CategoriesCountAfter2 == (CategoriesCountBefore + 1));
		softAssert.assertAll();
	}

	@Test(priority = 9)
	public static void Categories_CantCreateCategoryWithExistingName() throws InterruptedException {
		extentTest = extent.startTest(" Categories_CantCreateCategoryWithExistingName ");
		extentTest.setDescription(
				" Verify that  user is not able to create a Category with existing Name, on 'Categories' page. ");
		CategoriesUtils.Categories_CantCreateCategoryWithExistingName();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(NotificationText.equals("Category exists already."));
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public static void Categories_VerifyUpdatedCategory() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyUpdatedCategory ");
		extentTest.setDescription(" Verify that user is able to edit & save a Category, on 'Categories' page. ");
		CategoriesUtils.Categories_VerifyUpdatedCategory();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CategoriesCountAfter3 == (CategoriesCountBefore));
		softAssert.assertTrue(InactiveCountAfter == (InactiveCountBefore + 1));
		softAssert.assertAll();
	}

	@Test(priority = 11)
	public static void Categories_VerifyAccurateCount() throws InterruptedException {
		extentTest = extent.startTest(" Categories_VerifyAccurateCount ");
		extentTest.setDescription(" Verify that accurate count of Categories appear, on 'Categories' page. ");
		CategoriesUtils.Categories_VerifyAccurateCount();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CategoriesCountHeader1 == CountCategoriesActual);
		softAssert.assertAll();
	}

}
