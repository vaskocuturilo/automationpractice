package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


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
     * Default constructor.
     */
    public AccountPage() {
        super();
        //empty
        return;
    }


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

        return this;
    }

    /**
     * Click sign out account page.
     *
     * @return the account page
     */
    public AccountPage clickSignOut() {
        logout.click();

        return this;
    }
}
