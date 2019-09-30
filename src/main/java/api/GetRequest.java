package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

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
        final String json = given()
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
        final String json = given()
                .then()
                .statusCode(SUCCESS)
                .log().all().when().get(url + alpha2Code).getBody().asString();

        return json;
    }

    /**
     * Country get all country with alpha2code request string.
     *
     * @param url          the url.
     * @param nonExCountry non existent country.
     * @return the string
     */
    public static String getNonExistentCountry(final String url, final String nonExCountry) {
        final String json = given()
                .then()
                .statusCode(BAD_REQUEST)
                .log().all().when().get(url + nonExCountry).getBody().asString();

        return json;
    }


    /**
     * POST Method getPostSpecific.
     *
     * @param url       thi is url for post.
     * @param name      thi is name for method putJson.
     * @param alpha2Code this is alfa2Code for method putJson.
     * @param alpha3Code this is alfa3Code for method putJson.
     * @return json.
     */
    public static Response getPostSpecific(final String url,
                                           final String name,
                                           final String alpha2Code,
                                           final String alpha3Code) {
        final Response json = (Response) given()
                .contentType("application/json")
                .body(ApiJson.putJson(name, alpha2Code, alpha3Code))
                .when()
                .post(url)
                .then()
                .assertThat()
                .statusCode(SUCCESS)
                .log().all();
        return json;
    }

}
