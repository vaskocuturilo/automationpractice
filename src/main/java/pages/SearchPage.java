package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * The  class Search page.
 */
public class SearchPage {

    /**
     * Constant SEARCH_TEXT.
     */
    private static final String SEARCH_TEXT = "DRESS";

    /**
     * Constant RESULTS.
     */
    private static final String RESULTS = "7 results have been found.";

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * private Selenide Element.
     */
    private SelenideElement
            centerColumn = $("div[id='center_column']"),
            selectProductSort = $("select[id='selectProductSort']");


    /**
     * Assert search data search page.
     *
     * @param typeOfSort the type of sort
     * @return the search page
     */
    public SearchPage assertSearchData(String typeOfSort) {

        centerColumn.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(SEARCH_TEXT));
        centerColumn.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(RESULTS));

        sortProduct(typeOfSort);
        centerColumn.waitUntil(Condition.visible, DELAY)
                .shouldHave(
                        Condition.text("16.51"),
                        Condition.text("27.00"),
                        Condition.text("26.00"),
                        Condition.text("30.50"),
                        Condition.text("16.40"),
                        Condition.text("50.99"),
                        Condition.text("28.98"));


        return this;
    }


    /**
     * Method sortProduct.
     *
     * @param typeOfSort the type of sort
     * @return the search page
     */
    private SearchPage sortProduct(String typeOfSort) {

        selectProductSort.selectOptionContainingText(typeOfSort);

        return this;
    }


}
