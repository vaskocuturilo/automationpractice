package data;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider(name = "verifyCountry")
    public static Object[][] verifyCountry() {
        return new Object[][]{
                {"Estonia", "EE", "EST"},
                {"Germany", "DE", "DEU"},
                {"Afghanistan", "AF", "AFG"}
        };
    }
}


