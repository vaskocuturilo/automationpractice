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
        $("input[id='customer_lastname']").setValue(userData.lastName);
        $("input[id='passwd']").setValue(userData.password);
        $("select[id='days']").selectOptionByValue(userData.birthDay.day);
        $("select[id='months']").selectOptionByValue(userData.birthDay.month);
        $("select[id='years']").selectOptionByValue(userData.birthDay.year);
        $("select[id='id_state']").selectOptionContainingText(userData.stateId);

        return new AccountPage();
    }


}
