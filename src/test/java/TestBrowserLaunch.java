import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestBrowserLaunch {
    private WebDriver driver;

    @BeforeSuite
    public void suitInit(){
        System.out.println("Before suite called");
    }

    @AfterSuite
    public void suitTeardown(){
        System.out.println("After suite called");
    }

    @BeforeTest
    public void init(){
        System.out.println("beforeTest get executed.........");
    }

    @AfterTest
    public void finished() {
        System.out.println("afterTest got executed..........");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Set up is called");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    @SneakyThrows
    public void testBrowserLaunchForBBC(){
        System.out.println("Test case testBrowserLaunch");
        driver.get("https://www.bbc.com/");
        Thread.sleep(2000);
       // Assert.assertEquals(2,3);
    }

    @Test
    @SneakyThrows
    public void testBrowserLaunchForGoogle(){
        System.out.println("Test case testBrowserLaunchForGoogle");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Test case tear down");
        driver.close();
    }

}
