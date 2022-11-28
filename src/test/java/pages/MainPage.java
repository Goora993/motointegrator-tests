package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends Page {

    private final SelenideElement tiresChangeTile = $(byText("Tires change"));

    public TiresChangePage clickOnTiresChangeTile() {
        log.info("Click on Tires Change Tile");
        tiresChangeTile.shouldBe(visible).click();
        return new TiresChangePage();
    }

}
