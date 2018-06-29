package step_definitions;

import helpers.DriverInitialize;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {
		"pretty:STDOUT",
		"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\aditya.p\\Desktop\\Automate2\\a\\Reports\\cucumber-extent\\Report.html",
		"json:C:\\Users\\aditya.p\\Desktop\\Automate2\\a\\Reports\\cucumber-json\\cucumber.html",
		"html:target/cucumber-html-report" }, monochrome = true)
public class RunCukesTest {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		DriverInitialize.driverInitlize();
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		Reporter.loadXMLConfig(new File(
				"resources\\resources\\features\\extent-config.xml"));

		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setTestRunnerOutput("First Test");
		DriverInitialize.driver.quit();
		testNGCucumberRunner.finish();
	}

}