package runners;

import java.io.File;
import org.testng.annotations.*;
import com.cucumber.listener.Reporter;
import utils.AppiumDriverFactory;
import utils.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"@MyProfile"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = {"json:target/cucumber-reports/CucumberTestReport.json",
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})


public class TestNGRunner {
    private static TestNGCucumberRunner testNGCucumberRunner;

//    private TestNGCucumberRunner testNGCucumberRunner;

    AppiumDriverFactory appiumDriverFactory =
            AppiumDriverFactory.getInstanceOfAppiumDriverFactory(); AppiumDriver driver = appiumDriverFactory.getDriver();



    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDownClass() throws Exception {
        if (testNGCucumberRunner != null) {
            testNGCucumberRunner.finish();
        }
    }
    @AfterClass(alwaysRun = true)
    public void afterclass() throws Exception {
//        driver.quit();
        quitDriver();
        Reporter.loadXMLConfig(new File(ConfigFileReader.getConfigPropertyVal("reportConfigPath")));
//        testNGCucumberRunner.finish();

    }


    private static void quitDriver() {
        AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
        AppiumDriver driver = appiumDriverFactory.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }
}
