package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class LabTestHomeServicePage {
    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]
    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button

    //Login for profile
    private static final By input_assertFirstPage = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[3]\n");
    private static final By input_userClickLoginButton = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]\n");
    private static final By Input_userInputUsername = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");
    private static final By input_userInputPassword = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]\n");
    private static final By input_userClickButton = By.xpath("//android.widget.ScrollView/android.view.View[3]\n");
    private static final By input_userOnHomepageDashboard = By.xpath("//android.widget.TextView[@text=\"Health Score Assessment\"]\n");
    private static final By input_tapbuttons = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View/android.view.View[1]\n");
//get information
    private static final By input_userTapDashboardLabtets = By.xpath("");
    private static final By input_userOnLabTestDashboard = By.xpath("");
    private static final By input_userSelectColoumnSearchLabTest = By.xpath("");
    private static final By input_userInputProduct = By.xpath("");
    private static final By input_userSearchOfProductAndGetListOfProduct = By.xpath("");
    private static final By input_userTapProductOfResult = By.xpath("");
    private static final By input_userOnPageLabTestDetail = By.xpath("");
//user can add to cart and remove item on cart
    private static final By input_userTapAddToCartLabTestHomeService = By.xpath("");
    private static final By input_userTapViewCartLabTestHomeService = By.xpath("");
    private static final By input_userOnPageCartLabTestHomeService = By.xpath("");
    private static final By input_userTapRemove = By.xpath("");
    private static final By input_userGetInformnCartItsEmpty = By.xpath("");
    private static final By input_userBackButton = By.xpath("");
