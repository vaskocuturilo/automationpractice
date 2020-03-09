package utils;

import browser.Chrome;
import browser.Firefox;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;


/**
 * The type Browser.
 */
public final class Browser {

    /**
     * Constant value BROWSER SIZE.
     */
    private static final String BROWSER_SIZE = "1340x768";

    /**
     * The default constructor.
     */
    private Browser() {
        super();
        //empty
        return;
    }

    /**
     * Select browser.
     *
     * @param browser the browser.
     */
    public static void selectBrowser(final String browser) {
        Configuration.browserSize = BROWSER_SIZE;

        if ("chrome".equalsIgnoreCase(browser)) {
            Configuration.browser = Chrome.class.getName();
        } else if ("firefox".equalsIgnoreCase(browser)) {
            Configuration.browser = Firefox.class.getName();
        } else if ("opera".equalsIgnoreCase(browser)) {
            Configuration.browser = "opera";
            ChromeDriverManager.getInstance(DriverManagerType.OPERA).setup();
        } else if ("edge".equalsIgnoreCase(browser)) {
            Configuration.browser = "edge";
            ChromeDriverManager.getInstance(DriverManagerType.EDGE).setup();
        } else {
            throw new IllegalStateException(" Browser " + browser + " not supported in this tests. ");
        }

    }
}
