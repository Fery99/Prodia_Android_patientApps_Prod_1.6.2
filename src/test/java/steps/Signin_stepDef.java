package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SIgninpage;

public class Signin_stepDef {
//ini elementnya ngga ada masalah kareana feature pertama
    SIgninpage pageOfProdia;

    // Konstruktor kosong tanpa parameter
    public Signin_stepDef() {
        this.pageOfProdia = new SIgninpage();
    }

    @Given("^user on login dashboard$")
    public void userOnLoginDashboard() {
        pageOfProdia.userOnLoginDashboard();
    }


    @When("^user tap Login button$")
    public void userTapLoginButton() {
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


    @And("^user tap button$")
    public void userTapButton() {
        pageOfProdia.userClickButton();
    }


    @And("^user on homepage dashboard$")
    public void userOnHomepageDashboard() {
        pageOfProdia.userOnHomepageDashboard();

    }

    @And("^user tap on$")
    public void userTapOn() {
        pageOfProdia.userTapOn();
    }



}



