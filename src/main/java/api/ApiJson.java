package api;

import api.schema.CountryCode;
import io.restassured.path.json.JsonPath;

import java.util.List;


/**
 * The type Api json.
 */
public final class ApiJson {


    /**
     * Constant JSON_PATH.
     */
    private static final String JSON_PATH = "";

    /**
     * Value jsonPath.
     */
    private final JsonPath jsonPath;


    /**
     * Constructor ApiJson.
     *
     * @param json json file.
     */

    private ApiJson(final String json) {
        this.jsonPath = JsonPath.from(json);
    }

    /**
     * From api json.
     *
     * @param json the json
     * @return the api json
     */
    public static ApiJson from(final String json) {
        return new ApiJson(json);
    }


    /**
     * Gets country.
     *
     * @return the post
     */
    public CountryCode getCountryCode() {

        return jsonPath.getObject(JSON_PATH, CountryCode.class);
    }

    /**
     * Gets all posts.
     *
     * @return the all posts
     */
    public List<CountryCode> getAllCountriesCodes() {
        return jsonPath.getList(JSON_PATH, CountryCode.class);
    }

}
