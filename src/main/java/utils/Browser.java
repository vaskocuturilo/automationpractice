package utils;

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

        if ("chrome".equals(browser)) {
            Configuration.browser = "Chrome";
            ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
            Configuration.browserSize = BROWSER_SIZE;
        } else if ("firefox".equals(browser)) {
            Configuration.browser = "firefox";
            ChromeDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            Configuration.browserSize = BROWSER_SIZE;
        } else if ("opera".equals(browser)) {
            Configuration.browser = "opera";
            ChromeDriverManager.getInstance(DriverManagerType.OPERA).setup();
            Configuration.browserSize = BROWSER_SIZE;
        } else if ("edge".equals(browser)) {
            Configuration.browser = "edge";
            ChromeDriverManager.getInstance(DriverManagerType.EDGE).setup();
            Configuration.browserSize = BROWSER_SIZE;
        } else {
            throw new IllegalStateException(" Browser " + browser + " not supported in this tests. ");
        }

    }
}
