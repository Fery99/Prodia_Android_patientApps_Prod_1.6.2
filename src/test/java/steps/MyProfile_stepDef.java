package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.annotations.Test;
import pages.MyProfilePage;
import pages.SIgninpage;


public class MyProfile_stepDef {
//ini percobaan untuk inisialisasi element mas masih belum bisa
    private MyProfilePage pageOfProdia;

    // Konstruktor untuk injeksi dependensi
    public MyProfile_stepDef(MyProfilePage pageOfProdia) {
        this.pageOfProdia = pageOfProdia;
    }

    // Konstruktor kosong tanpa parameter
    public MyProfile_stepDef() {
        this.pageOfProdia = MyProfilePage.createInstance();
    }


    @And("^user tap icon profile$")
    public void userTapIconProfile() {
        pageOfProdia.userTapIconProfile();
    }

    @And("^user on page Account$")
    public void userOnPageAccount() {
        pageOfProdia.userOnPageAccount();
    }

    @And("^user tap profile$")
    public void userTapProfile() {
        pageOfProdia.userTapProfile();
    }

    @Then("^user on page Profile$")
    public void userOnPageProfile() {
        pageOfProdia.userOnPageProfile();
    }

    @And("^user tap symbol cam on icon profile$")
    public void userTapSymbolCamOnIconProfile() {
        pageOfProdia.userTapSymbolCamOnIconProfile();

    }

    @And("^user tap take photo$")
    public void userTapTakePhoto() {
        pageOfProdia.userTapTakePhoto();
    }

    @And("^user tap button take photo$")
    public void userTapButtonTakePhoto() {
        pageOfProdia.userTapButtonTakePhoto();
    }

    @And("^user tap ok$")
    public void userTapOk() {
        pageOfProdia.userTapOk();
    }
}
