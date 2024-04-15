package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class MyProfilePage {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]
    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button

//Login for profile
    private static final By input_assertFirstPage= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[3]\n");
    public static final By input_userClickLoginButton= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]\n");
    public static final By Input_userInputUsername= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");
    public static final By input_userInputPassword= By.xpath("//android.widget.ScrollView/android.widget.EditText[2]\n");
    public static  final By input_userClickButton= By.xpath("//android.widget.ScrollView/android.view.View[3]\n");
    public static final By input_userOnHomepageDashboard=By.xpath("//android.widget.TextView[@text=\"Health Score Assessment\"]\n");
    public static final By input_tapbuttons = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View/android.view.View[1]\n");
//View Profile
    public static final By input_userTapIconProfile = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View/android.view.View[1]\n");
    public static final By input_userOnPageAccount = By.xpath("//android.widget.TextView[@text=\"Account\"]\n");
    public static final By input_userTapProfile= By.xpath("//android.widget.TextView[@text=\"ferysadewaa@gmail.com\"]");
    public static final By input_userOnPageProfile= By.xpath("//android.widget.TextView[@text=\"Profile\"]\n");
//Change picture Profile
    public static final By input_userTapSymbolCamOnIconProfile= By.xpath("(//android.view.View[@content-desc=\"Profile Picture\"])[1]\n");
    public static final By input_userTapTakePhoto= By.xpath("//android.view.View[@content-desc=\"camera\"]\n");
    public static final By input_userTapButtonTakePhoto= By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.sec.android.app.camera:id/shutter_area\"]");
    public static final By input_userTapOk= By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
//Add Address
    public static final By input_userTapAddressList=  By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View\n");
    public static final By input_userOnPageMyAddress= By.xpath("//android.widget.TextView[@text=\"+ ADD ADDRESS\"]");
    public static final By input_userTapSearchAddressColumn= By.xpath("//android.widget.EditText\n");
    public static final By input_userTapSearchAddressAndInput= By.xpath("//android.widget.EditText\n");
    public static final By input_userTapAddressSelectedFromList=  By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View[2]/android.view.View[2]");
    public static final By input_userTapSaveButtonOnPageAddress= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]\n");
    public static final By input_Input_userOnPageAddAddress= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");
    public static final By input_userInputAddressName= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");
    public static final By input_userInputAdditionalNotes= By.xpath("//android.widget.ScrollView/android.widget.EditText[3]\n");
    public static final By input_userClickAddAddressButton= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View\n");
//Edit Address
    public static final By input_userTapOtherOption= By.xpath("(//android.widget.ImageView[@content-desc=\"more\"])[2]\n");
    public static final By input_userTapEditAddress= By.xpath("//android.widget.TextView[@text=\"Edit Address\"]\n");
    public static final By input_userTapAddressDetail= By.xpath("//android.widget.EditText[@text=\"Gang Mawar No.2, Brubahan, Grendeng, Purwokerto Utara, Banyumas Regency, Central Java, Indonesia\"]\n");
    public static final By input_userTapAddressSelectedFromListForEdit= By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View[2]/android.view.View[1]");
    public static final By input_userSaveButonOnEditAddress= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View\n");
