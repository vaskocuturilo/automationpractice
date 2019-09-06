package com.automationpractice.tests;

import api.ApiJson;
import api.schema.NonExistentCountry;
import data.DataProviders;
import api.schema.CountryCode;
import base.BaseApi;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import listener.LogListener;
import org.hamcrest.Matchers;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static api.GetRequest.*;
import static org.testng.Assert.*;

@Listeners(LogListener.class)
@Feature("Application program interface automation scripts")
public class ApiWithoutControllerTest extends BaseApi {
    private static final String GET_ALL_COUNTRY = "/rest/v2/all";
    private static final String GET_ALPHA_CODE = "/rest/v2/alpha/";
    private static final String REGISTER = "/rest/v2/register";


    @Test
    @Story("GET all countries from https://restcountries.eu/rest/v2/all")
    public void testRequestWithChosenCountries() {
        final String resultApiJson = getAllCountries(GET_ALL_COUNTRY);
        final ApiJson apiJson = ApiJson.from(resultApiJson);
        final List<CountryCode> result = apiJson.getAllCountriesCodes();
        final Set<String> alphaCodes = result.stream().map(CountryCode::getAlpha2Code).collect(Collectors.toSet());

        assertTrue(alphaCodes.contains("AF"));
        assertTrue(alphaCodes.contains("CO"));
        assertTrue(alphaCodes.contains("FR"));
    }

    @Test(dataProvider = "verifyCountry", dataProviderClass = DataProviders.class)
    @Story("GET countries from https://restcountries.eu/rest/v2/aplha")
    public void testRequestWithSeveralCountries(String name, String alpha2Code, String alpha3Code) {

        final String resultApiJson = getAllCountry(GET_ALPHA_CODE, alpha2Code);
        final ApiJson apiJson = ApiJson.from(resultApiJson);
        final CountryCode result = apiJson.getCountryCode();

        assertEquals(result.getName(), name);
        assertEquals(result.getAlpha2Code(), alpha2Code);
        assertEquals(result.getAlpha3Code(), alpha3Code);
    }


    @Test(dataProvider = "nonExistentCountry", dataProviderClass = DataProviders.class)
    @Story("GET non existent country from https://restcountries.eu/rest/v2/aplha")
    public void testRequestWithNonExistentCountry(String nonExistentCountry, String statusCode, String message) {
        final String resultApiJson = getNonExistentCountry(GET_ALPHA_CODE, nonExistentCountry);
        final ApiJson apiJson = ApiJson.from(resultApiJson);
        final NonExistentCountry result = apiJson.getNonExistentCountry();

        assertEquals(result.getStatus(), Matchers.equalTo(statusCode));
        assertEquals(result.getMessage(), Matchers.equalTo(message));
    }

    @Test
    @Story("POST Specific country.")
    public void shouldPostSpecific(String name, String alpha2Code, String alpha3Code) {
        Response resultApiJson = getPostSpecific(REGISTER, name, alpha2Code, alpha2Code);
    }
}


