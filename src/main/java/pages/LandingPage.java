package pages;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage {

    public AuthorizationPage clickLoginButton() {
        $(".login").click();
        return new AuthorizationPage();
    }
}
