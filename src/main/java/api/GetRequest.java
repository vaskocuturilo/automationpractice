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
     * Default constructor.
     */
    private GetRequest() {
        super();
        //empty
        return;
    }

    /**
     * Post get request string.
     *
     * @param url the url
     * @return the string
     */
    public static String getAllCountries(final String url) {
        final String json = RestAssured
                .given()
                .then()
                .statusCode(SUCCESS)
                .log()
                .all().when().get(url).getBody().asString();

        return json;
    }
}
