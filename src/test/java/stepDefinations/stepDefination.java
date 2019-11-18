package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {
	
    @Given("^browser to be launched$")
    public void browser_to_be_launched() throws Throwable {
    	System.out.println("broser 1");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("broser 2");
    }

    @Then("^validate the browser opening$")
    public void validate_the_browser_opening() throws Throwable {
    	System.out.println("browser 3user is on FB page");
    }

    @Given("^user is on facebook login page$")
    public void user_is_on_facebook_login_page() throws Throwable {
       System.out.println("user is on FB page");
    }
    
    @When("^user login with the user id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_the_user_id_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1 + '\n' +  strArg2);
    }
    
    @When("^user trying to signup  with below details$")
    public void user_trying_to_signup_with_below_details(DataTable data) throws Throwable {
       List<List<String>> obj= data.raw();
       System.out.println("FName " +obj.get(0).get(0));
       System.out.println("LName " +obj.get(0).get(1));
       System.out.println("Email " +obj.get(0).get(2));
       System.out.println("Phone " +obj.get(0).get(3));
    }
    
    @When("^user trying to signup  with (.+) and (.+)$")
    public void user_trying_to_signup_with_and(String username, String password) throws Throwable {
        System.out.println(username +" "+ password);
    }



    @Then("^home page is loaded$")
    public void home_page_is_loaded() throws Throwable {
        System.out.println("home page is laoding");
    }

    @And("^content dispalyed is \"([^\"]*)\"$")
    public void content_dispalyed_is(String arg1) throws Throwable {
      System.out.println(arg1);
    }
}