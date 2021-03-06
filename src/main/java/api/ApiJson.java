package api;

import api.schema.CountryCode;
import api.schema.NonExistentCountry;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;

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
     * Method getNonExistentCountry.
     *
     * @return the post
     */
    public NonExistentCountry getNonExistentCountry() {
        return jsonPath.getObject(JSON_PATH, NonExistentCountry.class);
    }

    /**
     * Gets all posts.
     *
     * @return the all posts
     */
    public List<CountryCode> getAllCountriesCodes() {
        return jsonPath.getList(JSON_PATH, CountryCode.class);
    }


    /**
     * Method for put data with Json Object.
     *
     * @param name       thi is name for request.
     * @param alpha2Code this is alpha2Code for request.
     * @param alpha3Code this is alpha3Code for request.
     * @return jsonObj to string.
     */
    public static String putJson(final String name, final String alpha2Code, final String alpha3Code) {
        final JSONObject jsonObj = new JSONObject();

        jsonObj.put("name", name);
        jsonObj.put("alpha2_code", alpha2Code);
        jsonObj.put("alpha3_code", alpha3Code);

        return jsonObj.toString();
    }

}
