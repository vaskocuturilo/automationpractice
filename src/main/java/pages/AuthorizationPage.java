package pages;


import static com.codeborne.selenide.Selenide.$;

/**
 * The type Authorization page.
 */
public class AuthorizationPage {

    /**
     * Default constructor.
     */
    public AuthorizationPage() {
        super();
        //empty
        return;
    }


    public AuthorizationPage enterUserEmail(String userEmail){
        $("input[id='email']").setValue(userEmail);

        return this;
    }

    public AuthorizationPage enterUserPassword(String userPassword){
        $("input[id='passwd']").setValue(userPassword);

        return this;
    }

    public  AccountPage clickSignInButton(){
        $("button[id='SubmitLogin']").click();

        return new AccountPage();
    }






    //   TO-DO AuthorizationPage

}
