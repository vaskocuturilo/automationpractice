package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * The class Contact us page.
 */
public class ContactUsPage {

    /**
     * Constant DELAY.
     */
    private static final long DELAY = 5000;

    /**
     * Constant ALERT_TEXT.
     */
    private static final String ALERT_TEXT = "Your message has been successfully sent to our team.";


    /**
     * private Selenide Element.
     */
    private SelenideElement subjectHeading = $("select[id='id_contact']"),
            emailAddress = $("input[id='email']"),
            orderReference = $("select[name='id_order']"),
            sendMessage = $("button[id='submitMessage']"),
            textMessage = $("textarea[id='message']"),
            alertMessage = $("div[id='center_column'] p");


    /**
     * Default constructor.
     */
    public ContactUsPage() {
        super();
        //empty
        return;
    }

    /**
     * Fill the form contact us contact us page.
     *
     * @return the contact us page.
     */
    public ContactUsPage fillTheFormContactUs() {

        subjectHeading.selectOptionContainingText("Customer service");
        emailAddress.setValue("hr@qa.team");
        orderReference.selectOptionContainingText("BSHEVITQA - 08/07/2019");
        textMessage.setValue("Test Message");
        sendMessage.click();

        return this;
    }

    /**
     * Method Check that message is send contact us page.
     *
     * @return the contact us page.
     */
    public ContactUsPage checkThatMessageIsSend() {

        alertMessage.waitUntil(Condition.visible, DELAY).shouldHave(Condition.text(ALERT_TEXT));

        return this;
    }
}
