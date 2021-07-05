import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    protected WebDriver driver;

    @FindBy(css = "div:nth-of-type(1) > div > .card-up")
    WebElement elementsPage;
    @FindBy(css = "div:nth-of-type(4) > div > .card-up")
    WebElement widgetsPage;
    @FindBy(css = "div:nth-of-type(5) > div > .card-up")
    WebElement interactionsPage;


    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnElements(){
        elementsPage.click();
    }
    public void clickOnWidgets(){
        widgetsPage.click();
    }
    public void clickOnInteractions(){
        interactionsPage.click();
    }

}
