package com.automationpractice.tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LandingPage;

public class WebUITests extends BaseClass {

    @Test
    public void checksTest() {
        new LandingPage()
                .clickLoginButton();
    }
}
