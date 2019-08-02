package pages;

import static com.codeborne.selenide.Selenide.$;

/**
 * The type Landing page.
 */
public class LandingPage {

    /**
     * Default constructor.
     */
    public LandingPage() {
        super();
        //empty
        return;
    }

    /**
     * Click login button authorization page.
     *
     * @return the authorization page
     */
    public AuthorizationPage clickLoginButton() {
        $(".login").click();
        return new AuthorizationPage();
    }
}
