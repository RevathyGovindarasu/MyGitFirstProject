package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageObjects.GoogleHomePage;



public class stepdefinition {

	
	GoogleHomePage ghp = new GoogleHomePage();
	
	
	@Given("^user launches the page$")
	public void user_launches_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ghp.HomePage();
	    
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	
}
