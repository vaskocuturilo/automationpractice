package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;


/**
 * The type Account page.
 */
public class AccountPage {

    /**
     * Instantiates a new Account page.
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
    public AccountPage assertSuccessLogin(final String credUser){

        $("[class='account'] span").shouldHave(Condition.text(credUser));

        $("div[id='center_column'] h1")
                .waitUntil(Condition.visible,5000)
                .shouldBe(Condition.text("My account"));

    return this;
    }

    /**
     * Click sign out account page.
     *
     * @return the account page
     */
    public AccountPage clickSignOut(){
        $("[class='logout']").click();

    return this;
    }
}
