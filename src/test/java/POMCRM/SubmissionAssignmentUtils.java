package POMCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.DataInterface;
import CommonMethods.RandomStrings;
import CommonMethods.WebDriverWaits;

public class SubmissionAssignmentUtils extends CategoriesUtils {

	public static String editAssignmentIcon = "//div[text()='Submission Received']//following::button[1]";
	public static String editAssignmentPopup = "//div[@class='full-page-modal__header']/h1";
	public static String nameField = "//label[@title='Name']/following::input[@name='label']";
	public static String descriptionField = "//input[@name='description']";
	public static String actionDropdown = "//div[@class='Select-value']";
	public static String optionActionDropdown = "//*[text()='Submission Received']";
	public static String saveButton = "//button[text()='Save']";
	public static String crossIconRuleSet = "//div[@class='sortable-table__body__td']/button[2]";
	public static String validationNoRule = "//div[@class='modal-base__error modal-base__error--show']";
	public static String addRuleButton = "//button[text()='Add Rule']";
	public static String createRule = "//h1[text()='Create Rule']";
	public static String criteriaFields = "//label[@title='Attribute']/following::div[@class='Select-placeholder'][1]";
	public static String zipOption = "//*[text()='Zip']";
	public static String equalsOption = "//*[text()='Equals']";
	public static String addCriteriaLink = "//a[text()='Add Criteria']";
	public static String valueField = "//input[@name='value']";
	public static String blockOption = "//*[text()='Block']";
	public static String equalsOption2 = "(//*[text()='Equals'])[2]";
	public static String valueField2 = "(//input[@name='value'])[2]";
	public static String caseAssigneeField = "//label[@for='caseAssignee']/following::label";
	public static String inspectionAssigneeField = "//label[@for='inspectionAssignee']/following::label[text()='Select Option']";
	public static String createRulebutton = "//button[text()='Create Rule']";
	public static String addedRule = "//div[@class='sortable-table__body__tr']";
	public static String editRuleIcon = "//div[@class='sortable-table__body__td']/button[1]";
	public static String crossCriteriaIcon = "(//div[@class='close-icon'])[2]";
	public static String saveButtonEditRule = "//h1[text()='Edit Rule']/following::button[text()='Save']";
	public static String assignCaseToColumn = "//div[@class='sortable-table__body__td'][2]";
	public static String deleteRuleIcon = "//div[@class='sortable-table__body__td']/button[2]";
	public static String inactiveToggle = "//button[text()='Inactive']";
	public static String activeToggle = "//button[text()='Active']";
	public static String defaultAssigneeField = "//label[@for='assignee']/following::label[1]";
	public static String selectCollaboratorField = "//label[@for='collaborators']/following::label[1]";
	public static String assigneeOption = "//label[@for='assignee']/following::ul/li[1]";
	public static String collaboratorsOption = "//label[@for='collaborators']/following::ul/li[1]";
	public static String assigneeOption2 = "//label[@for='assignee']/following::ul/li[2]";

	public static By EditAssignmentIcon = By.xpath(SubmissionAssignmentUtils.editAssignmentIcon);
	public static By EditAssignmentPopup = By.xpath(SubmissionAssignmentUtils.editAssignmentPopup);
	public static By NameField = By.xpath(SubmissionAssignmentUtils.nameField);
	public static By DescriptionField = By.xpath(SubmissionAssignmentUtils.descriptionField);
	public static By ActionDropdown = By.xpath(SubmissionAssignmentUtils.actionDropdown);
	public static By OptionActionDropdown = By.xpath(SubmissionAssignmentUtils.optionActionDropdown);
	public static By CrossIconRuleSet = By.xpath(SubmissionAssignmentUtils.crossIconRuleSet);
	public static By SaveButton = By.xpath(SubmissionAssignmentUtils.saveButton);
	public static By ValidationNoRule = By.xpath(SubmissionAssignmentUtils.validationNoRule);
	public static By AddRuleButton = By.xpath(SubmissionAssignmentUtils.addRuleButton);
	public static By CreateRule = By.xpath(SubmissionAssignmentUtils.createRule);
	public static By CriteriaFields = By.xpath(SubmissionAssignmentUtils.criteriaFields);
	public static By ZipOption = By.xpath(SubmissionAssignmentUtils.zipOption);
	public static By EqualsOption = By.xpath(SubmissionAssignmentUtils.equalsOption);
	public static By ValueField = By.xpath(SubmissionAssignmentUtils.valueField);
	public static By AddCriteriaLink = By.xpath(SubmissionAssignmentUtils.addCriteriaLink);
	public static By EqualsOption2 = By.xpath(SubmissionAssignmentUtils.equalsOption2);
	public static By DefaultAssigneeField = By.xpath(SubmissionAssignmentUtils.defaultAssigneeField);
	public static By SelectCollaboratorField = By.xpath(SubmissionAssignmentUtils.selectCollaboratorField);
	public static By AssigneeOption = By.xpath(SubmissionAssignmentUtils.assigneeOption);
	public static By CollaboratorsOption = By.xpath(SubmissionAssignmentUtils.collaboratorsOption);
	public static By CreateRulebutton = By.xpath(SubmissionAssignmentUtils.createRulebutton);
	public static By AddedRule = By.xpath(SubmissionAssignmentUtils.addedRule);
	public static By EditRuleIcon = By.xpath(SubmissionAssignmentUtils.editRuleIcon);
	public static By AssigneeOption2 = By.xpath(SubmissionAssignmentUtils.assigneeOption2);
	public static By SaveButtonEditRule = By.xpath(SubmissionAssignmentUtils.saveButtonEditRule);
	public static By AssignCaseToColumn = By.xpath(SubmissionAssignmentUtils.assignCaseToColumn);
	public static By DeleteRuleIcon = By.xpath(SubmissionAssignmentUtils.deleteRuleIcon);
	public static By InactiveToggle = By.xpath(SubmissionAssignmentUtils.inactiveToggle);
	public static By BlockOption = By.xpath(SubmissionAssignmentUtils.blockOption);
	public static By ValueField2 = By.xpath(SubmissionAssignmentUtils.valueField2);
	public static By ActiveToggle = By.xpath(SubmissionAssignmentUtils.activeToggle);

