package api;

import io.restassured.RestAssured;

public class GetRequest {


    private static final int SUCCESS = 200;

    public static String postGetRequest(String url) {
        String json = RestAssured
                .given()
                .then()
                .statusCode(SUCCESS)
                .log()
                .all().when().get(url).getBody().toString();

        return json;
    }
}
