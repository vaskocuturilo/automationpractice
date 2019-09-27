package com.automationpractice.tests;

import base.BaseWeb;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.SortValues;

public class WebUITest extends BaseWeb {

    private static final String CRED_USER = "Anton Smirnov";
    private String userEmail = "hf_test@qa.team";
    private String userPassword = "12345678";
    private String nameOfCategory = "Women";

    @Test
    @Story("Authorization.")
    public void authorizationTest() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .assertSuccessLogin(CRED_USER)
                .clickSignOut();
    }


    @Test
    @Story("Create new user.")
    public void createUserTest() {
        new LandingPage()
                .openAuthenticationPage()
                .addEmailForUser()
                .clickCreateAccountButton()
                .enterFillData("PersonalDataUser");
    }

    @Test
    @Story("Check order proceed.")
    public void checkOrderProcessTest() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .selectCategory(nameOfCategory)
                .orderFirstItemFromCatalog()
                .proceedToCheckout()
                .proceedToOrder()
                .payOrder()
                .confirmationOrder();
    }

    @Test
    @Story("Check contact us service.")
    public void checkContactUsService() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .clickContactUs()
                .fillTheFormContactUs()
                .checkThatMessageIsSend();

    }

    @Test
    @Story("Check prices for items.")
    public void checkPricesForItems() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .addSearchData("Dress")
                .assertSearchData("Price: Lowest first");
    }


    @Test
    @Story("Check newsletter subscription.")
    public void checkSubscribedNewsletter() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .addNewsletterSubscription();

    }

    @Test
    @Story("Check list of best sellers.")
    public void checkBestSellers() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .selectSection("Best sellers")
                .selectSortBy(SortValues.PRICE_LOW)
                .checkSortResult("asc");
    }

    @Test
    @Story("Check order history.")
    public void checkOrderHistory() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .selectSection("My orders")
                .checkOrderHistoryResult();
    }

    @Test
    @Story("Check Site Map.")
    public void checkSiteMap() {
        new LandingPage()
                .openAuthenticationPage()
                .enterUserEmail(userEmail)
                .enterUserPassword(userPassword)
                .clickSignInButton()
                .selectSection("Sitemap")
                .checkSiteMapContent();
    }
}
