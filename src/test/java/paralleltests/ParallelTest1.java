package paralleltests;

/*
thread count can be configured using xml.
configured in paralleltest_testng.xml
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
    }

    @Test
    @SneakyThrows
    public void test1(){
    //    driver.get("https://www.bbc.com");
        System.out.println("Inside test1 run by thread with id: "+Thread.currentThread().getId());
        Thread.sleep(3000);
     //   driver.close();
    }

    @Test
    @SneakyThrows
    public void test2(){
    //    driver.get("https://www.jobserve.com");
        System.out.println("Inside test2 run by thread with id: "+Thread.currentThread().getId());
        Thread.sleep(3000);
    //    driver.close();
    }

    @Test
    @SneakyThrows
    public void test3(){
        System.out.println("Inside test3 run by thread with id: "+Thread.currentThread().getId());
    }
}
