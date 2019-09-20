package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Shopping cart page.
 */
public class ShoppingCartPage {

    /**
     * Constant DELAY.
     */
    private static final int DELAY = 5000;


    /**
     * Private selenide elements.
     */
    private final SelenideElement

            proceedToCheckout = $("div[id='center_column'] a[title='Proceed to checkout']");

    /**
     * The constructor.
     */
    public ShoppingCartPage() {
        super();
        //empty
        return;
    }

    /**
     * Proceed to order shopping cart page.
     *
     * @return the shopping cart page
     */
    public ShoppingCartPage proceedToOrder() {
        proceedToCheckout.waitUntil(Condition.enabled, DELAY).click();
        $("button[name='processAddress']").waitUntil(Condition.enabled, DELAY).click();
        $("div[id='uniform-cgv']").waitUntil(Condition.enabled, DELAY).click();
        $("button[name='processCarrier']").waitUntil(Condition.enabled, DELAY).click();
        return this;
    }

    /**
     * Pay order order confirmation page.
     *
     * @return the order confirmation page
     */
    public OrderConfirmationPage payOrder() {
        $("div[id='HOOK_PAYMENT'] [title='Pay by bank wire']").waitUntil(Condition.enabled, DELAY).click();

        return new OrderConfirmationPage();
    }
}
