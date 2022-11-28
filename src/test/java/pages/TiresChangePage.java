package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class TiresChangePage extends Page {

    private final SelenideElement pageHeader = $(byCssSelector("h1"));

    public TiresChangePage userOnTiresChangePage() {
        log.info("User currently is on the " + this.getClass().getSimpleName());
        pageHeader.shouldHave(text("Tyre Change"));
        return this;
    }

    public WorkshopSearchPage clickOnWorkshopCityTile(String city) {
        log.info("Click on " + city + " Tile");
        cityTileByCity(city).click();
        return new WorkshopSearchPage();
    }

    private SelenideElement cityTileByCity(String city) {
        return $(byText(city)).shouldBe(visible);
    }
}
