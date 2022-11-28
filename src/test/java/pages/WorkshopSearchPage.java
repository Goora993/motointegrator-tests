package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class WorkshopSearchPage extends Page {

    private final SelenideElement pageHeader = $(byCssSelector("h1"));
    private final ElementsCollection searchResultList = $$(byAttribute("data-testid", "listing-tile"));

    public WorkshopSearchPage userOnWorkshopSearchPage() {
        log.info("User currently is on the " + this.getClass().getSimpleName());
        pageHeader.should(partialText("Recommended car workshops"));
        return this;
    }

    public WorkshopDetailsPage openWorkshopFromResultList(int position) {
        SelenideElement workshop = resultWorkshopByPosition(position);
        log.info("Selected workshop name is " + workshop.getText());
        workshop.click();
        return new WorkshopDetailsPage();
    }

    private SelenideElement resultWorkshopByPosition(int position) {
        return searchResultList.get(position - 1).$(byCssSelector("h2"));
    }
}
