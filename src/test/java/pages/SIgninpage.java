package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class SIgninpage {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]
    //androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button
    public static final By input_assertFirstPage= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[3]\n");
    public static final By input_userClickLoginButton= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]");
    private static final By Input_userInputUsername= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");
    private  static final By input_userInputPassword= By.xpath("//android.widget.ScrollView/android.widget.EditText[2]\n");
    private static  final By input_userClickButton= By.xpath("//android.widget.ScrollView/android.view.View[3]\n");
    private  static final By input_userOnHomepageDashboard=By.xpath("//android.widget.TextView[@text=\"Health Score Assessment\"]\n");
    private static final By input_tapbuttons = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.prodiadigital.patient:id/compose_view\"]/android.view.View/android.view.View/android.view.View[1]\n");

    public void userOnLoginDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_userClickLoginButton), "");

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

    public void userTapOn(){
        MobileElement userclickbutton= (MobileElement) driver.findElement(input_tapbuttons);
        userclickbutton.click();
    }


}
