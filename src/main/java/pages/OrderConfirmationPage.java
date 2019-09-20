package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertTrue;


/**
 * Class Order confirmation page.
 */
public class OrderConfirmationPage {

    /**
     * Constant DELAY.
     */
    private static final int DELAY = 5000;

    /**
     * Confirmation order order confirmation page.
     *
     * @return the order confirmation page
     */
    public OrderConfirmationPage confirmationOrder() {

        $("div[id='center_column'] button[type='submit']").waitUntil(Condition.enabled, DELAY).click();
        return this;
    }

    /**
     * The constructor.
     */
    public OrderConfirmationPage() {
        super();
        //empty
        return;
    }

    /**
     * Check information order confirmation page.
     *
     * @return the order confirmation page
     */
    public OrderConfirmationPage checkInformation() {

        assertTrue(url().contains("controller=order-confirmation"));

        return this;
    }

}
