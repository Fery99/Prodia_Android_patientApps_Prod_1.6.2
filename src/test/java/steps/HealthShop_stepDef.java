package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HealthShopPage;

public class HealthShop_stepDef {
    //ini percobaan untuk inisialisasi element mas masih belum bisa
    HealthShopPage pageHealthShopPage;

    // Konstruktor untuk injeksi dependensi
    public HealthShop_stepDef() {
        this.pageHealthShopPage = new HealthShopPage();
    }

    @Given("^user on login dashboard@$")
    public void userOnLoginDashboard() {
        pageHealthShopPage.userOnLoginDashboard();
    }

    @When("^user tap Login button@$")
    public void userTapLoginButton() {
        pageHealthShopPage.userClickLoginButton();
    }

    @And("^user input username@ \"([^\"]*)\"$")
    public void userInputUsername(String username) throws Throwable {
        pageHealthShopPage.userInputUsername(username);
    }

    @And("^user input password@ \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {
        pageHealthShopPage.userInputPassword(password);
    }

    @And("^user tap button@$")
    public void userTapButton() {
        pageHealthShopPage.userClickButton();
    }

    @And("^user on homepage dashboard@$")
    public void userOnHomepageDashboard() {
        pageHealthShopPage.userOnHomepageDashboard();
    }

    @And("^user click health shop dashboard$")
    public void userClickHealthShopDashboard() {
        pageHealthShopPage.userOnHomepageDashboard();

    }

    @And("^user on health shop dashboad$")
    public void userOnHealthShopDashboad() {
        pageHealthShopPage.userOnHealthShopDashboad();
    }

//user get product information
    @And("^user select item health shop$")
    public void userSelectItemHealthShop() {
        pageHealthShopPage.userSelectItemHealthShop();
    }

    @And("^user get information about product heath shop$")
    public void userGetInformationAboutProductHeathShop() {
        pageHealthShopPage.userGetInformationAboutProductHeathShop();
    }

    @And("^user add item health shop to cart$")
    public void userAddItemHealthShopToCart() {
        pageHealthShopPage.userAddItemHealthShopToCart();
    }


    @And("^user tap view cart$")
    public void userTapViewCart() {
        pageHealthShopPage.userTapIconCart();
    }


    @And("^user on Page cart$")
    public void userOnPageCart() {
        pageHealthShopPage.userOnPageCart();
    }

    @And("^user tap back to previous page to product detail$")
    public void userTapBackToPreviousPageToProductDetail() {
        pageHealthShopPage.userTapBackToPreviousPageToProductDetail();
    }

    @And("^user tap back to list Health shop$")
    public void userTapBackToListHealthShop() {
        pageHealthShopPage.userTapBackToListHealthShop();
    }




//user can search item on Health shop
    @When("^user tap search item heaath shop coloumn$")
    public void userTapSearchItemHeaathShopColoumn() {
        pageHealthShopPage.userTapSearchItemHeaathShopColoumn();
    }

    @And("^user searching product \"([^\"]*)\"$")
    public void userSearchingProduct(String product) throws Throwable {
        pageHealthShopPage.userSearchingProduct(product);
    }

    @And("^user get list item base of input search$")
    public void userGetListItemBaseOfInputSearch() {
        pageHealthShopPage.userGetListItemBaseOfInputSearch();
    }

    @And("^user tap item of search$")
    public void userTapItemOfSearch() {
        pageHealthShopPage.userTapItemOfSearch();
    }

    @And("^user add tap to add amount$")
    public void userAddTapToAddAmount() {
        pageHealthShopPage.userAddTapToAddAmount();
    }

    @And("^user tap icon cart$")
    public void userTapIconCart() {
        pageHealthShopPage.userTapIconCart();
    }



//user complete purchase Health Shop

    @When("^user cheklist TnC$")
    public void userCheklistTnC() {
        pageHealthShopPage.userCheklistTnC();
    }

    @And("^user tap place order button$")
    public void userTapPlaceOrderButton() {
        pageHealthShopPage.userTapPlaceOrderButton();
    }

    @And("^user on Page Health shop for delivery details screen$")
    public void userOnPageHealthShopForDeliveryDetailsScreen() {
        pageHealthShopPage.userOnPageHealthShopForDeliveryDetailsScreen();
    }

    @And("^user edit choose delivery address$")
    public void userEditChooseDeliveryAddress() {
        pageHealthShopPage.userEditChooseDeliveryAddress();

    }

    @And("^user tap address$")
    public void userTapAddress() {
        pageHealthShopPage.userTapAddress();

    }

    @And("^user tap continue button$")
    public void userTapContinueButton() {
        pageHealthShopPage.userTapContinueButton();
    }

    @And("^user select delivery service, Reguler$")
    public void userSelectDeliveryServiceReguler() {
        pageHealthShopPage.userSelectDeliveryServiceReguler();
    }

    @And("^user click pay now button$")
    public void userClickPayNowButton() {
        pageHealthShopPage.userClickPayNowButton();
    }

    @And("^user on payment method screen$")
    public void userOnPaymentMethodScreen() {
        pageHealthShopPage.userOnPaymentMethodScreen();
    }

    @And("^user select virtual account bank$")
    public void userSelectVirtualAccountBank() {
        pageHealthShopPage.userSelectVirtualAccountBank();
    }

    @And("^user on page complete Payemnt$")
    public void userOnPageCompletePayemnt() {
        pageHealthShopPage.userOnPageCompletePayemnt();
    }

    @And("^user tap check payment status$")
    public void userTapCheckPaymentStatus() {
        pageHealthShopPage.userTapCheckPaymentStatus();
    }

    @Then("^user on page order details and get status order$")
    public void userOnPageOrderDetailsAndGetStatusOrder() {
        pageHealthShopPage.userOnPageOrderDetailsAndGetStatusOrder();
    }

}
