package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
    @Given("^I navigate to the login$")
    public void iNavidateToTheLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given");
//        throw new PendingException();
    }

    @And("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("And 2");
//        throw new PendingException();
    }

    @Then("^I should see userform page$")
    public void iShouldSeeUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("And Then");
//        throw new PendingException();
    }


}
