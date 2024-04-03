package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.pageOfProdiaMobile;

public class stepDef {

    pageOfProdiaMobile pageOfProdia = new pageOfProdiaMobile();


    @Given("^: user on login dashboard$")
    public void userOnLoginDashboard() {
        pageOfProdia.userOnLoginDashboard();

    }

    @When("^: user click Login button$")
    public void userClickLoginButton() {
        pageOfProdia.userClickLoginButton();

    }

//    @When("^: user input username \"([^\"]*)\"$")
//    public void userInputUsername(String username) throws Throwable {
//
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }

    @And("^: user input username \\(\"([^\"]*)\"\\)$")
    public void userInputUsername(String username) throws Throwable {
        pageOfProdia.userInputUsername(username);

        throw new PendingException();
    }

    @And("^: user input password \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageOfProdia.userInputPassword(password);
        throw new PendingException();
    }

    @And("^: user click button$")
    public void userClickButton() {
        pageOfProdia.userClickButton();
    }

    @Then("^: user on homepage dashboard$")
    public void userOnHomepageDashboard(String screenName) {
        pageOfProdia.userOnHomepageDashboard(screenName);
    }

    @And("^: user can enter automation$")
    public void userCanEnterAutomation() {
        pageOfProdia.userCanEnterAutomation();
    }
}



