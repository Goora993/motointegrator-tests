package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class WorkshopDetailsPage extends Page {

    private final SelenideElement openLabel = $(byAttribute("data-testid", "is-open-now-wrapper"));
    private final SelenideElement workshopRatingLabel = $(byAttribute("data-testid", "review-header")).$("p");


    public boolean isOpenLabelDisplayed() {
        log.info("'Open Label' should be displayed");
        return openLabel.shouldBe(visible).isDisplayed();
    }

    public String getWorkshopRating() {
        log.info("Get workshop rating");
        String workshopRating = workshopRatingLabel.shouldBe(visible).text();
        log.info("Workshop rating is: " + workshopRating);
        return workshopRating;
    }
}
