package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Store page.
 */
public class StorePage {

    /**
     * Constant DELAY.
     */
    private static final int DELAY = 5000;

    /**
     * The private selenide elements.
     */
    private final SelenideElement

            firstItem = $("div[id='center_column'] > ul > li:nth-child(1)"),
            addToCart = $("p[id='add_to_cart']"),
            proceedToCheckout = $("a[title='Proceed to checkout']");


    /**
     * Order first item from catalog store page.
     *
     * @return the store page
     */
    public StorePage orderFirstItemFromCatalog() {

        firstItem.hover().waitUntil(Condition.enabled, DELAY).click();

        addToCart.waitUntil(Condition.enabled, DELAY).click();

        return this;
    }

    /**
     * Proceed to checkout shopping cart page.
     *
     * @return the shopping cart page
     */
    public ShoppingCartPage proceedToCheckout() {

        proceedToCheckout.waitUntil(Condition.enabled, DELAY).click();

        return new ShoppingCartPage();
    }

}
