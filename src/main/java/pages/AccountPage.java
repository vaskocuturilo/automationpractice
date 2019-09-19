package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;


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
     * Constant GREEN_COLOR.
     */
    private static final String GREEN_COLOR = "rgba(119, 119, 119, 1";

    /**
     * Constant CONFIRM_TEXT.
     */
    private static final String CONFIRM_TEXT = "Newsletter : You have successfully subscribed to this newsletter.";


    /**
     * Selenide elements.
     */
    private final SelenideElement
            account = $("[class='account'] span"),
            pageHeading = $("div[id='center_column'] h1"),
            logout = $("[class='logout']"),
            contactUs = $("div[id='contact-link']"),
            alertColumn = $("div[id='columns'] [class*='alert']"),
            newsLetter = $("input[id='newsletter-input']");

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

    /**
     * Method clickContactUs.
     *
     * @return ContactUsPage.
     */
    public ContactUsPage clickContactUs() {

        contactUs.click();

        return new ContactUsPage();
    }

    /**
     * Method add search Data.
     *
     * @param searchText text for search.
     * @return the account page
     */
    public SearchPage addSearchData(final String searchText) {

        $("input[id='search_query_top']").setValue(searchText).pressEnter();

        return new SearchPage();
    }

    /**
     * Method addNewsletterSubscription.
     *
     * @return the account page
     */
    public AccountPage addNewsletterSubscription() {

        newsLetter.setValue(AuthorizationPage.createEmailForNewUser()).pressEnter();

        assertEquals(CONFIRM_TEXT, alertColumn.getText());

        alertColumn.getCssValue("color").contains(GREEN_COLOR);

        return new AccountPage();
    }

    /**
     * Method addNewsletterSubscription.
     *
     * @return the account page
     */
    public StorePage selectSection(final String value) {

        $("li[class='item'] [title='" + value + "']").click();

        return new StorePage();
    }
}
