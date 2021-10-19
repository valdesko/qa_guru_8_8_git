import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @Test
    void selenideSearchTest() {
        open("https://www.kinopoisk.ru/");

        $(byName("kp_query")).setValue("Only Murders in the Building").pressEnter();

        $(".styles_link__1dkjp").shouldHave(text("Стиa Мартин"));
    }
}
