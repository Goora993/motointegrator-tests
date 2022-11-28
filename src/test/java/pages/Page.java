package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Page {

    public Logger log = LogManager.getRootLogger();

    private final SelenideElement cookieBannerConfirmationButton = $(byText("OK"));

    public void acceptCookiesPolicy() {
        log.info("Accept cookies policy");
        cookieBannerConfirmationButton.shouldBe(visible).click();
    }
}
