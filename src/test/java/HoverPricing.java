import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverPricing {
    @BeforeAll
    static void settings() {

        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void hoverPricingGitHub() {
        open("https://github.com/");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        $(".application-main ").shouldHave(text("Choose the plan that’s right for you."));

    }

}

