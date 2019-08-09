package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.google.gson.Gson;
import utils.PropertiesReader;


import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

/**
 * The CreateAccountPage class.
 */
public class CreateAccountPage extends UserData {

    /**
     * Constant DAY.
     */
    private static final String DAY = "1";

    /**
     * Constant MONTH.
     */
    private static final String MONTH = "11";


    /**
     * Constant YEAR.
     */
    private static final String YEAR = "2010";

    /**
     * Constant DELAY.
     */
    private static final int DELAY = 5000;


    /**
     * Selenide Elements.
     */
    private final SelenideElement
            account = $("a[class='account']"),
            gender = $("div[id='uniform-id_gender1']"),
            firstName = $("input[id='customer_firstname']"),
            lastName = $("input[id='customer_lastname']"),
            password = $("input[id='passwd']"),
            days = $("select[id='days']"),
            months = $("select[id='months']"),
            years = $("select[id='years']"),
            company = $("input[id='company']"),
            firstAddress = $("input[id='address1']"),
            secondAddress = $("input[id='address2']"),
            city = $("input[id='city']"),
            idState = $("select[id='id_state']"),
            postCode = $("input[id='postcode']"),
            country = $("select[id='id_country']"),
            other = $("textarea[id='other']"),
            phone = $("input[id='phone']"),
            phoneMobile = $("input[id='phone_mobile']"),
            alias = $("input[id='alias']"),
            submitButton = $("button[id='submitAccount']");


    /**
     * Default constructor.
     */
    public CreateAccountPage() {
        super();
        //empty
        return;
    }

    /**
     * Method get Json Data.
     *
     * @param jsonFileName path to file.
     * @return new Gson.
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
    public AccountPage enterFillData(final String registerData) {
        final UserData userData = getJsonData(registerData);
        gender.waitUntil(Condition.visible, DELAY).click();
        firstName.setValue(userData.getFirstName());
        lastName.setValue(userData.getLastName());
        password.setValue(userData.getPassword());
        days.selectOptionByValue(DAY);
        months.selectOptionByValue(MONTH);
        years.selectOptionByValue(YEAR);
        company.setValue(userData.getCompany());
        firstAddress.setValue(userData.getFirstAddress());
        secondAddress.setValue(userData.getSecondAddress());
        city.setValue(userData.getCity());
        idState.selectOptionContainingText(userData.getStateId());
        postCode.setValue(userData.getPostcode());
        country.selectOptionContainingText(userData.getCountry());
        other.setValue(userData.getOther());
        phone.setValue(userData.getPhone());
        phoneMobile.setValue(userData.getMobilePhone());
        alias.setValue(userData.getAlias());
        submitButton.click();
        account.waitUntil(Condition.visible, DELAY)
                .shouldHave(Condition.text(userData.getFirstName() + " " + userData.getLastName()));

        return new AccountPage();
    }


}
