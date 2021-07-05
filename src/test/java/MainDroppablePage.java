import org.junit.Test;

public class MainDroppablePage extends TestBase {

    @Test
    public void TestDroppableElement(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnInteractions();
        InteractionsPage interactionsPage = new InteractionsPage(driver);
        interactionsPage.clickOnDroppablePage();
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.dragAndDropElement();
    }

}
