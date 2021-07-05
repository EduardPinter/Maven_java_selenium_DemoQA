import static org.junit.Assert.*;
import org.junit.Test;

public class MainUpload extends TestBase{

    @Test
    public void TestUpload() {

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnElements();
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickOnUpload();
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.uploadFileSendKeys();
        assertEquals("Actual result is not the same as expected",uploadPage.alertMessageText,uploadPage.getMessageText()); // prvi je expected, drugi je actual
    }

}
