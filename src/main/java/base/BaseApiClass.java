package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

import static utils.PropertiesReader.loadProperty;

public class BaseApiClass {


    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {

        RestAssured.baseURI = loadProperty("API_BASE_URL");
    }
}
