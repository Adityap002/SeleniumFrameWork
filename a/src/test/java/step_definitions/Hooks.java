/*package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {

	*//**
	 * Capture a selenium screenshot when a test fails and add it to the
	 * Cucumber generated report if the scenario has accessed selenium in its
	 * lifetime
	 * 
	 * @throws InterruptedException
	 *//*
	@After
	public void embedScreenshot(Scenario scenario, WebDriver driver) {

		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				// byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				byte[] screenshot = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots
						.getMessage());
			}

		}
	}

}*/