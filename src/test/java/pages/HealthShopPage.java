package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class HealthShopPage {

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
//user get product information
    public static final By input_userSelectItemHealthShop= By.xpath("");
    public static final By input_userGetInformationAboutProductHeathShop=  By.xpath("");
    public static final By input_userAddItemHealthShopToCart= By.xpath("");
    public static final By input_userTapIconCart= By.xpath("");
    public static final By input_userOnPageCart= By.xpath("");
    public static final By input_userOnHealthShopDashboad= By.xpath("");
    public static final By input_userTapBackToPreviousPageToProductDetail= By.xpath("");
    public static final By input_userTapBackToListHealthShop= By.xpath("");
//user complete purchase Health Shop
    public static final By input_userTapSearchItemHeaathShopColoumn=  By.xpath("");
    public static final By input_userSearchingProduct= By.xpath("");
    public static final By input_userGetListItemBaseOfInputSearch=  By.xpath("");
    public static final By input_userTapItemOfSearch= By.xpath("");
    public static final By input_userAddTapToAddAmount= By.xpath("");
//user complete purchase Health Shop
    public static final By input_userCheklistTnC= By.xpath("");
    public static final By input_userTapPlaceOrderButton= By.xpath("");
    public static final By input_userOnPageHealthShopForDeliveryDetailsScreen= By.xpath("");
    public static final By input_userEditChooseDeliveryAddress= By.xpath("");
    public static final By input_userTapAddress= By.xpath("");
    public static final By input_userTapContinueButton= By.xpath("");
    public static final By input_userSelectDeliveryServiceReguler= By.xpath("");
    public static final By input_userClickPayNowButton= By.xpath("");
    public static final By input_userOnPaymentMethodScreen= By.xpath("");
    public static final By input_userSelectVirtualAccountBank= By.xpath("");
    public static final By input_userOnPageCompletePayemnt= By.xpath("");
    public static final By input_userTapCheckPaymentStatus= By.xpath("");
    public static final By input_userOnPageOrderDetailsAndGetStatusOrder= By.xpath("");









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

    public void userSelectItemHealthShop() {
        MobileElement useruserSelectItemHealthShop= (MobileElement) driver.findElement(input_userSelectItemHealthShop);
        useruserSelectItemHealthShop.click();
    }

    public void userGetInformationAboutProductHeathShop(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userGetInformationAboutProductHeathShop), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userAddItemHealthShopToCart(){
        MobileElement useruserAddItemHealthShopToCart= (MobileElement) driver.findElement(input_userAddItemHealthShopToCart);
        useruserAddItemHealthShopToCart.click();

    }

    public void userTapIconCart(){
        MobileElement useruserTapIconCart=  (MobileElement) driver.findElement(input_userTapIconCart);
        useruserTapIconCart.click();

    }

    public void userOnPageCart(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageCart), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userOnHealthShopDashboad(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnHealthShopDashboad), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userTapBackToPreviousPageToProductDetail(){
        MobileElement useruserTapBackToPreviousPageToProductDetail= (MobileElement) driver.findElement(input_userTapBackToPreviousPageToProductDetail);
        useruserTapBackToPreviousPageToProductDetail.click();

    }

    public void userTapBackToListHealthShop(){
        MobileElement useruserTapBackToListHealthShop= (MobileElement) driver.findElement(input_userTapBackToListHealthShop);
        useruserTapBackToListHealthShop.click();
    }


//user complete purchase Health Shop
    public void userTapSearchItemHeaathShopColoumn(){
        MobileElement useruserTapSearchItemHeaathShopColoumn= (MobileElement) driver.findElement(input_userTapSearchItemHeaathShopColoumn);
        useruserTapSearchItemHeaathShopColoumn.click();
    }


    public void userSearchingProduct(String product){
        MobileElement useruserSearchingProduct=  (MobileElement) driver.findElement(input_userSearchingProduct);
        useruserSearchingProduct.sendKeys(product);
    }

    public void userGetListItemBaseOfInputSearch(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userGetListItemBaseOfInputSearch), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userTapItemOfSearch(){
        MobileElement useruserTapItemOfSearch= (MobileElement) driver.findElement(input_userTapItemOfSearch);
        useruserTapItemOfSearch.click();

    }

    public void userAddTapToAddAmount(){
        MobileElement useruserAddTapToAddAmount= (MobileElement) driver.findElement(input_userAddTapToAddAmount);
        useruserAddTapToAddAmount.click();

    }

//user complete purchase Health Shop
    public void userCheklistTnC(){
        MobileElement useruserCheklistTnC= (MobileElement) driver.findElement(input_userCheklistTnC);
        useruserCheklistTnC.click();

    }

    public void userTapPlaceOrderButton(){
        MobileElement useruserTapPlaceOrderButton= (MobileElement) driver.findElement(input_userTapPlaceOrderButton);
        useruserTapPlaceOrderButton.click();

    }

    public void userOnPageHealthShopForDeliveryDetailsScreen(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageHealthShopForDeliveryDetailsScreen), "");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userEditChooseDeliveryAddress(){
        MobileElement useruserEditChooseDeliveryAddress= (MobileElement) driver.findElement(input_userEditChooseDeliveryAddress);
        useruserEditChooseDeliveryAddress.click();
    }

    public void userTapAddress(){
        MobileElement useruserTapAddress= (MobileElement) driver.findElement(input_userTapAddress);
        useruserTapAddress.click();
    }


    public void userTapContinueButton(){
        MobileElement userTapContinueButton= (MobileElement) driver.findElement(input_userTapContinueButton);
        userTapContinueButton.click();

    }

    public void userSelectDeliveryServiceReguler(){
        MobileElement userSelectDeliveryServiceReguler= (MobileElement) driver.findElement(input_userSelectDeliveryServiceReguler);
        userSelectDeliveryServiceReguler.click();
    }

    public void userClickPayNowButton(){
        MobileElement userClickPayNowButton= (MobileElement) driver.findElement(input_userClickPayNowButton);
        userClickPayNowButton.click();

    }

    public void userOnPaymentMethodScreen() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPaymentMethodScreen), "");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userSelectVirtualAccountBank(){
        MobileElement userSelectVirtualAccountBank= (MobileElement) driver.findElement(input_userSelectVirtualAccountBank);
        userSelectVirtualAccountBank.click();
    }

    public void userOnPageCompletePayemnt(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageCompletePayemnt), "");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapCheckPaymentStatus(){
        MobileElement userTapCheckPaymentStatus= (MobileElement) driver.findElement(input_userTapCheckPaymentStatus);
        userTapCheckPaymentStatus.click();
    }

    public void userOnPageOrderDetailsAndGetStatusOrder(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageOrderDetailsAndGetStatusOrder), "");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


