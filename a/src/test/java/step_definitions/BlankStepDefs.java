package step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import helpers.DriverInitialize;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BlankStepDefs{
    
    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website(){
        // Write code here that turns the phrase above into concrete actions
    	DriverInitialize.driver.get("http://www.seleniumframework.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL(){
        // Write code here that turns the phrase above into concrete actions
      assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.",DriverInitialize.driver.getTitle());
      assertEquals("http://www.seleniumframework.com/",DriverInitialize.driver.getCurrentUrl());
    }
    
}