package com.automationpractice.tests;

import base.BaseClass;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.LandingPage;

public class WebUITests extends BaseClass {

    @Test
    @Story("Proceed to order")
    public void orderTest() {
        new LandingPage()
                .clickLoginButton();
    }
}
