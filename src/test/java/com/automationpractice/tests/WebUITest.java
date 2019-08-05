package com.automationpractice.tests;

import base.BaseWeb;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.LandingPage;

public class WebUITest extends BaseWeb {

    private static final String CRED_USER = "Anton Smirnov";
    private String userEmail = "hf_test@qa.team";
    private String userPassword = "12345678";

    @Test
    @Story("Proceed to order")
    public void orderTest() {
        new LandingPage()
                .sighinAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .assertSuccessLogin(CRED_USER)
                .clickSignOut();
    }


    @Test
    @Story("Create new user")
    public void createUser() {
        new LandingPage()
                .sighinAuthenticationPage()
                .addEmailForUser()
                .clickCreateAccountButton()
                .fillData("PersonalDataUser");
    }
}
