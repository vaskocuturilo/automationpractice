package listener;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.nio.charset.StandardCharsets;


/**
 * The class Allure helpers.
 */
public class AllureHelpers {
    /**
     * Attach text string.
     *
     * @param text the text
     * @return the string
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "AllureTextReport", type = "text/plain", fileExtension = ".txt")
    public static String attachText(String text) {
        return text;
    }

    /**
     * Attach csv string.
     *
     * @param csv the csv
     * @return the string
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "AllureCSVReport", type = "text/csv", fileExtension = ".csv")
    public static String attachCSV(String csv) {
        return csv;
    }

    /**
     * Get page source byte [ ].
     *
     * @return the byte [ ]
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "Html source", type = "text/html", fileExtension = ".html")
    public static byte[] getPageSource() {
        return getPageSourceBytes();
    }

    /**
     * Take screenshot byte [ ].
     *
     * @return the byte [ ]
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "Screenshot", type = "image/png", fileExtension = ".png")
    public static byte[] takeScreenshot() {
        return getScreenshotBytes();
    }

    /**
     * Take screenshot byte [ ].
     *
     * @param name the name
     * @return the byte [ ]
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "{name}", type = "image/png", fileExtension = ".png")
    public static byte[] takeScreenshot(String name) {
        return getScreenshotBytes();
    }

    /**
     * Take screenshot byte [ ].
     *
     * @param elem the elem
     * @return the byte [ ]
     */
    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "Element screenshot", type = "image/png", fileExtension = ".png")
    public static byte[] takeScreenshot(SelenideElement elem) {
        return getScreenshotBytes(elem);
    }

    /**
     * Get page source bytes byte [ ].
     *
     * @return the byte [ ]
     */
    public static byte[] getPageSourceBytes() {
        return WebDriverRunner.getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Get screenshot bytes byte [ ].
     *
     * @return the byte [ ]
     */
    public static byte[] getScreenshotBytes() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * Get screenshot bytes byte [ ].
     *
     * @param elem the elem
     * @return the byte [ ]
     */
    public static byte[] getScreenshotBytes(SelenideElement elem) {
        return elem.getScreenshotAs(OutputType.BYTES);
    }
}
