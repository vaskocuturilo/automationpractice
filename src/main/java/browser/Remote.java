package browser;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Remote implements WebDriverProvider {

    @SuppressWarnings("deprecation")
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setBrowserName("chrome");
        capabilities.setCapability(ChromeOptions.CAPABILITY, Chrome.getChromeOptions());
        capabilities.setCapability("screenResolution", "1920x1080x24");
        try {
            return new RemoteWebDriver(getGridHubUrl(), capabilities);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    private static URL getGridHubUrl() {
        URL hostURL = null;
        try {
            hostURL = new URL(System.getProperty("selenoid.url", "http://127.0.0.1:4444/wd/hub"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return hostURL;
    }
}
