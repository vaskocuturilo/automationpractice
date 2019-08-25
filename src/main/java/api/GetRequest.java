package api;

import io.restassured.RestAssured;

/**
 * The type Get request.
 */
public final class GetRequest {


    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Constant BAD_REQUEST.
     */
    private static final int BAD_REQUEST = 404;

    /**
     * Default constructor.
     */
    private GetRequest() {
        super();
        //empty
        return;
    }

    /**
     * Country get  all request string.
     *
     * @param url the url
     * @return the string
     */
    public static String getAllCountries(final String url) {
        final String json = RestAssured
                .given()
                .then()
                .statusCode(SUCCESS)
                .log().all().when().get(url).getBody().asString();

        return json;
    }

    /**
     * Country get all country with alpha2code request string.
     *
     * @param url        the url.
     * @param alpha2Code alpha2Code value.
     * @return the string
     */
    public static String getAllCountry(final String url, final String alpha2Code) {
        final String json = RestAssured
                .given()
                .then()
                .statusCode(SUCCESS)
                .log().all().when().get(url + alpha2Code).getBody().asString();

        return json;
    }

    /**
     * Country get all country with alpha2code request string.
     *
     * @param url                the url.
     * @param nonExistentCountry non existent country.
     * @return the string
     */
    public static String getNonExistentCountry(String url, String nonExistentCountry) {
        final String json = RestAssured
                .given()
                .then()
                .statusCode(BAD_REQUEST)
                .log().all().when().get(url + nonExistentCountry).getBody().asString();

        return json;
    }

}