//user complete payment and get VA
    private static final By input_userTapAddToCart = By.xpath("");
    private static final By input_userOnPageCart = By.xpath("");
    private static final By input_userChecklistIAgreeToProdia = By.xpath("");
    private static final By input_userClickBookButton = By.xpath("");
    private static final By input_userTapHomeService = By.xpath("");
    private static final By input_userTapEditAddressHomeService = By.xpath("");
    private static final By input_userTapAddressSelectedFromListt = By.xpath("");
    private static final By input_userTapContinueButtonn = By.xpath("");
    private static final By input_userTapSchedule = By.xpath("");
    private static final By input_userOnPageChooseDateBookLabTest = By.xpath("");
    private static final By input_userTapForChooseDate = By.xpath("");
    private static final By input_userTapDate = By.xpath("");
    private static final By input_userTapOkeForDate = By.xpath("");
    private static final By input_userTapChooseBranchTime = By.xpath("");
    private static final By input_userTapContinueButtonForBackToPageBookLabTest = By.xpath("");
    private static final By input_userChecklistILlRetrieve = By.xpath("");
    private static final By input_userTapChoosePayment = By.xpath("");
    private static final By input_userChecklistIAgreeTo = By.xpath("");
    private static final By input_userTapContinueTC = By.xpath("");
    private static final By userOnPagePaymentMethod = By.xpath("");
    private static final By input_userSelectVAMethod = By.xpath("");
    private static final By input_userTapPayNow = By.xpath("");
    private static final By userOnPageTransactionAndGetVA = By.xpath("");


    //Login for Profile
    public void userOnLoginDashboard() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_assertFirstPage), "");

    }

    public void userTapLoginButton() {
        MobileElement userClickLoginButton = (MobileElement) driver.findElement(input_userClickLoginButton);
        userClickLoginButton.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void userInputUsername(String username) throws Throwable {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        androidUtils.Sendkeys(Input_userInputUsername, username);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userInputPassword(String password) {
        MobileElement inputPassword = (MobileElement) driver.findElement(input_userInputPassword);
        inputPassword.sendKeys(password);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void userTapButton() {
        MobileElement userclickbutton = (MobileElement) driver.findElement(input_userClickButton);
        userclickbutton.click();
    }

    public void userOnHomepageDashboard() {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnHomepageDashboard), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //Get information
    public void userTapDashboardLabtets() {
        MobileElement userTapDashboardLabtets = (MobileElement) driver.findElement(input_userTapDashboardLabtets);
        userTapDashboardLabtets.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnLabTestDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnLabTestDashboard), "");
    }

    public void userSelectColoumnSearchLabTest() {
        MobileElement userTapDashboardLabtets = (MobileElement) driver.findElement(input_userSelectColoumnSearchLabTest);
        userTapDashboardLabtets.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public void userInputProduct (String product){
        MobileElement userInputProduct = (MobileElement) driver.findElement(input_userInputProduct);
        userInputProduct.sendKeys(product);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void userSearchOfProductAndGetListOfProduct () {
        MobileElement userSearchOfProductAndGetListOfProduct = (MobileElement) driver.findElement(input_userSearchOfProductAndGetListOfProduct);
        userSearchOfProductAndGetListOfProduct.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapProductOfResult () {
        MobileElement userTapProductOfResult = (MobileElement) driver.findElement(input_userTapProductOfResult);
        userTapProductOfResult.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPageLabTestDetail () {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageLabTestDetail), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//user can add to cart and remove item on cart
    public void userTapAddToCartLabTestHomeService(){
        MobileElement userTapAddToCartLabTestHomeService = (MobileElement) driver.findElement(input_userTapAddToCartLabTestHomeService);
        userTapAddToCartLabTestHomeService.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapViewCartLabTestHomeService(){
        MobileElement userTapViewCartLabTestHomeService = (MobileElement) driver.findElement(input_userTapViewCartLabTestHomeService);
        userTapViewCartLabTestHomeService.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPageCartLabTestHomeService(){
        MobileElement userOnPageCartLabTestHomeService = (MobileElement) driver.findElement(input_userOnPageCartLabTestHomeService);
        userOnPageCartLabTestHomeService.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapRemove(){
        MobileElement userTapRemove = (MobileElement) driver.findElement(input_userTapRemove);
        userTapRemove.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userGetInformnCartItsEmpty(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userGetInformnCartItsEmpty), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userBackButton(){
        MobileElement userBackButton = (MobileElement) driver.findElement(input_userBackButton);
        userBackButton.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//user complete payment and get VA
    public void userTapAddToCart(){
        MobileElement userTapAddToCart = (MobileElement) driver.findElement(input_userTapAddToCart);
        userTapAddToCart.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPageCart(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageCart), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//lets starrt
    public void userChecklistIAgreeToProdia(){
        MobileElement userChecklistIAgreeToProdia = (MobileElement) driver.findElement(input_userChecklistIAgreeToProdia);
        userChecklistIAgreeToProdia.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userClickBookButton(){
        MobileElement userClickBookButton = (MobileElement) driver.findElement(input_userClickBookButton);
        userClickBookButton.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapHomeService(){
        MobileElement userTapHomeService = (MobileElement) driver.findElement(input_userTapHomeService);
        userTapHomeService.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapEditAddressHomeService(){
        MobileElement userTapEditAddressHomeService = (MobileElement) driver.findElement(input_userTapEditAddressHomeService);
        userTapEditAddressHomeService.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapAddressSelectedFromListt(){
        MobileElement userTapAddressSelectedFromListt = (MobileElement) driver.findElement(input_userTapAddressSelectedFromListt);
        userTapAddressSelectedFromListt.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapContinueButtonn(){
        MobileElement userTapContinueButtonn = (MobileElement) driver.findElement(input_userTapContinueButtonn);
        userTapContinueButtonn.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapSchedule(){
        MobileElement userTapSchedule = (MobileElement) driver.findElement(input_userTapSchedule);
        userTapSchedule.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPageChooseDateBookLabTest(){
        MobileElement userOnPageChooseDateBookLabTest = (MobileElement) driver.findElement(input_userOnPageChooseDateBookLabTest);
        userOnPageChooseDateBookLabTest.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapForChooseDate(){
        MobileElement userTapForChooseDate = (MobileElement) driver.findElement(input_userTapForChooseDate);
        userTapForChooseDate.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapDate(){
        MobileElement userTapDate = (MobileElement) driver.findElement(input_userTapDate);
        userTapDate.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapOkeForDate(){
        MobileElement userTapOkeForDate = (MobileElement) driver.findElement(input_userTapOkeForDate);
        userTapOkeForDate.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapChooseBranchTime(){
        MobileElement userTapChooseBranchTime = (MobileElement) driver.findElement(input_userTapChooseBranchTime);
        userTapChooseBranchTime.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapContinueButtonForBackToPageBookLabTest(){
        MobileElement userTapContinueButtonForBackToPageBookLabTest = (MobileElement) driver.findElement(input_userTapContinueButtonForBackToPageBookLabTest);
        userTapContinueButtonForBackToPageBookLabTest.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userChecklistILlRetrieve(){
        MobileElement userChecklistILlRetrieve = (MobileElement) driver.findElement(input_userChecklistILlRetrieve);
        userChecklistILlRetrieve.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapChoosePayment(){
        MobileElement userTapChoosePayment = (MobileElement) driver.findElement(input_userTapChoosePayment);
        userTapChoosePayment.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userChecklistIAgreeTo(){
        MobileElement userChecklistIAgreeTo = (MobileElement) driver.findElement(input_userChecklistIAgreeTo);
        userChecklistIAgreeTo.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapContinueTC(){
        MobileElement userTapContinueTC = (MobileElement) driver.findElement(input_userTapContinueTC);
        userTapContinueTC.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPagePaymentMethod(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(userOnPagePaymentMethod), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userSelectVAMethod(){
        MobileElement userSelectVAMethod = (MobileElement) driver.findElement(input_userSelectVAMethod);
        userSelectVAMethod.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userTapPayNow(){
        MobileElement userTapPayNow = (MobileElement) driver.findElement(input_userTapPayNow);
        userTapPayNow.click();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userOnPageTransactionAndGetVA(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(userOnPageTransactionAndGetVA), "Health Score Assessment\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}







