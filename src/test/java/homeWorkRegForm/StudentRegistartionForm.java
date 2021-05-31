package homeWorkRegForm;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistartionForm extends TestBase {
    String name = "Alex";
    String lastName = "Test";
    String email = "test@mail.com";
    String mobile = "1234567890";
    String currentAddress = "Universe";
    String picture = "1.png";
    String state = "Uttar Pradesh";
    String city = "Merrut";

    @Test
    public void fillTheRegistrationForm() throws InterruptedException {
        //open from
        open("https://demoqa.com/automation-practice-form");

        // enter first name
        $("[placeholder=\"First Name\"]").click();
        $("[placeholder=\"First Name\"]").setValue(name);

        // enter last name
        $("[placeholder=\"Last Name\"]").click();
        $("[placeholder=\"Last Name\"]").setValue(lastName);

        // enter email
        $("[id=userEmail]").click();
        $("[id=userEmail]").setValue(email);

        //choose gender
        $("[for=\"gender-radio-3\"]").click();

        //enter mobile number
        $("[placeholder=\"Mobile Number\"]").click();
        $("[placeholder=\"Mobile Number\"]").setValue(mobile);

        // date of birth
        $("[id=\"dateOfBirthInput\"]").click();
        System.out.println("click");

        $("[aria-label=\"Choose Monday, May 31st, 2021\"]");
        System.out.println("pick date");

        // Hobbies
        $("[for=\"hobbies-checkbox-1\"]").click();
        $("[for=\"hobbies-checkbox-2\"]").click();
        $("[for=\"hobbies-checkbox-3\"]").click();

        //Picture
        $("#uploadPicture").uploadFromClasspath("img/" + picture);

        //Current address
        $("[placeholder=\"Current Address\"]").click();
        $("[placeholder=\"Current Address\"]").setValue(currentAddress);

        //State and City
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();

        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();

        //submit
        $("[id=\"submit\"]").click();
        System.out.println("submit click");

        $("#example-modal-sizes-title-lg").shouldHave(Condition.text("Thanks for submitting the form"));

    }


}
