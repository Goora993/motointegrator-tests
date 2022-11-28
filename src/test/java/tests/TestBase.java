package tests;

import com.codeborne.selenide.Selenide;
import configuration.PropertiesProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll
    public static void setUp() {
        PropertiesProvider.loadProperties();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }


}

