package base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static utils.Browser.selectBrowser;
import static utils.PropertiesReader.loadProperty;

/**
 * The type Base class.
 */
public class BaseClass {

    private static String baseUrl;


    /**
     * Before test.
     *
     * @param env     the env
     * @param browser the browser
     */
    @Parameters({"env", "browser"})
    @BeforeMethod(alwaysRun = true)
    public void beforeTest(@Optional("uat") String env, @Optional("chrome") String browser) {
        selectBrowser(browser);
        clearBrowserCache();
        switch (env) {
            case "uat":
                baseUrl = loadProperty("");
                break;
            case "prod":
                baseUrl = loadProperty("");
        }

        Selenide.open(baseUrl);
    }


    /**
     * After test.
     */
    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        clearBrowserCache();
        closeWebDriver();
    }
}