	public static String EditAssignmentPopupTitle;
	public static String NameValue;
	public static String RandomName;
	public static String NoRuleValidationText;
	public static String ExpectedValidation;
	public static String CreateRulePopupTitle;
	public static boolean SizeAfter;
	public static boolean CompareStr;
	public static boolean CompareCount_DeletedRule;

	public static void SubmissionAssignment_OpenEditAssignmentPopup() throws InterruptedException {
		driver.navigate().to(DataInterface.URLAssignmentRules);
		Thread.sleep(10000);
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(EditAssignmentIcon);
		Thread.sleep(4000);
		EditAssignmentPopupTitle = WebDriverWaits.GetText(EditAssignmentPopup);
	}

	public static void SubmissionAssignment_VerifyNoUpdationWithoutARule() throws InterruptedException {
		RandomName = RandomStrings.RequiredString(10);
		Thread.sleep(1000);
		WebElement Name = WebDriverWaits.WaitUntilVisibleWE(NameField);
		Thread.sleep(1000);
		Name.clear();
		Name.sendKeys(RandomName);
		NameValue = WebDriverWaits.WaitUntilVisibleWE(NameField).getAttribute("value");
		Thread.sleep(4000);
		int check = driver.findElements(CrossIconRuleSet).size();
		if (check >  0) {
			Boolean crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
			while(crosscheck){
				driver.findElement(CrossIconRuleSet).click();
				Thread.sleep(2000);
				if(driver.findElements(CrossIconRuleSet).size() > 0) {
				crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
			}
				else {
					crosscheck = false;
				}
		}
		}
		
//		List<WebElement> CrossIcon = driver.findElements(CrossIconRuleSet);
//		int CountCrossIcons = CrossIcon.size();
//		System.out.println(CountCrossIcons);
//		if (CountCrossIcons > 0) {
//			for (int i = 0; i < CountCrossIcons; i++) {
//				WebElement CrossList = CrossIcon.get(i);
//				Thread.sleep(4000);
//				CrossList.click();
//			}
//		}
		WebDriverWaits.ClickOn(SaveButton);
		NoRuleValidationText = WebDriverWaits.GetText(ValidationNoRule);
		ExpectedValidation = "At least one rule should be present.";
	}

	public static void SubmissionAssignment_OpenCreateRulePopup() throws InterruptedException {
		WebDriverWaits.ClickOn(AddRuleButton);
		CreateRulePopupTitle = WebDriverWaits.GetText(CreateRule);
	}

	public static void SubmissionAssignment_AddMultipleCriterias() throws InterruptedException {
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ZipOption);
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(EqualsOption);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(ValueField, "77590");
		WebDriverWaits.ClickOn(AddCriteriaLink);
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(BlockOption);
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(EqualsOption2);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(ValueField2, "1");
		WebDriverWaits.ClickOn(DefaultAssigneeField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AssigneeOption);
		WebDriverWaits.ClickOn(SelectCollaboratorField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CollaboratorsOption);
		WebDriverWaits.ClickOn(CreateRulebutton);
		Thread.sleep(2000);
		List<WebElement> RulesCount = driver.findElements(AddedRule);
		SizeAfter = RulesCount.size() >= 1;
	}

	@Test(priority = 4)
	public static void SubmissionAssignment_VerifyAddedRule() throws InterruptedException {
	}

	@Test(priority = 5)
	public static void SubmissionAssignment_EditAddedRule() throws InterruptedException {
		String AssigneeBefore = WebDriverWaits.GetText(AssignCaseToColumn);
		WebDriverWaits.ClickOn(EditRuleIcon);
		WebDriverWaits.ClickOn(DefaultAssigneeField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AssigneeOption2);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(SaveButtonEditRule);
		String AssigneeAfter = WebDriverWaits.GetText(AssignCaseToColumn);
		CompareStr = AssigneeBefore.equals(AssigneeAfter);
	}

	public static void SubmissionAssignment_DeleteAddedRule() throws InterruptedException {
		List<WebElement> RulesCountBefore = driver.findElements(AddedRule);
		int BeforeDeleting = RulesCountBefore.size();
		WebDriverWaits.ClickOn(DeleteRuleIcon);
		List<WebElement> RulesCountAfter = driver.findElements(AddedRule);
		int AfterDeleting = RulesCountAfter.size();
		CompareCount_DeletedRule = (AfterDeleting == BeforeDeleting - 1);
	}

	public static void SubmissionAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
		WebDriverWaits.ClickOn(AddRuleButton);
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ZipOption);
		WebDriverWaits.ClickOn(CriteriaFields);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(EqualsOption);
		Thread.sleep(2000);
		WebDriverWaits.SendKeys(ValueField, "77590");
		WebDriverWaits.ClickOn(DefaultAssigneeField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(AssigneeOption);
		WebDriverWaits.ClickOn(SelectCollaboratorField);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(CollaboratorsOption);
		WebDriverWaits.ClickOn(CreateRulebutton);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(InactiveToggle);
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(4000);
		WebDriverWaits.ClickOn(EditAssignmentIcon);
		Thread.sleep(2000);
		WebDriverWaits.ClickOn(ActiveToggle);
		WebDriverWaits.ClickOn(SaveButton);
	}

}
