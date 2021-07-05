import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;


public class TestBase {

    public static WebDriver driver;

    @Before
    public void initializeWebDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/");
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

