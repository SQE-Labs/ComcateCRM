package BrowsersBase;

public interface DataInterface{

	public static String browserMain = "CHROME";
   // public static String RunEnvironment = "QA";	
    public static String RunEnvironment = "Stage";	
	//public static String RunEnvironment = "CI";	
    public static String AgencyName = "AlphaSquad";

	public void RunEnvironmentSetup();
	
	int AgencyID = BrowsersInvoked.AgencyID;
	String Instance = BrowsersInvoked.Instance;
	String AgencyUsername = BrowsersInvoked.AgencyUsername;
	String AgencyPassword = BrowsersInvoked.AgencyPassword;
	String AdminURL = BrowsersInvoked.AdminURL;
	String AdminUsername = BrowsersInvoked.AdminUsername;
	String AdminPassword = BrowsersInvoked.AdminPassword;

	public static String AgencyURL = Instance + (AgencyID) + "/login";

	public static String URLCreateCase = Instance + (AgencyID) + "/products/cases/create";
	public static String URLDashboard = Instance + (AgencyID) + "/dashboard";
	public static String URLCasesManagement = Instance + (AgencyID) + "/setup/products/case-management";
	public static String URLAssignmentRules = Instance + (AgencyID) + "/setup/agency/assignment-rules";
	public static String URLUserManagement = Instance + (AgencyID) + "/setup/agency/users-management";
	public static String URLNotices = Instance + (AgencyID) + "/setup/agency/products/notices";
	public static String URLCreateCustomerSubmission = Instance + (AgencyID) + "/products/customer-submission/create";
	public static String URLCategories = Instance + (AgencyID) + "/setup/products/categories";
	public static String URLSubmissionSettings = Instance + (AgencyID) + "/setup/products/submission-settings";
	public static String URLViolations = Instance + (AgencyID) + "/setup/products/violations";
	public static String URLReports = Instance + (AgencyID) + "/reports";

	public static String StreetAddress = "New Street";
	public static String City = "New Texas";
	public static String Zip = "77440";
	
	//GIS Lite
//	public static String StreetAddress = "120 6th Street";
//	public static String City = "Texas City";
//	public static String Zip = "77590";

}
