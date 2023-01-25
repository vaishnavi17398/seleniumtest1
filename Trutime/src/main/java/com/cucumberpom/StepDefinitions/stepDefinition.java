package com.cucumberpom.StepDefinitions;


import com.cucumberpom.Base.baseClass;
import com.cucumberpom.Page.homePageClass;
import com.cucumberpom.Page.searchResultPageClass;
import com.cucumberpom.Page.truTimeAppClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends baseClass {
	
	
	 @Before
	 public void setup() {
		 initBrowser();
	 }
	 
	 @Given("^User invokes Application cognizant homepage$")
	    public void User_on_Application_cognizant_homepage(){
	        invokeUrl();
	    }

	 
	   
	@Then("^User enters the email id$")
	 public void User_enters_the_email_id() {
		email();
	 }
	 
	 @And("^User enters the password$")
	 public void User_enters_the_password() {
		 password(); 
	 }
	 
	 @And("^User enters the otp$")
	 public void User_enters_the_otp() {   
		 otp();
		 
	 }
	 
	
	@Then("^User is on application homepage and User captures their details present on the top right corner$")
	public void User_captures_their_details_present_on_the_top_right_corner() {
		homePageClass homePageClass = new homePageClass();
		//pageclass.methodname()
		homePageClass.captureDetails();
	}
	 
	@When("^User click on Start searching input tab$") 
	public void User_click_on_Start_searching_input_tab() {
		homePageClass homePageClass = new homePageClass();
		homePageClass.clickSearchTab();
	}
	
	@And("^User enters \"(.*)\"$")
	public void User_enters_Trutime(String string){
		homePageClass homePageClass = new homePageClass();
		homePageClass.enterTrutime(string);
		
	}
	
	@Then("^click on search icon and page redirects to search result page$")
	public void click_on_search_icon() {
		homePageClass homePageClass = new homePageClass();
		homePageClass.clickSearchIcon();
	}
	
	@When("^user selects Trutime application$")
	public void user_selects_Trutime_application() {
		searchResultPageClass searchResultPageClass = new searchResultPageClass();
		searchResultPageClass.clickTrutime();
	}
	
	@Then("^user navigate to a new window of Trutime application$")
	public void user_navigate_to_a_new_window() {
		
	}
	
	@Then("^expected days and actual days are compared successfully$")
	public void expected_days_are_printed() {
		truTimeAppClass truTimeAppClass = new truTimeAppClass();
		truTimeAppClass.comparison();
	}
	
	
	 @After
	  public void teardown(){
	    closeDriver();
	  }

	
	
}
