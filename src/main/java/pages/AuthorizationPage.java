package pages;

import com.codeborne.selenide.SelenideElement;
import com.sun.istack.NotNull;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Authorization page.
 */
public class AuthorizationPage {


    /**
     * The private Selenide Elements.
     */
    private SelenideElement

            createEmail = $("input[id='email_create']"),
            email = $("input[id='email']"),
            password = $("input[id='passwd']"),
            createAccount = $("button[id='SubmitCreate']"),
            submitLogin = $("button[id='SubmitLogin']");


    /**
     * Instantiates a new Authorization page.
     */
    public AuthorizationPage() {
        super();
        //empty
        return;
    }


    /**
     * Generate random email.
     *
     * @return the authorization page
     */
    @NotNull
    protected static String createEmailForNewUser() {

        final String todayData = String.valueOf(new Date().getTime());

        return "hf_test" + todayData + "@qa.team";
    }

    /**
     * Add email for user authorization page.
     *
     * @return the authorization page
     */
    public AuthorizationPage addEmailForUser() {

        createEmail.setValue(createEmailForNewUser());

        return this;
    }

    /**
     * Enter user password authorization page.
     *
     * @param userPassword the user password.
     * @return the authorization page
     */
    public AuthorizationPage enterUserPassword(final String userPassword) {
        password.setValue(userPassword);

        return this;
    }


    /**
     * Create account for new user.
     *
     * @return the authorization page
     */
    public CreateAccountPage clickCreateAccountButton() {

        createAccount.click();

        return new CreateAccountPage();
    }


    /**
     * Enter user email authorization page.
     *
     * @param userEmail the user email
     * @return the authorization page
     */
    public AuthorizationPage enterUserEmail(final String userEmail) {
        email.setValue(userEmail);

        return this;
    }


    /**
     * Click sign in button account page.
     *
     * @return the account page
     */
    public AccountPage clickSignInButton() {
        submitLogin.click();

        return new AccountPage();
    }
}
