package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;


/**
 * The type Browser.
 */
public final class Browser {

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

        if (browser.equals("chrome")) {
            Configuration.browser = "Chrome";
            ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        } else if (browser.equals("firefox")) {
            Configuration.browser = "firefox";
            ChromeDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        } else if (browser.equals("opera")) {
            Configuration.browser = "opera";
            ChromeDriverManager.getInstance(DriverManagerType.OPERA).setup();
        } else if (browser.equals("edge")) {
            Configuration.browser = "edge";
            ChromeDriverManager.getInstance(DriverManagerType.EDGE).setup();
        } else {
            throw new IllegalStateException(" Browser " + browser + " not supported in this tests. ");
        }

    }
}
