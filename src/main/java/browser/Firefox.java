package browser;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * The class Firefox.
 */
public class Firefox implements WebDriverProvider {

    /**
     * The default constructor.
     */
    public Firefox() {
        super();
        //empty
        return;
    }

    @Override
    public WebDriver createDriver(final DesiredCapabilities capabilities) {
        WebDriverManager.firefoxdriver().setup();

        return new FirefoxDriver(getFirefoxOptions().merge(capabilities));
    }

    /**
     * Method getFirefoxOptions.
     *
     * @return the firefox options
     */
    public static FirefoxOptions getFirefoxOptions() {
        final FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable-web-security");
        firefoxOptions.addArguments("--allow-running-insecure-content");

        final FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(false);
        profile.setPreference("pageLoadStrategy", "normal");

        firefoxOptions.setCapability(FirefoxDriver.PROFILE, profile);

        return firefoxOptions;
    }

}
