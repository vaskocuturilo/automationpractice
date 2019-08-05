package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.hamcrest.Matchers;


public class AbstractController {

    static {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-type", "application/json; charset=UTF-8")
                .setBaseUri("")
                .setContentType(ContentType.JSON).log(LogDetail.ALL)
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();

        RestAssured.defaultParser = Parser.JSON;
    }
}
