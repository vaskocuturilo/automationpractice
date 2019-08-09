package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


/**
 * The type Account page.
 */
public class AccountPage {

    /**
     * Constant DELAY.
     */
    private static final int DELAY = 5000;


    /**
     * Constant MY_ACCOUNT.
     */
    private static final String MY_ACCOUNT = "My account";


    /**
     * Selenide elements.
     */
    private final SelenideElement
            account = $("[class='account'] span"),
            pageHeading = $("div[id='center_column'] h1"),
            logout = $("[class='logout']");

    /**
     * Assert success login account page.
     *
     * @param credUser the cred user
     * @return the account page
     */
    public AccountPage assertSuccessLogin(final String credUser) {

        account
                .waitUntil(Condition.visible, DELAY)
                .shouldHave(Condition.text(credUser));

        pageHeading
                .waitUntil(Condition.visible, DELAY)
                .shouldBe(Condition.text(MY_ACCOUNT));

        return new AccountPage();
    }


    /**
     * Default constructor.
     */
    public AccountPage() {
        super();
        //empty
        return;
    }

    /**
     * Class click sign out account page.
     *
     * @return the account page
     */
    public AccountPage clickSignOut() {
        logout.click();

        return this;
    }

    /**
     * Method select Category.
     *
     * @param nameCategory name of category.
     * @return the account page
     */
    public StorePage selectCategory(final String nameCategory) {

        $("a[title='" + nameCategory + "']").waitUntil(Condition.enabled, DELAY)
                .click();

        return new StorePage();
    }
}
