package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LabTestPage;

public class LabTest_stepDef {

    LabTestPage pageOFLabTest;

    public LabTest_stepDef(){
        this.pageOFLabTest= new LabTestPage();
    }

    @Given("^user on login dashboard\\.$")
    public void userOnLoginDashboard() {
        pageOFLabTest.userOnLoginDashboard();
    }

    @When("^user tap Login button\\.$")
    public void userTapLoginButton() {
        pageOFLabTest.userTapLoginButton();
    }

    @And("^user input username# \"([^\"]*)\"\\.$")
    public void userInputUsername(String username) throws Throwable {
        pageOFLabTest.userInputUsername(username);
    }

    @And("^user input password# \"([^\"]*)\"\\.$")
    public void userInputPassword(String password) throws Throwable {
        pageOFLabTest.userInputPassword(password);
    }

    @And("^user tap button\\.$")
    public void userTapButton() {
        pageOFLabTest.userTapButton();
    }

    @And("^user on homepage dashboard\\.$")
    public void userOnHomepageDashboard() {
        pageOFLabTest.userOnHomepageDashboard();
    }

    @And("^user tap dashboard labtets\\.$")
    public void userTapDashboardLabtets() {
        pageOFLabTest.userTapDashboardLabtets();
    }

    @And("^user on Lab Test Dashboard\\.$")
    public void userOnLabTestDashboard() {
        pageOFLabTest.userOnLabTestDashboard();
    }

    @And("^user select coloumn search lab test\\.$")
    public void userSelectColoumnSearchLabTest() {
        pageOFLabTest.userSelectColoumnSearchLabTest();
    }

    @And("^user input product \"([^\"]*)\"\\.$")
    public void userInputProduct(String product) throws Throwable {
        pageOFLabTest.userInputProduct(product);
    }

    @And("^user search of product and get list of product\\.$")
    public void userSearchOfProductAndGetListOfProduct() {
        pageOFLabTest.userSearchOfProductAndGetListOfProduct();
    }

    @And("^user tap product of result\\.$")
    public void userTapProductOfResult() {
        pageOFLabTest.userTapProductOfResult();
    }

    @Then("^user on page Lab Test detail\\.$")
    public void userOnPageLabTestDetail() {
        pageOFLabTest.userOnPageLabTestDetail();
    }
}