//Delete Address
    public static final By input_userTapDeleteAddress= By.xpath("//android.widget.TextView[@text=\"Delete Address\"]\n");
    public static final By input_userTapYesDeleteAddressOption= By.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[1]\n");
    public static final By input_userClickBackToPageAccount= By.xpath("//android.widget.Button");
    public static final By input_userTapBackToPageAccountFromMyAddres= By.xpath("//android.widget.Button\n");

    //Login for Profile
    public void userOnLoginDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_assertFirstPage), "");

    }

    public void userClickLoginButton(){
        MobileElement userClickLoginButton= (MobileElement) driver.findElement(input_userClickLoginButton);
        userClickLoginButton.click();

        try{
            Thread.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userInputUsername(String username) throws Throwable {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        androidUtils.Sendkeys(Input_userInputUsername, username);



        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userInputPassword(String password){
        MobileElement inputPassword = (MobileElement) driver.findElement(input_userInputPassword);
        inputPassword.sendKeys(password);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userClickButton(){
        MobileElement userclickbutton= (MobileElement) driver.findElement(input_userClickButton);
        userclickbutton.click();
    }

    public void userOnHomepageDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnHomepageDashboard), "Health Score Assessment\n");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

//View Profile
    public void userTapIconProfile(){
        MobileElement useruserTapIconProfile = (MobileElement) driver.findElement(input_userTapIconProfile);
        useruserTapIconProfile.click();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

    public void userOnPageAccount(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        Assert.assertTrue(androidUtils.Assert(input_userOnPageAccount), "Account");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userTapProfile(){
        MobileElement useruserTapProfile = (MobileElement) driver.findElement(input_userTapProfile);
        useruserTapProfile.click();
    }

    public void userOnPageProfile(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_userOnPageProfile), "Profile\n");


        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


//Change Picture Profile
    public void userTapSymbolCamOnIconProfile(){
        MobileElement useruserTapSymbolCamOnIconProfile = (MobileElement) driver.findElement(input_userTapSymbolCamOnIconProfile);
        useruserTapSymbolCamOnIconProfile.click();
    }


    public void userTapTakePhoto(){
        MobileElement useruserTapTakePhoto = (MobileElement) driver.findElement(input_userTapTakePhoto);
        useruserTapTakePhoto.click();
    }

    public void userTapButtonTakePhoto(){
        MobileElement useruserTapButtonTakePhoto = (MobileElement) driver.findElement(input_userTapButtonTakePhoto);
        useruserTapButtonTakePhoto.click();
    }

    public void userTapOk(){
        MobileElement useruserTapOk = (MobileElement) driver.findElement(input_userTapOk);
        useruserTapOk.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    //Add Address
    public void userTapAddressList(){
        MobileElement useruserTapAddressList = (MobileElement) driver.findElement(input_userTapAddressList);
        useruserTapAddressList.click();
    }


    public void userOnPageMyAddress(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        Assert.assertTrue(androidUtils.Assert(input_userOnPageMyAddress), "+ ADD ADDRESS\n");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userTapAddAddress(){
        MobileElement useruserTapAddressList = (MobileElement) driver.findElement(input_userOnPageMyAddress);
        useruserTapAddressList.click();
    }

    public void userTapSearchAddressColumn(){
        MobileElement useruserTapSearchAddressColumn = (MobileElement)  driver.findElement(input_userTapSearchAddressColumn);
        useruserTapSearchAddressColumn.click();
    }
    public void userTapSearchAddressAndInput(String Address){
        MobileElement useruserTapSearchAddressAndInput= (MobileElement) driver.findElement(input_userTapSearchAddressAndInput);
        useruserTapSearchAddressAndInput.sendKeys(Address);
    }

    public void userTapAddressSelectedFromList(){
        MobileElement useruserTapAddressSelectedFromList= (MobileElement) driver.findElement(input_userTapAddressSelectedFromList);
        useruserTapAddressSelectedFromList.click();
    }

    public void userTapSaveButtonOnPageAddress(){
        MobileElement useruserTapSaveButtonOnPageAddress= (MobileElement) driver.findElement(input_userTapSaveButtonOnPageAddress);
        useruserTapSaveButtonOnPageAddress.click();
    }

    public void userOnPageAddAddress(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        Assert.assertTrue(androidUtils.Assert(input_Input_userOnPageAddAddress), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userInputAddressName(String AddressName){
        MobileElement useruserInputAddressName= (MobileElement) driver.findElement(input_userInputAddressName);
        useruserInputAddressName.sendKeys(AddressName);
    }

    public void userInputAdditionalNotes(String AdditionalNotes){
        MobileElement useruserInputAdditionalNotes= (MobileElement) driver.findElement(input_userInputAdditionalNotes);
        useruserInputAdditionalNotes.sendKeys(AdditionalNotes);
    }

    public void userClickAddAddressButton(){
        MobileElement useruserClickAddAddressButton=  (MobileElement)  driver.findElement(input_userClickAddAddressButton);
        useruserClickAddAddressButton.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

//Edit Address
    public void userTapOtherOption(){
        MobileElement useruserTapOtherOption= (MobileElement) driver.findElement(input_userTapOtherOption);
        useruserTapOtherOption.click();
    }

    public void userTapEditAddress(){
        MobileElement useruserTapEditAddress= (MobileElement) driver.findElement(input_userTapEditAddress);
        useruserTapEditAddress.click();
    }

    public void userTapAddressDetail(){
        MobileElement useruserTapAddressDetail= (MobileElement) driver.findElement(input_userTapAddressDetail);
        useruserTapAddressDetail.click();
    }
    public void userTapAddressSelectedFromListForEdit(){
        MobileElement useruserTapAddressSelectedFromListForEdit= (MobileElement) driver.findElement(input_userTapAddressSelectedFromListForEdit);
        useruserTapAddressSelectedFromListForEdit.click();
    }

    public void userSaveButonOnEditAddress(){
        MobileElement useruserSaveButonOnEditAddress= (MobileElement) driver.findElement(input_userSaveButonOnEditAddress);
        useruserSaveButonOnEditAddress.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

//Delete Address
    public void userTapDeleteAddress(){
        MobileElement useruserTapDeleteAddress= (MobileElement) driver.findElement(input_userTapDeleteAddress);
        useruserTapDeleteAddress.click();
    }

    public void userTapYesDeleteAddressOption(){
        MobileElement useruserTapYesDeleteAddressOption= (MobileElement) driver.findElement(input_userTapYesDeleteAddressOption);
        useruserTapYesDeleteAddressOption.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userClickBackToPageAccount(){
        MobileElement useruserClickBackToPageAccount = (MobileElement) driver.findElement(input_userClickBackToPageAccount);
        useruserClickBackToPageAccount.click();
    }

    public void userTapBackToPageAccountFromMyAddres(){
        MobileElement useruserTapBackToPageAccountFromMyAddres=  (MobileElement) driver.findElement(input_userTapBackToPageAccountFromMyAddres);
        useruserTapBackToPageAccountFromMyAddres.click();
    }










}
