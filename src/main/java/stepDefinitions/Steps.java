package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

  @Given("the user is on login page")
  public void the_user_is_on_login_page() {
    System.out.println("The user is on");
  }
  @When("the user enters valid credentials")
  public void the_user_enters_valid_credentials() {
    System.out.println("Entered your name");
  }
  @When("hits submit")
  public void hits_submit() {
    System.out.println("Clicked on submmit");
  }
  @Then("the user should be logged in successfully")
  public void the_user_should_be_logged_in_successfully() {
    System.out.println("you are on");
  }

}
