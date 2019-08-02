package pages;

import com.sun.istack.NotNull;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Authorization page.
 */
public class AuthorizationPage {

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
    private String createEmailForNewUser() {

        String todayData = String.valueOf(new Date().getTime());

        return "hf_test" + todayData + "@qa.team";
    }

    /**
     * Add email for user authorization page.
     *
     * @return the authorization page
     */
    public AuthorizationPage addEmailForUser() {

        $("input[id='email_create']").setValue(createEmailForNewUser());

        return this;
    }

    /**
     * Create account for new user
     *
     * @return the authorization page
     */
    public AuthorizationPage clickCreateAccountButton() {

        $("button[id='SubmitCreate']").click();

        return this;
    }


    /**
     * Enter user email authorization page.
     *
     * @param userEmail the user email
     * @return the authorization page
     */
    public AuthorizationPage enterUserEmail(String userEmail) {
        $("input[id='email']").setValue(userEmail);

        return this;
    }

    /**
     * Enter user password authorization page.
     *
     * @param userPassword the user password
     * @return the authorization page
     */
    public AuthorizationPage enterUserPassword(String userPassword) {
        $("input[id='passwd']").setValue(userPassword);

        return this;
    }

    /**
     * Click sign in button account page.
     *
     * @return the account page
     */
    public AccountPage clickSignInButton() {
        $("button[id='SubmitLogin']").click();

        return new AccountPage();
    }


    //   TO-DO AuthorizationPage

}
