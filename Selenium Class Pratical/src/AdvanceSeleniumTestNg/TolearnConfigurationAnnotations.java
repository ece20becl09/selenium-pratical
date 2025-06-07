package AdvanceSeleniumTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TolearnConfigurationAnnotations {
	@BeforeSuite 
	public void beforeSuite() {
		Reporter.log("Before Suite got executed", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test got execute", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class got executed", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method got executed", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method got executed", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("After class got executed", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("After test got executed", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite got Executed", true);
	}

	@Test
	public void testExecuted() {
		Reporter.log("Test got executed", true);
	}

}
