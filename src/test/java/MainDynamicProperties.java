import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll; // Difference


public class MainDynamicProperties extends TestBase {

        @Test
        public void TestDynamicProperties() {

            MainPage mainPage = new MainPage(driver);
            mainPage.clickOnElements();
            ElementsPage elementsPage = new ElementsPage(driver);
            elementsPage.clickOnDynamicProperties();
            DynamicPropertiesPage dpp = new DynamicPropertiesPage(driver);
            assertEquals("Actual result is not the same as expected",dpp.randomText, dpp.getRandomText());
            dpp.visibleAfterException();
            assertFalse("Button is true", dpp.getEnableButtonFalse());
            assertTrue("Button is false", dpp.getEnableButtonTrue());
            assertEquals("Color is not red", dpp.colorValue, dpp.getColorAssert());
            assertTrue("Button is False", dpp.visibleAfterTrue());

    }

}
