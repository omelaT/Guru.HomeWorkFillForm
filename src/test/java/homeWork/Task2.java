package homeWork;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task2 {
    @Test
    public void findJUnitCodeOnSoftAssertionPage(){
        // - Откройте страниц Selenide в Github
        open("https://github.com/selenide/selenide");
        // - Перейдите в раздел Wiki проекта
       $("[data-content=\"Wiki\"]").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").shouldHave(text("Soft assertions"));
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));


    }

}
