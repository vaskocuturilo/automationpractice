package browser;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Logger;


/**
 * The class Chrome.
 */
public class Chrome implements WebDriverProvider {

    /**
     * The constant LOG.
     */
    private final static Logger LOG = Logger.getLogger(Chrome.class.getName());

    /**
     * The default constructor.
     */
    public Chrome() {
        super();
        //empty
        return;
    }

    @SuppressWarnings("deprecation")
    @Override
    public WebDriver createDriver(final DesiredCapabilities capabilities) {

        WebDriverManager.chromedriver().setup();
        capabilities.setCapability(ChromeOptions.CAPABILITY, getChromeOptions());

        try {
            return new ChromeDriver(capabilities);
        } catch (Exception ex) {

            LOG.info(String.valueOf(ex));
        }
        return null;
    }


    /**
     * Method getChromeOptions.
     *
     * @return the chrome options.
     */
    public static ChromeOptions getChromeOptions() {
        final ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("disable-infobars");
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        chromeOptions.setExperimentalOption("useAutomationExtension", false);

        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        final HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("prefs", prefs);

        return chromeOptions;
    }
}
