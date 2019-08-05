package pages;

import lombok.Getter;


/**
 * The type UserData.
 */
@Getter
public class UserData {

    /**
     * The First name.
     */
    private String firstName;
    /**
     * The Last name.
     */
    private String lastName;
    /**
     * The Password.
     */
    private String password;
    /**
     * The First address.
     */
    private String firstAddress;
    /**
     * The Second address.
     */
    private String secondAddress;
    /**
     * The City.
     */
    private String city;
    /**
     * The State id.
     */
    private String stateId;
    /**
     * The company.
     */
    private String company;
    /**
     * The Zip code.
     */
    private String postcode;
    /**
     * The Country.
     */
    private String country;
    /**
     * The other.
     */
    private String other;
    /**
     * The Home phone.
     */
    private String phone;
    /**
     * The Mobile phone.
     */
    private String mobilePhone;
    /**
     * The Alias.
     */
    private String alias;

    /**
     * Default constructor.
     */
    public UserData() {
        super();
        //empty
        return;
    }
}
