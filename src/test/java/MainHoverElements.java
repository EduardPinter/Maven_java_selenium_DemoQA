import org.junit.Test;
import static org.junit.Assert.*;

public class MainHoverElements extends TestBase {

    @Test
    public void TestHoverElements() {

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnWidgets();
        WidgetsPage widgetsPage = new WidgetsPage(driver);
        widgetsPage.clickOnToolTip();
        ToolTipPage toolTipPage = new ToolTipPage(driver);
        toolTipPage.hoverButton();
        assertEquals("Actual result is not the same as expected", toolTipPage.buttonMessageHover, toolTipPage.getButtonText());
        toolTipPage.hoverInputField();
        assertEquals("Actual result is not the same as expected", toolTipPage.inputFieldMessage, toolTipPage.getInputFieldMessage());
    }
}
