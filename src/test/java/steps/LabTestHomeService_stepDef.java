package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HealthShopPage;
import pages.LabTestHomeServicePage;

public class LabTestHomeService_stepDef {

//ini percobaan untuk inisialisasi element mas masih belum bisa
    LabTestHomeServicePage pageLabTestHomeService;

// Konstruktor untuk injeksi dependensi
    public LabTestHomeService_stepDef() {
        this.pageLabTestHomeService = new LabTestHomeServicePage();
    }

    @Given("^user on login dashboard#$")
    public void userOnLoginDashboard() {
        pageLabTestHomeService.userOnLoginDashboard();
    }

    @When("^user tap Login button#$")
    public void userTapLoginButton() {
        pageLabTestHomeService.userTapLoginButton();
    }

    @And("^user input username# \"([^\"]*)\"$")
    public void userInputUsername(String username) throws Throwable {
        pageLabTestHomeService.userInputUsername(username);
    }

    @And("^user input password# \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {
        pageLabTestHomeService.userInputPassword(password);
    }


    @And("^user on homepage dashboard#$")
    public void userOnHomepageDashboard() {
        pageLabTestHomeService.userOnHomepageDashboard();
    }


    @And("^user tap dashboard labtets$")
    public void userTapDashboardLabtets() {
        pageLabTestHomeService.userTapDashboardLabtets();
    }


//user get information
    @And("^user tap button#$")
    public void userTapButton() {
        pageLabTestHomeService.userTapButton();
    }

    @And("^user on Lab Test Dashboard$")
    public void userOnLabTestDashboard() {
        pageLabTestHomeService.userOnLabTestDashboard();
    }

    @And("^user select coloumn search lab test$")
    public void userSelectColoumnSearchLabTest() {
        pageLabTestHomeService.userSelectColoumnSearchLabTest();
    }

    @And("^user input product \"([^\"]*)\"$")
    public void userInputProduct(String product) throws Throwable {
        pageLabTestHomeService.userInputProduct(product);
    }

    @And("^user search of product and get list of product$")
    public void userSearchOfProductAndGetListOfProduct() {
        pageLabTestHomeService.userSearchOfProductAndGetListOfProduct();
    }

    @And("^user tap product of result$")
    public void userTapProductOfResult() {
        pageLabTestHomeService.userTapProductOfResult();
    }

    @Then("^user on page Lab Test detail$")
    public void userOnPageLabTestDetail() {
        pageLabTestHomeService.userOnPageLabTestDetail();
    }


//user can add to cart and remove item on cart
    @When("^user tap add to cart Lab test Home service$")
    public void userTapAddToCartLabTestHomeService() {
        pageLabTestHomeService.userTapAddToCartLabTestHomeService();
    }

    @And("^user tap view cart Lab test Home service$")
    public void userTapViewCartLabTestHomeService() {
        pageLabTestHomeService.userTapViewCartLabTestHomeService();
    }

    @And("^user on page cart Lab test Home service$")
    public void userOnPageCartLabTestHomeService() {
        pageLabTestHomeService.userOnPageCartLabTestHomeService();
    }

    @And("^user tap remove$")
    public void userTapRemove() {
        pageLabTestHomeService.userTapRemove();
    }

    @And("^user get informn cart its empty$")
    public void userGetInformnCartItsEmpty() {
        pageLabTestHomeService.userGetInformnCartItsEmpty();
    }

    @And("^user back button$")
    public void userBackButton() {
        pageLabTestHomeService.userBackButton();
    }



//user complete payment and get VA
    @When("^user tap add to cart$")
    public void userTapAddToCart() {
        pageLabTestHomeService.userTapAddToCart();
    }

    @And("^user on page cart$")
    public void userOnPageCart() {
        pageLabTestHomeService.userOnPageCart();
    }

    @And("^user checklist I agree to Prodia\\.\\.$")
    public void userChecklistIAgreeToProdia() {
        pageLabTestHomeService.userChecklistIAgreeToProdia();
    }

    @And("^user click book button$")
    public void userClickBookButton() {
        pageLabTestHomeService.userClickBookButton();
    }

    @And("^user tap Home Service$")
    public void userTapHomeService() {
        pageLabTestHomeService.userTapHomeService();
    }

    @And("^user tap edit address home service$")
    public void userTapEditAddressHomeService() {
        pageLabTestHomeService.userTapEditAddressHomeService();
    }

    @And("^user tap address selected from listt$")
    public void userTapAddressSelectedFromListt() {
        pageLabTestHomeService.userTapAddressSelectedFromListt();
    }

    @And("^user tap continue buttonn$")
    public void userTapContinueButtonn() {
        pageLabTestHomeService.userTapContinueButtonn();
    }

    @And("^user tap schedule$")
    public void userTapSchedule() {
        pageLabTestHomeService.userTapSchedule();
    }

    @And("^user on page choose date book lab test$")
    public void userOnPageChooseDateBookLabTest() {
        pageLabTestHomeService.userOnPageChooseDateBookLabTest();
    }

    @And("^user tap for choose date$")
    public void userTapForChooseDate() {
        pageLabTestHomeService.userTapForChooseDate();
    }

    @And("^user tap date$")
    public void userTapDate() {
        pageLabTestHomeService.userTapDate();
    }

    @And("^user tap oke for date$")
    public void userTapOkeForDate() {
        pageLabTestHomeService.userTapOkeForDate();
    }

    @And("^user tap choose Branch & Time$")
    public void userTapChooseBranchTime() {
        pageLabTestHomeService.userTapChooseBranchTime();
    }

    @And("^user tap continue button for back to page book lab test$")
    public void userTapContinueButtonForBackToPageBookLabTest() {
        pageLabTestHomeService.userTapContinueButtonForBackToPageBookLabTest();
    }

    @And("^user checklist i'll retrieve\\.\\.$")
    public void userChecklistILlRetrieve() {
        pageLabTestHomeService. userChecklistILlRetrieve();
    }

    @And("^user tap Choose Payment$")
    public void userTapChoosePayment() {
        pageLabTestHomeService.userTapChoosePayment();
    }

    @And("^user checklist i agree to\\.\\.\\.$")
    public void userChecklistIAgreeTo() {
        pageLabTestHomeService.userChecklistIAgreeTo();
    }

    @And("^user tap continue T&C$")
    public void userTapContinueTC() {
        pageLabTestHomeService.userTapContinueTC();
    }

    @And("^user on Page Payment method$")
    public void userOnPagePaymentMethod() {
        pageLabTestHomeService.userOnPagePaymentMethod();
    }

    @And("^user select VA method$")
    public void userSelectVAMethod() {
        pageLabTestHomeService.userSelectVAMethod();
    }

    @And("^user tap Pay Now$")
    public void userTapPayNow() {
        pageLabTestHomeService.userTapPayNow();
    }

    @Then("^user on Page Transaction and get VA$")
    public void userOnPageTransactionAndGetVA() {
        pageLabTestHomeService.userOnPageTransactionAndGetVA();
    }



}
