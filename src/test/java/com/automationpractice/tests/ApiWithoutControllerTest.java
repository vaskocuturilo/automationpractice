package com.automationpractice.tests;

import api.ApiJson;
import data.DataProviders;
import api.schema.CountryCode;
import base.BaseApi;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import listener.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static api.GetRequest.getAllCountries;
import static api.GetRequest.getAllCountry;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(LogListener.class)
@Feature("API automation scripts")
public class ApiWithoutControllerTest extends BaseApi {
    private static final String GET_ALL_COUNTRY = "/rest/v2/all";
    private static final String GET_NAME = "/rest/v2/name/";

    @Test
    @Story("Get all countries from https://restcountries.eu/rest/v2/all")
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
    public void testRequestWithSeveralCountries(String name, String alpha2Code, String alpha3Code) {

        final String resultApiJson = getAllCountry(GET_NAME, alpha2Code);
        final ApiJson apiJson = ApiJson.from(resultApiJson);
        final CountryCode result = apiJson.getCountryCode();

        assertEquals(result.getName(), name);
        assertEquals(result.getAlpha2Code(), alpha2Code);
        assertEquals(result.getAlpha3Code(), alpha3Code);


    }


}


