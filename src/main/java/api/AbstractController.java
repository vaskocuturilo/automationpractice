package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.hamcrest.Matchers;


/**
 * Abstract class.
 */

@SuppressWarnings("PMD.DefaultPackage")
public abstract class AbstractController {

    /**
     * Constant for TIME OUT.
     */
    private static final long TIME_OUT = 15000L;

    static {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-type", "application/json; charset=UTF-8")
                .setBaseUri("https://jsonplaceholder.typicode.com/")
                .setContentType(ContentType.JSON).log(LogDetail.ALL)
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(TIME_OUT))
                .build();

        RestAssured.defaultParser = Parser.JSON;
    }

    /**
     * Default constructor.
     */
    public AbstractController() {
        super();
        //empty
        return;
    }

    public abstract void AbstractController();
}
