package browser;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import static utils.PropertiesReader.loadProperty;

/**
 * The class Remote.
 */
public class Remote implements WebDriverProvider {

    /**
     * The constant LOGGER.
     */
    private static final Logger LOGGER = Logger.getLogger(Remote.class.getName());

    @SuppressWarnings("deprecation")
    @Override
    public WebDriver createDriver(final DesiredCapabilities capabilities) {
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, Chrome.getChromeOptions());
        capabilities.setCapability("screenResolution", "1920x1080x24");
        try {
            return new RemoteWebDriver(getGridHubUrl(), capabilities);
        } catch (Exception ex) {
            LOGGER.info("" + ex);
        }
        return null;
    }

    /**
     * The private method for run Grid .
     */
    private static URL getGridHubUrl() {
        URL hostURL = null;
        try {
            hostURL = new URL(System.getProperty("selenoid.url", loadProperty("LOCAL")));
        } catch (MalformedURLException ex) {
            LOGGER.info("" + ex);
        }
        return hostURL;
    }
}
