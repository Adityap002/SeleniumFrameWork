package step_definitions;

import helpers.DataHelper;
import helpers.DriverInitialize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.SignInAction;
import modules.SignoutAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShoppingCart{
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
    
    
    public ShoppingCart()
    {
    	datamap = new ArrayList<HashMap<String,String>>();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	System.out.println("Current data" +sampleData);
    	datamap.add(sampleData);
    }
    
    @When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	DriverInitialize.driver.get("http://automationpractice.com");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(DriverInitialize.driver, AutomationHomePage.class);
		PageFactory.initElements(DriverInitialize.driver, LoginPage.class);

		SignInAction.Execute(DriverInitialize.driver,datamap.get(0));
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	SignoutAction.Execute(DriverInitialize.driver);
    }
    
}