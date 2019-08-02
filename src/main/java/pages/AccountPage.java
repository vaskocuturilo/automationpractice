package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {

    public AccountPage() {
        super();
        //empty
        return;
    }



    public AccountPage assertSuccessLogin(String credUser){

        $("[class='account'] span").shouldHave(Condition.text(credUser));

        $("div[id='center_column'] h1")
                .waitUntil(Condition.visible,5000)
                .shouldBe(Condition.text("My account"));

    return this;
    }

    public AccountPage clickSignOut(){
        $("[class='logout']").click();

    return this;
    }
}
