package data;

import org.testng.annotations.DataProvider;

/**
 * The class type Data providers.
 */
public final class DataProviders {

    /**
     * Default constructor.
     */
    private DataProviders() {
    }

    /**
     * Verify country object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "verifyCountry")
    public static Object[][] verifyCountry() {
        return new Object[][]{
                {"Estonia", "EE", "EST"},
                {"Germany", "DE", "DEU"},
                {"Afghanistan", "AF", "AFG"}
        };
    }
}


