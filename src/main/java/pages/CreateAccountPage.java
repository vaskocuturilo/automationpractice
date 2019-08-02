package pages;

import com.google.gson.Gson;
import utils.PropertiesReader;


import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

/**
 * The type Create account page.
 */
public class CreateAccountPage {


    /**
     * Method get Json Data.
     *
     * @param jsonFileName path to file.
     */
    private static UserData getJsonData(final String jsonFileName) {

        final String pathToFolder = PropertiesReader.getResourceAsString(format("users/%s.json", jsonFileName));

        return new Gson().fromJson(pathToFolder, UserData.class);
    }

    /**
     * Fill data account page.
     *
     * @param registerData the register data
     * @return the account page
     */
    public AccountPage fillData(final String registerData) {
        final UserData userData = getJsonData(registerData);
        $("input[id='customer_firstname']").setValue(userData.firstName);


        return new AccountPage();
    }


}
