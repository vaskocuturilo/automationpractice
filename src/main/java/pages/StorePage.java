package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertTrue;


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
    private final transient SelenideElement

            firstItem = $("div[id='center_column'] > ul > li:nth-child(1)"),
            addToCart = $("div[class='button-container'] [data-id-product='1']"),
            proceedToCheckout = $("a[title='Proceed to checkout']"),
            selectProduct = $("div[id='uniform-selectProductSort']"),
            sortBy = $("select[id='selectProductSort']");

    /**
     * The private elements collection.
     */
    private final transient ElementsCollection siteMapContent = $$("div[id='center_column'] h3");

    /**
     * The constructor.
     */
    public StorePage() {
        super();
        //empty
        return;
    }

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


    /**
     * Method select sort by.
     *
     * @param sortValues this is values from selector sort.
     * @return the shopping cart page
     */
    public StorePage selectSortBy(final SortValues sortValues) {
        if (!sortValues.equals(SortValues.EMPTY)) {
            selectSortByOptionByName(sortValues);
        }

        return this;
    }

    /**
     * Method check sort result.
     *
     * @param result this is end of from url.
     * @return store page.
     */
    public StorePage checkSortResult(final String result) {

        assertTrue(url().contains(result));

        return this;
    }


    /**
     * Method check history result.
     *
     * @return this.
     */
    public StorePage checkOrderHistoryResult() {

        assertTrue(url().contains("controller=history"));
        return this;
    }


    /**
     * Method select sort by option by name.
     *
     * @param sortValues thi is values from enum Sort Values.
     */
    private void selectSortByOptionByName(final SortValues sortValues) {
        selectProduct.waitUntil(Condition.visible, DELAY).click();
        sortBy.selectOptionContainingText(sortValues.getValues());
    }

    /**
     * Method checkSiteMapContent.
     */
    public StorePage checkSiteMapContent() {
        siteMapContent.shouldHaveSize(4);
        siteMapContent.shouldHave(
                CollectionCondition.texts("OUR OFFERS", "YOUR ACCOUNT", "CATEGORIES", "PAGES"));

        return this;
    }
}
