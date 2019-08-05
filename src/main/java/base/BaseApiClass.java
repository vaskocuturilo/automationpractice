package base;

import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.PropertiesReader.loadProperty;


/**
 * The type Base api class.
 */
public class BaseApiClass {

    /**
     * Default Constructor.
     */
    public BaseApiClass() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     */
    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {

        RestAssured.baseURI = loadProperty("API_BASE_URL");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        RestAssured.reset();

    }
}
