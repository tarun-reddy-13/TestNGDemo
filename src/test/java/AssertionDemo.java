import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionDemo {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testIfLogoIsDisplayedOrNot() throws InterruptedException {
        driver.get("https://www.orangehrm.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Test
    public void mustDisplayCorrectTitleOfThePage(){
        driver.get("https://www.orangehrm.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getTitle().contains("Orange"));
    }

    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}

