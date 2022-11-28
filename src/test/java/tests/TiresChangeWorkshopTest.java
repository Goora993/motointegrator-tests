package tests;

import configuration.PropertiesProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.WorkshopDetailsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TiresChangeWorkshopTest extends TestBase {

    private WorkshopDetailsPage workshopDetailsPage;

    @BeforeEach
    public void openRelevantWorkshopPage() {
        open(PropertiesProvider.getEnvUrl());

        MainPage mainPage = new MainPage();
        mainPage.acceptCookiesPolicy();

        workshopDetailsPage = mainPage
                .clickOnTiresChangeTile()
                .userOnTiresChangePage()
                .clickOnWorkshopCityTile("Lublin")
                .userOnWorkshopSearchPage()
                .openWorkshopFromResultList(2);
    }

    @Test
    public void visibilityOfTextInNowOpenPosition() {
        assertTrue(workshopDetailsPage.isOpenLabelDisplayed());
    }

    @Test
    public void workshopRatingIs5() {
        assertEquals("5", workshopDetailsPage.getWorkshopRating());
    }


}
