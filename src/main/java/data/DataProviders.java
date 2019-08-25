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

    /**
     * Non Existent Country object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "nonExistentCountry")
    public static Object[][] nonExistentCountry() {
        return new Object[][]{
                {"RR", "404", "Not Found"},
        };
    }
}


