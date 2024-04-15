package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyProfilePage;


public class MyProfile_stepDef {
//ini percobaan untuk inisialisasi element mas masih belum bisa
    MyProfilePage pageOFMyProfile;

    // Konstruktor untuk injeksi dependensi
    public MyProfile_stepDef() {
        this.pageOFMyProfile = new MyProfilePage();
    }

    @Given("^user on login dashboard!$")
    public void userOnLoginDashboard() {
        pageOFMyProfile.userOnLoginDashboard();
    }

    @When("^user tap Login button!$")
    public void userTapLoginButton() {
        pageOFMyProfile.userClickLoginButton();

    }

    @And("^user input username! \"([^\"]*)\"$")
    public void userInputUsername(String username) throws Throwable {
        pageOFMyProfile.userInputUsername(username);
    }

    @And("^user input password! \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {
        pageOFMyProfile.userInputPassword(password);
    }

    @And("^user tap button!$")
    public void userTapButton() {
        pageOFMyProfile.userClickButton();
    }

    @And("^user on homepage dashboard!$")
    public void userOnHomepageDashboard() {
        pageOFMyProfile.userOnHomepageDashboard();
    }


//View Profile
    @And("^user tap icon profile$")
    public void userTapIconProfile() {
        pageOFMyProfile.userTapIconProfile();
    }

    @And("^user on page Account$")
    public void userOnPageAccount() {
        pageOFMyProfile.userOnPageAccount();
    }

    @And("^user tap profile$")
    public void userTapProfile() {
        pageOFMyProfile.userTapProfile();
    }

    @Then("^user on page Profile$")
    public void userOnPageProfile() {
        pageOFMyProfile.userOnPageProfile();
    }


//Edit Picture
    @And("^user tap symbol cam on icon profile$")
    public void userTapSymbolCamOnIconProfile() {
        pageOFMyProfile.userTapSymbolCamOnIconProfile();

    }

    @And("^user tap take photo$")
    public void userTapTakePhoto() {
        pageOFMyProfile.userTapTakePhoto();
    }

    @And("^user tap button take photo$")
    public void userTapButtonTakePhoto() {
        pageOFMyProfile.userTapButtonTakePhoto();
    }

    @And("^user tap ok$")
    public void userTapOk() {
        pageOFMyProfile.userTapOk();
    }

//Add Address
    @And("^user tap Address List$")
    public void userTapAddressList() {
        pageOFMyProfile.userTapAddressList();
    }

    @And("^user on page My Address$")
    public void userOnPageMyAddress() {
        pageOFMyProfile.userOnPageMyAddress();
    }

    @And("^user tap add Address$")
    public void userTapAddAddress() {
        pageOFMyProfile.userTapAddAddress();
    }

    @And("^user tap search address column$")
    public void userTapSearchAddressColumn() {
        pageOFMyProfile.userTapSearchAddressColumn();
    }

    @And("^user tap search address and input \"([^\"]*)\"$")
    public void userTapSearchAddressAndInput(String Address) throws Throwable {
        pageOFMyProfile.userTapSearchAddressAndInput(Address);
    }

    @And("^user tap address selected from list$")
    public void userTapAddressSelectedFromList() {
        pageOFMyProfile.userTapAddressSelectedFromList();
    }

    @And("^user tap save button on page address$")
    public void userTapSaveButtonOnPageAddress() {
        pageOFMyProfile.userTapSaveButtonOnPageAddress();
    }

    @And("^user on page add address$")
    public void userOnPageAddAddress() {
        pageOFMyProfile.userOnPageAddAddress();
    }

    @And("^user input address name \"([^\"]*)\"$")
    public void userInputAddressName(String AddressName) throws Throwable {
        pageOFMyProfile.userInputAddressName(AddressName);
    }

    @And("^user input additional Notes \"([^\"]*)\"$")
    public void userInputAdditionalNotes(String AdditionalNotes) throws Throwable {
        pageOFMyProfile.userInputAdditionalNotes(AdditionalNotes);
    }

    @And("^user click add Address Button$")
    public void userClickAddAddressButton() {
        pageOFMyProfile.userClickAddAddressButton();
    }

//Edit Address
    @And("^user tap other option$")
    public void userTapOtherOption() {
        pageOFMyProfile.userTapOtherOption();
    }


    @And("^user tap Edit Address$")
    public void userTapEditAddress() {
        pageOFMyProfile.userTapEditAddress();

    }

    @And("^user on page edit address$")
    public void userOnPageEditAddress() {
        pageOFMyProfile.userTapEditAddress();

    }

    @And("^user tap address selected from list, for edit$")
    public void userTapAddressSelectedFromListForEdit() {
        pageOFMyProfile.userTapAddressSelectedFromListForEdit();
    }

    @And("^user tap address detail$")
    public void userTapAddressDetail() {
        pageOFMyProfile.userTapAddressDetail();
    }

    @And("^user save buton on edit address$")
    public void userSaveButonOnEditAddress() {
        pageOFMyProfile.userSaveButonOnEditAddress();
    }


//Delete Address

    @And("^user tap Delete Address$")
    public void userTapDeleteAddress() {
        pageOFMyProfile.userTapDeleteAddress();
    }


    @And("^user tap yes,delete address option$")
    public void userTapYesDeleteAddressOption() {
        pageOFMyProfile.userTapYesDeleteAddressOption();
    }

    @Then("^user click back to Page Account$")
    public void userClickBackToPageAccount() {
        pageOFMyProfile.userClickBackToPageAccount();
    }

    @Then("^user tap back to Page Account from my Addres$")
    public void userTapBackToPageAccountFromMyAddres() {
        pageOFMyProfile.userTapBackToPageAccountFromMyAddres();
    }
}
