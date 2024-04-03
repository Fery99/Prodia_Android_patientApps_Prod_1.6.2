package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login_stepDef {

    LoginPage pageOfProdia = new LoginPage();

    @Given("^user on login dashboard$")
    public void userOnLoginDashboard() {
        pageOfProdia.userOnLoginDashboard();
    }

    @When("^user click Login button$")
    public void userClickLoginButton() {
        pageOfProdia.userClickLoginButton();
    }

    @And("^user input username \"([^\"]*)\"$")
    public void userInputUsername(String username) throws Throwable {
        pageOfProdia.userInputUsername(username);

    }

    @And("^user input password \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {
        pageOfProdia.userInputPassword(password);

    }

    @And("^user click button$")
    public void userClickButton() {
        pageOfProdia.userClickButton();


    }

    @And("^user on homepage dashboard$")
    public void userOnHomepageDashboard() {
        pageOfProdia.userOnHomepageDashboard();

    }
}



