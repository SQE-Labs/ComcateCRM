package TestCasesCRM;

import org.testng.annotations.*;
import POMCRM.LoginAgencyUtils;

public class Login extends LoginAgencyUtils {

//	@BeforeTest
//	public static void Refresh() throws InterruptedException {
//		driver.navigate().refresh();
//		Thread.sleep(4000);
//
//	}

	@Test(priority = 0)
	public static void LoginAgency() throws InterruptedException {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
		LoginAgencyUtils.LoginAgency();
	}
	
	@Test(priority = 0)
	public static void LoginAgencyStage() throws InterruptedException {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
		LoginAgencyUtils.LoginAgencyStage();
	}
	
	@Test(priority = 0)
	public static void LoginAgencyCI() throws InterruptedException {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
		LoginAgencyUtils.LoginAgencyCI();
	}

	@Test(priority = 0)
	public static void LoginAdmin() throws InterruptedException {
		extentTest = extent.startTest(" Pre-requisite(Login) ");
		LoginAgencyUtils.LoginAdmin();
	}
}
