package base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.WebDriverRunner.*;
import static utils.Browser.selectBrowser;
import static utils.PropertiesReader.loadProperty;

/**
 * The type Base class.
 */
public class BaseClass {

    /**
     * The private value baseUrl.
     */
    String baseUrl;

    /**
     * Default constructor.
     */
    public BaseClass() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     *
     * @param env     the env.
     * @param browser the browser.
     */
    @Parameters({"env", "browser"})
    @BeforeMethod(alwaysRun = true)
    public void beforeTest(@Optional("uat") final String env, @Optional("chrome") final String browser) {
        selectBrowser(browser);
        clearBrowserCache();
        switch (env) {
            case "uat":
                baseUrl = loadProperty("BASE_URL");
                break;
            case "prod":
                baseUrl = loadProperty("PROD_URL");
                break;
            default:
                //Do nothing
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
