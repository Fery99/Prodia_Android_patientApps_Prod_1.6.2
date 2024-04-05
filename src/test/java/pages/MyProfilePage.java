package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class MyProfilePage {

    public static MyProfilePage createInstance() {
        MyProfilePage profilePage = new MyProfilePage();
        // Lakukan inisialisasi jika diperlukan
        return profilePage;
    }



    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static final By input_userTapIconProfile = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View/android.view.View[1]\n");
    public static final By input_userOnPageAccount = By.xpath("//android.widget.TextView[@text=\"Account\"]\n");
    public static final By input_userTapProfile= By.xpath("//android.widget.TextView[@text=\"ferysadewaa@gmail.com\"]");
    public static final By input_userOnPageProfile= By.xpath("//android.widget.TextView[@text=\"Profile\"]\n");
    public static final By input_userTapSymbolCamOnIconProfile= By.xpath("(//android.view.View[@content-desc=\"Profile Picture\"])[1]\n");
    public static final By input_userTapTakePhoto= By.xpath("//android.view.View[@content-desc=\"camera\"]\n");
    public static final By input_userTapButtonTakePhoto= By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.sec.android.app.camera:id/shutter_area\"]");
    public static final By input_userTapOk= By.xpath("//android.widget.Button[@content-desc=\"OK\"]");





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

        // Langsung menggunakan assertTrue tanpa logika if
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
    }

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
    }

    


}
